package counselorapplication;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.net.URL;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrontOfApplication extends JFrame implements ActionListener {
  
    String g1, g2, s1, s2, g3, g4, s3, s4; 
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
  
    public JButton cmdbd;
    public JButton cmdcounty;
    public JButton cmdm1;
    public JButton cmdm2;
    public JButton cmdm3;
    public JButton cmddast;
    public JButton cmdmast;
    public JButton cmdexport;
    public JButton bsubmit;
    public JButton bsubmit2;
    public JButton bsubmit3;
    public JFrame frame2;
    public JFrame frame3;
    public JFrame frame4;
    public JSeparator js0;
    public JSeparator js1;
    public JSeparator js2;
    public JSeparator js3;
    public JSeparator js4;
    public JSeparator js5;
    public JLabel lb;
    public JLabel lb2;
    public JLabel lb3;
    public JLabel lb4;
    public JLabel lb5;
    public JLabel lb6;
    public JLabel lb7;
    public JLabel lb8;
    public JLabel lb9;
    public JLabel lb10;
    public JLabel lb11;
    public JLabel lb12;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JMenuBar menubar;
    public JMenu file;
    public JMenu help;
    public JMenuItem exit;
    public JMenuItem helpwindow;
    public JPanel panel;
    public JPanel p;
    public JPanel p1;
    public JPanel p2;
    public JTextField tf1;
    public JPasswordField tf2;
    public JTextField tf3;
    public JPasswordField tf4;
    public JTextField tf5;
    public JTextField tf6;
    
    public FrontOfApplication() {
        
        URL icon = this.getClass().getClassLoader().getResource("database.png");
        ImageIcon ic = new ImageIcon(icon);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database Login");
        setFont(new java.awt.Font("Serif", 0, 20));
        setIconImage(ic.getImage());
        setSize(new Dimension(600, 400));
        setResizable(false);
        
        menubar = new JMenuBar();
        file = new JMenu("   File   \n");
        help = new JMenu("   Help   \n");
        exit = new JMenuItem("\n   Exit     \n");
        helpwindow = new JMenuItem("\n   Help    \n");
        
        setJMenuBar(menubar);
        menubar.setBackground(new Color(245, 245, 245));
        file.setFont(new Font("Serif", 0, 14));
        menubar.add(file);
        help.setFont(new Font("Serif", 0, 14));
        menubar.add(help);
        
        exit.setFont(new Font("Serif", 0, 14));
        exit.setBackground(new Color(245, 245, 245));
        exit.addActionListener(this);
        file.add(exit);
        
        helpwindow.setFont(new Font("Serif", 0, 14));
        helpwindow.setBackground(new Color(245, 245, 245));
        helpwindow.addActionListener(this);
        help.add(helpwindow);
        
        JPanel frontOfAppPanel = new JPanel(new GridBagLayout());
        frontOfAppPanel.setBackground(new Color(240, 255, 255));
        getContentPane().add(frontOfAppPanel, BorderLayout.NORTH);       
        GridBagConstraints c = new GridBagConstraints();
        
        label1 = new JLabel();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(20,50,20,50);
        frontOfAppPanel.add(label1, c);
        cmdcounty = new JButton();
        c.gridx = 0;
        c.gridy = 1;
        frontOfAppPanel.add(cmdcounty, c);
        cmddast = new JButton();
        c.gridx = 0;
        c.gridy = 2;
        frontOfAppPanel.add(cmddast, c);
        cmdmast = new JButton();
        c.gridx = 0;
        c.gridy = 3;
        frontOfAppPanel.add(cmdmast, c);
        cmdexport = new JButton();
        c.gridx = 0;
        c.gridy = 4;
        frontOfAppPanel.add(cmdexport, c);
        c.insets = new Insets(0,50,0,50);
        js0 = new JSeparator(SwingConstants.VERTICAL);
        js0.setPreferredSize(new Dimension(50,50));
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.VERTICAL;
        frontOfAppPanel.add(js0, c);
        js1 = new JSeparator(SwingConstants.VERTICAL);
        js1.setPreferredSize(new Dimension(50,50));
        c.gridx = 2;
        c.gridy = 1;
        c.fill = GridBagConstraints.VERTICAL;
        frontOfAppPanel.add(js1, c);
        js2 = new JSeparator(SwingConstants.VERTICAL);
        js2.setPreferredSize(new Dimension(50,50));
        c.gridx = 2;
        c.gridy = 2;
        c.fill = GridBagConstraints.VERTICAL;
        frontOfAppPanel.add(js2, c);
        js3 = new JSeparator(SwingConstants.VERTICAL);
        js3.setPreferredSize(new Dimension(50,50));
        c.gridx = 2;
        c.gridy = 3;
        c.fill = GridBagConstraints.VERTICAL;
        frontOfAppPanel.add(js3, c);
        js4 = new JSeparator(SwingConstants.VERTICAL);
        js4.setPreferredSize(new Dimension(50,50));
        c.gridx = 2;
        c.gridy = 4;
        c.fill = GridBagConstraints.VERTICAL;
        frontOfAppPanel.add(js4, c);
        js5 = new JSeparator(SwingConstants.VERTICAL);
        js5.setPreferredSize(new Dimension(50,50));
        c.gridx = 2;
        c.gridy = 5;
        c.fill = GridBagConstraints.VERTICAL;
        frontOfAppPanel.add(js5, c);
        c.insets = new Insets(20,40,20,40);
        label5 = new JLabel();
        c.gridx = 4;
        c.gridy = 0;       
        frontOfAppPanel.add(label5, c);
        cmdbd = new JButton();
        c.gridx = 4;
        c.gridy = 1;
        frontOfAppPanel.add(cmdbd, c);
        cmdm1 = new JButton();
        c.gridx = 4;
        c.gridy = 2;
        frontOfAppPanel.add(cmdm1, c);
        cmdm2 = new JButton();
        c.gridx = 4;
        c.gridy = 3;
        frontOfAppPanel.add(cmdm2, c);
        cmdm3 = new JButton();
        c.gridx = 4;
        c.gridy = 4;
        frontOfAppPanel.add(cmdm3, c);
        
        add(frontOfAppPanel);

        
        label1.setFont(new Font("Serif", 0, 18)); 
        label1.setText("County Court");

        label5.setFont(new Font("Serif", 0, 18)); 
        label5.setText("Research and Analysis");

        
        cmdcounty.setFont(new Font("Serif", 0, 16)); 
        cmdcounty.setText("Login to County");
        cmdcounty.addActionListener(this);
        
        cmddast.setFont(new Font("Serif", 0, 16)); 
        cmddast.setText("DAST");
        cmddast.addActionListener(this);
        
        cmdmast.setFont(new Font("Serif", 0, 16)); 
        cmdmast.setText("MAST");
        cmdmast.addActionListener(this);
        
        cmdexport.setFont(new Font("Serif", 0, 16)); 
        cmdexport.setText("Export to Excel");
        cmdexport.addActionListener(this);

        cmdbd.setFont(new Font("Serif", 0, 16)); 
        cmdbd.setText("Basic Demographics");
        cmdbd.addActionListener(this);

        cmdm1.setFont(new Font("Serif", 0, 16)); 
        cmdm1.setText("Module 1");
        cmdm1.addActionListener(this);

        cmdm2.setFont(new Font("Serif", 0, 16)); 
        cmdm2.setText("Module 2");
        cmdm2.addActionListener(this);

        cmdm3.setFont(new Font("Serif", 0, 16)); 
        cmdm3.setText("Module 3");
        cmdm3.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == exit) {
                FrontOfApplication.this.exitActionPerformed(evt);
            }
            else if (evt.getSource() == helpwindow) {
                FrontOfApplication.this.helpwindowActionPerformed(evt);
            }
            else if (evt.getSource() == cmdcounty) {
                try {
                    FrontOfApplication.this.cmdcountyActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FrontOfApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (evt.getSource() == cmddast) {
                FrontOfApplication.this.cmddastActionPerformed(evt);
            }
            else if (evt.getSource() == cmdmast) {
                FrontOfApplication.this.cmdmastActionPerformed(evt);
            }
            else if (evt.getSource() == cmdexport) {
                try {
                    FrontOfApplication.this.cmdexportActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FrontOfApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (evt.getSource() == bsubmit) {
                FrontOfApplication.this.bsubmitActionPerformed(evt);
            }
            else if (evt.getSource() == bsubmit2) {
                FrontOfApplication.this.bsubmit2ActionPerformed(evt);
            }
            else if (evt.getSource() == bsubmit3) {
                FrontOfApplication.this.bsubmit3ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdbd) {
                FrontOfApplication.this.cmdbdActionPerformed(evt);
            }
            else if (evt.getSource() == cmdm1) {
                FrontOfApplication.this.cmdm1ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdm2) {
                FrontOfApplication.this.cmdm2ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdm3) {
                FrontOfApplication.this.cmdm3ActionPerformed(evt);
            }
    }
    
    public void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
                      
    }
     
    public void exitActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.exit(0);
    }
    
    public void helpwindowActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JOptionPane.showMessageDialog(null,
                                      "The User only needs to click the button once to open a program. \n"
                                        +"\nThe Login County Button is only used by Counselors and Clerks. \n"
                                        +"\nDAST is a drug and alcohol abuse test. \n" 
                                        +"\nMAST is a Michigan test for alcoholism. \n" 
                                        +"\nBasic Demographics is used by participants to get basic background information. \n"  
                                        +"\nModules 1, 2, and 3 are filled out by participants to help with their treatment. \n\n",
                                      "Help Window",
                                      JOptionPane.QUESTION_MESSAGE);
        
    } 

    public void cmdcountyActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException {    
       conn = mysqlconnect.ConnectDb();
       URL icon1 = this.getClass().getClassLoader().getResource("database.png");
       ImageIcon ic1 = new ImageIcon(icon1);
       frame3 = new JFrame();
       frame3.setTitle("Login to Court Program");
       p1 = new JPanel();
       p1.setBackground(new Color(240, 255, 255));
       p1.setLayout(null);
       frame3.setSize(350,280);
       lb5 = new JLabel("Need User Name and Password");
       lb6 = new JLabel("To Login to Court Program");
       lb7 = new JLabel("User Name:");
       lb8 = new JLabel("User Password:");
       tf3 = new JTextField();
       tf4 = new JPasswordField();
       bsubmit2 = new JButton();
       lb5.setFont(new Font("Serif", 0, 16));
       p1.add(lb5);
       lb5.setBounds(10, 20, 250, 25);
       lb6.setFont(new Font("Serif", 0 ,16));
       p1.add(lb6);
       lb6.setBounds(10,40, 330, 25);
       lb7.setFont(new Font("Serif", 0, 16));
       p1.add(lb7);
       lb7.setBounds(10, 90, 200, 25);
       tf3.setFont(new Font("Serif",0, 16));
       p1.add(tf3);
       tf3.setBounds(180, 90, 150, 27);
       lb8.setFont(new Font("Serif", 0, 16));
       p1.add(lb8);
       lb8.setBounds(10, 140, 200, 25);
       tf4.setFont(new Font("Serif",0, 16));
       p1.add(tf4);
       tf4.setBounds(180, 140, 150, 27);
       bsubmit2.setFont(new Font("Serif", 0, 16));
       bsubmit2.setText("Check");
       p1.add(bsubmit2);
       bsubmit2.addActionListener(this);
       bsubmit2.setBounds(75, 200, 150, 27);
       frame3.add(p1);
       frame3.setIconImage(ic1.getImage());
       frame3.setResizable(false);
       frame3.setVisible(true); 
    }
    
    public void bsubmit2ActionPerformed(java.awt.event.ActionEvent evt) {          
        g3 = tf3.getText();
        g4 = tf4.getText();
        String sql = "SELECT * FROM court_login WHERE UserName = ? AND UserPassword = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tf3.getText());
            pst.setString(2, tf4.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            s3 = rs.getString("UserName");
            s4 = rs.getString("UserPassword");
            }      
        }catch (SQLException e){}  
        try {
            if ((g3.equals(s3))&&(g4.equals(s4))) { 
             JOptionPane.showMessageDialog(null," User Name & User Password Found");
             County count = new County();
             count.setVisible(true);
             frame3.dispose();
            }
            else {
              JOptionPane.showMessageDialog(null,"Can Not Access User Name & User Password Not Found");
            }
        }catch (HeadlessException e){}
    }
    
    public void cmddastActionPerformed(java.awt.event.ActionEvent evt) {                                          
        DAST dast = new DAST();
        dast.setVisible(true);
    } 
    
    public void cmdmastActionPerformed(java.awt.event.ActionEvent evt) {                                          
        MAST mast = new MAST();
        mast.setVisible(true);
    }
    
    public void cmdexportActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException { 
       conn = mysqlconnect.ConnectDb();
       URL icon2 = this.getClass().getClassLoader().getResource("database.png");
       ImageIcon ic2 = new ImageIcon(icon2);
       frame2 = new JFrame();
       frame2.setTitle("Access to Data");
       p = new JPanel();
       p.setBackground(new Color(240, 255, 255));
       p.setLayout(null);
       frame2.setSize(350,280);
       lb = new JLabel("Need User Name and Password To Open Window");
       lb4 = new JLabel("To Export Database to Excel File");
       lb2 = new JLabel("User Name:");
       lb3 = new JLabel("User Password:");
       tf1 = new JTextField();
       tf2 = new JPasswordField();
       bsubmit = new JButton();
       lb.setFont(new Font("Serif", 0, 16));
       p.add(lb);
       lb.setBounds(10, 20, 340, 25);
       lb4.setFont(new Font("Serif", 0 ,16));
       p.add(lb4);
       lb4.setBounds(10,40, 330, 25);
       lb2.setFont(new Font("Serif", 0, 16));
       p.add(lb2);
       lb2.setBounds(10, 90, 200, 25);
       tf1.setFont(new Font("Serif",0, 16));
       p.add(tf1);
       tf1.setBounds(180, 90, 150, 27);
       lb3.setFont(new Font("Serif", 0, 16));
       p.add(lb3);
       lb3.setBounds(10, 140, 200, 25);
       tf2.setFont(new Font("Serif",0, 16));
       p.add(tf2);
       tf2.setBounds(180, 140, 150, 27);
       bsubmit.setFont(new Font("Serif", 0, 16));
       bsubmit.setText("Access Database");
       p.add(bsubmit);
       bsubmit.addActionListener(this);
       bsubmit.setBounds(75, 200, 150, 27);
       frame2.add(p);
       frame2.setIconImage(ic2.getImage());
       frame2.setResizable(false);
       frame2.setVisible(true); 
    }
    
    public void bsubmitActionPerformed(java.awt.event.ActionEvent evt) { 
        frame2.dispose();
        g1 = tf1.getText();
        g2 = tf2.getText();
        String sql = "SELECT * FROM counselor_login WHERE UserName = ? AND UserPassword = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tf1.getText());
            pst.setString(2, tf2.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            s1 = rs.getString("UserName");
            s2 = rs.getString("UserPassword");
            }      
        }catch (SQLException e){} 
        try {
            if ((g1.equals(s1))&&(g2.equals(s2))) { 
                 JOptionPane.showMessageDialog(null," User Name & User Password Found");
                 conn = mysqlconnect.ConnectDb();
                 URL icon3 = this.getClass().getClassLoader().getResource("database.png");
                 ImageIcon ic3 = new ImageIcon(icon3);
                 frame4 = new JFrame();
                 frame4.setTitle("Export Database to Excel");
                 p2 = new JPanel();
                 p2.setBackground(new Color(240, 255, 255));
                 p2.setLayout(null);
                 frame4.setSize(350,280);
                 lb9 = new JLabel("Need Dates To Export Database to Excel File");
                 lb10 = new JLabel("File Name is Database Ex:Database.csv");
                 lb11 = new JLabel("Start Date:");
                 lb12 = new JLabel("Finish Date:");
                 tf5 = new JTextField();
                 tf6 = new JTextField();
                 bsubmit3 = new JButton();
                 lb9.setFont(new Font("Serif", 0, 16));
                 p2.add(lb9);
                 lb9.setBounds(10, 20, 370, 25);
                 lb10.setFont(new Font("Serif", 0 ,16));
                 p2.add(lb10);
                 lb10.setBounds(10,40, 330, 25);
                 lb11.setFont(new Font("Serif", 0, 16));
                 p2.add(lb11);
                 lb11.setBounds(10, 90, 200, 25);
                 tf5.setFont(new Font("Serif",0, 16));
                 p2.add(tf5);
                 tf5.setBounds(165, 90, 150, 27);
                 lb12.setFont(new Font("Serif", 0, 16));
                 p2.add(lb12);
                 lb12.setBounds(10, 140, 200, 25);
                 tf6.setFont(new Font("Serif",0, 16));
                 p2.add(tf6);
                 tf6.setBounds(165, 140, 150, 27);
                 bsubmit3.setFont(new Font("Serif", 0, 16));
                 bsubmit3.setText("Export File");
                 p2.add(bsubmit3);
                 bsubmit3.addActionListener(this);
                 bsubmit3.setBounds(75, 200, 150, 27);
                 frame4.add(p2);
                 frame4.setIconImage(ic3.getImage());
                 frame4.setResizable(false);
                 frame4.setVisible(true); 
            }
            else{               
              JOptionPane.showMessageDialog(null,"Can Not Access User Name & User Password Not Found");
            }
        } catch (HeadlessException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }            
    }

    public void bsubmit3ActionPerformed(java.awt.event.ActionEvent evt) {
        frame4.dispose();
        String sql = "(SELECT 'Demographics Entry_Date', 'Demographics Case_Number', 'Demographics Name', 'Demographics Birth_Date', 'Demographics Drugs_Used', 'Demographics Other_Drug', 'Demographics Age_Drug_First', 'Demographics Age_Regular_Drug',"+ 
          "'Demographics Age_Alcohol_First', 'Demographics Age_Regular_Alcohol', 'Demographics Children', 'Demographics Mental_Treatment', 'Demographics Drug_Treatment', 'Demographics Drug_Free_Babies',"+  
          "'Demographics Age_of_Child', 'Demographics Gender', 'Demographics Ethnicity', 'Demographics Formal_Education', 'Demographics Other_Education', 'Demographics Sources_Income', 'Demographics Prior_Convictions',"+ 
          "'Demographics Explain_Convictions', 'Demographics Amount_Convictions', 'Demographics Parental_Rights_Taken', 'Research Demographic Name',"+
          "'Research Demographic Birth_Date', 'Research Demographic Six_Month_Plans', 'Research Demographic Five_Year_Plans', 'Research Demographic How_Into_Drugs', 'Research Demographic Why_do_Drugs',"+ 
          "'Research Demographic Addicted', 'Research Demographic How_Addicted', 'Research Demographic Likes_N_Hobbies', 'Research Demographic Wishful_Activities', 'Research Demographic Relationship_Situation', 'Research Demographic Other_Relationship',"+  
          "'Research Demographic Jobs_Past_5years', 'Research Demographic Job_Situation_Pastyear', 'Research Demographic Other_Job_Situation', 'Research Demographic Work_Type_Lastwk', 'Research Demographic Skills_Expertise',"+
          "'Research Demographic Live_Last_Month', 'Research Demographic Other_living', 'Research Demographic Health_Insurance', 'Research Demographic Insurance_Type', 'DAST Name', 'DAST Birth_Date', 'DAST Test_Date',"+
          "'DAST Test_Score', 'MAST Name', 'MAST Birth_Date', 'MAST Test_Date', 'MAST Test_Score', 'Network Structure Analysis Name', 'Network Structure Analysis Birth_Date', 'Network Structure Analysis Formal_Groups',"+ 
          "'Network Structure Analysis School', 'Network Structure Analysis Other_Formal', 'Network Structure Analysis Informal_Groups', 'Network Structure Analysis Other_Informal', 'Network Structure Analysis Other_Informal2', 'Sociogram Name',"+  
          "'Sociogram Birth_Date', 'Sociogram First_Group', 'Sociogram Second_Group', 'Sociogram Third_Group', 'Sociogram Fourth_Group', 'Sociogram Fifth_Group', 'Cultural1 Name', 'Cultural1 Birth_Date', 'Cultural1 Main_Group',"+  
          "'Cultural1 Discuss_hobbies', 'Cultural1 Volunteer_Work', 'Cultural1 Cultural_Events', 'Cultural1 Important_Connts', 'Cultural1 College_Educated', 'Cultural1 Library_Use', 'Cultural2 Name', 'Cultural2 Birth_Date', 'Cultural2 Main_Group', 'Cultural2  Discuss_hobbies',"+
          "'Cultural2 Volunteer_Work', 'Cultural2 Cultural_Events', 'Cultural2 Important_Connts', 'Cultural2 College_Educated', 'Cultural2 Library_Use', 'Cultural3 Name', 'Cultural3 Birth_Date', 'Cultural3 Main_Group', 'Cultural3  Discuss_hobbies',"+
          "'Cultural3 Volunteer_Work', 'Cultural3 Cultural_Events', 'Cultural3 Important_Connts', 'Cultural3 College_Educated', 'Cultural3 Library_Use', 'Cultural4 Name', 'Cultural4 Birth_Date', 'Cultural4 Main_Group', "+
          "'Cultural4 Discuss_hobbies','Cultural4 Volunteer_Work', 'Cultural4 Cultural_Events', 'Cultural4 Important_Connts', 'Cultural4 College_Educated', 'Cultural4 Library_Use', 'Cultural5 Name', 'Cultural5 Birth_Date', 'Cultural5 Main_Group', "+
          "'Cultural5 Discuss_hobbies','Cultural5 Volunteer_Work', 'Cultural5 Cultural_Events', 'Cultural5 Important_Connts', 'Cultural5 College_Educated', 'Cultural5 Library_Use', 'Emotional1 Name',"+
          "'Emotional1 Birth_Date', 'Emotional1 Main_Group', 'Emotional1 Discussing_Problems','Emotional1 Honesty_in_Group', 'Emotional1 Criticism_in_Group', 'Emotional1 Emotional_GroupMmber', 'Emotional1 Trust_GroupMmber', 'Emotional1 Accept_Faults',"+ 
          "'Emotional2 Name', 'Emotional2 Birth_Date', 'Emotional2 Main_Group', 'Emotional2 Discussing_Problems','Emotional2 Honesty_in_Group', 'Emotional2 Criticism_in_Group',"+ 
          "'Emotional2 Emotional_GroupMmber', 'Emotional2 Trust_GroupMmber', 'Emotional2 Accept_Faults', 'Emotional3 Name', 'Emotional3 Birth_Date', 'Emotional Resources3 Main_Group', 'Emotional Resources3 Discussing_Problems',"+
          "'Emotional3 Honesty_in_Group', 'Emotional3 Criticism_in_Group', 'Emotional3 Emotional_GroupMmber', 'Emotional3 Trust_GroupMmber', 'Emotional3 Accept_Faults', 'Emotional4 Name', 'Emotional4 Birth_Date',"+
          "'Emotional4 Main_Group', 'Emotional4 Discussing_Problems','Emotional4 Honesty_in_Group', 'Emotional4 Criticism_in_Group', 'Emotional4 Emotional_GroupMmber', 'Emotional4 Trust_GroupMmber', 'Emotional4 Accept_Faults', 'Emotional5 Name', 'Emotional5 Birth_Date',"+ 
          "'Emotional5 Main_Group', 'Emotional5 Discussing_Problems','Emotional5 Honesty_in_Group', 'Emotional5 Criticism_in_Group', 'Emotional5 Emotional_GroupMmber', 'Emotional5 Trust_GroupMmber', 'Emotional5 Accept_Faults', 'Financial1 Name', 'Financial1 Birth_Date', "+
          "'Financial1 Main_Group', 'Financial1 Lend_Money', 'Financial1 Lend_Car', 'Financial1 Live_With', 'Financial1 Legal_Advice_LoCost', 'Financial1 Help_Pay_Bills', 'Financial1 Help_Child_Care', 'Financial2 Name', 'Financial2 Birth_Date', 'Financial2 Main_Group', 'Financial2 Lend_Money',"+  
          "'Financial2 Lend_Car','Financial2 Live_With', 'Financial2 Legal_Advice_LoCost', 'Financial2 Help_Pay_Bills', 'Financial2 Help_Child_Care', 'Financial3 Name', 'Financial3 Birth_Date', 'Financial3 Main_Group', 'Financial3 Lend_Money',"+  
          "'Financial3 Lend_Car','Financial3 Live_With', 'Financial3 Legal_Advice_LoCost', 'Financial3 Help_Pay_Bills', 'Financial3 Help_Child_Care', 'Financial4 Name', 'Financial4 Birth_Date', 'Financial4 Main_Group', 'Financial4 Lend_Money', "+ 
          "'Financial4 Lend_Car','Financial4 Live_With', 'Financial4 Legal_Advice_LoCost', 'Financial4 Help_Pay_Bills', 'Financial4 Help_Child_Care', 'Financial5 Name', 'Financial5 Birth_Date', 'Financial5 Main_Group', 'Financial5 Lend_Money', "+ 
          "'Financial5 Lend_Car','Financial5 Live_With', 'Financial5 Legal_Advice_LoCost', 'Financial5 Help_Pay_Bills', 'Financial5 Help_Child_Care', 'Drug Habits1 Name', 'Drug Habits1 Birth_Date', 'Drug Habits1 Main_Group',"+ 
          "'Drug Habits1 Arrives_Drunk_High','Drug Habits1 Drug_Dealers_OutsideGr', 'Drug Habits1 Recr_Drug_Use', 'Drug Habits1 Party_Exces_Drink', 'Drug Habits1 Unwind_With_Drug', 'Drug Habits1 DUI_InGroup', 'Drug Habits2 Name', 'Drug Habits2 Birth_Date',"+ 
          "'Drug Habits2 Main_Group', 'Drug Habits2 Arrives_Drunk_High','Drug Habits2 Drug_Dealers_OutsideGr', 'Drug Habits2 Recr_Drug_Use', 'Drug Habits2 Party_Exces_Drink', 'Drug Habits2 Unwind_With_Drug', 'Drug Habits2 DUI_InGroup', 'Drug Habits3 Name', 'Drug Habits3 Birth_Date',"+
          "'Drug Habits3 Main_Group', 'Drug Habits3 Arrives_Drunk_High','Drug Habits3 Drug_Dealers_OutsideGr', 'Drug Habits3 Recr_Drug_Use', 'Drug Habits3 Party_Exces_Drink', 'Drug Habits3 Unwind_With_Drug', 'Drug Habits3 DUI_InGroup', 'Drug Habits4 Name', 'Drug Habits4 Birth_Date',"+ 
          "'Drug Habits4 Main_Group', 'Drug Habits4 Arrives_Drunk_High','Drug Habits4 Drug_Dealers_OutsideGr', 'Drug Habits4 Recr_Drug_Use', 'Drug Habits4 Party_Exces_Drink', 'Drug Habits4 Unwind_With_Drug', 'Drug Habits4 DUI_InGroup', 'Drug Habits5 Name', 'Drug Habits5 Birth_Date',"+ 
          "'Drug Habits5 Main_Group', 'Drug Habits5 Arrives_Drunk_High','Drug Habits5 Drug_Dealers_OutsideGr', 'Drug Habits5 Recr_Drug_Use', 'Drug Habits5 Party_Exces_Drink', 'Drug Habits5 Unwind_With_Drug', 'Drug Habits5 DUI_InGroup', 'Help Group Name', 'Help Group Birth_Date', 'Help Group First_Group', 'Help Group Second_Group',"+
          "'Help Group Third_Group', 'Help Group Fourth_Group', 'Help Group Fifth_Group', 'Hangout Group Name', 'Hangout Group Birth_Date', 'Hangout Group First_Group', 'Hangout Group Second_Group', 'Hangout Group Third_Group', "+ 
          "'Hangout Group Fourth_Group', 'Hangout Group Fifth_Group','Social1 Name', 'Social1 Birth_Date', 'Social1 Main_Group', 'Social1 People_in_Network', 'Social1 Know_in_Network', 'Social1 Closely_Know', 'Social1 Hang_With_Regulary',"+
          "'Social1 Hang_with_Amount', 'Social1 Know_Outside_Groups', 'Social1 Connect_outdside_Group', 'Social1 Other_Conn', 'Social1 Closeness', 'Social1 Personal_closeness', 'Social1 Group_Jealousy',"+
          "'Social2 Name', 'Social2 Birth_Date', 'Social2 Main_Group', 'Social2 People_in_Network', 'Social2 Know_in_Network', 'Social2 Closely_Know', 'Social2 Hang_With_Regulary', 'Social2 Hang_with_Amount',"+ 
          "'Social2 Know_Outside_Groups','Social2 Connect_outdside_Group', 'Social2 Other_Conn', 'Social2 Closeness', 'Social2 Personal_closeness', 'Social2 Group_Jealousy', 'Social3 Name', 'Social3 Birth_Date', 'Social3 Main_Group', 'Social3 People_in_Network',"+
          "'Social3 Know_in_Network', 'Social3 Closely_Know', 'Social3 Hang_With_Regulary', 'Social3 Hang_with_Amount', 'Social3 Know_Outside_Groups', 'Social3 Connect_outdside_Group', 'Social3 Other_Conn', 'Social3 Closeness',"+
          "'Social3 Personal_closeness', 'Social3 Group_Jealousy', 'Social4 Name', 'Social4 Birth_Date', 'Social4 Main_Group', 'Social4 People_in_Network', 'Social4 Know_in_Network', 'Social4 Closely_Know', "+
          "'Social4 Hang_With_Regulary','Social4 Hang_with_Amount', 'Social4 Know_Outside_Groups', 'Social4 Connect_outdside_Group', 'Social4 Other_Conn', 'Social4 Closeness', 'Social4 Personal_closeness', 'Social4 Group_Jealousy', 'Social5 Name',"+ 
          "'Social5 Birth_Date', 'Social5 Main_Group', 'Social5 People_in_Network', 'Social5 Know_in_Network', 'Social5 Closely_Know', 'Social5 Hang_With_Regulary', 'Social5 Hang_with_Amount', 'Social5 Know_Outside_Groups',"+ 
          "'Social5 Connect_outdside_Group', 'Social5 Other_Conn','Social5 Closeness', 'Social5 Personal_closeness', 'Social5 Group_Jealousy', 'Research Demographic Entry_Date', 'Research Demographic Participant_Nmbr', 'Weekly Data Name', 'Weekly Data Birth_Date', 'Weekly Data Phase',"+  
          "'Weekly Data Termin_Date','Weekly Data Termin', 'Weekly Data Grad_Date', 'Weekly Data Hold_N_Date', 'Weekly Data Last_Step_Cmplt', 'Weekly Data Fee_Balance', 'Weekly Data Fee_Amount', 'Weekly Data Fees_Paid', 'Weekly Data Fees_Other',"+
          "'Weekly Data Date_of_Offense', 'Weekly Data Reason_Sanction', 'Weekly Data Type_Sanction', 'Weekly Data Date_Exp_Sanction', 'Weekly Data Drug_Screen_Date', 'Weekly Data Screen_Types', 'Weekly Data Screen_Results',"+ 
          "'Weekly Data Drug_Found','Weekly Data Drug_Court_Atnd', 'Weekly Data NA_Atnd', 'Weekly Data AA_Atnd', 'Weekly Data Court_Ses_Atnd', 'Weekly Data New_Charges', 'Weekly Data Employment', 'Weekly Data Diploma_GED', 'Weekly Data Counselor_Comments') "+
          " UNION (SELECT demo.Entry_Date, demo.Case_Number, demo.Name, demo.Birth_Date, demo.Drugs_Used, demo.Other_Drug, demo.Age_Drug_First, demo.Age_Regular_Drug, demo.Age_Alcohol_First, demo.Age_Regular_Alcohol, demo.Children, "+ 
          "demo.Mental_Treatment, demo.Drug_Treatment, demo.Drug_Free_Babies, demo.Age_of_Child, demo.Gender, demo.Ethnicity, demo.Formal_Education, demo.Other_Education, demo.Sources_Income, demo.Prior_Convictions,"+ 
           "demo.Explain_Convictions, demo.Amount_Convictions, demo.Parental_Rights_Taken, t33.Name,"+
           "t33.Birth_Date, t33.Six_Month_Plans, t33.Five_Year_Plans, t33.How_Into_Drugs, t33.Why_do_Drugs, t33.Addicted, t33.How_Addicted, t33.Likes_N_Hobbies, t33.Wishful_Activities, t33.Relationship_Situation,"+  
           "t33.Other_Relationship, t33.Jobs_Past_5years, t33.Job_Situation_Pastyear, t33.Other_Job_Situation, t33.Work_Type_Lastwk, t33.Skills_Expertise,"+
           "t33.Live_Last_Month, t33.Other_living, t33.Health_Insurance, t33.Insurance_Type, t2.Name, t2.Birth_Date, t2.Test_Date, t2.Test_Score, t26.Name, t26.Birth_Date, t26.Test_Date, t26.Test_Score, t3.Name, t3.Birth_Date,"+  
           "t3.Formal_Groups, t3.School, t3.Other_Formal, t3.Informal_Groups, t3.Other_Informal, t3.Other_Informal2, t32.Name, t32.Birth_Date, t32.First_Group, t32.Second_Group, t32.Third_Group, t32.Fourth_Group, t32.Fifth_Group,"+  
           "t4.Name, t4.Birth_Date, t4.Main_Group, t4.Discuss_hobbies, t4.Volunteer_Work, t4.Cultural_Events, t4.Important_Connts, t4.College_Educated, t4.Library_Use, t5.Name, t5.Birth_Date, t5.Main_Group, t5.Discuss_hobbies,"+
           "t5.Volunteer_Work, t5.Cultural_Events, t5.Important_Connts, t5.College_Educated, t5.Library_Use, t6.Name, t6.Birth_Date, t6.Main_Group, t6.Discuss_hobbies,"+
           "t6.Volunteer_Work, t6.Cultural_Events, t6.Important_Connts, t6.College_Educated, t6.Library_Use, t7.Name, t7.Birth_Date, t7.Main_Group, t7.Discuss_hobbies,"+
           "t7.Volunteer_Work, t7.Cultural_Events, t7.Important_Connts, t7.College_Educated, t7.Library_Use, t8.Name, t8.Birth_Date, t8.Main_Group, t8.Discuss_hobbies,"+
           "t8.Volunteer_Work, t8.Cultural_Events, t8.Important_Connts, t8.College_Educated, t8.Library_Use, t9.Name, t9.Birth_Date, t9.Main_Group, t9.Discussing_Problems,"+
           "t9.Honesty_in_Group, t9.Criticism_in_Group, t9.Emotional_GroupMmber, t9.Trust_GroupMmber, t9.Accept_Faults, t10.Name, t10.Birth_Date, t10.Main_Group, t10.Discussing_Problems,"+
           "t10.Honesty_in_Group, t10.Criticism_in_Group, t10.Emotional_GroupMmber, t10.Trust_GroupMmber, t10.Accept_Faults, t11.Name, t11.Birth_Date, t11.Main_Group, t11.Discussing_Problems,"+
           "t11.Honesty_in_Group, t11.Criticism_in_Group, t11.Emotional_GroupMmber, t11.Trust_GroupMmber, t11.Accept_Faults, t12.Name, t12.Birth_Date, t12.Main_Group, t12.Discussing_Problems,"+
           "t12.Honesty_in_Group, t12.Criticism_in_Group, t12.Emotional_GroupMmber, t12.Trust_GroupMmber, t12.Accept_Faults, t13.Name, t13.Birth_Date, t13.Main_Group, t13.Discussing_Problems,"+
           "t13.Honesty_in_Group, t13.Criticism_in_Group, t13.Emotional_GroupMmber, t13.Trust_GroupMmber, t13.Accept_Faults, t14.Name, t14.Birth_Date, t14.Main_Group, t14.Lend_Money, t14.Lend_Car,"+
           "t14.Live_With, t14.Legal_Advice_LoCost, t14.Help_Pay_Bills, t14.Help_Child_Care, t15.Name, t15.Birth_Date, t15.Main_Group, t15.Lend_Money, t15.Lend_Car,"+
           "t15.Live_With, t15.Legal_Advice_LoCost, t15.Help_Pay_Bills, t15.Help_Child_Care, t16.Name, t16.Birth_Date, t16.Main_Group, t16.Lend_Money, t16.Lend_Car,"+
           "t16.Live_With, t16.Legal_Advice_LoCost, t16.Help_Pay_Bills, t16.Help_Child_Care, t17.Name, t17.Birth_Date, t17.Main_Group, t17.Lend_Money, t17.Lend_Car,"+
           "t17.Live_With, t17.Legal_Advice_LoCost, t17.Help_Pay_Bills, t17.Help_Child_Care, t18.Name, t18.Birth_Date, t18.Main_Group, t18.Lend_Money, t18.Lend_Car,"+
           "t18.Live_With, t18.Legal_Advice_LoCost, t18.Help_Pay_Bills, t18.Help_Child_Care, t19.Name, t19.Birth_Date, t19.Main_Group, t19.Arrives_Drunk_High,"+
           "t19.Drug_Dealers_OutsideGr, t19.Recr_Drug_Use, t19.Party_Exces_Drink, t19.Unwind_With_Drug, t19.DUI_InGroup, t20.Name, t20.Birth_Date, t20.Main_Group, t20.Arrives_Drunk_High,"+
           "t20.Drug_Dealers_OutsideGr, t20.Recr_Drug_Use, t20.Party_Exces_Drink, t20.Unwind_With_Drug, t20.DUI_InGroup, t21.Name, t21.Birth_Date, t21.Main_Group, t21.Arrives_Drunk_High,"+
           "t21.Drug_Dealers_OutsideGr, t21.Recr_Drug_Use, t21.Party_Exces_Drink, t21.Unwind_With_Drug, t21.DUI_InGroup, t22.Name, t22.Birth_Date, t22.Main_Group, t22.Arrives_Drunk_High,"+
           "t22.Drug_Dealers_OutsideGr, t22.Recr_Drug_Use, t22.Party_Exces_Drink, t22.Unwind_With_Drug, t22.DUI_InGroup, t23.Name, t23.Birth_Date, t23.Main_Group, t23.Arrives_Drunk_High,"+
           "t23.Drug_Dealers_OutsideGr, t23.Recr_Drug_Use, t23.Party_Exces_Drink, t23.Unwind_With_Drug, t23.DUI_InGroup, t24.Name, t24.Birth_Date, t24.First_Group, t24.Second_Group,"+
           "t24.Third_Group, t24.Fourth_Group, t24.Fifth_Group, t25.Name, t25.Birth_Date, t25.First_Group, t25.Second_Group, t25.Third_Group, t25.Fourth_Group, t25.Fifth_Group,"+
           "t27.Name, t27.Birth_Date, t27.Main_Group, t27.People_in_Network, t27.Know_in_Network, t27.Closely_Know, t27.Hang_With_Regulary,"+
           "t27.Hang_with_Amount, t27.Know_Outside_Groups, t27.Connect_outdside_Group, t27.Other_Conn, t27.Closeness, t27.Personal_closeness, t27.Group_Jealousy,"+
           "t28.Name, t28.Birth_Date, t28.Main_Group, t28.People_in_Network, t28.Know_in_Network, t28.Closely_Know, t28.Hang_With_Regulary, t28.Hang_with_Amount, t28.Know_Outside_Groups,"+
           "t28.Connect_outdside_Group, t28.Other_Conn, t28.Closeness, t28.Personal_closeness, t28.Group_Jealousy, t29.Name, t29.Birth_Date, t29.Main_Group, t29.People_in_Network,"+
           "t29.Know_in_Network, t29.Closely_Know, t29.Hang_With_Regulary, t29.Hang_with_Amount, t29.Know_Outside_Groups, t29.Connect_outdside_Group, t29.Other_Conn, t29.Closeness,"+
           "t29.Personal_closeness, t29.Group_Jealousy, t30.Name, t30.Birth_Date, t30.Main_Group, t30.People_in_Network, t30.Know_in_Network, t30.Closely_Know, t30.Hang_With_Regulary,"+
           "t30.Hang_with_Amount, t30.Know_Outside_Groups, t30.Connect_outdside_Group, t30.Other_Conn, t30.Closeness, t30.Personal_closeness, t30.Group_Jealousy, t31.Name, t31.Birth_Date, t31.Main_Group, t31.People_in_Network,"+  
           "t31.Know_in_Network, t31.Closely_Know, t31.Hang_With_Regulary, t31.Hang_with_Amount, t31.Know_Outside_Groups, t31.Connect_outdside_Group, t31.Other_Conn,"+
           "t31.Closeness, t31.Personal_closeness, t31.Group_Jealousy, t34.Entry_Date, t34.Participant_Nmbr, t34.Name, t34.Birth_Date, t34.Phase, t34.Termin_Date,"+
           "t34.Termin, t34.Grad_Date, t34.Hold_N_Date, t34.Last_Step_Cmplt, t34.Fee_Balance, t34.Fee_Amount, t34.Fees_Paid, t34.Fees_Other,"+
           "t34.Date_of_Offense, t34.Reason_Sanction, t34.Type_Sanction, t34.Date_Exp_Sanction, t34.Drug_Screen_Date, t34.Screen_Types, t34.Screen_Results, t34.Drug_Found,"+
           "t34.Drug_Court_Atnd, t34.NA_Atnd, t34.AA_Atnd, t34.Court_Ses_Atnd, t34.New_Charges, t34.Employment, t34.Diploma_GED, t34.Counselor_Comments"+ 
           " FROM demographics  demo "+ 
             "LEFT JOIN research_demographic t33 ON demo.Birth_Date = t33.Birth_Date "+  
             "LEFT JOIN dast t2 ON t33.Birth_Date = t2.Birth_Date "+ 
             "LEFT JOIN mast t26 ON t2.Birth_Date = t26.Birth_Date "+
             "LEFT JOIN network_structure_analysis t3 ON t26.Birth_Date = t3.Birth_Date "+ 
             "LEFT JOIN sociogram t32 ON t3.Birth_Date = t32.Birth_Date "+ 
             "LEFT JOIN cultural_resources1 t4 ON t32.Birth_Date = t4.Birth_Date "+ 
             "LEFT JOIN cultural_resources2 t5 ON t4.Birth_Date = t5.Birth_Date "+ 
             "LEFT JOIN cultural_resources3 t6 ON t5.Birth_Date = t6.Birth_Date "+ 
             "LEFT JOIN cultural_resources4 t7 ON t6.Birth_Date = t7.Birth_Date "+
             "LEFT JOIN cultural_resources5 t8 ON t7.Birth_Date = t8.Birth_Date "+ 
             "LEFT JOIN emotional_resources1 t9 ON t8.Birth_Date = t9.Birth_Date "+  
             "LEFT JOIN emotional_resources2 t10 ON t9.Birth_Date = t10.Birth_Date "+
             "LEFT JOIN emotional_resources3 t11 ON t10.Birth_Date = t11.Birth_Date "+ 
             "LEFT JOIN emotional_resources4 t12 ON t11.Birth_Date = t12.Birth_Date "+ 
             "LEFT JOIN emotional_resources5 t13 ON t12.Birth_Date = t13.Birth_Date "+ 
             "LEFT JOIN financial_resources1 t14 ON t13.Birth_Date = t14.Birth_Date "+  
             "LEFT JOIN financial_resources2 t15 ON t14.Birth_Date = t15.Birth_Date "+ 
             "LEFT JOIN financial_resources3 t16 ON t15.Birth_Date = t16.Birth_Date "+  
             "LEFT JOIN financial_resources4 t17 ON t16.Birth_Date = t17.Birth_Date "+ 
             "LEFT JOIN financial_resources5 t18 ON t17.Birth_Date = t18.Birth_Date "+
             "LEFT JOIN group_drug_habits1 t19 ON t18.Birth_Date = t19.Birth_Date "+ 
             "LEFT JOIN group_drug_habits2 t20 ON t19.Birth_Date = t20.Birth_Date "+  
             "LEFT JOIN group_drug_habits3 t21 ON t20.Birth_Date = t21.Birth_Date "+  
             "LEFT JOIN group_drug_habits4 t22 ON t21.Birth_Date = t22.Birth_Date "+  
             "LEFT JOIN group_drug_habits5 t23 ON t22.Birth_Date = t23.Birth_Date "+ 
             "LEFT JOIN groups_that_help t24 ON t23.Birth_Date = t24.Birth_Date "+ 
             "LEFT JOIN groups_to_hangout t25 ON t24.Birth_Date = t25.Birth_Date "+ 
             "LEFT JOIN social_network1 t27 ON t25.Birth_Date = t27.Birth_Date "+ 
             "LEFT JOIN social_network2 t28 ON t27.Birth_Date = t28.Birth_Date "+ 
             "LEFT JOIN social_network3 t29 ON t28.Birth_Date = t29.Birth_Date "+ 
             "LEFT JOIN social_network4 t30 ON t29.Birth_Date = t30.Birth_Date "+ 
             "LEFT JOIN social_network5 t31 ON t30.Birth_Date = t31.Birth_Date "+ 
             "LEFT JOIN weekly_data t34 ON t33.Birth_Date = t34.Birth_Date WHERE demo.Entry_Date BETWEEN ? AND ? ORDER BY demo.Entry_Date DESC INTO OUTFILE '/Database1.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n');";
          try {
            pst = conn.prepareStatement(sql);            
            pst.setString(1, tf5.getText());
            pst.setString(2, tf6.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Created Excel File");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void cmdbdActionPerformed(java.awt.event.ActionEvent evt) {                                      
        BasicDemographics b = new BasicDemographics();
        b.setVisible(true);
    }                                     

   
    public void cmdm1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Module1 m1 = new Module1();
        m1.setVisible(true);
    }                                     

    public void cmdm2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Module2 m2 = new Module2();
        m2.setVisible(true);
    }                                     

    public void cmdm3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Module3 m3 = new Module3();
        m3.setVisible(true);
    }     

    
    public static void main(String args[]) {
            new FrontOfApplication().setVisible(true);
            
    }
    
}
