package day19;

import java.util.Arrays;

public class MethodWithVarParameters {
    public static void main(String[] args) {
        String formattedString= String.format("%s How are you! I am learning %s for %d Years", "Prakash", "Java", 8);
        System.out.println(formattedString);
        add(2,3);
        add(2,3,4);
    }
    public static void add(int  ...values){
        System.out.println(Arrays.toString(values));
    }
//    public static void add(int a, int b){
//        System.out.println(a+b);
//    }
//    public static void add(int a, int b, int c){
//        System.out.println(a+b+c);
//    }
}
