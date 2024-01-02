package example1;
public class Student extends Person {

    private String studyProgram;
    
    public Student(String name,String idNumber, String studyProgram) {
        super(name, idNumber);
        this.studyProgram = studyProgram;
    }

    public String toString() {
        return super.toString() + ", Study Program: " + studyProgram;
    }
    
    
}
