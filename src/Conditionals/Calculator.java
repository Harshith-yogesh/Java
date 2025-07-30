package Conditionals;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the First Number");
            int a = sc.nextInt();

            System.out.println("Enter the Second Number");
            int b = sc.nextInt();

            System.out.println("Enter the Operation (+, -, *, /, %, x to exit)");
            char op = sc.next().trim().charAt(0);

            int ans = 0;

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting...");
                break;
            }

            switch (op) {
                case '+':
                    ans = a + b;
                    break;
                case '-':
                    ans = a - b;
                    break;
                case '*':
                    ans = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        ans = a / b;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;
                case '%':
                    ans = a % b;
                    break;
                default:
                    System.out.println("Invalid Operation");
                    continue;
            }

            System.out.println("The Result is: " + ans);
        }
    }
}