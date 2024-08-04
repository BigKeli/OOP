package Homework;

import java.util.Scanner;
// using Zeller's Congruence algorithm to find the day of the week.
public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the day, month, and year from the user
        System.out.print("Enter the day: ");
        int day = input.nextInt();

        System.out.print("Enter the month: ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Validate day and month
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Incorrect value. Day should be between 1 and 31 and month should be between 1 and 12.");
            input.close();
            return;
        }

        // Adjust month and year for Zeller's Congruence
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        // Zeller's Congruence formula
        int dayOfWeek = (day + (13 * (month + 1)) / 5 + year % 100 + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        // Output the result
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("The day of the week is " + daysOfWeek[dayOfWeek]);

        input.close();
    }
}