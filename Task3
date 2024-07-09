package L1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        boolean continueCalculation = true;

	        while (continueCalculation) {
	            try {
	                System.out.print("Enter the first number: ");
	                double num1 = scanner.nextDouble();

	                System.out.print("Enter the second number: ");
	                double num2 = scanner.nextDouble();

	                System.out.print("Enter an operator (+, -, *, /): ");
	                char operator = scanner.next().charAt(0);

	                double result;
	                switch (operator) {
	                    case '+':
	                        result = num1 + num2;
	                        break;
	                    case '-':
	                        result = num1 - num2;
	                        break;
	                    case '*':
	                        result = num1 * num2;
	                        break;
	                    case '/':
	                        if (num2 == 0) {
	                            throw new ArithmeticException("Error, Division by zero is not allowed");
	                        }
	                        result = num1 / num2;
	                        break;
	                    default:
	                        throw new IllegalArgumentException("Invalid operator");
	                }

	                System.out.println("The result is: " + result);

	            } catch (ArithmeticException e) {
	                // Handling division by zero
	                System.out.println("Error: " + e.getMessage());
	            } catch (IllegalArgumentException e) {
	                // Handling invalid operator
	                System.out.println("Error: " + e.getMessage());
	            } catch (InputMismatchException e) {
	                // Handling input mismatch
	                System.out.println("Error: Invalid number input");
	                scanner.next(); 
	                
	            } catch (Exception e) {
	                // Handling any other exceptions
	                System.out.println("Error: An unexpected error occurred");
	                System.out.println("Exception type: " + e.getClass().getSimpleName());
	            }

	            System.out.print("Do you want to perform another calculation? (y/n): ");
	            String userResponse = scanner.next();
	            if (!userResponse.equalsIgnoreCase("y")) {
	                continueCalculation = false;
	            }
	        }

	        scanner.close();
	        System.out.println("program terminated");

		
	}

}
