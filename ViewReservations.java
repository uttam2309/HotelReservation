public class ViewReservations {

    public static void view() {
        ReservationDAO dao = new ReservationDAO();
        dao.viewReservations();
    }
}
