package assignments;

public class Modifier {
	
	public String EmployName;
	public int EmployID;
	public int EmploySalary;
	public String CompanyName;
	void addition(String  EmployName,int EmployID,int EmploySalary, String CompanyName) {
	System.out.println("Employ information:");
	System.out.println("EmployName: Danial"+"\n"+"ID: 123456"+"\n"+"EmploySalary: 2500"
	+"\n"+ "CompanyName: ABCCompany");
	System.out.println("---------------");
	}
	public static String SchoolName;
	public static int StaffMember;
	public static int Students;
	public static int SecurityGuards;
	public static int OtherMembers;
	public static void addition(String SchoolName,int StaffMember,int Students,int SecurityGuards,
	int OtherMembers ) {
	System.out.println("School Info");
	System.out.println("SchoolName: PS131"+"\n"+"StaffMember: 50"+"\n"+"Students: 650"+
	"\n"+"SecurityGuards: 4"+"\n"+"OtherMembers: 12");
	System.out.println("---------------");
	}
	
	private String Seasons;
	private void SeasonNames(String Seasons) {
	this.Seasons = 	Seasons;
	System.out.println(this.Seasons );
	System.out.println("---------------");
	}
	protected String Days;
	protected void  WeekDays(String Days) {
	this.Days = Days;
	System.out.println(this.Days);
	System.out.println(this.Seasons + this.Days);
	System.out.println("---------------");
	}
	
	public static void main(String[] args) {
    Modifier mn = new  Modifier();
   
	mn.addition("Danial", 1234556, 2000, "ABC");
	
	Modifier.addition(SchoolName, StaffMember, Students, SecurityGuards, OtherMembers);
	
	mn.SeasonNames("Summer, "+"Winter, "+"Spring, "+"Autumn:");
	 
	mn.WeekDays("Saturday, "+"Sunday, "+"Monday,"+"Tuesday, "+"Wednesday, "+"Thursday, "+"Friday:");
	
	

	}

}
