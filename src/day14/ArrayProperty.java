package day14;

import java.util.Arrays;

public class ArrayProperty {
   static int num[] = {10, 2, 30, 4, 15};
    public static void main(String[] args) {

        System.out.println(Arrays.toString(num));
        someFunction(num);
        System.out.println(Arrays.toString(num));
        sortFunction(num);
    }

    private static void sortFunction(int[] num) {
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }

    public static void someFunction(int num[]) {
       // num[0] = 10;
       int  num1[]= Arrays.copyOf(num,num.length);
       num1[1]=10;

    }

}
