import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

		@Override
		public String toString() {
			return "ScheduleInfo [group=" + group + ", date=" + date + ", dateClass=" + dateClass + ", subject="
					+ subject + "]";
		}
		
		
		
	}
	
}