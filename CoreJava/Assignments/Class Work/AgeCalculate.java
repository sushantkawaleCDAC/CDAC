package org.claculator;
import java.util.Scanner;
//import java.time.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AgeCalculate {
		public static void main(String[] args) {
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter your birth date(YYYY-MM-DD)");
			String birthDateString= sc.nextLine();
			
			System.out.println("Enter your birth time(HH:MM:SS)");
		     String birthTimeString = sc.nextLine();
		     
		     LocalDate birthDate = LocalDate.parse(birthDateString);
		     
		     DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		     LocalTime birthTime = LocalTime.parse(birthTimeString, timeFormatter);


	}

}
