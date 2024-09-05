import java.util.*;
public class noofoccurencesofsubstringfromstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str1=sc.nextLine();
		String str=str1.toLowerCase();  // converting into lower case
		String[] words=str.split(" "); 
		//splits the string into sub-strings(words),regex tells at what points the splitting process should takes place
        int p=words.length;
        int[] count=new int[p];
        for(int i=0;i<p;i++)
        {
            count[i]=1;
        }
		for(int i=0;i<p;i++)
		{   int j=i+1;
			while(j<p)
			{

                    if(words[i].compareTo(words[j])==0)
                    {
                        count[i]=count[i]+1;
                        p=p-1;
                        for(int k=j;k<p;k++)
                        {
                            words[k]=words[k+1];
                        } 
                       
                          
                    }
                    else
                    {
                      j++;  
                    }
               
			}

		}
        for(int i=0;i<p;i++)
        {
            System.out.println("the occurence of the word "+words[i]+" is= "+ count[i]);
        }
		
		
		
		
	}
}
