package booking;

public class DoublePremiumRoom extends DoubleRoom{

    int tokens;

    public DoublePremiumRoom(double roomSize, boolean isAvailable) {
        super(roomSize, isAvailable);
        this.tokens = 10;
    }

    void retrieveMassage() {
        System.out.println("massage retrieved.");
        tokens--;
    }

}
