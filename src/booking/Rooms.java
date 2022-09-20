package booking;

import java.util.ArrayList;
import java.util.Collection;

public class Rooms extends ArrayList<Room> {

    public Rooms() {
        super();
    }

    public Rooms(int initialCapacity) {
        super(initialCapacity);
    }

    public Rooms(Collection<? extends Room> c) {
        super(c);
    }
}
