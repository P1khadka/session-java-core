package day8;

public class PrimitiveConversion {
    public static void main(String[] args) {
        byte b=10;
        int a=b;
        long c=a;
        byte d= (byte) c;
        System.out.println(d);
    }

}
