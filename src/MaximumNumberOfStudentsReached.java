//run-time exceptions == unchecked exceptions
public class MaximumNumberOfStudentsReached extends RuntimeException{
    public MaximumNumberOfStudentsReached(String message) {
        super(message);
    }
}
