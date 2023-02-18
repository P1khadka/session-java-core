package day20;

import java.util.ArrayList;
import java.util.EnumSet;

public class EnumExample {
    public static void main(String[] args) {

        EnumSet<WeekDays> weekDays= EnumSet.allOf(WeekDays.class);
        System.out.println(weekDays);
    }
}
