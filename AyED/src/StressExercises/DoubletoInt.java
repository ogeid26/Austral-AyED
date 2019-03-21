package StressExercises;

import java.util.Scanner;

public class DoubletoInt {

    public static void main(String[] args){

        System.out.println("Enter a double, i will turn it into an integer (by deleting the decimal part.");
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        String s = Double.toString(b);

        int iO = s.indexOf(".");
        String s1 = s.substring(0, iO);
        System.out.println("Done! The new integer is: "+ s1);
    }
}
