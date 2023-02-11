package day12;

import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Enter masks of Biology");
        int biology= scanner.nextInt();
        System.out.println("Enter masks of chemistry");
        int chemistry= scanner.nextInt();
        System.out.println("Enter masks of physics");
        int physics= scanner.nextInt();
        System.out.println("Enter masks of English");
        int english= scanner.nextInt();
        System.out.println("Enter masks of Math");
        int math= scanner.nextInt();
        float percentage=(biology+chemistry+physics+english+math)*100/500;
        if (biology < 35 || chemistry<35|| physics<35 || english <35 || math< 35 ){
            System.out.format("%s Failed!!", name);
        }else {
            if (percentage >= 80) {
                System.out.format("%s got %f and is distintion! ", name, percentage);
            } else if (percentage < 80 && percentage >= 60) {
                System.out.format("%s got %f and is First Division ", name, percentage);
            } else if (percentage < 60 && percentage >= 45) {
                System.out.format("%s got %f and is Second Division ", name, percentage);
            } else if (percentage < 45 && percentage >= 35) {
                System.out.format("%s got %f and is Third Division ", name, percentage);
            } else
                System.out.format("%s got %f and is Failed ", name, percentage);
        }

    }
}
