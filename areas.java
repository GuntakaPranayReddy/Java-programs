import java.util.*;
  class shape {
	  int a,b,h,s;
	  double r;
	  double pi=3.14;
	   void get_data(int a,int b,int h,int s,double r,double pi)
	 {
		 System.out.println("The value of a is = "+ a); 
		 System.out.println("The value of b is = "+ b);
		 System.out.println("The value of h is = "+ h);
		 System.out.println("The value of s is = "+ s);
		 System.out.println("The value of r is = "+ r);
		 System.out.println("The value of pi is = "+ pi);
 	 
	 }
	// abstract void area(); 
	void area(){}; // this can be write without having the abstract class
	
}
	 class parallelogram extends shape {
         
         int a,b;
		void get_data(int a,int b)
		{ 
			this.a=a;
			this.b=b;

		}
		 void area()
		 {
			
			 double ar;
			 ar=a*b;
			 System.out.println("The value of area of parallelogram is = "+ar);
			 
		 }
	}
	 class trapezium extends shape {
		 
		int a,b,h;
		void get_data(int a,int b,int h)
		{ 
			this.a=a;
			this.b=b;
			this.h=h;

		}
		 void area()
		 {
			 double ar;
			 ar=0.5*(a+b)*h;
			 System.out.println("The value of area of trapezium is = "+ar);
			 
		 } 
	}
	 class ellipse extends shape {
		 int a,b;
		 double pi;
		void get_data(int a,int b,double pi)
		{ 
			this.a=a;
			this.b=b;
			this.pi=pi;

		}
		 void area()
		 {
			 double ar;
			 ar=pi*a*b;
			 System.out.println("The value of area of ellipse is = "+ar);
			 
		 } 
    }
	 class cone extends shape {
		 int a,b,s;
		 double r,pi;
		void get_data(int a,int b,int s,double r,double pi)
		{ 
			this.a=a;
			this.b=b;
			this.s=s;
			this.r=r;
			this.pi=pi;

		}
		 void area()
		 {
			 double ar;
			 ar=pi*r*s;
			 System.out.println("The value of area of cone is = "+ar);
			 
		 } 
		 void surface_area()
		 {
			 double su_ar;
			 su_ar=(pi*r*s)+pi*Math.pow(r,2);
			 System.out.println("The value of surface_area of cone is = "+su_ar);
			 
		 }
	}
	 public class areas{
		 public static void main(String[] args) {
			int a,b,h,s;
			double r,pi =3.14;
			Scanner sc=new Scanner(System.in);
			System.out.println("The value of a is = ");
			a=sc.nextInt();
			System.out.println("The value of b is = ");
			b=sc.nextInt();
			System.out.println("The value of h is = ");
			h=sc.nextInt();
			System.out.println("The value of s is = ");
			s=sc.nextInt();
			System.out.println("The value of r is = ");
			r=sc.nextDouble();
			System.out.println("The value of pi is = "+ pi);
            shape S =new shape();
            S.get_data(a,b,h,s,r,pi);
			shape p=new parallelogram();
			p.area();
			shape t=new trapezium();
			t.area();
			shape e=new ellipse();
			e.area();
			cone c=new cone();
			c.area();
			c.surface_area();
			sc.close();
		 }
		 
	}
 
