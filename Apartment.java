
public class Apartment implements Comparable<Apartment> {

    private String streetAddress;
    private String apartmentNumber;
    private double monthlyRent;
    private int bedrooms;

    public Apartment(String streetAddress, String apartmentNumber, double monthlyRent, int bedrooms) {
        this.streetAddress = streetAddress;
        this.apartmentNumber = apartmentNumber;
        this.monthlyRent = monthlyRent;
        this.bedrooms = bedrooms;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    @Override
    public int compareTo(Apartment other) {
        return Double.compare(this.monthlyRent, other.monthlyRent);
    }

    @Override
    public String toString() {
        return "Address: " + streetAddress +
               ", Apt: " + apartmentNumber +
               ", Rent: $" + monthlyRent +
               ", Bedrooms: " + bedrooms;
    }
}
