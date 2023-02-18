package day18;

 class Student {
    private String name;
    private int rollNumber;
    private double fee;

     public Student(String name, int rollNumber, double fee) {
         this.name = name;
         this.rollNumber = rollNumber;
         this.fee = fee;
     }

     public String getName() {
         return name;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", rollNumber=" + rollNumber +
                 ", fee=" + fee +
                 '}';
     }

     public int getRollNumber() {
         return rollNumber;
     }

     public double getFee() {
         return fee;
     }
 }
