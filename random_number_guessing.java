import java.util.*;
public class random_number_guessing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     long num1=Math.round(0+Math.random()*99);
	     int rand_num=(int)num1;
	     System.out.print("ENTER THE NUMBER = ");
	     int num=sc.nextInt();
         System.out.println(rand_num);
	     if(num>rand_num)
	     {
	    	 System.out.println("Too higher");
	     }
	     else if(num<rand_num)
	     {
	    	 System.out.println("Too lower");
	     }
	     else
	     {
	    	 System.out.println("Congratulations! You got it");
	     }
		
	}

}

