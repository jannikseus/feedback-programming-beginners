package hotelmanager;

import java.io.Serializable;

/**
 * @author Jannik Seus
 */
class Holder implements Serializable {

    DoubleRoom[] luxuryDoubleRoom = new DoubleRoom[10]; //Luxury
    DoubleRoom[] deluxeDoubleRoom = new DoubleRoom[20]; //Deluxe
    SingleRoom[] luxurySingleRoom = new SingleRoom[10]; //Luxury
    SingleRoom[] deluxeSingleRoom = new SingleRoom[20]; //Deluxe
}
