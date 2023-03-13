package Student;

public class Student {
        private int rollNo;
        private String name;
        private static String college ="bajdhbas";
        Student(int r, String n) {
            rollNo = r;
            name = n;
        }
        static void change() {
            college = "asdasdas";
        }
        //method to display values
        void display() {
            System.out.println(rollNo +" "  + name + " "  + college);        }
    }

