import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// 1. Load schedule from a file

		Schedule schedule = Schedule.from("schedule.info", "CP1251");

		// 2. Get some input info(group, subgroup and week)
		// from input 141/1:20.04.2018
		Calendar date = new Calendar.Builder().setDate(2018, Calendar.APRIL, 20).build();
		System.out.println(String.format("Enter info using the template:%d/%d:", 141, 1)
				+ String.format("%1$te.%1$tm.%1$tY", date));

		Scanner sc = new Scanner(System.in);

		String info = sc.next();

		String[] scheduleGroup = info.split(":");
		String[] subGroup = scheduleGroup[0].split("/");

		Group group = new Group(Integer.parseInt(subGroup[0]), Integer.parseInt(subGroup[1]));

		Date scheduleDate = new SimpleDateFormat("dd.MM.yyyy").parse(scheduleGroup[1]);

		sc.close();

		// 3. Print the schedule for it...
		List<Schedule.ScheduleItem> toPrint = new ArrayList<>();

		for (Schedule.ScheduleItem item : schedule.scheduleInfos()) {
			if (item.getGroup().equals(group) && item.getDate().equals(scheduleDate)) {
				toPrint.add(item);
			}
		}

		toPrint.sort(new Comparator<Schedule.ScheduleItem>() {

			@Override
			public int compare(Schedule.ScheduleItem item1, Schedule.ScheduleItem item2) {

				return item1.getDateClass() > item2.getDateClass() ? 1
						: item1.getDateClass() < item2.getDateClass() ? -1 : 0;
			}
		});

		for (Schedule.ScheduleItem item : toPrint) {
			System.out.println(String.format("%d. %s", item.getDateClass(), item.getSubject()));
		}

	}
}

class Group {
	private final int number;
	private final int subgroupNumber;

	public Group(int number, int subgroupNumber) {
		super();
		this.number = number;
		this.subgroupNumber = subgroupNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + subgroupNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		if (number != other.number)
			return false;
		if (subgroupNumber != other.subgroupNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "" + number + "/" + subgroupNumber;
	}
}

class Schedule {
	private List<ScheduleItem> schedule;

	private Schedule(List<ScheduleItem> schedule) {
		this.schedule = schedule;
	}

	public static Schedule from(String path, String charset) {
		List<Schedule.ScheduleItem> infos = new ArrayList<>();

		try {

			List<String> lines = Files.readAllLines(Paths.get(path), Charset.forName(charset));

			for (int i = 1; i < lines.size(); i++) {
				String[] fields = lines.get(i).split(";");

				Group g = new Group(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]));

				Date date = new SimpleDateFormat("dd.MM.yyyy").parse(fields[2]);

				int dateClass = Integer.parseInt(fields[3]);

				String subject = fields[4];

				Schedule.ScheduleItem si = new Schedule.ScheduleItem(g, date, dateClass, subject);

				infos.add(si);

			}

		} catch (IOException e) {
			throw new RuntimeException("File not found " + e.getMessage());
		} catch (ParseException e) {
			throw new RuntimeException("Schedule date is not valid " + e.getMessage());
		}

		return new Schedule(infos);
	}

	public List<ScheduleItem> scheduleInfos() {
		return Collections.unmodifiableList(this.schedule);
	}

	@Override
	public String toString() {
		return "Schedule [schedule=" + schedule + "]";
	}

	public static class ScheduleItem implements Comparable<ScheduleItem>{

		private final Group group;
		private final Date date;
		private final int dateClass;
		private final String subject;

		public ScheduleItem(Group group, Date date, int dateClass, String subject) {
			super();
			this.group = group;
			this.date = date;
			this.dateClass = dateClass;
			this.subject = subject;
		}

		public Group getGroup() {
			return group;
		}

		public Date getDate() {
			return date;
		}

		public int getDateClass() {
			return dateClass;
		}

		public String getSubject() {
			return subject;
		}

		@Override
		public String toString() {
			return "ScheduleInfo [group=" + group + ", date=" + date + ", dateClass=" + dateClass + ", subject="
					+ subject + "]";
		}

		
		@Override
		public int compareTo(ScheduleItem other) {
			return this.getDateClass() > other.getDateClass() ? 1
					: this.getDateClass() < other.getDateClass() ? -1 : 0;
		}

	}

}