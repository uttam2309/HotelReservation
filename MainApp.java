import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- HOTEL RESERVATION SYSTEM ---");
            System.out.println("1. Add Reservation");
            System.out.println("2. View Reservations");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    AddReservation.add();
                    break;
                case 2:
                    ViewReservations.view();
                    break;
                case 3:
                    System.out.println("Thank you 👋");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
