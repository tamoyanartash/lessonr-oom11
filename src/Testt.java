public class Testt {
    public static void main(String[] args) {
        StudentService student = new StudentService();
        Student s1 = student.creteStudent("Artash", "Tamoyan", 2004, 47.3, 'M', false);
        Student s2 = student.creteStudent("Gayane", "Azaryan", 2014, 77.8, 'F', true);
        Student s3 = student.creteStudent("Petros", "Poxosyan", 1994, 17.5, 'M', true);
        Student s4 = student.creteStudent("Ani", "Simonyan", 2007, 97.3, 'F', false);

        Student[] array = {s1, s2, s3, s4};


//student.maxStudent(s1,s2,s3,s4);
//student.printGrls(array);
        //student.maxGrls(array);
//Student[] students = student.sortByMark(array);
//for (Student x: students){
   //x.printinfo();
}


    }


