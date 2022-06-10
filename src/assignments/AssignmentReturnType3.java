package assignments;

public class AssignmentReturnType3 {
	
	   public double d = 90.90;
	   public String s = "Baseball";
	   public int i = 100;
	   public float f = 2.5f;
	   public long l = 20l;
	   public char c = '@'+'#';
	   public boolean b = true;
	   
	   public int array[] = {10,20,30,40,50};
	   
	   public double get() {
		   return d;   
	   }
	   public String getS() {
	  // String.valueOf(i);
		   return  s;
	   }
	   public int geti() {
		   return i;
	   }
	   public float getf() {
		   return  f;
	   }
	   public long getl() {
		   return l;
	   }
	   public char getc() {
		   return c;
	   }
	   public boolean getb() {
		   return b;
	   }   
	 public static void main(String[] args) {
	  AssignmentReturnType3 rt = new AssignmentReturnType3();
	  System.out.println(rt.d);
	  System.out.println(rt.getS());
	  System.out.println(rt.geti());
	  System.out.println(rt.getf());
	  System.out.println(rt.getl());
	  System.out.println(rt.getc());
	  System.out.println(rt.getb());
	  

	}

}
