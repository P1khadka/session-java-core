package day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Students {
    public static void main(String[] args) {
        ArrayList names= new ArrayList<>();
        names.add("Prakash");
        names.add("Archana");
        names.add("Karma");
        names.add("Sita");
        Collections.sort(names);
        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);

        int  randomNumber=(int) Math.round(Math.random()*100);
        if (randomNumber>70){
            randomNumber=70;
        }
        System.out.println(randomNumber);

        Random random= new Random();

        int randomInt =random.nextInt(70);
        System.out.println(randomInt);

    }
}
