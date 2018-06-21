package counselorapplication;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.FocusListener;
import java.sql.*;
import javax.swing.*;
import java.awt.Color;
import javax.swing.JPanel;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Module3 extends JFrame implements ActionListener, WindowListener, FocusListener{
  
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String caz, caz2, s, sx, caz3, caz4, s1, sx1, s2, s4, s6, group4, group5;
    
    public int currentCard = 1;
    public JPanel cardPanel;
    public CardLayout cl;
    public JPanel buttonPanel;
    public JButton cmdnext2;
    public JButton cmdprevious2;
    public JScrollPane scrollpane2;
    public JComboBox boxconnectothers;
    public JComboBox boxhangoutoften;
    public JComboBox boxknowothers;
    public JButton cmdclear1;
    public JButton cmdsubmit1;
    public JButton cmdgroup2;
    public JLabel label1;
    public JLabel label10;
    public JLabel label11;
    public JLabel label12;
    public JLabel label13;
    public JLabel label14;
    public JLabel label15;
    public JLabel label16;
    public JLabel label17;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JLabel label6;
    public JLabel label7;
    public JLabel label8;
    public JLabel label9;
    public JPanel p1;
    public JScrollPane s10;
    public JSlider sliderclosiness;
    public JSlider slidergroupreact;
    public JSlider sliderpersonalclosiness;
    public JTextField txtbirthdate;
    public JTextArea txtconnectothers;
    public JTextField txtgroup1;
    public JTextField txtinnetwork;
    public JTextField txtknownetwork;
    public JTextField txtname;
    public JTextField txtregularlyhangout;
    public JTextField txttrustclosely;
    public JButton cmdclear2;
    public JButton cmdsubmit2;
    public JLabel e1;
    public JLabel e10;
    public JLabel e11;
    public JLabel e12;
    public JLabel e13;
    public JLabel e14;
    public JLabel e15;
    public JLabel e19;
    public JLabel e2;
    public JLabel e3;
    public JLabel e4;
    public JLabel e5;
    public JLabel e6;
    public JLabel e7;
    public JLabel e8;
    public JLabel e9;
    public JPanel p2;
    public JSlider slider1;
    public JSlider slider2;
    public JSlider slider3;
    public JSlider slider4;
    public JSlider slider5;
    public JSlider slider6;
    public JTextField txtbirthdate2;
    public JTextField txtgroup12;
    public JTextField txtname2;
    public JButton cmdclear3;
    public JButton cmdsubmit3;
    public JLabel f1;
    public JLabel f10;
    public JLabel f11;
    public JLabel f12;
    public JLabel f13;
    public JLabel f14;
    public JLabel f15;
    public JLabel f16;
    public JLabel f17;
    public JLabel f18;
    public JLabel f19;
    public JLabel f2;
    public JLabel f3;
    public JLabel f4;
    public JLabel f5;
    public JLabel f6;
    public JLabel f7;
    public JLabel f8;
    public JLabel f9;
    public JPanel p3;
    public JSlider js1;
    public JSlider js2;
    public JSlider js3;
    public JSlider js4;
    public JSlider js5;
    public JSlider js6;
    public JTextField txtbirthdate3;
    public JTextField txtgroup13;
    public JTextField txtname3;
    public JButton cmdclear4;
    public JButton cmdsubmit4;
    public JLabel d1;
    public JLabel d10;
    public JLabel d11;
    public JLabel d12;
    public JLabel d13;
    public JLabel d14;
    public JLabel d15;
    public JLabel d16;
    public JLabel d17;
    public JLabel d19;
    public JLabel d2;
    public JLabel d20;
    public JLabel d3;
    public JLabel d4;
    public JLabel d5;
    public JLabel d6;
    public JLabel d7;
    public JLabel d8;
    public JLabel d9;
    public JPanel p4;
    public JSlider dslider1;
    public JSlider dslider2;
    public JSlider dslider3;
    public JSlider dslider4;
    public JSlider dslider5;
    public JSlider dslider6;
    public JTextField txtbirthdate4;
    public JTextField txtgroup14;
    public JTextField txtname4;
    public JButton cmdclear5;
    public JButton cmdsubmit5;
    public JLabel c1;
    public JLabel c10;
    public JLabel c11;
    public JLabel c12;
    public JLabel c13;
    public JLabel c14;
    public JLabel c15;
    public JLabel c16;
    public JLabel c2;
    public JLabel c3;
    public JLabel c4;
    public JLabel c5;
    public JLabel c6;
    public JLabel c7;
    public JLabel c8;
    public JLabel c9;
    public JPanel p5;
    public JSlider cslider1;
    public JSlider cslider2;
    public JSlider cslider3;
    public JSlider cslider4;
    public JSlider cslider5;
    public JSlider cslider6;
    public JTextField txtbirthdate5;
    public JTextField txtgroup15;
    public JTextField txtname5;
    public JComboBox boxconnectothers1;
    public JComboBox boxhangoutoften1;
    public JComboBox boxknowothers1;
    public JButton cmdclear6;
    public JButton cmdsubmit6;
    public JButton cmdgroup3;
    public JLabel llabel1;
    public JLabel llabel10;
    public JLabel llabel11;
    public JLabel llabel12;
    public JLabel llabel13;
    public JLabel llabel14;
    public JLabel llabel15;
    public JLabel llabel16;
    public JLabel llabel17;
    public JLabel llabel2;
    public JLabel llabel3;
    public JLabel llabel4;
    public JLabel llabel5;
    public JLabel llabel6;
    public JLabel llabel7;
    public JLabel llabel8;
    public JLabel llabel9;
    public JPanel p6;
    public JScrollPane s3;
    public JSlider sliderclosiness1;
    public JSlider slidergroupreact1;
    public JSlider sliderpersonalclosiness1;
    public JTextField txtbirthdate6;
    public JTextArea txtconnectothers1;
    public JTextField txtgroup16;
    public JTextField txtinnetwork1;
    public JTextField txtknownetwork1;
    public JTextField txtname6;
    public JTextField txtregularlyhangout1;
    public JTextField txttrustclosely1;
    public JButton cmdclear7;
    public JButton cmdsubmit7;
    public JLabel ee1;
    public JLabel ee10;
    public JLabel ee11;
    public JLabel ee12;
    public JLabel ee13;
    public JLabel ee14;
    public JLabel ee15;
    public JLabel ee19;
    public JLabel ee2;
    public JLabel ee3;
    public JLabel ee4;
    public JLabel ee5;
    public JLabel ee6;
    public JLabel ee7;
    public JLabel ee8;
    public JLabel ee9;
    public JPanel p7;
    public JSlider jjslider1;
    public JSlider jjslider2;
    public JSlider jjslider3;
    public JSlider jjslider4;
    public JSlider jjslider5;
    public JSlider jjslider6;
    public JTextField txtbirthdate7;
    public JTextField txtgroup17;
    public JTextField txtname7;
    public JButton cmdclear8;
    public JButton cmdsubmit8;
    public JLabel ff1;
    public JLabel ff10;
    public JLabel ff11;
    public JLabel ff12;
    public JLabel ff13;
    public JLabel ff14;
    public JLabel ff15;
    public JLabel ff16;
    public JLabel ff17;
    public JLabel ff18;
    public JLabel ff19;
    public JLabel ff2;
    public JLabel ff3;
    public JLabel ff4;
    public JLabel ff5;
    public JLabel ff6;
    public JLabel ff7;
    public JLabel ff8;
    public JLabel ff9;
    public JPanel p8;
    public JSlider jjs1;
    public JSlider jjs2;
    public JSlider jjs3;
    public JSlider jjs4;
    public JSlider jjs5;
    public JSlider jjs6;
    public JTextField txtbirthdate8;
    public JTextField txtgroup18;
    public JTextField txtname8;
    public JButton cmdclear9;
    public JButton cmdsubmit9;
    public JLabel dd1;
    public JLabel dd10;
    public JLabel dd11;
    public JLabel dd12;
    public JLabel dd13;
    public JLabel dd14;
    public JLabel dd15;
    public JLabel dd16;
    public JLabel dd17;
    public JLabel dd19;
    public JLabel dd2;
    public JLabel dd20;
    public JLabel dd3;
    public JLabel dd4;
    public JLabel dd5;
    public JLabel dd6;
    public JLabel dd7;
    public JLabel dd8;
    public JLabel dd9;
    public JPanel p9;
    public JSlider ddslider1;
    public JSlider ddslider2;
    public JSlider ddslider3;
    public JSlider ddslider4;
    public JSlider ddslider5;
    public JSlider ddslider6;
    public JTextField txtbirthdate9;
    public JTextField txtgroup19;
    public JTextField txtname9;
    public JButton cmdclear10;
    public JButton cmdsubmit10;
    public JLabel cc1;
    public JLabel cc10;
    public JLabel cc11;
    public JLabel cc12;
    public JLabel cc13;
    public JLabel cc14;
    public JLabel cc15;
    public JLabel cc16;
    public JLabel cc2;
    public JLabel cc3;
    public JLabel cc4;
    public JLabel cc5;
    public JLabel cc6;
    public JLabel cc7;
    public JLabel cc8;
    public JLabel cc9;
    public JPanel p10;
    public JSlider ccslider1;
    public JSlider ccslider2;
    public JSlider ccslider3;
    public JSlider ccslider4;
    public JSlider ccslider5;
    public JSlider ccslider6;
    public JTextField txtbirthdate10;
    public JTextField txtgroup110;
    public JTextField txtname10;
    
    public Module3() {
        
        cardPanel = new JPanel();
        cl = new CardLayout();
        cardPanel.setLayout(cl);
        buttonPanel = new JPanel();
        scrollpane2 = new JScrollPane();
        p1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        txtname = new JTextField();
        txtbirthdate = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        txtgroup1 = new JTextField();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        txtinnetwork = new JTextField();
        txtknownetwork = new JTextField();
        txttrustclosely = new JTextField();
        txtregularlyhangout = new JTextField();
        boxhangoutoften = new JComboBox();
        boxknowothers = new JComboBox();
        boxconnectothers = new JComboBox();
        s10 = new JScrollPane();
        txtconnectothers = new JTextArea();
        sliderclosiness = new JSlider();
        sliderpersonalclosiness = new JSlider();
        slidergroupreact = new JSlider();
        cmdclear1 = new JButton();
        cmdsubmit1 = new JButton();
        cmdgroup2 = new JButton();
        cmdnext2 = new JButton();
        cmdprevious2 = new JButton();

        setTitle("Research Module 3");
        setMinimumSize(new Dimension(650, 650));
        setPreferredSize(new Dimension(650, 650));
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        addWindowListener(this);
        
        scrollpane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollpane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        p1.setMinimumSize(new Dimension(1100, 800));
        p1.setPreferredSize(new Dimension(1100, 800));
        p1.setBackground(new Color(240, 255, 255));
        p1.setLayout(null);
        
        label1.setFont(new Font("Serif", 0, 16)); 
        label1.setText("Network Structure-Processes Group 4");
        p1.add(label1);
        label1.setBounds(10, 11, 270, 22);

        label2.setFont(new Font("Serif", 0, 16)); 
        label2.setText("How many people are there in this network?: ");
        p1.add(label2);
        label2.setBounds(10, 181, 274, 22);

        txtname.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtname);
        txtname.setBounds(109, 51, 215, 25);

        txtbirthdate.setFont(new Font("Serif", 0, 14)); 
        txtbirthdate.addFocusListener(this);
        p1.add(txtbirthdate);
        txtbirthdate.setBounds(109, 94, 215, 25);

        label3.setFont(new Font("Serif", 0, 16)); 
        label3.setText("Date of Birth:");
        p1.add(label3);
        label3.setBounds(10, 95, 81, 22);

        label4.setFont(new Font("Serif", 0, 16)); 
        label4.setText("Name:");
        p1.add(label4);
        label4.setBounds(10, 52, 40, 22);

        label5.setFont(new Font("Serif", 0, 16)); 
        label5.setText("Group:");
        p1.add(label5);
        label5.setBounds(10, 138, 42, 22);

        txtgroup1.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtgroup1);
        txtgroup1.setBounds(109, 137, 215, 25);

        label6.setFont(new Font("Serif", 0, 16)); 
        label6.setText("How many people do you know in this network?:");
        p1.add(label6);
        label6.setBounds(10, 224, 297, 22);

        label7.setFont(new Font("Serif", 0, 16)); 
        label7.setText("How many people do you know closely and trust in this network?:");
        p1.add(label7);
        label7.setBounds(10, 267, 398, 22);

        label8.setFont(new Font("Serif", 0, 16)); 
        label8.setText("How many people in this network do you hang out with regularly?:");
        p1.add(label8);
        label8.setBounds(10, 310, 398, 22);

        label9.setFont(new Font("Serif", 0, 16)); 
        label9.setText("How often do you hangout with them?:");
        p1.add(label9);
        label9.setBounds(10, 353, 233, 22);

        label10.setFont(new Font("Serif", 0, 16)); 
        label10.setText("Are there people in the network who seem to know a bunch of people outside the group?");
        p1.add(label10);
        label10.setBounds(10, 396, 538, 22);

        label11.setFont(new Font("Serif", 0, 16)); 
        label11.setText("Has anyone in the group every connected you to someone outside the group?:");
        p1.add(label11);
        label11.setBounds(10, 439, 467, 22);

        label12.setFont(new Font("Serif", 0, 16)); 
        label12.setText("Please give an example of this!:");
        p1.add(label12);
        label12.setBounds(290, 481, 187, 22);

        label13.setFont(new Font("Serif", 0, 16)); 
        label13.setText("How close to each other do you think people are in this group?( scale out of 10):");
        p1.add(label13);
        label13.setBounds(10, 569, 485, 22);

        label14.setFont(new Font("Serif", 0, 16)); 
        label14.setText("How close are you to members of this group?(scale out of 10):");
        p1.add(label14);
        label14.setBounds(10, 637, 377, 22);

        label15.setFont(new Font("Serif", 0, 16)); 
        label15.setText("How would members of this group react if they found out that you were ");
        p1.add(label15);
        label15.setBounds(10, 707, 434, 22);

        label16.setFont(new Font("Serif", 0, 16)); 
        label16.setText("spending time with people from other groups instead of them?(scale out of 10):");
        p1.add(label16);
        label16.setBounds(10, 735, 472, 22);

        txtinnetwork.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtinnetwork);
        txtinnetwork.setBounds(440, 180, 185, 25);

        txtknownetwork.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtknownetwork);
        txtknownetwork.setBounds(440, 223, 185, 25);

        txttrustclosely.setFont(new Font("Serif", 0, 14)); 
        p1.add(txttrustclosely);
        txttrustclosely.setBounds(440, 266, 185, 25);

        txtregularlyhangout.setFont(new Font("Serif", 0, 14));
        p1.add(txtregularlyhangout);
        txtregularlyhangout.setBounds(440, 309, 185, 25);

        boxhangoutoften.setFont(new Font("Serif", 0, 14)); 
        boxhangoutoften.setMaximumRowCount(6);
        boxhangoutoften.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daily", "Weekly", "Monthly", "Every 3-6 Months", "Every 7 months or more" }));
        p1.add(boxhangoutoften);
        boxhangoutoften.setBounds(440, 352, 185, 25);

        boxknowothers.setFont(new Font("Serif", 0, 14)); 
        boxknowothers.setMaximumRowCount(3);
        boxknowothers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p1.add(boxknowothers);
        boxknowothers.setBounds(603, 395, 118, 25);

        boxconnectothers.setFont(new Font("Serif", 0, 14)); 
        boxconnectothers.setMaximumRowCount(3);
        boxconnectothers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p1.add(boxconnectothers);
        boxconnectothers.setBounds(603, 438, 118, 25);

        txtconnectothers.setColumns(20);
        txtconnectothers.setFont(new java.awt.Font("Serif", 0, 14)); 
        txtconnectothers.setRows(5);
        s10.setViewportView(txtconnectothers);
        txtconnectothers.setLineWrap(true);
        txtconnectothers.setWrapStyleWord(true);

        p1.add(s10);
        s10.setBounds(495, 481, 226, 69);

        sliderclosiness.setMajorTickSpacing(2);
        sliderclosiness.setMaximum(10);
        sliderclosiness.setMinorTickSpacing(1);
        sliderclosiness.setPaintLabels(true);
        sliderclosiness.setPaintTicks(true);
        sliderclosiness.setToolTipText("");
        sliderclosiness.setValue(0);
        sliderclosiness.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.add(sliderclosiness);
        sliderclosiness.setBounds(513, 569, 200, 51);

        sliderpersonalclosiness.setMajorTickSpacing(2);
        sliderpersonalclosiness.setMaximum(10);
        sliderpersonalclosiness.setMinorTickSpacing(1);
        sliderpersonalclosiness.setPaintLabels(true);
        sliderpersonalclosiness.setPaintTicks(true);
        sliderpersonalclosiness.setValue(0);
        sliderpersonalclosiness.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.add(sliderpersonalclosiness);
        sliderpersonalclosiness.setBounds(513, 637, 200, 51);

        slidergroupreact.setMajorTickSpacing(2);
        slidergroupreact.setMaximum(10);
        slidergroupreact.setMinorTickSpacing(1);
        slidergroupreact.setPaintLabels(true);
        slidergroupreact.setPaintTicks(true);
        slidergroupreact.setValue(0);
        slidergroupreact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.add(slidergroupreact);
        slidergroupreact.setBounds(513, 706, 200, 51);

        cmdclear1.setFont(new Font("Serif", 0, 14)); 
        cmdclear1.setText("Clear Form");
        cmdclear1.addActionListener(this);
        p1.add(cmdclear1);
        cmdclear1.setBounds(780, 730, 110, 35);

        cmdsubmit1.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit1.setText("Submit");
        cmdsubmit1.addActionListener(this);
        p1.add(cmdsubmit1);
        cmdsubmit1.setBounds(915, 730, 96, 35);
        
        cmdgroup2.setFont(new Font("Serif", 0, 14)); 
        cmdgroup2.setText("Click to Get Group");
        cmdgroup2.addActionListener(this);
        p1.add(cmdgroup2);
        cmdgroup2.setBounds(454, 137, 160, 27);
        
        label17.setFont(new Font("Serif", 0, 16)); 
        label17.setText("Fillout Name and Date of Birth then click the button to get your group:");
        p1.add(label17);
        label17.setBounds(454, 95, 422, 22);
        
        cmdprevious2.setFont(new Font("Serif", 0, 14)); 
        cmdprevious2.setText("Previous");
        cmdprevious2.setName("cmdprevious2");
        cmdprevious2.addActionListener(this);
        buttonPanel.add(cmdprevious2);
        buttonPanel.setBackground(new Color(240, 255, 255));
        
        cmdnext2.setFont(new Font("Serif", 0, 14)); 
        cmdnext2.setText("Next");
        cmdnext2.setName("cmdnext2");
        cmdnext2.addActionListener(this);
        buttonPanel.add(cmdnext2);
        
        p2 = new JPanel();
        txtname2 = new JTextField();
        txtbirthdate2 = new JTextField();
        e3 = new JLabel();
        e4 = new JLabel();
        e5 = new JLabel();
        txtgroup12 = new JTextField();
        e1 = new JLabel();
        e2 = new JLabel();
        e6 = new JLabel();
        slider1 = new JSlider();
        e7 = new JLabel();
        e8 = new JLabel();
        slider2 = new JSlider();
        e9 = new JLabel();
        e10 = new JLabel();
        slider3 = new JSlider();
        e11 = new JLabel();
        slider4 = new JSlider();
        e12 = new JLabel();
        e13 = new JLabel();
        slider5 = new JSlider();
        slider6 = new JSlider();
        e14 = new JLabel();
        e15 = new JLabel();
        cmdclear2 = new JButton();
        cmdsubmit2 = new JButton();
        e19 = new JLabel();

        p2.setMinimumSize(new Dimension(450, 450));
        p2.setPreferredSize(new Dimension(950, 750));
        p2.setBackground(new Color(240, 255, 255));
        p2.setLayout(null);

        txtname2.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtname2);
        txtname2.setBounds(109, 51, 215, 25);

        txtbirthdate2.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtbirthdate2);
        txtbirthdate2.setBounds(109, 94, 215, 25);

        e3.setFont(new Font("Serif", 0, 16)); 
        e3.setText("Date of Birth:");
        p2.add(e3);
        e3.setBounds(10, 95, 81, 22);

        e4.setFont(new java.awt.Font("Serif", 0, 16)); 
        e4.setText("Name:");
        p2.add(e4);
        e4.setBounds(10, 52, 40, 22);

        e5.setFont(new Font("Serif", 0, 16)); 
        e5.setText("Group:");
        p2.add(e5);
        e5.setBounds(10, 138, 42, 22);

        txtgroup12.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtgroup12);
        txtgroup12.setBounds(109, 137, 215, 25);

        e1.setFont(new Font("Serif", 0, 16)); 
        e1.setText("Emotional Resources Group 4");
        p2.add(e1);
        e1.setBounds(10, 11, 210, 22);

        e2.setFont(new Font("Serif", 0, 16)); 
        e2.setText("People in the group are comfortable discussing");
        p2.add(e2);
        e2.setBounds(10, 220, 280, 22);

        e6.setFont(new Font("Serif", 0, 16)); 
        e6.setText("significant problems with each other.");
        p2.add(e6);
        e6.setBounds(10, 246, 218, 22);

        slider1.setMajorTickSpacing(2);
        slider1.setMaximum(10);
        slider1.setMinorTickSpacing(1);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        slider1.setValue(0);
        slider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.add(slider1);
        slider1.setBounds(308, 220, 247, 51);

        e7.setFont(new Font("Serif", 0, 16)); 
        e7.setText("It is easy for people to be honest with each");
        p2.add(e7);
        e7.setBounds(10, 289, 258, 22);

        e8.setFont(new Font("Serif", 0, 16)); 
        e8.setText("other in this group.");
        p2.add(e8);
        e8.setBounds(10, 315, 112, 22);

        slider2.setMajorTickSpacing(2);
        slider2.setMaximum(10);
        slider2.setMinorTickSpacing(1);
        slider2.setPaintLabels(true);
        slider2.setPaintTicks(true);
        slider2.setValue(0);
        slider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.add(slider2);
        slider2.setBounds(308, 289, 247, 51);

        e9.setFont(new Font("Serif", 0, 16)); 
        e9.setText("People in this group accept criticism of faults");
        p2.add(e9);
        e9.setBounds(10, 358, 267, 22);

        e10.setFont(new Font("Serif", 0, 16));
        e10.setText("and mistakes from other people in the group.");
        p2.add(e10);
        e10.setBounds(10, 384, 269, 22);

        slider3.setMajorTickSpacing(2);
        slider3.setMaximum(10);
        slider3.setMinorTickSpacing(1);
        slider3.setPaintLabels(true);
        slider3.setPaintTicks(true);
        slider3.setValue(0);
        slider3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.add(slider3);
        slider3.setBounds(308, 358, 247, 51);

        e11.setFont(new Font("Serif", 0, 16)); 
        e11.setText("People in this group tend to emotionally");
        p2.add(e11);
        e11.setBounds(10, 427, 237, 22);

        slider4.setMajorTickSpacing(2);
        slider4.setMaximum(10);
        slider4.setMinorTickSpacing(1);
        slider4.setPaintLabels(true);
        slider4.setPaintTicks(true);
        slider4.setValue(0);
        slider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.add(slider4);
        slider4.setBounds(308, 427, 247, 51);

        e12.setFont(new Font("Serif", 0, 16)); 
        e12.setText("support each other.");
        p2.add(e12);
        e12.setBounds(10, 453, 117, 22);

        e13.setFont(new Font("Serif", 0, 16)); 
        e13.setText("People in this group trust each other.");
        p2.add(e13);
        e13.setBounds(10, 496, 220, 22);

        slider5.setMajorTickSpacing(2);
        slider5.setMaximum(10);
        slider5.setMinorTickSpacing(1);
        slider5.setPaintLabels(true);
        slider5.setPaintTicks(true);
        slider5.setValue(0);
        slider5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.add(slider5);
        slider5.setBounds(308, 496, 247, 51);

        slider6.setMajorTickSpacing(2);
        slider6.setMaximum(10);
        slider6.setMinorTickSpacing(1);
        slider6.setPaintLabels(true);
        slider6.setPaintTicks(true);
        slider6.setValue(0);
        slider6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.add(slider6);
        slider6.setBounds(308, 565, 247, 51);

        e14.setFont(new Font("Serif", 0, 16)); 
        e14.setText("People tend to accept each other's faults");
        p2.add(e14);
        e14.setBounds(10, 565, 243, 22);

        e15.setFont(new Font("Serif", 0, 16));
        e15.setText("and mistakes.");
        p2.add(e15);
        e15.setBounds(10, 591, 82, 22);

        cmdclear2.setFont(new Font("Serif", 0, 14)); 
        cmdclear2.setText("Clear");
        cmdclear2.addActionListener(this);
        p2.add(cmdclear2);
        cmdclear2.setBounds(690, 585, 116, 35);

        cmdsubmit2.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit2.setText("Submit");
        cmdsubmit2.addActionListener(this);
        p2.add(cmdsubmit2);
        cmdsubmit2.setBounds(830, 585, 117, 35);

        e19.setFont(new Font("Serif", 0, 16)); 
        e19.setText("Please indicate how true the following statements are about emotional resources in this group! (scale is out of 10)");
        p2.add(e19);
        e19.setBounds(10, 180, 676, 22);
        
        p3 = new JPanel();
        f1 = new JLabel();
        f2 = new JLabel();
        f8 = new JLabel();
        f7 = new JLabel();
        js1 = new JSlider();
        f6 = new JLabel();
        js3 = new JSlider();
        f10 = new JLabel();
        f9 = new JLabel();
        js2 = new JSlider();
        f11 = new JLabel();
        js4 = new JSlider();
        f12 = new JLabel();
        txtgroup13 = new JTextField();
        cmdclear3 = new JButton();
        f15 = new JLabel();
        txtname3 = new JTextField();
        cmdsubmit3 = new JButton();
        js5 = new JSlider();
        f3 = new JLabel();
        f13 = new JLabel();
        txtbirthdate3 = new JTextField();
        f14 = new JLabel();
        f5 = new JLabel();
        js6 = new JSlider();
        f4 = new JLabel();
        f16 = new JLabel();
        f17 = new JLabel();
        f18 = new JLabel();
        f19 = new JLabel();

        p3.setMinimumSize(new Dimension(450, 450));
        p3.setPreferredSize(new Dimension(950, 750));
        p3.setBackground(new Color(240, 255, 255));
        p3.setLayout(null);

        f1.setFont(new Font("Serif", 0, 16)); 
        f1.setText("Financial Resources Group 4");
        p3.add(f1);
        f1.setBounds(10, 11, 270, 22);

        f2.setFont(new Font("Serif", 0, 16)); 
        f2.setText("The group would be willing to lend other");
        p3.add(f2);
        f2.setBounds(10, 220, 243, 22);

        f8.setFont(new Font("Serif", 0, 16)); 
        f8.setText("member a car for a couple of weeks.");
        p3.add(f8);
        f8.setBounds(10, 315, 222, 22);

        f7.setFont(new Font("Serif", 0, 16)); 
        f7.setText("The group would be willing to lend a group ");
        p3.add(f7);
        f7.setBounds(10, 289, 262, 22);

        js1.setMajorTickSpacing(2);
        js1.setMaximum(10);
        js1.setMinorTickSpacing(1);
        js1.setPaintLabels(true);
        js1.setPaintTicks(true);
        js1.setValue(0);
        js1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.add(js1);
        js1.setBounds(290, 220, 247, 51);

        f6.setFont(new Font("Serif", 0, 16)); 
        f6.setText("group members $100 in an emergency. ");
        p3.add(f6);
        f6.setBounds(10, 246, 239, 22);

        js3.setMajorTickSpacing(2);
        js3.setMaximum(10);
        js3.setMinorTickSpacing(1);
        js3.setPaintLabels(true);
        js3.setPaintTicks(true);
        js3.setValue(0);
        js3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.add(js3);
        js3.setBounds(290, 358, 247, 51);

        f10.setFont(new Font("Serif", 0, 16)); 
        f10.setText("stay the group would be will to let them live");
        p3.add(f10);
        f10.setBounds(10, 384, 260, 22);

        f9.setFont(new Font("Serif", 0, 16)); 
        f9.setText("If someone in the group needed a place to ");
        p3.add(f9);
        f9.setBounds(10, 358, 257, 22);

        js2.setMajorTickSpacing(2);
        js2.setMaximum(10);
        js2.setMinorTickSpacing(1);
        js2.setPaintLabels(true);
        js2.setPaintTicks(true);
        js2.setValue(0);
        js2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.add(js2);
        js2.setBounds(290, 289, 247, 51);

        f11.setFont(new Font("Serif", 0, 16)); 
        f11.setText("The group has people who could provide");
        p3.add(f11);
        f11.setBounds(10, 465, 248, 22);

        js4.setMajorTickSpacing(2);
        js4.setMaximum(10);
        js4.setMinorTickSpacing(1);
        js4.setPaintLabels(true);
        js4.setPaintTicks(true);
        js4.setValue(0);
        js4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.add(js4);
        js4.setBounds(290, 465, 247, 51);

        f12.setFont(new Font("Serif", 0, 16)); 
        f12.setText("legal advice at a reduced/free rate. ");
        p3.add(f12);
        f12.setBounds(10, 491, 211, 22);

        txtgroup13.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtgroup13);
        txtgroup13.setBounds(109, 137, 215, 25);

        cmdclear3.setFont(new Font("Serif", 0, 14)); 
        cmdclear3.setText("Clear");
        cmdclear3.addActionListener(this);
        p3.add(cmdclear3);
        cmdclear3.setBounds(680, 643, 116, 35);

        f15.setFont(new Font("Serif", 0, 16)); 
        f15.setText("reduced/free rate.");
        p3.add(f15);
        f15.setBounds(10, 649, 107, 22);

        txtname3.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtname3);
        txtname3.setBounds(109, 51, 215, 25);

        cmdsubmit3.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit3.setText("Submit");
        cmdsubmit3.addActionListener(this);
        p3.add(cmdsubmit3);
        cmdsubmit3.setBounds(810, 643, 117, 35);

        js5.setMajorTickSpacing(2);
        js5.setMaximum(10);
        js5.setMinorTickSpacing(1);
        js5.setPaintLabels(true);
        js5.setPaintTicks(true);
        js5.setValue(0);
        js5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.add(js5);
        js5.setBounds(290, 534, 247, 51);

        f3.setFont(new Font("Serif", 0, 16)); 
        f3.setText("Date of Birth:");
        p3.add(f3);
        f3.setBounds(10, 95, 81, 22);

        f13.setFont(new Font("Serif", 0, 16)); 
        f13.setText("If someone in the group needed money to");
        p3.add(f13);
        f13.setBounds(10, 534, 250, 22);

        txtbirthdate3.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtbirthdate3);
        txtbirthdate3.setBounds(109, 94, 215, 25);

        f14.setFont(new Font("Serif", 0, 16)); 
        f14.setText("The group could provide child care at a ");
        p3.add(f14);
        f14.setBounds(10, 623, 241, 22);

        f5.setFont(new Font("Serif", 0, 16)); 
        f5.setText("Group:");
        p3.add(f5);
        f5.setBounds(10, 138, 42, 22);

        js6.setMajorTickSpacing(2);
        js6.setMaximum(10);
        js6.setMinorTickSpacing(1);
        js6.setPaintLabels(true);
        js6.setPaintTicks(true);
        js6.setValue(0);
        js6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.add(js6);
        js6.setBounds(290, 623, 247, 51);

        f4.setFont(new Font("Serif", 0, 16)); 
        f4.setText("Name:");
        p3.add(f4);
        f4.setBounds(10, 52, 40, 22);

        f16.setFont(new java.awt.Font("Serif", 0, 16)); 
        f16.setText("with them for a couple of weeks.");
        p3.add(f16);
        f16.setBounds(10, 415, 197, 22);

        f17.setFont(new java.awt.Font("Serif", 0, 16)); 
        f17.setText("pay the power bill the group would be");
        p3.add(f17);
        f17.setBounds(10, 560, 229, 22);

        f18.setFont(new java.awt.Font("Serif", 0, 16)); 
        f18.setText("willing to help.");
        p3.add(f18);
        f18.setBounds(10, 583, 86, 22);

        f19.setFont(new Font("Serif", 0, 16)); 
        f19.setText("Please indicate how true the following statements are about financial resources in this group! (scale is out of 10)");
        p3.add(f19);
        f19.setBounds(10, 180, 666, 22);

        p4 = new JPanel();
        d1 = new JLabel();
        d2 = new JLabel();
        d3 = new JLabel();
        dslider5 = new JSlider();
        d5 = new JLabel();
        d14 = new JLabel();
        txtbirthdate4 = new JTextField();
        d13 = new JLabel();
        d16 = new JLabel();
        dslider6 = new JSlider();
        d4 = new JLabel();
        d10 = new JLabel();
        dslider3 = new JSlider();
        d6 = new JLabel();
        dslider1 = new JSlider();
        d7 = new JLabel();
        d8 = new JLabel();
        d9 = new JLabel();
        d17 = new JLabel();
        d11 = new JLabel();
        dslider2 = new JSlider();
        d19 = new JLabel();
        d12 = new JLabel();
        dslider4 = new JSlider();
        txtgroup14 = new JTextField();
        cmdclear4 = new JButton();
        d15 = new JLabel();
        txtname4 = new JTextField();
        cmdsubmit4 = new JButton();
        d20 = new JLabel();
        
        p4.setMinimumSize(new Dimension(450, 450));
        p4.setPreferredSize(new Dimension(950, 750));
        p4.setBackground(new Color(240, 255, 255));
        p4.setLayout(null);

        d1.setFont(new Font("Serif", 0, 16)); 
        d1.setText("Drug Habits Group 4");
        p4.add(d1);
        d1.setBounds(10, 11, 170, 22);

        d2.setFont(new Font("Serif", 0, 16));
        d2.setText("A group member arrives visibly drunk/high");
        p4.add(d2);
        d2.setBounds(10, 220, 255, 22);

        d3.setFont(new Font("Serif", 0, 16)); 
        d3.setText("Date of Birth:");
        p4.add(d3);
        d3.setBounds(10, 95, 81, 22);

        dslider5.setMajorTickSpacing(2);
        dslider5.setMaximum(10);
        dslider5.setMinorTickSpacing(1);
        dslider5.setPaintLabels(true);
        dslider5.setPaintTicks(true);
        dslider5.setValue(0);
        dslider5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.add(dslider5);
        dslider5.setBounds(338, 539, 247, 51);

        d5.setFont(new Font("Serif", 0, 16)); 
        d5.setText("Group:");
        p4.add(d5);
        d5.setBounds(10, 138, 42, 22);

        d14.setFont(new Font("Serif", 0, 16)); 
        d14.setText("A group member tells the group that they had");
        p4.add(d14);
        d14.setBounds(10, 608, 272, 22);

        txtbirthdate4.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtbirthdate4);
        txtbirthdate4.setBounds(109, 94, 215, 25);

        d13.setFont(new Font("Serif", 0, 16)); 
        d13.setText("A group member tells the group: \"I unwind");
        p4.add(d13);
        d13.setBounds(10, 539, 255, 22);

        d16.setFont(new Font("Serif", 0, 16)); 
        d16.setText("it doesn't become a habit.\"");
        p4.add(d16);
        d16.setBounds(10, 430, 159, 22);

        dslider6.setMajorTickSpacing(2);
        dslider6.setMaximum(10);
        dslider6.setMinorTickSpacing(1);
        dslider6.setPaintLabels(true);
        dslider6.setPaintTicks(true);
        dslider6.setValue(0);
        dslider6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.add(dslider6);
        dslider6.setBounds(338, 608, 247, 51);

        d4.setFont(new Font("Serif", 0, 16)); 
        d4.setText("Name:");
        p4.add(d4);
        d4.setBounds(10, 52, 40, 22);

        d10.setFont(new Font("Serif", 0, 16)); 
        d10.setText("wrong with recreational drug use as long as");
        p4.add(d10);
        d10.setBounds(10, 399, 259, 22);

        dslider3.setMajorTickSpacing(2);
        dslider3.setMaximum(10);
        dslider3.setMinorTickSpacing(1);
        dslider3.setPaintLabels(true);
        dslider3.setPaintTicks(true);
        dslider3.setValue(0);
        dslider3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.add(dslider3);
        dslider3.setBounds(338, 373, 247, 51);

        d6.setFont(new Font("Serif", 0, 16)); 
        d6.setText("to a group get together.");
        p4.add(d6);
        d6.setBounds(10, 246, 141, 22);

        dslider1.setMajorTickSpacing(2);
        dslider1.setMaximum(10);
        dslider1.setMinorTickSpacing(1);
        dslider1.setPaintLabels(true);
        dslider1.setPaintTicks(true);
        dslider1.setValue(0);
        dslider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.add(dslider1);
        dslider1.setBounds(338, 220, 247, 51);

        d7.setFont(new Font("Serif", 0, 16)); 
        d7.setText("The group finds out that another group ");
        p4.add(d7);
        d7.setBounds(10, 289, 235, 22);

        d8.setFont(new Font("Serif", 0, 16)); 
        d8.setText("member is friends with someone who uses");
        p4.add(d8);
        d8.setBounds(10, 315, 253, 22);

        d9.setFont(new Font("Serif", 0, 16)); 
        d9.setText("A group member states: \"there is nothing");
        p4.add(d9);
        d9.setBounds(10, 373, 243, 22);

        d17.setFont(new Font("Serif", 0, 16)); 
        d17.setText("with a joint after a long, hard day at work.\"");
        p4.add(d17);
        d17.setBounds(10, 565, 258, 22);

        d11.setFont(new Font("Serif", 0, 16)); 
        d11.setText("A group member tells the group that they enjoyed");
        p4.add(d11);
        d11.setBounds(10, 470, 298, 22);

        dslider2.setMajorTickSpacing(2);
        dslider2.setMaximum(10);
        dslider2.setMinorTickSpacing(1);
        dslider2.setPaintLabels(true);
        dslider2.setPaintTicks(true);
        dslider2.setValue(0);
        dslider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.add(dslider2);
        dslider2.setBounds(338, 289, 247, 51);

        d19.setFont(new Font("Serif", 0, 16)); 
        d19.setText("Please indicate how true the following statements are about drug habits in this group! (scale is out of 10)");
        p4.add(d19);
        d19.setBounds(10, 180, 622, 22);

        d12.setFont(new Font("Serif", 0, 16)); 
        d12.setText("a party where there was excessive drinking.");
        p4.add(d12);
        d12.setBounds(10, 496, 262, 22);

        dslider4.setMajorTickSpacing(2);
        dslider4.setMaximum(10);
        dslider4.setMinorTickSpacing(1);
        dslider4.setPaintLabels(true);
        dslider4.setPaintTicks(true);
        dslider4.setValue(0);
        dslider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.add(dslider4);
        dslider4.setBounds(338, 470, 247, 51);

        txtgroup14.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtgroup14);
        txtgroup14.setBounds(109, 137, 215, 25);

        cmdclear4.setFont(new Font("Serif", 0, 14)); 
        cmdclear4.setText("Clear ");
        cmdclear4.addActionListener(this);
        p4.add(cmdclear4);
        cmdclear4.setBounds(700, 628, 116, 35);

        d15.setFont(new Font("Serif", 0, 16)); 
        d15.setText("gotten a DUI.");
        p4.add(d15);
        d15.setBounds(10, 634, 83, 22);

        txtname4.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtname4);
        txtname4.setBounds(109, 51, 215, 25);

        cmdsubmit4.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit4.setText("Submit");
        cmdsubmit4.addActionListener(this);
        p4.add(cmdsubmit4);
        cmdsubmit4.setBounds(830, 628, 117, 35);

        d20.setFont(new Font("Serif", 0, 16)); 
        d20.setText("or sells illegal drugs.");
        p4.add(d20);
        d20.setBounds(10, 338, 120, 22);
        
        p5 = new JPanel();
        c1 = new JLabel();
        c2 = new JLabel();
        c3 = new JLabel();
        c4 = new JLabel();
        c5 = new JLabel();
        c6 = new JLabel();
        cslider1 = new JSlider();
        c7 = new JLabel();
        cslider2 = new JSlider();
        c8 = new JLabel();
        cslider3 = new JSlider();
        c9 = new JLabel();
        c10 = new JLabel();
        c11 = new JLabel();
        cslider4 = new JSlider();
        c12 = new JLabel();
        c13 = new JLabel();
        c14 = new JLabel();
        cslider5 = new JSlider();
        c15 = new JLabel();
        c16 = new JLabel();
        cslider6 = new JSlider();
        cmdclear5 = new JButton();
        cmdsubmit5 = new JButton();
        txtname5 = new JTextField();
        txtbirthdate5 = new JTextField();
        txtgroup15 = new JTextField();
        
        p5.setMinimumSize(new Dimension(450, 450));
        p5.setPreferredSize(new Dimension(950, 750));
        p5.setBackground(new Color(240, 255, 255));
        p5.setLayout(null);
        
        c1.setFont(new Font("Serif", 0, 16)); 
        c1.setText("Cultural Resources Group 4");
        p5.add(c1);
        c1.setBounds(10, 11, 200, 22);

        c2.setFont(new Font("Serif", 0, 16)); 
        c2.setText("Name:");
        p5.add(c2);
        c2.setBounds(10, 51, 40, 22);

        c3.setFont(new Font("Serif", 0, 16)); 
        c3.setText("Date of Birth:");
        p5.add(c3);
        c3.setBounds(10, 91, 81, 22);

        c4.setFont(new Font("Serif", 0, 16)); 
        c4.setText("Group:");
        p5.add(c4);
        c4.setBounds(10, 131, 50, 22);

        c5.setFont(new Font("Serif", 0, 16)); 
        c5.setText("People in this group do not talk about books and/or keep");
        p5.add(c5);
        c5.setBounds(10, 171, 345, 22);

        c6.setFont(new Font("Serif", 0, 16)); 
        c6.setText("up with current events on the internet, television, or radio.");
        p5.add(c6);
        c6.setBounds(10, 199, 344, 22);

        cslider1.setFont(new Font("Serif", 0, 14)); 
        cslider1.setMajorTickSpacing(2);
        cslider1.setMaximum(10);
        cslider1.setMinorTickSpacing(1);
        cslider1.setPaintLabels(true);
        cslider1.setPaintTicks(true);
        cslider1.setValue(0);
        cslider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.add(cslider1);
        cslider1.setBounds(408, 171, 217, 56);

        c7.setFont(new Font("Serif", 0, 16)); 
        c7.setText("People in this group often volunteer for charity or ");
        p5.add(c7);
        c7.setBounds(10, 247, 350, 22);

        cslider2.setFont(new Font("Serif", 0, 14)); 
        cslider2.setMajorTickSpacing(2);
        cslider2.setMaximum(10);
        cslider2.setMinorTickSpacing(1);
        cslider2.setPaintLabels(true);
        cslider2.setPaintTicks(true);
        cslider2.setValue(0);
        cslider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.add(cslider2);
        cslider2.setBounds(408, 245, 217, 56);

        c8.setFont(new Font("Serif", 0, 16)); 
        c8.setText("community events (e.g. Relay for Life, Feed the Hungry).");
        p5.add(c8);
        c8.setBounds(10, 273, 349, 22);

        cslider3.setFont(new Font("Serif", 0, 14)); 
        cslider3.setMajorTickSpacing(2);
        cslider3.setMaximum(10);
        cslider3.setMinorTickSpacing(1);
        cslider3.setPaintLabels(true);
        cslider3.setPaintTicks(true);
        cslider3.setValue(0);
        cslider3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.add(cslider3);
        cslider3.setBounds(408, 319, 217, 56);

        c9.setFont(new Font("Serif", 0, 16)); 
        c9.setText("People in this group tend not to go to plays,");
        p5.add(c9);
        c9.setBounds(10, 319, 262, 22);

        c10.setFont(new Font("Serif", 0, 16)); 
        c10.setText(" art performances, musesums or musicals.");
        p5.add(c10);
        c10.setBounds(10, 347, 250, 22);

        c11.setFont(new Font("Serif", 0, 16)); 
        c11.setText("People in this group tend to be connected to \"important\"");
        p5.add(c11);
        c11.setBounds(10, 393, 337, 22);

        cslider4.setFont(new Font("Serif", 0, 14)); 
        cslider4.setMajorTickSpacing(2);
        cslider4.setMaximum(10);
        cslider4.setMinorTickSpacing(1);
        cslider4.setPaintLabels(true);
        cslider4.setPaintTicks(true);
        cslider4.setValue(0);
        cslider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.add(cslider4);
        cslider4.setBounds(408, 393, 217, 56);

        c12.setFont(new Font("Serif", 0, 16)); 
        c12.setText("members in the communty (e.g. doctors, lawyers, ");
        p5.add(c12);
        c12.setBounds(10, 421, 300, 22);

        c13.setFont(new Font("Serif", 0, 16)); 
        c13.setText("and local politicians).");
        p5.add(c13);
        c13.setBounds(10, 455, 126, 22);

        c14.setFont(new Font("Serif", 0, 16)); 
        c14.setText("People in the group tend not to be college-educated.");
        p5.add(c14);
        c14.setBounds(10, 495, 316, 22);

        cslider5.setFont(new Font("Serif", 0, 14)); 
        cslider5.setMajorTickSpacing(2);
        cslider5.setMaximum(10);
        cslider5.setMinorTickSpacing(1);
        cslider5.setPaintLabels(true);
        cslider5.setPaintTicks(true);
        cslider5.setValue(0);
        cslider5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.add(cslider5);
        cslider5.setBounds(408, 495, 217, 56);

        c15.setFont(new Font("Serif", 0, 16)); 
        c15.setText("People in this group often go to the community library ");
        p5.add(c15);
        c15.setBounds(10, 569, 325, 22);

        c16.setFont(new Font("Serif", 0, 16)); 
        c16.setText("to check out books or use library resources.");
        p5.add(c16);
        c16.setBounds(10, 595, 266, 22);

        cslider6.setFont(new Font("Serif", 0, 14)); 
        cslider6.setMajorTickSpacing(2);
        cslider6.setMaximum(10);
        cslider6.setMinorTickSpacing(1);
        cslider6.setPaintLabels(true);
        cslider6.setPaintTicks(true);
        cslider6.setValue(0);
        cslider6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.add(cslider6);
        cslider6.setBounds(408, 569, 217, 56);

        cmdclear5.setFont(new Font("Serif", 0, 14)); 
        cmdclear5.addActionListener(this);
        cmdclear5.setText("Clear");
        p5.add(cmdclear5);
        cmdclear5.setBounds(718, 597, 90, 35);

        cmdsubmit5.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit5.addActionListener(this);
        cmdsubmit5.setText("Submit");
        p5.add(cmdsubmit5);
        cmdsubmit5.setBounds(827, 597, 100, 35);
        
        txtname5.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtname5);
        txtname5.setBounds(109, 51, 215, 25);

        txtbirthdate5.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtbirthdate5);
        txtbirthdate5.setBounds(109, 94, 215, 25);

        txtgroup15.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtgroup15);
        txtgroup15.setBounds(109, 137, 215, 25);
        
        p6 = new JPanel();
        llabel1 = new JLabel();
        llabel2 = new JLabel();
        txtname6 = new JTextField();
        txtbirthdate6 = new JTextField();
        llabel3 = new JLabel();
        llabel4 = new JLabel();
        llabel5 = new JLabel();
        txtgroup16 = new JTextField();
        llabel6 = new JLabel();
        llabel7 = new JLabel();
        llabel8 = new JLabel();
        llabel9 = new JLabel();
        llabel10 = new JLabel();
        llabel11 = new JLabel();
        llabel12 = new JLabel();
        llabel13 = new JLabel();
        llabel14 = new JLabel();
        llabel15 = new JLabel();
        llabel16 = new JLabel();
        llabel17 = new JLabel();
        txtinnetwork1 = new JTextField();
        txtknownetwork1 = new JTextField();
        txttrustclosely1 = new JTextField();
        txtregularlyhangout1 = new JTextField();
        boxhangoutoften1 = new JComboBox();
        boxknowothers1 = new JComboBox();
        boxconnectothers1 = new JComboBox();
        s3 = new JScrollPane();
        txtconnectothers1 = new JTextArea();
        sliderclosiness1 = new JSlider();
        sliderpersonalclosiness1 = new JSlider();
        slidergroupreact1 = new JSlider();
        cmdclear6 = new JButton();
        cmdsubmit6 = new JButton();
        cmdgroup3 = new JButton();

        p6.setMinimumSize(new Dimension(1100, 800));
        p6.setPreferredSize(new Dimension(1100, 800));
        p6.setBackground(new Color(240, 255, 255));
        p6.setLayout(null);
        
        llabel1.setFont(new Font("Serif", 0, 16)); 
        llabel1.setText("Network Structure-Processes Group 5");
        p6.add(llabel1);
        llabel1.setBounds(10, 11, 280, 22);

        llabel2.setFont(new Font("Serif", 0, 16)); 
        llabel2.setText("How many people are there in this network?: ");
        p6.add(llabel2);
        llabel2.setBounds(10, 181, 274, 22);

        txtname6.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtname6);
        txtname6.setBounds(109, 51, 215, 25);

        txtbirthdate6.setFont(new Font("Serif", 0, 14)); 
        txtbirthdate6.addFocusListener(this);
        p6.add(txtbirthdate6);
        txtbirthdate6.setBounds(109, 94, 215, 25);

        llabel3.setFont(new Font("Serif", 0, 16)); 
        llabel3.setText("Date of Birth:");
        p6.add(llabel3);
        llabel3.setBounds(10, 95, 81, 22);

        llabel4.setFont(new Font("Serif", 0, 16)); 
        llabel4.setText("Name:");
        p6.add(llabel4);
        llabel4.setBounds(10, 52, 40, 22);

        llabel5.setFont(new Font("Serif", 0, 16)); 
        llabel5.setText("Group:");
        p6.add(llabel5);
        llabel5.setBounds(10, 138, 42, 22);

        txtgroup16.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtgroup16);
        txtgroup16.setBounds(109, 137, 215, 25);

        llabel6.setFont(new Font("Serif", 0, 16)); 
        llabel6.setText("How many people do you know in this network?:");
        p6.add(llabel6);
        llabel6.setBounds(10, 224, 297, 22);

        llabel7.setFont(new Font("Serif", 0, 16)); 
        llabel7.setText("How many people do you know closely and trust in this network?:");
        p6.add(llabel7);
        llabel7.setBounds(10, 267, 398, 22);

        llabel8.setFont(new Font("Serif", 0, 16)); 
        llabel8.setText("How many people in this network do you hang out with regularly?:");
        p6.add(llabel8);
        llabel8.setBounds(10, 310, 398, 22);

        llabel9.setFont(new Font("Serif", 0, 16)); 
        llabel9.setText("How often do you hangout with them?:");
        p6.add(llabel9);
        llabel9.setBounds(10, 353, 233, 22);

        llabel10.setFont(new Font("Serif", 0, 16)); 
        llabel10.setText("Are there people in the network who seem to know a bunch of people outside the group?");
        p6.add(llabel10);
        llabel10.setBounds(10, 396, 538, 22);

        llabel11.setFont(new Font("Serif", 0, 16)); 
        llabel11.setText("Has anyone in the group every connected you to someone outside the group?:");
        p6.add(llabel11);
        llabel11.setBounds(10, 439, 467, 22);

        llabel12.setFont(new Font("Serif", 0, 16)); 
        llabel12.setText("Please give an example of this!:");
        p6.add(llabel12);
        llabel12.setBounds(290, 481, 187, 22);

        llabel13.setFont(new Font("Serif", 0, 16)); 
        llabel13.setText("How close to each other do you think people are in this group?( scale out of 10):");
        p6.add(llabel13);
        llabel13.setBounds(10, 569, 485, 22);

        llabel14.setFont(new Font("Serif", 0, 16)); 
        llabel14.setText("How close are you to members of this group?(scale out of 10):");
        p6.add(llabel14);
        llabel14.setBounds(10, 637, 377, 22);

        llabel15.setFont(new Font("Serif", 0, 16)); 
        llabel15.setText("How would members of this group react if they found out that you were ");
        p6.add(llabel15);
        llabel15.setBounds(10, 707, 434, 22);

        llabel16.setFont(new Font("Serif", 0, 16)); 
        llabel16.setText("spending time with people from other groups instead of them?(scale out of 10):");
        p6.add(llabel16);
        llabel16.setBounds(10, 735, 472, 22);

        txtinnetwork1.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtinnetwork1);
        txtinnetwork1.setBounds(440, 180, 185, 25);

        txtknownetwork1.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtknownetwork1);
        txtknownetwork1.setBounds(440, 223, 185, 25);

        txttrustclosely1.setFont(new Font("Serif", 0, 14)); 
        p6.add(txttrustclosely1);
        txttrustclosely1.setBounds(440, 266, 185, 25);

        txtregularlyhangout1.setFont(new Font("Serif", 0, 14));
        p6.add(txtregularlyhangout1);
        txtregularlyhangout1.setBounds(440, 309, 185, 25);

        boxhangoutoften1.setFont(new Font("Serif", 0, 14)); 
        boxhangoutoften1.setMaximumRowCount(6);
        boxhangoutoften1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daily", "Weekly", "Monthly", "Every 3-6 Months", "Every 7 months or more" }));
        p6.add(boxhangoutoften1);
        boxhangoutoften1.setBounds(440, 352, 185, 25);

        boxknowothers1.setFont(new Font("Serif", 0, 14)); 
        boxknowothers1.setMaximumRowCount(3);
        boxknowothers1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p6.add(boxknowothers1);
        boxknowothers1.setBounds(603, 395, 118, 25);

        boxconnectothers1.setFont(new Font("Serif", 0, 14)); 
        boxconnectothers1.setMaximumRowCount(3);
        boxconnectothers1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p6.add(boxconnectothers1);
        boxconnectothers1.setBounds(603, 438, 118, 25);

        txtconnectothers1.setColumns(20);
        txtconnectothers1.setFont(new java.awt.Font("Serif", 0, 14)); 
        txtconnectothers1.setRows(5);
        s3.setViewportView(txtconnectothers1);
        txtconnectothers1.setLineWrap(true);
        txtconnectothers1.setWrapStyleWord(true);

        p6.add(s3);
        s3.setBounds(495, 481, 226, 69);

        sliderclosiness1.setMajorTickSpacing(2);
        sliderclosiness1.setMaximum(10);
        sliderclosiness1.setMinorTickSpacing(1);
        sliderclosiness1.setPaintLabels(true);
        sliderclosiness1.setPaintTicks(true);
        sliderclosiness1.setToolTipText("");
        sliderclosiness1.setValue(0);
        sliderclosiness1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p6.add(sliderclosiness1);
        sliderclosiness1.setBounds(513, 569, 200, 51);

        sliderpersonalclosiness1.setMajorTickSpacing(2);
        sliderpersonalclosiness1.setMaximum(10);
        sliderpersonalclosiness1.setMinorTickSpacing(1);
        sliderpersonalclosiness1.setPaintLabels(true);
        sliderpersonalclosiness1.setPaintTicks(true);
        sliderpersonalclosiness1.setValue(0);
        sliderpersonalclosiness1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p6.add(sliderpersonalclosiness1);
        sliderpersonalclosiness1.setBounds(513, 637, 200, 51);

        slidergroupreact1.setMajorTickSpacing(2);
        slidergroupreact1.setMaximum(10);
        slidergroupreact1.setMinorTickSpacing(1);
        slidergroupreact1.setPaintLabels(true);
        slidergroupreact1.setPaintTicks(true);
        slidergroupreact1.setValue(0);
        slidergroupreact1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p6.add(slidergroupreact1);
        slidergroupreact1.setBounds(513, 706, 200, 51);

        cmdclear6.setFont(new Font("Serif", 0, 14)); 
        cmdclear6.setText("Clear Form");
        cmdclear6.addActionListener(this);
        p6.add(cmdclear6);
        cmdclear6.setBounds(780, 730, 110, 35);

        cmdsubmit6.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit6.setText("Submit");
        cmdsubmit6.addActionListener(this);
        p6.add(cmdsubmit6);
        cmdsubmit6.setBounds(915, 730, 96, 35);
        
        cmdgroup3.setFont(new Font("Serif", 0, 14)); 
        cmdgroup3.setText("Click to Get Group");
        cmdgroup3.addActionListener(this);
        p6.add(cmdgroup3);
        cmdgroup3.setBounds(454, 137, 160, 27);
        
        llabel17.setFont(new Font("Serif", 0, 16)); 
        llabel17.setText("Fillout Name and Date of Birth then click the button to get your group:");
        p6.add(llabel17);
        llabel17.setBounds(454, 95, 422, 22);
        
        p7 = new JPanel();
        txtname7 = new JTextField();
        txtbirthdate7 = new JTextField();
        ee3 = new JLabel();
        ee4 = new JLabel();
        ee5 = new JLabel();
        txtgroup17 = new JTextField();
        ee1 = new JLabel();
        ee2 = new JLabel();
        ee6 = new JLabel();
        jjslider1 = new JSlider();
        ee7 = new JLabel();
        ee8 = new JLabel();
        jjslider2 = new JSlider();
        ee9 = new JLabel();
        ee10 = new JLabel();
        jjslider3 = new JSlider();
        ee11 = new JLabel();
        jjslider4 = new JSlider();
        ee12 = new JLabel();
        ee13 = new JLabel();
        jjslider5 = new JSlider();
        jjslider6 = new JSlider();
        ee14 = new JLabel();
        ee15 = new JLabel();
        cmdclear7 = new JButton();
        cmdsubmit7 = new JButton();
        ee19 = new JLabel();

        p7.setMinimumSize(new Dimension(450, 450));
        p7.setPreferredSize(new Dimension(950, 750));
        p7.setBackground(new Color(240, 255, 255));
        p7.setLayout(null);

        txtname7.setFont(new Font("Serif", 0, 14)); 
        p7.add(txtname7);
        txtname7.setBounds(109, 51, 215, 25);

        txtbirthdate7.setFont(new Font("Serif", 0, 14)); 
        p7.add(txtbirthdate7);
        txtbirthdate7.setBounds(109, 94, 215, 25);

        ee3.setFont(new Font("Serif", 0, 16)); 
        ee3.setText("Date of Birth:");
        p7.add(ee3);
        ee3.setBounds(10, 95, 81, 22);

        ee4.setFont(new java.awt.Font("Serif", 0, 16)); 
        ee4.setText("Name:");
        p7.add(ee4);
        ee4.setBounds(10, 52, 40, 22);

        ee5.setFont(new Font("Serif", 0, 16)); 
        ee5.setText("Group:");
        p7.add(ee5);
        ee5.setBounds(10, 138, 42, 22);

        txtgroup17.setFont(new Font("Serif", 0, 14)); 
        p7.add(txtgroup17);
        txtgroup17.setBounds(109, 137, 215, 25);

        ee1.setFont(new Font("Serif", 0, 16)); 
        ee1.setText("Emotional Resources Group 5");
        p7.add(ee1);
        ee1.setBounds(10, 11, 210, 22);

        ee2.setFont(new Font("Serif", 0, 16)); 
        ee2.setText("People in the group are comfortable discussing");
        p7.add(ee2);
        ee2.setBounds(10, 220, 280, 22);

        ee6.setFont(new Font("Serif", 0, 16)); 
        ee6.setText("significant problems with each other.");
        p7.add(ee6);
        ee6.setBounds(10, 246, 218, 22);

        jjslider1.setMajorTickSpacing(2);
        jjslider1.setMaximum(10);
        jjslider1.setMinorTickSpacing(1);
        jjslider1.setPaintLabels(true);
        jjslider1.setPaintTicks(true);
        jjslider1.setValue(0);
        jjslider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(jjslider1);
        jjslider1.setBounds(308, 220, 247, 51);

        ee7.setFont(new Font("Serif", 0, 16)); 
        ee7.setText("It is easy for people to be honest with each");
        p7.add(ee7);
        ee7.setBounds(10, 289, 258, 22);

        ee8.setFont(new Font("Serif", 0, 16)); 
        ee8.setText("other in this group.");
        p7.add(ee8);
        ee8.setBounds(10, 315, 112, 22);

        jjslider2.setMajorTickSpacing(2);
        jjslider2.setMaximum(10);
        jjslider2.setMinorTickSpacing(1);
        jjslider2.setPaintLabels(true);
        jjslider2.setPaintTicks(true);
        jjslider2.setValue(0);
        jjslider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(jjslider2);
        jjslider2.setBounds(308, 289, 247, 51);

        ee9.setFont(new Font("Serif", 0, 16)); 
        ee9.setText("People in this group accept criticism of faults");
        p7.add(ee9);
        ee9.setBounds(10, 358, 267, 22);

        e10.setFont(new Font("Serif", 0, 16));
        ee10.setText("and mistakes from other people in the group.");
        p7.add(ee10);
        ee10.setBounds(10, 384, 269, 22);

        jjslider3.setMajorTickSpacing(2);
        jjslider3.setMaximum(10);
        jjslider3.setMinorTickSpacing(1);
        jjslider3.setPaintLabels(true);
        jjslider3.setPaintTicks(true);
        jjslider3.setValue(0);
        jjslider3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(jjslider3);
        jjslider3.setBounds(308, 358, 247, 51);

        ee11.setFont(new Font("Serif", 0, 16)); 
        ee11.setText("People in this group tend to emotionally");
        p7.add(ee11);
        ee11.setBounds(10, 427, 237, 22);

        jjslider4.setMajorTickSpacing(2);
        jjslider4.setMaximum(10);
        jjslider4.setMinorTickSpacing(1);
        jjslider4.setPaintLabels(true);
        jjslider4.setPaintTicks(true);
        jjslider4.setValue(0);
        jjslider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(jjslider4);
        jjslider4.setBounds(308, 427, 247, 51);

        ee12.setFont(new Font("Serif", 0, 16)); 
        ee12.setText("support each other.");
        p7.add(ee12);
        ee12.setBounds(10, 453, 117, 22);

        ee13.setFont(new Font("Serif", 0, 16)); 
        ee13.setText("People in this group trust each other.");
        p7.add(ee13);
        ee13.setBounds(10, 496, 220, 22);

        jjslider5.setMajorTickSpacing(2);
        jjslider5.setMaximum(10);
        jjslider5.setMinorTickSpacing(1);
        jjslider5.setPaintLabels(true);
        jjslider5.setPaintTicks(true);
        jjslider5.setValue(0);
        jjslider5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(jjslider5);
        jjslider5.setBounds(308, 496, 247, 51);

        jjslider6.setMajorTickSpacing(2);
        jjslider6.setMaximum(10);
        jjslider6.setMinorTickSpacing(1);
        jjslider6.setPaintLabels(true);
        jjslider6.setPaintTicks(true);
        jjslider6.setValue(0);
        jjslider6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(jjslider6);
        jjslider6.setBounds(308, 565, 247, 51);

        ee14.setFont(new Font("Serif", 0, 16)); 
        ee14.setText("People tend to accept each other's faults");
        p7.add(ee14);
        ee14.setBounds(10, 565, 243, 22);

        ee15.setFont(new Font("Serif", 0, 16));
        ee15.setText("and mistakes.");
        p7.add(ee15);
        ee15.setBounds(10, 591, 82, 22);

        cmdclear7.setFont(new Font("Serif", 0, 14)); 
        cmdclear7.setText("Clear");
        cmdclear7.addActionListener(this);
        p7.add(cmdclear7);
        cmdclear7.setBounds(690, 585, 116, 35);

        cmdsubmit7.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit7.setText("Submit");
        cmdsubmit7.addActionListener(this);
        p7.add(cmdsubmit7);
        cmdsubmit7.setBounds(830, 585, 117, 35);

        ee19.setFont(new Font("Serif", 0, 16)); 
        ee19.setText("Please indicate how true the following statements are about emotional resources in this group! (scale is out of 10)");
        p7.add(ee19);
        ee19.setBounds(10, 180, 676, 22);
        
        p8 = new JPanel();
        ff1 = new JLabel();
        ff2 = new JLabel();
        ff8 = new JLabel();
        ff7 = new JLabel();
        jjs1 = new JSlider();
        ff6 = new JLabel();
        jjs3 = new JSlider();
        ff10 = new JLabel();
        ff9 = new JLabel();
        jjs2 = new JSlider();
        ff11 = new JLabel();
        jjs4 = new JSlider();
        ff12 = new JLabel();
        txtgroup18 = new JTextField();
        cmdclear8 = new JButton();
        ff15 = new JLabel();
        txtname8 = new JTextField();
        cmdsubmit8 = new JButton();
        jjs5 = new JSlider();
        ff3 = new JLabel();
        ff13 = new JLabel();
        txtbirthdate8 = new JTextField();
        ff14 = new JLabel();
        ff5 = new JLabel();
        jjs6 = new JSlider();
        ff4 = new JLabel();
        ff16 = new JLabel();
        ff17 = new JLabel();
        ff18 = new JLabel();
        ff19 = new JLabel();

        p8.setMinimumSize(new Dimension(450, 450));
        p8.setPreferredSize(new Dimension(950, 750));
        p8.setBackground(new Color(240, 255, 255));
        p8.setLayout(null);

        ff1.setFont(new Font("Serif", 0, 16)); 
        ff1.setText("Financial Resources Group 5");
        p8.add(ff1);
        ff1.setBounds(10, 11, 270, 22);

        ff2.setFont(new Font("Serif", 0, 16)); 
        ff2.setText("The group would be willing to lend other");
        p8.add(ff2);
        ff2.setBounds(10, 220, 243, 22);

        ff8.setFont(new Font("Serif", 0, 16)); 
        ff8.setText("member a car for a couple of weeks.");
        p8.add(ff8);
        ff8.setBounds(10, 315, 222, 22);

        ff7.setFont(new Font("Serif", 0, 16)); 
        ff7.setText("The group would be willing to lend a group ");
        p8.add(ff7);
        ff7.setBounds(10, 289, 262, 22);

        jjs1.setMajorTickSpacing(2);
        jjs1.setMaximum(10);
        jjs1.setMinorTickSpacing(1);
        jjs1.setPaintLabels(true);
        jjs1.setPaintTicks(true);
        jjs1.setValue(0);
        jjs1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(jjs1);
        jjs1.setBounds(290, 220, 247, 51);

        ff6.setFont(new Font("Serif", 0, 16)); 
        ff6.setText("group members $100 in an emergency. ");
        p8.add(ff6);
        ff6.setBounds(10, 246, 239, 22);

        jjs3.setMajorTickSpacing(2);
        jjs3.setMaximum(10);
        jjs3.setMinorTickSpacing(1);
        jjs3.setPaintLabels(true);
        jjs3.setPaintTicks(true);
        jjs3.setValue(0);
        jjs3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(jjs3);
        jjs3.setBounds(290, 358, 247, 51);

        ff10.setFont(new Font("Serif", 0, 16)); 
        ff10.setText("stay the group would be will to let them live");
        p8.add(ff10);
        ff10.setBounds(10, 384, 260, 22);

        ff9.setFont(new Font("Serif", 0, 16)); 
        ff9.setText("If someone in the group needed a place to ");
        p8.add(ff9);
        ff9.setBounds(10, 358, 257, 22);

        jjs2.setMajorTickSpacing(2);
        jjs2.setMaximum(10);
        jjs2.setMinorTickSpacing(1);
        jjs2.setPaintLabels(true);
        jjs2.setPaintTicks(true);
        jjs2.setValue(0);
        jjs2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(jjs2);
        jjs2.setBounds(290, 289, 247, 51);

        ff11.setFont(new Font("Serif", 0, 16)); 
        ff11.setText("The group has people who could provide");
        p8.add(ff11);
        ff11.setBounds(10, 465, 248, 22);

        jjs4.setMajorTickSpacing(2);
        jjs4.setMaximum(10);
        jjs4.setMinorTickSpacing(1);
        jjs4.setPaintLabels(true);
        jjs4.setPaintTicks(true);
        jjs4.setValue(0);
        jjs4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(jjs4);
        jjs4.setBounds(290, 465, 247, 51);

        ff12.setFont(new Font("Serif", 0, 16)); 
        ff12.setText("legal advice at a reduced/free rate. ");
        p8.add(ff12);
        ff12.setBounds(10, 491, 211, 22);

        txtgroup18.setFont(new Font("Serif", 0, 14)); 
        p8.add(txtgroup18);
        txtgroup18.setBounds(109, 137, 215, 25);

        cmdclear8.setFont(new Font("Serif", 0, 14)); 
        cmdclear8.setText("Clear");
        cmdclear8.addActionListener(this);
        p8.add(cmdclear8);
        cmdclear8.setBounds(680, 643, 116, 35);

        ff15.setFont(new Font("Serif", 0, 16)); 
        ff15.setText("reduced/free rate.");
        p8.add(ff15);
        ff15.setBounds(10, 649, 107, 22);

        txtname8.setFont(new Font("Serif", 0, 14)); 
        p8.add(txtname8);
        txtname8.setBounds(109, 51, 215, 25);

        cmdsubmit8.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit8.setText("Submit");
        cmdsubmit8.addActionListener(this);
        p8.add(cmdsubmit8);
        cmdsubmit8.setBounds(810, 643, 117, 35);

        jjs5.setMajorTickSpacing(2);
        jjs5.setMaximum(10);
        jjs5.setMinorTickSpacing(1);
        jjs5.setPaintLabels(true);
        jjs5.setPaintTicks(true);
        jjs5.setValue(0);
        jjs5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(jjs5);
        jjs5.setBounds(290, 534, 247, 51);

        ff3.setFont(new Font("Serif", 0, 16)); 
        ff3.setText("Date of Birth:");
        p8.add(ff3);
        ff3.setBounds(10, 95, 81, 22);

        ff13.setFont(new Font("Serif", 0, 16)); 
        ff13.setText("If someone in the group needed money to");
        p8.add(ff13);
        ff13.setBounds(10, 534, 250, 22);

        txtbirthdate8.setFont(new Font("Serif", 0, 14)); 
        p8.add(txtbirthdate8);
        txtbirthdate8.setBounds(109, 94, 215, 25);

        ff14.setFont(new Font("Serif", 0, 16)); 
        ff14.setText("The group could provide child care at a ");
        p8.add(ff14);
        ff14.setBounds(10, 623, 241, 22);

        ff5.setFont(new Font("Serif", 0, 16)); 
        ff5.setText("Group:");
        p8.add(ff5);
        ff5.setBounds(10, 138, 42, 22);

        jjs6.setMajorTickSpacing(2);
        jjs6.setMaximum(10);
        jjs6.setMinorTickSpacing(1);
        jjs6.setPaintLabels(true);
        jjs6.setPaintTicks(true);
        jjs6.setValue(0);
        jjs6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(jjs6);
        jjs6.setBounds(290, 623, 247, 51);

        ff4.setFont(new Font("Serif", 0, 16)); 
        ff4.setText("Name:");
        p8.add(ff4);
        ff4.setBounds(10, 52, 40, 22);

        ff16.setFont(new java.awt.Font("Serif", 0, 16)); 
        ff16.setText("with them for a couple of weeks.");
        p8.add(ff16);
        ff16.setBounds(10, 415, 197, 22);

        ff17.setFont(new java.awt.Font("Serif", 0, 16)); 
        ff17.setText("pay the power bill the group would be");
        p8.add(ff17);
        ff17.setBounds(10, 560, 229, 22);

        ff18.setFont(new java.awt.Font("Serif", 0, 16)); 
        ff18.setText("willing to help.");
        p8.add(ff18);
        ff18.setBounds(10, 583, 86, 22);

        ff19.setFont(new Font("Serif", 0, 16)); 
        ff19.setText("Please indicate how true the following statements are about financial resources in this group! (scale is out of 10)");
        p8.add(ff19);
        ff19.setBounds(10, 180, 666, 22);

        p9 = new JPanel();
        dd1 = new JLabel();
        dd2 = new JLabel();
        dd3 = new JLabel();
        ddslider5 = new JSlider();
        dd5 = new JLabel();
        dd14 = new JLabel();
        txtbirthdate9 = new JTextField();
        dd13 = new JLabel();
        dd16 = new JLabel();
        ddslider6 = new JSlider();
        dd4 = new JLabel();
        dd10 = new JLabel();
        ddslider3 = new JSlider();
        dd6 = new JLabel();
        ddslider1 = new JSlider();
        dd7 = new JLabel();
        dd8 = new JLabel();
        dd9 = new JLabel();
        dd17 = new JLabel();
        dd11 = new JLabel();
        ddslider2 = new JSlider();
        dd19 = new JLabel();
        dd12 = new JLabel();
        ddslider4 = new JSlider();
        txtgroup19 = new JTextField();
        cmdclear9 = new JButton();
        dd15 = new JLabel();
        txtname9 = new JTextField();
        cmdsubmit9 = new JButton();
        dd20 = new JLabel();
        
        p9.setMinimumSize(new Dimension(450, 450));
        p9.setPreferredSize(new Dimension(950, 750));
        p9.setBackground(new Color(240, 255, 255));
        p9.setLayout(null);

        dd1.setFont(new Font("Serif", 0, 16)); 
        dd1.setText("Drug Habits Group 5");
        p9.add(dd1);
        dd1.setBounds(10, 11, 200, 22);

        dd2.setFont(new Font("Serif", 0, 16));
        dd2.setText("A group member arrives visibly drunk/high");
        p9.add(dd2);
        dd2.setBounds(10, 220, 255, 22);

        dd3.setFont(new Font("Serif", 0, 16)); 
        dd3.setText("Date of Birth:");
        p9.add(dd3);
        dd3.setBounds(10, 95, 81, 22);

        ddslider5.setMajorTickSpacing(2);
        ddslider5.setMaximum(10);
        ddslider5.setMinorTickSpacing(1);
        ddslider5.setPaintLabels(true);
        ddslider5.setPaintTicks(true);
        ddslider5.setValue(0);
        ddslider5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(ddslider5);
        ddslider5.setBounds(338, 539, 247, 51);

        dd5.setFont(new Font("Serif", 0, 16)); 
        dd5.setText("Group:");
        p9.add(dd5);
        dd5.setBounds(10, 138, 42, 22);

        dd14.setFont(new Font("Serif", 0, 16)); 
        dd14.setText("A group member tells the group that they had");
        p9.add(dd14);
        dd14.setBounds(10, 608, 272, 22);

        txtbirthdate9.setFont(new Font("Serif", 0, 14)); 
        p9.add(txtbirthdate9);
        txtbirthdate9.setBounds(109, 94, 215, 25);

        dd13.setFont(new Font("Serif", 0, 16)); 
        dd13.setText("A group member tells the group: \"I unwind");
        p9.add(dd13);
        dd13.setBounds(10, 539, 255, 22);

        dd16.setFont(new Font("Serif", 0, 16)); 
        dd16.setText("it doesn't become a habit.\"");
        p9.add(dd16);
        dd16.setBounds(10, 430, 159, 22);

        ddslider6.setMajorTickSpacing(2);
        ddslider6.setMaximum(10);
        ddslider6.setMinorTickSpacing(1);
        ddslider6.setPaintLabels(true);
        ddslider6.setPaintTicks(true);
        ddslider6.setValue(0);
        ddslider6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(ddslider6);
        ddslider6.setBounds(338, 608, 247, 51);

        dd4.setFont(new Font("Serif", 0, 16)); 
        dd4.setText("Name:");
        p9.add(dd4);
        dd4.setBounds(10, 52, 40, 22);

        dd10.setFont(new Font("Serif", 0, 16)); 
        dd10.setText("wrong with recreational drug use as long as");
        p9.add(dd10);
        dd10.setBounds(10, 399, 259, 22);

        ddslider3.setMajorTickSpacing(2);
        ddslider3.setMaximum(10);
        ddslider3.setMinorTickSpacing(1);
        ddslider3.setPaintLabels(true);
        ddslider3.setPaintTicks(true);
        ddslider3.setValue(0);
        ddslider3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(ddslider3);
        ddslider3.setBounds(338, 373, 247, 51);

        dd6.setFont(new Font("Serif", 0, 16)); 
        dd6.setText("to a group get together.");
        p9.add(dd6);
        dd6.setBounds(10, 246, 141, 22);

        ddslider1.setMajorTickSpacing(2);
        ddslider1.setMaximum(10);
        ddslider1.setMinorTickSpacing(1);
        ddslider1.setPaintLabels(true);
        ddslider1.setPaintTicks(true);
        ddslider1.setValue(0);
        ddslider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(ddslider1);
        ddslider1.setBounds(338, 220, 247, 51);

        dd7.setFont(new Font("Serif", 0, 16)); 
        dd7.setText("The group finds out that another group ");
        p9.add(dd7);
        dd7.setBounds(10, 289, 235, 22);

        dd8.setFont(new Font("Serif", 0, 16)); 
        dd8.setText("member is friends with someone who uses");
        p9.add(dd8);
        dd8.setBounds(10, 315, 253, 22);

        dd9.setFont(new Font("Serif", 0, 16)); 
        dd9.setText("A group member states: \"there is nothing");
        p9.add(dd9);
        dd9.setBounds(10, 373, 243, 22);

        dd17.setFont(new Font("Serif", 0, 16)); 
        dd17.setText("with a joint after a long, hard day at work.\"");
        p9.add(dd17);
        dd17.setBounds(10, 565, 258, 22);

        dd11.setFont(new Font("Serif", 0, 16)); 
        dd11.setText("A group member tells the group that they enjoyed");
        p9.add(dd11);
        dd11.setBounds(10, 470, 298, 22);

        ddslider2.setMajorTickSpacing(2);
        ddslider2.setMaximum(10);
        ddslider2.setMinorTickSpacing(1);
        ddslider2.setPaintLabels(true);
        ddslider2.setPaintTicks(true);
        ddslider2.setValue(0);
        ddslider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(ddslider2);
        ddslider2.setBounds(338, 289, 247, 51);

        dd19.setFont(new Font("Serif", 0, 16)); 
        dd19.setText("Please indicate how true the following statements are about drug habits in this group! (scale is out of 10)");
        p9.add(dd19);
        dd19.setBounds(10, 180, 622, 22);

        dd12.setFont(new Font("Serif", 0, 16)); 
        dd12.setText("a party where there was excessive drinking.");
        p9.add(dd12);
        dd12.setBounds(10, 496, 262, 22);

        ddslider4.setMajorTickSpacing(2);
        ddslider4.setMaximum(10);
        ddslider4.setMinorTickSpacing(1);
        ddslider4.setPaintLabels(true);
        ddslider4.setPaintTicks(true);
        ddslider4.setValue(0);
        ddslider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(ddslider4);
        ddslider4.setBounds(338, 470, 247, 51);

        txtgroup19.setFont(new Font("Serif", 0, 14)); 
        p9.add(txtgroup19);
        txtgroup19.setBounds(109, 137, 215, 25);

        cmdclear9.setFont(new Font("Serif", 0, 14)); 
        cmdclear9.setText("Clear ");
        cmdclear9.addActionListener(this);
        p9.add(cmdclear9);
        cmdclear9.setBounds(700, 628, 116, 35);

        dd15.setFont(new Font("Serif", 0, 16)); 
        dd15.setText("gotten a DUI.");
        p9.add(dd15);
        dd15.setBounds(10, 634, 83, 22);

        txtname9.setFont(new Font("Serif", 0, 14)); 
        p9.add(txtname9);
        txtname9.setBounds(109, 51, 215, 25);

        cmdsubmit9.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit9.setText("Submit");
        cmdsubmit9.addActionListener(this);
        p9.add(cmdsubmit9);
        cmdsubmit9.setBounds(830, 628, 117, 35);

        dd20.setFont(new Font("Serif", 0, 16)); 
        dd20.setText("or sells illegal drugs.");
        p9.add(dd20);
        dd20.setBounds(10, 338, 120, 22);
        
        p10 = new JPanel();
        cc1 = new JLabel();
        cc2 = new JLabel();
        cc3 = new JLabel();
        cc4 = new JLabel();
        cc5 = new JLabel();
        cc6 = new JLabel();
        ccslider1 = new JSlider();
        cc7 = new JLabel();
        ccslider2 = new JSlider();
        cc8 = new JLabel();
        ccslider3 = new JSlider();
        cc9 = new JLabel();
        cc10 = new JLabel();
        cc11 = new JLabel();
        ccslider4 = new JSlider();
        cc12 = new JLabel();
        cc13 = new JLabel();
        cc14 = new JLabel();
        ccslider5 = new JSlider();
        cc15 = new JLabel();
        cc16 = new JLabel();
        ccslider6 = new JSlider();
        cmdclear10 = new JButton();
        cmdsubmit10 = new JButton();
        txtname10 = new JTextField();
        txtbirthdate10 = new JTextField();
        txtgroup110 = new JTextField();
        
        p10.setMinimumSize(new Dimension(450, 450));
        p10.setPreferredSize(new Dimension(950, 750));
        p10.setBackground(new Color(240, 255, 255));
        p10.setLayout(null);
        
        cc1.setFont(new Font("Serif", 0, 16)); 
        cc1.setText("Cultural Resources Group 5");
        p10.add(cc1);
        cc1.setBounds(10, 11, 200, 22);

        cc2.setFont(new Font("Serif", 0, 16)); 
        cc2.setText("Name:");
        p10.add(cc2);
        cc2.setBounds(10, 51, 40, 22);

        cc3.setFont(new Font("Serif", 0, 16)); 
        cc3.setText("Date of Birth:");
        p10.add(cc3);
        cc3.setBounds(10, 91, 81, 22);

        cc4.setFont(new Font("Serif", 0, 16)); 
        cc4.setText("Group:");
        p10.add(cc4);
        cc4.setBounds(10, 131, 50, 22);

        cc5.setFont(new Font("Serif", 0, 16)); 
        cc5.setText("People in this group do not talk about books and/or keep");
        p10.add(cc5);
        cc5.setBounds(10, 171, 345, 22);

        cc6.setFont(new Font("Serif", 0, 16)); 
        cc6.setText("up with current events on the internet, television, or radio.");
        p10.add(cc6);
        cc6.setBounds(10, 199, 344, 22);

        ccslider1.setFont(new Font("Serif", 0, 14)); 
        ccslider1.setMajorTickSpacing(2);
        ccslider1.setMaximum(10);
        ccslider1.setMinorTickSpacing(1);
        ccslider1.setPaintLabels(true);
        ccslider1.setPaintTicks(true);
        ccslider1.setValue(0);
        ccslider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(ccslider1);
        ccslider1.setBounds(408, 171, 217, 56);

        cc7.setFont(new Font("Serif", 0, 16)); 
        cc7.setText("People in this group often volunteer for charity or");
        p10.add(cc7);
        cc7.setBounds(10, 247, 350, 22);

        ccslider2.setFont(new Font("Serif", 0, 14)); 
        ccslider2.setMajorTickSpacing(2);
        ccslider2.setMaximum(10);
        ccslider2.setMinorTickSpacing(1);
        ccslider2.setPaintLabels(true);
        ccslider2.setPaintTicks(true);
        ccslider2.setValue(0);
        ccslider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(ccslider2);
        ccslider2.setBounds(408, 245, 217, 56);

        cc8.setFont(new Font("Serif", 0, 16)); 
        cc8.setText("community events (e.g. Relay for Life, Feed the Hungry).");
        p10.add(cc8);
        cc8.setBounds(10, 273, 349, 22);

        ccslider3.setFont(new Font("Serif", 0, 14)); 
        ccslider3.setMajorTickSpacing(2);
        ccslider3.setMaximum(10);
        ccslider3.setMinorTickSpacing(1);
        ccslider3.setPaintLabels(true);
        ccslider3.setPaintTicks(true);
        ccslider3.setValue(0);
        ccslider3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(ccslider3);
        ccslider3.setBounds(408, 319, 217, 56);

        cc9.setFont(new Font("Serif", 0, 16)); 
        cc9.setText("People in this group tend not to go to plays,");
        p10.add(cc9);
        cc9.setBounds(10, 319, 262, 22);

        cc10.setFont(new Font("Serif", 0, 16)); 
        cc10.setText(" art performances, musesums or musicals.");
        p10.add(cc10);
        cc10.setBounds(10, 347, 250, 22);

        cc11.setFont(new Font("Serif", 0, 16)); 
        cc11.setText("People in this group tend to be connected to \"important\"");
        p10.add(cc11);
        cc11.setBounds(10, 393, 337, 22);

        ccslider4.setFont(new Font("Serif", 0, 14)); 
        ccslider4.setMajorTickSpacing(2);
        ccslider4.setMaximum(10);
        ccslider4.setMinorTickSpacing(1);
        ccslider4.setPaintLabels(true);
        ccslider4.setPaintTicks(true);
        ccslider4.setValue(0);
        ccslider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(ccslider4);
        ccslider4.setBounds(408, 393, 217, 56);

        cc12.setFont(new Font("Serif", 0, 16)); 
        cc12.setText("members in the communty (e.g. doctors, lawyers, ");
        p10.add(cc12);
        cc12.setBounds(10, 421, 300, 22);

        cc13.setFont(new Font("Serif", 0, 16)); 
        cc13.setText("and local politicians).");
        p10.add(cc13);
        cc13.setBounds(10, 455, 126, 22);

        cc14.setFont(new Font("Serif", 0, 16)); 
        cc14.setText("People in the group tend not to be college-educated.");
        p10.add(cc14);
        cc14.setBounds(10, 495, 316, 22);

        ccslider5.setFont(new Font("Serif", 0, 14)); 
        ccslider5.setMajorTickSpacing(2);
        ccslider5.setMaximum(10);
        ccslider5.setMinorTickSpacing(1);
        ccslider5.setPaintLabels(true);
        ccslider5.setPaintTicks(true);
        ccslider5.setValue(0);
        ccslider5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(ccslider5);
        ccslider5.setBounds(408, 495, 217, 56);

        cc15.setFont(new Font("Serif", 0, 16)); 
        cc15.setText("People in this group often go to the community library ");
        p10.add(cc15);
        cc15.setBounds(10, 569, 325, 22);

        cc16.setFont(new Font("Serif", 0, 16)); 
        cc16.setText("to check out books or use library resources.");
        p10.add(cc16);
        cc16.setBounds(10, 597, 266, 22);

        ccslider6.setFont(new Font("Serif", 0, 14)); 
        ccslider6.setMajorTickSpacing(2);
        ccslider6.setMaximum(10);
        ccslider6.setMinorTickSpacing(1);
        ccslider6.setPaintLabels(true);
        ccslider6.setPaintTicks(true);
        ccslider6.setValue(0);
        ccslider6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(ccslider6);
        ccslider6.setBounds(408, 569, 217, 56);

        cmdclear10.setFont(new Font("Serif", 0, 14)); 
        cmdclear10.addActionListener(this);
        cmdclear10.setText("Clear");
        p10.add(cmdclear10);
        cmdclear10.setBounds(718, 597, 90, 35);

        cmdsubmit10.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit10.addActionListener(this);
        cmdsubmit10.setText("Submit");
        p10.add(cmdsubmit10);
        cmdsubmit10.setBounds(827, 597, 100, 35);
        
        txtname10.setFont(new Font("Serif", 0, 14)); 
        p10.add(txtname10);
        txtname10.setBounds(109, 51, 215, 25);

        txtbirthdate10.setFont(new Font("Serif", 0, 14)); 
        p10.add(txtbirthdate10);
        txtbirthdate10.setBounds(109, 94, 215, 25);

        txtgroup110.setFont(new Font("Serif", 0, 14)); 
        p10.add(txtgroup110);
        txtgroup110.setBounds(109, 137, 215, 25);

        scrollpane2.setViewportView(cardPanel);
        cardPanel.add(p1, "1");
        cardPanel.add(p2, "2");
        cardPanel.add(p3, "3");
        cardPanel.add(p4, "4");
        cardPanel.add(p5, "5");
        cardPanel.add(p6, "6");
        cardPanel.add(p7, "7");
        cardPanel.add(p8, "8");
        cardPanel.add(p9, "9");
        cardPanel.add(p10, "10");
        
        URL icon = this.getClass().getClassLoader().getResource("research3.jpg");
        ImageIcon ic = new ImageIcon(icon);
        setIconImage(ic.getImage());
        
        getContentPane().add(scrollpane2, BorderLayout.CENTER); 
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
    }
     
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == cmdnext2) {
            Module3.this.cmdnext2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdprevious2) {
            Module3.this.cmdprevious2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear1) {
            Module3.this.cmdclear1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear2) {
            Module3.this.cmdclear2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear3) {
            Module3.this.cmdclear3ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear4) {
            Module3.this.cmdclear4ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear5) {
            Module3.this.cmdclear5ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear6) {
            Module3.this.cmdclear6ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear7) {
            Module3.this.cmdclear7ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear8) {
            Module3.this.cmdclear8ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear9) {
            Module3.this.cmdclear9ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear10) {
            Module3.this.cmdclear10ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit1) {
            Module3.this.cmdsubmit1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit2) {
            Module3.this.cmdsubmit2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit3) {
            Module3.this.cmdsubmit3ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit4) {
            Module3.this.cmdsubmit4ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit5) {
            Module3.this.cmdsubmit5ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit6) {
            Module3.this.cmdsubmit6ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit7) {
            Module3.this.cmdsubmit7ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit8) {
            Module3.this.cmdsubmit8ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit9) {
            Module3.this.cmdsubmit9ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit10) {
            Module3.this.cmdsubmit10ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdgroup2) {
            Module3.this.cmdgroup2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdgroup3) {
            Module3.this.cmdgroup3ActionPerformed(evt);
        }
    }

    @Override
    public void windowActivated(java.awt.event.WindowEvent evt) {
    }

    @Override
    public void windowClosed(java.awt.event.WindowEvent evt) {
    }

    @Override
    public void windowClosing(java.awt.event.WindowEvent evt) {
    }

    @Override
    public void windowDeactivated(java.awt.event.WindowEvent evt) {
    }

    @Override
    public void windowDeiconified(java.awt.event.WindowEvent evt) {
    }

    @Override
    public void windowIconified(java.awt.event.WindowEvent evt) {
    }

    @Override
    public void windowOpened(java.awt.event.WindowEvent evt) {
        if (evt.getSource() == Module3.this) {
            try {
                Module3.this.formWindowOpened(evt);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Module3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
    }

    @Override
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (evt.getSource() == txtbirthdate) {
            Module3.this.txtbirthdateFocusLost(evt);
        }
        else if (evt.getSource() == txtbirthdate6) {
            Module3.this.txtbirthdate6FocusLost(evt);
        }
    }
    
    public void formWindowOpened(java.awt.event.WindowEvent evt) throws ClassNotFoundException {                                  
        conn = mysqlconnect.ConnectDb();
    }
    
    public void cmdnext2ActionPerformed(java.awt.event.ActionEvent evt) {                                 
        if (currentCard < 10) {
          currentCard += 1;
          cl.show(cardPanel, "" + (currentCard));
        }
        
        if (currentCard == 2) {
          String wn = txtbirthdate.getText();
          txtbirthdate2.setText(wn);
          String jz = txtname.getText();
          txtname2.setText(jz);
          String zp = txtgroup1.getText();
          txtgroup12.setText(zp);
        }
        if (currentCard == 3) {
          String wn1 = txtbirthdate2.getText();
          txtbirthdate3.setText(wn1);
          String jz1 = txtname2.getText();
          txtname3.setText(jz1);
          String zp1 = txtgroup12.getText();
          txtgroup13.setText(zp1);
        }
        if (currentCard == 4) {
          String wn2 = txtbirthdate3.getText();
          txtbirthdate4.setText(wn2);
          String jz2 = txtname3.getText();
          txtname4.setText(jz2);
          String zp2 = txtgroup13.getText();
          txtgroup14.setText(zp2);
        }
        if (currentCard == 5) {
          String wn3 = txtbirthdate4.getText();
          txtbirthdate5.setText(wn3);
          String jz3 = txtname4.getText();
          txtname5.setText(jz3);
          String zp3 = txtgroup14.getText();
          txtgroup15.setText(zp3);
        }
        if (currentCard == 7) {
          String wn7 = txtbirthdate6.getText();
          txtbirthdate7.setText(wn7);
          String jz7 = txtname6.getText();
          txtname7.setText(jz7);
          String zp7 = txtgroup16.getText();
          txtgroup17.setText(zp7);
        }
        if (currentCard == 8) {
          String wn8 = txtbirthdate7.getText();
          txtbirthdate8.setText(wn8);
          String jz8 = txtname7.getText();
          txtname8.setText(jz8);
          String zp8 = txtgroup17.getText();
          txtgroup18.setText(zp8);
        }
        if (currentCard == 9) {
          String wn9 = txtbirthdate8.getText();
          txtbirthdate9.setText(wn9);
          String jz9 = txtname8.getText();
          txtname9.setText(jz9);
          String zp9 = txtgroup18.getText();
          txtgroup19.setText(zp9);
        }
        if (currentCard == 10) {
          String wn10 = txtbirthdate9.getText();
          txtbirthdate10.setText(wn10);
          String jz10 = txtname9.getText();
          txtname10.setText(jz10);
          String zp10 = txtgroup19.getText();
          txtgroup110.setText(zp10);
        }
    }
    
    public void cmdprevious2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (currentCard > 1) {
          currentCard -= 1;
          cl.show(cardPanel, "" + (currentCard));
        }
        
        if (currentCard == 2) {
          String wn = txtbirthdate.getText();
          txtbirthdate2.setText(wn);
          String jz = txtname.getText();
          txtname2.setText(jz);
          String zp = txtgroup1.getText();
          txtgroup12.setText(zp);
        }
        if (currentCard == 3) {
          String wn1 = txtbirthdate2.getText();
          txtbirthdate3.setText(wn1);
          String jz1 = txtname2.getText();
          txtname3.setText(jz1);
          String zp1 = txtgroup12.getText();
          txtgroup13.setText(zp1);
        }
        if (currentCard == 4) {
          String wn2 = txtbirthdate3.getText();
          txtbirthdate4.setText(wn2);
          String jz2 = txtname3.getText();
          txtname4.setText(jz2);
          String zp2 = txtgroup13.getText();
          txtgroup14.setText(zp2);
        }
        if (currentCard == 5) {
          String wn3 = txtbirthdate4.getText();
          txtbirthdate5.setText(wn3);
          String jz3 = txtname4.getText();
          txtname5.setText(jz3);
          String zp3 = txtgroup14.getText();
          txtgroup15.setText(zp3);
        }
        if (currentCard == 7) {
          String wn7 = txtbirthdate6.getText();
          txtbirthdate7.setText(wn7);
          String jz7 = txtname6.getText();
          txtname7.setText(jz7);
          String zp7 = txtgroup16.getText();
          txtgroup17.setText(zp7);
        }
        if (currentCard == 8) {
          String wn8 = txtbirthdate7.getText();
          txtbirthdate8.setText(wn8);
          String jz8 = txtname7.getText();
          txtname8.setText(jz8);
          String zp8 = txtgroup17.getText();
          txtgroup18.setText(zp8);
        }
        if (currentCard == 9) {
          String wn9 = txtbirthdate8.getText();
          txtbirthdate9.setText(wn9);
          String jz9 = txtname8.getText();
          txtname9.setText(jz9);
          String zp9 = txtgroup18.getText();
          txtgroup19.setText(zp9);
        }
        if (currentCard == 10) {
          String wn10 = txtbirthdate9.getText();
          txtbirthdate10.setText(wn10);
          String jz10 = txtname9.getText();
          txtname10.setText(jz10);
          String zp10 = txtgroup19.getText();
          txtgroup110.setText(zp10);
        }
    }
    
    public void txtbirthdateFocusLost(java.awt.event.FocusEvent evt) {       
                                   
        caz = txtname.getText();
        caz2 = txtbirthdate.getText();
        String sql = "SELECT * FROM basic_information WHERE Participants_Name = ? AND Date_of_Birth = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname.getText());
            pst.setString(2, txtbirthdate.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            s = rs.getString("Participants_Name");
            sx = rs.getString("Date_of_Birth");
            }      
        }catch (SQLException e){} 
        try {
            if ((caz.equals(s))&&(caz2.equals(sx))) { 
                 JOptionPane.showMessageDialog(null,"Name & Birth Date Found");
            }
            else {              
              JOptionPane.showMessageDialog(null,"Name & Birth Date Not Found");
            }            
        }catch (HeadlessException ex){}
    }
    
    public void txtbirthdate6FocusLost(java.awt.event.FocusEvent evt) {       
                                   
        caz3 = txtname6.getText();
        caz4 = txtbirthdate6.getText();
        String sql = "SELECT * FROM basic_information WHERE Participants_Name = ? AND Date_of_Birth = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname6.getText());
            pst.setString(2, txtbirthdate6.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            s1 = rs.getString("Participants_Name");
            sx1 = rs.getString("Date_of_Birth");
            }      
        }catch (SQLException e){} 
        try {
            if ((caz3.equals(s1))&&(caz4.equals(sx1))) { 
                 JOptionPane.showMessageDialog(null,"Name & Birth Date Found");
            }
            else {              
              JOptionPane.showMessageDialog(null,"Name & Birth Date Not Found");
            }            
        }catch (HeadlessException ex){}
    }   

    public void cmdclear1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtconnectothers.setText("");
        txtinnetwork.setText("");
        txtknownetwork.setText("");
        txtregularlyhangout.setText("");
        txttrustclosely.setText("");
        sliderclosiness.setValue(0);
        sliderpersonalclosiness.setValue(0);
        slidergroupreact.setValue(0);
    } 
    
    public void cmdclear2ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        slider1.setValue(0);
        slider2.setValue(0);
        slider3.setValue(0);
        slider4.setValue(0);
        slider5.setValue(0);
        slider6.setValue(0);
    } 
    
    public void cmdclear3ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        js1.setValue(0);
        js2.setValue(0);
        js3.setValue(0);
        js4.setValue(0);
        js5.setValue(0);
        js6.setValue(0);
    }       

    public void cmdclear4ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        dslider1.setValue(0);
        dslider2.setValue(0);
        dslider3.setValue(0);
        dslider4.setValue(0);
        dslider5.setValue(0);
        dslider6.setValue(0);
    }
    
    public void cmdclear5ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cslider1.setValue(0);
        cslider2.setValue(0);
        cslider3.setValue(0);
        cslider4.setValue(0);
        cslider5.setValue(0);
        cslider6.setValue(0);
    }
    
    public void cmdclear6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtconnectothers1.setText("");
        txtinnetwork1.setText("");
        txtknownetwork1.setText("");
        txtregularlyhangout1.setText("");
        txttrustclosely1.setText("");
        sliderclosiness1.setValue(0);
        sliderpersonalclosiness1.setValue(0);
        slidergroupreact1.setValue(0);
    } 
    
    public void cmdclear7ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jjslider1.setValue(0);
        jjslider2.setValue(0);
        jjslider3.setValue(0);
        jjslider4.setValue(0);
        jjslider5.setValue(0);
        jjslider6.setValue(0);
    } 
    
    public void cmdclear8ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jjs1.setValue(0);
        jjs2.setValue(0);
        jjs3.setValue(0);
        jjs4.setValue(0);
        jjs5.setValue(0);
        jjs6.setValue(0);
    }       

    public void cmdclear9ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ddslider1.setValue(0);
        ddslider2.setValue(0);
        ddslider3.setValue(0);
        ddslider4.setValue(0);
        ddslider5.setValue(0);
        ddslider6.setValue(0);
    }
    
    public void cmdclear10ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ccslider1.setValue(0);
        ccslider2.setValue(0);
        ccslider3.setValue(0);
        ccslider4.setValue(0);
        ccslider5.setValue(0);
        ccslider6.setValue(0);
    }

    public void cmdsubmit1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String Name1 = (String) boxhangoutoften.getSelectedItem();
        String Name2 = (String) boxknowothers.getSelectedItem();
        String Name3 = (String) boxconnectothers.getSelectedItem();
        String sql = "insert into social_network4 (Name, Birth_Date, Main_Group, People_in_Network, Know_in_Network, Closely_Know, Hang_With_Regulary, Hang_with_Amount, Know_Outside_Groups, Connect_outdside_Group, Other_Conn, Closeness, Personal_closeness, Group_Jealousy) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname.getText());
            pst.setString(2, txtbirthdate.getText());
            pst.setString(3, txtgroup1.getText());
            pst.setString(4, txtinnetwork.getText());
            pst.setString(5, txtknownetwork.getText());
            pst.setString(6, txttrustclosely.getText());
            pst.setString(7, txtregularlyhangout.getText());
            pst.setString(8, Name1);
            pst.setString(9, Name2);
            pst.setString(10, Name3);
            pst.setString(11, txtconnectothers.getText());
            pst.setInt(12, sliderclosiness.getValue());
            pst.setInt(13, sliderpersonalclosiness.getValue());
            pst.setInt(14, slidergroupreact.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    } 
    
    public void cmdsubmit2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into emotional_resources4 (Name, Birth_Date, Main_Group, Discussing_Problems, Honesty_in_Group, Criticism_in_Group, Emotional_GroupMmber, Trust_GroupMmber, Accept_Faults) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname2.getText());
            pst.setString(2, txtbirthdate2.getText());
            pst.setString(3, txtgroup12.getText());
            pst.setInt(4, slider1.getValue());
            pst.setInt(5, slider2.getValue());
            pst.setInt(6, slider3.getValue());
            pst.setInt(7, slider4.getValue());
            pst.setInt(8, slider5.getValue());
            pst.setInt(9, slider6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into financial_resources4 (Name, Birth_Date, Main_Group, Lend_Money, Lend_Car, Live_With, Legal_Advice_LoCost, Help_Pay_Bills, Help_Child_Care) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname3.getText());
            pst.setString(2, txtbirthdate3.getText());
            pst.setString(3, txtgroup13.getText());
            pst.setInt(4, js1.getValue());
            pst.setInt(5, js2.getValue());
            pst.setInt(6, js3.getValue());
            pst.setInt(7, js4.getValue());
            pst.setInt(8, js5.getValue());
            pst.setInt(9, js6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into group_drug_habits4 (Name, Birth_Date, Main_Group, Arrives_Drunk_High, Drug_Dealers_OutsideGr, Recr_Drug_Use, Party_Exces_Drink, Unwind_With_Drug, DUI_InGroup) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname4.getText());
            pst.setString(2, txtbirthdate4.getText());
            pst.setString(3, txtgroup14.getText());
            pst.setInt(4, dslider1.getValue());
            pst.setInt(5, dslider2.getValue());
            pst.setInt(6, dslider3.getValue());
            pst.setInt(7, dslider4.getValue());
            pst.setInt(8, dslider5.getValue());
            pst.setInt(9, dslider6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       String sql = "insert into cultural_resources4 (Name, Birth_Date, Main_Group, Discuss_hobbies, Volunteer_Work, Cultural_Events, Important_Connts, College_Educated, Library_Use) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname5.getText());
            pst.setString(2, txtbirthdate5.getText());
            pst.setString(3, txtgroup15.getText());
            pst.setInt(4, cslider1.getValue());
            pst.setInt(5, cslider2.getValue());
            pst.setInt(6, cslider3.getValue());
            pst.setInt(7, cslider4.getValue());
            pst.setInt(8, cslider5.getValue());
            pst.setInt(9, cslider6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String Name4 = (String) boxhangoutoften1.getSelectedItem();
        String Name5 = (String) boxknowothers1.getSelectedItem();
        String Name6 = (String) boxconnectothers1.getSelectedItem();
        String sql = "insert into social_network5 (Name, Birth_Date, Main_Group, People_in_Network, Know_in_Network, Closely_Know, Hang_With_Regulary, Hang_with_Amount, Know_Outside_Groups, Connect_outdside_Group, Other_Conn, Closeness, Personal_closeness, Group_Jealousy) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname6.getText());
            pst.setString(2, txtbirthdate6.getText());
            pst.setString(3, txtgroup16.getText());
            pst.setString(4, txtinnetwork1.getText());
            pst.setString(5, txtknownetwork1.getText());
            pst.setString(6, txttrustclosely1.getText());
            pst.setString(7, txtregularlyhangout1.getText());
            pst.setString(8, Name4);
            pst.setString(9, Name5);
            pst.setString(10, Name6);
            pst.setString(11, txtconnectothers.getText());
            pst.setInt(12, sliderclosiness1.getValue());
            pst.setInt(13, sliderpersonalclosiness1.getValue());
            pst.setInt(14, slidergroupreact1.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    } 
    
    public void cmdsubmit7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into emotional_resources5 (Name, Birth_Date, Main_Group, Discussing_Problems, Honesty_in_Group, Criticism_in_Group, Emotional_GroupMmber, Trust_GroupMmber, Accept_Faults) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname7.getText());
            pst.setString(2, txtbirthdate7.getText());
            pst.setString(3, txtgroup17.getText());
            pst.setInt(4, jjslider1.getValue());
            pst.setInt(5, jjslider2.getValue());
            pst.setInt(6, jjslider3.getValue());
            pst.setInt(7, jjslider4.getValue());
            pst.setInt(8, jjslider5.getValue());
            pst.setInt(9, jjslider6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into financial_resources5 (Name, Birth_Date, Main_Group, Lend_Money, Lend_Car, Live_With, Legal_Advice_LoCost, Help_Pay_Bills, Help_Child_Care) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname8.getText());
            pst.setString(2, txtbirthdate8.getText());
            pst.setString(3, txtgroup18.getText());
            pst.setInt(4, jjs1.getValue());
            pst.setInt(5, jjs2.getValue());
            pst.setInt(6, jjs3.getValue());
            pst.setInt(7, jjs4.getValue());
            pst.setInt(8, jjs5.getValue());
            pst.setInt(9, jjs6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into group_drug_habits5 (Name, Birth_Date, Main_Group, Arrives_Drunk_High, Drug_Dealers_OutsideGr, Recr_Drug_Use, Party_Exces_Drink, Unwind_With_Drug, DUI_InGroup) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname9.getText());
            pst.setString(2, txtbirthdate9.getText());
            pst.setString(3, txtgroup19.getText());
            pst.setInt(4, ddslider1.getValue());
            pst.setInt(5, ddslider2.getValue());
            pst.setInt(6, ddslider3.getValue());
            pst.setInt(7, ddslider4.getValue());
            pst.setInt(8, ddslider5.getValue());
            pst.setInt(9, ddslider6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit10ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       String sql = "insert into cultural_resources5 (Name, Birth_Date, Main_Group, Discuss_hobbies, Volunteer_Work, Cultural_Events, Important_Connts, College_Educated, Library_Use) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname10.getText());
            pst.setString(2, txtbirthdate10.getText());
            pst.setString(3, txtgroup110.getText());
            pst.setInt(4, ccslider1.getValue());
            pst.setInt(5, ccslider2.getValue());
            pst.setInt(6, ccslider3.getValue());
            pst.setInt(7, ccslider4.getValue());
            pst.setInt(8, ccslider5.getValue());
            pst.setInt(9, ccslider6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdgroup2ActionPerformed(java.awt.event.ActionEvent evt) { 
       String sql = "SELECT * FROM sociogram WHERE Name = ? AND Birth_Date = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname.getText());
            pst.setString(2, txtbirthdate.getText());
            rs = pst.executeQuery();
            while (rs.next()){
            s4 = rs.getString("Fourth_Group");
            txtgroup1.setText(s4);
            group4 = txtgroup1.getText();
            }
        }catch (SQLException e){} 
        try {
            if (group4.equals(s4)) { 
                 JOptionPane.showMessageDialog(null, "Found Group");
            }
            else {              
              JOptionPane.showMessageDialog(null, "Group Not Found");
            }            
        }catch (HeadlessException ex){}
    }
    
    public void cmdgroup3ActionPerformed(java.awt.event.ActionEvent evt) { 
       String sql = "SELECT * FROM sociogram WHERE Name = ? AND Birth_Date = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname6.getText());
            pst.setString(2, txtbirthdate6.getText());
            rs = pst.executeQuery();
            while (rs.next()){
            s6 = rs.getString("Fifth_Group");
            txtgroup16.setText(s6);
            group5 = txtgroup16.getText();
            }
        }catch (SQLException e){} 
        try {
            if (group5.equals(s6)) { 
                 JOptionPane.showMessageDialog(null, "Found Group");
            }
            else {              
              JOptionPane.showMessageDialog(null, "Group Not Found");
            }            
        }catch (HeadlessException ex){}
    }
    
}