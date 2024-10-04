public class Movie {
    private String title;
    private String genre;
    private double pricePerDay;

    public Movie(String title, String genre, double pricePerDay) {
        this.title = title;
        this.genre = genre;
        this.pricePerDay = pricePerDay;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }
}
