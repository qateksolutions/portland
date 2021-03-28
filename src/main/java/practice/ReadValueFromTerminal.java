package practice;

import java.util.Scanner;

public class ReadValueFromTerminal {
    public void getInputFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Your entered string " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your entered integer " + age);

        System.out.print("Enter product price: ");
        float price = scanner.nextFloat();
        System.out.println("Your entered float " + price);
    }
}
