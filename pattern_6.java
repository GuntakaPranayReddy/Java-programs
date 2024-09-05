import java.util.*;
public class pattern_6 {   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE VALUE OF n = ");
		int n=sc.nextInt();
        System.out.println("Hollow half pyrmaid is");
        for(int i=1;i<n;i++)   // Hollow half pyrmaid
        {   if(i!=1)
            {
                System.out.print(1);
            }
           for(int j=1;j<=(2*i-3);j++)
           { 
                System.out.print(" ");
                
           }
           System.out.print(i);
           System.out.println("");
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Hollow inverted half pyrmaid is");
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i=2;i<=n;i++)
        {  if(i!=n)
           {
            System.out.print(i);
           }
           for(int j=1;j<=(2*(n-i)-1);j++)
           { 
                System.out.print(" ");
                
           }
           System.out.print(n);
           System.out.println("");
        }
    }
}