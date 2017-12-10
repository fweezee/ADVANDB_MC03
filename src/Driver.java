import java.sql.*;

public class Driver {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        String userName = "root";
        String password = "jgana1997";

        String url = "jdbc:sqlserver://localhost:1433;instance=SQLEXPRESS;databaseName=mydatabase;integratedSecurity=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url, userName, password);

        Statement m_Statement = conn.createStatement();
        String query = "SELECT * FROM dbo.Country$ where CountryName = 'Andorra'";

        ResultSet m_ResultSet = m_Statement.executeQuery(query);

        while (m_ResultSet.next()) {
            System.out.println(m_ResultSet.getString(1) + ", " + m_ResultSet.getString(2) + ", "
                    + m_ResultSet.getString(3));
        }
    }
}
