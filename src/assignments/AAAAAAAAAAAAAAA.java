package assignments;

public class AAAAAAAAAAAAAAA {

	public static void main(String[] args) {
System.out.println(sample)
System.out.println(sample02);
		
		
	String s = "Selenium";
	int len = s.length();
	String rev = "";
	for(int a=len-1; a>=0; a--) {
	rev=rev+s.charAt(a);
	}
	System.out.println(rev);	
		
	String j ="Jawa";	
	StringBuffer sb = new StringBuffer(j);
	System.out.println(sb.reverse());
		
	int num = 12345;
	int rev1 = 0;
	while(num!=0) {
	rev1 =rev1*10+num%10;	
	num=num/10;
	}
	System.out.println(rev1);	
	
	
	int numm = 12345678;
    System.out.println(new StringBuffer(String.valueOf(numm)).reverse());
    
    
//    Regular Expression "[^a-zA-Z0-9]"
    
    String z = "@#$cat%rat%sad&*";
    z=z.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(z);
    
    
    String ss= "@#wer#$%sar$%^ter";
    ss=ss.replaceAll("@#wer#$%sar$%^ter", "");
    System.out.println(ss);
    
    int c []= {1,2,3,5,6,7};
    int sum1 = 0;
    for(int t =0; t<c.length; t++ ) {
    sum1=sum1+c[t];	
    }
    System.out.println(sum1);
    
    int sum2 = 0;
    for(int w= 1; w<=7; w++) {
    sum2 = sum2+w;	
    }
	System.out.println(sum2);
	System.out.println(sum2-sum1);
	}
}
