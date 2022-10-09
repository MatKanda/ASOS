public class Reservation {

    private int numberOfRooms;
    private int numberOfBathrooms;
    private boolean pool;
    private boolean wellness;
    private boolean privateChef;
    public boolean playGround;
    public String houseType;

    public String printPriceInfo() {
        if (houseType.equals("Apartment")) {
            double pool = isPool() ? 0.65 * 50 : 0;
            double price = numberOfBathrooms + numberOfRooms;
            return "Your house type is Apartment and price is " + price;
        } else if (houseType.equals("Cottage")) {
            double pool = isPool() ? 0.65 * 50 : 0;
            double price = numberOfBathrooms + numberOfRooms * 2.8;
            return "Your house type is Cottage and price is " + price;
        } else {
            double pool = isPool() ? 0.65 * 50 : 0;
            double price = numberOfBathrooms + numberOfRooms * 3.9;
            return "Your house type is House and price is " + price;
        }
    }

    public boolean isPool() {
        return pool;
    }
}
