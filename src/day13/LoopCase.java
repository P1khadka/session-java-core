package day13;

public class LoopCase {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println("After loop use ");
        int i = 1;
        int j = 1;
        while (i < 10) {
            System.out.print(i++ + " ");
        }
        System.out.println("After do while");
        do {
            System.out.print(j + " ");
            j++;
        }
        while (j <= 10);
        {
            System.out.print(j + " ");
        }
        System.out.println("After for loop");
        for (int k = 10; k <= 20; k++) {
            System.out.print(k + " ");
        }
        int totalSaving = 0;
        int age = 20;
        System.out.println();
        for (; ; ) {
            double randomSaving = Math.random() * 1000;
            totalSaving += randomSaving;
            if (totalSaving >= 10000) {
                break;
            }
            age++;

        }
        System.out.println("Age of Retirement "+age);

    }
}
