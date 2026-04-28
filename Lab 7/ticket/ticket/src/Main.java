public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Transformer");
        Movie m2 = new Movie("Avengers");

        m1.addRating(5);
        m1.addRating(4);
        m1.addRating(7);
        m1.addRating(3);

        m2.addRating(2);
        m2.addRating(5);
        m2.addRating(0);

        System.out.println("Transformer avg: " + m1.getAverageRating());
        System.out.println("Transformer highest: " + m1.getHighestRating());

        System.out.println("Avengers avg: " + m2.getAverageRating());
        System.out.println("Avengers highest: " + m2.getHighestRating());
    }
}
