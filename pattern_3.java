import java.util.*;
public class pattern_3 {   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE VALUE OF n = ");
		int n=sc.nextInt();
        System.out.print("ENTER THE VALUE OF m = ");
		int m=sc.nextInt();
        System.out.println("Hollow square is");
	  for(int i=0;i<n;i++)       // Hollow square
	  {
			if(i==0 || i==n-1)
		    { 
              for(int j=0;j<n;j++)
			  {
		    	System.out.print(" * ");
			  }
		    }
			else
			{  
				for(int k=0;k<n;k++)
				{
				   if(k==0 || k==n-1)
                   {
                    System.out.print(" * ");
                   }
                   else
                   {
                     for(int p=1;p<n-1;p++)
                     {
                        System.out.print(" ");
                     }
                   }	
				}
				
			}
          System.out.println("");
		  
	  }
      System.out.println("Hollow rectangle is");
      for(int i=0;i<m;i++)       // Hollow rectangle
	  {
			if(i==0 || i==m-1)
		    { 
              for(int j=0;j<n;j++)
			  {
		    	System.out.print(" * ");
			  }
		    }
			else
			{  
				for(int k=0;k<n;k++)
				{
				   if(k==0 || k==n-1)
                   {
                    System.out.print(" * ");
                   }
                   else
                   {
                     for(int p=1;p<n-1;p++)
                     {
                        System.out.print(" ");
                     }
                   }	
				}
				
			}
          System.out.println("");
		  
	  }
	}

}
