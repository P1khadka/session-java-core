package day10;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
       String name= scanner.nextLine();
        System.out.println("Enter marks of English");
        int english= scanner.nextInt();
        System.out.println("Enter marks of Math");
        int math= scanner.nextInt();
        System.out.println("Enter marks of Science");
        int science=scanner.nextInt();

        float percentage= (english+math+science)*100/300;

        System.out.format("%s got %f Percentage", name,percentage);
    }
}
