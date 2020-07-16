/*
        An Application to demonstrate use of Scanner class.
        Create an application to accept firstname, rollNumber, percentage,
        section, year, course from user. And display the output in the below format.
        Output
        First Name : Vaibhav
        rollNUmber : 81
        Percentage : 66.31
        Section : G
        Year : 2
        Course : B.Tech CSE
 */

import java.util.Scanner;

public class ScannerPractise {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = object.nextLine();
        System.out.println("Enter your roll number");
        byte roll = object.nextByte();
        System.out.println("Enter your percentage");
        double per = object.nextDouble();
        System.out.println("Enter your section");
        String section = object.next();
        System.out.println("Enter your current year");
        byte year = object.nextByte();
        object.nextLine();
        System.out.println("Enter your course");
        String course = object.nextLine();
        object.close();
        System.out.println("First Name : " + name);
        System.out.println("RollNumber : " + roll);
        System.out.println("Percentage : " + per);
        System.out.println("Section : " + section);
        System.out.println("Year: " + year);
        System.out.println("Course: " + course);
    }
}
