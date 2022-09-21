## Feedback 4
### Documentation:
_"\[Tool 4\] can check many aspects of your source code. It can find class design problems, method design problems."_
_"\[Tool 4\] can check many aspects of your source code. It can find class design problems, method design problems."_

#### ClassFanOutComplexity:
Checks the number of other types a given class/record/interface/enum/annotation relies on. Also, the square of this has been shown to indicate the amount of maintenance required in functional programs (on a file basis) at least.
#### ClassDataAbstractionCoupling
Measures the number of instantiations of other classes within the given class or record. This type of coupling is not caused by inheritance or the object-oriented paradigm. Generally speaking, any data type with other data types as members or local variable that is an instantiation (object) of another class has data abstraction coupling (DAC). The higher the DAC, the more complex the structure of the class.
#### JavaNCSS
Determines complexity of methods, classes and files by counting the Non Commenting Source Statements (NCSS). \[...\]
Roughly said the NCSS metric is calculated by counting the source lines which are not comments, (nearly) equivalent to counting the semicolons and opening curly braces.
### Output
```
[WARN] /booking/Booking.java:5:1: Class Fan-Out Complexity is 12 (max allowed is 2). [ClassFanOutComplexity]

[WARN] /booking/MainBooking.java:8:1: Class Data Abstraction Coupling is 12 (max allowed is 2) classes [Booking, BookingId, CustomerId, CustomerName, DiscountValue, DoublePremiumRoom, DoubleRoom, EmailAddress, Random, Rooms, SingleRoom, TaxValue]. [ClassDataAbstractionCoupling]
[WARN] /booking/MainBooking.java:8:1: Class Fan-Out Complexity is 14 (max allowed is 2). [ClassFanOutComplexity]
[WARN] /booking/MainBooking.java:34:5: NCSS for this method is 50 (max allowed is 40). [JavaNCSS]
```