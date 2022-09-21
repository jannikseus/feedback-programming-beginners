## Feedback 2
### Documentation: 
_"The command's output will be a list of class names (prefixed by the package they are defined in), followed by the corresponding metrics for that class: WMC, DIT, NOC, CBO, RFC, LCOM, Ca, Ce, NPM, LCOM3, LOC, DAM, MOA, MFA, CAM, IC, CBM and AMC . In lines where at the begining is "~" is the value of CC. CC is counted for all methods in given class. "_ 

```
WMC: Weighted methods per class (NOM: Number of Methods in the QMOOD metric suite)
DIT: Depth of Inheritance Tree
NOC: Number of Children
CBO: Coupling between object classes
RFC: Response for a Class
LCOM: Lack of cohesion in methods
Ca: Afferent coupling (not a C&K metric)
Ce: Efferent coupling (not a C&K metric)
NPM: Number of Public Methods for a class (not a C&K metric; CIS: Class Interface Size in the QMOOD metric suite)
LCOM3: Lack of cohesion in methods Henderson-Sellers version
LCO: Lines of Code (not a C&K metric)
DAM: Data Access Metric (QMOOD metric suite)
MOA: Measure of Aggregation (QMOOD metric suite)
MFA: Measure of Functional Abstraction (QMOOD metric suite)
CAM: Cohesion Among Methods of Class (QMOOD metric suite)
IC: Inheritance Coupling (quality oriented extension to C&ampK metric suite)
CBM: Coupling Between Methods (quality oriented extension to C&ampK metric suite)
AMC: Average Method Complexity (quality oriented extension to C&ampK metric suite)
CC: McCabe's Cyclomatic Complexity
```
### Output
Booking 7 1 0 12 16 0 0 12 2 0,6389 147 0,0000 0 0,0000 0,2262 0 0 18,2857
~ public void <init>(BookingId id, java.time.LocalDateTime startDate, java.time.LocalDateTime endDate, CustomerId customerId, CustomerName customerName, EmailAddress customerEmail, BookingType bookingType, DiscountType discountType, DiscountValue discountValue, TaxType taxType, TaxValue taxValue, Rooms bookedRooms): 1
~ void printBookingData(): 1
~ void printData(): 1
~ void printCustomerData(): 1
~ void printBillingData(): 1
~ public BookingStatus statusFor(java.time.LocalDateTime date): 4
~ void printPeriod(): 1

MainBooking 7 1 0 18 34 21 0 18 2 2,0000 334 0,0000 0 0,0000 0,1667 0 0 46,7143
~ private static synthetic boolean lambda$getBookedRooms$0(Room room): 2
~ private static DiscountValue evaluateDiscountValue(DiscountType discountType, java.time.LocalDateTime now): 12
~ private static void createNewBooking(Rooms bookedRooms): 1
~ public static void main(String[] args): 1
~ private static Rooms getInitialRooms(): 1
~ private static Rooms getBookedRooms(Rooms rooms): 1
~ public void <init>(): 1```