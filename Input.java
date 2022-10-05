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
        scan.close();

        System.out.print("Hi " + name + "!");
    }
}