public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int apartmentPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.apartmentPrice = pricePerSquareMeter * squareMeters;
    }
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters> otherApartment.squareMeters){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment otherApartment) {
        if (this.apartmentPrice >= otherApartment.apartmentPrice){
            return apartmentPrice - otherApartment.apartmentPrice;
        }
        return otherApartment.apartmentPrice - apartmentPrice;
    }
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.apartmentPrice > otherApartment.apartmentPrice) {
            return true;
        }
        return false;
    }


}