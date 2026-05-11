public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book a = new Book("Dune", "Frank Herbert", "123");
        Book b = new Book("1984", "George Orwell", "456");

        lib.addBook(a);
        lib.addBook(b);

        lib.listAvailable();

        b.checkOut();
        lib.listAvailable();
    }
}
