import java.util.*;
public class pattern_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	 	for(int i=1;i<n;i++)
		{   sc.nextLine();
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
		}
		for(int i=n;i>=1;i--)
		{   sc.nextLine();
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
		}
		
			
	
	}

}

