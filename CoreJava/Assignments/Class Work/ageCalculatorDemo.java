package org.claculator;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ageCalculatorDemo {

    public static void main(String[] args) {
        // Create a scanner to get the user's input
        Scanner scanner = new Scanner(System.in);

        // Ask for the birth date
        System.out.println("Enter your birth date (YYYY-MM-DD): ");
        String birthDateString = scanner.nextLine();

        // Ask for the birth time
        System.out.println("Enter your birth time (HH:mm:ss): ");
        String birthTimeString = scanner.nextLine();

        // Convert birth date to LocalDate
        LocalDate birthDate = LocalDate.parse(birthDateString);

        // Convert birth time to LocalTime
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime birthTime = LocalTime.parse(birthTimeString, timeFormatter);

        // Combine birth date and time into LocalDateTime
        LocalDateTime birthDateTime = LocalDateTime.of(birthDate, birthTime);

        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Calculate the difference in dates (years, months, days)
        Period age = Period.between(birthDate, currentDateTime.toLocalDate());

        // Calculate the time difference including both date and time
        Duration timeDifference = Duration.between(birthDateTime, currentDateTime);

        // Get the total seconds difference and convert to hours, minutes, and seconds
        long seconds = timeDifference.getSeconds();
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        long secondsLeft = seconds % 60;

        // Display the result
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
        System.out.println("Additionally, you have lived " + hours + " hours, " + minutes + " minutes, and " + secondsLeft + " seconds today.");
        
        // Close the scanner
        scanner.close();
    }
}
