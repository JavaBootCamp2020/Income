import java.util.Scanner;

public class Income {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your income: ");
        double income = input.nextDouble();

        System.out.println("Enter your rate of increase: ");
        double percent = input.nextDouble();

        double rate = percent/100;

        System.out.println("Enter number f years: ");
        double years = input.nextDouble();

        double t = years/12;

        double calculate = ((income * (1 + rate/years))*(t*years)) - income;

        System.out.println(calculate);

        //int i = 0;
    }
}




