package day20;

import java.util.ArrayList;
import java.util.EnumSet;

public class WeekDay {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Sunday");
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        arrayList.add("Thursday");
        arrayList.add("Friday");
        arrayList.add("Saturday");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        EnumSet<WeekDays> weekDaysEnum= EnumSet.allOf(WeekDays.class);
        System.out.println(weekDaysEnum);
        System.out.println(EnumSet.range(WeekDays.MONDAY,WeekDays.FRIDAY));
        System.out.println(WeekDays.MONDAY);
    }
}
