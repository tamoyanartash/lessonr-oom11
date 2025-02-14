package room;

import java.util.Scanner;

public class StudentService {


    public Student creteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter mark");
        double mark = scanner.nextDouble();
        System.out.println("Enter gender");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter PHD");
        boolean isPHD = scanner.nextBoolean();


        return new Student(name, surname, year, mark, gender, isPHD);


    }

    public void maxStudent(Student s1, Student s2, Student s3) {
        if (s1.getYear() < s2.getYear() && s1.getYear() < s3.getYear()) {
            s1.printinfo();
        } else if (s2.getYear() < s1.getYear() && s2.getYear() < s3.getYear()) {
            s2.printinfo();
        } else {
            s3.printinfo();
        }

    }

    public Student[] sortFemales(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s.getGender() == 'F') {
                count++;
            }
        }
        Student[] result = new Student[count];
        if (count == 0) {
            return result;
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'F') {
                result[i] = students[i];
            }
        }
        return result;
    }

    public void printGirls(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getGender() == 'F') {
                student.printinfo();
            }

        }


    }

}