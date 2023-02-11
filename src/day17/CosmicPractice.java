package day17;

public class CosmicPractice {
    public static void main(String[] args) {
        Student student = new Student("Prakash", 10,10);
        Student student2 = new Student("Prakash", 10,10);

        boolean isSameObject= student.equals(student2);
        System.out.println(isSameObject);
        System.out.println(student);
        System.out.println(student2);
    }
}
