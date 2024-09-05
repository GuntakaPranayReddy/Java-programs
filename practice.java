import java.util.*;
public class practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("THE INPUT NUMBER IS:");
		int num=sc.nextInt();
		System.out.println(		" 1)calculate the sum of its digits\n 2)to reverse the number\n 3)sum of first and last digit of the number\n 4)to find the count of odd and even numbers in the given input\n");
       System.out.print("CHOOSE REQUIRED OPTION :");
		int p=sc.nextInt();
		if(p==1)
		{
			int sum=0;
			int r;
			  while(num>0)
			  {
				   r=num%10;
				   sum=sum+r;
				   num=num/10;
			  }
			  
			  System.out.println("THE SUM OF THE DIGITS IS :"+sum);
		}
		else if(p==2)
		{
			int rev_num=0;
			int r;
			  while(num!=0)
			  {  
				   r=num%10;
			       rev_num=(rev_num*10)+r;
				   num=num/10;
			  }
			  
			  System.out.println("THE reverse number IS :"+rev_num);
			
		}
		else if(p==3)
		{
			int a=num%10;
			int rev_num=0;
			 while(num!=0)
			  {    
				  int r=num%10;
			       rev_num=(rev_num*10)+r;
				   num=num/10;
			  }
			 int b=rev_num%10;
			 int sum =a+b;
			
			 System.out.println("sum of first and last digit of the number is"+sum);
			 	
		}
		else if(p==4)
		{ int ecount=0,ocount=0;
			while(num!=0)
			{
				int r=num%10;
				if(r%2==0)
				{	
					ecount=ecount+1;
				}
				else
				{
					ocount=ocount+1;
				}
				num=num/10;
			}
			
			System.out.println("the count of odd numbers in the given input is="+ ocount);
			System.out.println("the count of even numbers in the given input is="+ ecount);
		
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}

