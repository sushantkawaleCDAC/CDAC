package org.claculator;
import java.util.Scanner;
import java.time.LocalDate;
public class AgeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int currentYear = LocalDate.now().getYear();
		
		System.out.println("Enter Your Birth Year:  ");
		int birthYear= sc.nextInt();
		
		int age = currentYear - birthYear;
		if(age < 0) {
			System.out.println("Ivalid Year Please Try Again:");
		}
		else {
			System.out.println("Your Age Is : "+age);
		}
		sc.close();

	}

}
