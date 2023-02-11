package day16;

public class MainApp {
    public static void main(String[] args) {
        Employee ram= new Employee("Ram Khadka", 28,8000);
        Manager taman= new Manager("Taman Neupane", 30, 8000, 1000);
        System.out.println("Employee : "+ram.getName());
        System.out.println(taman.getSalary());
        System.out.println(ram.getDescription());
    }
}
