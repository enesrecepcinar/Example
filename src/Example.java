import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");

        String name = input.next();

        System.out.println("Hello " + name);

        System.out.println("Please enter the temperature in degrees Fahrenheit");

        int fahrenheit = input.nextInt();

        double celsius = (fahrenheit - 32) / 1.80;

        System.out.println(celsius + " Thanks");
    }
}
