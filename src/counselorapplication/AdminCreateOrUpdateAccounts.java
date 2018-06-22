package counselorapplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Wesley
 */
public class AdminCreateOrUpdateAccounts extends JFrame implements ActionListener {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    JFrame adminFrame;
    JPanel adminPanel;
    JLabel descriptionLine1;
    JLabel descriptionLine2;
    JLabel userNameLabel;
    JLabel passwordLabel;
    JButton createButton;
    JButton updateButton;
    JTextField userNameTextField;
    JPasswordField passwordField;
    
    AdminCreateOrUpdateAccounts() {
        try {
            conn = mysqlconnect.ConnectDb();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminCreateOrUpdateAccounts.class.getName()).log(Level.SEVERE, null, ex);
        }
       URL icon1 = this.getClass().getClassLoader().getResource("login.jpg");
       ImageIcon ic1 = new ImageIcon(icon1);
       setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
       setMinimumSize(new Dimension(425,300));
       setPreferredSize(new Dimension(425,300));
       setTitle("Admin App to Create or Update Login Accounts");
       
       adminPanel = new JPanel();
       adminPanel.setBackground(new Color(240, 255, 255));
       adminPanel.setLayout(null);     
       descriptionLine1 = new JLabel("This Application will Create or Update User");
       descriptionLine2 = new JLabel("Accounts for Court Record and Database Export Login");
       userNameLabel = new JLabel("User Name:");
       passwordLabel = new JLabel("User Password:");
       userNameTextField = new JTextField();
       passwordField = new JPasswordField();
       createButton = new JButton();
       updateButton = new JButton();
       
       descriptionLine1.setFont(new Font("Serif", 0, 16));
       descriptionLine1.setBounds(10, 20, 300, 25);
       adminPanel.add(descriptionLine1);
       
       descriptionLine2.setFont(new Font("Serif", 0 ,16));
       descriptionLine2.setBounds(10,40, 350, 25);
       adminPanel.add(descriptionLine2);
       
       userNameLabel.setFont(new Font("Serif", 0, 16));
       userNameLabel.setBounds(10, 90, 200, 25);
       adminPanel.add(userNameLabel);
       
       userNameTextField.setFont(new Font("Serif",0, 16));
       userNameTextField.setBounds(130, 90, 200, 27);
       adminPanel.add(userNameTextField);
       
       passwordLabel.setFont(new Font("Serif", 0, 16));
       passwordLabel.setBounds(10, 140, 200, 25);
       adminPanel.add(passwordLabel);
       
       passwordField.setFont(new Font("Serif",0, 16));
       passwordField.setBounds(130, 140, 200, 27);       
       adminPanel.add(passwordField);
       
       createButton.setFont(new Font("Serif", 0, 16));
       createButton.setText("Create User Account");       
       createButton.addActionListener(this);
       createButton.setBounds(30, 200, 170, 27);
       adminPanel.add(createButton);
       
       updateButton.setFont(new Font("Serif", 0, 16));
       updateButton.setText("Update User Account");       
       updateButton.addActionListener(this);
       updateButton.setBounds(220, 200, 170, 27);
       adminPanel.add(updateButton);
       
       setIconImage(ic1.getImage());
       setResizable(false);
       getContentPane().add(adminPanel);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == createButton) {
            AdminCreateOrUpdateAccounts.this.createUserActionPerformed(evt);
        }else if (evt.getSource() == updateButton) {
            AdminCreateOrUpdateAccounts.this.updateUserActionPerformed(evt);
        }
    }
    
    private void createUserActionPerformed(ActionEvent evt) {
        HashPassword hashPass = new HashPassword();
        String sql = "insert into counselor_login (UserName,UserPassword) values(?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, userNameTextField.getText());
            pst.setString(2, hashPass.generateHashedPassword(passwordField.getText()));
            pst.execute();
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        String sql2 = "insert into court_login (UserName,UserPassword) values(?, ?);";
        try {
            pst = conn.prepareStatement(sql2);
            pst.setString(1, userNameTextField.getText());
            pst.setString(2, hashPass.generateHashedPassword(passwordField.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "User Account Created");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void updateUserActionPerformed(ActionEvent evt) {
        HashPassword hashPass = new HashPassword();
        String sql = "SELECT UserName FROM counselor_login WHERE UserName = ?;";
        String userName = "";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, userNameTextField.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            userName = rs.getString("UserName");
            }      
        }catch (SQLException e){}
        if(userName.isEmpty()){
            JOptionPane.showMessageDialog(null, "User Account Does Not Exist");
        }else{
            String sql2 = "UPDATE court_login SET UserPassword = ? WHERE UserName = ?;";
            try {
                pst = conn.prepareStatement(sql2); 
                pst.setString(1, hashPass.generateHashedPassword(passwordField.getText()));
                pst.setString(2, userNameTextField.getText());
                pst.execute();
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            String sql3 = "UPDATE counselor_login SET UserPassword = ? WHERE UserName = ?;";
            try {
                pst = conn.prepareStatement(sql3);
                pst.setString(1, hashPass.generateHashedPassword(passwordField.getText()));
                pst.setString(2, userNameTextField.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "User Account Updated");
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
    }
        
    public static void main(String args[]) throws ClassNotFoundException{
        new AdminCreateOrUpdateAccounts().setVisible(true);
    }

}
