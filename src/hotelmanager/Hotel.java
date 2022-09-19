package hotelmanager;

import java.util.Scanner;

/**
 * @author Jannik Seus
 */
class Hotel {

    static Holder hotel_ob = new Holder();
    static Scanner sc = new Scanner(System.in);

    static void customerDetails(int i, int rn) {
        String name, contact, gender;
        String name2 = null, contact2 = null;
        String gender2 = "";
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("Enter contact number: ");
        contact = sc.next();
        System.out.print("Enter gender: ");
        gender = sc.next();
        if (i < 3) {
            System.out.print("Enter second customer name: ");
            name2 = sc.next();
            System.out.print("Enter contact number: ");
            contact2 = sc.next();
            System.out.print("Enter gender: ");
            gender2 = sc.next();
        }

        switch (i) {
            case 1 -> hotel_ob.luxuryDoubleRoom[rn] = new DoubleRoom(name, contact, gender, name2, contact2, gender2);
            case 2 -> hotel_ob.deluxeDoubleRoom[rn] = new DoubleRoom(name, contact, gender, name2, contact2, gender2);
            case 3 -> hotel_ob.luxurySingleRoom[rn] = new SingleRoom(name, contact, gender);
            case 4 -> hotel_ob.deluxeSingleRoom[rn] = new SingleRoom(name, contact, gender);
            default -> System.out.println("Wrong option");
        }
    }

