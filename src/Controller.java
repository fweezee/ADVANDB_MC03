import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {

    Connection conn;

    @FXML
    private Button generateButton;

    @FXML
    private javafx.scene.control.TextField queryField;

    public Controller() throws SQLException, ClassNotFoundException {
        SSMSConnection db = new SSMSConnection("root", "jgana1997");
        conn = db.getConnection();
    }

    public void loginButtonClicked() throws SQLException {

        Statement m_Statement = conn.createStatement();
        String query = queryField.getText();
//                "SELECT * FROM dbo.Country$ where CountryName = 'Andorra'";
        ResultSet m_ResultSet = m_Statement.executeQuery(query);

        while (m_ResultSet.next()) {
            System.out.println(m_ResultSet.getString(1) + ", " + m_ResultSet.getString(2) + ", "
                    + m_ResultSet.getString(3));
        }
    }



}
