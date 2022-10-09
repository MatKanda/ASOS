public class Apartment extends HouseType{

    private boolean wellness;
    private boolean privateChef;

    @Override
    public String printPriceInfo(){
        double pool = hasPool() ? 0.65 * 50 : 0;
        double price = getNumberOfBathrooms() + getNumberOfRooms() * 3.9;
        return "Your house type is Apartment and price is " + price;
    }

    public Apartment(int numberOfRooms, int numberOfBathrooms, boolean pool, boolean wellness, boolean privateChef) {
        super(numberOfRooms, numberOfBathrooms, pool);
        this.wellness = wellness;
        this.privateChef = privateChef;
    }

    public boolean hasPrivateChef() {
        return this.privateChef;
    }

    public boolean hasWellness(){
        return this.wellness;
    }



}
