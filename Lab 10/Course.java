public class Course {
    private String code;
    private String title;
    private int credits;
    private int capacity;
    private int enrolled = 0;

    public Course(String code, String title, int credits, int capacity) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.capacity = capacity;
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    public int getCapacity() { return capacity; }
    public int getEnrolled() { return enrolled; }

    public void setCapacity(int capacity) {
        if (capacity < enrolled)
            throw new IllegalArgumentException("Capacity cannot be less than enrolled.");
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return enrolled < capacity;
    }

    public void incrementEnrolled() {
        if (!isAvailable()) throw new IllegalStateException("Course full");
        enrolled++;
    }

    public void decrementEnrolled() {
        if (enrolled > 0) enrolled--;
    }

    @Override
    public String toString() {
        return code + " - " + title + " (" + credits + " cr) [" +
               enrolled + "/" + capacity + "]";
    }
}
