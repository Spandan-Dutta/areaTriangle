// Application to accept 3 values separated by space

import java.util.Scanner;

public class ScannerQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll, name and section separate them by space");
        int roll = sc.nextInt();
        String name = sc.next();
        String section = sc.next();
        System.out.println(roll + "," + name + "," + section);
    }
}
