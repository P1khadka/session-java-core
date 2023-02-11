package day16;

public abstract class Person { // we use abstract class on parent class because after use of it
    // we cannot make the object of the parent class.
    String name;
    int age;
    double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    public abstract String getDescription();
}
