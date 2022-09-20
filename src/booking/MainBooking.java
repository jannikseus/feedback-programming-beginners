package booking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;

public class MainBooking {

    public static void main(String[] args) {
        Rooms rooms = getInitialRooms();
        Rooms bookedRooms = getBookedRooms(rooms);
        createNewBooking(bookedRooms);
    }

    private static void createNewBooking(Rooms bookedRooms) {
        DiscountType discountType = DiscountType.NONE;
        LocalDateTime now = LocalDateTime.now();
        new Booking(
                new BookingId("1"),
                now,
                now.plus(2, ChronoUnit.HALF_DAYS),
                new CustomerId("2210"),
                new CustomerName("CustomerName"),
                new EmailAddress("name@domain.com"),
                BookingType.VACATION,
                discountType,
                evaluateDiscountValue(discountType, now),
                TaxType.NONE,
                new TaxValue(25),
                bookedRooms);
    }

    private static DiscountValue evaluateDiscountValue(DiscountType discountType, LocalDateTime now) {
        int salesPercent = 0;
        switch (discountType) {
            case NONE -> {
                int sales = 0;
                int randomInt = new Random(now.getMinute()).nextInt(10);
                if (randomInt < 5) {
                    if (randomInt == 2) {
                        return new DiscountValue(salesPercent + 20);
                    }
                    return new DiscountValue(salesPercent);
                }
                salesPercent += sales + randomInt;
                return new DiscountValue(salesPercent);
            }
            case CHRISTMAS -> {
                int sales = 50;
                int randomInt = new Random(now.getMinute()).nextInt(11);
                if (randomInt < 5) {
                    if (randomInt == 2) {
                        return new DiscountValue(salesPercent + 42);
                    }
                    return new DiscountValue(salesPercent);
                }
                salesPercent += sales + randomInt;
                return new DiscountValue(salesPercent);
            }
            case EASTER -> {
                int sales = 40;
                int randomInt = new Random(now.getMinute()).nextInt(12);
                if (randomInt < 5) {
                    if (randomInt == 2) {
                        return new DiscountValue(salesPercent + 12);
                    }
                    return new DiscountValue(salesPercent);
                }
                salesPercent += sales + randomInt;
                return new DiscountValue(salesPercent);
            }
            case HALLOWEEN -> {
                int sales = 30;
                int randomInt = new Random(now.getMinute()).nextInt(13);
                if (randomInt < 5) {
                    if (randomInt == 2) {
                        return new DiscountValue(salesPercent + 30);
                    }
                    return new DiscountValue(salesPercent);
                }
                salesPercent += sales + randomInt;
                return new DiscountValue(salesPercent);
            }
            case THANKSGIVING -> {
                int sales = 20;
                int randomInt = new Random(now.getMinute()).nextInt(14);
                if (randomInt < 5) {
                    if (randomInt == 2) {
                        return new DiscountValue(salesPercent + 20);
                    }
                    return new DiscountValue(salesPercent);
                }
                salesPercent += sales + randomInt;
                return new DiscountValue(salesPercent);
            }

            default -> throw new IllegalStateException("Unexpected value: " + discountType);
        }
    }

    private static Rooms getInitialRooms() {
        Rooms rooms = new Rooms(7);
        rooms.addAll(List.of(
                new DoublePremiumRoom(40, true),
                new SingleRoom(10, true),
                new SingleRoom(7, true),
                new SingleRoom(20, false),
                new DoubleRoom(20, true),
                new DoubleRoom(17, false),
                new DoubleRoom(23, true)));
        return rooms;
    }

    private static Rooms getBookedRooms(Rooms rooms) {
        return new Rooms(rooms.stream().filter(room -> !room.isAvailable).toList());
    }

}
