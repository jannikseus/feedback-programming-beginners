## Feedback 3
### Documentation:
_"\[Tool 3\] is a static source code analyzer. It finds common programming flaws \[...\]. \[It\] features many built-in checks\[...\]."_

### Output
```
/booking/Booking.java:21:       ExcessiveParameterList:	Avoid long parameter lists.
/booking/BookingId.java:4:      SingularField: Perhaps 'value' could be replaced by a local variable.
/booking/BookingId.java:4:      ImmutableField: Private field 'value' could be made final; it is only initialized in the declaration or constructor.
/booking/MainBooking.java:8:	UseUtilityClass: All methods are static.  Consider using a utility class instead. Alternatively, you could add a private constructor or make the class abstract to silence this warning.
/booking/MainBooking.java:22:	LawOfDemeter: Potential violation of Law of Demeter (object not created locally)
/booking/MainBooking.java:34:	CognitiveComplexity: The method 'evaluateDiscountValue(DiscountType, LocalDateTime)' has a cognitive complexity of 26, current threshold is 15
/booking/MainBooking.java:34:	CyclomaticComplexity: The method 'evaluateDiscountValue(DiscountType, LocalDateTime)' has a cyclomatic complexity of 17.
/booking/MainBooking.java:116:	LawOfDemeter: Potential violation of Law of Demeter (method chain calls)
/booking/MainBooking.java:116:	LawOfDemeter: Potential violation of Law of Demeter (method chain calls)
```