package counselorapplication;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.FocusListener;
import java.sql.*;
import javax.swing.*;
import java.util.Arrays;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAST extends javax.swing.JFrame implements ActionListener, WindowListener, FocusListener {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String ca, ca2, s, sx, g;
    int value, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20;
    int sum, i, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20;
    Arrays v, v1, resetArr;
    
    public ButtonGroup group1;
    public ButtonGroup group2;
    public ButtonGroup group3;
    public ButtonGroup group4;
    public ButtonGroup group5;
    public ButtonGroup group6;
    public ButtonGroup group7;
    public ButtonGroup group8;
    public ButtonGroup group9;
    public ButtonGroup group10;
    public ButtonGroup group11;
    public ButtonGroup group12;
    public ButtonGroup group13;
    public ButtonGroup group14;
    public ButtonGroup group15;
    public ButtonGroup group16;
    public ButtonGroup group17;
    public ButtonGroup group18;
    public ButtonGroup group19;
    public ButtonGroup group20;
    public JButton cmdclear1;
    public JButton cmdscore1;
    public JButton cmdsubmit;
    public JLabel l0;
    public JLabel l1;
    public JLabel l2;
    public JLabel l3;
    public JLabel l4;
    public JLabel l5;
    public JLabel l6;
    public JLabel l7;
    public JLabel l8;
    public JLabel l9;
    public JLabel l10;
    public JLabel l11;
    public JLabel l12;
    public JLabel l13;
    public JLabel l14;
    public JLabel l15;
    public JLabel l16;
    public JLabel l17;
    public JLabel l18;
    public JLabel l19;
    public JLabel l20;
    public JLabel l21;
    public JLabel l22;
    public JLabel l23;
    public JLabel l24;
    public JLabel l25;
    public JLabel l26;
    public JLabel l27;
    public JLabel l28;
    public JLabel l29;
    public JLabel l30;
    public JLabel l31;
    public JLabel l32;
    public JLabel l33;
    public JLabel l34;
    public JLabel l35;
    public JLabel l36;
    public JLabel l37;
    public JLabel l38;
    public JLabel l39;
    public JLabel l40;
    public JLabel l41;
    public JLabel l42;
    public JLabel l43;
    public JLabel l44;
    public JLabel l45;
    public JPanel p1;
    public JScrollPane s1;
    public JRadioButton no1;
    public JRadioButton no10;
    public JRadioButton no11;
    public JRadioButton no12;
    public JRadioButton no13;
    public JRadioButton no14;
    public JRadioButton no15;
    public JRadioButton no16;
    public JRadioButton no17;
    public JRadioButton no18;
    public JRadioButton no19;
    public JRadioButton no2;
    public JRadioButton no20;
    public JRadioButton no3;
    public JRadioButton no4;
    public JRadioButton no5;
    public JRadioButton no6;
    public JRadioButton no7;
    public JRadioButton no8;
    public JRadioButton no9;
    public JTextField txtbirthdate;
    public JTextField txtname;
    public JTextField txttestscore;
    public JTextField txttestdate;
    public JRadioButton yes1;
    public JRadioButton yes10;
    public JRadioButton yes11;
    public JRadioButton yes12;
    public JRadioButton yes13;
    public JRadioButton yes14;
    public JRadioButton yes15;
    public JRadioButton yes16;
    public JRadioButton yes17;
    public JRadioButton yes18;
    public JRadioButton yes19;
    public JRadioButton yes2;
    public JRadioButton yes20;
    public JRadioButton yes3;
    public JRadioButton yes4;
    public JRadioButton yes5;
    public JRadioButton yes6;
    public JRadioButton yes7;
    public JRadioButton yes8;
    public JRadioButton yes9;
    
    public DAST() {
      
        group1 = new ButtonGroup();
        group2 = new ButtonGroup();
        group3 = new ButtonGroup();
        group4 = new ButtonGroup();
        group5 = new ButtonGroup();
        group6 = new ButtonGroup();
        group7 = new ButtonGroup();
        group8 = new ButtonGroup();
        group9 = new ButtonGroup();
        group10 = new ButtonGroup();
        group11 = new ButtonGroup();
        group12 = new ButtonGroup();
        group13 = new ButtonGroup();
        group14 = new ButtonGroup();
        group15 = new ButtonGroup();
        group16 = new ButtonGroup();
        group17 = new ButtonGroup();
        group18 = new ButtonGroup();
        group19 = new ButtonGroup();
        group20 = new ButtonGroup();
        s1 = new JScrollPane();
        p1 = new JPanel();
        l0 = new JLabel();
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        txtbirthdate = new JTextField();
        txtname = new JTextField();
        txttestscore = new JTextField();
        txttestdate = new JTextField();
        l5 = new JLabel();
        l6 = new JLabel();
        yes1 = new JRadioButton(Integer.toString(1));
        no1 = new JRadioButton(Integer.toString(0));
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10 = new JLabel();
        yes2 = new JRadioButton(Integer.toString(1));
        no2 = new JRadioButton(Integer.toString(0));
        yes3 = new JRadioButton(Integer.toString(1));
        no3 = new JRadioButton(Integer.toString(0));
        l11 = new JLabel();
        l12 = new JLabel();
        no4 = new JRadioButton(Integer.toString(1));
        yes4 = new JRadioButton(Integer.toString(0));
        l13 = new JLabel();
        l14 = new JLabel();
        l15 = new JLabel();
        no5 = new JRadioButton(Integer.toString(1));
        yes5 = new JRadioButton(Integer.toString(0));
        l16 = new JLabel();
        yes6 = new JRadioButton(Integer.toString(1));
        no6 = new JRadioButton(Integer.toString(0));
        l17 = new JLabel();
        l18 = new JLabel();
        yes7 = new JRadioButton(Integer.toString(1));
        no7 = new JRadioButton(Integer.toString(0));
        l19 = new JLabel();
        l20 = new JLabel();
        yes8 = new JRadioButton(Integer.toString(1));
        no8 = new JRadioButton(Integer.toString(0));
        l21 = new JLabel();
        l22 = new JLabel();
        yes9 = new JRadioButton(Integer.toString(1));
        no9 = new JRadioButton(Integer.toString(0));
        l23 = new JLabel();
        l24 = new JLabel();
        yes10 = new JRadioButton(Integer.toString(1));
        no10 = new JRadioButton(Integer.toString(0));
        l25 = new JLabel();
        l26 = new JLabel();
        l27 = new JLabel();
        yes11 = new JRadioButton(Integer.toString(1));
        no11 = new JRadioButton(Integer.toString(0));
        l28 = new JLabel();
        yes12 = new JRadioButton(Integer.toString(1));
        no12 = new JRadioButton(Integer.toString(0));
        l29 = new JLabel();
        l30 = new JLabel();
        yes13 = new JRadioButton(Integer.toString(1));
        no13 = new JRadioButton(Integer.toString(0));
        l31 = new JLabel();
        l32 = new JLabel();
        yes14 = new JRadioButton(Integer.toString(1));
        no14 = new JRadioButton(Integer.toString(0));
        l33 = new JLabel();
        l34 = new JLabel();
        yes15 = new JRadioButton(Integer.toString(1));
        no15 = new JRadioButton(Integer.toString(0));
        l35 = new JLabel();
        l36 = new JLabel();
        yes16 = new JRadioButton(Integer.toString(1));
        no16 = new JRadioButton(Integer.toString(0));
        l37 = new JLabel();
        l38 = new JLabel();
        yes17 = new JRadioButton(Integer.toString(1));
        no17 = new JRadioButton(Integer.toString(0));
        l39 = new JLabel();
        l40 = new JLabel();
        yes18 = new JRadioButton(Integer.toString(1));
        no18 = new JRadioButton(Integer.toString(0));
        l41 = new JLabel();
        l42 = new JLabel();
        yes19 = new JRadioButton(Integer.toString(1));
        no19 = new JRadioButton(Integer.toString(0));
        l43 = new JLabel();
        l44 = new JLabel();
        l45 = new JLabel();
        yes20 = new JRadioButton(Integer.toString(1));
        no20 = new JRadioButton(Integer.toString(0));
        cmdscore1 = new JButton();
        cmdclear1 = new JButton();
        cmdsubmit = new JButton();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setMinimumSize(new Dimension(650, 650));
        setPreferredSize(new Dimension(650, 650));
        setTitle("DAST");
        addWindowListener(this);

        s1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        s1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        p1.setMinimumSize(new Dimension(900, 2050));
        p1.setPreferredSize(new Dimension(1000, 2050));
        p1.setBackground(new Color(240, 255, 255));
        p1.setLayout(null);

        l1.setFont(new Font("Serif", 0, 16)); 
        l1.setText(" Drug Abuse Screening Test (DAST)");
        p1.add(l1);
        l1.setBounds(10, 11, 224, 22);

        l2.setFont(new Font("Serif", 0, 16)); 
        l2.setText("Name (Full Name):");
        p1.add(l2);
        l2.setBounds(10, 65, 117, 22);

        l3.setFont(new Font("Serif", 0, 16)); 
        l3.setText("Date of Birth (Ex. 1980-06-12):");
        p1.add(l3);
        l3.setBounds(10, 108, 195, 22);

        l4.setFont(new Font("Serif", 0, 16)); 
        l4.setText("Test Score:");
        p1.add(l4);
        l4.setBounds(10, 151, 69, 22);
        
        l45.setFont(new Font("Serif", 0, 16));
        l45.setText("Date of Test:");
        p1.add(l45);
        l45.setBounds(400, 65, 100, 22);
        
        txttestdate.setFont(new Font("Serif", 0, 14));
        p1.add(txttestdate);
        txttestdate.setBounds(500, 64, 152, 25);

        txtbirthdate.setFont(new Font("Serif", 0, 14)); 
        txtbirthdate.addFocusListener(this);
        p1.add(txtbirthdate);
        txtbirthdate.setBounds(223, 107, 152, 25);

        txtname.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtname);
        txtname.setBounds(145, 64, 230, 25);

        txttestscore.setFont(new Font("Serif", 0, 14)); 
        p1.add(txttestscore);
        txttestscore.setBounds(223, 150, 152, 25);

        l5.setFont(new Font("Serif", 0, 16)); 
        l5.setText("Have you used drugs other than those required for medical reasons?");
        p1.add(l5);
        l5.setBounds(40, 193, 409, 22);

        l6.setFont(new Font("Serif", 0, 16)); 
        l6.setText("1.");
        p1.add(l6);
        l6.setBounds(10, 193, 12, 22);

        yes1.setFont(new Font("Serif", 0, 16)); 
        yes1.setText("Yes");
        yes1.setToolTipText("");
        group1.add(yes1);
        p1.add(yes1);
        yes1.setBounds(40, 233, 49, 31);
        yes1.setBackground(new Color(240, 255, 255));

        no1.setFont(new Font("Serif", 0, 16)); 
        no1.setText("No");
        group1.add(no1);
        p1.add(no1);
        no1.setBounds(107, 233, 45, 31);
        no1.setBackground(new Color(240, 255, 255));

        l7.setFont(new Font("Serif", 0, 16)); 
        l7.setText("2.");
        p1.add(l7);
        l7.setBounds(10, 282, 12, 22);

        l8.setFont(new Font("Serif", 0, 16)); 
        l8.setText("Have you abused prescription drugs?");
        p1.add(l8);
        l8.setBounds(40, 282, 224, 22);

        no2.setFont(new Font("Serif", 0, 16)); 
        no2.setText("No");
        group2.add(no2);
        p1.add(no2);
        no2.setBounds(107, 322, 45, 31);
        no2.setBackground(new Color(240, 255, 255));

        yes2.setFont(new Font("Serif", 0, 16)); 
        yes2.setText("Yes");
        group2.add(yes2);
        p1.add(yes2);
        yes2.setBounds(40, 322, 49, 31);
        yes2.setBackground(new Color(240, 255, 255));
        
        l9.setFont(new Font("Serif", 0, 16)); 
        l9.setText("3.");
        p1.add(l9);
        l9.setBounds(10, 367, 12, 22);

        l10.setFont(new Font("Serif", 0, 16)); 
        l10.setText("Do you abuse more than one drug at a time?");
        p1.add(l10);
        l10.setBounds(40, 367, 267, 22);

        no3.setFont(new Font("Serif", 0, 16)); 
        no3.setText("No");
        group3.add(no3);
        p1.add(no3);
        no3.setBounds(107, 407, 45, 31);
        no3.setBackground(new Color(240, 255, 255));
        
        yes3.setFont(new Font("Serif", 0, 16)); 
        yes3.setText("Yes");
        group3.add(yes3);
        p1.add(yes3);
        yes3.setBounds(40, 407, 49, 31);
        yes3.setBackground(new Color(240, 255, 255));

        l11.setFont(new Font("Serif", 0, 16)); 
        l11.setText("4.");
        p1.add(l11);
        l11.setBounds(10, 456, 12, 22);

        l12.setFont(new Font("Serif", 0, 16)); 
        l12.setText("Can you get through the week without using drugs?");
        p1.add(l12);
        l12.setBounds(40, 456, 307, 22);

        no4.setFont(new Font("Serif", 0, 16)); 
        no4.setText("No");
        group4.add(no4);
        p1.add(no4);
        no4.setBounds(107, 496, 45, 31);
        no4.setBackground(new Color(240, 255, 255));

        yes4.setFont(new Font("Serif", 0, 16)); 
        yes4.setText("Yes");
        group4.add(yes4);
        p1.add(yes4);
        yes4.setBounds(40, 496, 49, 31);
        yes4.setBackground(new Color(240, 255, 255));

        l13.setFont(new Font("Serif", 0, 16)); 
        l13.setText("5.");
        p1.add(l13);
        l13.setBounds(10, 545, 12, 22);

        l14.setFont(new Font("Serif", 0, 16)); 
        l14.setText("Are you always able to stop using drugs when you want to?");
        p1.add(l14);
        l14.setBounds(40, 545, 358, 22);

        no5.setFont(new Font("Serif", 0, 16)); 
        no5.setText("No");
        group5.add(no5);
        p1.add(no5);
        no5.setBounds(107, 585, 45, 31);
        no5.setBackground(new Color(240, 255, 255));

        yes5.setFont(new Font("Serif", 0, 16)); 
        yes5.setText("Yes");
        group5.add(yes5);
        p1.add(yes5);
        yes5.setBounds(40, 585, 49, 31);
        yes5.setBackground(new Color(240, 255, 255));
        
        l15.setFont(new Font("Serif", 0, 16)); 
        l15.setText("6.");
        p1.add(l15);
        l15.setBounds(10, 634, 12, 22);

        l16.setFont(new Font("Serif", 0, 16)); 
        l16.setText("Have you had “blackouts” or “flashbacks” as a result of drug use?");
        p1.add(l16);
        l16.setBounds(40, 634, 396, 22);

        yes6.setFont(new Font("Serif", 0, 16)); 
        yes6.setText("Yes");
        group6.add(yes6);
        p1.add(yes6);
        yes6.setBounds(40, 674, 49, 31);
        yes6.setBackground(new Color(240, 255, 255));

        no6.setFont(new Font("Serif", 0, 16)); 
        no6.setText("No");
        group6.add(no6);
        p1.add(no6);
        no6.setBounds(107, 674, 45, 31);
        no6.setBackground(new Color(240, 255, 255));

        l17.setFont(new Font("Serif", 0, 16)); 
        l17.setText("7.");
        p1.add(l17);
        l17.setBounds(10, 723, 12, 22);

        l18.setFont(new Font("Serif", 0, 16)); 
        l18.setText("Do you ever feel bad or guilty about your drug use?");
        p1.add(l18);
        l18.setBounds(40, 723, 310, 22);

        yes7.setFont(new Font("Serif", 0, 16)); 
        yes7.setText("Yes");
        group7.add(yes7);
        p1.add(yes7);
        yes7.setBounds(40, 763, 49, 31);
        yes7.setBackground(new Color(240, 255, 255));

        no7.setFont(new Font("Serif", 0, 16)); 
        no7.setText("No");
        group7.add(no7);
        p1.add(no7);
        no7.setBounds(107, 763, 45, 31);
        no7.setBackground(new Color(240, 255, 255));

        l19.setFont(new Font("Serif", 0, 16)); 
        l19.setText("8.");
        p1.add(l19);
        l19.setBounds(10, 812, 12, 22);

        l20.setFont(new Font("Serif", 0, 16)); 
        l20.setText("Does your spouse (or parents) ever complain about your involvement with drugs?");
        p1.add(l20);
        l20.setBounds(40, 812, 489, 22);

        yes8.setFont(new Font("Serif", 0, 16)); 
        yes8.setText("Yes");
        group8.add(yes8);
        p1.add(yes8);
        yes8.setBounds(40, 852, 49, 31);
        yes8.setBackground(new Color(240, 255, 255));

        no8.setFont(new Font("Serif", 0, 16)); 
        no8.setText("No");
        group8.add(no8);
        p1.add(no8);
        no8.setBounds(107, 852, 45, 31);
        no8.setBackground(new Color(240, 255, 255));

        l21.setFont(new Font("Serif", 0, 16)); 
        l21.setText("9.");
        p1.add(l21);
        l21.setBounds(10, 901, 12, 22);

        l22.setFont(new Font("Serif", 0, 16)); 
        l22.setText("Has drug abuse created problems between you and your spouse or your parents?");
        p1.add(l22);
        l22.setBounds(40, 901, 490, 22);

        yes9.setFont(new Font("Serif", 0, 16)); 
        yes9.setText("Yes");
        group9.add(yes9);
        p1.add(yes9);
        yes9.setBounds(40, 941, 49, 31);
        yes9.setBackground(new Color(240, 255, 255));

        no9.setFont(new Font("Serif", 0, 16)); 
        no9.setText("No");
        group9.add(no9);
        p1.add(no9);
        no9.setBounds(107, 941, 45, 31);
        no9.setBackground(new Color(240, 255, 255));

        l23.setFont(new Font("Serif", 0, 16)); 
        l23.setText("10.");
        p1.add(l23);
        l23.setBounds(10, 990, 20, 22);

        l24.setFont(new Font("Serif", 0, 16)); 
        l24.setText("Have you lost friends because of your use of drugs?");
        p1.add(l24);
        l24.setBounds(48, 990, 311, 22);

        no10.setFont(new Font("Serif", 0, 16)); 
        no10.setText("No");
        group10.add(no10);
        p1.add(no10);
        no10.setBounds(115, 1030, 45, 31);
        no10.setBackground(new Color(240, 255, 255));

        yes10.setFont(new Font("Serif", 0, 16)); 
        yes10.setText("Yes");
        group10.add(yes10);
        p1.add(yes10);
        yes10.setBounds(48, 1030, 49, 31);
        yes10.setBackground(new Color(240, 255, 255));

        l25.setFont(new Font("Serif", 0, 16)); 
        l25.setText("11.");
        p1.add(l25);
        l25.setBounds(10, 1079, 20, 22);

        l26.setFont(new Font("Serif", 0, 16)); 
        l26.setText("Have you neglected your family because of your use of drugs?");
        p1.add(l26);
        l26.setBounds(48, 1079, 373, 22);

        no11.setFont(new Font("Serif", 0, 16)); 
        no11.setText("No");
        group11.add(no11);
        p1.add(no11);
        no11.setBounds(115, 1119, 45, 31);
        no11.setBackground(new Color(240, 255, 255));

        yes11.setFont(new Font("Serif", 0, 16)); 
        yes11.setText("Yes");
        group11.add(yes11);
        p1.add(yes11);
        yes11.setBounds(48, 1119, 49, 31);
        yes11.setBackground(new Color(240, 255, 255));
        
        l27.setFont(new Font("Serif", 0, 16)); 
        l27.setText("12.");
        p1.add(l27);
        l27.setBounds(10, 1168, 20, 22);

        l28.setFont(new Font("Serif", 0, 16)); 
        l28.setText("Have you been in trouble at work because of your use of drugs?");
        p1.add(l28);
        l28.setBounds(48, 1168, 386, 22);

        yes12.setFont(new Font("Serif", 0, 16)); 
        yes12.setText("Yes");
        group12.add(yes12);
        p1.add(yes12);
        yes12.setBounds(48, 1208, 49, 31);
        yes12.setBackground(new Color(240, 255, 255));

        no12.setFont(new Font("Serif", 0, 16)); 
        no12.setText("No");
        group12.add(no12);
        p1.add(no12);
        no12.setBounds(115, 1208, 45, 31);
        no12.setBackground(new Color(240, 255, 255));

        l29.setFont(new Font("Serif", 0, 16)); 
        l29.setText("13.");
        p1.add(l29);
        l29.setBounds(10, 1257, 20, 22);

        l30.setFont(new Font("Serif", 0, 16)); 
        l30.setText("Have you lost a job because of drug abuse?");
        p1.add(l30);
        l30.setBounds(48, 1257, 264, 22);

        yes13.setFont(new Font("Serif", 0, 16)); 
        yes13.setText("Yes");
        group13.add(yes13);
        p1.add(yes13);
        yes13.setBounds(48, 1297, 49, 31);
        yes13.setBackground(new Color(240, 255, 255));

        no13.setFont(new Font("Serif", 0, 16)); 
        no13.setText("No");
        group13.add(no13);
        p1.add(no13);
        no13.setBounds(115, 1297, 45, 31);
        no13.setBackground(new Color(240, 255, 255));

        l31.setFont(new Font("Serif", 0, 16)); 
        l31.setText("14.");
        p1.add(l31);
        l31.setBounds(10, 1346, 20, 22);

        l32.setFont(new Font("Serif", 0, 16)); 
        l32.setText("Have you gotten into fights when under the influence of drugs?");
        p1.add(l32);
        l32.setBounds(48, 1346, 372, 22);

        no14.setFont(new Font("Serif", 0, 16)); 
        no14.setText("No");
        group14.add(no14);
        p1.add(no14);
        no14.setBounds(115, 1386, 45, 31);
        no14.setBackground(new Color(240, 255, 255));

        yes14.setFont(new Font("Serif", 0, 16)); 
        yes14.setText("Yes");
        group14.add(yes14);
        p1.add(yes14);
        yes14.setBounds(48, 1386, 49, 31);
        yes14.setBackground(new Color(240, 255, 255));

        l33.setFont(new Font("Serif", 0, 16)); 
        l33.setText("15.");
        p1.add(l33);
        l33.setBounds(10, 1435, 20, 22);

        l34.setFont(new Font("Serif", 0, 16)); 
        l34.setText("Have you engaged in illegal activities in order to obtain drugs?");
        p1.add(l34);
        l34.setBounds(48, 1435, 370, 22);

        no15.setFont(new Font("Serif", 0, 16)); 
        no15.setText("No");
        group15.add(no15);
        p1.add(no15);
        no15.setBounds(115, 1475, 45, 31);
        no15.setBackground(new Color(240, 255, 255));

        yes15.setFont(new Font("Serif", 0, 16)); 
        yes15.setText("Yes");
        group15.add(yes15);
        p1.add(yes15);
        yes15.setBounds(48, 1475, 49, 31);
        yes15.setBackground(new Color(240, 255, 255));

        l35.setFont(new Font("Serif", 0, 16)); 
        l35.setText("16.");
        p1.add(l35);
        l35.setBounds(10, 1524, 20, 22);

        l36.setFont(new Font("Serif", 0, 16)); 
        l36.setText("Have you been arrested for possession of illegal drugs?");
        p1.add(l36);
        l36.setBounds(48, 1524, 331, 22);

        no16.setFont(new Font("Serif", 0, 16)); 
        no16.setText("No");
        group16.add(no16);
        p1.add(no16);
        no16.setBounds(115, 1564, 45, 31);
        no16.setBackground(new Color(240, 255, 255));

        yes16.setFont(new Font("Serif", 0, 16)); 
        yes16.setText("Yes");
        group16.add(yes16);
        p1.add(yes16);
        yes16.setBounds(48, 1564, 49, 31);
        yes16.setBackground(new Color(240, 255, 255));

        l37.setFont(new Font("Serif", 0, 16)); 
        l37.setText("17.");
        p1.add(l37);
        l37.setBounds(10, 1613, 20, 22);

        l38.setFont(new Font("Serif", 0, 16)); 
        l38.setText("Have you ever experienced withdrawal symptoms (felt sick) when you stopped taking drugs?");
        p1.add(l38);
        l38.setBounds(48, 1613, 559, 22);

        no17.setFont(new Font("Serif", 0, 16)); 
        no17.setText("No");
        group17.add(no17);
        p1.add(no17);
        no17.setBounds(115, 1653, 45, 31);
        no17.setBackground(new Color(240, 255, 255));

        yes17.setFont(new Font("Serif", 0, 16)); 
        yes17.setText("Yes");
        group17.add(yes17);
        p1.add(yes17);
        yes17.setBounds(48, 1653, 49, 31);
        yes17.setBackground(new Color(240, 255, 255));

        l39.setFont(new Font("Serif", 0, 16)); 
        l39.setText("18.");
        p1.add(l39);
        l39.setBounds(10, 1702, 20, 22);

        l40.setFont(new Font("Serif", 0, 16)); 
        l40.setText("Have you had medical problems as a result of your drug use (e.g., memory loss, hepatitis, convulsions, bleeding, etc.)?");
        p1.add(l40);
        l40.setBounds(48, 1702, 709, 22);

        no18.setFont(new Font("Serif", 0, 16)); 
        no18.setText("No");
        group18.add(no18);
        p1.add(no18);
        no18.setBounds(115, 1742, 45, 31);
        no18.setBackground(new Color(240, 255, 255));

        yes18.setFont(new Font("Serif", 0, 16)); 
        yes18.setText("Yes");
        group18.add(yes18);
        p1.add(yes18);
        yes18.setBounds(48, 1742, 49, 31);
        yes18.setBackground(new Color(240, 255, 255));

        l41.setFont(new Font("Serif", 0, 16)); 
        l41.setText("19.");
        p1.add(l41);
        l41.setBounds(10, 1791, 20, 22);

        l42.setFont(new Font("Serif", 0, 16)); 
        l42.setText("Have you gone to anyone for help for a drug problem?");
        p1.add(l42);
        l42.setBounds(48, 1791, 328, 22);

        no19.setFont(new Font("Serif", 0, 16)); 
        no19.setText("No");
        group19.add(no19);
        p1.add(no19);
        no19.setBounds(115, 1831, 45, 31);
        no19.setBackground(new Color(240, 255, 255));

        yes19.setFont(new Font("Serif", 0, 16)); 
        yes19.setText("Yes");
        group19.add(yes19);
        p1.add(yes19);
        yes19.setBounds(48, 1831, 49, 31);
        yes19.setBackground(new Color(240, 255, 255));

        l43.setFont(new Font("Serif", 0, 16));
        l43.setText("20.");
        p1.add(l43);
        l43.setBounds(10, 1880, 20, 22);

        l44.setFont(new Font("Serif", 0, 16)); 
        l44.setText("Have you been involved in a treatment program especially related to drug use?");
        p1.add(l44);
        l44.setBounds(48, 1880, 470, 22);

        no20.setFont(new Font("Serif", 0, 16)); 
        no20.setText("No");
        group20.add(no20);
        p1.add(no20);
        no20.setBounds(115, 1920, 45, 31);
        no20.setBackground(new Color(240, 255, 255));

        yes20.setFont(new Font("Serif", 0, 16)); 
        yes20.setText("Yes");
        group20.add(yes20);
        p1.add(yes20);
        yes20.setBounds(48, 1920, 49, 31);
        yes20.setBackground(new Color(240, 255, 255));

        cmdscore1.setFont(new Font("Serif", 0, 16)); 
        cmdscore1.setText("Get Score");
        cmdscore1.addActionListener(this);
        p1.add(cmdscore1);
        cmdscore1.setBounds(48, 1992, 130, 31);

        cmdclear1.setFont(new Font("Serif", 0, 16)); 
        cmdclear1.setText("Clear Form");
        cmdclear1.addActionListener(this);
        p1.add(cmdclear1);
        cmdclear1.setBounds(200, 1992, 133, 31); 
        
        cmdsubmit.setFont(new Font("Serif", 0, 16)); 
        cmdsubmit.setText("Submit");
        cmdsubmit.addActionListener(this);
        p1.add(cmdsubmit);
        cmdsubmit.setBounds(400, 1992, 100, 31); 

        s1.setViewportView(p1);
        
        URL icon = this.getClass().getClassLoader().getResource("test2.jpg");
        ImageIcon ic = new ImageIcon(icon);
        setIconImage(ic.getImage());
        
        getContentPane().add(s1);
        
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == cmdscore1) {
            DAST.this.cmdscore1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear1) {
            DAST.this.cmdclear1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit) {
            DAST.this.cmdsubmitActionPerformed(evt);
        }
    }
    
    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
    }

    @Override
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (evt.getSource() == txtbirthdate) {
            DAST.this.txtbirthdateFocusLost(evt);
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
        if (evt.getSource() == DAST.this) {
            try {
                DAST.this.formWindowOpened(evt);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DAST.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void formWindowOpened(java.awt.event.WindowEvent evt) throws ClassNotFoundException {                                  
        conn = mysqlconnect.ConnectDb();
        
    }
    
    public void txtbirthdateFocusLost(java.awt.event.FocusEvent evt) {       
                                   
        ca = txtname.getText();
        ca2 = txtbirthdate.getText();
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
            if ((ca.equals(s))&&(ca2.equals(sx))) { 
                 JOptionPane.showMessageDialog(null,"Name & Birth Date Found");
            }
            else {              
              JOptionPane.showMessageDialog(null,"Name & Birth Date Not Found");
            }            
        }catch (HeadlessException e){}
    }
    
    public void cmdscore1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (yes1.isSelected()){
            t1 = 1;
        }
        if (no1.isSelected()){
            d1 = 0;
        }
        if (yes2.isSelected()){
            t2 = 1;
        }
        if (no2.isSelected()){
            d2 = 0;
        }
        if (yes3.isSelected()){
            t3 = 1;
        }
        if (no3.isSelected()){
            d3 = 0;
        }
        if (no4.isSelected()){
            t4 = 1;
        }
        if (yes4.isSelected()){
            d4 = 0;
        }
        if (no5.isSelected()){
            t5 = 1;
        }
        if (yes5.isSelected()){
            d5 = 0;
        }
        if (yes6.isSelected()){
            t6 = 1;
        }
        if (no6.isSelected()){
            d6 = 0;
        }
        if (yes7.isSelected()){
            t7 = 1;
        }
        if (no7.isSelected()){
            d7 = 0;
        }
        if (yes8.isSelected()){
           t8 = 1;
        }
        if (no8.isSelected()){
           d8 = 0;
        }
        if (yes9.isSelected()){
            t9 = 1;
        }
        if (no9.isSelected()){
            d9 = 0;
        }
        if (yes10.isSelected()){
            t10 = 1;
        }
        if (no10.isSelected()){
            d10 = 0;
        }
        if (yes11.isSelected()){
            t11 = 1;
        }
        if (no11.isSelected()){
           d11 = 0;
        }
        if (yes12.isSelected()){
            t12 = 1;
        }
        if (no12.isSelected()){
            d12 = 0;
        }
        if (yes13.isSelected()){
            t13 = 1;
        }
        if (no13.isSelected()){
            d13 = 0;
        }
        if (yes14.isSelected()){
            t14 = 1;
        }
        if (no14.isSelected()){
            d14 = 0;
        }
        if (yes15.isSelected()){
            t15 = 1;
        }
        if (no15.isSelected()){
            d15 = 0;
        }
        if (yes16.isSelected()){
            t16 = 1;
        } 
        if (no16.isSelected()){
            d16 = 0;
        }
        if (yes17.isSelected()){
            t17 = 1;
        }
        if (no17.isSelected()){
            d17 = 0;
        }
        if (yes18.isSelected()){
            t18 = 1;
        }
        if (no18.isSelected()){
            d18 = 0;
        }
        if (yes19.isSelected()){
            t19 = 1;
        }
        if (no19.isSelected()){
            d19 = 0;
        }
        if (yes20.isSelected()){
            t20 = 1;
        }
        if (no20.isSelected()){
            d20 = 0; 
        }
        sum = 0;    
        
        int scores[] = {t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20};                                   
        for ( i = 0; i < scores.length; i++){       
        sum += scores[i];        
        }
        g = Integer.toString(sum);
        txttestscore.setText(g);
        
        
        
        
    }
    
    public void cmdclear1ActionPerformed(java.awt.event.ActionEvent evt) {   
                
        t1=0;
        t2=0;
        t3=0;
        t4=0;
        t5=0;
        t6=0;
        t7=0;
        t8=0;
        t9=0;
        t10=0;
        t11=0;
        t12=0;
        t13=0;
        t14=0;
        t15=0;
        t16=0;
        t17=0;
        t18=0;
        t19=0;
        t20=0;
        txttestscore.setText("");
        group1.clearSelection();
        group2.clearSelection();
        group3.clearSelection();
        group4.clearSelection();
        group5.clearSelection();
        group6.clearSelection();
        group7.clearSelection();
        group8.clearSelection();
        group9.clearSelection();
        group10.clearSelection();
        group11.clearSelection();
        group12.clearSelection();
        group13.clearSelection();
        group14.clearSelection();
        group15.clearSelection();
        group16.clearSelection();
        group17.clearSelection();
        group18.clearSelection();
        group19.clearSelection();
        group20.clearSelection(); 
        
    }
    
    public void cmdsubmitActionPerformed(java.awt.event.ActionEvent evt) {
        String sql = "insert into dast (Name, Birth_Date, Test_Date, Test_Score) values(?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname.getText());
            pst.setString(2, txtbirthdate.getText());
            pst.setString(3, txttestdate.getText());
            pst.setString(4, txttestscore.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }
    
}
