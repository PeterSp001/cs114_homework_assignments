public class Movie {
    private String title;
    private int[] ratings;
    private int ratingCount;

    public Movie(String title) {
        this.title = title;
        this.ratings = new int[10];
        this.ratingCount = 0;
    }

    public void addRating(int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating: " + rating);
            return;
        }
        if (ratingCount == 10) {
            System.out.println("No more space for ratings.");
            return;
        }

        ratings[ratingCount] = rating;
        ratingCount++;
    }

    public double getAverageRating() {
        if (ratingCount == 0) return 0.0;

        int sum = 0;
        for (int i = 0; i < ratingCount; i++) {
            sum += ratings[i];
        }
        return sum / (double) ratingCount;
    }

    public int getHighestRating() {
        if (ratingCount == 0) return 0;

        int highest = ratings[0];
        for (int i = 1; i < ratingCount; i++) {
            if (ratings[i] > highest) {
                highest = ratings[i];
            }
        }
        return highest;
    }
}
