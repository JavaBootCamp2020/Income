/*
Author Gil Silva
Application that calculates the increase of income
based on annual rate and principal provided by user
Java Boot Camp
 */

import java.util.Scanner;


public class Income {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your income: ");
        double income = input.nextDouble();

        System.out.println("Enter your rate of increase: ");
        double percent = input.nextDouble();

        double rate = percent/100;

        System.out.println("Enter number of years: ");
        int years = input.nextInt();

        //Formula for compound interest
        // futureValue = principal x (1+ interest/ frequency)^time

        double newIncome = income*(Math.pow((1+rate),years));
        System.out.printf("Based on the information that you provided your current income of $%.2f", income);
        System.out.println("\nwith increase rate of " + percent + "% per year in " + years + " years will be ");
        System.out.printf("$%.2f", newIncome);



    }
}




