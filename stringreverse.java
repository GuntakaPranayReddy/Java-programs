import java.util.*;
public class stringreverse {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
        System.out.print("ENTERED GIVEN STRING IS :");
		String str=sa.nextLine();
		String rev_str="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev_str=rev_str+str.charAt(i);
		}
		System.out.println("THE REVERSE OF THE GIVEN STRING IS :"+rev_str);
		
	}

}

