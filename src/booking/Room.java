package booking;

public abstract class Room {

    double roomSize;
    boolean isAvailable;
    int personCount;


    public Room(double roomSize, boolean isAvailable, int personCount) {
        this.roomSize = roomSize;
        this.isAvailable = isAvailable;
        this.personCount = personCount;
    }

    public abstract boolean isAvailable();

    public abstract double evalSizePerPerson();

    public int getPersonCount() {
        return personCount;
    }

}
