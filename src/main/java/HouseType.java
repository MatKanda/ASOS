public abstract class HouseType {

    private int numberOfRooms;
    private int numberOfBathrooms;
    private boolean pool;

    public HouseType(int numberOfRooms, int numberOfBathrooms, boolean pool) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.pool = pool;
    }

    public HouseType(int numberOfBathrooms){
        this.numberOfBathrooms = numberOfBathrooms;
    }

    /*
    public int bathroomCost() {
        if (getNumberOfBathrooms() == 0) {
            int a = 14;int b = 12;
            someMagicHere();
            somethingDoingHere();
            return getNumberOfBathrooms() * 12 + 4 + a - b;
        } else if (getNumberOfBathrooms() == 1) {
            somethingDoingThere();
            someMagicThere();
            int c = 2646;int a = 48;
            return getNumberOfBathrooms() * 12 + 4 * c / a;
        } else if (getNumberOfBathrooms() == 2) {
            somethingDoingHereAndThere();
            someMagicHereAndThere();
            int p = 1;int s = 16;
            return getNumberOfBathrooms() * 12 + 4 + p / s;
        } else if (getNumberOfBathrooms() == 3) {
            return getNumberOfBathrooms() * 12 + 4;
        }
        return 65;
    }*/

    public String printPriceInfo(){
        return null;
    }

    public boolean hasPool() {
        return this.pool;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

}
