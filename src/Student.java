import java.time.LocalDate;

public class Student extends Person {
    boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge + " }";
    }
}
