package assignments;

import java.util.Scanner;

public class AssignmentReturnTypeConcept {
	
	   String Studentinfo(String FirstName, String LastName, String SchoolID,
	   String StudentDOB,String Email,String Address){
		   
	   String StudentFirstName = FirstName;
	   String StudentLastName = LastName;
	   String StudentSchoolID = SchoolID;
	   String StudentSchoolDOB = StudentDOB;
	   String StudentEmail = Email;
	   String StudentAddress = Address;
		
	   String profile = StudentFirstName.concat(StudentLastName)+"\n"+StudentSchoolID+"\n"+StudentSchoolDOB+
	   StudentSchoolDOB +"\n"+ StudentEmail+"\n"+StudentAddress;
	   return  profile;
	    }
       public static void main(String[] args) {
	   Scanner print = new Scanner(System.in);
	   System.out.println("Print FirstName: ");
	   String FirstName = print.next();
	   System.out.println("Print LastName: ");
	   String LastName = print.next();
	   System.out.println("Print SchoolID: ");
	   String  SchoolID = print.next();
	   System.out.println("Print StudentDOB: ");
	   String  StudentDOB = print.next();
	   System.out.println("Print  Email: ");
	   String  Email = print.next();
	   System.out.println("Print   Address: ");
	   String  Address = print.next();
	   print.close();
		 
	   AssignmentReturnTypeConcept rt = new AssignmentReturnTypeConcept();
	   System.out.println("Student Profile: "+"\n"+rt.Studentinfo(FirstName, LastName, SchoolID, 
	   StudentDOB, Email,Address ));
		
	   }

         
  

}
