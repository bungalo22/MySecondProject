package practice;

public class PrintLn {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.number = 1;
        student1.firstName = "Danil";
        student1.lastName = "Saprikin";
        student1.yearEducation = 2023;
        student1.assessmentByMath = 4;
        student1.assessmentByEconomy = 4;
        student1.assessmentByEnglish = 3;


        Student student2 = new Student(2,"Kristina", "Evtushenko", 2008);
        student2.assessmentByMath = 4;
        student2.assessmentByEconomy = 5;
        student2.assessmentByEnglish = 4;


        Student student3 = new Student(3, "Vasiya", "Petrov", 2015);
        student3.assessmentByMath = 2;
        student3.assessmentByEconomy = 3;
        student3.assessmentByEnglish = 4;


        StudentTest studentTest = new StudentTest();
        studentTest.sredArif(student1);
        studentTest.sredArif(student2);
        studentTest.sredArif(student3);


    }
}

class Student {
    int number;
    String firstName;
    String lastName;
    int yearEducation;
    int assessmentByMath;
    int assessmentByEconomy;
    int assessmentByEnglish;

    public Student(int number, String firstName, String lastName, int yearEducation, int assessmentByMath, int assessmentByEconomy, int assessmentByEnglish) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearEducation = yearEducation;
        this.assessmentByMath = assessmentByMath;
        this.assessmentByEconomy = assessmentByEconomy;
        this.assessmentByEnglish = assessmentByEnglish;
    }

    public Student(int number, String firstName, String lastName, int yearEducation) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearEducation = yearEducation;
    }

    public Student() {
    }
}

class StudentTest {
    int sredArif(Student st) {
        int srednyaOtcenka = (st.assessmentByEconomy + st.assessmentByMath + st.assessmentByEnglish) / 3;
        System.out.println("Средняя орифметическая оценка " + st.firstName + " " + st.lastName + ": " + srednyaOtcenka);
        return srednyaOtcenka;
    }
}

