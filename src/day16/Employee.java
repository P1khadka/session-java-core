package day16;

public class Employee extends Person {
    Employee(String name, int age, double salary){
         super(name, age, salary);
    }

    @Override
    public String getDescription() {
        return "Employee description";
    }
}
