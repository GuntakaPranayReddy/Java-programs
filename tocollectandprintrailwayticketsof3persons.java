import java.util.*;
  class information {
	 Scanner sc=new Scanner(System.in);
	    int Ticket_id;
		int Seat_no;
		String Customer_name;
		String Train_name;
		String Date;
		String Departure_time;
		String Conformation_status;
	void getdata() {
		System.out.println("ENTER THE TICKET ID IS  ");
		 Ticket_id=sc.nextInt();
		 System.out.println("ENTER THE CUSTOMER NAME IS  ");
         sc.nextLine();  // dummy to avoid issues
		 Customer_name=sc.nextLine();
		 System.out.println("ENTER THE TRAIN NAME IS ");
		 Train_name=sc.nextLine();
		 System.out.println("ENTER THE SEAT NUMBER IS  ");
		 Seat_no=sc.nextInt();
		 System.out.println("ENTER THE DATE IS ");
         sc.nextLine();  // dummy to avoid issues
		 Date=sc.nextLine();
		 System.out.println("ENTER THE DEPARTURE TIME IS ");
		 Departure_time=sc.nextLine();
		 System.out.println("ENTER THE CONFORMATION STATUS IS YES/NO ");
		 Conformation_status=sc.next();	
		 
	}
	void search_info(){
		System.out.println("TICKET ID IS = "+Ticket_id);
		System.out.println("ENTER THE CUSTOMER NAME IS = "+Customer_name);
		System.out.println("ENTER THE TRAIN NAME IS = "+Train_name);
		System.out.println("ENTER THE SEAT NUMBER IS = "+Seat_no);
		System.out.println("ENTER THE DATE IS = "+Date);
		System.out.println("ENTER THE DEPARTURE TIME IS = "+Departure_time);
		System.out.println("ENTER THE CONFORMATION STATUS IS = "+Conformation_status);
		
	}
	
	 
 }
public class tocollectandprintrailwayticketsof3persons {
	public static void main(String[] args) {
		information[] passenger_details=new information[10]; // creating or defining the array of objects
		Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF n: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{   
			System.out.println("ENTER THE DETAILS OF PASSENGER "+(i+1));
			passenger_details[i]=new information();   //  intilizing the array of objects
            passenger_details[i].getdata();          // acessing function with the object
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("PRINT THE DETAILS OF PASSENGER NUMBER "+(i+1));
            passenger_details[i].search_info();
		}
		
	}

}
