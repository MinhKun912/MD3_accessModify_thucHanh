package Student;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"MinhSama");
        Student s2 = new Student(112,"Rat la ngu");
        Student s3 = new Student(113,"Rat la daan");
        s1.display();
        s2.display();
        s3.display();
    }
}
