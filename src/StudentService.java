public class StudentService {

    public Student creteStudent(String name, String surname, int year, double mark, char gender, boolean PHD) {


        {
            Student student = new Student();
            student.setName(name);
            student.setSurname(surname);
            student.setYear(year);
            student.setMark(mark);
            student.setGender(gender);
            student.setPHD(PHD);
            return student;

        }

        }
public void maxStudent(Student s1, Student s2, Student s3, Student s4){
if (s1.getYear()< s2.getYear() && s1.getYear() < s3.getYear()&& s1.getYear() < s4.getYear()){
    s1.printinfo();
} else if (s2.getYear()< s1.getYear() && s2.getYear() < s3.getYear() && s2.getYear()<s4.getYear()) {
s2.printinfo();
} else if (s3.getYear()< s1.getYear() && s3.getYear() < s2.getYear() && s3.getYear()<s4.getYear()) {
    s3.printinfo();
}else {
    s4.printinfo();
}
}


public void printGrls(Student[] students){
    for (int i = 0; i < students.length; i++) {
        Student student = students[i];
      if  (student.getGender() == 'F'){
student.printinfo();
        }
    } {

    }
}
public void maxGrls(Student[]students){
        Student max  = null;
    for (int i = 0; i < students.length; i++) {
        if(max == null){
            if(students[i].getGender() == 'F' &&  students[i].getYear() < max.getYear()){
                max = students[i];
            }
        }
if (max != null){
    max.printinfo();
}else {
    System.out.println("NO GIRLS");
}
    }
}

    public Student[] sortByMark(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length; j++) {
                if (students[j - 1].getMark() > students[i].getMark()) {
                    Student temp = students[j - 1];
                    students[j - 1] = students[i];
                    students[i] = temp;
                }

            }
        }
        return students;
    }

    }

