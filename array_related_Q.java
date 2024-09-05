import java.util.*;
public class array_related_Q {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
	        System.out.print("ENTER THE VALUE OF n = ");
			int n=sc.nextInt();
			System.out.print("ENTER THE VALUE OF m = ");
			int m=sc.nextInt();
			int[][] eachday_hrs=new int[n][m];
			int[] total_hrs=new int[n];
			int[] num=new int[n];
			int p,k;
			 for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print("eachday_hrs[" +i+"]["+j+"] = ");
					eachday_hrs[i][j]=sc.nextInt();	
				}
		
			}
			for(int i=0;i<n;i++)
			{   total_hrs[i]=0;
				for(int j=0;j<m;j++)
				{
				
					total_hrs[i]+=eachday_hrs[i][j];
				}
		
			}
			for(int i=0;i<n;i++)
			{
				System.out.println("total_hrs[" +i+"] = "+ total_hrs[i]);
				
			}
			for(int i=0;i<n;i++)
			{
				num[i]=i;
			}
			 
			for(int i=0;i<n;i++)
			{ 
				for(int j=i+1;j<m;j++)
				{
					if(total_hrs[i]>total_hrs[j])
					{   
						p=total_hrs[i];
						total_hrs[i]=total_hrs[j];
						total_hrs[j]=p;	
						k=num[i];
						num[i]=num[j];
						num[j]=k;
					}
				}
				
			}
			System.out.println("");
			for(int i=0;i<n;i++)
			{
				System.out.println("Employee "+num[i]);
			}
			
		}

	}




