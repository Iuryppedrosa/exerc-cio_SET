package problema6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instructor i1 = new Instructor();

        Course courseA = new Course();
        System.out.print("How many students for course A:");
        int studentsA = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentsA; i++) {
            int studentsCode = scanner.nextInt();
            scanner.nextLine();
            courseA.addStudent(new Student(studentsCode));
        }

        i1.addCourse(courseA);

        Course courseB = new Course();
        System.out.print("How many students for course B:");
        int studentsB = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentsB; i++) {
            int studentsCode = scanner.nextInt();
            scanner.nextLine();
            courseB.addStudent(new Student(studentsCode));
        }

        i1.addCourse(courseB);

        Course courseC = new Course();
        System.out.print("How many students for course C:");
        int studentsC = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentsC; i++) {
            int studentsCode = scanner.nextInt();
            scanner.nextLine();
            courseC.addStudent(new Student(studentsCode));
        }

        i1.addCourse(courseC);

        int totalStudent = i1.getTotalStudents();
        System.out.println(totalStudent);

    }
}
