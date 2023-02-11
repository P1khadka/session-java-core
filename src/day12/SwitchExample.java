package day12;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day");
        String days=scanner.nextLine();
        switch (days.toUpperCase()) {
            case "SUNDAY":
                System.out.println("A MOMO");
                break;
            case "MONDAY" :
                System.out.println("B MOMO");
                break;
            case "TUESDAY":
                System.out.println("C MOMO");
                break;
            case "WEDNESDAY" :
                System.out.println("D MOMO");
                break;
            case "THURSDAY":
                System.out.println("E MOMO");
                break;
            case "FRIDAY" :
                System.out.println("F MOMO");
                break;
            case "SATURDAY":
                System.out.println("G MOMO");


        }

    }
}
