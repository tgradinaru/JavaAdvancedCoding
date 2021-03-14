import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimulateClass {

    private static Set<Student> students, students1, students2, students3, students4;
    private static Trainer trainer01, trainer02, trainer03;
    private static List<Trainer> trainers;
    private static List<Group> groups;


    public static void main(String[] args){
        createStudentsTrainersAndClasses();
        printStudents();
        printTrainers();
        printGroups();
    }

    private static void printTrainers() {
        System.out.println(trainers);
    }

    private static void printStudents() {
        System.out.println(students);
    }

    private static void printGroups() {
        System.out.println(groups);
    }

    private static void createStudentsTrainersAndClasses(){
        addStudents();
        addTrainers();
        addGroups();
    }

    private static void addGroups(){
        Group group1 = new Group(trainer01, students1);
        Group group2 = new Group(trainer02, students2);
        Group group3 = new Group(trainer03, students3);
        Group group4 = new Group(trainer03, students4);

        groups = Arrays.asList(group1, group2, group3, group4);
    }

    private static void addTrainers() {
        trainer01 = new Trainer("XXX", "xxx", LocalDate.of(1980, Month.DECEMBER, 31), true);
        trainer02 = new Trainer("YYY", "yyy", LocalDate.of(1980, Month.DECEMBER, 31), true);
        trainer03 = new Trainer("WWW", "www", LocalDate.of(1980, Month.DECEMBER, 31), true);

        trainers = Arrays.asList(trainer01, trainer02, trainer03);
    }


    private static void addStudents() {
        Student student01 = new Student("XXXXX", "xxx", LocalDate.of(1980, Month.DECEMBER, 31), false);
        Student student02 = new Student("AAA", "aaa", LocalDate.of(1980, Month.DECEMBER, 31), false);
        Student student03 = new Student("BBB", "bbb", LocalDate.of(1982, Month.DECEMBER, 31), true);
        Student student04 = new Student("CCC", "ccc", LocalDate.of(1985, Month.DECEMBER, 31), false);
        Student student05 = new Student("DDD", "ddd", LocalDate.of(1990, Month.DECEMBER, 31), false);
        Student student06 = new Student("EEE", "eee", LocalDate.of(1981, Month.DECEMBER, 31), true);
        Student student07 = new Student("FFF", "fff", LocalDate.of(1992, Month.DECEMBER, 31), false);
        Student student08 = new Student("GGG", "ggg", LocalDate.of(1995, Month.DECEMBER, 31), false);
        Student student09 = new Student("HHH", "hhh", LocalDate.of(2000, Month.DECEMBER, 31), true);
        Student student10 = new Student("III", "iii", LocalDate.of(2001, Month.DECEMBER, 31), false);

        students = new HashSet<>();
        students.add(student01);
        students.add(student02);
        students.add(student03);
        students.add(student04);
        students.add(student05);
        students.add(student06);
        students.add(student07);
        students.add(student08);
        students.add(student09);
        students.add(student10);

        students1 = new HashSet<>();
        students1.add(student01);
        students1.add(student02);
        students1.add(student03);

        students2 = new HashSet<>();
        students2.add(student04);
        students2.add(student05);
        students2.add(student06);

        students3 = new HashSet<>();
        students3.add(student07);
        students3.add(student08);

        students4 = new HashSet<>();
        students4.add(student09);
        students4.add(student10);
    }
}
