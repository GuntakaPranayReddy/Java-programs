import java.util.*;
public class average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double[] arr=new Double[12];
		Double sum=0.d;
		int count=0;
		System.out.println("ENTER THE ARRAY VALUES");
		for(int i=0;i<12;i++)
		{
		   System.out.print("arr["+(i+1)+"] IS = ");
			arr[i]=sc.nextDouble();	
            sum+=arr[i];
		}
		/*for(int i=0;i<12;i++)
		{
			sum+=arr[i];	
		}*/
		Double avg=sum/12.d;
		System.out.println("THE AVERAGE IS = "+avg);
		for(int i=0;i<12;i++)
		{

			if(arr[i]>avg) 
			{
				count+=1;
			}
					
		}
        System.out.println("number of months in which the rainfall is more than the average IS = "+count);
		 
	}

}
