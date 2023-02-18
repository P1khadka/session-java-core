package day27;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        ArrayDeque<String> names= new ArrayDeque<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Prakash");
        System.out.println(names);

        String removeData= names.remove();
        System.out.println(removeData);
        System.out.println(names);
        names.removeLast();
        System.out.println(names);
        names.peek();
        System.out.println(names);

        PriorityQueue<String> priorityNames = new PriorityQueue<>();
        priorityNames.add("Prakash");
        priorityNames.add("Archu");
        priorityNames.add("Karma");
        priorityNames.add("Tanka");
        System.out.println(priorityNames);
        System.out.println(priorityNames.remove());
        System.out.println(priorityNames.remove());
        System.out.println(priorityNames.remove());
        System.out.println(priorityNames.remove());

        HashMap info = new HashMap();
        info.put("name", "Prakash");
        info.put("Age", 30);
        info.put("Age", 31);
        info.put("Email", "bestkhadka@gmail.com");
        System.out.println(info);
        System.out.println(info.get("name"));
        Set keySet= info.keySet();
        System.out.println(keySet);
        System.out.println(info.values());

    }
}
