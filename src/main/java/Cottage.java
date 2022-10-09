public class Cottage extends HouseType{

    public boolean playGround;

    @Override
    public String printPriceInfo(){
        double pool = hasPool() ? 0.65 * 50 : 0;
        double price = getNumberOfBathrooms() + getNumberOfRooms() * 2.8;
        return "Your house type is Cottage and price is " + price;
    }

    public Cottage(int numberOfRooms, int numberOfBathrooms, boolean pool, boolean playGround) {
        super(numberOfRooms, numberOfBathrooms, pool);
        this.playGround = playGround;
    }

    public boolean hasPlayGround() {
        return this.playGround;
    }
}
