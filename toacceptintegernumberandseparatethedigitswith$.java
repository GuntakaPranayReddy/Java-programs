import java.util.*;
public class toacceptintegernumberandseparatethedigitswith$ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE INTEGER VALUE ");
		int num=sc.nextInt();
	    /* String str=Integer.toString(num); //to convert int to string 
	     String str=String.valueOf(num);  //to convert int to string. both are same.
	     char[] a=str.toCharArray();       //to convert string into character array 
		 Integer k=num;        // this is the latest version intinally converting primitive to object then convert into string
		 String str2=k.toString();*/
		 String str=String.valueOf(num);
         System.out.print("INT COVERING TO STRING IS "+str);
		 String str1="";
		 for(int i=0;i<str.length()-1;i++)
		 {
			 str1=str1+str.charAt(i)+"$";
		 }
		System.out.print("THE INTEGER NUMBER AFTER SEPERATE THE DIGITS WITH $ is =");
	    System.out.println(str1+str.charAt(str.length()-1));
	
	
	}

}