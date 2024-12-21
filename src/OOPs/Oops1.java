package OOPs;

public class Oops1 {
    public static void main(String[] args) {
        System.out.printf("%-12s %-15s %-15s\n", "Roll No", "Student Name", "Student Marks");
        student student1 = new student(12, "swap", 15.5f);//this is syntax for object
        student1.studInfo();
        student student2 = new student(13, "ram", 13.5f);
        student2.studInfo();
        student student3 = new student(14, "bharat", 25.8f);
        student3.studInfo();

    }
}

class student {
    int rollno;
    String name;
    float marks;
    int n = 3;

    student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    void studInfo() {
        
        System.out.printf("%-12d %-15s %-15.2f\n", this.rollno, this.name, this.marks);
    }

}