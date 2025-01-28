import java.util.Scanner;

public class Testt {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        Student[] students = new Student[5];
        while (isActive) {


            System.out.println("------menu------");
            System.out.println(" 1.Create Student");
            System.out.println(" 2.Max Student");
            System.out.println(" 3.Print Girls");
            System.out.println(" 4.Max Girls");
            System.out.println(" 5.Sort by mark");
            System.out.println(" 6.Exit");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    Student student = service.creteStudent();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            students[i] = student;
                            break;
                        }
                    }
                    break;
                case 2:
                    int count = 0;
                    for (Student x : students) {
                        if (x != null) {
                            count++;

                        }
                    }
                    if (count >= 3) {
                        service.maxStudent(students[0], students[1], students[2]);
                    } else {
                        System.out.println("You can't use this option of the menu, as you don't have 3 students");
                    }
                    break;

                case 3:
                    int count3 = 0;
                    for (int i = 0; i < students.length; i++) {
                        if(students[i]!= null){
                            count3++;
                        }
                    }
                    Student[] notNullArray = new Student[count3];
                    for (int i = 0, j = 0; i < students.length; i++) {
                        if(students[i] != null){
                            notNullArray[j] = students[i];
                            j++;
                        }

                    }
                    service.printGirls(notNullArray);
                    break;
                case 4:
                    service.maxGrls(service.getNotNullsArray(students));
                    break;
                case 5:
                    for (Student x : service.sortByMark(service.getNotNullsArray(students))) {
                        x.printinfo();
                    }
                    break;
                case 6:
                    isActive = false;
                    break;
                default:
                    System.out.println("This number is not in menu");



            }




        }


    }


}


