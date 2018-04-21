public class Main {
	
	public static void main(String[] args) {
		//1. Load   schedule from a file
		
		//2. Get some input info(group, subgroup and week)
		
		//3. Print the schedule for it...
		
		Group g = new Group();
		
		g.name = "141";
		g.subgroup = 2;
		
		System.out.println();
		
		
	}
}

class Group {
	private final String name;
	private final int subgroup;
	
	public Group(String name, int subgroup) {
		super();
		this.name = name;
		this.subgroup = subgroup;
	}
	
	
}