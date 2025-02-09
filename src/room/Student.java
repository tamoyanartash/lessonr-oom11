package room;

public class Student {

    String name;
    String surname;
    int year;
    double mark;
    char gender;
    boolean isPHD;


    public void printinfo() {
        System.out.println("Name:" + name);
        System.out.println("Surname:" + surname);
        System.out.println("Year:" + year);
        System.out.println("Mark:" + mark);
        System.out.println("Gender:" + gender);
        System.out.println("IsPHD:" + isPHD);
        System.out.println("-------------------");
    }

}