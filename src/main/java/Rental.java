public class Rental {
    private Movie movie;
    private Customer customer;
    private int daysRented;

    public Rental(Movie movie, Customer customer, int daysRented) {
        this.movie = movie;
        this.customer = customer;
        this.daysRented = daysRented;
    }

    public double calculateRentalCost() {
        return daysRented * movie.getPricePerDay();
    }

    public String rentalDetails() {
        return customer.getName() + " rented " + movie.getTitle() + " for " + daysRented + " days.";
    }
}