import java.util.ArrayList;
import java.util.List;

public class Registrar {
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public void addCourse(Course c) { courses.add(c); }
    public void addStudent(Student s) { students.add(s); }

    public Course findCourse(String code) {
        for (Course c : courses)
            if (c.getCode().equals(code)) return c;
        return null;
    }

    public void register(Student s, Course c) {
        s.enroll(c);
        c.incrementEnrolled();
    }

    public void printRoster(String code) {
        Course c = findCourse(code);
        if (c == null) return;

        System.out.println("\nRoster for " + c.getCode() + ":");
        System.out.println(c);

        for (Student s : students) {
            for (Course x : s.getCourses()) {
                if (x.getCode().equals(code))
                    System.out.println(" - " + s);
            }
        }
    }
}
