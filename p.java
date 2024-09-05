import java.util.*;
abstract class pranay {
	static void func() {
		System.out.println("INDIAN CRICKET TEAM");
	}
	abstract void func1();

}
 class j extends pranay{

	
	void func1() {
		System.out.println("INDIAN CRICKET PLAYERS");
	}
	
}
public class p{
 public static void main(String[] args) {
	 pranay x=new j();  // here it is upcasting 
	 x.func1();
	 x.func();
     j y=new j();      // here it is creating object generally
     y.func1();
     y.func();       // here clalling static function with sub-class
     pranay.func();    // with abstract class of static function
     j.func();         // with sub-class of static function
	 
	 
 }
}

