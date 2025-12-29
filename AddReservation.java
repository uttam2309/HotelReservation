import java.util.Scanner;

public class AddReservation {

    public static void add() {
        Scanner sc = new Scanner(System.in);
        ReservationDAO dao = new ReservationDAO();

        System.out.print("Guest Name: ");
        String name = sc.nextLine();

        System.out.print("Room Number: ");
        int room = sc.nextInt();
        sc.nextLine();

        System.out.print("Check-in Date: ");
        String in = sc.nextLine();

        System.out.print("Check-out Date: ");
        String out = sc.nextLine();

        if (dao.addReservation(name, room, in, out)) {
            System.out.println("✅ Reservation Added Successfully");
        } else {
            System.out.println("❌ Failed to Add Reservation");
        }
    }
}
