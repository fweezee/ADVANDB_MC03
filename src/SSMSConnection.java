import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SSMSConnection {

    String userName;
    String password;
    String url;

    public SSMSConnection(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        url = "jdbc:sqlserver://25.57.197.92;instance=SQLEXPRESS;databaseName=mydatabase;integratedSecurity=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url, userName, password);
        return conn;
    }









}
