package assignments;

public class AssignmentReturnType2 {
	  //Method OverLoading Return type: //Same MethodName but different type of Perameters:
	
	  public String getname(String name) {
	  return "Ayaan "+ name;
	  }
	  
	  public char[]getname(){
	  char arrayA[] = {'C','o','m','i','c','B','o','o','k'};
	  return  arrayA;
	   }
	  
	  public static void main(String[] args) {
      AssignmentReturnType2 rt = new  AssignmentReturnType2(); 
      String name = rt.getname("Usman");
      System.out.println("Name: "+name);
      
      char arrayA[] = rt.getname();
      System.out.println("ArrayA: "+new String(arrayA));
      
      
      
      
      
     
      
      
	}

}
