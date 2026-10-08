
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        if (in.hasNextDouble()) {
            double celsius = in.nextDouble();
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;

            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid input! Please enter a number.");
        }

        in.close();
    }
}