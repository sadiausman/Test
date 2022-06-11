package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AssignStudentInfo {

	public static void main(String[] args) {
		
		 ArrayList<String>StudentInfo1 = new ArrayList<String>();
		 StudentInfo1 .add("Name: Asim");
		 StudentInfo1 .add("DOB: 12/07/2009");
         StudentInfo1 .add("StudentID: 1234567");
         StudentInfo1 .add("Email: Asim5678@Gmail.com:");
         for(String d: StudentInfo1) {
          System.out.println(d); 
         }
         System.out.println("------------");
         
         ArrayList<String>StudentInfo2 = new ArrayList<String>();
		 StudentInfo2 .add("Name:Saim");
		 StudentInfo2 .add("DOB: 01/07/2010");
         StudentInfo2 .add("StudentID: 3456890");
         StudentInfo2 .add("Email: Saim3478@Gmail.com:");
         for(int b = 0; b<StudentInfo2.size();b++) {
         System.out.println(StudentInfo2.get(b));	 
         }
         System.out.println("------------");

         ArrayList<String>StudentInfo3 = new ArrayList<String>();
		 StudentInfo3 .add("Name: Zayan");
		 StudentInfo3 .add("DOB: 03/11/2006");
         StudentInfo3 .add("StudentID: 1234567");
         StudentInfo3 .add("Email: Zayan5678@Gmail.com:");
         for(int c = 0; c<StudentInfo3.size();c++) {
         System.out.println(StudentInfo3.get(c));	 
         }
         System.out.println("------------");
//         int e=StudentInfo3.size()-1;
//         while(e>=0) {
//         System.out.println(StudentInfo3.get(e));
//		 e--;
//		  }
//		  System.out.println("------------");
       
//         HashMap<Integer,String> hm = new HashMap<Integer,String>();
//         hm.put(1, "StudentInfo1: Name: Asim, DOB: 12/07/2009, StudentID: 1234567, Email: Asim5678@Gmail.com:"); 
//        // System.out.println(hm.entrySet());
//	     hm.put(2, "StudentInfo2: Name:Saim, DOB: 01/07/2010, StudentID: 3456890, Email: Saim3478@Gmail.com:");
//	    // System.out.println(hm.entrySet());
//		 hm.put(3, "StudentInfo3: Name: Zayan, Name: Zayan, StudentID: 1234567, Email: Zayan5678@Gmail.com:");
//		// System.out.println(hm.entrySet());
//		
//		 Object[]StudentInfo = hm.keySet().toArray();
//		 for(int r=0; r<StudentInfo.length; r++ ) {
//		 System.out.println(hm.get(StudentInfo[r]));
//		 }
//		 System.out.println("------------");
		 
//		 ArrayList<String>StudentInfo4 = new ArrayList<String>();
//		 StudentInfo4 .add("Name: Hassan");
//		 StudentInfo4 .add("DOB: 12/07/2009");
//         StudentInfo4 .add("StudentID: 1234567");
//         StudentInfo4 .add("Email: Hassan5678@Gmail.com:");
//         //Extract The Values:
//         Iterator<String> it = StudentInfo4.iterator();
//         System.out.println("First & Second Row: "+it.next()+" , "+it.next());
//		 System.out.println("Third & Forth Row: "+it.next()+" , "+it.next());
//		 System.out.println("--------------");
		 
//		  String[]Profile = {"StudentInfo1","StudentInfo2","StudentInfo3"};
//          for(int q=0; q<Profile.length;q++) {
//          System.out.println(Profile[q]);
//          }
//	      HashMap<Integer,String> info = new HashMap<Integer,String>();
//	      info.put(10, "StudentInfo1");
//	      info.put(20, "StudentInfo2");
//	      info.put(30, "StudentInfo3");
//          System.out.println(info.entrySet());
	       
		  

        	
          }
         
	}


