// Print area of circle

import java.util.Scanner;

public class ScannerCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = s.nextDouble();
        double area = (22 * radius * radius) / 7;
        System.out.println("Area of a circle: " + area);
    }

}
