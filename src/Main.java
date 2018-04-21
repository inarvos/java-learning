import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		//1. Load   schedule from a file
		
		List<Schedule.ScheduleInfo> infos = new ArrayList<>();
		
		try {
			
			List<String> lines = Files.readAllLines(Paths.get("schedule.info"), Charset.forName("CP1251"));
			
			
			for (int i = 1; i < lines.size(); i++) {
				String[] fields = lines.get(i).split(";");
				
				Group g = new Group(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]));
				
				Date date = new SimpleDateFormat("dd.MM.yyyy").parse(fields[2]);
				
				
				int dateClass = Integer.parseInt(fields[3]);
				
				String subject = fields[4];
				
				
				Schedule.ScheduleInfo si = new Schedule.ScheduleInfo(g, date, dateClass, subject);
				
				infos.add(si);
				
				
			}
			
			
			
		
		} catch (IOException e) {
			throw new RuntimeException("File not found " + e.getMessage());
		}
		
		Schedule schedule = new Schedule(infos);
		
		Group g141_2 = new Group(141, 2);
		
		schedule.scheduleInfos().stream()
			.filter(si -> si.getGroup().equals(g141_2))
			.forEach(System.out::println);
		
		
		
		//2. Get some input info(group, subgroup and week)
		
		//3. Print the schedule for it...
		
		
		
		
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
	private List<ScheduleInfo> schedule;
	
	public Schedule(List<ScheduleInfo> schedule) {
		super();
		this.schedule = schedule;
	}

	public List<ScheduleInfo> scheduleInfos() {
		return Collections.unmodifiableList(this.schedule);
	}
	
	@Override
	public String toString() {
		return "Schedule [schedule=" + schedule + "]";
	}



	public static class ScheduleInfo {
		
		private final Group group;
		private final Date date;
		private final int dateClass;
		private final String subject;
		
		public ScheduleInfo(Group group, Date date, int dateClass, String subject) {
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
		
		
		
	}
	
}