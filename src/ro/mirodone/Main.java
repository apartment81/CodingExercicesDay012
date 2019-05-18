package ro.mirodone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*        Student student1 = new Student();
        student1.enrollCourse();
        student1.payTuition();
        System.out.println(student1.showInfo());*/

        System.out.print("Enter the number of new students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();


        // create an array to add students
        Student[] students = new Student[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enrollCourse();
            students[i].payTuition();
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].showInfo());
        }


    }
}
