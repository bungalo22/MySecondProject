package practice;

class Students {
    private int number;
    private String firstName;
    private String lastName;
    private int yearEducation;
    private int assessmentByMath;
    private int assessmentByEconomy;
    private int assessmentByEnglish;

    public Students(int number, String firstName, String lastName, int yearEducation, int assessmentByMath, int assessmentByEconomy, int assessmentByEnglish) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearEducation = yearEducation;
        this.assessmentByMath = assessmentByMath;
        this.assessmentByEconomy = assessmentByEconomy;
        this.assessmentByEnglish = assessmentByEnglish;
    }
    Students(int number, String firstName, String lastName) {
        this(number,firstName,lastName, 0, 0,0,0);
    }
    Students(int number) {
        this(number,null,null, 0, 0,0,0);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearEducation() {
        return yearEducation;
    }

    public void setYearEducation(int yearEducation) {
        this.yearEducation = yearEducation;
    }

    public int getAssessmentByMath() {
        return assessmentByMath;
    }

    public void setAssessmentByMath(int assessmentByMath) {
        this.assessmentByMath = assessmentByMath;
    }

    public int getAssessmentByEconomy() {
        return assessmentByEconomy;
    }

    public void setAssessmentByEconomy(int assessmentByEconomy) {
        this.assessmentByEconomy = assessmentByEconomy;
    }

    public int getAssessmentByEnglish() {
        return assessmentByEnglish;
    }

    public void setAssessmentByEnglish(int assessmentByEnglish) {
        this.assessmentByEnglish = assessmentByEnglish;
    }
}
 class Student1{
     public static void main(String[] args) {
         Students students = new Students(6);
         System.out.println(students.getNumber());
     }


}
