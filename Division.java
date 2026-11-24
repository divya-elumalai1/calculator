import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        if (second == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            int quotient = first / second;
            System.out.println("Quotient = " + quotient);
        }

        scanner.close();
    }
}
