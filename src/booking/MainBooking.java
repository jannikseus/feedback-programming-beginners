package booking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Jannik Seus
 */
public class MainBooking {

    public static void main(String[] args) {
        new Booking(
                new BookingId("1"),
                LocalDateTime.now(),
                LocalDateTime.now().plus(2, ChronoUnit.HALF_DAYS),
                new CustomerId("2210"),
                new CustomerName("CustomerName"),
                new EmailAddress("name@domain.com"),
                BookingType.VACATION,
                DiscountType.NONE,
                new DiscountValue(20),
                TaxType.NONE,
                new TaxValue(25));
    }

}
