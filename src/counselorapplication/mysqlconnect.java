package counselorapplication;

import java.sql.*;
import javax.swing.*;

public class mysqlconnect {
  Connection conn = null;
  public static Connection ConnectDb() throws ClassNotFoundException {
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/counselorapp","root","project2012");
          JOptionPane.showMessageDialog(null, "Connection Established");
          return conn;
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
  }
}
