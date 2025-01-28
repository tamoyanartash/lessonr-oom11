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


        {

        }
    }


    public void printGirls(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getGender() == 'F') {
                student.printinfo();
            }
        }
        {

        }
    }

    public void maxGrls(Student[] students) {
        Student max = null;
        for (int i = 0; i < students.length; i++) {
            if (max == null) {
                if (students[i].getGender() == 'F' && students[i].getYear() < max.getYear()) {
                    max = students[i];
                }
            }
            if (max != null) {
                max.printinfo();
            } else {
                System.out.println("NO GIRLS");
            }
        }
    }

    public Student[] sortByMark(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length-i; j++) {
                if (students[j - 1].getMark() > students[j].getMark()) {
                    Student temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }

            }
        }
        return students;
    }

    public Student[] getNotNullsArray(Student[] students) {
        int count = 0;
        for(Student x : students) {
            if(x != null) {
                count++;
            }
        }
        Student[] notNulls = new Student[count];
        for(int i = 0, j = 0; i < students.length; i++) {
            if(students[i] != null) {
                notNulls[j] = students[i];
                j++;
            }
        }
        return notNulls;
    }


}

