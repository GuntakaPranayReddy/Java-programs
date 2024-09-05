import java.util.*;
public class deletioninarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("size of the array is :");
		int n=sc.nextInt();
		int[] a=new int[n];
        System.out.println("the values of the array is :");
		for(int i=0;i<n;i++)
		{
            System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
		}
        int i=0;
		while(i<n)
		{
			if(a[i]%5==0)
			{
				n=n-1;	
			  for(int k=i;k<n;k++)
			  {
				  a[k]=a[k+1];
			  }
             
			}
            else
            {
               i++;
            }	
		}
		for(int p=0;p<n;p++)
		{
			System.out.println("The value of "+p+" th element is:"+a[p]);
		}
		
		
		
	}

}

