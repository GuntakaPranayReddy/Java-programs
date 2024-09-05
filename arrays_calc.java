import java.util.*;
public class arrays_calc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTE THE NUMBER IS = ");
		int num=sc.nextInt();
		int sum_of_diagonals=0;
		int flag=0;
		int [][] arr=new int[num][num];
		int [][] arr1=new int [num][num];
		int[] sum_of_coloumns_elements=new int[num];
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print("arr[" +i+"]["+j+"] = ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print("arr1[" +i+"]["+j+"] = ");
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<num;i++)
		{
			sum_of_diagonals +=arr[i][i];
			
		}
		System.out.println("SUM OF DIAGONALS IS = "+sum_of_diagonals);
		for(int i=0;i<num;i++)
		{   sum_of_coloumns_elements[i]=0;
			for(int j=0;j<num;j++)
			{
				sum_of_coloumns_elements[i]+=arr[j][i];
				
			}
			System.out.println("SUM OF COLOUMN ELEMENTS ["+i+"] IS = "+sum_of_coloumns_elements[i]);
		}
		int max=arr[0][0];
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
			}
		}
		System.out.println("THE MAXIMUM VALUE IN THE MATRIX IS = "+max);
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(arr[i][j]==arr1[i][j])
				{
					flag=1;
					
				}
				else
				{
					flag=0;
					break;
				}
				
			}
		}
		if(flag==1)
		{
			System.out.println("THE TWO ARRAYS ARE STRICTLY IDENTICAL");
		}
		else
		{
			System.out.println("THE TWO ARRAYS ARE STRICTLY NOT IDENTICAL");
		}
		
	}

}

