import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String history = "";
        while (true) {
            System.out.print("Enter expression (operand1 operator operand2): ");
            int operand1 = sc.nextInt();
            char operator = sc.next().charAt(0);
            int operand2 = sc.nextInt();
            int result = calculate(operand1, operator, operand2);

            if (result != Integer.MIN_VALUE) {
            history += operand1 + " " + operator + " " + operand2 + " = " + result + "\n";
                System.out.println("Result: " + result);
            }
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) {
                break;
            }
        }
        if (!history.isEmpty()) {
            System.out.println("\nCalculation History:");
            System.out.println(history);
        }
        System.out.println("Calculator terminated.");
        sc.close();
    }
    public static int calculate(int operand1, char operator, int operand2) {
        switch (operator) {
            case '+': return operand1 + operand2;
            case '-': return operand1 - operand2;
            case '*': return operand1 * operand2;
            case '/': return operand2 != 0 ? operand1 / operand2 : Integer.MIN_VALUE;
            default:
                System.out.println("Error: Invalid operator.");
                return Integer.MIN_VALUE;
        }
    }
}
