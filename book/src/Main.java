public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George", 300);
        Book b2 = new Book("Hatchet", "Bob", 150);

        b1.readPages(50);
        b1.readPages(100);

        b2.readPages(40);
        b2.readPages(60);

        System.out.println("Progress for b1: " + b1.getProgress() + "%");
        System.out.println("Progress for b2: " + b2.getProgress() + "%");

        System.out.println(b1);
        System.out.println(b2);

        b1.readPages(500);

        System.out.println("Is b1 finished? " + b1.isFinished());
    
    }
}
