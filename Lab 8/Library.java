import java.util.ArrayList;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    Book findByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        System.out.println("Not found");
        return null;
    }

    void listAvailable() {
        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println(b.getTitle());
            }
        }
    }
}
