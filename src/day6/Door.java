package day6;

public class Door {
    private static int count;
    public  static void increasePerson(){
        count++;
    }
    public  static void decreasePerson(){
        count--;
    }
    public static int getNumberPersonInMall(){
        return count;
    }
}
