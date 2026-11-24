import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        int difference = first - second;
        System.out.println("Difference = " + difference);

        scanner.close();
    }
}
