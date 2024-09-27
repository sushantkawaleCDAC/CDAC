package Class;
//Super class
class Base{
	int num1 =10;
	int num2 =20;
}
//Sub class
class Derived extends Base{
	int num3 =30;
	
}

public class Program1 {
	public static void main (String [] args) {
/*-->1 way	Derived d1 = new Derived();//OK
		    Base b1 =(Base) d1 ;//upcasting*/
		
		Base base = new Derived();//Ok upcasting
		System.out.println("Num1:  "+ base.num1); //Ok
		System.out.println("Num2:  "+base.num2 ); //OK
//		System.out.println("Num3:  "+base.num3); // NOT OK
		
		Derived derived = (Derived) base; //Downcasting
		System.out.println("Num3:  "+derived.num3);
		
		
		
		
	}
	public static void main2(String[] args) {
		Derived d1 = new Derived();
//		Here fields of super class inherit in sub class
		System.out.println("Num1:  "+ d1.num1);
		System.out.println("Num2:  "+d1.num2);
		System.out.println("Num2:  "+d1.num3);	
	}

	public static void main1(String[] args) {
		Base b1  = new Base();
		Derived d1 = new Derived();
		System.out.println("Num1:  "+ b1.num1);
		System.out.println("Num2:  "+b1.num2);
//		System.out.println("Num2:  "+b1.num3);
//		NOT OK During inheritance fields of sub class do not inherit in super class 
//		Using super class instance we can access fields of super class only 
	}

}
