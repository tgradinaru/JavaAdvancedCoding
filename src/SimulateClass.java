import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class SimulateClass {
    public static void main(String[] args) {
        createStudentsTrainersAndClasses();
//        printStudents();



    }

    private static void createStudentsTrainersAndClasses() {
        Student student01 = new Student("XXXXX", "xxx", LocalDate.of(1980, Month.DECEMBER, 31), false);
        Student student02 = new Student("AAA", "aaa", LocalDate.of(1980, Month.DECEMBER, 31), false);
        Student student03 = new Student("BBB", "bbb", LocalDate.of(1982, Month.DECEMBER, 31), false);
        Student student04 = new Student("CCC", "ccc", LocalDate.of(1985, Month.DECEMBER, 31), false);
        Student student05 = new Student("DDD", "ddd", LocalDate.of(1990, Month.DECEMBER, 31), false);
        Student student06 = new Student("EEE", "eee", LocalDate.of(1981, Month.DECEMBER, 31), false);
        Student student07 = new Student("FFF", "fff", LocalDate.of(1992, Month.DECEMBER, 31), false);
        Student student08 = new Student("GGG", "ggg", LocalDate.of(1995, Month.DECEMBER, 31), false);
        Student student09 = new Student("HHH", "hhh", LocalDate.of(2000, Month.DECEMBER, 31), false);
        Student student10 = new Student("III", "iii", LocalDate.of(2001, Month.DECEMBER, 31), false);
        Student student11 = new Student("JJJ", "jjj", LocalDate.of(1979, Month.DECEMBER, 31), false);
        Student student12 = new Student("KKK", "kkk", LocalDate.of(1989, Month.DECEMBER, 31), false);
        Student student13 = new Student("LLL", "lll", LocalDate.of(1996, Month.DECEMBER, 31), false);
        Student student14 = new Student("MMM", "mmm", LocalDate.of(1994, Month.DECEMBER, 31), false);
        Student student15 = new Student("NNN", "nnn", LocalDate.of(2002, Month.DECEMBER, 31), false);

        List<Student> studentsRo16 = Arrays.asList(student01, student02, student03, student04);
        List<Student> studentsRo17 = Arrays.asList(student06, student07, student08, student09);
        List<Student> studentsRo18 = Arrays.asList(student10, student11, student12);
        List<Student> studentsRo19 = Arrays.asList(student13, student14, student15, student05);


        Trainer trainer01 = new Trainer("XXX", "xxx", LocalDate.of(1980, Month.DECEMBER, 31), true);
        Trainer trainer02 = new Trainer("YYY", "yyy", LocalDate.of(1980, Month.DECEMBER, 31), true);
        Trainer trainer03 = new Trainer("WWW", "www", LocalDate.of(1980, Month.DECEMBER, 31), true);

        StudentsClass ro16 = new StudentsClass(trainer01, studentsRo16);
        StudentsClass ro17 = new StudentsClass(trainer02, studentsRo17);
        StudentsClass ro18 = new StudentsClass(trainer03, studentsRo18);
        StudentsClass ro19 = new StudentsClass(null, studentsRo19);

        ro19.setTrainer(trainer03);
    }
}
