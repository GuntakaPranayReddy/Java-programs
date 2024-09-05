import java.util.*;
public class pattern_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=1;
		while(p<=n)
	 	{    sc.nextLine();
			for(int i=1;i<p;i++)
			{
				System.out.print(i+" ");
			}
			for(int i=p;i>=1;i--)
			{
				System.out.print(i+" ");
			}
			p++;
			
	 	}
		
			
		
			
	
	}

}
