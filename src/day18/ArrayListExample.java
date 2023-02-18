package day18;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList arrayList= new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(400);
        System.out.println(arrayList);

        ArrayList arrayList1= new ArrayList<>(arrayList);
        Collections.reverse(arrayList1);
        System.out.println(arrayList1);
    }
}
