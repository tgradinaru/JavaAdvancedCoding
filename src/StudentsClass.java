import java.util.List;

public class StudentsClass {
    private Trainer trainer;
    private List<Student> studentList;

    public StudentsClass(Trainer trainer, List<Student> studentList) {
        this.trainer = trainer;
        this.studentList = studentList;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
