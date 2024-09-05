import java.util.*;
public class hailstone_sequence {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print(" ENTER THE NUMBER num IS = ");
	  int num=sc.nextInt();
	  System.out.print(num+" ");
	 while(num>=1)
	 {
          
	 
			if(num%2==0)
			{
				num=num/2;
				System.out.print(num+" ");
			}
			else if(num==1)
			{
				break;
			}
			else 
			{
                num=(3*num)+1;
				System.out.print(num+" ");
			}

			
		}

	  }

		
	}

    

	



