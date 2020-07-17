// Area of a triangle

import java.util.Scanner;

public class ScannerTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base");
        double base = s.nextDouble();
        System.out.println("Enter the height");
        double height = s.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of a triangle is: " + area);
    }
}
