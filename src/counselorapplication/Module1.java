package counselorapplication;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.awt.event.FocusListener;
import java.sql.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JPanel;
import java.util.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Module1 extends JFrame implements WindowListener, MouseListener, FocusListener{
  
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String s, caz, caz2, sx, t, g, f, u, Drug, Child, Formal, Informal, For, In, a, b, c, d, e, ab, bb, cb, db, eb, st, su, ss, w, q, r, h, s1, w1, q1, r1, h1, w2, gt, ft, nt;
    
    
    public int currentCard = 1;
    public JPanel cardPanel;
    public CardLayout cl;
    public JPanel buttonPanel;
    public JButton cmdnext2;
    public JButton cmdprevious2;
    public JComboBox boxaddiction;
    public JComboBox boxrelationship;
    public JButton cmdclearform;
    public JPanel p1;
    public JScrollPane scrollpane2;
    public JScrollPane s10;
    public JScrollPane s11;
    public JScrollPane s12;
    public JScrollPane s13;
    public JScrollPane s14;
    public JScrollPane s15;
    public JSlider slideraddiction;
    public JTextField txtbirthdate3;
    public JTextArea txtfiveyearplans;
    public JTextArea txtfunactivities;
    public JTextArea txtintodrugs;
    public JTextField txtname2;
    public JTextArea txtsixmonthplans;
    public JTextArea txtwhyusedrugs;
    public JTextArea txtwishfulfun;
    public JComboBox boxfulltimejobs;
    public JComboBox boxhealthinsurance;
    public JComboBox boxjobsituation;
    public JComboBox boxlivingarrangements;
    public JButton cmdclearform1;
    public JButton cmdsubmit;
    public JPanel p2;
    public JScrollPane s16;
    public JScrollPane s17;
    public JScrollPane s18;
    public JTextField txthealthinsurance;
    public JTextArea txtlastweekjob;
    public JTextField txtotherjobsituation;
    public JTextField txtotherlivingarrangements;
    public JTextArea txtotherrelationship;
    public JTextArea txtskills;
    public JLabel r43;
    public JCheckBox checkchurch;
    public JCheckBox checkcommunitygroup;
    public JCheckBox checkdcp;
    public JCheckBox checkdctt;
    public JCheckBox checkfamily;
    public JCheckBox checkfishing;
    public JCheckBox checkgym;
    public JCheckBox checkhunting;
    public JCheckBox checkinformal;
    public JCheckBox checklocalbar;
    public JCheckBox checklocalstore;
    public JCheckBox checkmusicgroup;
    public JCheckBox checknaa;
    public JCheckBox checkneighborhood;
    public JCheckBox checkonlinecommunity;
    public JCheckBox checkorganizedclub;
    public JCheckBox checkothergroup1;
    public JCheckBox checkothergroup2;
    public JCheckBox checkothergroup3;
    public JCheckBox checkparentteacher;
    public JCheckBox checkplaysports;
    public JCheckBox checksalon;
    public JCheckBox checkschool;
    public JCheckBox checksportsteams;
    public JCheckBox checkworkplace;
    public JButton cmdclearform3;
    public JButton cmdsubmit2;
    public JLabel n63;
    public JLabel n64;
    public JLabel n65;
    public JLabel n66;
    public JLabel n67;
    public JLabel n68;
    public JLabel n69;
    public JLabel n70;
    public JLabel n71;
    public JPanel p3;
    public JTextField txtbirthdate4;
    public JTextField txtname3;
    public JTextField txtothergroup1;
    public JTextField txtothergroup2;
    public JTextField txtothergroup3;
    public JTextField txtschool;
    public JButton cmdclearboxes;
    public JButton cmdsubmit3;
    public JCheckBox j1;
    public JCheckBox j10;
    public JCheckBox j11;
    public JCheckBox j12;
    public JCheckBox j13;
    public JCheckBox j14;
    public JCheckBox j15;
    public JCheckBox j16;
    public JCheckBox j17;
    public JCheckBox j18;
    public JCheckBox j19;
    public JCheckBox j2;
    public JCheckBox j20;
    public JCheckBox j21;
    public JCheckBox j22;
    public JCheckBox j23;
    public JCheckBox j24;
    public JCheckBox j25;
    public JLabel j26;
    public JLabel j27;
    public JLabel j28;
    public JLabel j29;
    public JCheckBox j3;
    public JCheckBox j4;
    public JCheckBox j5;
    public JCheckBox j6;
    public JCheckBox j7;
    public JCheckBox j8;
    public JCheckBox j9;
    public JLabel label1;
    public JLabel label10;
    public JLabel label2;
    public JLabel label20;
    public JLabel label21;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JLabel label6;
    public JLabel label7;
    public JLabel label8;
    public JLabel label9;
    public JPanel p4;
    public JTextField txtbirthdate;
    public JTextField txtfifthgroup;
    public JTextField txtfirstgroup;
    public JTextField txtfourthgroup;
    public JTextField txtname;
    public JTextField txtsecondgroup;
    public JTextField txtthirdgroup;
    public JButton cmdclearboxes2;
    public JButton cmdsubmit4;
    public JCheckBox jl1;
    public JCheckBox jl10;
    public JCheckBox jl11;
    public JCheckBox jl12;
    public JCheckBox jl13;
    public JCheckBox jl14;
    public JCheckBox jl15;
    public JCheckBox jl16;
    public JCheckBox jl17;
    public JCheckBox jl18;
    public JCheckBox jl19;
    public JCheckBox jl2;
    public JCheckBox jl20;
    public JCheckBox jl21;
    public JCheckBox jl22;
    public JCheckBox jl23;
    public JCheckBox jl24;
    public JCheckBox jl25;
    public JLabel jl26;
    public JLabel jl27;
    public JLabel jl28;
    public JLabel jl29;
    public JCheckBox jl3;
    public JCheckBox jl4;
    public JCheckBox jl5;
    public JCheckBox jl6;
    public JCheckBox jl7;
    public JCheckBox jl8;
    public JCheckBox jl9;
    public JLabel jh1;
    public JLabel h10;
    public JLabel h11;
    public JLabel h12;
    public JLabel h2;
    public JLabel h3;
    public JLabel h4;
    public JLabel h5;
    public JLabel h6;
    public JLabel h7;
    public JLabel h8;
    public JLabel h9;
    public JPanel p5;
    public JScrollPane s4;
    public JTextField txtbirthdate2;
    public JTextField txtfifthgroup2;
    public JTextField txtfirstgroup2;
    public JTextField txtfourthgroup2;
    public JTextField txtname4;
    public JTextField txtsecondgroup2;
    public JTextField txtthirdgroup2;
    public JButton cmdsubmit5;
    public static JLabel gg1;
    public static JLabel gg2;
    public static JLabel gg3;
    public static JLabel gg4;
    public static JLabel gg5;
    public JLabel o1;
    public JLabel o2;
    public JLabel o3;
    public JLabel o4;
    public JLabel o5;
    public JLabel o6;
    public JLabel o7;
    public JLabel o8;
    public JPanel p6;
    public JTextField txtbirthdate5;
    public JTextField txtname5;
    public JComboBox boxconnectothers;
    public JComboBox boxhangoutoften;
    public JComboBox boxknowothers;
    public JButton cmdclear;
    public JButton cmdsubmit6;
    public JLabel t1;
    public JLabel t10;
    public JLabel t11;
    public JLabel t12;
    public JLabel t13;
    public JLabel t14;
    public JLabel t15;
    public JLabel t16;
    public JLabel t2;
    public JLabel t3;
    public JLabel t4;
    public JLabel t5;
    public JLabel t6;
    public JLabel t7;
    public JLabel t8;
    public JLabel t9;
    public JPanel p7;
    public JScrollPane sc1;
    public JSlider sliderclosiness;
    public JSlider slidergroupreact;
    public JSlider sliderpersonalclosiness;
    public JTextField txtbirthdate6;
    public JTextArea txtconnectothers;
    public JTextField txtgroup1;
    public JTextField txtinnetwork;
    public JTextField txtknownetwork;
    public JTextField txtname6;
    public JTextField txtregularlyhangout;
    public JTextField txttrustclosely;
    public JButton cmdclearform8;
    public JButton cmdsubmit7;
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
    public JPanel p8;
    public JSlider slider1;
    public JSlider slider2;
    public JSlider slider3;
    public JSlider slider4;
    public JSlider slider5;
    public JSlider slider6;
    public JTextField txtbirthdate7;
    public JTextField txtgroup12;
    public JTextField txtname7;
    public JButton cmdclearform9;
    public JButton cmdsubmit8;
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
    public JPanel p9;
    public JSlider js1;
    public JSlider js2;
    public JSlider js3;
    public JSlider js4;
    public JSlider js5;
    public JSlider js6;
    public JTextField txtbirthdate8;
    public JTextField txtgroup14;
    public JTextField txtname8;
    public JButton cmdclearform10;
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
    public JPanel p10;
    public JSlider qe1;
    public JSlider qe2;
    public JSlider qe3;
    public JSlider qe4;
    public JSlider qe5;
    public JSlider qe6;
    public JTextField txtbirthdate9;
    public JTextField txtgroup13;
    public JTextField txtname9;
    public JButton cmdclearform11;
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
    public JPanel p11;
    public JSlider ccslider1;
    public JSlider ccslider2;
    public JSlider ccslider3;
    public JSlider ccslider4;
    public JSlider ccslider5;
    public JSlider ccslider6;
    public JTextField txtbirthdate10;
    public JTextField txtgroup15;
    public JTextField txtname10;
        
    public Module1() {
        
        cardPanel = new JPanel();
        cl = new CardLayout();
        cardPanel.setLayout(cl);
        buttonPanel = new JPanel();
        scrollpane2 = new JScrollPane();
        p1 = new JPanel();
        JLabel r45 = new JLabel();
        JLabel r46 = new JLabel();
        JLabel r47 = new JLabel();
        boxrelationship = new JComboBox();
        JLabel r41 = new JLabel();
        JLabel r42 = new JLabel();
        boxaddiction = new JComboBox();
        r43 = new JLabel();
        slideraddiction = new javax.swing.JSlider(JSlider.HORIZONTAL, 0, 10, 0);
        s14 = new JScrollPane();
        txtfunactivities = new JTextArea();
        JLabel r44 = new JLabel();
        s15 = new JScrollPane();
        txtwishfulfun = new JTextArea();
        JLabel r36 = new JLabel();
        JLabel r37 = new JLabel();
        JLabel r34 = new JLabel();
        JLabel r35 = new JLabel();
        txtbirthdate3 = new JTextField();
        s10 = new JScrollPane();
        txtintodrugs = new JTextArea();
        txtname2 = new JTextField();
        JLabel r38 = new JLabel();
        s11 = new JScrollPane();
        txtsixmonthplans = new JTextArea();
        JLabel r39 = new JLabel();
        s12 = new JScrollPane();
        txtfiveyearplans = new JTextArea();
        JLabel r40 = new JLabel();
        s13 = new JScrollPane();
        txtwhyusedrugs = new JTextArea();
        JLabel r33 = new JLabel();
        cmdclearform = new JButton();
        cmdnext2 = new JButton();
        cmdprevious2 = new JButton();

        FormListener formListener = new FormListener();
        
        setTitle("Research Module 1");
        setMinimumSize(new Dimension(650, 650));
        setPreferredSize(new Dimension(650, 650));
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        addWindowListener(this);
        
        scrollpane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollpane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        p1.setMinimumSize(new Dimension(1200, 900));
        p1.setPreferredSize(new Dimension(1200, 900));
        p1.setBackground(new Color(240, 255, 255));
        p1.setLayout(null);

        r45.setFont(new Font("Serif", 0, 16)); 
        r45.setText("What do you wish you could do for fun?:");
        p1.add(r45);
        r45.setBounds(10, 708, 246, 22);

        r46.setFont(new Font("Serif", 0, 16)); 
        r46.setText("Which of the following best describes your current ");
        p1.add(r46);
        r46.setBounds(10, 793, 306, 22);

        r47.setFont(new Font("Serif", 0, 16));
        r47.setText("relationship situation? (marriage = steady relationship):");
        p1.add(r47);
        r47.setBounds(10, 821, 325, 22);

        boxrelationship.setFont(new Font("Serif", 0, 14)); 
        boxrelationship.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I am not in steady relationship", "I am in a steady relationship with a women and we live together", "I am in a steady relationship with a man and we live together", "I am in a steady relationship with a women and we do not live together", "I am in a steady relationship with a man and we do not live together", "Other Please Explain" }));
        p1.add(boxrelationship);
        boxrelationship.setBounds(368, 793, 405, 25);

        r41.setFont(new Font("Serif", 0, 16)); 
        r41.setText("Do you think of yourself us an addict?");
        p1.add(r41);
        r41.setBounds(10, 478, 228, 22);

        r42.setFont(new Font("Serif", 0, 16)); 
        r42.setText("If yes, how addicted are you?");
        p1.add(r42);
        r42.setBounds(10, 520, 179, 22);

        boxaddiction.setFont(new Font("Serif", 0, 14)); 
        boxaddiction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p1.add(boxaddiction);
        boxaddiction.setBounds(399, 477, 140, 25);

        r43.setFont(new Font("Serif", 0, 16)); 
        r43.setText("Addiction Level (out of 10):   0");
        p1.add(r43);
        r43.setBounds(228, 568, 210, 22);

        slideraddiction.setMajorTickSpacing(2);
        slideraddiction.setMinorTickSpacing(1);
        slideraddiction.setPaintTicks(true);
        slideraddiction.setPaintTrack(true);
        slideraddiction.setPaintLabels(true);
        slideraddiction.setMaximum(10);        
        slideraddiction.setValue(0);
        slideraddiction.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        slideraddiction.addChangeListener(formListener);
        p1.add(slideraddiction);
        slideraddiction.setBounds(10, 560, 200, 45);

        txtfunactivities.setColumns(20);
        txtfunactivities.setFont(new Font("Serif", 0, 16)); 
        txtfunactivities.setRows(5);
        s14.setViewportView(txtfunactivities);
        txtfunactivities.setLineWrap(true);
        txtfunactivities.setWrapStyleWord(true);

        p1.add(s14);
        s14.setBounds(277, 623, 248, 67);

        r44.setFont(new Font("Serif", 0, 16)); 
        r44.setText("What type of things do you do for fun?:");
        p1.add(r44);
        r44.setBounds(10, 623, 236, 22);

        txtwishfulfun.setColumns(20);
        txtwishfulfun.setFont(new Font("Serif", 0, 16)); 
        txtwishfulfun.setRows(5);
        s15.setViewportView(txtwishfulfun);
        txtwishfulfun.setLineWrap(true);
        txtwishfulfun.setWrapStyleWord(true);

        p1.add(s15);
        s15.setBounds(277, 708, 248, 67);

        r36.setFont(new Font("Serif", 0, 16)); 
        r36.setText("(Ex: YearMonthDay 1970-11-25)");
        p1.add(r36);
        r36.setBounds(99, 95, 215, 22);

        r37.setFont(new Font("Serif", 0, 16)); 
        r37.setText("What do you want to do with your life in the next six months?:");
        p1.add(r37);
        r37.setBounds(10, 137, 371, 22);

        r34.setFont(new Font("Serif", 0, 16)); 
        r34.setText("Name (Full Name):");
        p1.add(r34);
        r34.setBounds(10, 52, 117, 22);

        r35.setFont(new Font("Serif", 0, 16)); 
        r35.setText("Date of Birth:");
        p1.add(r35);
        r35.setBounds(10, 95, 81, 22);

        txtbirthdate3.setFont(new Font("Serif", 0, 14));
        txtbirthdate3.setName("txtbirthdate3");
        txtbirthdate3.addFocusListener(this);
        p1.add(txtbirthdate3);
        txtbirthdate3.setBounds(399, 94, 248, 25);

        txtintodrugs.setColumns(20);
        txtintodrugs.setFont(new Font("Serif", 0, 16)); 
        txtintodrugs.setRows(5);
        s10.setViewportView(txtintodrugs);
        txtintodrugs.setLineWrap(true);
        txtintodrugs.setWrapStyleWord(true);

        p1.add(s10);
        s10.setBounds(399, 307, 248, 67);

        txtname2.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtname2);
        txtname2.setBounds(399, 51, 248, 25);

        r38.setFont(new Font("Serif", 0, 16)); 
        r38.setText("What do you want to do with your life in the next five years?:");
        p1.add(r38);
        r38.setBounds(10, 222, 365, 22);

        txtsixmonthplans.setColumns(20);
        txtsixmonthplans.setFont(new Font("Serif", 0, 16)); 
        txtsixmonthplans.setRows(5);
        s11.setViewportView(txtsixmonthplans);
        txtsixmonthplans.setLineWrap(true);
        txtsixmonthplans.setWrapStyleWord(true);

        p1.add(s11);
        s11.setBounds(399, 137, 248, 67);

        r39.setFont(new Font("Serif", 0, 16)); 
        r39.setText("How did you get into drugs?");
        p1.add(r39);
        r39.setBounds(10, 307, 171, 22);

        txtfiveyearplans.setColumns(20);
        txtfiveyearplans.setFont(new Font("Serif", 0, 16));
        txtfiveyearplans.setRows(5);
        s12.setViewportView(txtfiveyearplans);
        txtfiveyearplans.setLineWrap(true);
        txtfiveyearplans.setWrapStyleWord(true);

        p1.add(s12);
        s12.setBounds(399, 222, 248, 67);

        r40.setFont(new Font("Serif", 0, 16)); 
        r40.setText("Why did you use drugs?:");
        p1.add(r40);
        r40.setBounds(10, 392, 149, 22);

        txtwhyusedrugs.setColumns(20);
        txtwhyusedrugs.setFont(new Font("Serif", 0, 16)); 
        txtwhyusedrugs.setRows(5);
        s13.setViewportView(txtwhyusedrugs);
        txtwhyusedrugs.setLineWrap(true);
        txtwhyusedrugs.setWrapStyleWord(true);

        p1.add(s13);
        s13.setBounds(399, 392, 248, 67);

        r33.setFont(new Font("Serif", 0, 16)); 
        r33.setText("Research Demographics");
        p1.add(r33);
        r33.setBounds(10, 11, 147, 22);

        cmdclearform.setFont(new Font("Serif", 0, 14)); 
        cmdclearform.setText("Clear Form");
        cmdclearform.addActionListener(formListener);
        p1.add(cmdclearform);
        cmdclearform.setBounds(900, 802, 110, 41);       
        
        cmdprevious2.setFont(new Font("Serif", 0, 14)); 
        cmdprevious2.setText("Previous");
        cmdprevious2.setName("cmdprevious2");
        cmdprevious2.addActionListener(formListener);
        buttonPanel.add(cmdprevious2);
        buttonPanel.setBackground(new Color(240, 255, 255));
        
        cmdnext2.setFont(new Font("Serif", 0, 14)); 
        cmdnext2.setText("Next");
        cmdnext2.setName("cmdnext2");
        cmdnext2.addActionListener(formListener);
        buttonPanel.add(cmdnext2);

        p2 = new JPanel();
        s16 = new JScrollPane();
        txtotherrelationship = new JTextArea();
        JLabel rr50 = new JLabel();
        JLabel rr49 = new JLabel();
        boxfulltimejobs = new JComboBox();
        JLabel rr48 = new JLabel();
        txtotherlivingarrangements = new JTextField();
        JLabel rr62 = new JLabel();
        JLabel rr57 = new JLabel();
        JLabel rr58 = new JLabel();
        JLabel rr56 = new JLabel();
        txthealthinsurance = new JTextField();
        JLabel rr61 = new JLabel();
        boxhealthinsurance = new JComboBox();
        JLabel rr60 = new JLabel();
        boxlivingarrangements = new JComboBox();
        JLabel rr59 = new JLabel();
        JLabel rr51 = new JLabel();
        boxjobsituation = new JComboBox();
        JLabel rr52 = new JLabel();
        JLabel rr55 = new JLabel();
        s18 = new JScrollPane();
        txtskills = new JTextArea();
        JLabel rr53 = new JLabel();
        txtotherjobsituation = new JTextField();
        s17 = new JScrollPane();
        txtlastweekjob = new JTextArea();
        JLabel rr54 = new JLabel();
        JLabel rr1 = new JLabel();
        cmdclearform1 = new JButton();
        cmdsubmit = new JButton();

        p2.setMinimumSize(new Dimension(1200, 900));
        p2.setPreferredSize(new Dimension(1200, 900));
        p2.setBackground(new Color(240, 255, 255));
        p2.setLayout(null);

        txtotherrelationship.setColumns(20);
        txtotherrelationship.setFont(new Font("Serif", 0, 16)); 
        txtotherrelationship.setRows(5);
        s16.setViewportView(txtotherrelationship);
        txtotherrelationship.setLineWrap(true);
        txtotherrelationship.setWrapStyleWord(true);

        p2.add(s16);
        s16.setBounds(399, 67, 290, 67);

        rr50.setFont(new Font("Serif", 0, 16)); 
        rr50.setText("Over the past year, which of the following best ");
        p2.add(rr50);
        rr50.setBounds(10, 219, 284, 22);

        rr49.setFont(new Font("Serif", 0, 16)); 
        rr49.setText("How many full-time jobs have you had in the past five years?:");
        p2.add(rr49);
        rr49.setBounds(10, 166, 368, 22);

        boxfulltimejobs.setFont(new Font("Serif", 0, 14)); 
        boxfulltimejobs.setMaximumRowCount(6);
        boxfulltimejobs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1-2", "3-4", "4-6", "more than 6" }));
        p2.add(boxfulltimejobs);
        boxfulltimejobs.setBounds(399, 165, 290, 25);

        rr48.setFont(new Font("Serif", 0, 16)); 
        rr48.setText("Other type of relationship, Please Briefly Expain:");
        p2.add(rr48);
        rr48.setBounds(10, 67, 291, 22);

        txtotherlivingarrangements.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtotherlivingarrangements);
        txtotherlivingarrangements.setBounds(399, 683, 290, 25);

        rr62.setFont(new Font("Serif", 0, 16)); 
        rr62.setText("Other living arrangements, Please Explain:");
        p2.add(rr62);
        rr62.setBounds(10, 684, 251, 22);

        rr57.setFont(new Font("Serif", 0, 16));
        rr57.setText("Please list all that apply!");
        p2.add(rr57);
        rr57.setBounds(10, 528, 144, 22);

        rr58.setFont(new Font("Serif", 0, 16)); 
        rr58.setText("Where did you live last month? If you stayed/lived in different");
        p2.add(rr58);
        rr58.setBounds(10, 588, 367, 22);

        rr56.setFont(new Font("Serif", 0, 16)); 
        rr56.setText("contracting,certificates, foreign language, computer skills)?");
        p2.add(rr56);
        rr56.setBounds(10, 500, 349, 22);

        txthealthinsurance.setFont(new Font("Serif", 0, 14)); 
        p2.add(txthealthinsurance);
        txthealthinsurance.setBounds(399, 799, 290, 25);

        rr61.setFont(new Font("Serif", 0, 16)); 
        rr61.setText("If yes, please specify what type:");
        p2.add(rr61);
        rr61.setBounds(10, 800, 191, 22);

        boxhealthinsurance.setFont(new Font("Serif", 0, 14)); 
        boxhealthinsurance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p2.add(boxhealthinsurance);
        boxhealthinsurance.setBounds(399, 738, 133, 25);

        rr60.setFont(new Font("Serif", 0, 16)); 
        rr60.setText("Do you have health insurance?");
        p2.add(rr60);
        rr60.setBounds(10, 739, 183, 22);

        boxlivingarrangements.setFont(new Font("Serif", 0, 14)); 
        boxlivingarrangements.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "House Apartment or Condominium that I own", "House Apartment or Condominium that I rent", "I stayed with family or relatives", "I stayed with friends or acquaintances", "I lived in a shelter", "I lived on the streets/homeless", "Other" }));
        p2.add(boxlivingarrangements);
        boxlivingarrangements.setBounds(399, 587, 290, 25);

        rr59.setFont(new Font("Serif", 0, 16)); 
        rr59.setText("places, please chose the one that you spent most time at:");
        p2.add(rr59);
        rr59.setBounds(10, 618, 339, 22);

        rr51.setFont(new Font("Serif", 0, 16)); 
        rr51.setText("describes your job situation?");
        p2.add(rr51);
        rr51.setBounds(10, 249, 172, 22);

        boxjobsituation.setFont(new Font("Serif", 0, 14)); 
        boxjobsituation.setMaximumRowCount(6);
        boxjobsituation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mostly fulltime employment", "mix of fulltime and part-time employment", "mostly part-time employed", "mostly unemployed", "Other" }));
        p2.add(boxjobsituation);
        boxjobsituation.setBounds(399, 218, 290, 25);

        rr52.setFont(new Font("Serif", 0, 16));
        rr52.setText("Other job situation, Please Briefly Specify:");
        p2.add(rr52);
        rr52.setBounds(10, 299, 254, 22);

        rr55.setFont(new Font("Serif", 0, 16)); 
        rr55.setText("What kind of skills or expertise do you have (Ex: welding, ");
        p2.add(rr55);
        rr55.setBounds(10, 472, 351, 22);

        txtskills.setColumns(20);
        txtskills.setFont(new Font("Serif", 0, 16)); 
        txtskills.setRows(5);
        s18.setViewportView(txtskills);
        txtskills.setLineWrap(true);
        txtskills.setWrapStyleWord(true);

        p2.add(s18);
        s18.setBounds(399, 472, 290, 67);

        rr53.setFont(new Font("Serif", 0, 16)); 
        rr53.setText("What kind of work were you doing last week? (Ex: ");
        p2.add(rr53);
        rr53.setBounds(10, 366, 312, 22);

        txtotherjobsituation.setFont(new Font("Serif", 0, 14));
        p2.add(txtotherjobsituation);
        txtotherjobsituation.setBounds(399, 298, 290, 25);

        txtlastweekjob.setColumns(20);
        txtlastweekjob.setFont(new Font("Serif", 0, 16)); 
        txtlastweekjob.setRows(5);
        s17.setViewportView(txtlastweekjob);
        txtlastweekjob.setLineWrap(true);
        txtlastweekjob.setWrapStyleWord(true);

        p2.add(s17);
        s17.setBounds(399, 366, 290, 67);

        rr54.setFont(new Font("Serif", 0, 16)); 
        rr54.setText("working construction, waiting tables, secretarial work etc.):");
        p2.add(rr54);
        rr54.setBounds(10, 394, 354, 22);

        rr1.setFont(new Font("Serif", 0, 16)); 
        rr1.setText("Research Demographics Part 2");
        p2.add(rr1);
        rr1.setBounds(10, 11, 188, 22);

        cmdclearform1.setFont(new Font("Serif", 0, 14)); 
        cmdclearform1.setText("Clear Form");
        cmdclearform1.addActionListener(formListener);
        p2.add(cmdclearform1);
        cmdclearform1.setBounds(893, 799, 116, 37);

        cmdsubmit.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit.setText("Submit");
        cmdsubmit.addActionListener(formListener);
        p2.add(cmdsubmit);
        cmdsubmit.setBounds(1077, 799, 116, 37);
        
        p3 = new JPanel();
        txtothergroup3 = new JTextField();
        checkothergroup3 = new JCheckBox();
        n63 = new JLabel();
        txtothergroup2 = new JTextField();
        checkonlinecommunity = new JCheckBox();
        checkothergroup2 = new JCheckBox();
        checkgym = new JCheckBox();
        checkdctt = new JCheckBox();
        checkplaysports = new JCheckBox();
        checkfamily = new JCheckBox();
        n65 = new JLabel();
        n64 = new JLabel();
        checkdcp = new JCheckBox();
        checkchurch = new JCheckBox();
        n66 = new JLabel();
        n67 = new JLabel();
        n68 = new JLabel();
        checklocalbar = new JCheckBox();
        n69 = new JLabel();
        checkneighborhood = new JCheckBox();
        checkinformal = new JCheckBox();
        txtname3 = new JTextField();
        checkfishing = new JCheckBox();
        checkparentteacher = new JCheckBox();
        checkorganizedclub = new JCheckBox();
        checkhunting = new JCheckBox();
        checklocalstore = new JCheckBox();
        checkschool = new JCheckBox();
        checksalon = new JCheckBox();
        checksportsteams = new JCheckBox();
        checkworkplace = new JCheckBox();
        n70 = new JLabel();
        checkmusicgroup = new JCheckBox();
        n71 = new JLabel();
        checkcommunitygroup = new JCheckBox();
        txtbirthdate4 = new JTextField();
        checknaa = new JCheckBox();
        txtschool = new JTextField();
        checkothergroup1 = new JCheckBox();
        txtothergroup1 = new JTextField();
        cmdclearform3 = new JButton();
        cmdsubmit2 = new JButton();

        p3.setMinimumSize(new Dimension(1200, 450));
        p3.setPreferredSize(new Dimension(1500, 850));
        p3.setBackground(new Color(240, 255, 255));
        p3.setLayout(null);

        txtothergroup3.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtothergroup3);
        txtothergroup3.setBounds(1102, 664, 214, 25);

        checkothergroup3.setFont(new Font("Serif", 0, 16)); 
        checkothergroup3.setText("other:");
        p3.add(checkothergroup3);
        checkothergroup3.setBounds(1037, 661, 59, 31);
        checkothergroup3.setBackground(new Color(240, 255, 255));

        n63.setFont(new Font("Serif", 0, 18)); 
        n63.setText("Basic Network Structure Analysis");
        p3.add(n63);
        n63.setBounds(10, 11, 243, 24);

        txtothergroup2.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtothergroup2);
        txtothergroup2.setBounds(1102, 628, 214, 25);

        checkonlinecommunity.setFont(new Font("Serif", 0, 16)); 
        checkonlinecommunity.setText("online community");
        p3.add(checkonlinecommunity);
        checkonlinecommunity.setBounds(1037, 590, 130, 31);
        checkonlinecommunity.setBackground(new Color(240, 255, 255));

        checkothergroup2.setFont(new Font("Serif", 0, 16)); 
        checkothergroup2.setText("other:");
        p3.add(checkothergroup2);
        checkothergroup2.setBounds(1037, 625, 59, 31);
        checkothergroup2.setBackground(new Color(240, 255, 255));

        checkgym.setFont(new Font("Serif", 0, 16)); 
        checkgym.setText("gym buddies");
        p3.add(checkgym);
        checkgym.setBounds(1037, 522, 101, 31);
        checkgym.setBackground(new Color(240, 255, 255));

        checkdctt.setFont(new Font("Serif", 0, 16)); 
        checkdctt.setText("drug court treatment team");
        p3.add(checkdctt);
        checkdctt.setBounds(193, 283, 181, 31);
        checkdctt.setBackground(new Color(240, 255, 255));

        checkplaysports.setFont(new Font("Serif", 0, 16)); 
        checkplaysports.setText("play sports with");
        p3.add(checkplaysports);
        checkplaysports.setBounds(1037, 556, 121, 31);
        checkplaysports.setBackground(new Color(240, 255, 255));

        checkfamily.setFont(new Font("Serif", 0, 16)); 
        checkfamily.setText("family");
        p3.add(checkfamily);
        checkfamily.setBounds(193, 249, 61, 31);
        checkfamily.setBackground(new Color(240, 255, 255));

        n65.setFont(new Font("Serif", 0, 18)); 
        n65.setText("Formal Groups");
        p3.add(n65);
        n65.setBounds(193, 207, 109, 24);

        n64.setFont(new Font("Serif", 0, 16)); 
        n64.setText("Please check all \"groups\" in the right and left box that you associate, interact or have contact with directly or indirectly (face to face, by phone, texting, email or in other ways)!");
        p3.add(n64);
        n64.setBounds(10, 139, 1044, 22);

        checkdcp.setFont(new Font("Serif", 0, 16)); 
        checkdcp.setText("drug court participants");
        p3.add(checkdcp);
        checkdcp.setBounds(193, 348, 161, 31);
        checkdcp.setBackground(new Color(240, 255, 255));

        checkchurch.setFont(new Font("Serif", 0, 16)); 
        checkchurch.setText("church");
        p3.add(checkchurch);
        checkchurch.setBounds(193, 382, 65, 31);
        checkchurch.setBackground(new Color(240, 255, 255));

        n66.setFont(new Font("Serif", 0, 16)); 
        n66.setText("(e.g. judge");
        p3.add(n66);
        n66.setBounds(374, 287, 64, 22);

        n67.setFont(new Font("Serif", 0, 16)); 
        n67.setText("councilors, lawyers, police offers etc.)");
        p3.add(n67);
        n67.setBounds(214, 318, 228, 22);

        n68.setFont(new Font("Serif", 0, 48)); 
        n68.setText("YOU");
        p3.add(n68);
        n68.setBounds(657, 420, 105, 62);

        checklocalbar.setFont(new Font("Serif", 0, 16)); 
        checklocalbar.setText("local bar");
        p3.add(checklocalbar);
        checklocalbar.setBackground(new Color(240, 255, 255));
        checklocalbar.setBounds(1037, 249, 77, 31);

        n69.setFont(new Font("Serif", 0, 18));
        n69.setText("Informal \"Groups\" / \"Situations\"");
        p3.add(n69);
        n69.setBounds(1037, 207, 233, 24);

        checkneighborhood.setFont(new Font("Serif", 0, 16)); 
        checkneighborhood.setText("neighborhood");
        p3.add(checkneighborhood);
        checkneighborhood.setBounds(1037, 314, 109, 31);
        checkneighborhood.setBackground(new Color(240, 255, 255));

        checkinformal.setFont(new Font("Serif", 0, 16)); 
        checkinformal.setText("informal gatherings");
        p3.add(checkinformal);
        checkinformal.setBounds(1037, 283, 137, 31);
        checkinformal.setBackground(new Color(240, 255, 255));

        txtname3.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtname3);
        txtname3.setBounds(222, 53, 306, 25);

        checkfishing.setFont(new Font("Serif", 0, 16)); 
        checkfishing.setText("fishing buddies");
        p3.add(checkfishing);
        checkfishing.setBounds(1037, 382, 113, 31);
        checkfishing.setBackground(new Color(240, 255, 255));

        checkparentteacher.setFont(new Font("Serif", 0, 16)); 
        checkparentteacher.setText("parent-teacher association");
        p3.add(checkparentteacher);
        checkparentteacher.setBounds(193, 556, 183, 31);
        checkparentteacher.setBackground(new Color(240, 255, 255));

        checkorganizedclub.setFont(new Font("Serif", 0, 16)); 
        checkorganizedclub.setText("organized club");
        p3.add(checkorganizedclub);
        checkorganizedclub.setBounds(193, 522, 113, 31);
        checkorganizedclub.setBackground(new Color(240, 255, 255));

        checkhunting.setFont(new Font("Serif", 0, 16)); 
        checkhunting.setText("hunting buddies");
        p3.add(checkhunting);
        checkhunting.setBounds(1037, 348, 119, 31);
        checkhunting.setBackground(new Color(240, 255, 255));

        checklocalstore.setFont(new Font("Serif", 0, 16)); 
        checklocalstore.setText("local stores");
        p3.add(checklocalstore);
        checklocalstore.setBounds(1037, 454, 93, 31);
        checklocalstore.setBackground(new Color(240, 255, 255));

        checkschool.setFont(new Font("Serif", 0, 16)); 
        checkschool.setText("school:");
        p3.add(checkschool);
        checkschool.setBounds(193, 625, 67, 31);
        checkschool.setBackground(new Color(240, 255, 255));

        checksalon.setFont(new Font("Serif", 0, 16));
        checksalon.setText("salon friends");
        p3.add(checksalon);
        checksalon.setBounds(1037, 420, 101, 31);
        checksalon.setBackground(new Color(240, 255, 255));

        checksportsteams.setFont(new Font("Serif", 0, 16)); 
        checksportsteams.setText("sports teams");
        p3.add(checksportsteams);
        checksportsteams.setBounds(193, 590, 101, 31);
        checksportsteams.setBackground(new Color(240, 255, 255));

        checkworkplace.setFont(new Font("Serif", 0, 16)); 
        checkworkplace.setText("work place");
        p3.add(checkworkplace);
        checkworkplace.setBounds(193, 420, 93, 31);
        checkworkplace.setBackground(new Color(240, 255, 255));

        n70.setFont(new Font("Serif", 0, 16)); 
        n70.setText("Name (Full name):");
        p3.add(n70);
        n70.setBounds(10, 54, 112, 22);

        checkmusicgroup.setFont(new Font("Serif", 0, 16)); 
        checkmusicgroup.setText("buddies to play music with");
        p3.add(checkmusicgroup);
        checkmusicgroup.setBounds(1037, 488, 185, 31);
        checkmusicgroup.setBackground(new Color(240, 255, 255));

        n71.setFont(new Font("Serif", 0, 16)); 
        n71.setText("Date of Birth (Ex: YearMonthDay 19801011):");
        p3.add(n71);
        n71.setBounds(10, 97, 281, 22);

        checkcommunitygroup.setFont(new Font("Serif", 0, 16)); 
        checkcommunitygroup.setText("community group");
        p3.add(checkcommunitygroup);
        checkcommunitygroup.setBounds(193, 488, 129, 31);
        checkcommunitygroup.setBackground(new Color(240, 255, 255));

        txtbirthdate4.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtbirthdate4);
        txtbirthdate4.setBounds(309, 96, 219, 25);

        checknaa.setFont(new Font("Serif", 0, 16)); 
        checknaa.setText("Narcotics/Alcohol Anonymous");
        p3.add(checknaa);
        checknaa.setBounds(193, 454, 211, 31);
        checknaa.setBackground(new Color(240, 255, 255));

        txtschool.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtschool);
        txtschool.setBounds(266, 628, 197, 25);

        checkothergroup1.setFont(new Font("Serif", 0, 16)); 
        checkothergroup1.setText("other:");
        p3.add(checkothergroup1);
        checkothergroup1.setBounds(193, 664, 59, 31);
        checkothergroup1.setBackground(new Color(240, 255, 255));

        txtothergroup1.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtothergroup1);
        txtothergroup1.setBounds(258, 667, 205, 25);
        

        cmdclearform3.setFont(new Font("Serif", 0, 14)); 
        cmdclearform3.setText("Clear Form");
        cmdclearform3.addActionListener(formListener);
        p3.add(cmdclearform3);
        cmdclearform3.setBounds(578, 664, 125, 35);
        
        cmdsubmit2.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit2.setText("Submit");
        cmdsubmit2.addActionListener(formListener);
        p3.add(cmdsubmit2);
        cmdsubmit2.setBounds(778, 664, 106, 35);
        
        p4 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        txtbirthdate = new JTextField();
        txtname = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        j26 = new JLabel();
        j27 = new JLabel();
        label20 = new JLabel();
        label21 = new JLabel();
        j28 = new JLabel();
        j29 = new JLabel();
        label6 = new JLabel();
        txtfirstgroup = new JTextField();
        label7 = new JLabel();
        txtsecondgroup = new JTextField();
        label8 = new JLabel();
        txtthirdgroup = new JTextField();
        label9 = new JLabel();
        txtfourthgroup = new JTextField();
        label10 = new JLabel();
        txtfifthgroup = new JTextField();
        cmdclearboxes = new JButton();
        cmdsubmit3 = new JButton();
        j1 = new JCheckBox();
        j2 = new JCheckBox();
        j3 = new JCheckBox();
        j4 = new JCheckBox();
        j5 = new JCheckBox();
        j6 = new JCheckBox();
        j7 = new JCheckBox();
        j8 = new JCheckBox();
        j9 = new JCheckBox();
        j10 = new JCheckBox();
        j11 = new JCheckBox();
        j12 = new JCheckBox();
        j13 = new JCheckBox();
        j14 = new JCheckBox();
        j15 = new JCheckBox();
        j16 = new JCheckBox();
        j17 = new JCheckBox();
        j18 = new JCheckBox();
        j20 = new JCheckBox();
        j19 = new JCheckBox();
        j21 = new JCheckBox();
        j22 = new JCheckBox();
        j23 = new JCheckBox();
        j25 = new JCheckBox();
        j24 = new JCheckBox();
  
        p4.setMinimumSize(new Dimension(1200, 450));
        p4.setPreferredSize(new Dimension(1500, 850));
        p4.setBackground(new Color(240, 255, 255));
        p4.setLayout(null);

        label1.setFont(new Font("Serif", 0, 16)); 
        label1.setText("Help Group Network");
        p4.add(label1);
        label1.setBounds(10, 11, 131, 22);

        label2.setFont(new Font("Serif", 0, 16)); 
        label2.setText("Name:");
        p4.add(label2);
        label2.setBounds(10, 52, 40, 22);

        label3.setFont(new Font("Serif", 0, 16)); 
        label3.setText("Date of Birth:");
        p4.add(label3);
        label3.setBounds(10, 95, 81, 22);

        txtbirthdate.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtbirthdate);
        txtbirthdate.setBounds(109, 94, 174, 25);

        txtname.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtname);
        txtname.setBounds(68, 51, 215, 25);

        label4.setFont(new Font("Serif", 0, 16)); 
        label4.setText("Please click on only top five groups that you turn to for help in order. ");
        p4.add(label4);
        label4.setBounds(819, 11, 417, 22);

        label5.setFont(new Font("Serif", 0, 16)); 
        label5.setText("Formal Groups");
        p4.add(label5);
        label5.setBounds(728, 79, 92, 22);

        j26.setFont(new Font("Serif", 0, 16)); 
        p4.add(j26);
        j26.setBounds(810, 509, 200, 22);

        j27.setFont(new Font("Serif", 0, 16)); 
        p4.add(j27);
        j27.setBounds(810, 549, 200, 22);

        label20.setFont(new Font("Serif", 0, 48)); 
        label20.setText("YOU");
        p4.add(label20);
        label20.setBounds(939, 186, 105, 62);

        label21.setFont(new Font("Serif", 0, 16)); 
        label21.setText("Informal \"Groups\" / \"Situations\"");
        p4.add(label21);
        label21.setBounds(1181, 79, 189, 22);

        j28.setFont(new Font("Serif", 0, 16)); 
        p4.add(j28);
        j28.setBounds(1260, 548, 500, 22);

        j29.setFont(new Font("Serif", 0, 16)); 
        p4.add(j29);
        j29.setBounds(1260, 590, 500, 22);
       
        label6.setFont(new Font("Serif", 0, 16)); 
        label6.setText("Which of the following groups would you turn to for help first?:");
        p4.add(label6);
        label6.setBounds(10, 198, 376, 22);

        txtfirstgroup.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtfirstgroup);
        txtfirstgroup.setBounds(404, 197, 237, 25);

        label7.setFont(new Font("Serif", 0, 16)); 
        label7.setText("The Second group you would turn to for help?:");
        p4.add(label7);
        label7.setBounds(10, 241, 282, 22);

        txtsecondgroup.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtsecondgroup);
        txtsecondgroup.setBounds(404, 240, 237, 25);

        label8.setFont(new Font("Serif", 0, 16)); 
        label8.setText("The Third group you would turn to for help?:");
        p4.add(label8);
        label8.setBounds(10, 284, 268, 22);

        txtthirdgroup.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtthirdgroup);
        txtthirdgroup.setBounds(404, 283, 237, 25);

        label9.setFont(new Font("Serif", 0, 16)); 
        label9.setText("The Fourth group you would turn to for help?:");
        p4.add(label9);
        label9.setBounds(10, 327, 276, 22);

        txtfourthgroup.setFont(new Font("Serif", 0, 14));
        p4.add(txtfourthgroup);
        txtfourthgroup.setBounds(404, 326, 237, 25);

        label10.setFont(new Font("Serif", 0, 16)); 
        label10.setText("The Fifth group you would turn to for help?:");
        p4.add(label10);
        label10.setBounds(10, 370, 263, 22);

        txtfifthgroup.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtfifthgroup);
        txtfifthgroup.setBounds(404, 369, 237, 25);

        cmdclearboxes.setFont(new Font("Serif", 0, 14)); 
        cmdclearboxes.setText("Clear Boxes");
        cmdclearboxes.addActionListener(formListener);
        p4.add(cmdclearboxes);
        cmdclearboxes.setBounds(380, 481, 115, 35);
        
        cmdsubmit3.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit3.setText("Submit");
        cmdsubmit3.addActionListener(formListener);
        p4.add(cmdsubmit3);
        cmdsubmit3.setBounds(554, 481, 100, 35);

        j1.setFont(new Font("Serif", 0, 16));
        j1.addMouseListener(this);
        p4.add(j1);
        j1.setBounds(728, 119, 200, 21);
        j1.setBackground(new Color(240, 255, 255));

        j2.setFont(new Font("Serif", 0, 16));
        j2.addMouseListener(this);
        p4.add(j2);
        j2.setBounds(728, 158, 300, 21);
        j2.setBackground(new Color(240, 255, 255));

        j3.setFont(new Font("Serif", 0, 16));
        j3.addMouseListener(this);
        p4.add(j3);
        j3.setBounds(728, 197, 200, 21);
        j3.setBackground(new Color(240, 255, 255));

        j4.setFont(new Font("Serif", 0, 16));
        j4.addMouseListener(this);
        p4.add(j4);
        j4.setBounds(728, 236, 200, 21);
        j4.setBackground(new Color(240, 255, 255));

        j5.setFont(new Font("Serif", 0, 16));
        j5.addMouseListener(this);
        p4.add(j5);
        j5.setBounds(728, 278, 200, 21);
        j5.setBackground(new Color(240, 255, 255));

        j6.setFont(new Font("Serif", 0, 16));
        j6.addMouseListener(this);
        p4.add(j6);
        j6.setBounds(728, 317, 350, 21);
        j6.setBackground(new Color(240, 255, 255));

        j7.setFont(new Font("Serif", 0, 16));
        j7.addMouseListener(this);
        p4.add(j7);
        j7.setBounds(728, 356, 200, 21);
        j7.setBackground(new Color(240, 255, 255));

        j8.setFont(new Font("Serif", 0, 16));
        j8.addMouseListener(this);
        p4.add(j8);
        j8.setBounds(728, 395, 200, 21);
        j8.setBackground(new Color(240, 255, 255));

        j9.setFont(new Font("Serif", 0, 16)); 
        j9.addMouseListener(this);
        p4.add(j9);
        j9.setBounds(728, 431, 200, 21);
        j9.setBackground(new Color(240, 255, 255));

        j10.setFont(new Font("Serif", 0, 16));
        j10.addMouseListener(this);
        p4.add(j10);
        j10.setBounds(728, 470, 200, 21);
        j10.setBackground(new Color(240, 255, 255));

        j11.setFont(new Font("Serif", 0, 16));
        j11.addMouseListener(this);
        p4.add(j11);
        j11.setBounds(728, 509, 70, 21);
        j11.setBackground(new Color(240, 255, 255));

        j12.setFont(new Font("Serif", 0, 16));
        j12.addMouseListener(this);
        p4.add(j12);
        j12.setBounds(728, 549, 60, 21);
        j12.setBackground(new Color(240, 255, 255));

        j13.setFont(new Font("Serif", 0, 16));
        j13.addMouseListener(this);
        p4.add(j13);
        j13.setBounds(1181, 119, 200, 21);
        j13.setBackground(new Color(240, 255, 255));

        j14.setFont(new Font("Serif", 0, 16));
        j14.addMouseListener(this);
        p4.add(j14);
        j14.setBounds(1181, 158, 300, 21);
        j14.setBackground(new Color(240, 255, 255));

        j15.setFont(new Font("Serif", 0, 16));
        j15.addMouseListener(this);
        p4.add(j15);
        j15.setBounds(1181, 197, 300, 21);
        j15.setBackground(new Color(240, 255, 255));

        j16.setFont(new Font("Serif", 0, 16));
        j16.addMouseListener(this);
        p4.add(j16);
        j16.setBounds(1181, 236, 300, 21);
        j16.setBackground(new Color(240, 255, 255));

        j17.setFont(new Font("Serif", 0, 16));
        j17.addMouseListener(this);
        p4.add(j17);
        j17.setBounds(1181, 275, 300, 21);
        j17.setBackground(new Color(240, 255, 255));

        j18.setFont(new Font("Serif", 0, 16));
        j18.addMouseListener(this);
        p4.add(j18);
        j18.setBounds(1181, 314, 300, 21);
        j18.setBackground(new Color(240, 255, 255));

        j20.setFont(new Font("Serif", 0, 16)); 
        j20.addMouseListener(this);
        p4.add(j20);
        j20.setBounds(1181, 392, 300, 21);
        j20.setBackground(new Color(240, 255, 255));

        j19.setFont(new Font("Serif", 0, 16));
        j19.addMouseListener(this);
        p4.add(j19);
        j19.setBounds(1181, 353, 300, 21);
        j19.setBackground(new Color(240, 255, 255));

        j21.setFont(new Font("Serif", 0, 16));
        j21.addMouseListener(this);
        p4.add(j21);
        j21.setBounds(1181, 431, 300, 21);
        j21.setBackground(new Color(240, 255, 255));

        j22.setFont(new Font("Serif", 0, 16));
        j22.addMouseListener(this);
        p4.add(j22);
        j22.setBounds(1181, 470, 300, 21);
        j22.setBackground(new Color(240, 255, 255));

        j23.setFont(new Font("Serif", 0, 16));
        j23.addMouseListener(this);
        p4.add(j23);
        j23.setBounds(1181, 509, 300, 21);
        j23.setBackground(new Color(240, 255, 255));

        j25.setFont(new Font("Serif", 0, 16));
        j25.addMouseListener(this);
        p4.add(j25);
        j25.setBounds(1181, 590, 60, 21);
        j25.setBackground(new Color(240, 255, 255));

        j24.setFont(new Font("Serif", 0, 16));
        j24.addMouseListener(this);
        p4.add(j24);
        j24.setBounds(1181, 548, 60, 21);
        j24.setBackground(new Color(240, 255, 255));
        
        p5 = new JPanel();
        jh1 = new JLabel();
        h2 = new JLabel();
        h3 = new JLabel();
        txtbirthdate2 = new JTextField();
        txtname4 = new JTextField();
        h4 = new JLabel();
        h5 = new JLabel();
        h6 = new JLabel();
        jl26 = new JLabel();
        jl27 = new JLabel();
        jl28 = new JLabel();
        jl29 = new JLabel();
        h7 = new JLabel();
        h8 = new JLabel();
        txtfirstgroup2 = new JTextField();
        h9 = new JLabel();
        h10 = new JLabel();
        h11 = new JLabel();
        h12 = new JLabel();
        txtsecondgroup2 = new JTextField();
        txtthirdgroup2 = new JTextField();
        txtfourthgroup2 = new JTextField();
        txtfifthgroup2 = new JTextField();
        cmdclearboxes2 = new JButton();
        cmdsubmit4 = new JButton();
        jl1 = new JCheckBox();
        jl2 = new JCheckBox();
        jl3 = new JCheckBox();
        jl4 = new JCheckBox();
        jl5 = new JCheckBox();
        jl6 = new JCheckBox();
        jl7 = new JCheckBox();
        jl8 = new JCheckBox();
        jl9 = new JCheckBox();
        jl10 = new JCheckBox();
        jl11 = new JCheckBox();
        jl12 = new JCheckBox();
        jl13 = new JCheckBox();
        jl14 = new JCheckBox();
        jl15 = new JCheckBox();
        jl16 = new JCheckBox();
        jl17 = new JCheckBox();
        jl18 = new JCheckBox();
        jl19 = new JCheckBox();
        jl20 = new JCheckBox();
        jl21 = new JCheckBox();
        jl22 = new JCheckBox();
        jl23 = new JCheckBox();
        jl24 = new JCheckBox();
        jl25 = new JCheckBox();

        p5.setMinimumSize(new Dimension(1200, 450));
        p5.setPreferredSize(new Dimension(1500, 850));
        p5.setBackground(new Color(240, 255, 255));
        p5.setLayout(null);

        jh1.setFont(new Font("Serif", 0, 16)); 
        jh1.setText("Hangout Group Network");
        p5.add(jh1);
        jh1.setBounds(10, 11, 153, 22);

        h2.setFont(new Font("Serif", 0, 16)); 
        h2.setText("Name:");
        p5.add(h2);
        h2.setBounds(10, 52, 40, 22);

        h3.setFont(new Font("Serif", 0, 16)); 
        h3.setText("Date of Birth:");
        p5.add(h3);
        h3.setBounds(10, 95, 81, 22);

        txtbirthdate2.setFont(new Font("Serif", 0, 14));
        p5.add(txtbirthdate2);
        txtbirthdate2.setBounds(109, 94, 170, 25);

        txtname4.setFont(new Font("Serif", 0, 14));
        p5.add(txtname4);
        txtname4.setBounds(68, 51, 211, 25);

        h4.setFont(new Font("Serif", 0, 16)); 
        h4.setText("Please click on the top five groups you would hangout with in order.");
        p5.add(h4);
        h4.setBounds(837, 11, 408, 22);

        h5.setFont(new Font("Serif", 0, 16)); 
        h5.setText("Formal Groups");
        p5.add(h5);
        h5.setBounds(827, 73, 92, 22);

        h6.setFont(new Font("Serif", 0, 16)); 
        h6.setText("Informal \"Groups\" / \"Situations\"");
        p5.add(h6);
        h6.setBounds(1245, 73, 300, 22);

        jl26.setFont(new Font("Serif", 0, 16));        
        p5.add(jl26);
        jl26.setBounds(900, 502, 200, 22);

        jl27.setFont(new Font("Serif", 0, 16));       
        p5.add(jl27);
        jl27.setBounds(900, 542, 200, 22);
        
        jl28.setFont(new Font("Serif", 0, 16));  
        p5.add(jl28);
        jl28.setBounds(1320, 542, 500, 22);
        
        jl29.setFont(new Font("Serif", 0, 16)); 
        p5.add(jl29);
        jl29.setBounds(1320, 582, 500, 22);

        h7.setFont(new Font("Serif", 0, 48)); 
        h7.setText("YOU");
        p5.add(h7);
        h7.setBounds(1042, 210, 105, 62);

        h8.setFont(new Font("Serif", 0, 16)); 
        h8.setText("Which of the following groups do you hangout with most of the time?");
        p5.add(h8);
        h8.setBounds(10, 202, 413, 22);

        txtfirstgroup2.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtfirstgroup2);
        txtfirstgroup2.setBounds(441, 201, 238, 25);

        h9.setFont(new Font("Serif", 0, 16)); 
        h9.setText("The Second group you hangout with most of the time?:");
        p5.add(h9);
        h9.setBounds(10, 238, 328, 22);

        h10.setFont(new Font("Serif", 0, 16)); 
        h10.setText("The Third group you hangout with most of the time?:");
        p5.add(h10);
        h10.setBounds(10, 281, 314, 22);

        h11.setFont(new Font("Serif", 0, 16)); 
        h11.setText("The Fourth group you hangout with most of the time?:");
        p5.add(h11);
        h11.setBounds(10, 324, 322, 22);

        h12.setFont(new Font("Serif", 0, 16)); 
        h12.setText("The Fifth group you hangout with most of the time?:");
        p5.add(h12);
        h12.setBounds(10, 367, 309, 22);

        txtsecondgroup2.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtsecondgroup2);
        txtsecondgroup2.setBounds(441, 237, 238, 25);

        txtthirdgroup2.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtthirdgroup2);
        txtthirdgroup2.setBounds(441, 280, 238, 25);

        txtfourthgroup2.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtfourthgroup2);
        txtfourthgroup2.setBounds(441, 323, 238, 25);

        txtfifthgroup2.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtfifthgroup2);
        txtfifthgroup2.setBounds(441, 366, 238, 25);

        cmdsubmit4.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit4.setText("Submit");
        cmdsubmit4.addActionListener(formListener);
        p5.add(cmdsubmit4);
        cmdsubmit4.setBounds(596, 435, 109, 39);

        cmdclearboxes2.setFont(new Font("Serif", 0, 14)); 
        cmdclearboxes2.setText("Clear Boxes");
        cmdclearboxes2.addActionListener(formListener);
        p5.add(cmdclearboxes2);
        cmdclearboxes2.setBounds(405, 435, 115, 39);

        jl1.setFont(new Font("Serif", 0, 16));
        jl1.addMouseListener(this);
        p5.add(jl1);
        jl1.setBounds(827, 112, 200, 21);
        jl1.setBackground(new Color(240, 255, 255));

        jl2.setFont(new Font("Serif", 0, 16)); 
        jl2.addMouseListener(this);
        p5.add(jl2);
        jl2.setBounds(827, 151, 300, 21);
        jl2.setBackground(new Color(240, 255, 255));

        jl3.setFont(new Font("Serif", 0, 16));
        jl3.addMouseListener(this);
        p5.add(jl3);
        jl3.setBounds(827, 190, 300, 21);
        jl3.setBackground(new Color(240, 255, 255));

        jl4.setFont(new java.awt.Font("Serif", 0, 16));
        jl4.addMouseListener(this);
        p5.add(jl4);
        jl4.setBounds(827, 229, 200, 21);
        jl4.setBackground(new Color(240, 255, 255));

        jl5.setFont(new java.awt.Font("Serif", 0, 16));
        jl5.addMouseListener(this);
        p5.add(jl5);
        jl5.setBounds(827, 268, 200, 21);
        jl5.setBackground(new Color(240, 255, 255));

        jl6.setFont(new Font("Serif", 0, 16)); 
        jl6.addMouseListener(this);
        p5.add(jl6);
        jl6.setBounds(827, 307, 230, 21);
        jl6.setBackground(new Color(240, 255, 255));

        jl7.setFont(new Font("Serif", 0, 16)); 
        jl7.addMouseListener(this);
        p5.add(jl7);
        jl7.setBounds(827, 346, 200, 21);
        jl7.setBackground(new Color(240, 255, 255));

        jl8.setFont(new Font("Serif", 0, 16));
        jl8.addMouseListener(this);
        p5.add(jl8);
        jl8.setBounds(827, 385, 200, 21);
        jl8.setBackground(new Color(240, 255, 255));

        jl9.setFont(new Font("Serif", 0, 16)); 
        jl9.addMouseListener(this);
        p5.add(jl9);
        jl9.setBounds(827, 424, 200, 21);
        jl9.setBackground(new Color(240, 255, 255));

        jl10.setFont(new Font("Serif", 0, 16));
        jl10.addMouseListener(this);
        p5.add(jl10);
        jl10.setBounds(827, 463, 200, 21);
        jl10.setBackground(new Color(240, 255, 255));

        jl11.setFont(new Font("Serif", 0, 16));
        jl11.addMouseListener(this);
        p5.add(jl11);
        jl11.setBounds(827, 502, 70, 21);
        jl11.setBackground(new Color(240, 255, 255));

        jl12.setFont(new Font("Serif", 0, 16));
        jl12.addMouseListener(this);
        p5.add(jl12);
        jl12.setBounds(827, 542, 60, 21);
        jl12.setBackground(new Color(240, 255, 255));

        jl13.setFont(new Font("Serif", 0, 16));
        jl13.addMouseListener(this);
        p5.add(jl13);
        jl13.setBounds(1245, 113, 300, 21);
        jl13.setBackground(new Color(240, 255, 255));

        jl14.setFont(new Font("Serif", 0, 16));
        jl14.addMouseListener(this);
        p5.add(jl14);
        jl14.setBounds(1245, 152, 300, 21);
        jl14.setBackground(new Color(240, 255, 255));

        jl15.setFont(new Font("Serif", 0, 16));
        jl15.addMouseListener(this);
        p5.add(jl15);
        jl15.setBounds(1245, 191, 300, 21);
        jl15.setBackground(new Color(240, 255, 255));

        jl16.setFont(new Font("Serif", 0, 16));
        jl16.addMouseListener(this);
        p5.add(jl16);
        jl16.setBounds(1245, 230, 280, 21);
        jl16.setBackground(new Color(240, 255, 255));

        jl17.setFont(new Font("Serif", 0, 16));
        jl17.addMouseListener(this);
        p5.add(jl17);
        jl17.setBounds(1245, 269, 300, 21);
        jl17.setBackground(new Color(240, 255, 255));

        jl18.setFont(new Font("Serif", 0, 16));
        jl18.addMouseListener(this);
        p5.add(jl18);
        jl18.setBounds(1245, 308, 300, 21);
        jl18.setBackground(new Color(240, 255, 255));

        jl19.setFont(new Font("Serif", 0, 16));
        jl19.addMouseListener(this);
        p5.add(jl19);
        jl19.setBounds(1245, 347, 300, 21);
        jl19.setBackground(new Color(240, 255, 255));

        jl20.setFont(new Font("Serif", 0, 16)); 
        jl20.addMouseListener(this);
        p5.add(jl20);
        jl20.setBounds(1245, 386, 300, 21);
        jl20.setBackground(new Color(240, 255, 255));

        jl21.setFont(new Font("Serif", 0, 16));
        jl21.addMouseListener(this);
        p5.add(jl21);
        jl21.setBounds(1245, 425, 300, 21);
        jl21.setBackground(new Color(240, 255, 255));

        jl22.setFont(new Font("Serif", 0, 16));
        jl22.addMouseListener(this);
        p5.add(jl22);
        jl22.setBounds(1245, 464, 300, 21);
        jl22.setBackground(new Color(240, 255, 255));

        jl23.setFont(new Font("Serif", 0, 16));
        jl23.addMouseListener(this);
        p5.add(jl23);
        jl23.setBounds(1245, 503, 300, 21);
        jl23.setBackground(new Color(240, 255, 255));

        jl24.setFont(new Font("Serif", 0, 16)); 
        jl24.addMouseListener(this);
        p5.add(jl24);
        jl24.setBounds(1245, 542, 60, 21);
        jl24.setBackground(new Color(240, 255, 255));

        jl25.setFont(new Font("Serif", 0, 16));
        jl25.addMouseListener(this);
        p5.add(jl25);
        jl25.setBounds(1245, 582, 60, 21);
        jl25.setBackground(new Color(240, 255, 255));
        
        p6 = new Drawing();
        o1 = new JLabel();
        o2 = new JLabel();
        o3 = new JLabel();
        txtname5 = new JTextField();
        txtbirthdate5 = new JTextField();
        gg4 = new JLabel();
        gg3 = new JLabel();
        gg5 = new JLabel();
        gg1 = new JLabel();
        gg2 = new JLabel();
        cmdsubmit5 = new JButton();
        o4 = new JLabel();
        o5 = new JLabel();
        o6 = new JLabel();
        o7 = new JLabel();
        o8 = new JLabel();

        p6.setMinimumSize(new Dimension(1200, 450));
        p6.setPreferredSize(new Dimension(1500, 850));
        p6.setBackground(new Color(240, 255, 255));
        p6.setLayout(null);

        o1.setFont(new Font("Serif", 0, 18)); 
        o1.setText("Sociogram");
        p6.add(o1);
        o1.setBounds(10, 11, 76, 24);

        o2.setFont(new Font("Serif", 0, 16)); 
        o2.setText("Name:");
        p6.add(o2);
        o2.setBounds(10, 54, 40, 22);

        o3.setFont(new Font("Serif", 0, 16)); 
        o3.setText("Date of Birth:");
        p6.add(o3);
        o3.setBounds(10, 97, 81, 22);

        txtname5.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtname5);
        txtname5.setBounds(68, 53, 215, 25);

        txtbirthdate5.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtbirthdate5);
        txtbirthdate5.setBounds(109, 96, 174, 25);

        gg4.setFont(new Font("Serif", 0, 16));
        gg4.setText("");
        p6.add(gg4);
        gg4.setBounds(82, 259, 200, 22);

        gg3.setFont(new Font("Serif", 0, 16));
        gg3.setText("");
        p6.add(gg3);
        gg3.setBounds(82, 219, 200, 22);

        gg5.setFont(new Font("Serif", 0, 16));
        gg5.setText("");
        p6.add(gg5);
        gg5.setBounds(82, 299, 200, 22);

        gg1.setFont(new Font("Serif", 0, 16));
        gg1.setText("");
        p6.add(gg1);
        gg1.setBounds(82, 139, 200, 22);

        gg2.setFont(new Font("Serif", 0, 16));
        gg2.setText("");
        p6.add(gg2);
        gg2.setBounds(82, 179, 200, 22);

        cmdsubmit5.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit5.setText("Submit");
        cmdsubmit5.addActionListener(formListener);
        p6.add(cmdsubmit5);
        cmdsubmit5.setBounds(10, 339, 118, 40);

        o4.setFont(new Font("Serif", 0, 16)); 
        o4.setText("Group 1:");
        p6.add(o4);
        o4.setBounds(10, 139, 54, 22);

        o5.setFont(new Font("Serif", 0, 16)); 
        o5.setText("Group 2:");
        p6.add(o5);
        o5.setBounds(10, 179, 54, 22);

        o6.setFont(new Font("Serif", 0, 16)); 
        o6.setText("Group 3:");
        p6.add(o6);
        o6.setBounds(10, 219, 54, 22);

        o7.setFont(new Font("Serif", 0, 16)); 
        o7.setText("Group 4:");
        p6.add(o7);
        o7.setBounds(10, 259, 54, 22);

        o8.setFont(new Font("Serif", 0, 16)); 
        o8.setText("Group 5:");
        p6.add(o8);
        o8.setBounds(10, 299, 54, 22);
        
        p7 = new JPanel();
        t1 = new JLabel();
        t2 = new JLabel();
        txtname6 = new JTextField();
        txtbirthdate6 = new JTextField();
        t3 = new JLabel();
        t4 = new JLabel();
        t5 = new JLabel();
        txtgroup1 = new JTextField();
        t6 = new JLabel();
        t7 = new JLabel();
        t8 = new JLabel();
        t9 = new JLabel();
        t10 = new JLabel();
        t11 = new JLabel();
        t12 = new JLabel();
        t13 = new JLabel();
        t14 = new JLabel();
        t15 = new JLabel();
        t16 = new JLabel();
        txtinnetwork = new JTextField();
        txtknownetwork = new JTextField();
        txttrustclosely = new JTextField();
        txtregularlyhangout = new JTextField();
        boxhangoutoften = new JComboBox();
        boxknowothers = new JComboBox();
        boxconnectothers = new JComboBox();
        sc1 = new JScrollPane();
        txtconnectothers = new JTextArea();
        sliderclosiness = new JSlider();
        sliderpersonalclosiness = new JSlider();
        slidergroupreact = new JSlider();
        cmdclear = new JButton();
        cmdsubmit6 = new JButton();

        p7.setMinimumSize(new Dimension(1300, 900));
        p7.setPreferredSize(new Dimension(1300, 900));
        p7.setBackground(new Color(240, 255, 255));
        p7.setLayout(null);

        t1.setFont(new Font("Serif", 0, 16)); 
        t1.setText("Network Structure-Processes");
        p7.add(t1);
        t1.setBounds(10, 11, 181, 22);

        t2.setFont(new Font("Serif", 0, 16)); 
        t2.setText("How many people are there in this network?: ");
        p7.add(t2);
        t2.setBounds(10, 181, 274, 22);

        txtname6.setFont(new Font("Serif", 0, 14)); 
        p7.add(txtname6);
        txtname6.setBounds(109, 51, 215, 25);

        txtbirthdate6.setFont(new Font("Serif", 0, 14)); 
        p7.add(txtbirthdate6);
        txtbirthdate6.setBounds(109, 94, 215, 25);

        t3.setFont(new Font("Serif", 0, 16)); 
        t3.setText("Date of Birth:");
        p7.add(t3);
        t3.setBounds(10, 95, 81, 22);

        t4.setFont(new Font("Serif", 0, 16)); 
        t4.setText("Name:");
        p7.add(t4);
        t4.setBounds(10, 52, 40, 22);

        t5.setFont(new Font("Serif", 0, 16)); 
        t5.setText("Group:");
        p7.add(t5);
        t5.setBounds(10, 138, 42, 22);

        txtgroup1.setFont(new Font("Serif", 0, 14)); 
        p7.add(txtgroup1);
        txtgroup1.setBounds(109, 137, 215, 25);

        t6.setFont(new Font("Serif", 0, 16)); 
        t6.setText("How many people do you know in this network?:");
        p7.add(t6);
        t6.setBounds(10, 224, 297, 22);

        t7.setFont(new Font("Serif", 0, 16)); 
        t7.setText("How many people do you know closely and trust in this network?:");
        p7.add(t7);
        t7.setBounds(10, 267, 398, 22);

        t8.setFont(new Font("Serif", 0, 16)); 
        t8.setText("How many people in this network do you hang out with regularly?:");
        p7.add(t8);
        t8.setBounds(10, 310, 398, 22);

        t9.setFont(new Font("Serif", 0, 16)); 
        t9.setText("How often do you hangout with them?:");
        p7.add(t9);
        t9.setBounds(10, 353, 233, 22);

        t10.setFont(new Font("Serif", 0, 16)); 
        t10.setText("Are there people in the network who seem to know a bunch of people outside the group?");
        p7.add(t10);
        t10.setBounds(10, 396, 538, 22);

        t11.setFont(new Font("Serif", 0, 16)); 
        t11.setText("Has anyone in the group every connected you to someone outside the group?:");
        p7.add(t11);
        t11.setBounds(10, 439, 467, 22);

        t12.setFont(new Font("Serif", 0, 16)); 
        t12.setText("Please give an example of this!:");
        p7.add(t12);
        t12.setBounds(290, 481, 187, 22);

        t13.setFont(new Font("Serif", 0, 16)); 
        t13.setText("How close to each other do you think people are in this group?( scale out of 10):");
        p7.add(t13);
        t13.setBounds(10, 569, 485, 22);

        t14.setFont(new Font("Serif", 0, 16)); 
        t14.setText("How close are you to members of this group?(scale out of 10):");
        p7.add(t14);
        t14.setBounds(10, 637, 377, 22);

        t15.setFont(new Font("Serif", 0, 16)); 
        t15.setText("How would members of this group react if they found out that you were ");
        p7.add(t15);
        t15.setBounds(10, 707, 434, 22);

        t16.setFont(new Font("Serif", 0, 16)); 
        t16.setText("spending time with people from other groups instead of them?(scale out of 10):");
        p7.add(t16);
        t16.setBounds(10, 735, 472, 22);

        txtinnetwork.setFont(new Font("Serif", 0, 14)); 
        p7.add(txtinnetwork);
        txtinnetwork.setBounds(440, 180, 185, 25);

        txtknownetwork.setFont(new Font("Serif", 0, 14)); 
        p7.add(txtknownetwork);
        txtknownetwork.setBounds(440, 223, 185, 25);

        txttrustclosely.setFont(new Font("Serif", 0, 14)); 
        p7.add(txttrustclosely);
        txttrustclosely.setBounds(440, 266, 185, 25);

        txtregularlyhangout.setFont(new Font("Serif", 0, 14));
        p7.add(txtregularlyhangout);
        txtregularlyhangout.setBounds(440, 309, 185, 25);

        boxhangoutoften.setFont(new Font("Serif", 0, 14)); 
        boxhangoutoften.setMaximumRowCount(6);
        boxhangoutoften.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daily", "Weekly", "Monthly", "Every 3-6 Months", "Every 7 months or more" }));
        p7.add(boxhangoutoften);
        boxhangoutoften.setBounds(440, 352, 185, 25);

        boxknowothers.setFont(new Font("Serif", 0, 14)); 
        boxknowothers.setMaximumRowCount(3);
        boxknowothers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p7.add(boxknowothers);
        boxknowothers.setBounds(603, 395, 118, 25);

        boxconnectothers.setFont(new Font("Serif", 0, 14)); 
        boxconnectothers.setMaximumRowCount(3);
        boxconnectothers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p7.add(boxconnectothers);
        boxconnectothers.setBounds(603, 438, 118, 25);

        txtconnectothers.setColumns(20);
        txtconnectothers.setFont(new java.awt.Font("Serif", 0, 14)); 
        txtconnectothers.setRows(5);
        sc1.setViewportView(txtconnectothers);
        txtconnectothers.setLineWrap(true);
        txtconnectothers.setWrapStyleWord(true);

        p7.add(sc1);
        sc1.setBounds(495, 481, 226, 69);

        sliderclosiness.setMajorTickSpacing(2);
        sliderclosiness.setMaximum(10);
        sliderclosiness.setMinorTickSpacing(1);
        sliderclosiness.setPaintLabels(true);
        sliderclosiness.setPaintTicks(true);
        sliderclosiness.setToolTipText("");
        sliderclosiness.setValue(0);
        sliderclosiness.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(sliderclosiness);
        sliderclosiness.setBounds(513, 569, 200, 51);

        sliderpersonalclosiness.setMajorTickSpacing(2);
        sliderpersonalclosiness.setMaximum(10);
        sliderpersonalclosiness.setMinorTickSpacing(1);
        sliderpersonalclosiness.setPaintLabels(true);
        sliderpersonalclosiness.setPaintTicks(true);
        sliderpersonalclosiness.setValue(0);
        sliderpersonalclosiness.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(sliderpersonalclosiness);
        sliderpersonalclosiness.setBounds(513, 637, 200, 51);

        slidergroupreact.setMajorTickSpacing(2);
        slidergroupreact.setMaximum(10);
        slidergroupreact.setMinorTickSpacing(1);
        slidergroupreact.setPaintLabels(true);
        slidergroupreact.setPaintTicks(true);
        slidergroupreact.setValue(0);
        slidergroupreact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.add(slidergroupreact);
        slidergroupreact.setBounds(513, 706, 200, 51);

        cmdclear.setFont(new Font("Serif", 0, 14)); 
        cmdclear.setText("Clear Form");
        cmdclear.addActionListener(formListener);
        p7.add(cmdclear);
        cmdclear.setBounds(780, 730, 110, 35);

        cmdsubmit6.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit6.setText("Submit");
        cmdsubmit6.addActionListener(formListener);
        p7.add(cmdsubmit6);
        cmdsubmit6.setBounds(915, 730, 96, 35);
        
        p8 = new JPanel();
        txtname7 = new JTextField();
        txtbirthdate7 = new JTextField();
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
        cmdclearform8 = new JButton();
        cmdsubmit7 = new JButton();
        e19 = new JLabel();

        p8.setMinimumSize(new Dimension(450, 450));
        p8.setPreferredSize(new Dimension(950, 750));
        p8.setBackground(new Color(240, 255, 255));
        p8.setLayout(null);

        txtname7.setFont(new Font("Serif", 0, 14)); 
        p8.add(txtname7);
        txtname7.setBounds(109, 51, 215, 25);

        txtbirthdate7.setFont(new Font("Serif", 0, 14)); 
        p8.add(txtbirthdate7);
        txtbirthdate7.setBounds(109, 94, 215, 25);

        e3.setFont(new Font("Serif", 0, 16)); 
        e3.setText("Date of Birth:");
        p8.add(e3);
        e3.setBounds(10, 95, 81, 22);

        e4.setFont(new java.awt.Font("Serif", 0, 16)); 
        e4.setText("Name:");
        p8.add(e4);
        e4.setBounds(10, 52, 40, 22);

        e5.setFont(new Font("Serif", 0, 16)); 
        e5.setText("Group:");
        p8.add(e5);
        e5.setBounds(10, 138, 42, 22);

        txtgroup12.setFont(new Font("Serif", 0, 14)); 
        p8.add(txtgroup12);
        txtgroup12.setBounds(109, 137, 215, 25);

        e1.setFont(new Font("Serif", 0, 16)); 
        e1.setText("Emotional Resources");
        p8.add(e1);
        e1.setBounds(10, 11, 127, 22);

        e2.setFont(new Font("Serif", 0, 16)); 
        e2.setText("People in the group are comfortable discussing");
        p8.add(e2);
        e2.setBounds(10, 220, 280, 22);

        e6.setFont(new Font("Serif", 0, 16)); 
        e6.setText("significant problems with each other.");
        p8.add(e6);
        e6.setBounds(10, 246, 218, 22);

        slider1.setMajorTickSpacing(2);
        slider1.setMaximum(10);
        slider1.setMinorTickSpacing(1);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        slider1.setValue(0);
        slider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(slider1);
        slider1.setBounds(308, 220, 247, 51);

        e7.setFont(new Font("Serif", 0, 16)); 
        e7.setText("It is easy for people to be honest with each");
        p8.add(e7);
        e7.setBounds(10, 289, 258, 22);

        e8.setFont(new Font("Serif", 0, 16)); 
        e8.setText("other in this group.");
        p8.add(e8);
        e8.setBounds(10, 315, 112, 22);

        slider2.setMajorTickSpacing(2);
        slider2.setMaximum(10);
        slider2.setMinorTickSpacing(1);
        slider2.setPaintLabels(true);
        slider2.setPaintTicks(true);
        slider2.setValue(0);
        slider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(slider2);
        slider2.setBounds(308, 289, 247, 51);

        e9.setFont(new Font("Serif", 0, 16)); 
        e9.setText("People in this group accept criticism of faults");
        p8.add(e9);
        e9.setBounds(10, 358, 267, 22);

        e10.setFont(new Font("Serif", 0, 16));
        e10.setText("and mistakes from other people in the group.");
        p8.add(e10);
        e10.setBounds(10, 384, 269, 22);

        slider3.setMajorTickSpacing(2);
        slider3.setMaximum(10);
        slider3.setMinorTickSpacing(1);
        slider3.setPaintLabels(true);
        slider3.setPaintTicks(true);
        slider3.setValue(0);
        slider3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(slider3);
        slider3.setBounds(308, 358, 247, 51);

        e11.setFont(new Font("Serif", 0, 16)); 
        e11.setText("People in this group tend to emotionally");
        p8.add(e11);
        e11.setBounds(10, 427, 237, 22);

        slider4.setMajorTickSpacing(2);
        slider4.setMaximum(10);
        slider4.setMinorTickSpacing(1);
        slider4.setPaintLabels(true);
        slider4.setPaintTicks(true);
        slider4.setValue(0);
        slider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(slider4);
        slider4.setBounds(308, 427, 247, 51);

        e12.setFont(new Font("Serif", 0, 16)); 
        e12.setText("support each other.");
        p8.add(e12);
        e12.setBounds(10, 453, 117, 22);

        e13.setFont(new Font("Serif", 0, 16)); 
        e13.setText("People in this group trust each other.");
        p8.add(e13);
        e13.setBounds(10, 496, 220, 22);

        slider5.setMajorTickSpacing(2);
        slider5.setMaximum(10);
        slider5.setMinorTickSpacing(1);
        slider5.setPaintLabels(true);
        slider5.setPaintTicks(true);
        slider5.setValue(0);
        slider5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(slider5);
        slider5.setBounds(308, 496, 247, 51);

        slider6.setMajorTickSpacing(2);
        slider6.setMaximum(10);
        slider6.setMinorTickSpacing(1);
        slider6.setPaintLabels(true);
        slider6.setPaintTicks(true);
        slider6.setValue(0);
        slider6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.add(slider6);
        slider6.setBounds(308, 565, 247, 51);

        e14.setFont(new Font("Serif", 0, 16)); 
        e14.setText("People tend to accept each other's faults");
        p8.add(e14);
        e14.setBounds(10, 565, 243, 22);

        e15.setFont(new Font("Serif", 0, 16));
        e15.setText("and mistakes.");
        p8.add(e15);
        e15.setBounds(10, 591, 82, 22);

        cmdclearform8.setFont(new Font("Serif", 0, 14)); 
        cmdclearform8.setText("Clear");
        cmdclearform8.addActionListener(formListener);
        p8.add(cmdclearform8);
        cmdclearform8.setBounds(690, 585, 116, 35);

        cmdsubmit7.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit7.setText("Submit");
        cmdsubmit7.addActionListener(formListener);
        p8.add(cmdsubmit7);
        cmdsubmit7.setBounds(830, 585, 117, 35);

        e19.setFont(new Font("Serif", 0, 16)); 
        e19.setText("Please indicate how true the following statements are about emotional resources in this group! (scale is out of 10)");
        p8.add(e19);
        e19.setBounds(10, 180, 676, 22);
        
        p9 = new JPanel();
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
        txtgroup14 = new JTextField();
        cmdclearform9 = new JButton();
        f15 = new JLabel();
        txtname8 = new JTextField();
        cmdsubmit8 = new JButton();
        js5 = new JSlider();
        f3 = new JLabel();
        f13 = new JLabel();
        txtbirthdate8 = new JTextField();
        f14 = new JLabel();
        f5 = new JLabel();
        js6 = new JSlider();
        f4 = new JLabel();
        f16 = new JLabel();
        f17 = new JLabel();
        f18 = new JLabel();
        f19 = new JLabel();

        p9.setMinimumSize(new Dimension(450, 450));
        p9.setPreferredSize(new Dimension(950, 750));
        p9.setBackground(new Color(240, 255, 255));
        p9.setLayout(null);

        f1.setFont(new Font("Serif", 0, 16)); 
        f1.setText("Financial Resources");
        p9.add(f1);
        f1.setBounds(10, 11, 120, 22);

        f2.setFont(new Font("Serif", 0, 16)); 
        f2.setText("The group would be willing to lend other");
        p9.add(f2);
        f2.setBounds(10, 220, 243, 22);

        f8.setFont(new Font("Serif", 0, 16)); 
        f8.setText("member a car for a couple of weeks.");
        p9.add(f8);
        f8.setBounds(10, 315, 222, 22);

        f7.setFont(new Font("Serif", 0, 16)); 
        f7.setText("The group would be willing to lend a group ");
        p9.add(f7);
        f7.setBounds(10, 289, 262, 22);

        js1.setMajorTickSpacing(2);
        js1.setMaximum(10);
        js1.setMinorTickSpacing(1);
        js1.setPaintLabels(true);
        js1.setPaintTicks(true);
        js1.setValue(0);
        js1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(js1);
        js1.setBounds(290, 220, 247, 51);

        f6.setFont(new Font("Serif", 0, 16)); 
        f6.setText("group members $100 in an emergency. ");
        p9.add(f6);
        f6.setBounds(10, 246, 239, 22);

        js3.setMajorTickSpacing(2);
        js3.setMaximum(10);
        js3.setMinorTickSpacing(1);
        js3.setPaintLabels(true);
        js3.setPaintTicks(true);
        js3.setValue(0);
        js3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(js3);
        js3.setBounds(290, 358, 247, 51);

        f10.setFont(new Font("Serif", 0, 16)); 
        f10.setText("stay the group would be will to let them live");
        p9.add(f10);
        f10.setBounds(10, 384, 260, 22);

        f9.setFont(new Font("Serif", 0, 16)); 
        f9.setText("If someone in the group needed a place to ");
        p9.add(f9);
        f9.setBounds(10, 358, 257, 22);

        js2.setMajorTickSpacing(2);
        js2.setMaximum(10);
        js2.setMinorTickSpacing(1);
        js2.setPaintLabels(true);
        js2.setPaintTicks(true);
        js2.setValue(0);
        js2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(js2);
        js2.setBounds(290, 289, 247, 51);

        f11.setFont(new Font("Serif", 0, 16)); 
        f11.setText("The group has people who could provide");
        p9.add(f11);
        f11.setBounds(10, 465, 248, 22);

        js4.setMajorTickSpacing(2);
        js4.setMaximum(10);
        js4.setMinorTickSpacing(1);
        js4.setPaintLabels(true);
        js4.setPaintTicks(true);
        js4.setValue(0);
        js4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(js4);
        js4.setBounds(290, 465, 247, 51);

        f12.setFont(new Font("Serif", 0, 16)); 
        f12.setText("legal advice at a reduced/free rate. ");
        p9.add(f12);
        f12.setBounds(10, 491, 211, 22);

        txtgroup14.setFont(new Font("Serif", 0, 14)); 
        p9.add(txtgroup14);
        txtgroup14.setBounds(109, 137, 215, 25);

        cmdclearform9.setFont(new Font("Serif", 0, 14)); 
        cmdclearform9.setText("Clear ");
        cmdclearform9.addActionListener(formListener);
        p9.add(cmdclearform9);
        cmdclearform9.setBounds(680, 643, 116, 35);

        f15.setFont(new Font("Serif", 0, 16)); 
        f15.setText("reduced/free rate.");
        p9.add(f15);
        f15.setBounds(10, 649, 107, 22);

        txtname8.setFont(new Font("Serif", 0, 14)); 
        p9.add(txtname8);
        txtname8.setBounds(109, 51, 215, 25);

        cmdsubmit8.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit8.setText("Submit");
        cmdsubmit8.addActionListener(formListener);
        p9.add(cmdsubmit8);
        cmdsubmit8.setBounds(810, 643, 117, 35);

        js5.setMajorTickSpacing(2);
        js5.setMaximum(10);
        js5.setMinorTickSpacing(1);
        js5.setPaintLabels(true);
        js5.setPaintTicks(true);
        js5.setValue(0);
        js5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(js5);
        js5.setBounds(290, 534, 247, 51);

        f3.setFont(new Font("Serif", 0, 16)); 
        f3.setText("Date of Birth:");
        p9.add(f3);
        f3.setBounds(10, 95, 81, 22);

        f13.setFont(new Font("Serif", 0, 16)); 
        f13.setText("If someone in the group needed money to");
        p9.add(f13);
        f13.setBounds(10, 534, 250, 22);

        txtbirthdate8.setFont(new Font("Serif", 0, 14)); 
        p9.add(txtbirthdate8);
        txtbirthdate8.setBounds(109, 94, 215, 25);

        f14.setFont(new Font("Serif", 0, 16)); 
        f14.setText("The group could provide child care at a ");
        p9.add(f14);
        f14.setBounds(10, 623, 241, 22);

        f5.setFont(new Font("Serif", 0, 16)); 
        f5.setText("Group:");
        p9.add(f5);
        f5.setBounds(10, 138, 42, 22);

        js6.setMajorTickSpacing(2);
        js6.setMaximum(10);
        js6.setMinorTickSpacing(1);
        js6.setPaintLabels(true);
        js6.setPaintTicks(true);
        js6.setValue(0);
        js6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.add(js6);
        js6.setBounds(290, 623, 247, 51);

        f4.setFont(new Font("Serif", 0, 16)); 
        f4.setText("Name:");
        p9.add(f4);
        f4.setBounds(10, 52, 40, 22);

        f16.setFont(new java.awt.Font("Serif", 0, 16)); 
        f16.setText("with them for a couple of weeks.");
        p9.add(f16);
        f16.setBounds(10, 415, 197, 22);

        f17.setFont(new java.awt.Font("Serif", 0, 16)); 
        f17.setText("pay the power bill the group would be");
        p9.add(f17);
        f17.setBounds(10, 560, 229, 22);

        f18.setFont(new java.awt.Font("Serif", 0, 16)); 
        f18.setText("willing to help.");
        p9.add(f18);
        f18.setBounds(10, 583, 86, 22);

        f19.setFont(new Font("Serif", 0, 16)); 
        f19.setText("Please indicate how true the following statements are about financial resources in this group! (scale is out of 10)");
        p9.add(f19);
        f19.setBounds(10, 180, 666, 22);

        p10 = new JPanel();
        dd1 = new JLabel();
        dd2 = new JLabel();
        dd3 = new JLabel();
        qe5 = new JSlider();
        dd5 = new JLabel();
        dd14 = new JLabel();
        txtbirthdate9 = new JTextField();
        dd13 = new JLabel();
        dd16 = new JLabel();
        qe6 = new JSlider();
        dd4 = new JLabel();
        dd10 = new JLabel();
        qe3 = new JSlider();
        dd6 = new JLabel();
        qe1 = new JSlider();
        dd7 = new JLabel();
        dd8 = new JLabel();
        dd9 = new JLabel();
        dd17 = new JLabel();
        dd11 = new JLabel();
        qe2 = new JSlider();
        dd19 = new JLabel();
        dd12 = new JLabel();
        qe4 = new JSlider();
        txtgroup13 = new JTextField();
        cmdclearform10 = new JButton();
        dd15 = new JLabel();
        txtname9 = new JTextField();
        cmdsubmit9 = new JButton();
        dd20 = new JLabel();

        p10.setMinimumSize(new Dimension(450, 450));
        p10.setPreferredSize(new Dimension(950, 750));
        p10.setBackground(new Color(240, 255, 255));
        p10.setLayout(null);

        dd1.setFont(new Font("Serif", 0, 16)); 
        dd1.setText("Drug Habits");
        p10.add(dd1);
        dd1.setBounds(10, 11, 73, 22);

        dd2.setFont(new Font("Serif", 0, 16));
        dd2.setText("A group member arrives visibly drunk/high");
        p10.add(dd2);
        dd2.setBounds(10, 220, 255, 22);

        dd3.setFont(new Font("Serif", 0, 16)); 
        dd3.setText("Date of Birth:");
        p10.add(dd3);
        dd3.setBounds(10, 95, 81, 22);

        qe5.setMajorTickSpacing(2);
        qe5.setMaximum(10);
        qe5.setMinorTickSpacing(1);
        qe5.setPaintLabels(true);
        qe5.setPaintTicks(true);
        qe5.setValue(0);
        qe5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(qe5);
        qe5.setBounds(338, 539, 247, 51);

        dd5.setFont(new Font("Serif", 0, 16)); 
        dd5.setText("Group:");
        p10.add(dd5);
        dd5.setBounds(10, 138, 42, 22);

        dd14.setFont(new Font("Serif", 0, 16)); 
        dd14.setText("A group member tells the group that they had");
        p10.add(dd14);
        dd14.setBounds(10, 608, 272, 22);

        txtbirthdate9.setFont(new Font("Serif", 0, 14)); 
        p10.add(txtbirthdate9);
        txtbirthdate9.setBounds(109, 94, 215, 25);

        dd13.setFont(new Font("Serif", 0, 16)); 
        dd13.setText("A group member tells the group: \"I unwind");
        p10.add(dd13);
        dd13.setBounds(10, 539, 255, 22);

        dd16.setFont(new Font("Serif", 0, 16)); 
        dd16.setText("it doesn't become a habit.\"");
        p10.add(dd16);
        dd16.setBounds(10, 430, 159, 22);

        qe6.setMajorTickSpacing(2);
        qe6.setMaximum(10);
        qe6.setMinorTickSpacing(1);
        qe6.setPaintLabels(true);
        qe6.setPaintTicks(true);
        qe6.setValue(0);
        qe6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(qe6);
        qe6.setBounds(338, 608, 247, 51);

        dd4.setFont(new Font("Serif", 0, 16)); 
        dd4.setText("Name:");
        p10.add(dd4);
        dd4.setBounds(10, 52, 40, 22);

        dd10.setFont(new Font("Serif", 0, 16)); 
        dd10.setText("wrong with recreational drug use as long as");
        p10.add(dd10);
        dd10.setBounds(10, 399, 259, 22);

        qe3.setMajorTickSpacing(2);
        qe3.setMaximum(10);
        qe3.setMinorTickSpacing(1);
        qe3.setPaintLabels(true);
        qe3.setPaintTicks(true);
        qe3.setValue(0);
        qe3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(qe3);
        qe3.setBounds(338, 373, 247, 51);

        dd6.setFont(new Font("Serif", 0, 16)); 
        dd6.setText("to a group get together.");
        p10.add(dd6);
        dd6.setBounds(10, 246, 141, 22);

        qe1.setMajorTickSpacing(2);
        qe1.setMaximum(10);
        qe1.setMinorTickSpacing(1);
        qe1.setPaintLabels(true);
        qe1.setPaintTicks(true);
        qe1.setValue(0);
        qe1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(qe1);
        qe1.setBounds(338, 220, 247, 51);

        dd7.setFont(new Font("Serif", 0, 16)); 
        dd7.setText("The group finds out that another group ");
        p10.add(dd7);
        dd7.setBounds(10, 289, 235, 22);

        dd8.setFont(new Font("Serif", 0, 16)); 
        dd8.setText("member is friends with someone who uses");
        p10.add(dd8);
        dd8.setBounds(10, 315, 253, 22);

        dd9.setFont(new Font("Serif", 0, 16)); 
        dd9.setText("A group member states: \"there is nothing");
        p10.add(dd9);
        dd9.setBounds(10, 373, 243, 22);

        dd17.setFont(new Font("Serif", 0, 16)); 
        dd17.setText("with a joint after a long, hard day at work.\"");
        p10.add(dd17);
        dd17.setBounds(10, 565, 258, 22);

        dd11.setFont(new Font("Serif", 0, 16)); 
        dd11.setText("A group member tells the group that they enjoyed");
        p10.add(dd11);
        dd11.setBounds(10, 470, 298, 22);

        qe2.setMajorTickSpacing(2);
        qe2.setMaximum(10);
        qe2.setMinorTickSpacing(1);
        qe2.setPaintLabels(true);
        qe2.setPaintTicks(true);
        qe2.setValue(0);
        qe2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(qe2);
        qe2.setBounds(338, 289, 247, 51);

        dd19.setFont(new Font("Serif", 0, 16)); 
        dd19.setText("Please indicate how true the following statements are about drug habits in this group! (scale is out of 10)");
        p10.add(dd19);
        dd19.setBounds(10, 180, 622, 22);

        dd12.setFont(new Font("Serif", 0, 16)); 
        dd12.setText("a party where there was excessive drinking.");
        p10.add(dd12);
        dd12.setBounds(10, 496, 262, 22);

        qe4.setMajorTickSpacing(2);
        qe4.setMaximum(10);
        qe4.setMinorTickSpacing(1);
        qe4.setPaintLabels(true);
        qe4.setPaintTicks(true);
        qe4.setValue(0);
        qe4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.add(qe4);
        qe4.setBounds(338, 470, 247, 51);

        txtgroup13.setFont(new Font("Serif", 0, 14)); 
        p10.add(txtgroup13);
        txtgroup13.setBounds(109, 137, 215, 25);

        cmdclearform10.setFont(new Font("Serif", 0, 14)); 
        cmdclearform10.setText("Clear ");
        cmdclearform10.addActionListener(formListener);
        p10.add(cmdclearform10);
        cmdclearform10.setBounds(700, 628, 116, 35);

        dd15.setFont(new Font("Serif", 0, 16)); 
        dd15.setText("gotten a DUI.");
        p10.add(dd15);
        dd15.setBounds(10, 634, 83, 22);

        txtname9.setFont(new Font("Serif", 0, 14)); 
        p10.add(txtname9);
        txtname9.setBounds(109, 51, 215, 25);

        cmdsubmit9.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit9.setText("Submit");
        cmdsubmit9.addActionListener(formListener);
        p10.add(cmdsubmit9);
        cmdsubmit9.setBounds(830, 628, 117, 35);

        dd20.setFont(new Font("Serif", 0, 16)); 
        dd20.setText("or sells illegal drugs.");
        p10.add(dd20);
        dd20.setBounds(10, 338, 120, 22);
        
        p11 = new JPanel();
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
        cmdclearform11 = new JButton();
        cmdsubmit10 = new JButton();
        txtname10 = new JTextField();
        txtbirthdate10 = new JTextField();
        txtgroup15 = new JTextField();
        
        p11.setMinimumSize(new Dimension(450, 450));
        p11.setPreferredSize(new Dimension(950, 750));
        p11.setBackground(new Color(240, 255, 255));
        p11.setLayout(null);
        
        cc1.setFont(new Font("Serif", 0, 16)); 
        cc1.setText("Cultural Resources Group 3");
        p11.add(cc1);
        cc1.setBounds(10, 11, 200, 22);

        cc2.setFont(new Font("Serif", 0, 16)); 
        cc2.setText("Name:");
        p11.add(cc2);
        cc2.setBounds(10, 51, 40, 22);

        cc3.setFont(new Font("Serif", 0, 16)); 
        cc3.setText("Date of Birth:");
        p11.add(cc3);
        cc3.setBounds(10, 91, 81, 22);

        cc4.setFont(new Font("Serif", 0, 16)); 
        cc4.setText("Group:");
        p11.add(cc4);
        cc4.setBounds(10, 131, 50, 22);

        cc5.setFont(new Font("Serif", 0, 16)); 
        cc5.setText("People in this group do not talk about books and/or keep");
        p11.add(cc5);
        cc5.setBounds(10, 171, 345, 22);

        cc6.setFont(new Font("Serif", 0, 16)); 
        cc6.setText("up with current events on the internet, television, or radio.");
        p11.add(cc6);
        cc6.setBounds(10, 199, 344, 22);

        ccslider1.setFont(new Font("Serif", 0, 14)); 
        ccslider1.setMajorTickSpacing(2);
        ccslider1.setMaximum(10);
        ccslider1.setMinorTickSpacing(1);
        ccslider1.setPaintLabels(true);
        ccslider1.setPaintTicks(true);
        ccslider1.setValue(0);
        ccslider1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p11.add(ccslider1);
        ccslider1.setBounds(408, 171, 217, 56);

        cc7.setFont(new Font("Serif", 0, 16)); 
        cc7.setText("People in this group often volunteer for charity or");
        p11.add(cc7);
        cc7.setBounds(10, 247, 350, 22);

        ccslider2.setFont(new Font("Serif", 0, 14)); 
        ccslider2.setMajorTickSpacing(2);
        ccslider2.setMaximum(10);
        ccslider2.setMinorTickSpacing(1);
        ccslider2.setPaintLabels(true);
        ccslider2.setPaintTicks(true);
        ccslider2.setValue(0);
        ccslider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p11.add(ccslider2);
        ccslider2.setBounds(408, 245, 217, 56);

        cc8.setFont(new Font("Serif", 0, 16)); 
        cc8.setText("community events (e.g. Relay for Life, Feed the Hungry).");
        p11.add(cc8);
        cc8.setBounds(10, 273, 349, 22);

        ccslider3.setFont(new Font("Serif", 0, 14)); 
        ccslider3.setMajorTickSpacing(2);
        ccslider3.setMaximum(10);
        ccslider3.setMinorTickSpacing(1);
        ccslider3.setPaintLabels(true);
        ccslider3.setPaintTicks(true);
        ccslider3.setValue(0);
        ccslider3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p11.add(ccslider3);
        ccslider3.setBounds(408, 319, 217, 56);

        cc9.setFont(new Font("Serif", 0, 16)); 
        cc9.setText("People in this group tend not to go to plays,");
        p11.add(cc9);
        cc9.setBounds(10, 319, 262, 22);

        cc10.setFont(new Font("Serif", 0, 16)); 
        cc10.setText(" art performances, musesums or musicals.");
        p11.add(cc10);
        cc10.setBounds(10, 347, 250, 22);

        cc11.setFont(new Font("Serif", 0, 16)); 
        cc11.setText("People in this group tend to be connected to \"important\"");
        p11.add(cc11);
        cc11.setBounds(10, 393, 337, 22);

        ccslider4.setFont(new Font("Serif", 0, 14)); 
        ccslider4.setMajorTickSpacing(2);
        ccslider4.setMaximum(10);
        ccslider4.setMinorTickSpacing(1);
        ccslider4.setPaintLabels(true);
        ccslider4.setPaintTicks(true);
        ccslider4.setValue(0);
        ccslider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p11.add(ccslider4);
        ccslider4.setBounds(408, 393, 217, 56);

        cc12.setFont(new Font("Serif", 0, 16)); 
        cc12.setText("members in the communty (e.g. doctors, lawyers, ");
        p11.add(cc12);
        cc12.setBounds(10, 421, 300, 22);

        cc13.setFont(new Font("Serif", 0, 16)); 
        cc13.setText("and local politicians).");
        p11.add(cc13);
        cc13.setBounds(10, 455, 126, 22);

        cc14.setFont(new Font("Serif", 0, 16)); 
        cc14.setText("People in the group tend not to be college-educated.");
        p11.add(cc14);
        cc14.setBounds(10, 495, 316, 22);

        ccslider5.setFont(new Font("Serif", 0, 14)); 
        ccslider5.setMajorTickSpacing(2);
        ccslider5.setMaximum(10);
        ccslider5.setMinorTickSpacing(1);
        ccslider5.setPaintLabels(true);
        ccslider5.setPaintTicks(true);
        ccslider5.setValue(0);
        ccslider5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p11.add(ccslider5);
        ccslider5.setBounds(408, 495, 217, 56);

        cc15.setFont(new Font("Serif", 0, 16)); 
        cc15.setText("People in this group often go to the community library ");
        p11.add(cc15);
        cc15.setBounds(10, 569, 325, 22);

        cc16.setFont(new Font("Serif", 0, 16)); 
        cc16.setText("to check out books or use library resources.");
        p11.add(cc16);
        cc16.setBounds(10, 597, 266, 22);

        ccslider6.setFont(new Font("Serif", 0, 14)); 
        ccslider6.setMajorTickSpacing(2);
        ccslider6.setMaximum(10);
        ccslider6.setMinorTickSpacing(1);
        ccslider6.setPaintLabels(true);
        ccslider6.setPaintTicks(true);
        ccslider6.setValue(0);
        ccslider6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p11.add(ccslider6);
        ccslider6.setBounds(408, 569, 217, 56);

        cmdclearform11.setFont(new Font("Serif", 0, 14)); 
        cmdclearform11.addActionListener(formListener);
        cmdclearform11.setText("Clear");
        p11.add(cmdclearform11);
        cmdclearform11.setBounds(718, 597, 90, 35);

        cmdsubmit10.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit10.addActionListener(formListener);
        cmdsubmit10.setText("Submit");
        p11.add(cmdsubmit10);
        cmdsubmit10.setBounds(827, 597, 100, 35);
        
        txtname10.setFont(new Font("Serif", 0, 14)); 
        p11.add(txtname10);
        txtname10.setBounds(109, 51, 215, 25);

        txtbirthdate10.setFont(new Font("Serif", 0, 14)); 
        p11.add(txtbirthdate10);
        txtbirthdate10.setBounds(109, 94, 215, 25);

        txtgroup15.setFont(new Font("Serif", 0, 14)); 
        p11.add(txtgroup15);
        txtgroup15.setBounds(109, 137, 215, 25);
        
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
        cardPanel.add(p11, "11");       
        
        URL icon = this.getClass().getClassLoader().getResource("research3.jpg");
        ImageIcon ic = new ImageIcon(icon);
        setIconImage(ic.getImage());
        
        getContentPane().add(scrollpane2, BorderLayout.CENTER); 
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
    }
    
    public class FormListener implements java.awt.event.ActionListener, javax.swing.event.ChangeListener {
        FormListener() {}
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == cmdclearform) {
                Module1.this.cmdclearformActionPerformed(evt);
            }
            else if (evt.getSource() == cmdnext2) {
                Module1.this.cmdnext1ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdprevious2) {
                Module1.this.cmdpreviousActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit) {
                Module1.this.cmdsubmitActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit2) {
                Module1.this.cmdsubmit2ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit3) {
                Module1.this.cmdsubmit3ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit4) {
                Module1.this.cmdsubmit4ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit5) {
                Module1.this.cmdsubmit5ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit6) {
                Module1.this.cmdsubmit6ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit7) {
                Module1.this.cmdsubmit7ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit8) {
                Module1.this.cmdsubmit8ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit9) {
                Module1.this.cmdsubmit9ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdsubmit10) {
                Module1.this.cmdsubmit10ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdclearform1) {
                Module1.this.cmdclearform1ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdclearform3) {
                Module1.this.cmdclearform3ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdclearboxes) {
                Module1.this.cmdclearboxesActionPerformed(evt);
            }
            else if (evt.getSource() == cmdclearboxes2) {
                Module1.this.cmdclearboxes2ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdclear) {
                Module1.this.cmdclearActionPerformed(evt);
            } 
            else if (evt.getSource() == cmdclearform8) {
                Module1.this.cmdclearform8ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdclearform9) {
                Module1.this.cmdclearform9ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdclearform10) {
                Module1.this.cmdclearform10ActionPerformed(evt);
            }
            else if (evt.getSource() == cmdclearform11) {
                Module1.this.cmdclearform11ActionPerformed(evt);
            }
        }

        @Override
        public void stateChanged(javax.swing.event.ChangeEvent evt) {
            if (evt.getSource() == slideraddiction) {
                Module1.this.slideraddictionStateChanged(evt);
            }           
        }
    }
    
    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
    }

    @Override
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (evt.getSource() == txtbirthdate3) {
            Module1.this.txtbirthdate3FocusLost(evt);
        }
    }
    
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == j1) {
            Module1.this.j1MouseClicked(evt);
        }
        else if (evt.getSource() == j2) {
            Module1.this.j2MouseClicked(evt);
        }
        else if (evt.getSource() == j3) {
            Module1.this.j3MouseClicked(evt);
        }
        else if (evt.getSource() == j4) {
            Module1.this.j4MouseClicked(evt);
        }
        else if (evt.getSource() == j5) {
            Module1.this.j5MouseClicked(evt);
        }
        else if (evt.getSource() == j6) {
            Module1.this.j6MouseClicked(evt);
        }
        else if (evt.getSource() == j7) {
            Module1.this.j7MouseClicked(evt);
        }
        else if (evt.getSource() == j8) {
            Module1.this.j8MouseClicked(evt);
        }
        else if (evt.getSource() == j9) {
            Module1.this.j9MouseClicked(evt);
        }
        else if (evt.getSource() == j10) {
            Module1.this.j10MouseClicked(evt);
        }
        else if (evt.getSource() == j11) {
            Module1.this.j11MouseClicked(evt);
        }
        else if (evt.getSource() == j12) {
            Module1.this.j12MouseClicked(evt);
        }
        else if (evt.getSource() == j13) {
            Module1.this.j13MouseClicked(evt);
        }
        else if (evt.getSource() == j14) {
            Module1.this.j14MouseClicked(evt);
        }
        else if (evt.getSource() == j15) {
            Module1.this.j15MouseClicked(evt);
        }
        else if (evt.getSource() == j16) {
            Module1.this.j16MouseClicked(evt);
        }
        else if (evt.getSource() == j17) {
            Module1.this.j17MouseClicked(evt);
        }
        else if (evt.getSource() == j18) {
            Module1.this.j18MouseClicked(evt);
        }
        else if (evt.getSource() == j20) {
            Module1.this.j20MouseClicked(evt);
        }
        else if (evt.getSource() == j19) {
            Module1.this.j19MouseClicked(evt);
        }
        else if (evt.getSource() == j21) {
            Module1.this.j21MouseClicked(evt);
        }
        else if (evt.getSource() == j22) {
            Module1.this.j22MouseClicked(evt);
        }
        else if (evt.getSource() == j23) {
            Module1.this.j23MouseClicked(evt);
        }
        else if (evt.getSource() == j25) {
            Module1.this.j25MouseClicked(evt);
        }
        else if (evt.getSource() == j24) {
            Module1.this.j24MouseClicked(evt);
        }
        else if (evt.getSource() == jl1) {
            Module1.this.jl1MouseClicked(evt);
        }
        else if (evt.getSource() == jl2) {
            Module1.this.jl2MouseClicked(evt);
        }
        else if (evt.getSource() == jl3) {
            Module1.this.jl3MouseClicked(evt);
        }
        else if (evt.getSource() == jl4) {
            Module1.this.jl4MouseClicked(evt);
        }
        else if (evt.getSource() == jl5) {
            Module1.this.jl5MouseClicked(evt);
        }
        else if (evt.getSource() == jl6) {
            Module1.this.jl6MouseClicked(evt);
        }
        else if (evt.getSource() == jl7) {
            Module1.this.jl7MouseClicked(evt);
        }
        else if (evt.getSource() == jl8) {
            Module1.this.jl8MouseClicked(evt);
        }
        else if (evt.getSource() == jl9) {
            Module1.this.jl9MouseClicked(evt);
        }
        else if (evt.getSource() == jl10) {
            Module1.this.jl10MouseClicked(evt);
        }
        else if (evt.getSource() == jl11) {
            Module1.this.jl11MouseClicked(evt);
        }
        else if (evt.getSource() == jl12) {
            Module1.this.jl12MouseClicked(evt);
        }
        else if (evt.getSource() == jl13) {
            Module1.this.jl13MouseClicked(evt);
        }
        else if (evt.getSource() == jl14) {
            Module1.this.jl14MouseClicked(evt);
        }
        else if (evt.getSource() == jl15) {
            Module1.this.jl15MouseClicked(evt);
        }
        else if (evt.getSource() == jl16) {
            Module1.this.jl16MouseClicked(evt);
        }
        else if (evt.getSource() == jl17) {
            Module1.this.jl17MouseClicked(evt);
        }
        else if (evt.getSource() == jl18) {
            Module1.this.jl18MouseClicked(evt);
        }
        else if (evt.getSource() == jl19) {
            Module1.this.jl19MouseClicked(evt);
        }
        else if (evt.getSource() == jl20) {
            Module1.this.jl20MouseClicked(evt);
        }
        else if (evt.getSource() == jl21) {
            Module1.this.jl21MouseClicked(evt);
        }
        else if (evt.getSource() == jl22) {
            Module1.this.jl22MouseClicked(evt);
        }
        else if (evt.getSource() == jl23) {
            Module1.this.jl23MouseClicked(evt);
        }
        else if (evt.getSource() == jl24) {
            Module1.this.jl24MouseClicked(evt);
        }
        else if (evt.getSource() == jl25) {
            Module1.this.jl25MouseClicked(evt);
        }
    }
    
    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent evt) {
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
        if (evt.getSource() == Module1.this) {
            try {
                Module1.this.formWindowOpened(evt);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Module1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void formWindowOpened(java.awt.event.WindowEvent evt) throws ClassNotFoundException {                                  
        conn = mysqlconnect.ConnectDb();
        
    }  
        
    public void txtbirthdate3FocusLost(java.awt.event.FocusEvent evt) {       
                                   
        caz = txtname2.getText();
        caz2 = txtbirthdate3.getText();
        String sql = "SELECT * FROM basic_information WHERE Participants_Name = ? AND Date_of_Birth = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname2.getText());
            pst.setString(2, txtbirthdate3.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            s = rs.getString("Participants_Name");
            sx = rs.getString("Date_of_Birth");
            }      
        }catch (SQLException ex){} 
        try {
            if ((caz.equals(s))&&(caz2.equals(sx))) { 
                 JOptionPane.showMessageDialog(null,"Name & Birth Date Found");
            }
            else {              
              JOptionPane.showMessageDialog(null,"Name & Birth Date Not Found");
            }            
        }catch (HeadlessException exc){}
    }   

    public void cmdnext1ActionPerformed(java.awt.event.ActionEvent evt) {                                 
        if (currentCard < 11) {
          currentCard += 1;
          cl.show(cardPanel, "" + (currentCard));
        }
        if (currentCard == 3) {
            String pu1 = txtname2.getText();
            txtname3.setText(pu1);
            String pu2 = txtbirthdate3.getText();
            txtbirthdate4.setText(pu2);
        }
        if(currentCard == 4) {
          String jn1 = txtbirthdate4.getText();
          txtbirthdate.setText(jn1);
          String jt = txtname3.getText();
          txtname.setText(jt);
          String fl1 = txtschool.getText();
          j26.setText(fl1);
          String grp1 = txtothergroup1.getText();
          j27.setText(grp1);
          String jy = txtothergroup2.getText();
          j28.setText(jy);
          String ju = txtothergroup3.getText();
          j29.setText(ju);
          
       if (checkfamily.isSelected()){
           String a1 = checkfamily.getText();
            j1.setText(a1);
            if(!j1.getText().isEmpty()){
              j1.setVisible(true);
            }
       }
         
        if (checkdctt.isSelected()) {
           String ga = checkdctt.getText();
            j2.setText(ga);
            if(!j2.getText().isEmpty()){
              j2.setVisible(true);
            }
        }
         
        if (checkdcp.isSelected()) {
           String sc = checkdcp.getText();
            j3.setText(sc);
            if(!j3.getText().isEmpty()){
              j3.setVisible(true);
            }
        }
        
        if (checkchurch.isSelected()) {
           String gb = checkchurch.getText();
            j4.setText(gb);
            if(!j4.getText().isEmpty()){
              j4.setVisible(true);
            }
        }
         
        if (checkworkplace.isSelected()) {
           String gd = checkworkplace.getText();
            j5.setText(gd);
            if(!j5.getText().isEmpty()){
              j5.setVisible(true);
            }
        }
         
        if (checknaa.isSelected()) {
           String ge = checknaa.getText();
           j6.setText(ge);
           if(!j6.getText().isEmpty()){
              j6.setVisible(true);
            }
        }
         
        if (checkcommunitygroup.isSelected()) {
           String zf = checkcommunitygroup.getText();
            j7.setText(zf);
            if(!j7.getText().isEmpty()){
              j7.setVisible(true);
            }
        }
         
        if (checkorganizedclub.isSelected()) {
           String go = checkorganizedclub.getText();
            j8.setText(go);
            if(!j8.getText().isEmpty()){
              j8.setVisible(true);
            }
        }
         
        if (checkparentteacher.isSelected()) {
           String zh = checkparentteacher.getText();
            j9.setText(zh);
            if(!j9.getText().isEmpty()){
              j9.setVisible(true);
            }
        }
         
        if (checksportsteams.isSelected()) {
           String zi = checksportsteams.getText();
            j10.setText(zi);
            if(!j10.getText().isEmpty()){
              j10.setVisible(true);
            }
        }
        
        if (checkschool.isSelected()) {
           String zk = checkschool.getText();
            j11.setText(zk);
            if(!j11.getText().isEmpty()){
              j11.setVisible(true);
            }
        }
         
        if (checkothergroup1.isSelected()) {
           String zl = checkothergroup1.getText();
            j12.setText(zl);
            if(!j12.getText().isEmpty()){
              j12.setVisible(true);
            }
        }
         
        if (checklocalbar.isSelected()) {
           String zq = checklocalbar.getText();
            j13.setText(zq);
            if(!j13.getText().isEmpty()){
              j13.setVisible(true);
            }
        }
        
        if (checkinformal.isSelected()) {
           String zm = checkinformal.getText();
            j14.setText(zm);
            if(!j14.getText().isEmpty()){
              j14.setVisible(true);
            }
        }
         
        if (checkneighborhood.isSelected()) {
           String zno = checkneighborhood.getText();
            j15.setText(zno);
            if(!j15.getText().isEmpty()){
              j15.setVisible(true);
            }
        }
        
        if (checkhunting.isSelected()) {
           String zo = checkhunting.getText();
            j16.setText(zo);
            if(!j16.getText().isEmpty()){
              j16.setVisible(true);
            }
        }
         
        if (checkfishing.isSelected()) {
           String zp = checkfishing.getText();
            j17.setText(zp);
            if(!j17.getText().isEmpty()){
              j17.setVisible(true);
            }
        }
         
        if (checksalon.isSelected()) {
           String zq1 = checksalon.getText();
            j18.setText(zq1);
        if(!j18.getText().isEmpty()){
              j18.setVisible(true);
            }
        }
         
        if (checklocalstore.isSelected()) {
           String zr = checklocalstore.getText();
            j19.setText(zr);
            if(!j19.getText().isEmpty()){
              j19.setVisible(true);
            }
        }
         
        if (checkmusicgroup.isSelected()) {
           String zs = checkmusicgroup.getText();
            j20.setText(zs);
            if(!j20.getText().isEmpty()){
              j20.setVisible(true);
            }
        }
        
        if (checkgym.isSelected()) {
           String  zt1 = checkgym.getText();
            j21.setText(zt1);
            if(!j21.getText().isEmpty()){
              j21.setVisible(true);
            }
        }
        
        if (checkplaysports.isSelected()) {
           String zuo = checkplaysports.getText();
            j22.setText(zuo);
            if(!j22.getText().isEmpty()){
              j22.setVisible(true);
            }
        }
        
        if (checkonlinecommunity.isSelected()) {
           String zv = checkonlinecommunity.getText();
            j23.setText(zv);
            if(!j23.getText().isEmpty()){
              j23.setVisible(true);
            }
        }
         
        if (checkothergroup2.isSelected()) {
            String zw = checkothergroup2.getText();
            j24.setText(zw);
            if(!j24.getText().isEmpty()){
              j24.setVisible(true);
            }
        }
         
        if (checkothergroup3.isSelected()) {
           String zx = checkothergroup3.getText();
            j25.setText(zx);
            if(!j25.getText().isEmpty()){
              j25.setVisible(true);
            }
        }
        if (!(checkfamily.isSelected())){
            j1.setVisible(false);
        }
        if (!(checkdctt.isSelected())){
            j2.setVisible(false);
        }
        if (!(checkdcp.isSelected())){
            j3.setVisible(false);
        }
        if (!(checkchurch.isSelected())){
            j4.setVisible(false);
        }
        if (!(checkworkplace.isSelected())){
            j5.setVisible(false);
        }
        if (!(checknaa.isSelected())){
            j6.setVisible(false);
        }
        if (!(checkcommunitygroup.isSelected())){
            j7.setVisible(false);
        }
        if (!(checkorganizedclub.isSelected())){
            j8.setVisible(false);
        }
        if (!(checkparentteacher.isSelected())){
            j9.setVisible(false);
        }
        if (!(checksportsteams.isSelected())){
            j10.setVisible(false);
        }
        if (!(checkschool.isSelected())){
            j11.setVisible(false);
        }
        if (!(checkothergroup1.isSelected())){
            j12.setVisible(false);
        }
        if (!(checklocalbar.isSelected())){
            j13.setVisible(false);
        }
        if (!(checkinformal.isSelected())){
            j14.setVisible(false);
        }
        if (!(checkneighborhood.isSelected())){
            j15.setVisible(false);
        }
        if (!(checkhunting.isSelected())){
            j16.setVisible(false);
        }
        if (!(checkfishing.isSelected())){
            j17.setVisible(false);
        }
        if (!(checksalon.isSelected())){
            j18.setVisible(false);
        }
        if (!(checklocalstore.isSelected())){
            j19.setVisible(false);
        }
        if (!(checkmusicgroup.isSelected())){
            j20.setVisible(false);
        }
        if (!(checkgym.isSelected())){
            j21.setVisible(false);
        }
        if (!(checkplaysports.isSelected())){
            j22.setVisible(false);
        }
        if (!(checkonlinecommunity.isSelected())){
            j23.setVisible(false);
        }
        if (!(checkothergroup2.isSelected())){
            j24.setVisible(false);
        }
        if (!(checkothergroup3.isSelected())){
            j25.setVisible(false);
        }
        }
        if(currentCard == 5) {
          String wn1 = txtbirthdate.getText();
          txtbirthdate2.setText(wn1);
          String jz = txtname.getText();
          txtname4.setText(jz);
          String fl19 = txtschool.getText();
          jl26.setText(fl19);
          String g9 = txtothergroup1.getText();
          jl27.setText(g9);
          String jy9 = txtothergroup2.getText();
          jl28.setText(jy9);
          String ju9 = txtothergroup3.getText();
          jl29.setText(ju9);
          
       if (checkfamily.isSelected()){
           String a19 = checkfamily.getText();
            jl1.setText(a19);
            if(!jl1.getText().isEmpty()){
              jl1.setVisible(true);
            }
       }
         
        if (checkdctt.isSelected()) {
           String ga9 = checkdctt.getText();
            jl2.setText(ga9);
            if(!jl2.getText().isEmpty()){
              jl2.setVisible(true);
            }
        }
         
        if (checkdcp.isSelected()) {
           String sc9 = checkdcp.getText();
            jl3.setText(sc9);
            if(!jl3.getText().isEmpty()){
              jl3.setVisible(true);
            }
        }
        
        if (checkchurch.isSelected()) {
           String gb9 = checkchurch.getText();
            jl4.setText(gb9);
            if(!jl4.getText().isEmpty()){
              jl4.setVisible(true);
            }
        }
         
        if (checkworkplace.isSelected()) {
           String gd9 = checkworkplace.getText();
            jl5.setText(gd9);
            if(!jl5.getText().isEmpty()){
              jl5.setVisible(true);
            }
        }
         
        if (checknaa.isSelected()) {
           String ge9 = checknaa.getText();
           jl6.setText(ge9);
           if(!jl6.getText().isEmpty()){
              jl6.setVisible(true);
            }
        }
         
        if (checkcommunitygroup.isSelected()) {
           String zf9 = checkcommunitygroup.getText();
            jl7.setText(zf9);
            if(!jl7.getText().isEmpty()){
              jl7.setVisible(true);
            }
        }
         
        if (checkorganizedclub.isSelected()) {
           String go9 = checkorganizedclub.getText();
            jl8.setText(go9);
            if(!jl8.getText().isEmpty()){
              jl8.setVisible(true);
            }
        }
         
        if (checkparentteacher.isSelected()) {
           String zh9 = checkparentteacher.getText();
            jl9.setText(zh9);
            if(!jl9.getText().isEmpty()){
              jl9.setVisible(true);
            }
        }
         
        if (checksportsteams.isSelected()) {
           String zi9 = checksportsteams.getText();
            jl10.setText(zi9);
            if(!jl10.getText().isEmpty()){
              jl10.setVisible(true);
            }
        }
        
        if (checkschool.isSelected()) {
           String zk9 = checkschool.getText();
            jl11.setText(zk9);
            if(!jl11.getText().isEmpty()){
              jl11.setVisible(true);
            }
        }
         
        if (checkothergroup1.isSelected()) {
           String zl9 = checkothergroup1.getText();
            jl12.setText(zl9);
            if(!jl12.getText().isEmpty()){
              jl12.setVisible(true);
            }
        }
         
        if (checklocalbar.isSelected()) {
           String zq9 = checklocalbar.getText();
            jl13.setText(zq9);
            if(!jl13.getText().isEmpty()){
              jl13.setVisible(true);
            }
        }
        
        if (checkinformal.isSelected()) {
           String zm9 = checkinformal.getText();
            jl14.setText(zm9);
            if(!jl14.getText().isEmpty()){
              jl14.setVisible(true);
            }
        }
         
        if (checkneighborhood.isSelected()) {
           String zno9 = checkneighborhood.getText();
            jl15.setText(zno9);
            if(!jl15.getText().isEmpty()){
              jl15.setVisible(true);
            }
        }
        
        if (checkhunting.isSelected()) {
           String zo9 = checkhunting.getText();
            jl16.setText(zo9);
            if(!jl16.getText().isEmpty()){
              jl16.setVisible(true);
            }
        }
         
        if (checkfishing.isSelected()) {
           String zp9 = checkfishing.getText();
            jl17.setText(zp9);
            if(!jl17.getText().isEmpty()){
              jl17.setVisible(true);
            }
        }
         
        if (checksalon.isSelected()) {
           String zq19 = checksalon.getText();
            jl18.setText(zq19);
        if(!jl18.getText().isEmpty()){
              jl18.setVisible(true);
            }
        }
         
        if (checklocalstore.isSelected()) {
           String zr9 = checklocalstore.getText();
            jl19.setText(zr9);
            if(!jl19.getText().isEmpty()){
              jl19.setVisible(true);
            }
        }
         
        if (checkmusicgroup.isSelected()) {
           String zs9 = checkmusicgroup.getText();
            jl20.setText(zs9);
            if(!jl20.getText().isEmpty()){
              jl20.setVisible(true);
            }
        }
        
        if (checkgym.isSelected()) {
           String  zt19 = checkgym.getText();
            jl21.setText(zt19);
            if(!jl21.getText().isEmpty()){
              jl21.setVisible(true);
            }
        }
        
        if (checkplaysports.isSelected()) {
           String zuo9 = checkplaysports.getText();
            jl22.setText(zuo9);
            if(!jl22.getText().isEmpty()){
              jl22.setVisible(true);
            }
        }
        
        if (checkonlinecommunity.isSelected()) {
           String zv9 = checkonlinecommunity.getText();
            jl23.setText(zv9);
            if(!jl23.getText().isEmpty()){
              jl23.setVisible(true);
            }
        }
         
        if (checkothergroup2.isSelected()) {
            String zw9 = checkothergroup2.getText();
            jl24.setText(zw9);
            if(!jl24.getText().isEmpty()){
              jl24.setVisible(true);
            }
        }
         
        if (checkothergroup3.isSelected()) {
           String zx9 = checkothergroup3.getText();
            jl25.setText(zx9);
            if(!jl25.getText().isEmpty()){
              jl25.setVisible(true);
            }
        }
        if (!(checkfamily.isSelected())){
            jl1.setVisible(false);
        }
        if (!(checkdctt.isSelected())){
            jl2.setVisible(false);
        }
        if (!(checkdcp.isSelected())){
            jl3.setVisible(false);
        }
        if (!(checkchurch.isSelected())){
            jl4.setVisible(false);
        }
        if (!(checkworkplace.isSelected())){
            jl5.setVisible(false);
        }
        if (!(checknaa.isSelected())){
            jl6.setVisible(false);
        }
        if (!(checkcommunitygroup.isSelected())){
            jl7.setVisible(false);
        }
        if (!(checkorganizedclub.isSelected())){
            jl8.setVisible(false);
        }
        if (!(checkparentteacher.isSelected())){
            jl9.setVisible(false);
        }
        if (!(checksportsteams.isSelected())){
            jl10.setVisible(false);
        }
        if (!(checkschool.isSelected())){
            jl11.setVisible(false);
        }
        if (!(checkothergroup1.isSelected())){
            jl12.setVisible(false);
        }
        if (!(checklocalbar.isSelected())){
            jl13.setVisible(false);
        }
        if (!(checkinformal.isSelected())){
            jl14.setVisible(false);
        }
        if (!(checkneighborhood.isSelected())){
            jl15.setVisible(false);
        }
        if (!(checkhunting.isSelected())){
            jl16.setVisible(false);
        }
        if (!(checkfishing.isSelected())){
            jl17.setVisible(false);
        }
        if (!(checksalon.isSelected())){
            jl18.setVisible(false);
        }
        if (!(checklocalstore.isSelected())){
            jl19.setVisible(false);
        }
        if (!(checkmusicgroup.isSelected())){
            jl20.setVisible(false);
        }
        if (!(checkgym.isSelected())){
            jl21.setVisible(false);
        }
        if (!(checkplaysports.isSelected())){
            jl22.setVisible(false);
        }
        if (!(checkonlinecommunity.isSelected())){
            jl23.setVisible(false);
        }
        if (!(checkothergroup2.isSelected())){
            jl24.setVisible(false);
        }
        if (!(checkothergroup3.isSelected())){
            jl25.setVisible(false);
        }
        }
        if (currentCard == 6) {
          String wn2 = txtbirthdate2.getText();
          txtbirthdate5.setText(wn2);
          String jz2 = txtname4.getText();
          txtname5.setText(jz2);
          s = txtfirstgroup2.getText();          
          w = txtsecondgroup2.getText();          
          q = txtthirdgroup2.getText();
          r = txtfourthgroup2.getText();          
          h = txtfifthgroup2.getText();
          s1 = txtfirstgroup.getText();
          w1 = txtsecondgroup.getText();
          q1 = txtthirdgroup.getText();
          r1 = txtfourthgroup.getText();
          h1 = txtfifthgroup.getText();  
          
          List<String> data1 = Arrays.asList(s1, w1, q1, r1, h1);
          List<String> data = Arrays.asList(s, w, q, r, h);
          
          List<String> data3 = new ArrayList<>();
          data3.addAll(data);
          data3.addAll(data1);
          Set<String> set = new LinkedHashSet<>(data3);
          
          String[] results = new String[set.size()];   
          set.toArray(results);          
          for (String checkResults : results){ 
            if (checkResults.isEmpty()){
            gg1.setText("");
            gg2.setText("");
            gg3.setText("");
            gg4.setText("");
            gg5.setText("");
            }
            if (results.length == 1){
            gg1.setText(results[0]);
            }
            if (results.length == 2){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            }
            if (results.length == 3){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            }
            if (results.length == 4){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[3]);
            }
            if (results.length == 5){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[3]);
            gg5.setText(results[4]);
            }
            if (results.length == 6){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[4]);
            gg5.setText(results[5]);
            }
            if (results.length == 7){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[5]);
            gg5.setText(results[6]);
            }
            if (results.length == 8){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[5]);
            gg5.setText(results[6]);
            }
            if (results.length == 9){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[5]);
            gg5.setText(results[6]);
            }
            if (results.length == 10){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[5]);
            gg5.setText(results[6]);
            }
          }
        }
        if (currentCard == 7) {
          String wn3 = txtbirthdate5.getText();
          txtbirthdate6.setText(wn3);
          String jz3 = txtname5.getText();
          txtname6.setText(jz3);
          String zp1 = gg1.getText();
          txtgroup1.setText(zp1);
        }
        if (currentCard == 8) {
          String wn4 = txtbirthdate6.getText();
          txtbirthdate7.setText(wn4);
          String jz4 = txtname6.getText();
          txtname7.setText(jz4);
          String zp2 = gg1.getText();
          txtgroup12.setText(zp2);
        }
        if (currentCard == 9) {
          String wn5 = txtbirthdate7.getText();
          txtbirthdate8.setText(wn5);
          String jz5 = txtname7.getText();
          txtname8.setText(jz5);
          String zp3 = gg1.getText();
          txtgroup14.setText(zp3);
        }
        if (currentCard == 10) {
          String wn6 = txtbirthdate8.getText();
          txtbirthdate9.setText(wn6);
          String jz6 = txtname8.getText();
          txtname9.setText(jz6);
          String zp4 = gg1.getText();
          txtgroup13.setText(zp4);
        }
        if (currentCard == 11) {
          String wn7 = txtbirthdate9.getText();
          txtbirthdate10.setText(wn7);
          String jz7 = txtname9.getText();
          txtname10.setText(jz7);
          String zp5 = gg1.getText();
          txtgroup15.setText(zp5);
        }
    } 
    
    public void cmdpreviousActionPerformed(java.awt.event.ActionEvent evt) {
        if (currentCard > 1) {
          currentCard -= 1;
          cl.show(cardPanel, "" + (currentCard));
        }
        if (currentCard == 3) {
            String du1 = txtname2.getText();
            txtname3.setText(du1);
            String du2 = txtbirthdate3.getText();
            txtbirthdate4.setText(du2);
        }
        if(currentCard == 4) {
          String jn1 = txtbirthdate4.getText();
          txtbirthdate.setText(jn1);
          String jt = txtname3.getText();
          txtname.setText(jt);
          String fl1 = txtschool.getText();
          j26.setText(fl1);
          String grp1 = txtothergroup1.getText();
          j27.setText(grp1);
          String jy = txtothergroup2.getText();
          j28.setText(jy);
          String ju = txtothergroup3.getText();
          j29.setText(ju);
       if (checkfamily.isSelected()){
           String a1 = checkfamily.getText();
            j1.setText(a1);
            if(!j1.getText().isEmpty()){
              j1.setVisible(true);
            }
       }
         
        if (checkdctt.isSelected()) {
           String ga = checkdctt.getText();
            j2.setText(ga);
            if(!j2.getText().isEmpty()){
              j2.setVisible(true);
            }
        }
         
        if (checkdcp.isSelected()) {
           String sc = checkdcp.getText();
            j3.setText(sc);
            if(!j3.getText().isEmpty()){
              j3.setVisible(true);
            }
        }
        
        if (checkchurch.isSelected()) {
           String gb = checkchurch.getText();
            j4.setText(gb);
            if(!j4.getText().isEmpty()){
              j4.setVisible(true);
            }
        }
         
        if (checkworkplace.isSelected()) {
           String gd = checkworkplace.getText();
            j5.setText(gd);
            if(!j5.getText().isEmpty()){
              j5.setVisible(true);
            }
        }
         
        if (checknaa.isSelected()) {
           String ge = checknaa.getText();
           j6.setText(ge);
           if(!j6.getText().isEmpty()){
              j6.setVisible(true);
            }
        }
         
        if (checkcommunitygroup.isSelected()) {
           String zf = checkcommunitygroup.getText();
            j7.setText(zf);
            if(!j7.getText().isEmpty()){
              j7.setVisible(true);
            }
        }
         
        if (checkorganizedclub.isSelected()) {
           String go = checkorganizedclub.getText();
            j8.setText(go);
            if(!j8.getText().isEmpty()){
              j8.setVisible(true);
            }
        }
         
        if (checkparentteacher.isSelected()) {
           String zh = checkparentteacher.getText();
            j9.setText(zh);
            if(!j9.getText().isEmpty()){
              j9.setVisible(true);
            }
        }
         
        if (checksportsteams.isSelected()) {
           String zi = checksportsteams.getText();
            j10.setText(zi);
            if(!j10.getText().isEmpty()){
              j10.setVisible(true);
            }
        }
        
        if (checkschool.isSelected()) {
           String zk = checkschool.getText();
            j11.setText(zk);
            if(!j11.getText().isEmpty()){
              j11.setVisible(true);
            }
        }
         
        if (checkothergroup1.isSelected()) {
           String zl = checkothergroup1.getText();
            j12.setText(zl);
            if(!j12.getText().isEmpty()){
              j12.setVisible(true);
            }
        }
         
        if (checklocalbar.isSelected()) {
           String zq = checklocalbar.getText();
            j13.setText(zq);
            if(!j13.getText().isEmpty()){
              j13.setVisible(true);
            }
        }
        
        if (checkinformal.isSelected()) {
           String zm = checkinformal.getText();
            j14.setText(zm);
            if(!j14.getText().isEmpty()){
              j14.setVisible(true);
            }
        }
         
        if (checkneighborhood.isSelected()) {
           String zno = checkneighborhood.getText();
            j15.setText(zno);
            if(!j15.getText().isEmpty()){
              j15.setVisible(true);
            }
        }
        
        if (checkhunting.isSelected()) {
           String zo = checkhunting.getText();
            j16.setText(zo);
            if(!j16.getText().isEmpty()){
              j16.setVisible(true);
            }
        }
         
        if (checkfishing.isSelected()) {
           String zp = checkfishing.getText();
            j17.setText(zp);
            if(!j17.getText().isEmpty()){
              j17.setVisible(true);
            }
        }
         
        if (checksalon.isSelected()) {
           String zq1 = checksalon.getText();
            j18.setText(zq1);
        if(!j18.getText().isEmpty()){
              j18.setVisible(true);
            }
        }
         
        if (checklocalstore.isSelected()) {
           String zr = checklocalstore.getText();
            j19.setText(zr);
            if(!j19.getText().isEmpty()){
              j19.setVisible(true);
            }
        }
         
        if (checkmusicgroup.isSelected()) {
           String zs = checkmusicgroup.getText();
            j20.setText(zs);
            if(!j20.getText().isEmpty()){
              j20.setVisible(true);
            }
        }
        
        if (checkgym.isSelected()) {
           String  zt1 = checkgym.getText();
            j21.setText(zt1);
            if(!j21.getText().isEmpty()){
              j21.setVisible(true);
            }
        }
        
        if (checkplaysports.isSelected()) {
           String zuo = checkplaysports.getText();
            j22.setText(zuo);
            if(!j22.getText().isEmpty()){
              j22.setVisible(true);
            }
        }
        
        if (checkonlinecommunity.isSelected()) {
           String zv = checkonlinecommunity.getText();
            j23.setText(zv);
            if(!j23.getText().isEmpty()){
              j23.setVisible(true);
            }
        }
         
        if (checkothergroup2.isSelected()) {
            String zw = checkothergroup2.getText();
            j24.setText(zw);
            if(!j24.getText().isEmpty()){
              j24.setVisible(true);
            }
        }
         
        if (checkothergroup3.isSelected()) {
           String zx = checkothergroup3.getText();
            j25.setText(zx);
            if(!j25.getText().isEmpty()){
              j25.setVisible(true);
            }
        }
        }
        if(currentCard == 5) {       
          String wn1 = txtbirthdate.getText();
          txtbirthdate2.setText(wn1);
          String jz = txtname.getText();
          txtname4.setText(jz);
          String fl19 = txtschool.getText();
          jl26.setText(fl19);
          String g9 = txtothergroup1.getText();
          jl27.setText(g9);
          String jy9 = txtothergroup2.getText();
          jl28.setText(jy9);
          String ju9 = txtothergroup3.getText();
          jl29.setText(ju9);
          
       if (checkfamily.isSelected()){
           String a19 = checkfamily.getText();
            jl1.setText(a19);
            if(!jl1.getText().isEmpty()){
              jl1.setVisible(true);
            }
       }
         
        if (checkdctt.isSelected()) {
           String ga9 = checkdctt.getText();
            jl2.setText(ga9);
            if(!jl2.getText().isEmpty()){
              jl2.setVisible(true);
            }
        }
         
        if (checkdcp.isSelected()) {
           String sc9 = checkdcp.getText();
            jl3.setText(sc9);
            if(!jl3.getText().isEmpty()){
              jl3.setVisible(true);
            }
        }
        
        if (checkchurch.isSelected()) {
           String gb9 = checkchurch.getText();
            jl4.setText(gb9);
            if(!jl4.getText().isEmpty()){
              jl4.setVisible(true);
            }
        }
         
        if (checkworkplace.isSelected()) {
           String gd9 = checkworkplace.getText();
            jl5.setText(gd9);
            if(!jl5.getText().isEmpty()){
              jl5.setVisible(true);
            }
        }
         
        if (checknaa.isSelected()) {
           String ge9 = checknaa.getText();
           jl6.setText(ge9);
           if(!jl6.getText().isEmpty()){
              jl6.setVisible(true);
            }
        }
         
        if (checkcommunitygroup.isSelected()) {
           String zf9 = checkcommunitygroup.getText();
            jl7.setText(zf9);
            if(!jl7.getText().isEmpty()){
              jl7.setVisible(true);
            }
        }
         
        if (checkorganizedclub.isSelected()) {
           String go9 = checkorganizedclub.getText();
            jl8.setText(go9);
            if(!jl8.getText().isEmpty()){
              jl8.setVisible(true);
            }
        }
         
        if (checkparentteacher.isSelected()) {
           String zh9 = checkparentteacher.getText();
            jl9.setText(zh9);
            if(!jl9.getText().isEmpty()){
              jl9.setVisible(true);
            }
        }
         
        if (checksportsteams.isSelected()) {
           String zi9 = checksportsteams.getText();
            jl10.setText(zi9);
            if(!jl10.getText().isEmpty()){
              jl10.setVisible(true);
            }
        }
        
        if (checkschool.isSelected()) {
           String zk9 = checkschool.getText();
            jl11.setText(zk9);
            if(!jl11.getText().isEmpty()){
              jl11.setVisible(true);
            }
        }
         
        if (checkothergroup1.isSelected()) {
           String zl9 = checkothergroup1.getText();
            jl12.setText(zl9);
            if(!jl12.getText().isEmpty()){
              jl12.setVisible(true);
            }
        }
         
        if (checklocalbar.isSelected()) {
           String zq9 = checklocalbar.getText();
            jl13.setText(zq9);
            if(!jl13.getText().isEmpty()){
              jl13.setVisible(true);
            }
        }
        
        if (checkinformal.isSelected()) {
           String zm9 = checkinformal.getText();
            jl14.setText(zm9);
            if(!jl14.getText().isEmpty()){
              jl14.setVisible(true);
            }
        }
         
        if (checkneighborhood.isSelected()) {
           String zno9 = checkneighborhood.getText();
            jl15.setText(zno9);
            if(!jl15.getText().isEmpty()){
              jl15.setVisible(true);
            }
        }
        
        if (checkhunting.isSelected()) {
           String zo9 = checkhunting.getText();
            jl16.setText(zo9);
            if(!jl16.getText().isEmpty()){
              jl16.setVisible(true);
            }
        }
         
        if (checkfishing.isSelected()) {
           String zp9 = checkfishing.getText();
            jl17.setText(zp9);
            if(!jl17.getText().isEmpty()){
              jl17.setVisible(true);
            }
        }
         
        if (checksalon.isSelected()) {
           String zq19 = checksalon.getText();
            jl18.setText(zq19);
        if(!jl18.getText().isEmpty()){
              jl18.setVisible(true);
            }
        }
         
        if (checklocalstore.isSelected()) {
           String zr9 = checklocalstore.getText();
            jl19.setText(zr9);
            if(!jl19.getText().isEmpty()){
              jl19.setVisible(true);
            }
        }
         
        if (checkmusicgroup.isSelected()) {
           String zs9 = checkmusicgroup.getText();
            jl20.setText(zs9);
            if(!jl20.getText().isEmpty()){
              jl20.setVisible(true);
            }
        }
        
        if (checkgym.isSelected()) {
           String  zt19 = checkgym.getText();
            jl21.setText(zt19);
            if(!jl21.getText().isEmpty()){
              jl21.setVisible(true);
            }
        }
        
        if (checkplaysports.isSelected()) {
           String zuo9 = checkplaysports.getText();
            jl22.setText(zuo9);
            if(!jl22.getText().isEmpty()){
              jl22.setVisible(true);
            }
        }
        
        if (checkonlinecommunity.isSelected()) {
           String zv9 = checkonlinecommunity.getText();
            jl23.setText(zv9);
            if(!jl23.getText().isEmpty()){
              jl23.setVisible(true);
            }
        }
         
        if (checkothergroup2.isSelected()) {
            String zw9 = checkothergroup2.getText();
            jl24.setText(zw9);
            if(!jl24.getText().isEmpty()){
              jl24.setVisible(true);
            }
        }
         
        if (checkothergroup3.isSelected()) {
           String zx9 = checkothergroup3.getText();
            jl25.setText(zx9);
            if(!jl25.getText().isEmpty()){
              jl25.setVisible(true);
            }
        }
        if (!(checkfamily.isSelected())){
            jl1.setVisible(false);
        }
        if (!(checkdctt.isSelected())){
            jl2.setVisible(false);
        }
        if (!(checkdcp.isSelected())){
            jl3.setVisible(false);
        }
        if (!(checkchurch.isSelected())){
            jl4.setVisible(false);
        }
        if (!(checkworkplace.isSelected())){
            jl5.setVisible(false);
        }
        if (!(checknaa.isSelected())){
            jl6.setVisible(false);
        }
        if (!(checkcommunitygroup.isSelected())){
            jl7.setVisible(false);
        }
        if (!(checkorganizedclub.isSelected())){
            jl8.setVisible(false);
        }
        if (!(checkparentteacher.isSelected())){
            jl9.setVisible(false);
        }
        if (!(checksportsteams.isSelected())){
            jl10.setVisible(false);
        }
        if (!(checkschool.isSelected())){
            jl11.setVisible(false);
        }
        if (!(checkothergroup1.isSelected())){
            jl12.setVisible(false);
        }
        if (!(checklocalbar.isSelected())){
            jl13.setVisible(false);
        }
        if (!(checkinformal.isSelected())){
            jl14.setVisible(false);
        }
        if (!(checkneighborhood.isSelected())){
            jl15.setVisible(false);
        }
        if (!(checkhunting.isSelected())){
            jl16.setVisible(false);
        }
        if (!(checkfishing.isSelected())){
            jl17.setVisible(false);
        }
        if (!(checksalon.isSelected())){
            jl18.setVisible(false);
        }
        if (!(checklocalstore.isSelected())){
            jl19.setVisible(false);
        }
        if (!(checkmusicgroup.isSelected())){
            jl20.setVisible(false);
        }
        if (!(checkgym.isSelected())){
            jl21.setVisible(false);
        }
        if (!(checkplaysports.isSelected())){
            jl22.setVisible(false);
        }
        if (!(checkonlinecommunity.isSelected())){
            jl23.setVisible(false);
        }
        if (!(checkothergroup2.isSelected())){
            jl24.setVisible(false);
        }
        if (!(checkothergroup3.isSelected())){
            jl25.setVisible(false);
        }
        }
        if (currentCard == 6) {
          String wn2 = txtbirthdate2.getText();
          txtbirthdate5.setText(wn2);
          String jz2 = txtname4.getText();
          txtname5.setText(jz2);
          s = txtfirstgroup2.getText();          
          w = txtsecondgroup2.getText();          
          q = txtthirdgroup2.getText();
          r = txtfourthgroup2.getText();          
          h = txtfifthgroup2.getText();
          s1 = txtfirstgroup.getText();
          w1 = txtsecondgroup.getText();
          q1 = txtthirdgroup.getText();
          r1 = txtfourthgroup.getText();
          h1 = txtfifthgroup.getText();                        
          
          List<String> data1 = Arrays.asList(s1, w1, q1, r1, h1);
          List<String> data = Arrays.asList(s, w, q, r, h);
          List<String> data3 = new ArrayList<>();
          data3.addAll(data);
          data3.addAll(data1);
          Set<String> set = new LinkedHashSet<>(data3);
          
          String[] results = new String[set.size()];   
          set.toArray(results);
          for (String checkResults : results){ 
            if (results.length == 1){
            gg1.setText(results[0]);
            }
            if (results.length == 2){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            }
            if (results.length == 3){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            }
            if (results.length == 4){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[3]);
            }
            if (results.length == 5){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[3]);
            gg5.setText(results[4]);
            }
            if (results.length == 6){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[4]);
            gg5.setText(results[5]);
            }
            if (results.length == 7){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[5]);
            gg5.setText(results[6]);
            }
            if (results.length == 8){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[5]);
            gg5.setText(results[6]);
            }
            if (results.length == 9){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[5]);
            gg5.setText(results[6]);
            }
            if (results.length == 10){
            gg1.setText(results[0]);
            gg2.setText(results[1]);
            gg3.setText(results[2]);
            gg4.setText(results[5]);
            gg5.setText(results[6]);
            }
          }
        }
        if (currentCard == 7) {
          String wn3 = txtbirthdate5.getText();
          txtbirthdate6.setText(wn3);
          String jz3 = txtname5.getText();
          txtname6.setText(jz3);
          String zp1 = gg1.getText();
          txtgroup1.setText(zp1);
        }
        if (currentCard == 8) {
          String wn4 = txtbirthdate6.getText();
          txtbirthdate7.setText(wn4);
          String jz4 = txtname6.getText();
          txtname7.setText(jz4);
          String zp2 = gg1.getText();
          txtgroup12.setText(zp2);
        }
        if (currentCard == 9) {
          String wn5 = txtbirthdate7.getText();
          txtbirthdate8.setText(wn5);
          String jz5 = txtname7.getText();
          txtname8.setText(jz5);
          String zp3 = gg1.getText();
          txtgroup14.setText(zp3);
        }
        if (currentCard == 10) {
          String wn6 = txtbirthdate8.getText();
          txtbirthdate9.setText(wn6);
          String jz6 = txtname8.getText();
          txtname9.setText(jz6);
          String zp4 = gg1.getText();
          txtgroup13.setText(zp4);
        }
        if (currentCard == 11) {
          String wn7 = txtbirthdate9.getText();
          txtbirthdate10.setText(wn7);
          String jz7 = txtname9.getText();
          txtname10.setText(jz7);
          String zp5 = gg1.getText();
          txtgroup15.setText(zp5);
        }
    }

    public void cmdsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String Name7 = (String) boxaddiction.getSelectedItem();
        String Name8 = (String) boxrelationship.getSelectedItem();
        String Name9 = (String) boxfulltimejobs.getSelectedItem();
        String Name10 = (String) boxjobsituation.getSelectedItem();
        String Name11 = (String) boxlivingarrangements.getSelectedItem();
        String Name12 = (String) boxhealthinsurance.getSelectedItem();
        String sql = "insert into research_demographic (Name, Birth_Date, Six_Month_Plans, Five_Year_Plans, How_Into_Drugs, Why_do_Drugs, Addicted, How_Addicted, Likes_N_Hobbies, Wishful_Activities, Relationship_Situation, Other_Relationship, Jobs_Past_5years, Job_Situation_Pastyear, Other_Job_Situation, Work_Type_Lastwk, Skills_Expertise, Live_Last_Month, Other_living, Health_Insurance, Insurance_Type) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname2.getText());
            pst.setString(2, txtbirthdate3.getText());
            pst.setString(3, txtsixmonthplans.getText());
            pst.setString(4, txtfiveyearplans.getText());
            pst.setString(5, txtintodrugs.getText());
            pst.setString(6, txtwhyusedrugs.getText());
            pst.setString(7, Name7);
            pst.setInt(8, slideraddiction.getValue());
            pst.setString(9, txtfunactivities.getText());
            pst.setString(10, txtwishfulfun.getText());
            pst.setString(11, Name8);
            pst.setString(12, txtotherrelationship.getText());
            pst.setString(13, Name9);
            pst.setString(14, Name10);
            pst.setString(15, txtotherjobsituation.getText());
            pst.setString(16, txtlastweekjob.getText());
            pst.setString(17, txtskills.getText());
            pst.setString(18, Name11);
            pst.setString(19, txtotherlivingarrangements.getText());
            pst.setString(20, Name12);
            pst.setString(21, txthealthinsurance.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit2ActionPerformed(java.awt.event.ActionEvent evt) {                                
           
        Formal = "";
        if (checkfamily.isSelected()) {
            Formal = Formal + " " + checkfamily.getText();
        }
        if (checkdctt.isSelected()) {
            Formal = Formal + " " + checkdctt.getText();
        }
        if (checkdcp.isSelected()) {
            Formal = Formal + " " + checkdcp.getText();
        }
        if (checkchurch.isSelected()) {
            Formal = Formal + " " + checkchurch.getText();
        }
        if (checkworkplace.isSelected()) {
            Formal = Formal + " " + checkworkplace.getText();
        }
        if (checknaa.isSelected()) {
            Formal = Formal + " " + checknaa.getText();
        }
        if (checkcommunitygroup.isSelected()) {
            Formal = Formal + " " + checkcommunitygroup.getText();
        }
        if (checkorganizedclub.isSelected()) {
            Formal = Formal + " " + checkorganizedclub.getText();
        }
        if (checkparentteacher.isSelected()) {
            Formal = Formal + " " + checkparentteacher.getText();
        }
        if (checksportsteams.isSelected()) {
            Formal = Formal + " " + checksportsteams.getText();
        }
        if (checkschool.isSelected()) {
            Formal = Formal + " " + checkschool.getText();
        }
        if (checkothergroup1.isSelected()) {
            Formal = Formal + " " + checkothergroup1.getText();
        }
        Informal = "";
        if (checklocalbar.isSelected()) {
            Informal = Informal + " " + checklocalbar.getText();
        }
        if (checkinformal.isSelected()) {
            Informal = Informal + " " + checkinformal.getText();
        }
        if (checkneighborhood.isSelected()) {
            Informal = Informal + " " + checkneighborhood.getText();
        }
        if (checkhunting.isSelected()) {
            Informal = Informal + " " + checkhunting.getText();
        }
        if (checkfishing.isSelected()) {
            Informal = Informal + " " + checkfishing.getText();
        }
        if (checksalon.isSelected()) {
            Informal = Informal + " " + checksalon.getText();
        }
        if (checklocalstore.isSelected()) {
            Informal = Informal + " " + checklocalstore.getText();
        }
        if (checkmusicgroup.isSelected()) {
            Informal = Informal + " " + checkmusicgroup.getText();
        }
        if (checkgym.isSelected()) {
            Informal = Informal + " " + checkgym.getText();
        }
        if (checkplaysports.isSelected()) {
            Informal = Informal + " " + checkplaysports.getText();
        }
        if (checkonlinecommunity.isSelected()) {
            Informal = Informal + " " + checkonlinecommunity.getText();
        }
        if (checkothergroup2.isSelected()) {
            Informal = Informal + " " + checkothergroup2.getText();
        }
        if (checkothergroup3.isSelected()) {
            Informal = Informal + " " + checkothergroup3.getText();
        }
        
        String sql = "insert into network_structure_analysis (Name, Birth_Date, Formal_Groups, School, Other_Formal, Informal_Groups, Other_Informal, Other_Informal2) values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname3.getText());
            pst.setString(2, txtbirthdate4.getText());
            pst.setString(3, Formal);
            pst.setString(4, txtschool.getText());
            pst.setString(5, txtothergroup1.getText());
            pst.setString(6, Informal);
            pst.setString(7, txtothergroup2.getText());
            pst.setString(8, txtothergroup3.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }                          
    }
    
    public void cmdsubmit3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        String sql = "insert into groups_that_help (Name, Birth_Date, First_Group, Second_Group, Third_Group, Fourth_Group, Fifth_Group) values(?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname.getText());
            pst.setString(2, txtbirthdate.getText());
            pst.setString(3, txtfirstgroup.getText());
            pst.setString(4, txtsecondgroup.getText());
            pst.setString(5, txtthirdgroup.getText());
            pst.setString(6, txtfourthgroup.getText());
            pst.setString(7, txtfifthgroup.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
        
    public void cmdsubmit4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into groups_to_hangout (Name, Birth_Date, First_Group, Second_Group, Third_Group, Fourth_Group, Fifth_Group) values(?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname4.getText());
            pst.setString(2, txtbirthdate2.getText());
            pst.setString(3, txtfirstgroup2.getText());
            pst.setString(4, txtsecondgroup2.getText());
            pst.setString(5, txtthirdgroup2.getText());
            pst.setString(6, txtfourthgroup2.getText());
            pst.setString(7, txtfifthgroup2.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    } 
    
    public void cmdsubmit5ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String sql = "insert into sociogram (Name, Birth_Date, First_Group, Second_Group, Third_Group, Fourth_Group, Fifth_Group) values(?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname5.getText());
            pst.setString(2, txtbirthdate5.getText());
            pst.setString(3, gg1.getText());
            pst.setString(4, gg2.getText());
            pst.setString(5, gg3.getText());
            pst.setString(6, gg4.getText());
            pst.setString(7, gg5.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String Name1 = (String) boxhangoutoften.getSelectedItem();
        String Name2 = (String) boxknowothers.getSelectedItem();
        String Name3 = (String) boxconnectothers.getSelectedItem();
        String sql = "insert into social_network1 (Name, Birth_Date, Main_Group, People_in_Network, Know_in_Network, Closely_Know, Hang_With_Regulary, Hang_with_Amount, Know_Outside_Groups, Connect_outdside_Group, Other_Conn, Closeness, Personal_closeness, Group_Jealousy) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname6.getText());
            pst.setString(2, txtbirthdate6.getText());
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
    
    public void cmdsubmit7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into emotional_resources1 (Name, Birth_Date, Main_Group, Discussing_Problems, Honesty_in_Group, Criticism_in_Group, Emotional_GroupMmber, Trust_GroupMmber, Accept_Faults) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname7.getText());
            pst.setString(2, txtbirthdate7.getText());
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
    
    public void cmdsubmit8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into financial_resources1 (Name, Birth_Date, Main_Group, Lend_Money, Lend_Car, Live_With, Legal_Advice_LoCost, Help_Pay_Bills, Help_Child_Care) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname8.getText());
            pst.setString(2, txtbirthdate8.getText());
            pst.setString(3, txtgroup14.getText());
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
    
    public void cmdsubmit9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into group_drug_habits1 (Name, Birth_Date, Main_Group, Arrives_Drunk_High, Drug_Dealers_OutsideGr, Recr_Drug_Use, Party_Exces_Drink, Unwind_With_Drug, DUI_InGroup) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname9.getText());
            pst.setString(2, txtbirthdate9.getText());
            pst.setString(3, txtgroup13.getText());
            pst.setInt(4, qe1.getValue());
            pst.setInt(5, qe2.getValue());
            pst.setInt(6, qe3.getValue());
            pst.setInt(7, qe4.getValue());
            pst.setInt(8, qe5.getValue());
            pst.setInt(9, qe6.getValue());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cmdsubmit10ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String sql = "insert into cultural_resources1 (Name, Birth_Date, Main_Group, Discuss_hobbies, Volunteer_Work, Cultural_Events, Important_Connts, College_Educated, Library_Use) values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname10.getText());
            pst.setString(2, txtbirthdate10.getText());
            pst.setString(3, txtgroup15.getText());
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
    
    public void cmdclearformActionPerformed(java.awt.event.ActionEvent evt) {                                             
        slideraddiction.setValue(0);
        txtbirthdate3.setText("");
        txtfiveyearplans.setText("");
        txtfunactivities.setText("");
        txtintodrugs.setText("");
        txtname2.setText("");
        txtsixmonthplans.setText("");
        txtwhyusedrugs.setText("");
        txtwishfulfun.setText("");
    }  
    
    public void cmdclearform1ActionPerformed(java.awt.event.ActionEvent evt) {
        txthealthinsurance.setText("");
        txtlastweekjob.setText("");
        txtotherjobsituation.setText("");
        txtotherlivingarrangements.setText("");
        txtotherrelationship.setText("");
        txtskills.setText("");
    }
    
    private void cmdclearform3ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        txtothergroup1.setText("");
        txtothergroup2.setText("");
        txtothergroup3.setText("");
        txtschool.setText("");
        checkchurch.setSelected(false);
        checkcommunitygroup.setSelected(false);
        checkdcp.setSelected(false);
        checkdctt.setSelected(false);
        checkfamily.setSelected(false);
        checkfishing.setSelected(false);
        checkgym.setSelected(false);
        checkhunting.setSelected(false);
        checkinformal.setSelected(false);
        checklocalbar.setSelected(false);
        checklocalstore.setSelected(false);
        checkmusicgroup.setSelected(false);
        checknaa.setSelected(false);
        checkneighborhood.setSelected(false);
        checkonlinecommunity.setSelected(false);
        checkorganizedclub.setSelected(false);
        checkothergroup1.setSelected(false);
        checkothergroup2.setSelected(false);
        checkothergroup3.setSelected(false);
        checkparentteacher.setSelected(false);
        checkplaysports.setSelected(false);
        checksalon.setSelected(false);
        checkschool.setSelected(false);
        checksportsteams.setSelected(false);
        checkworkplace.setSelected(false);
    } 
    
    public void cmdclearboxesActionPerformed(java.awt.event.ActionEvent evt) {                                              
        txtfirstgroup.setText("");
        txtsecondgroup.setText("");
        txtthirdgroup.setText("");
        txtfourthgroup.setText("");
        txtfifthgroup.setText("");
        j1.setSelected(false);
        j2.setSelected(false);
        j3.setSelected(false);
        j4.setSelected(false);
        j5.setSelected(false);
        j6.setSelected(false);
        j7.setSelected(false);
        j8.setSelected(false);
        j9.setSelected(false);
        j10.setSelected(false);
        j11.setSelected(false);
        j12.setSelected(false);
        j13.setSelected(false);
        j14.setSelected(false);
        j15.setSelected(false);
        j16.setSelected(false);
        j17.setSelected(false);
        j18.setSelected(false);
        j19.setSelected(false);
        j20.setSelected(false);
        j21.setSelected(false);
        j22.setSelected(false);
        j23.setSelected(false);
        j24.setSelected(false);
        j25.setSelected(false);
    }
    
    public void cmdclearboxes2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        txtfirstgroup2.setText("");
        txtsecondgroup2.setText("");
        txtthirdgroup2.setText("");
        txtfourthgroup2.setText("");
        txtfifthgroup2.setText("");
        jl1.setSelected(false);
        jl2.setSelected(false);
        jl3.setSelected(false);
        jl4.setSelected(false);
        jl5.setSelected(false);
        jl6.setSelected(false);
        jl7.setSelected(false);
        jl8.setSelected(false);
        jl9.setSelected(false);
        jl10.setSelected(false);
        jl11.setSelected(false);
        jl12.setSelected(false);
        jl13.setSelected(false);
        jl14.setSelected(false);
        jl15.setSelected(false);
        jl16.setSelected(false);
        jl17.setSelected(false);
        jl18.setSelected(false);
        jl19.setSelected(false);
        jl20.setSelected(false);
        jl21.setSelected(false);
        jl22.setSelected(false);
        jl23.setSelected(false);
        jl24.setSelected(false);
        jl25.setSelected(false);
    } 
    
    public void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtconnectothers.setText("");
        txtinnetwork.setText("");
        txtknownetwork.setText("");
        txtregularlyhangout.setText("");
        txttrustclosely.setText("");
        sliderclosiness.setValue(0);
        sliderpersonalclosiness.setValue(0);
        slidergroupreact.setValue(0);
    }
    
    public void cmdclearform8ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        slider1.setValue(0);
        slider2.setValue(0);
        slider3.setValue(0);
        slider4.setValue(0);
        slider5.setValue(0);
        slider6.setValue(0);
    }
    
    public void cmdclearform9ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        js1.setValue(0);
        js2.setValue(0);
        js3.setValue(0);
        js4.setValue(0);
        js5.setValue(0);
        js6.setValue(0);
    } 
    
    public void cmdclearform10ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        qe1.setValue(0);
        qe2.setValue(0);
        qe3.setValue(0);
        qe4.setValue(0);
        qe5.setValue(0);
        qe6.setValue(0);
    } 
    
    public void cmdclearform11ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ccslider1.setValue(0);
        ccslider2.setValue(0);
        ccslider3.setValue(0);
        ccslider4.setValue(0);
        ccslider5.setValue(0);
        ccslider6.setValue(0);
    } 
    
    public void slideraddictionStateChanged(javax.swing.event.ChangeEvent evt) {                                             
        int value = slideraddiction.getValue();
        r43.setText("Addiction Level (out of 10):  " + value);
    } 
    
    public void j1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j1.isSelected()){
        ab = j1.getText();
        bb = j1.getText();
        cb = j1.getText();
        db = j1.getText();
        eb = j1.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j2.isSelected()){
        ab = j2.getText();
        bb = j2.getText();
        cb = j2.getText();
        db = j2.getText();
        eb = j2.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j3.isSelected()){
        ab = j3.getText();
        bb = j3.getText();
        cb = j3.getText();
        db = j3.getText();
        eb = j3.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j4.isSelected()){
        ab = j4.getText();
        bb = j4.getText();
        cb = j4.getText();
        db = j4.getText();
        eb = j4.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j5MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j5.isSelected()){
        ab = j5.getText();
        bb = j5.getText();
        cb = j5.getText();
        db = j5.getText();
        eb = j5.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j6MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j6.isSelected()){
        ab = j6.getText();
        bb = j6.getText();
        cb = j6.getText();
        db = j6.getText();
        eb = j6.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j7MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j7.isSelected()){
        ab = j7.getText();
        bb = j7.getText();
        cb = j7.getText();
        db = j7.getText();
        eb = j7.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j8MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j8.isSelected()){
        ab = j8.getText();
        bb = j8.getText();
        cb = j8.getText();
        db = j8.getText();
        eb = j8.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j9MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (j9.isSelected()){
        ab = j9.getText();
        bb = j9.getText();
        cb = j9.getText();
        db = j9.getText();
        eb = j9.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                               

    public void j10MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j10.isSelected()){
        ab = j10.getText();
        bb = j10.getText();
        cb = j10.getText();
        db = j10.getText();
        eb = j10.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j11MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j11.isSelected()){
        ab = j11.getText()+ " " +j26.getText();
        bb = j11.getText()+ " " +j26.getText();
        cb = j11.getText()+ " " +j26.getText();
        db = j11.getText()+ " " +j26.getText();
        eb = j11.getText()+ " " +j26.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j12MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j12.isSelected()){
        ab = j12.getText()+ " " +j27.getText();
        bb = j12.getText()+ " " +j27.getText();
        cb = j12.getText()+ " " +j27.getText();
        db = j12.getText()+ " " +j27.getText();
        eb = j12.getText()+ " " +j27.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j13MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j13.isSelected()){
        ab = j13.getText();
        bb = j13.getText();
        cb = j13.getText();
        db = j13.getText();
        eb = j13.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j14MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j14.isSelected()){
        ab = j14.getText();
        bb = j14.getText();
        cb = j14.getText();
        db = j14.getText();
        eb = j14.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j15MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j15.isSelected()){
        ab = j15.getText();
        bb = j15.getText();
        cb = j15.getText();
        db = j15.getText();
        eb = j15.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j16MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j16.isSelected()){
        ab = j16.getText();
        bb = j16.getText();
        cb = j16.getText();
        db = j16.getText();
        eb = j16.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j17MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j17.isSelected()){
        ab = j17.getText();
        bb = j17.getText();
        cb = j17.getText();
        db = j17.getText();
        eb = j17.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j18MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j18.isSelected()){
        ab = j18.getText();
        bb = j18.getText();
        cb = j18.getText();
        db = j18.getText();
        eb = j18.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j19MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j19.isSelected()){
        ab = j19.getText();
        bb = j19.getText();
        cb = j19.getText();
        db = j19.getText();
        eb = j19.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j20MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j20.isSelected()){
        ab = j20.getText();
        bb = j20.getText();
        cb = j20.getText();
        db = j20.getText();
        eb = j20.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j21MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j21.isSelected()){
        ab = j21.getText();
        bb = j21.getText();
        cb = j21.getText();
        db = j21.getText();
        eb = j21.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j22MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j22.isSelected()){
        ab = j22.getText();
        bb = j22.getText();
        cb = j22.getText();
        db = j22.getText();
        eb = j22.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j23MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j23.isSelected()){
        ab = j23.getText();
        bb = j23.getText();
        cb = j23.getText();
        db = j23.getText();
        eb = j23.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j24MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j24.isSelected()){
        ab = j24.getText()+ " " +j28.getText();
        bb = j24.getText()+ " " +j28.getText();
        cb = j24.getText()+ " " +j28.getText();
        db = j24.getText()+ " " +j28.getText();
        eb = j24.getText()+ " " +j28.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(ab)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                                

    public void j25MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (j25.isSelected()){
        ab = j25.getText()+ " " +j29.getText();
        bb = j25.getText()+ " " +j29.getText();
        cb = j25.getText()+ " " +j29.getText();
        db = j25.getText()+ " " +j29.getText();
        eb = j25.getText()+ " " +j29.getText();}
        String name1 = txtfirstgroup.getText();
        String name2 = txtsecondgroup.getText();
        String name3 = txtthirdgroup.getText();
        String name4 = txtfourthgroup.getText();
        String name5 = txtfifthgroup.getText();
        if (name1.isEmpty()){
            txtfirstgroup.setText(ab);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup.setText(bb);
        } else if (name3.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)){
            txtthirdgroup.setText(cb);
        } else if (name4.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)){
            txtfourthgroup.setText(db);
        } else if (name5.isEmpty()&&!name1.equals(ab)&&!name2.equals(bb)&&!name3.equals(cb)&&!name4.equals(db)){
            txtfifthgroup.setText(eb);
        }
    }                   

    public void jl1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl1.isSelected()){
        a = jl1.getText();
        b = jl1.getText();
        c = jl1.getText();
        d = jl1.getText();
        e = jl1.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl2.isSelected()){
        a = jl2.getText();
        b = jl2.getText();
        c = jl2.getText();
        d = jl2.getText();
        e = jl2.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl3.isSelected()){
        a = jl3.getText();
        b = jl3.getText();
        c = jl3.getText();
        d = jl3.getText();
        e = jl3.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl4.isSelected()){
        a = jl4.getText();
        b = jl4.getText();
        c = jl4.getText();
        d = jl4.getText();
        e = jl4.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl5MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl5.isSelected()){
        a = jl5.getText();
        b = jl5.getText();
        c = jl5.getText();
        d = jl5.getText();
        e = jl5.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl6MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl6.isSelected()){
        a = jl6.getText();
        b = jl6.getText();
        c = jl6.getText();
        d = jl6.getText();
        e = jl6.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl7MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl7.isSelected()){
        a = jl7.getText();
        b = jl7.getText();
        c = jl7.getText();
        d = jl7.getText();
        e = jl7.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl8MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl8.isSelected()){
        a = jl8.getText();
        b = jl8.getText();
        c = jl8.getText();
        d = jl8.getText();
        e = jl8.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl9MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (jl9.isSelected()){
        a = jl9.getText();
        b = jl9.getText();
        c = jl9.getText();
        d = jl9.getText();
        e = jl9.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                               

    public void jl10MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl10.isSelected()){
        a = jl10.getText();
        b = jl10.getText();
        c = jl10.getText();
        d = jl10.getText();
        e = jl10.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl11MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl11.isSelected()){
        a = jl11.getText()+ " " +jl26.getText();
        b = jl11.getText()+ " " +jl26.getText();
        c = jl11.getText()+ " " +jl26.getText();
        d = jl11.getText()+ " " +jl26.getText();
        e = jl11.getText()+ " " +jl26.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl12MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl12.isSelected()){
        a = jl12.getText()+ " " +jl27.getText();
        b = jl12.getText()+ " " +jl27.getText();
        c = jl12.getText()+ " " +jl27.getText();
        d = jl12.getText()+ " " +jl27.getText();
        e = jl12.getText()+ " " +jl27.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl13MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl13.isSelected()){
        a = jl13.getText();
        b = jl13.getText();
        c = jl13.getText();
        d = jl13.getText();
        e = jl13.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl14MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl14.isSelected()){
        a = jl14.getText();
        b = jl14.getText();
        c = jl14.getText();
        d = jl14.getText();
        e = jl14.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl15MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl15.isSelected()){
        a = jl15.getText();
        b = jl15.getText();
        c = jl15.getText();
        d = jl15.getText();
        e = jl15.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl16MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl16.isSelected()){
        a = jl16.getText();
        b = jl16.getText();
        c = jl16.getText();
        d = jl16.getText();
        e = jl16.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl17MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl17.isSelected()){
        a = jl17.getText();
        b = jl17.getText();
        c = jl17.getText();
        d = jl17.getText();
        e = jl17.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl18MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl18.isSelected()){
        a = jl18.getText();
        b = jl18.getText();
        c = jl18.getText();
        d = jl18.getText();
        e = jl18.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl19MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl19.isSelected()){
        a = jl19.getText();
        b = jl19.getText();
        c = jl19.getText();
        d = jl19.getText();
        e = jl19.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl20MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl20.isSelected()){
        a = jl20.getText();
        b = jl20.getText();
        c = jl20.getText();
        d = jl20.getText();
        e = jl20.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl21MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl21.isSelected()){
        a = jl21.getText();
        b = jl21.getText();
        c = jl21.getText();
        d = jl21.getText();
        e = jl21.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl22MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl22.isSelected()){
        a = jl22.getText();
        b = jl22.getText();
        c = jl22.getText();
        d = jl22.getText();
        e = jl22.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl23MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl23.isSelected()){
        a = jl23.getText();
        b = jl23.getText();
        c = jl23.getText();
        d = jl23.getText();
        e = jl23.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl24MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl24.isSelected()){
        a = jl24.getText()+ " " +jl28.getText();
        b = jl24.getText()+ " " +jl28.getText();
        c = jl24.getText()+ " " +jl28.getText();
        d = jl24.getText()+ " " +jl28.getText();
        e = jl24.getText()+ " " +jl28.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                                

    public void jl25MouseClicked(java.awt.event.MouseEvent evt) {                                 
        if (jl25.isSelected()){
        a = jl25.getText()+ " " +jl29.getText();
        b = jl25.getText()+ " " +jl29.getText();
        c = jl25.getText()+ " " +jl29.getText();
        d = jl25.getText()+ " " +jl29.getText();
        e = jl25.getText()+ " " +jl29.getText();}
        String name1 = txtfirstgroup2.getText();
        String name2 = txtsecondgroup2.getText();
        String name3 = txtthirdgroup2.getText();
        String name4 = txtfourthgroup2.getText();
        String name5 = txtfifthgroup2.getText();
        if (name1.isEmpty()){
            txtfirstgroup2.setText(a);
        } else if (name2.isEmpty()&&!name1.equals(a)){
            txtsecondgroup2.setText(b);
        } else if (name3.isEmpty()&&!name1.equals(a)&&!name2.equals(b)){
            txtthirdgroup2.setText(c);
        } else if (name4.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)){
            txtfourthgroup2.setText(d);
        } else if (name5.isEmpty()&&!name1.equals(a)&&!name2.equals(b)&&!name3.equals(c)&&!name4.equals(d)){
            txtfifthgroup2.setText(e);
        }
    }                   
   
}