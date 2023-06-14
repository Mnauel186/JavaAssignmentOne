package comu;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// program for calculations
		Scanner scanner = new Scanner(System.in);
//prompts user to enter value
        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();

        //entering of numbers and operations
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double num2 = 0.0;
        switch (operation) {
            case '+':
            
                System.out.print("Enter another number: ");
                num2 = scanner.nextDouble();
                break;
            case '-':
                num2 = -num1;
                break;
            case '*':
                System.out.print("Enter another number: ");
                num2 = scanner.nextDouble();
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                num2 = 1.0 / num2;
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
//display the output
        double result = num1 + num2;

        System.out.println("Result: " + result);

	}

}
