package booking;

import java.time.LocalDateTime;

public final class Booking {

    public final BookingId id;
    public final LocalDateTime startDate;
    public final LocalDateTime endDate;
    public final CustomerId customerId;
    public final CustomerName customerName;
    public final EmailAddress customerEmail;
    public final BookingType bookingType;
    public final DiscountType discountType;
    public final DiscountValue discountValue;
    public final TaxType taxType;
    public final TaxValue taxValue;
    public final Rooms bookedRooms;


    public Booking(
            BookingId id,
            LocalDateTime startDate,
            LocalDateTime endDate,
            CustomerId customerId,
            CustomerName customerName,
            EmailAddress customerEmail,
            BookingType bookingType,
            DiscountType discountType,
            DiscountValue discountValue,
            TaxType taxType,
            TaxValue taxValue,
            Rooms bookedRooms
    ) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.bookingType = bookingType;
        this.discountType = discountType;
        this.discountValue = discountValue;
        this.taxType = taxType;
        this.taxValue = taxValue;
        this.bookedRooms = bookedRooms;
    }

    public BookingStatus statusFor(LocalDateTime date) {
        if (date.isBefore(startDate)) {
            return BookingStatus.NOT_STARTED;
        }

        if (date.isAfter(startDate) && date.isBefore(endDate)) {
            return BookingStatus.ACTIVE;
        }

        return BookingStatus.FINISHED;
    }


    void printData() {
        System.out.println(
                "Booking{" +
                        "id=" + id +
                        ", startDate=" + startDate +
                        ", endDate=" + endDate +
                        ", customerId=" + customerId +
                        ", customerName=" + customerName +
                        ", customerEmail=" + customerEmail +
                        ", bookingType=" + bookingType +
                        ", discountType=" + discountType +
                        ", discountValue=" + discountValue +
                        ", taxType=" + taxType +
                        ", taxValue=" + taxValue +
                        '}');
    }


    void printCustomerData() {
        System.out.println(
                "CustomerData{" +
                        ", customerId=" + customerId +
                        ", customerName=" + customerName +
                        ", customerEmail=" + customerEmail +
                        '}');
    }

    void printBillingData() {
        System.out.println(
                "BillingData{" +
                        ", discountType=" + discountType +
                        ", discountValue=" + discountValue +
                        ", taxType=" + taxType +
                        ", taxValue=" + taxValue +
                        '}');
    }

    void printBookingData() {
        System.out.println(
                "BookingData{" +
                        "id=" + id +
                        ", startDate=" + startDate +
                        ", endDate=" + endDate +
                        ", bookingType=" + bookingType +
                        '}');
    }

    void printPeriod() {
        System.out.println(
                "Period{" +
                        ", startDate=" + startDate +
                        ", endDate=" + endDate +
                        '}');
    }
}
