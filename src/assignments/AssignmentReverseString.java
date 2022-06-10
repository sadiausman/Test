package assignments;

public class AssignmentReverseString {

	public static void main(String[] args) {
		
		//Reversing String with StringBuffer,StringBuilderand without it:
				//StringBuffer
				String a = "Never Giveup";
				StringBuffer sb = new StringBuffer(a);
				System.out.println(sb.reverse());
				//StringBuilder
				StringBuilder sbu = new StringBuilder(a);
				System.out.println(sbu.reverse());
				
				//Reverse String
				a = "Be Greatful";
				for(int i=a.length()-1; i>=0; i--) {
				System.out.print(a.charAt(i));
				
				
				
				
				
				}
	}

}
