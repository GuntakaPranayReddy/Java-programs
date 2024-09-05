import java.util.*;
public class duplicatewords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str1=sc.nextLine();
		String str=str1.toLowerCase();  // converting into lower case
		String[] words=str.split(" "); 
		//splits the string into sub-strings(words),regex tells at what points the splitting process should takes place
		for(int i=0;i<words.length;i++)
		{
			int count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].compareTo(words[j])==0)
				{
					count=count+1;
					words[j]="0";
				}
			}
			if( words[i]!="0" && count>1)
			{
				System.out.println(words[i]);
			}
		}
		
		
	}

}
