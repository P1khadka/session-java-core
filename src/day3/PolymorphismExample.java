package day3;

public class PolymorphismExample {
    public static void main(String[] args) {
        add(10,10);
        add(10.10f, 12.12f);
        add(10.10, 100.10);

    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(float a, float b){
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
}
