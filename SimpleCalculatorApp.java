import java.util.Scanner;

public class SimpleCalculatorApp {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Please enter a valid denomenator value (cannot divde by 0).");
            return 0;
        }
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        String choice;

        System.out.println("Welcome to Josh's Simple Calculator App!");
        System.out.println("The purpose of this application is to perform specific operations for a and b values.");
        System.out.println("The available operations include (+, -, x, and /).");
        System.out.println();

        System.out.println("Please enter a value for 'a': ");
        a = input.nextInt();

        System.out.println("Please enter a value for 'b': ");
        b = input.nextInt();
        input.nextLine();

        System.out.println("Would you like to add, subtract, divide, or multiply these values?");
        choice = input.nextLine().toLowerCase();

        switch(choice) {
            case "add":
                System.out.println("The result of " + a + " + " + b + " = " + add(a, b));
                break;

            case "subtract":
                System.out.println("The result of " + a + " - " + b + " = " + subtract(a, b));
                break;

            case "divide":
                System.out.println("The result of " + a + " / " + b + " = " + divide(a, b));
                break;

            case "multiply":
                System.out.println("The result of " + a + " x " + b + " = " + multiply(a, b));
                break;
        }
        input.close();
    }
}
