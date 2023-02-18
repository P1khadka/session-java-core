package day22;

public class MainClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass= outerClass. new InnerClass();
        System.out.println(innerClass.getA());
    }
}
