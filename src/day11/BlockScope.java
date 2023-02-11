package day11;

public class BlockScope {
   // static  int globalVariable=10;
   static int variableForAnotherClass=40;

    public static void main(String[] args) {
        int localVariable=20;
         int globalVariable=10;
        {
            int scoopeVariable=30;
            System.out.println(scoopeVariable); //we cannot use it outside of block
            System.out.println(globalVariable); // we can use it from anywhere
            System.out.println(localVariable);// we can use it
            add(globalVariable);
        }
        System.out.println(localVariable);
    }
    public static void add (int globalVariable){
        System.out.println(globalVariable);
    }

}
