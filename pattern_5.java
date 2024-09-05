import java.util.*;
public class pattern_5 {     // Floyd's Triangle
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE VALUE OF n = ");
		int n=sc.nextInt();
		int num=1;
        int p=1;
       for(int i=1;i<=n;i++)
       {
          num=num+i;
          for(int j=p;j<num;j++)
          {
            System.out.print(j+" ");
          }
          p=num;
          System.out.println("");
          
       }
}

}
