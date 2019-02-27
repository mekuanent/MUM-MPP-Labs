package prob2A;

public class Student {
    public String name;
    public GradeReport grade;
    
    public static void main(String[] args) {
        Student student = new Student("Abebe","A");
        System.out.println("Student: " + student.name + " has scored " + student.grade.grade);
    }
    
    public Student(String name,String grade){
        this.name = name;
        this.grade = GradeReport.createGradeReport(this,grade);
    }
}
