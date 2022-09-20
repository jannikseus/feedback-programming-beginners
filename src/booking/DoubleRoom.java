package booking;

public class DoubleRoom extends Room{

    public DoubleRoom(double roomSize, boolean isAvailable) {
        super(roomSize, isAvailable, 2);
    }

    @Override
    public boolean isAvailable() {
        return super.isAvailable;
    }

    @Override
    public double evalSizePerPerson() {
        return super.roomSize / super.personCount;
    }
}
