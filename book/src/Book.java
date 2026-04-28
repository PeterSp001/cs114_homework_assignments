public class Book {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;

    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = 0;
    }

    public void readPages(int pages) {
        currentPage += pages;
        if (currentPage > totalPages) {
            currentPage = totalPages;
        }
        System.out.println("Now on page " + currentPage);
    }

    public double getProgress() {
        return (currentPage * 100.0) / totalPages;
    }

    public boolean isFinished() {
        return currentPage == totalPages;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getTotalPages() { return totalPages; }
    public int getCurrentPage() { return currentPage; }

    public String toString() {
        return title + " by " + author + " (" + currentPage + "/" + totalPages + ")";
    }
}
