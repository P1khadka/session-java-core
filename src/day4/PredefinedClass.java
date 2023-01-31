package day4;

public class PredefinedClass {
    //Math math= new Math(); // we cannot create the
    public static void main(String[] args) {
        double a=10.55, b=20.99, e=10.5;
        System.out.println(Math.PI);
        System.out.println(Math.max(10,20));
        System.out.println(Math.sin(1));
        int random=(int)Math.round(10*Math.random());
        System.out.println(random);
        System.out.println(Math.ceil(a));
      double c= Math.floor(b);
        System.out.println(c);
        double d=Math.round(e);
        System.out.println(d);
        System.out.println(Math.pow(10,2));

    }
}
