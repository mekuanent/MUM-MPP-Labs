package prob2A;

public class GradeReport{
    public String grade;
    public Student gradedStudent;

    public static GradeReport createGradeReport(Student student,String gradeValue){
        if(student == null){
            throw new NullPointerException("Student Must be set for GradeReport to be instanciated");
        }
        GradeReport grade = new GradeReport();
        grade.grade = gradeValue;
        grade.gradedStudent = student;
        return grade;
    }
}
