import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTERED THE STRING IS ");
		String str=sc.next();
		int flag=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-(i+1)))
			{
				flag=-1;
				break;
			}
		}
		if(flag==-1) 
		{
			 
			System.out.println("IT IS NOT A PALINDROME");
			
		}
		else
		{
			System.out.println("IT IS A PALINDROME");

		}
		
		
	      sc.close();
	}

}