    static void bookRoom(int roomNumber) {
        int j;
        int rn;
        System.out.println("\nChoose room number from : ");
        switch (roomNumber) {
            case 1 -> {
                for (j = 0; j < hotel_ob.luxuryDoubleRoom.length; j++) {
                    if (hotel_ob.luxuryDoubleRoom[j] == null) {
                        System.out.print(j + 1 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn--;
                    if (hotel_ob.luxuryDoubleRoom[rn] != null)
                        throw new NotAvailable();
                    customerDetails(roomNumber, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
            }
            case 2 -> {
                for (j = 0; j < hotel_ob.deluxeDoubleRoom.length; j++) {
                    if (hotel_ob.deluxeDoubleRoom[j] == null) {
                        System.out.print(j + 11 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 11;
                    if (hotel_ob.deluxeDoubleRoom[rn] != null)
                        throw new NotAvailable();
                    customerDetails(roomNumber, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
            }
            case 3 -> {
                for (j = 0; j < hotel_ob.luxurySingleRoom.length; j++) {
                    if (hotel_ob.luxurySingleRoom[j] == null) {
                        System.out.print(j + 31 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 31;
                    if (hotel_ob.luxurySingleRoom[rn] != null)
                        throw new NotAvailable();
                    customerDetails(roomNumber, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
            }
            case 4 -> {
                for (j = 0; j < hotel_ob.deluxeSingleRoom.length; j++) {
                    if (hotel_ob.deluxeSingleRoom[j] == null) {
                        System.out.print(j + 41 + ",");
                    }
                }
                System.out.print("\nEnter room number: ");
                try {
                    rn = sc.nextInt();
                    rn = rn - 41;
                    if (hotel_ob.deluxeSingleRoom[rn] != null)
                        throw new NotAvailable();
                    customerDetails(roomNumber, rn);
                } catch (Exception e) {
                    System.out.println("Invalid Option");
                    return;
                }
            }
            default -> System.out.println("Enter valid option");
        }
        System.out.println("Room Booked");
    }

    static void features(int i) {
        switch (i) {
            case 1 -> System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
            case 2 -> System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ");
            case 3 -> System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ");
            case 4 -> System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
            default -> System.out.println("Enter valid option");
        }
    }

    static void availability(int i) {
        int j, count = 0;
        switch (i) {
            case 1:
                for (j = 0; j < 10; j++) {
                    if (hotel_ob.luxuryDoubleRoom[j] == null)
                        count++;
                }
                break;
            case 2:
                for (j = 0; j < hotel_ob.deluxeDoubleRoom.length; j++) {
                    if (hotel_ob.deluxeDoubleRoom[j] == null)
                        count++;
                }
                break;
            case 3:
                for (j = 0; j < hotel_ob.luxurySingleRoom.length; j++) {
                    if (hotel_ob.luxurySingleRoom[j] == null)
                        count++;
                }
                break;
            case 4:
                for (j = 0; j < hotel_ob.deluxeSingleRoom.length; j++) {
                    if (hotel_ob.deluxeSingleRoom[j] == null)
                        count++;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Number of rooms available : " + count);
    }

    static void bill(int rn, int rtype) {
        double amount = 0;
        String[] list = {"Sandwich", "Pasta", "Noodles", "Coke"};
        System.out.println("\n*******");
        System.out.println(" Bill:-");
        System.out.println("*******");

        switch (rtype) {
            case 1 -> {
                amount += 4000;
                System.out.println("\nRoom Charge - " + 4000);
                System.out.println("\n===============");
                System.out.println("hm.Food Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.luxuryDoubleRoom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.itemno - 1], obb.quantity, obb.price);
                }
            }
            case 2 -> {
                amount += 3000;
                System.out.println("Room Charge - " + 3000);
                System.out.println("\nhm.Food Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.deluxeDoubleRoom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.itemno - 1], obb.quantity, obb.price);
                }
            }
            case 3 -> {
                amount += 2200;
                System.out.println("Room Charge - " + 2200);
                System.out.println("\nhm.Food Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.luxurySingleRoom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.itemno - 1], obb.quantity, obb.price);
                }
            }
            case 4 -> {
                amount += 1200;
                System.out.println("Room Charge - " + 1200);
                System.out.println("\nhm.Food Charges:- ");
                System.out.println("===============");
                System.out.println("Item   Quantity    Price");
                System.out.println("-------------------------");
                for (Food obb : hotel_ob.deluxeSingleRoom[rn].food) {
                    amount += obb.price;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.itemno - 1], obb.quantity, obb.price);
                }
            }
            default -> System.out.println("Not valid");
        }
        System.out.println("\nTotal Amount- " + amount);
    }

    static void deallocate(int rn, int rtype) {
        int j;
        char w;
        switch (rtype) {
            case 1 -> {
                if (hotel_ob.luxuryDoubleRoom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.luxuryDoubleRoom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println("Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.luxuryDoubleRoom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            }
            case 2 -> {
                if (hotel_ob.deluxeDoubleRoom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.deluxeDoubleRoom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ?(y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.deluxeDoubleRoom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            }
            case 3 -> {
                if (hotel_ob.luxurySingleRoom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.luxurySingleRoom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.luxurySingleRoom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            }
            case 4 -> {
                if (hotel_ob.deluxeSingleRoom[rn] != null)
                    System.out.println("Room used by " + hotel_ob.deluxeSingleRoom[rn].name);
                else {
                    System.out.println("Empty Already");
                    return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w = sc.next().charAt(0);
                if (w == 'y' || w == 'Y') {
                    bill(rn, rtype);
                    hotel_ob.deluxeSingleRoom[rn] = null;
                    System.out.println("Deallocated succesfully");
                }
            }
            default -> System.out.println("\nEnter valid option : ");
        }
    }

    static void order(int rn, int rtype) {
        int i, q;
        char wish;
        try {
            System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n");
            do {
                i = sc.nextInt();
                System.out.print("Quantity- ");
                q = sc.nextInt();

                switch (rtype) {
                    case 1:
                        hotel_ob.luxuryDoubleRoom[rn].food.add(new Food(i, q));
                        break;
                    case 2:
                        hotel_ob.deluxeDoubleRoom[rn].food.add(new Food(i, q));
                        break;
                    case 3:
                        hotel_ob.luxurySingleRoom[rn].food.add(new Food(i, q));
                        break;
                    case 4:
                        hotel_ob.deluxeSingleRoom[rn].food.add(new Food(i, q));
                        break;
                }
                System.out.println("Do you want to order anything else ? (y/n)");
                wish = sc.next().charAt(0);
            } while (wish == 'y' || wish == 'Y');
        } catch (NullPointerException e) {
            System.out.println("\nRoom not booked");
        } catch (Exception e) {
            System.out.println("Cannot be done");
        }
    }
}
