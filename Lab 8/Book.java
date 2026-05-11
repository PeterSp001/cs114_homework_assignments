class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    String getTitle() {
        return title;
    }

    boolean isAvailable() {
        return isAvailable;
    }

    void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned.");
    }
}
