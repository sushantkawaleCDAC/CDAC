package Class;
// Super class
class Base{
	private int num1 = 10;
	private int num2 = 20;
	
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return num2;
		
	}
	
//sub class
class Derived extends  Base{
	private	int num3 = 30;
	public int getNum3() {
		return num3;
	}
	 
}
}
public class Program11 {

	public static void main(String[] args) {
		Base base = new Base();
		System.out.println("Num1:  "+base.getNum1());
	

	}

}
