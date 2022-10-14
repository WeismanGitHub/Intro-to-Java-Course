/**
 * Calculator
 * 
 * @ Weisman
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anotherCalculation = 1;
        int whichCalculation;
        double result = 0;
        double num1;
        double num2;
        
        while (anotherCalculation == 1) {
            System.out.println("Choose a task. Press 1 to add, 2 to subtract, 3 to multiply, and 4 to divide.");
            
            whichCalculation = input.nextInt();
            
            System.out.println("Please enter the first number.");
            num1 = input.nextDouble();
            
            System.out.println("Please enter the second number.");
            num2 = input.nextDouble();
            
            switch (whichCalculation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
            }
            
            System.out.println(result);

            System.out.println("Press 1 to continue and 2 to stop.");
            anotherCalculation = input.nextInt();
        }

        System.out.println("Goodbye!");

        input.close();
    }
}
