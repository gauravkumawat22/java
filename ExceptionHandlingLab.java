import java.util.InputMismatchException; import java.util.Scanner;

public class ExceptionHandlingLab { public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

try {
System.out.print("Enter an integer numerator: "); int numerator = scanner.nextInt();

System.out.print("Enter an integer denominator: "); int denominator = scanner.nextInt();

int result = divide(numerator, denominator); System.out.println("Result of division: " + result);
} catch (ArithmeticException e) {
System.out.println("Error: Division by zero is not allowed.");
} catch (InputMismatchException e) { System.out.println("Error: Please enter valid integers.");
} finally { scanner.close();
}
}
 
private static int divide(int numerator, int denominator) { if (denominator == 0) {
throw new ArithmeticException("Division by zero");
}
return numerator / denominator;
}
}
