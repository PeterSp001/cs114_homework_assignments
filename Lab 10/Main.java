public class Main {
    public static void main(String[] args) {
        Registrar reg = new Registrar();

        Course cs101 = new Course("CS101", "Intro to Programming", 3, 2);
        Course math = new Course("MATH201", "Calculus I", 3, 2);
        Course eng = new Course("ENG102", "Technical Writing", 3, 2);

        reg.addCourse(cs101);
        reg.addCourse(math);
        reg.addCourse(eng);

        Student a = new Student("Alice", "S001", 3.7);
        Student b = new Student("Bob", "S002", 3.4);
        Student c = new Student("Carol", "S003", 3.9);
        Student d = new Student("Dave", "S004", 2.8);

        reg.addStudent(a);
        reg.addStudent(b);
        reg.addStudent(c);
        reg.addStudent(d);

        reg.register(a, cs101);
        reg.register(a, math);
        reg.register(b, cs101);
        reg.register(c, eng);

        a.drop("MATH201");
        math.decrementEnrolled();

        try {
            reg.register(d, cs101);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        reg.printRoster("CS101");
    }
}
