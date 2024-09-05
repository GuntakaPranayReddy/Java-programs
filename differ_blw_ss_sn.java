import java.util.*;
 class process{
	static int sum_squares(int n)  // static method
	{   int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
		}
		return(sum);
	}
	int squares_sum(int n)     // non-static method
	{   int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return((sum*sum));
	}
}

public class differ_blw_ss_sn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF n = ");
		int n=sc.nextInt();
		int a=process.sum_squares(n); 
		//to invoke in main function the syntax is = classname.methodname/variablename without creating the object of that class for "static" conditions.
		process p=new process(); // creating the object 
		int b=p.squares_sum(n);  // accessing the non-static method using that object
		
		System.out.println("THE DIFFERENCE BETWEEM squares_sum and sum_squares is = "+Math.abs(a-b)); 
		// abs(absolute value) is to provide value in positive and in all math functions are static so we use "Math.func()" -> is syntax.
	}

}
