package day6;

public class MainMall {
    public static void main(String[] args) {
//        Door door= new Door();
//        door.increasePerson();
//        door.increasePerson();
//        Door door1= new Door();
//        door1.decreasePerson();
//        Door door2= new Door();
//        door2.decreasePerson();
//        Door door3= new Door();
//        door3.increasePerson();
        Door.increasePerson();
        Door.increasePerson();
        Door.increasePerson();
        Door.decreasePerson();
//        System.out.println("Door 1 : "+door.getNumberPersonInMall());
//        System.out.println("Door 2 : "+door1.getNumberPersonInMall());
//        System.out.println("Door 3 : "+door2.getNumberPersonInMall());
//        System.out.println("Door 4 : "+door3.getNumberPersonInMall());
        System.out.println("Door 1 : "+Door.getNumberPersonInMall());
        System.out.println("Door 2 : "+Door.getNumberPersonInMall());
        System.out.println("Door 3 : "+Door.getNumberPersonInMall());
        System.out.println("Door 4 : "+Door.getNumberPersonInMall());
    }
}
