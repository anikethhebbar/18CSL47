import java.util.LinkedList;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Number of students : ");
        int n = sc.nextInt();

        System.out.println("Enter student details (usn, name, branch, phone)");
        var list = new LinkedList<Student>();
        for (int i = 0; i < n; i++) {
            list.add(new Student(sc.next(), sc.next(), sc.next(), sc.nextLong()));
        }

        System.out.println("Student details");
        for (Student student : list) {
            System.out.println(student.toString());
        }

        sc.close();
    }    
}

class Student {
    String usn, name, branch;
    long phone;

    Student(String usn, String name, String branch, long phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    public String toString() {
        return "[USN:" + usn + ",Name:" + name + ",Branch:" + branch + ",Phone:" + phone + "]";
    }
}