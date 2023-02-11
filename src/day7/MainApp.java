package day7;

 class MainApp {
     public static void main(String[] args) {
         Mutable mutable= new Mutable(10,20);
         System.out.println(mutable.getA());
         System.out.println(mutable.getB());
         mutable.setA(30);
         mutable.setB(35);
         System.out.println("After mutate");
         System.out.println(mutable.getA());
         System.out.println(mutable.getB());
// immutable
         Immutable immutable= new Immutable(10, 30);
         System.out.println(immutable.getA());
         System.out.println(immutable.getB());
        System.out.println("we cannot set any data in immutable class that is why we have to make another object ");
        Immutable immutable1= new Immutable(40,50);
         System.out.println(immutable.getA());
         System.out.println(immutable.getB());

         // String and localdate are the example of immutable class


         }

     }

