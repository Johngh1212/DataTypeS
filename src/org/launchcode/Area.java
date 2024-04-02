package src.org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a radius: ");

        double radius = scanner.nextDouble();
        double area = calculateArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        scanner.close();
    }

    public static double calculateArea(double radius) {

        final double PI = 3.14;
        double area = PI * radius * radius;
        return area;
    }
}

