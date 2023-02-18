package day19;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList();
        arrayList.add(20); // autoboxing
        arrayList.add(30);
        arrayList.add(40);
         int a=arrayList.get(2);

         String b="2";
         int c=Integer.valueOf(b);
        System.out.println(c);
        String e= String.valueOf(c);
        System.out.println(e);

    }
}
