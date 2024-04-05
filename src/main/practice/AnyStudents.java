package practice;

public class AnyStudents {
    public static void main(String[] args) {
        Students student = new Students(1, "Ivan", "Zabrohin", 2023, 5, 3, 3);
        Students student2 = new Students(2, "Daun", "Pisya", 2015, 5, 2, 1);
        Students student3 = new Students(3, "Kolya", "Abramov", 2008, 4, 5, 5);
        int result2 = (student2.getAssessmentByEconomy() + student2.getAssessmentByEnglish() + student2.getAssessmentByMath()) / 3;
        System.out.println(result2);

    }
}
