package assignments;

public class AssignmentModifierConcept {
	
	  private String Name;
	  private void BookTitle(String Name) {
	  this.Name = Name;
	  System.out.println(this.Name);
	  }
	  public static String Publisher;
	  public static void publishername(String Publisher) {
	  AssignmentModifierConcept.Publisher= Publisher; 
	  System.out.println(AssignmentModifierConcept.Publisher);  
	  }
	  protected String Edition;
	  protected void Edition(String edition) {
	  this.Edition =  edition; 
	  System.out.println(this.Edition);
	  }
	  public static int Date;
	  public static void PublishDate (int Date) {
	  AssignmentModifierConcept title = new AssignmentModifierConcept ();
	  AssignmentModifierConcept.Date=Date;  
	  System.out.println(AssignmentModifierConcept.Date);
	   }
	
	  public static void main(String[] args) {
	  AssignmentModifierConcept title = new AssignmentModifierConcept ();
	  title.BookTitle("Hidden Mysteries: ");
	  AssignmentModifierConcept.publishername("John D");	
	  title.Edition("Third Edition");	
	  AssignmentModifierConcept.PublishDate(2020);
	
	 
		
		
	}

}
