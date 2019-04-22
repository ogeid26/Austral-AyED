package StressExercises;

import java.util.Scanner;

public class DateHandling {

    public static void dateGap(int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear) {

        //Parse input

        if (startYear > endDay)
            throw new IllegalArgumentException();
        else if ((startYear == endYear) && (startMonth > endMonth))
            throw new IllegalArgumentException();
        else if ((startYear == endYear) && (startMonth == endMonth) && (startDay > endDay))
            throw new IllegalArgumentException();

        else {
            int difDay = endDay - startDay;
            int difMonth = endMonth - startMonth;
            int difYear = endYear - startYear;

            System.out.println("Difference between dates: " + difDay + " days(s), " + difMonth + " month(s), " + difYear + " year(s)1");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("WARNING: all numbers entered must be positive integers.");

        //Start date input
        System.out.println("Enter a starting day of the month: ");
        int daysStart = sc.nextInt();
        System.out.println("Enter a starting month of the year: ");
        int monthsStart = sc.nextInt();
        System.out.println("Enter a starting year: ");
        int yearsStart = sc.nextInt();


        // End date input
        System.out.println("Enter an ending day of the month: ");
        int daysEnd = sc.nextInt();
        System.out.println("Enter an ending month of the year: ");
        int monthsEnd= sc.nextInt();
        System.out.println("Enter an ending year: ");
        int yearsEnd = sc.nextInt();

        DateHandling.dateGap(daysStart, monthsStart, yearsStart, daysEnd, monthsEnd, yearsEnd);

    }
}
