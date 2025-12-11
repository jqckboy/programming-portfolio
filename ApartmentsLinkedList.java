
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class ApartmentsLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Apartment> apartments = new LinkedList<>();

        System.out.println("Enter apartment information.");
        System.out.println("Type 'stop' as the street address when finished.\n");

        while (true) {
            System.out.print("Street Address (or 'stop'): ");
            String street = sc.nextLine();
            if (street.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Apartment Number: ");
            String aptNum = sc.nextLine();

            System.out.print("Monthly Rent: ");
            double rent = Double.parseDouble(sc.nextLine());

            System.out.print("Number of Bedrooms: ");
            int bedrooms = Integer.parseInt(sc.nextLine());

            System.out.println();

            apartments.add(new Apartment(street, aptNum, rent, bedrooms));
        }

        // Sort using compareTo()
        Collections.sort(apartments);

        System.out.println("\n---- Apartments Sorted by Rent ----");
        for (Apartment a : apartments) {
            System.out.println(a);
        }
    }
}
