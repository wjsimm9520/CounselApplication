package counselorapplication;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerListener;
import java.awt.event.WindowListener;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import net.proteanit.sql.DbUtils;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MAST extends javax.swing.JFrame implements ActionListener, WindowListener, FocusListener {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String ca, ca2, s, sx, g;
    int value, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22;
    int sum, i, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22;
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
    public ButtonGroup group21;
    public ButtonGroup group22;
    public JButton cmdclear1;
    public JButton cmdscore1;
    public JButton cmdsubmit;
    public JLabel l1;
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
    public JLabel l2;
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
    public JLabel l3;
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
    public JLabel l4;
    public JLabel l40;
    public JLabel l41;
    public JLabel l42;
    public JLabel l43;
    public JLabel l44;
    public JLabel l45;
    public JLabel l46;
    public JLabel l47;
    public JLabel l48;
    public JLabel l49;
    public JLabel l50;
    public JLabel l5;
    public JLabel l6;
    public JLabel l7;
    public JLabel l8;
    public JLabel l9;
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
    public JRadioButton no21;
    public JRadioButton no22;
    public JRadioButton no3;
    public JRadioButton no4;
    public JRadioButton no5;
    public JRadioButton no6;
    public JRadioButton no7;
    public JRadioButton no8;
    public JRadioButton no9;
    public JPanel p1;
    public JScrollPane s1;
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
    public JRadioButton yes21;
    public JRadioButton yes22;
    public JRadioButton yes3;
    public JRadioButton yes4;
    public JRadioButton yes5;
    public JRadioButton yes6;
    public JRadioButton yes7;
    public JRadioButton yes8;
    public JRadioButton yes9;
    
    public MAST() {
        
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
        group21 = new ButtonGroup();
        group22 = new ButtonGroup();
        s1 = new JScrollPane();
        p1 = new JPanel();
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        txtbirthdate = new JTextField();
        txttestscore = new JTextField();
        txttestdate = new JTextField();
        txtname = new JTextField();
        l6 = new JLabel();
        l7 = new JLabel();
        yes1 = new JRadioButton();
        no1 = new JRadioButton();
        l8 = new JLabel();
        l9 = new JLabel();
        no2 = new JRadioButton();
        yes2 = new JRadioButton();
        l10 = new JLabel();
        l11 = new JLabel();
        yes3 = new JRadioButton();
        no3 = new JRadioButton();
        l12 = new JLabel();
        l13 = new JLabel();
        yes4 = new JRadioButton();
        no4 = new JRadioButton();
        l14 = new JLabel();
        l15 = new JLabel();
        yes5 = new JRadioButton();
        no5 = new JRadioButton();
        l16 = new JLabel();
        l17 = new JLabel();
        no6 = new JRadioButton();
        yes6 = new JRadioButton();
        l18 = new JLabel();
        l19 = new JLabel();
        yes7 = new JRadioButton();
        no7 = new JRadioButton();
        l20 = new JLabel();
        l21 = new JLabel();
        yes8 = new JRadioButton();
        no8 = new JRadioButton();
        l22 = new JLabel();
        l23 = new JLabel();
        yes9 = new JRadioButton();
        no9 = new JRadioButton();
        l24 = new JLabel();
        l25 = new JLabel();
        yes10 = new JRadioButton();
        no10 = new JRadioButton();
        l26 = new JLabel();
        l27 = new JLabel();
        yes11 = new JRadioButton();
        no11 = new JRadioButton();
        l28 = new JLabel();
        l29 = new JLabel();
        yes12 = new JRadioButton();
        no12 = new JRadioButton();
        l30 = new JLabel();
        l31 = new JLabel();
        yes13 = new JRadioButton();
        no13 = new JRadioButton();
        l32 = new JLabel();
        l33 = new JLabel();
        yes14 = new JRadioButton();
        no14 = new JRadioButton();
        l34 = new JLabel();
        l35 = new JLabel();
        no15 = new JRadioButton();
        yes15 = new JRadioButton();
        l36 = new JLabel();
        l37 = new JLabel();
        yes16 = new JRadioButton();
        no16 = new JRadioButton();
        l38 = new JLabel();
        l39 = new JLabel();
        no17 = new JRadioButton();
        yes17 = new JRadioButton();
        l40 = new JLabel();
        l41 = new JLabel();
        yes18 = new JRadioButton();
        no18 = new JRadioButton();
        l42 = new JLabel();
        l43 = new JLabel();
        yes19 = new JRadioButton();
        no19 = new JRadioButton();
        l44 = new JLabel();
        l45 = new JLabel();
        no20 = new JRadioButton();
        yes20 = new JRadioButton();
        l46 = new JLabel();
        l47 = new JLabel();
        no21 = new JRadioButton();
        yes21 = new JRadioButton();
        l48 = new JLabel();
        l49 = new JLabel();
        l50 = new JLabel();
        no22 = new JRadioButton();
        yes22 = new JRadioButton();
        cmdscore1 = new JButton();
        cmdsubmit = new JButton();
        cmdclear1 = new JButton();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setMinimumSize(new Dimension(650, 650));
        setPreferredSize(new Dimension(650, 650));
        setTitle("MAST");
        addWindowListener(this);

        s1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        s1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        p1.setMinimumSize(new Dimension(900, 2250));
        p1.setPreferredSize(new Dimension(1000, 2250));
        p1.setBackground(new Color(240, 255, 255));
        p1.setLayout(null);

        l1.setFont(new Font("Serif", 0, 16)); 
        l1.setText("Michigan Alcohol Screening Test (MAST)");
        p1.add(l1);
        l1.setBounds(10, 11, 256, 22);

        l2.setFont(new Font("Serif", 0, 16)); 
        l2.setText("Name (Full Name):");
        p1.add(l2);
        l2.setBounds(10, 52, 117, 22);
        
        l50.setFont(new Font("Serif", 0, 16)); 
        l50.setText("Date of Test:");
        p1.add(l50);
        l50.setBounds(420, 52, 100, 22);

        l3.setFont(new Font("Serif", 0, 16)); 
        l3.setText("Date of Birth (Ex. 1990-10-20):");
        p1.add(l3);
        l3.setBounds(10, 95, 195, 22);

        l4.setFont(new Font("Serif", 0, 16)); 
        l4.setText("Score:");
        p1.add(l4);
        l4.setBounds(10, 138, 39, 22);

        l5.setFont(new java.awt.Font("Serif", 0, 16)); 
        l5.setText("The questions refer to the past 12 months. Carefully read each statement and decide whether your answer is yes or no.");
        p1.add(l5);
        l5.setBounds(10, 180, 712, 22);

        txtbirthdate.setFont(new Font("Serif", 0, 14)); 
        txtbirthdate.addFocusListener(this);
        p1.add(txtbirthdate);
        txtbirthdate.setBounds(223, 94, 160, 25);

        txttestscore.setFont(new Font("Serif", 0, 14)); 
        p1.add(txttestscore);
        txttestscore.setBounds(223, 137, 160, 25);

        txtname.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtname);
        txtname.setBounds(145, 51, 238, 25);
        
        txttestdate.setFont(new Font("Serif", 0, 14)); 
        p1.add(txttestdate);
        txttestdate.setBounds(523, 51, 160, 25);

        l6.setFont(new Font("Serif", 0, 16)); 
        l6.setText("1.");
        p1.add(l6);
        l6.setBounds(10, 220, 12, 22);

        l7.setFont(new Font("Serif", 0, 16)); 
        l7.setText("Do you feel you are a normal drinker? (“normal” – drink as much or less than most other people)?");
        p1.add(l7);
        l7.setBounds(40, 220, 588, 22);

        yes1.setFont(new Font("Serif", 0, 16)); 
        yes1.setText("Yes");
        group1.add(yes1);
        p1.add(yes1);
        yes1.setBounds(40, 260, 49, 31);
        yes1.setBackground(new Color(240, 255, 255));

        no1.setFont(new Font("Serif", 0, 16)); 
        no1.setText("No");
        group1.add(no1);
        p1.add(no1);
        no1.setBounds(107, 260, 45, 31);
        no1.setBackground(new Color(240, 255, 255));

        l8.setFont(new Font("Serif", 0, 16)); 
        l8.setText("2.");
        p1.add(l8);
        l8.setBounds(10, 309, 12, 22);

        l9.setFont(new Font("Serif", 0, 16)); 
        l9.setText("Have you ever awakened the morning after some drinking the night before and found that you could not remember a part of the evening?");
        p1.add(l9);
        l9.setBounds(40, 309, 818, 22);

        no2.setFont(new Font("Serif", 0, 16)); 
        no2.setText("No");
        group2.add(no2);
        p1.add(no2);
        no2.setBounds(107, 349, 45, 31);
        no2.setBackground(new Color(240, 255, 255));

        yes2.setFont(new Font("Serif", 0, 16)); 
        yes2.setText("Yes");
        group2.add(yes2);
        p1.add(yes2);
        yes2.setBounds(40, 349, 49, 31);
        yes2.setBackground(new Color(240, 255, 255));

        l10.setFont(new Font("Serif", 0, 16)); 
        l10.setText("3.");
        p1.add(l10);
        l10.setBounds(10, 398, 12, 22);

        l11.setFont(new Font("Serif", 0, 16)); 
        l11.setText("Does any near relative or close friend ever worry or complain about your drinking?");
        p1.add(l11);
        l11.setBounds(40, 398, 497, 22);

        yes3.setFont(new Font("Serif", 0, 16)); 
        yes3.setText("Yes");
        group3.add(yes3);
        p1.add(yes3);
        yes3.setBounds(40, 438, 49, 31);
        yes3.setBackground(new Color(240, 255, 255));

        no3.setFont(new Font("Serif", 0, 16)); 
        no3.setText("No");
        group3.add(no3);
        p1.add(no3);
        no3.setBounds(107, 438, 45, 31);
        no3.setBackground(new Color(240, 255, 255));

        l12.setFont(new Font("Serif", 0, 16)); 
        l12.setText("4.");
        p1.add(l12);
        l12.setBounds(10, 487, 12, 22);

        l13.setFont(new Font("Serif", 0, 16)); 
        l13.setText("Can you stop drinking without difficulty after one or two drinks?");
        p1.add(l13);
        l13.setBounds(40, 487, 384, 22);

        yes4.setFont(new Font("Serif", 0, 16)); 
        yes4.setText("Yes");
        group4.add(yes4);
        p1.add(yes4);
        yes4.setBounds(40, 527, 49, 31);
        yes4.setBackground(new Color(240, 255, 255));

        no4.setFont(new Font("Serif", 0, 16)); 
        no4.setText("No");
        group4.add(no4);
        p1.add(no4);
        no4.setBounds(107, 527, 45, 31);
        no4.setBackground(new Color(240, 255, 255));

        l14.setFont(new Font("Serif", 0, 16)); 
        l14.setText("5.");
        p1.add(l14);
        l14.setBounds(10, 576, 12, 22);

        l15.setFont(new Font("Serif", 0, 16)); 
        l15.setText("Do you ever feel guilty about your drinking?");
        p1.add(l15);
        l15.setBounds(40, 576, 263, 22);

        yes5.setFont(new Font("Serif", 0, 16)); 
        yes5.setText("Yes");
        group5.add(yes5);
        p1.add(yes5);
        yes5.setBounds(40, 616, 49, 31);
        yes5.setBackground(new Color(240, 255, 255));

        no5.setFont(new Font("Serif", 0, 16)); 
        no5.setText("No");
        group5.add(no5);
        p1.add(no5);
        no5.setBounds(107, 616, 45, 31);
        no5.setBackground(new Color(240, 255, 255));

        l16.setFont(new Font("Serif", 0, 16)); 
        l16.setText("6.");
        p1.add(l16);
        l16.setBounds(10, 665, 12, 22);

        l17.setFont(new Font("Serif", 0, 16)); 
        l17.setText("Have you ever attended a meeting of Alcoholics Anonymous (AA)?");
        p1.add(l17);
        l17.setBounds(40, 665, 407, 22);

        no6.setFont(new Font("Serif", 0, 16)); 
        no6.setText("No");
        group6.add(no6);
        p1.add(no6);
        no6.setBounds(107, 705, 45, 31);
        no6.setBackground(new Color(240, 255, 255));

        yes6.setFont(new Font("Serif", 0, 16)); 
        yes6.setText("Yes");
        group6.add(yes6);
        p1.add(yes6);
        yes6.setBounds(40, 705, 49, 31);
        yes6.setBackground(new Color(240, 255, 255));

        l18.setFont(new Font("Serif", 0, 16)); 
        l18.setText("7.");
        p1.add(l18);
        l18.setBounds(10, 754, 12, 22);

        l19.setFont(new Font("Serif", 0, 16)); 
        l19.setText("Have you ever gotten into physical fights when drinking?");
        p1.add(l19);
        l19.setBounds(40, 754, 337, 22);

        yes7.setFont(new Font("Serif", 0, 16)); 
        yes7.setText("Yes");
        group7.add(yes7);
        p1.add(yes7);
        yes7.setBounds(40, 794, 49, 31);
        yes7.setBackground(new Color(240, 255, 255));

        no7.setFont(new Font("Serif", 0, 16)); 
        no7.setText("No");
        group7.add(no7);
        p1.add(no7);
        no7.setBounds(107, 794, 45, 31);
        no7.setBackground(new Color(240, 255, 255));

        l20.setFont(new Font("Serif", 0, 16)); 
        l20.setText("8.");
        p1.add(l20);
        l20.setBounds(10, 843, 12, 22);

        l21.setFont(new Font("Serif", 0, 16)); 
        l21.setText("Has drinking ever created problems between you and a near relative or close friend?");
        p1.add(l21);
        l21.setBounds(40, 843, 507, 22);

        yes8.setFont(new Font("Serif", 0, 16)); 
        yes8.setText("Yes");
        group8.add(yes8);
        p1.add(yes8);
        yes8.setBounds(40, 883, 49, 31);
        yes8.setBackground(new Color(240, 255, 255));

        no8.setFont(new Font("Serif", 0, 16)); 
        no8.setText("No");
        group8.add(no8);
        p1.add(no8);
        no8.setBounds(107, 883, 45, 31);
        no8.setBackground(new Color(240, 255, 255));

        l22.setFont(new Font("Serif", 0, 16)); 
        l22.setText("9.");
        p1.add(l22);
        l22.setBounds(10, 932, 12, 22);

        l23.setFont(new Font("Serif", 0, 16)); 
        l23.setText("Has any family member or close friend gone to anyone for help about your drinking?");
        p1.add(l23);
        l23.setBounds(40, 932, 505, 22);

        yes9.setFont(new Font("Serif", 0, 16)); 
        yes9.setText("Yes");
        group9.add(yes9);
        p1.add(yes9);
        yes9.setBounds(40, 972, 49, 31);
        yes9.setBackground(new Color(240, 255, 255));

        no9.setFont(new Font("Serif", 0, 16));
        no9.setText("No");
        group9.add(no9);
        p1.add(no9);
        no9.setBounds(107, 972, 45, 31);
        no9.setBackground(new Color(240, 255, 255));

        l24.setFont(new Font("Serif", 0, 16)); 
        l24.setText("10.");
        p1.add(l24);
        l24.setBounds(10, 1021, 20, 22);

        l25.setFont(new Font("Serif", 0, 16)); 
        l25.setText("Have you ever lost friends because of your drinking?");
        p1.add(l25);
        l25.setBounds(48, 1021, 316, 22);

        yes10.setFont(new Font("Serif", 0, 16));
        yes10.setText("Yes");
        group10.add(yes10);
        p1.add(yes10);
        yes10.setBounds(48, 1061, 49, 31);
        yes10.setBackground(new Color(240, 255, 255));

        no10.setFont(new Font("Serif", 0, 16)); 
        no10.setText("No");
        group10.add(no10);
        p1.add(no10);
        no10.setBounds(115, 1061, 45, 31);
        no10.setBackground(new Color(240, 255, 255));

        l26.setFont(new Font("Serif", 0, 16)); 
        l26.setText("11.");
        p1.add(l26);
        l26.setBounds(10, 1110, 20, 22);

        l27.setFont(new Font("Serif", 0, 16)); 
        l27.setText("12.");
        p1.add(l27);
        l27.setBounds(10, 1199, 20, 22);

        yes11.setFont(new Font("Serif", 0, 16)); 
        yes11.setText("Yes");
        group11.add(yes11);
        p1.add(yes11);
        yes11.setBounds(48, 1150, 49, 31);
        yes11.setBackground(new Color(240, 255, 255));

        no11.setFont(new Font("Serif", 0, 16)); 
        no11.setText("No");
        group11.add(no11);
        p1.add(no11);
        no11.setBounds(115, 1150, 45, 31);
        no11.setBackground(new Color(240, 255, 255));

        l28.setFont(new Font("Serif", 0, 16));
        l28.setText("Have you ever gotten into trouble at work because of drinking?");
        p1.add(l28);
        l28.setBounds(48, 1110, 380, 22);

        l29.setFont(new Font("Serif", 0, 16)); 
        l29.setText("Have you ever lost a job because of drinking?");
        p1.add(l29);
        l29.setBounds(48, 1199, 276, 22);

        yes12.setFont(new Font("Serif", 0, 16)); 
        yes12.setText("Yes");
        group12.add(yes12);
        p1.add(yes12);
        yes12.setBounds(48, 1239, 49, 31);
        yes12.setBackground(new Color(240, 255, 255));

        no12.setFont(new Font("Serif", 0, 16)); 
        no12.setText("No");
        group12.add(no12);
        p1.add(no12);
        no12.setBounds(115, 1239, 45, 31);
        no12.setBackground(new Color(240, 255, 255));

        l30.setFont(new Font("Serif", 0, 16)); 
        l30.setText("13.");
        p1.add(l30);
        l30.setBounds(10, 1288, 20, 22);

        l31.setFont(new Font("Serif", 0, 16));
        l31.setText("Have you ever neglected your obligations, your family, or your work for two or more days in a row because you were drinking?");
        p1.add(l31);
        l31.setBounds(48, 1288, 767, 22);

        yes13.setFont(new Font("Serif", 0, 16)); 
        yes13.setText("Yes");
        group13.add(yes13);
        p1.add(yes13);
        yes13.setBounds(48, 1328, 49, 31);
        yes13.setBackground(new Color(240, 255, 255));

        no13.setFont(new Font("Serif", 0, 16)); 
        no13.setText("No");
        group13.add(no13);
        p1.add(no13);
        no13.setBounds(115, 1328, 45, 31);
        no13.setBackground(new Color(240, 255, 255));

        l32.setFont(new Font("Serif", 0, 16)); 
        l32.setText("14.");
        p1.add(l32);
        l32.setBounds(10, 1377, 20, 22);

        l33.setFont(new Font("Serif", 0, 16)); 
        l33.setText("Do you drink before noon fairly often?");
        p1.add(l33);
        l33.setBounds(48, 1377, 231, 22);

        yes14.setFont(new Font("Serif", 0, 16)); 
        yes14.setText("Yes");
        group14.add(yes14);
        p1.add(yes14);
        yes14.setBounds(48, 1417, 49, 31);
        yes14.setBackground(new Color(240, 255, 255));

        no14.setFont(new Font("Serif", 0, 16)); 
        no14.setText("No");
        group14.add(no14);
        p1.add(no14);
        no14.setBounds(115, 1417, 45, 31);
        no14.setBackground(new Color(240, 255, 255));

        l34.setFont(new Font("Serif", 0, 16)); 
        l34.setText("15.");
        p1.add(l34);
        l34.setBounds(10, 1466, 20, 22);

        l35.setFont(new Font("Serif", 0, 16));
        l35.setText("Have you ever been told you have liver trouble such as cirrhosis?");
        p1.add(l35);
        l35.setBounds(48, 1466, 390, 22);

        no15.setFont(new Font("Serif", 0, 16));
        no15.setText("No");
        group15.add(no15);
        p1.add(no15);
        no15.setBounds(115, 1506, 45, 31);
        no15.setBackground(new Color(240, 255, 255));

        yes15.setFont(new Font("Serif", 0, 16)); 
        yes15.setText("Yes");
        group15.add(yes15);
        p1.add(yes15);
        yes15.setBounds(48, 1506, 49, 31);
        yes15.setBackground(new Color(240, 255, 255));

        l36.setFont(new Font("Serif", 0, 16)); 
        l36.setText("16.");
        p1.add(l36);
        l36.setBounds(10, 1555, 20, 22);

        l37.setFont(new Font("Serif", 0, 16)); 
        l37.setText("After heavy drinking have you ever had delirium tremens (D.T.’s), severe shaking, visual or auditory (hearing) hallucinations?");
        p1.add(l37);
        l37.setBounds(48, 1555, 745, 22);

        yes16.setFont(new Font("Serif", 0, 16)); 
        yes16.setText("Yes");
        group16.add(yes16);
        p1.add(yes16);
        yes16.setBounds(48, 1595, 49, 31);
        yes16.setBackground(new Color(240, 255, 255));

        no16.setFont(new Font("Serif", 0, 16)); 
        no16.setText("No");
        group16.add(no16);
        p1.add(no16);
        no16.setBounds(115, 1595, 45, 31);
        no16.setBackground(new Color(240, 255, 255));

        l38.setFont(new Font("Serif", 0, 16)); 
        l38.setText("17.");
        p1.add(l38);
        l38.setBounds(10, 1644, 20, 22);

        l39.setFont(new Font("Serif", 0, 16)); 
        l39.setText("Have you ever gone to anyone for help about your drinking?");
        p1.add(l39);
        l39.setBounds(48, 1644, 362, 22);

        no17.setFont(new Font("Serif", 0, 16)); 
        no17.setText("No");
        group17.add(no17);
        p1.add(no17);
        no17.setBounds(115, 1684, 45, 31);
        no17.setBackground(new Color(240, 255, 255));

        yes17.setFont(new Font("Serif", 0, 16)); 
        yes17.setText("Yes");
        group17.add(yes17);
        p1.add(yes17);
        yes17.setBounds(48, 1684, 49, 31);
        yes17.setBackground(new Color(240, 255, 255));

        l40.setFont(new Font("Serif", 0, 16)); 
        l40.setText("18.");
        p1.add(l40);
        l40.setBounds(10, 1733, 20, 22);

        l41.setFont(new Font("Serif", 0, 16)); 
        l41.setText("Have you ever been hospitalized because of drinking?");
        p1.add(l41);
        l41.setBounds(48, 1733, 323, 22);

        yes18.setFont(new Font("Serif", 0, 16)); 
        yes18.setText("Yes");
        group18.add(yes18);
        p1.add(yes18);
        yes18.setBounds(48, 1773, 49, 31);
        yes18.setBackground(new Color(240, 255, 255));

        no18.setFont(new Font("Serif", 0, 16)); 
        no18.setText("No");
        group18.add(no18);
        p1.add(no18);
        no18.setBounds(115, 1773, 45, 31);
        no18.setBackground(new Color(240, 255, 255));

        l42.setFont(new Font("Serif", 0, 16)); 
        l42.setText("19.");
        p1.add(l42);
        l42.setBounds(10, 1822, 20, 22);

        l43.setFont(new Font("Serif", 0, 16)); 
        l43.setText("Has your drinking ever resulted in your being hospitalized in a psychiatric ward?");
        p1.add(l43);
        l43.setBounds(48, 1822, 478, 22);

        yes19.setFont(new Font("Serif", 0, 16)); 
        yes19.setText("Yes");
        group19.add(yes19);
        p1.add(yes19);
        yes19.setBounds(48, 1862, 49, 31);
        yes19.setBackground(new Color(240, 255, 255));

        no19.setFont(new Font("Serif", 0, 16)); 
        no19.setText("No");
        group19.add(no19);
        p1.add(no19);
        no19.setBounds(115, 1862, 45, 31);
        no19.setBackground(new Color(240, 255, 255));

        l44.setFont(new Font("Serif", 0, 16)); 
        l44.setText("20.");
        p1.add(l44);
        l44.setBounds(10, 1911, 20, 22);

        l45.setFont(new Font("Serif", 0, 16)); 
        l45.setText("Have you ever gone to any doctor, social worker, clergyman or mental health clinic for help with any emotional problem in which drinking was part of the problem?");
        p1.add(l45);
        l45.setBounds(48, 1911, 978, 22);

        no20.setFont(new Font("Serif", 0, 16)); 
        no20.setText("No");
        group20.add(no20);
        p1.add(no20);
        no20.setBounds(115, 1951, 45, 31);
        no20.setBackground(new Color(240, 255, 255));

        yes20.setFont(new Font("Serif", 0, 16)); 
        yes20.setText("Yes");
        group20.add(yes20);
        p1.add(yes20);
        yes20.setBounds(48, 1951, 49, 31);
        yes20.setBackground(new Color(240, 255, 255));

        l46.setFont(new Font("Serif", 0, 16)); 
        l46.setText("21.");
        p1.add(l46);
        l46.setBounds(10, 2000, 20, 22);

        l47.setFont(new Font("Serif", 0, 16)); 
        l47.setText("Have you been arrested more than once for driving under the influence of alcohol?");
        p1.add(l47);
        l47.setBounds(48, 2000, 492, 22);

        no21.setFont(new Font("Serif", 0, 16)); 
        no21.setText("No");
        group21.add(no21);
        p1.add(no21);
        no21.setBounds(115, 2040, 45, 31);
        no21.setBackground(new Color(240, 255, 255));

        yes21.setFont(new Font("Serif", 0, 16)); 
        yes21.setText("Yes");
        group21.add(yes21);
        p1.add(yes21);
        yes21.setBounds(48, 2040, 49, 31);
        yes21.setBackground(new Color(240, 255, 255));

        l48.setFont(new Font("Serif", 0, 16)); 
        l48.setText("22.");
        p1.add(l48);
        l48.setBounds(10, 2089, 20, 22);

        l49.setFont(new Font("Serif", 0, 16)); 
        l49.setText("Have you ever been arrested, even for a few hours, because of other behavior while drinking?");
        p1.add(l49);
        l49.setBounds(48, 2089, 563, 22);

        no22.setFont(new Font("Serif", 0, 16)); 
        no22.setText("No");
        group22.add(no22);
        p1.add(no22);
        no22.setBounds(115, 2129, 45, 31);
        no22.setBackground(new Color(240, 255, 255));

        yes22.setFont(new Font("Serif", 0, 16)); 
        yes22.setText("Yes");
        group22.add(yes22);
        p1.add(yes22);
        yes22.setBounds(48, 2129, 49, 31);
        yes22.setBackground(new Color(240, 255, 255));

        cmdscore1.setFont(new Font("Serif", 0, 16)); 
        cmdscore1.setText("Get Score");
        cmdscore1.addActionListener(this);
        p1.add(cmdscore1);
        cmdscore1.setBounds(48, 2196, 120, 31);

        cmdclear1.setFont(new Font("Serif", 0, 16)); 
        cmdclear1.setText("Clear Form");
        cmdclear1.addActionListener(this);
        p1.add(cmdclear1);
        cmdclear1.setBounds(181, 2196, 125, 31);
        
        cmdsubmit.setFont(new Font("Serif", 0, 16)); 
        cmdsubmit.setText("Submit");
        cmdsubmit.addActionListener(this);
        p1.add(cmdsubmit);
        cmdsubmit.setBounds(381, 2196, 100, 31);
        
        s1.setViewportView(p1);
         
        URL icon = this.getClass().getClassLoader().getResource("test.jpg");
        ImageIcon ic = new ImageIcon(icon);
        setIconImage(ic.getImage());
        
        getContentPane().add(s1);

    }

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == cmdscore1) {
            MAST.this.cmdscore1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear1) {
            MAST.this.cmdclear1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit) {
            MAST.this.cmdsubmitActionPerformed(evt);
        }
    }
    
    public void focusGained(java.awt.event.FocusEvent evt) {
    }

    public void focusLost(java.awt.event.FocusEvent evt) {
        if (evt.getSource() == txtbirthdate) {
            MAST.this.txtbirthdateFocusLost(evt);
        }
    }
    
    public void windowActivated(java.awt.event.WindowEvent evt) {
    }

    public void windowClosed(java.awt.event.WindowEvent evt) {
    }

    public void windowClosing(java.awt.event.WindowEvent evt) {
    }

    public void windowDeactivated(java.awt.event.WindowEvent evt) {
    }

    public void windowDeiconified(java.awt.event.WindowEvent evt) {
    }

    public void windowIconified(java.awt.event.WindowEvent evt) {
    }

    public void windowOpened(java.awt.event.WindowEvent evt) {
        if (evt.getSource() == MAST.this) {
            try {
                MAST.this.formWindowOpened(evt);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MAST.class.getName()).log(Level.SEVERE, null, ex);
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
        }catch (Exception e){}
    }

    public void cmdscore1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (no1.isSelected()){
            t1 = 1;
        }
        if (yes1.isSelected()){
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
        if (yes5.isSelected()){
            t5 = 1;
        }
        if (no5.isSelected()){
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
        if (yes21.isSelected()){
            t21 = 1;
        }
        if (no21.isSelected()){
            d21 = 0; 
        }
        if (yes22.isSelected()){
            t22 = 1;
        }
        if (no22.isSelected()){
            d22 = 0; 
        }
        sum = 0;    
        
        int v[] = {t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22};                                   
        for ( i = 0; i < v.length; i++){       
        sum += v[i];        
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
        t21=0;
        t22=0;
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
        group21.clearSelection();
        group22.clearSelection();
    }
    
    public void cmdsubmitActionPerformed(java.awt.event.ActionEvent evt) {
        String sql = "insert into mast (Name, Birth_Date, Test_Date, Test_Score) values(?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname.getText());
            pst.setString(2, txtbirthdate.getText());
            pst.setString(3, txttestdate.getText());
            pst.setString(4, txttestscore.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Submitted to Database");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }

}
