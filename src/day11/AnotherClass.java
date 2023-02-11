package day11;

public class AnotherClass {
    public static void main(String[] args) {
      int a=  BlockScope.variableForAnotherClass;
        System.out.println(a);
        System.gc(); // for call garbage collector
        Runtime.getRuntime().gc();// for call garbage collector
    }
}
