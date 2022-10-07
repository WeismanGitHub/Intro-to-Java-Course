/**
 * Input
 * 
 * @ Weisman
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println("Hi " + name + "!");

        System.out.println("What's your age?");
        Integer age = scan.nextInt();
        System.out.println("You're " + age + " years old!");

        scan.close();
    }
}