package hotelmanager;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Jannik Seus
 */
class Writer implements Runnable {

    Holder hotel_ob;

    Writer(Holder hotel_ob) {
        this.hotel_ob = hotel_ob;
    }

    @Override
    public void run() {
        try {
            FileOutputStream fout = new FileOutputStream("backup");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(hotel_ob);
        } catch (Exception e) {
            System.out.println("Error in writing " + e);
        }

    }

}
