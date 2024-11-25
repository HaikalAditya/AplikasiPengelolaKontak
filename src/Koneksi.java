import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection mysqlkonek;

    // Metode untuk mendapatkan koneksi ke database
    public static Connection getConnection() throws SQLException {
        if (mysqlkonek == null) {
            try {
                String DB = "jdbc:mysql://localhost:3306/nomor_telpon"; // URL database
                String user = "root"; // Nama pengguna database
                String pass = ""; // Kata sandi database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // Driver untuk MySQL
                mysqlkonek = (Connection) DriverManager.getConnection(DB, user, pass);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
            }
        }
        return mysqlkonek;
    }
    // Metode main untuk pengujian koneksi
    public static void main(String[] args) {
        try {
            getConnection();
        } catch (SQLException e) {

}
    }
}
