package day2;

public class FunctionPractice {
    public static void main(String[] args) {
        System.out.println("Addition");
        add(10,30);
        int a=10, b=50;
        add(a,b);
        System.out.println("________________________");
        System.out.println("Substraction");
      int  result=substract(50,30);
        System.out.println(result);
        int c=50;
        int d=20;
        int result1=substract(c,d);
        System.out.println(result1);
        System.out.println("_______________________________");
        System.out.println("Multiplication");
      int result2= multiply(10,30);
        System.out.println(result2);
        System.out.println(multiply(40,50));
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Division");
        System.out.println(divide(100,20));
        int result3=divide(30,3);
        System.out.println(result3);
    }

    public static void add(int x, int y){
        int temp=x+y;
        System.out.println(temp);
    }
    public static int substract(int a,int b){
        int temp1=a-b;
        return temp1;
    }
    public static int multiply(int e, int f){
        int temp2=e*f;
        return temp2;
    }
    public static int divide(int g, int h){
        int temp3=g/h;
        return temp3;
    }
}
