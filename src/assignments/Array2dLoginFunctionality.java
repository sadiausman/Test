package assignments;

public class Array2dLoginFunctionality {

	public static void main(String[] args) {
		
String[][] CustomerName = new String[4][2];
		
		System.out.println("Login Functionality:");
		System.out.println("User Name:");
		CustomerName[0][0] = "Naveed";
		CustomerName[0][1] = "Usman";
		System.out.print(CustomerName[0][0]);
		System.out.println(CustomerName[0][1]);
	    System.out.println("Password:");
        CustomerName[1][0] = "Wel";
        CustomerName[1][1] = "Come";
        System.out.print(CustomerName[1][0]);
		System.out.println(CustomerName[1][1]);
		CustomerName[2][0] = "Valid ";
        CustomerName[2][1] = "Usernam:";	
        System.out.print(CustomerName[2][0]);
		System.out.println(CustomerName[2][1]);
		 CustomerName[3][0] = "Valid ";
        CustomerName[3][1] = "Password:";
        System.out.print(CustomerName[3][0]);
		System.out.println(CustomerName[3][1]);
        System.out.println("Now You Are Sucessfully Login:"); 
        

	}

}
