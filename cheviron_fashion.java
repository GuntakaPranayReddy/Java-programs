import java.util.*;
class cheviron_fashion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String p= "";
        int n=sc.nextInt();
         int k=0;
        while(k<n)
        {   for(int i=k;i<str.length();i=i+n)
            {
                p=p+str.charAt(i);
            }
          k++;
        }
        System.out.println(p);

    }
}