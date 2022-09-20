package booking;

public class SingleRoom extends Room {

    public SingleRoom(double roomSize, boolean isAvailable) {
        super(roomSize, isAvailable, 1);
    }

    @Override
    public boolean isAvailable() {
        return super.isAvailable;
    }

    @Override
    public double evalSizePerPerson() {
        return super.roomSize;
    }
}
