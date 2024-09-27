package Day11;
import java.util.Scanner;
public class Program {
//try throw catch
	public static void main(String[] args) {

		try (Scanner sc = new Scanner (System.in)){
			System.out.print("Num1:  ");
			int num1 = sc.nextInt();
			 
			System.out.print("Num2 : ");
			int num2 = sc.nextInt();
			
			if (num2 == 0 )
				throw new ArithmeticException("value of num2 shoul not be zero");

			int result  = num1 / num2;
				System.out.println("Result: "+result);
			 	
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	

	}

}
