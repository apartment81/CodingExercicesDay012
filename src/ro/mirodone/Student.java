package ro.mirodone;


import java.util.Scanner;

public class Student {

    private static int id = 1000;
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private int priceOfCourse = 600;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student grade year:\n 1 for 9th grade\n 2 for 10th grade\n 3 for 11th grade\n 4 for 12th grade");
        this.gradeYear = in.nextInt();

        setStudentId();
        System.out.println(firstName + " - " + lastName + " - " + gradeYear + " - " + studentId);


    }
    // Generate teh ID
    private void setStudentId() {
        //student id must be 5 digit and grade level must be first digit

        id++;
        this.studentId = gradeYear + "" + id;

    }

    //Enroll courses

    public void enrollCourse () {


        do{
            System.out.println("Enter course to enroll ( Type Q to quit): ");
            Scanner input = new Scanner(System.in) ;
            String course = input.nextLine();

            if(!course.equalsIgnoreCase("q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance+ priceOfCourse;
            }else {
                break;
            }
        }while (true);

        System.out.println("Enrolled in :" + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);

    }
}
