import java.util.*;
abstract class Department{
	abstract void get_data();
	abstract void print_data();	
}
class information extends Department{
	int Teacher_id;
	String Teacher_name;
	int No_of_Students;
	String subject_name;
	String Salary;
	Scanner sc= new Scanner(System.in);
	
	void get_data()
	{
		System.out.println("ENTER THE TEACHER ID IS :");
		Teacher_id=sc.nextInt();
		System.out.println("ENTER THE TEACHER NAME IS :");
        sc.nextLine();
		Teacher_name=sc.nextLine();
		System.out.println("ENTER THE NO OF STUDENTS IN THE DEPARTMENT IS");
		No_of_Students=sc.nextInt();
		System.out.println("ENTER THE SUBJECT NAME IS");
        sc.nextLine();
		subject_name=sc.nextLine();
		System.out.println("ENTER THE SALARY OF THE EACH TEACHER IN THE DEPARTMENT IS");
		Salary=sc.nextLine();
		
	}
	
	void print_data() {
		System.out.println("ENTER THE TEACHER ID IS : "+Teacher_id);
		System.out.println("ENTER THE TEACHER NAME IS :"+Teacher_name);
		System.out.println("ENTER THE NO OF STUDENTS IN THE DEPARTMENT IS :"+No_of_Students);
		System.out.println("ENTER THE SUBJECT NAME IS : "+subject_name);
		System.out.println("ENTER THE SALARY OF THE EACH TEACHER IN THE DEPARTMENT IS : "+Salary);
		
		
	}
}
public class abstraction_example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("NO OF TEACHERS IN THE DEPARTMENT ARE :");
		int k=sc.nextInt();
		information[] Teacher_details=new information[k];  /*(or) Department[] Teacher_details=new information[k] this is like "upcasting",
		because here information class is the sub-class to the Department class.*/
		for(int i=0;i<k;i++) {
		    System.out.println("ENTER THE DETAILS OF TEACHER "+(i+1)+" IS ");
            Teacher_details[i]=new information();
			Teacher_details[i].get_data();
			
		}
		for(int i=0;i<k;i++) {
			System.out.println("PRINT THE DETAILS OF TEACHER "+(i+1)+" IS ");
			Teacher_details[i].print_data();
			
		}
		
	}

}

