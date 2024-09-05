import java.util.*;
public class smallest_factors_of_a_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[] count=new int[100];
		System.out.print("ENTER THE NUMBER num IS = ");
		int num=sc.nextInt();
		int p=2,n=0;
		while(num>1)
		{
			if(num%p==0)
			{
				num=num/p;
                // System.out.print(p+" ");
				count[n]=p; // this  array for reversing the sequence
                n++;
                	
			}
			else
			{
				p++;
			}
		}
        for(int k=0;k<n;k++)
		{
            System.out.print(count[k]+" ");
        }
        System.out.println("");
        for(int k=n-1;k>=0;k--)
		{
            System.out.print(count[k]+" "); //reverse
        }
	}

}

