package assignments;

import java.util.ArrayList;
import java.util.Scanner;

    public class Assignments {

	public static void main(String[] args) {
		
		//"aka" and "AKA" values are same or not
        
		Scanner print = new Scanner(System.in);
		System.out.println("Compare The Values:");
		String values = print.next();
		String[] name = {"aka","AKA",};
		for(int i = 0; i<name.length; i++) {
		System.out.println(name[i]);	
		}
		int b = name.length-1;
		while(b>=0) {
	    System.out.println(name[b]);
	    b--;
		}
		//equalsignorecase()
        String m = "aka";
        String n = "AKA";
        String o = new String("AKA");
        System.out.println(m.equalsIgnoreCase(o));
        //looping Concept:
         String[] name2 = {"aka","AKA"};
       for(int d = 0; d<name2.length; d++) {
        System.out.println(name[d]);
       }
        String customername1 = "aka";
        String customername2 = "AKA";
        ArrayList<String>as = new ArrayList<String>();
        if(customername1.equalsIgnoreCase(customername2)) {
        System.out.println("customername1 "+as.get(0));
	    }
        else {
        System.out.println("customername2 "+as.get(0));
        }
        
      
    }   
    }
   

    
 
    
