package day16;

public class Manager extends Person {
    private double bonus;
    private double totalSalary;
    Manager(String name, int age, double salary, double bonus){
        super(name, age, salary);
        this.bonus=bonus;
        totalSalary=salary+bonus;
    }

    @Override
    public double getSalary() {
         double totalSalary=super.getSalary()+bonus;
         return totalSalary;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
