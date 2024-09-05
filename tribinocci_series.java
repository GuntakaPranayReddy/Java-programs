import java.util.*;
public class tribinocci_series {
public static void main(String[] args) {
int f0 = 0 , f1 = 1 , f2 = 1 ;
 int f=f0+f1+f2;
Scanner sc=new Scanner(System.in);
System.out.print("ENTER THE VALUE OF n:");
int n=sc.nextInt();
for (int i=4;i<=n;i++) 
{
    f0=f1;
    f1=f2;
    f2=f ;
    f=f0+f1+f2;
}
System.out.println("ENTER THE SUM  OF n NUMBERS OF WITH GIVEN FUNCTION :"+f);
}
}