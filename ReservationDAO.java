import java.sql.*;

public class ReservationDAO {

    public boolean addReservation(String name, int room, String in, String out) {
        String sql = "INSERT INTO reservations(guest_name, room_number, check_in, check_out) VALUES (?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, room);
            ps.setString(3, in);
            ps.setString(4, out);

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Reservation failed: " + e.getMessage());
            return false;
        }
    }

    public void viewReservations() {
        String sql = "SELECT * FROM reservations";

        try (Connection con = DBUtil.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- Reservation List ---");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("guest_name") + " | Room " +
                    rs.getInt("room_number") + " | " +
                    rs.getString("check_in") + " to " +
                    rs.getString("check_out")
                );
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
