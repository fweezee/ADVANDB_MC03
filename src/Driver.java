import java.sql.*;

public class Driver {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        /*String userName = "root";
        String password = "jgana1997";

        String url = "jdbc:sqlserver://25.57.197.92;instance=SQLEXPRESS;databaseName=mydatabase;integratedSecurity=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url, userName, password);*/

        SSMSConnection db = new SSMSConnection("root", "jgana1997");
        Statement m_Statement = db.getConnection().createStatement();


        //String query = "SELECT * FROM dbo.Country$ where Region like '%Asia%' or Region like '%Aftica%'";

        String query = "SELECT * FROM country";

        ResultSet m_ResultSet = m_Statement.executeQuery(query);
        while (m_ResultSet.next()) {
//            System.out.println(m_ResultSet.getString(1) + ", " + m_ResultSet.getString(2) + ", "
//                    + m_ResultSet.getString(3));

            System.out.println(m_ResultSet.getString(1) + ", " + m_ResultSet.getString(1) + ", "
                    + m_ResultSet.getString(1));
        }
    }
}
