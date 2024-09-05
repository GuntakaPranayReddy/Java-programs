import java.util.*;
public class exceptionsrelated {
	public static void main(String[] args)throws Exception { // throws Expection is not required for the try,catch finilize blocks
		Scanner sc=new Scanner(System.in);
        System.out.print("size of the array is :");
		int p =sc.nextInt();
		int[] arr=new int[p];
		for(int i=0;i<p;i++)
		{
			arr[i]=i;
		}
        System.out.print("index of the array is :");
        int q =sc.nextInt();
	    /*if(p<q) {
		try
		{
			System.out.println(arr[q]);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
		else {
			System.out.println("NO EXCEPTION");
		}   */                                                  //two methods
		if(p<q) {
			throw new Exception("Arrayindexoutofbound");
              // it is a an object of the class Exception. for this we write "throws Exception" with main class
        		}
			else {
				System.out.println("NO EXCEPTION");
			}
	}

}
