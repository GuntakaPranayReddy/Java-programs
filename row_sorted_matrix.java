import java.util.*;
public class row_sorted_matrix {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF n = ");
		int n=sc.nextInt();
		double[][] d=new double[n][n];
		double p;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("d[" +i+"]["+j+"] = ");
				d[i][j]=sc.nextDouble();	
			}
	
		}
		for(int i=0;i<n;i++)
		{  
			for(int j=0;j<n;j++)
			{ 
				for(int k=j;k<n;k++)
				{
					if(d[i][j]>d[i][k])
					{
						p=d[i][j];
						d[i][j]=d[i][k];
						d[i][k]=p;
						
					}
				}
			   
			}
			
		}
        System.out.println("THE ROW SORTED MATRIX IS :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			  
				System.out.print(d[i][j]+" ");
				
			}
			System.out.println("");
	
		}
		
	}

}

