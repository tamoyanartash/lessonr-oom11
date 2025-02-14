package room;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        Student[] students = new Student[5];
        int indexoffstudent = 0;
        while (isActive) {

            System.out.println("------menu------");
            System.out.println(" 1.Create Student");
            System.out.println(" 2.Max Student");
            System.out.println(" 3.sortFemales");
            System.out.println(" 4.Print Grils");
            System.out.println(" 5.Exit");
            int number = scanner.nextInt();


            switch (number) {
                case 1:
                    if (indexoffstudent >= students.length) {
                        System.out.println("They array is filled");
                        break;
                    }
                    students[indexoffstudent] = service.creteStudent();
                    indexoffstudent++;
                    break;


                case 2:
                    if (indexoffstudent < 2) {
                        System.out.println("The list still has no to students");
                        System.out.println("Please crate students");
                        break;
                    }
                    service.maxStudent(students[0], students[1], students[3]);
                    break;

                case 3:
                    if (indexoffstudent == 0) {
                        System.out.println("No students in the list");
                        break;
                    }
                    Student[] filledArray = new Student[indexoffstudent];
                    for (int i = 0; i < indexoffstudent; i++) {
                        filledArray[i] = students[i];
                    }
                    for (Student x : service.sortFemales(filledArray)) {
                        x.printinfo();
                    }
                    break;
                case 4:
                    if (indexoffstudent == 0) {
                        System.out.println("No Girls");
                        break;
                    }
                    Student[] girlsAray = new Student[indexoffstudent];
                    for (int i = 0; i < indexoffstudent; i++) {
                        girlsAray[i] = students[i];
                    }
                 for ()
                    }
                    break;

                case 5:
                    isActive = false;
                    break;
                default:
                    System.out.println("This number is not in menu");


            }


        }


    }

}

