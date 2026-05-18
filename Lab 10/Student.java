import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private double gpa;
    private List<Course> courses = new ArrayList<>();

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public List<Course> getCourses() { return courses; }

    public void enroll(Course c) {
        for (Course x : courses)
            if (x.getCode().equals(c.getCode()))
                throw new IllegalStateException("Already enrolled");

        if (!c.isAvailable())
            throw new IllegalArgumentException("Course full");

        courses.add(c);
    }

    public void drop(String code) {
        boolean removed = courses.removeIf(c -> c.getCode().equals(code));
        if (!removed) throw new IllegalArgumentException("Not enrolled in " + code);
    }

    public int getTotalCredits() {
        int total = 0;
        for (Course c : courses) total += c.getCredits();
        return total;
    }

    @Override
    public String toString() {
        return name + " (" + id + ") GPA: " + gpa;
    }
}
