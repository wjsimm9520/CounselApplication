package counselorapplication;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.*;
import net.proteanit.sql.DbUtils;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.net.URL;
import java.io.*;
import java.util.logging.*;
import javax.imageio.*;


class BasicDemographics extends JFrame implements ActionListener, WindowListener, FocusListener, MouseListener {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String s, sx, s1, ca, ca2, c, f, Child, Drug;
    
    public int currentCard = 1;
    public JPanel cardPanel;
    public CardLayout cl;
    public JPanel buttonPanel;
    public JButton cmdsubmit;
    public JButton cmdclearform1;
    public JButton cmdnext1;
    public JButton cmdclear;
    public JButton cmdprevious;
    public JTextField txtcasenumber2;
    public JCheckBox checkalcohol;
    public JCheckBox checkamphetamine;
    public JCheckBox checkbarbiturates;
    public JCheckBox checkcocaine;
    public JCheckBox checkhashish;
    public JCheckBox checkheroin;
    public JCheckBox checkinhalants;
    public JCheckBox checklsd;
    public JCheckBox checkmarijuana;
    public JCheckBox checkotherdrug;
    public JCheckBox checkovercounter;
    public JCheckBox checkpcp;
    public JTextField txtagealcoholfirst;
    public JTextField txtagedrugfirst;
    public JTextField txtageregularalcohol;
    public JTextField txtageregulardrug;
    public JTextField txtbirthdate2;
    public JTextField txtdrugfreebabies;
    public JTextField txttodaysdate;
    public JTextField txtname1;
    public JTextField txtotherdrug;
    public JTextArea txtexplainconvictions;
    public JTextField txtothereducation;
    public JTextArea txtsourcesincome;
    public JComboBox boxchildren;
    public JComboBox boxconvictionamount;
    public JComboBox boxdrugabuse;
    public JComboBox boxeducation;
    public JComboBox boxethnicity;
    public JComboBox boxgender;
    public JComboBox boxmental;
    public JComboBox boxpriorconvictions;
    public JComboBox boxparentsrights;
    public JCheckBox checkeighthchild1;
    public JCheckBox checkeighthchild2;
    public JCheckBox checkeighthchild3;
    public JCheckBox checkeighthchild4;
    public JCheckBox checkfifthchild1;
    public JCheckBox checkfifthchild2;
    public JCheckBox checkfifthchild3;
    public JCheckBox checkfifthchild4;
    public JCheckBox checkfirstchild1;
    public JCheckBox checkfirstchild2;
    public JCheckBox checkfirstchild3;
    public JCheckBox checkfirstchild4;
    public JCheckBox checkfourthchild1;
    public JCheckBox checkfourthchild2;
    public JCheckBox checkfourthchild3;
    public JCheckBox checkfourthchild4;
    public JCheckBox checksecondchild1;
    public JCheckBox checksecondchild2;
    public JCheckBox checksecondchild3;
    public JCheckBox checksecondchild4;
    public JCheckBox checkseventhchild1;
    public JCheckBox checkseventhchild2;
    public JCheckBox checkseventhchild3;
    public JCheckBox checkseventhchild4;
    public JCheckBox checksixthchild1;
    public JCheckBox checksixthchild2;
    public JCheckBox checksixthchild3;
    public JCheckBox checksixthchild4;
    public JCheckBox checkthirdchild1;
    public JCheckBox checkthirdchild2;
    public JCheckBox checkthirdchild3;
    public JCheckBox checkthirdchild4;
    public JPanel p1;
    public JPanel p2;
    public JScrollPane s2;
    public JScrollPane s7;
    public JScrollPane s8;
    
    public BasicDemographics() {
        
        ImageIcon icon = new ImageIcon("path_to_icon");
        
        cardPanel = new JPanel();
        cl = new CardLayout();
        cardPanel.setLayout(cl);
        buttonPanel = new JPanel();
        s2 = new JScrollPane();        
        p1 = new JPanel();
        txtageregularalcohol = new JTextField();
        JLabel label23 = new JLabel();
        JLabel label32 = new JLabel();
        JLabel label33 = new JLabel();
        JLabel label34 = new JLabel();
        JLabel label35 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label1 = new JLabel();
        JLabel jlabel1 = new JLabel();
        JLabel label6 = new JLabel();
        checkheroin = new JCheckBox();
        JLabel label5 = new JLabel();
        txtbirthdate2 = new JTextField();
        JLabel label4 = new JLabel();
        txtname1 = new JTextField();
        txtcasenumber2 = new JTextField();
        JLabel label3 = new JLabel();
        JLabel label7 = new JLabel();
        checkcocaine = new JCheckBox();
        checkmarijuana = new JCheckBox();
        JLabel label11 = new JLabel();
        checkhashish = new JCheckBox();
        JLabel label12 = new JLabel();
        checkamphetamine = new JCheckBox();
        JLabel label9 = new JLabel();
        checkbarbiturates = new JCheckBox();
        JLabel label10 = new JLabel();
        checklsd = new JCheckBox();
        JLabel label8 = new JLabel();
        JLabel label15 = new JLabel();
        checkovercounter = new JCheckBox();
        JLabel label14 = new JLabel();
        checkinhalants = new JCheckBox();
        JLabel label16 = new JLabel();
        txtotherdrug = new JTextField();
        checkalcohol = new JCheckBox();
        checkotherdrug = new JCheckBox();
        checkpcp = new JCheckBox();
        JLabel label13 = new JLabel();
        txtageregulardrug = new JTextField();
        JLabel label19 = new JLabel();
        txtagealcoholfirst = new JTextField();
        JLabel label17 = new JLabel();
        JLabel label18 = new JLabel();
        txtagedrugfirst = new JTextField();
        txtdrugfreebabies = new JTextField();
        txttodaysdate = new JTextField();
        boxmental = new JComboBox();
        boxdrugabuse = new JComboBox();
        cmdnext1 = new JButton();
        cmdclear = new JButton();
        cmdprevious = new JButton();
        
        setTitle("Basic Demographics");
        setMinimumSize(new Dimension(650, 650));
        setPreferredSize(new Dimension(650, 650));
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        addWindowListener(this);

        s2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        s2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        p1.setMinimumSize(new Dimension(1200, 1100));
        p1.setPreferredSize(new Dimension(1200, 1100));
        p1.setBackground(new Color(240, 255, 255));
        p1.setLayout(null);

        label1.setFont(new Font("Serif", Font.BOLD, 16));
        label1.setText("Basic Demographics");
        label1.setName("label1");
        p1.add(label1);
        label1.setBounds(20, 20, 200, 25);
        
        jlabel1.setFont(new Font("Serif", 0, 16));
        jlabel1.setText("Today's Date:");
        p1.add(jlabel1);
        jlabel1.setBounds(20, 60, 150, 25);
        
        txttodaysdate.setFont(new Font("Serif", 0, 14));
        p1.add(txttodaysdate);
        txttodaysdate.setBounds(150, 60, 200, 30);

        label5.setFont(new Font("Serif", 0, 16)); 
        label5.setText("Case Number:");
        label5.setName("label5");
        p1.add(label5);
        label5.setBounds(20, 100, 100, 20);

        txtcasenumber2.setFont(new Font("Serif", 0, 14)); 
        txtcasenumber2.setName("txtcasenumber2");
        txtcasenumber2.addFocusListener(this);
        p1.add(txtcasenumber2);
        txtcasenumber2.setBounds(150, 100, 200, 30);

        label2.setFont(new Font("Serif", 0, 16)); 
        label2.setText("Name (Full name):");
        label2.setName("label2");
        p1.add(label2);
        label2.setBounds(20, 140, 120, 20);

        txtname1.setFont(new Font("Serif", 0, 14)); 
        txtname1.setName("txtname1");
        p1.add(txtname1);
        txtname1.setBounds(150, 140, 200, 30);

        label3.setFont(new Font("Serif", 0, 16)); 
        label3.setText("Date of Birth:");
        label3.setName("label3");
        p1.add(label3);
        label3.setBounds(20, 180, 100, 20);

        label4.setFont(new Font("Serif", 0, 14)); 
        label4.setText("(Ex: YearMonthDay 1970-11-25)");
        label4.setName("label4");
        p1.add(label4);
        label4.setBounds(20, 220, 300, 20);

        txtbirthdate2.setFont(new Font("Serif", 0, 14)); 
        txtbirthdate2.setName("txtbirthdate2");
        txtbirthdate2.addFocusListener(this);
        p1.add(txtbirthdate2);
        txtbirthdate2.setBounds(150, 180, 200, 30);

        label6.setFont(new Font("Serif", 0, 16)); 
        label6.setText("What drugs have you used in the past? Check all that apply!");
        label6.setName("label6");
        p1.add(label6);
        label6.setBounds(20, 260, 380, 20);

        checkheroin.setFont(new Font("Serif", 0, 16)); 
        checkheroin.setText("Heroin");
        checkheroin.setName("checkheroin");
        p1.add(checkheroin);
        checkheroin.setBounds(20, 300, 70, 20);
        checkheroin.setBackground(new Color(240, 255, 255));

        label7.setFont(new Font("Serif", 0, 16)); 
        label7.setText("(smack, brown sugar, dope, horse, junk)");
        label7.setName("label7");
        p1.add(label7);
        label7.setBounds(90, 300, 300, 20);

        checkcocaine.setFont(new Font("Serif", 0, 16)); 
        checkcocaine.setText("Cocaine");
        checkcocaine.setName("checkcocaine");
        p1.add(checkcocaine);
        checkcocaine.setBounds(20, 340, 75, 31);
        checkcocaine.setBackground(new Color(240, 255, 255));

        label8.setFont(new Font("Serif", 0, 16)); 
        label8.setText("(crack, rock, blow, coke, candy, charlie)");
        label8.setName("label8");
        p1.add(label8);
        label8.setBounds(105, 340, 300, 30);

        checkamphetamine.setFont(new Font("Serif", 0, 16)); 
        checkamphetamine.setText("Amphetamine");
        checkamphetamine.setName("checkamphetamine");
        p1.add(checkamphetamine);
        checkamphetamine.setBounds(20, 380, 110, 31);
        checkamphetamine.setBackground(new Color(240, 255, 255));

        label9.setFont(new Font("Serif", 0, 16)); 
        label9.setText("(meth, speed, LA turnaround, bennies)");
        label9.setName("label9");
        p1.add(label9);
        label9.setBounds(135, 380, 250, 30);

        checkbarbiturates.setFont(new Font("Serif", 0, 16)); 
        checkbarbiturates.setText("Barbiturates");
        checkbarbiturates.setName("checkbarbiturates");
        p1.add(checkbarbiturates);
        checkbarbiturates.setBounds(20, 420, 100, 31);
        checkbarbiturates.setBackground(new Color(240, 255, 255));

        label10.setFont(new Font("Serif", 0, 16)); 
        label10.setText("(Xanax, Valium) /Tranquilizers (whompers)");
        label10.setName("label10");
        p1.add(label10);
        label10.setBounds(125, 420, 270, 30);

        checkmarijuana.setFont(new Font("Serif", 0, 16)); 
        checkmarijuana.setText("Marijuana");
        checkmarijuana.setName("checkmarijuana");
        p1.add(checkmarijuana);
        checkmarijuana.setBounds(20, 460, 95, 31);
        checkmarijuana.setBackground(new Color(240, 255, 255));

        label11.setFont(new Font("Serif", 0, 16)); 
        label11.setText("(weed, pot, ganja, grass)");
        label11.setName("label11");
        p1.add(label11);
        label11.setBounds(115, 460, 200, 30);

        checkhashish.setFont(new Font("Serif", 0, 16)); 
        checkhashish.setText("Hashish");
        checkhashish.setName("checkhashish");
        p1.add(checkhashish);
        checkhashish.setBounds(20, 500, 80, 31);
        checkhashish.setBackground(new Color(240, 255, 255));

        label12.setFont(new Font("Serif", 0, 16)); 
        label12.setText("(boom, chronic, ganster, hemp)");
        label12.setName("label12");
        p1.add(label12);
        label12.setBounds(103, 500, 200, 30);

        checklsd.setFont(new Font("Serif", 0, 16)); 
        checklsd.setText("LSD");
        checklsd.setName("checklsd");
        p1.add(checklsd);
        checklsd.setBounds(20, 540, 60, 31);
        checklsd.setBackground(new Color(240, 255, 255));

        label13.setFont(new Font("Serif", 0, 16)); 
        label13.setText("(acid, blotter, boomers, cubes, yellow sunshine)");
        label13.setName("label13");
        p1.add(label13);
        label13.setBounds(80, 540, 300, 30);

        checkpcp.setFont(new Font("Serif", 0, 16)); 
        checkpcp.setText("PCP and Analogs");
        checkpcp.setName("checkpcp");
        p1.add(checkpcp);
        checkpcp.setBounds(20, 580, 135, 31);
        checkpcp.setBackground(new Color(240, 255, 255));

        label14.setFont(new Font("Serif", 0, 16)); 
        label14.setText("(angel dust, peace pill, love boat)");
        label14.setName("label14");
        p1.add(label14);
        label14.setBounds(155, 580, 200, 30);

        checkinhalants.setFont(new Font("Serif", 0, 16)); 
        checkinhalants.setText("Inhalants");
        checkinhalants.setName("checkinhalants");
        p1.add(checkinhalants);
        checkinhalants.setBounds(20, 620, 80, 31);
        checkinhalants.setBackground(new Color(240, 255, 255));

        label15.setFont(new Font("Serif", 0, 16)); 
        label15.setText("(gasoline, poppers, snappers, paint thinners,  glue)");
        label15.setName("label15");
        p1.add(label15);
        label15.setBounds(105, 620, 350, 30);

        checkovercounter.setFont(new Font("Serif", 0, 16)); 
        checkovercounter.setText("Over the counter drugs");
        checkovercounter.setName("checkovercounter");
        p1.add(checkovercounter);
        checkovercounter.setBounds(20, 660, 200, 30);
        checkovercounter.setBackground(new Color(240, 255, 255));

        checkalcohol.setFont(new Font("Serif", 0, 16)); 
        checkalcohol.setText("Alcohol");
        checkalcohol.setName("checkalcohol");
        p1.add(checkalcohol);
        checkalcohol.setBounds(20, 700, 100, 31);
        checkalcohol.setBackground(new Color(240, 255, 255));

        checkotherdrug.setFont(new Font("Serif", 0, 16)); 
        checkotherdrug.setText("Other");
        checkotherdrug.setName("checkotherdrug");
        p1.add(checkotherdrug);
        checkotherdrug.setBounds(20, 740, 60, 31);
        checkotherdrug.setBackground(new Color(240, 255, 255));

        label16.setFont(new Font("Serif", 0, 16)); 
        label16.setText("Please Specify:");
        label16.setName("label16");
        p1.add(label16);
        label16.setBounds(85, 740, 100, 30);

        txtotherdrug.setFont(new Font("Serif", 0, 14)); 
        txtotherdrug.setName("txtotherdrug");
        p1.add(txtotherdrug);
        txtotherdrug.setBounds(190, 740, 200, 30);

        label17.setFont(new Font("Serif", 0, 16)); 
        label17.setText("How old were you the first time you tried drugs?:");
        label17.setName("label17");
        p1.add(label17);
        label17.setBounds(20, 780, 300, 20);
        
        txtagedrugfirst.setFont(new Font("Serif", 0, 14)); 
        txtagedrugfirst.setName("txtagedrugfirst");
        p1.add(txtagedrugfirst);
        txtagedrugfirst.setBounds(400, 780, 200, 30);

        label18.setFont(new Font("Serif", 0, 16)); 
        label18.setText("At what age did you start using drugs regularly?:");
        label18.setName("label18");
        p1.add(label18);
        label18.setBounds(20, 820, 300, 20);
        
        txtageregulardrug.setFont(new Font("Serif", 0, 14)); 
        txtageregulardrug.setName("txtageregulardrug");
        p1.add(txtageregulardrug);
        txtageregulardrug.setBounds(400, 820, 200, 30);

        label19.setFont(new Font("Serif", 0, 16)); 
        label19.setText("How old were you the first time you tried alcohol?:");
        label19.setName("label19");
        p1.add(label19);
        label19.setBounds(20, 860, 350, 20);

        txtagealcoholfirst.setFont(new Font("Serif", 0, 14)); 
        txtagealcoholfirst.setName("txtagealcoholfirst");
        p1.add(txtagealcoholfirst);
        txtagealcoholfirst.setBounds(400, 860, 200, 30);

        label23.setFont(new Font("Serif", 0, 16)); 
        label23.setText("At what age did you start using alcohol regularly?:");
        label23.setName("label23");
        p1.add(label23);
        label23.setBounds(20, 900, 300, 20);

        txtageregularalcohol.setFont(new Font("Serif", 0, 14)); 
        txtageregularalcohol.setName("txtageregularalcohol");
        p1.add(txtageregularalcohol);
        txtageregularalcohol.setBounds(400, 900, 200, 30);

        label32.setFont(new Font("Serif", 0, 16)); 
        label32.setText("Have you received prior treatment for mental health?:");
        p1.add(label32);
        label32.setBounds(20, 940, 400, 20);
        
        boxmental.setFont(new Font("Serif", 0, 14)); 
        boxmental.setMaximumRowCount(2);
        boxmental.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes"}));
        p1.add(boxmental);
        boxmental.setBounds(400, 939, 200, 25);
        
        label33.setFont(new Font("Serif", 0, 16)); 
        label33.setText("Have you received prior treatment for drug abuse?:");
        p1.add(label33);
        label33.setBounds(20, 980, 400, 20);
        
        boxdrugabuse.setFont(new Font("Serif", 0, 14)); 
        boxdrugabuse.setMaximumRowCount(2);
        boxdrugabuse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes"}));
        p1.add(boxdrugabuse);
        boxdrugabuse.setBounds(400, 979, 200, 25);
        
        label34.setFont(new Font("Serif", 0, 16)); 
        label34.setText("Will you be giving birth to a drug free during the program?:");
        p1.add(label34);
        label34.setBounds(20, 1020, 400, 20);
        
        label35.setFont(new Font("Serif", 0, 16)); 
        label35.setText("If so how many?:");
        p1.add(label35);
        label35.setBounds(20, 1040, 200, 20);
        
        txtdrugfreebabies.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtdrugfreebabies);
        txtdrugfreebabies.setBounds(400, 1020, 200, 30);
        
        buttonPanel.setBackground(new Color(240, 255, 255));
        
        cmdprevious.setFont(new Font("Serif", 0, 14)); 
        cmdprevious.setText("Previous");
        cmdprevious.setName("cmdprevious");
        cmdprevious.addActionListener(this);
        buttonPanel.add(cmdprevious);
        
        cmdnext1.setFont(new Font("Serif", 0, 14)); 
        cmdnext1.setText("Next");
        cmdnext1.setName("cmdnext1");
        cmdnext1.addActionListener(this);
        buttonPanel.add(cmdnext1);

        cmdclear.setFont(new Font("Serif", 0, 14)); 
        cmdclear.setText("Clear Form");
        cmdclear.setName("cmdclear");
        cmdclear.addActionListener(this);
        p1.add(cmdclear);
        cmdclear.setBounds(780, 990, 98, 43);
        
        p2 = new JPanel();
        checksecondchild4 = new JCheckBox();
        checksecondchild3 = new JCheckBox();
        checksecondchild2 = new JCheckBox();
        checksecondchild1 = new JCheckBox();
        checkfirstchild3 = new JCheckBox();
        checkfirstchild4 = new JCheckBox();
        checkfirstchild1 = new JCheckBox();
        checkfirstchild2 = new JCheckBox();
        checkfifthchild2 = new JCheckBox();
        checkfourthchild3 = new JCheckBox();
        checkfourthchild2 = new JCheckBox();
        checkfifthchild1 = new JCheckBox();
        checkfourthchild4 = new JCheckBox();
        checkthirdchild2 = new JCheckBox();
        checkthirdchild3 = new JCheckBox();
        checkthirdchild4 = new JCheckBox();
        checkfourthchild1 = new JCheckBox();
        checkthirdchild1 = new JCheckBox();
        checkseventhchild4 = new JCheckBox();
        checkseventhchild3 = new JCheckBox();
        checkseventhchild2 = new JCheckBox();
        checkseventhchild1 = new JCheckBox();
        checkfifthchild3 = new JCheckBox();
        checkfifthchild4 = new JCheckBox();
        checksixthchild3 = new JCheckBox();
        checksixthchild4 = new JCheckBox();
        checksixthchild1 = new JCheckBox();
        checksixthchild2 = new JCheckBox();
        JLabel l26 = new JLabel();
        boxethnicity = new JComboBox();
        boxeducation = new JComboBox();
        checkeighthchild1 = new JCheckBox();
        checkeighthchild2 = new JCheckBox();
        checkeighthchild3 = new JCheckBox();
        checkeighthchild4 = new JCheckBox();
        JLabel l24 = new JLabel();
        boxgender = new JComboBox();
        JLabel l25 = new JLabel();
        s7 = new JScrollPane();
        txtsourcesincome = new JTextArea();
        boxpriorconvictions = new JComboBox();
        JLabel l30 = new JLabel();
        txtothereducation = new JTextField();
        JLabel l27 = new JLabel();
        JLabel l29 = new JLabel();
        JLabel l28 = new JLabel();
        JLabel l31 = new JLabel();
        s8 = new JScrollPane();
        txtexplainconvictions = new JTextArea();
        JLabel l20 = new JLabel();
        boxchildren = new JComboBox();
        JLabel l21 = new JLabel();
        JLabel l22 = new JLabel();
        boxconvictionamount = new JComboBox();
        boxparentsrights = new JComboBox();
        JLabel l32 = new JLabel();
        JLabel l33 = new JLabel();
        JLabel l34 = new JLabel();
        cmdsubmit = new JButton();
        JLabel l1 = new JLabel();
        cmdclearform1 = new JButton();

        p2.setMinimumSize(new Dimension(900, 900));
        p2.setPreferredSize(new Dimension(900, 900));
        p2.setBackground(new Color(240, 255, 255));
        p2.setLayout(null);

        l1.setFont(new Font("Serif", Font.BOLD, 16)); 
        l1.setText("Basic Demographics Part 2");
        p2.add(l1);
        l1.setBounds(10, 11, 250, 22);

        l20.setFont(new Font("Serif", 0, 16));
        l20.setText("Do you have children?:");
        p2.add(l20);
        l20.setBounds(10, 42, 138, 22);

        boxchildren.setFont(new Font("Serif", 0, 14)); 
        boxchildren.setMaximumRowCount(3);
        boxchildren.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p2.add(boxchildren);
        boxchildren.setBounds(166, 41, 155, 25);

        l21.setFont(new Font("Serif", 0, 16)); 
        l21.setText("If yes, for each child please check their age!");
        p2.add(l21);
        l21.setBounds(10, 76, 264, 22);

        l22.setFont(new Font("Serif", 0, 16)); 
        l22.setText("Age of Child");
        p2.add(l22);
        l22.setBounds(179, 116, 77, 22);

        checkfirstchild1.setFont(new Font("Serif", 0, 16)); 
        checkfirstchild1.setText("First Child 0-5 years");
        p2.add(checkfirstchild1);
        checkfirstchild1.addMouseListener(this);
        checkfirstchild1.setBounds(10, 140, 151, 31);
        checkfirstchild1.setBackground(new Color(240, 255, 255));

        checkfirstchild2.setFont(new Font("Serif", 0, 16)); 
        checkfirstchild2.setText("First Child 6-14 years");
        p2.add(checkfirstchild2);
        checkfirstchild2.addMouseListener(this);
        checkfirstchild2.setBounds(211, 140, 159, 31);
        checkfirstchild2.setBackground(new Color(240, 255, 255));

        checkfirstchild3.setFont(new Font("Serif", 0, 16)); 
        checkfirstchild3.setText("First Child 15-17 years");
        p2.add(checkfirstchild3);
        checkfirstchild3.addMouseListener(this);
        checkfirstchild3.setBounds(430, 140, 167, 31);
        checkfirstchild3.setBackground(new Color(240, 255, 255));

        checkfirstchild4.setFont(new Font("Serif", 0, 16)); 
        checkfirstchild4.setText("First Child 18 and older");
        p2.add(checkfirstchild4);
        checkfirstchild4.addMouseListener(this);
        checkfirstchild4.setBounds(646, 140, 169, 31);
        checkfirstchild4.setBackground(new Color(240, 255, 255));

        checksecondchild1.setFont(new Font("Serif", 0, 16)); 
        checksecondchild1.setText("Second Child 0-5 years");
        p2.add(checksecondchild1);
        checksecondchild1.addMouseListener(this);
        checksecondchild1.setBounds(10, 174, 169, 31);
        checksecondchild1.setBackground(new Color(240, 255, 255));

        checksecondchild2.setFont(new Font("Serif", 0, 16)); 
        checksecondchild2.setText("Second Child 6-14 years");
        p2.add(checksecondchild2);
        checksecondchild2.addMouseListener(this);
        checksecondchild2.setBounds(211, 174, 177, 31);
        checksecondchild2.setBackground(new Color(240, 255, 255));

        checksecondchild3.setFont(new Font("Serif", 0, 16)); 
        checksecondchild3.setText("Second Child 15-17 years");
        p2.add(checksecondchild3);
        checksecondchild3.addMouseListener(this);
        checksecondchild3.setBounds(430, 174, 185, 31);
        checksecondchild3.setBackground(new Color(240, 255, 255));

        checksecondchild4.setFont(new Font("Serif", 0, 16)); 
        checksecondchild4.setText("Second Child 18 and older");
        p2.add(checksecondchild4);
        checksecondchild4.addMouseListener(this);
        checksecondchild4.setBounds(646, 174, 189, 31);
        checksecondchild4.setBackground(new Color(240, 255, 255));

        checkthirdchild1.setFont(new Font("Serif", 0, 16)); 
        checkthirdchild1.setText("Third Child 0-5 years");
        p2.add(checkthirdchild1);
        checkthirdchild1.addMouseListener(this);
        checkthirdchild1.setBounds(10, 208, 155, 31);
        checkthirdchild1.setBackground(new Color(240, 255, 255));

        checkthirdchild2.setFont(new Font("Serif", 0, 16)); 
        checkthirdchild2.setText("Third Child 6-14 years");
        p2.add(checkthirdchild2);
        checkthirdchild2.addMouseListener(this);
        checkthirdchild2.setBounds(211, 208, 170, 31);
        checkthirdchild2.setBackground(new Color(240, 255, 255));

        checkthirdchild3.setFont(new Font("Serif", 0, 16)); 
        checkthirdchild3.setText("Third Child 15-17 years");
        p2.add(checkthirdchild3);
        checkthirdchild3.addMouseListener(this);
        checkthirdchild3.setBounds(430, 208, 175, 31);
        checkthirdchild3.setBackground(new Color(240, 255, 255));

        checkthirdchild4.setFont(new Font("Serif", 0, 16)); 
        checkthirdchild4.setText("Third Child 18 and older");
        p2.add(checkthirdchild4);
        checkthirdchild4.addMouseListener(this);
        checkthirdchild4.setBounds(646, 208, 185, 31);
        checkthirdchild4.setBackground(new Color(240, 255, 255));

        checkfourthchild1.setFont(new Font("Serif", 0, 16)); 
        checkfourthchild1.setText("Fourth Child 0-5 years");
        p2.add(checkfourthchild1);
        checkfourthchild1.addMouseListener(this);
        checkfourthchild1.setBounds(10, 242, 163, 31);
        checkfourthchild1.setBackground(new Color(240, 255, 255));

        checkfourthchild2.setFont(new Font("Serif", 0, 16)); 
        checkfourthchild2.setText("Fourth Child 6-14 years");
        p2.add(checkfourthchild2);
        checkfourthchild2.addMouseListener(this);
        checkfourthchild2.setBounds(211, 242, 171, 31);
        checkfourthchild2.setBackground(new Color(240, 255, 255));

        checkfourthchild3.setFont(new Font("Serif", 0, 16)); 
        checkfourthchild3.setText("Fourth Child 15-17 years");
        p2.add(checkfourthchild3);
        checkfourthchild3.addMouseListener(this);
        checkfourthchild3.setBounds(430, 242, 179, 31);
        checkfourthchild3.setBackground(new Color(240, 255, 255));

        checkfourthchild4.setFont(new Font("Serif", 0, 16)); 
        checkfourthchild4.setText("Fourth Child 18 and older");
        p2.add(checkfourthchild4);
        checkfourthchild4.addMouseListener(this);
        checkfourthchild4.setBounds(646, 242, 183, 31);
        checkfourthchild4.setBackground(new Color(240, 255, 255));

        checkfifthchild1.setFont(new Font("Serif", 0, 16)); 
        checkfifthchild1.setText("Fifth Child 0-5 years");
        p2.add(checkfifthchild1);
        checkfifthchild1.addMouseListener(this);
        checkfifthchild1.setBounds(10, 276, 151, 31);
        checkfifthchild1.setBackground(new Color(240, 255, 255));

        checkfifthchild2.setFont(new Font("Serif", 0, 16)); 
        checkfifthchild2.setText("Fifth Child 6-14 years");
        p2.add(checkfifthchild2);
        checkfifthchild2.addMouseListener(this);
        checkfifthchild2.setBounds(211, 276, 159, 31);
        checkfifthchild2.setBackground(new Color(240, 255, 255));

        checkfifthchild3.setFont(new Font("Serif", 0, 16)); 
        checkfifthchild3.setText("Fifth Child 15-17 years");
        p2.add(checkfifthchild3);
        checkfifthchild3.addMouseListener(this);
        checkfifthchild3.setBounds(430, 276, 167, 31);
        checkfifthchild3.setBackground(new Color(240, 255, 255));

        checkfifthchild4.setFont(new Font("Serif", 0, 16)); 
        checkfifthchild4.setText("Fifth Child 18 and older");
        p2.add(checkfifthchild4);
        checkfifthchild4.addMouseListener(this);
        checkfifthchild4.setBounds(646, 276, 169, 31);
        checkfifthchild4.setBackground(new Color(240, 255, 255));

        checksixthchild1.setFont(new Font("Serif", 0, 16)); 
        checksixthchild1.setText("Sixth Child 0-5 years");
        p2.add(checksixthchild1);
        checksixthchild1.addMouseListener(this);
        checksixthchild1.setBounds(10, 310, 153, 31);
        checksixthchild1.setBackground(new Color(240, 255, 255));

        checksixthchild2.setFont(new Font("Serif", 0, 16)); 
        checksixthchild2.setText("Sixth Child 6-14 years");
        p2.add(checksixthchild2);
        checksixthchild2.addMouseListener(this);
        checksixthchild2.setBounds(211, 310, 161, 31);
        checksixthchild2.setBackground(new Color(240, 255, 255));
        
        checksixthchild3.setFont(new Font("Serif", 0, 16)); 
        checksixthchild3.setText("Sixth Child 15-17 years");
        p2.add(checksixthchild3);
        checksixthchild3.addMouseListener(this);
        checksixthchild3.setBounds(430, 310, 169, 31);
        checksixthchild3.setBackground(new Color(240, 255, 255));

        checksixthchild4.setFont(new Font("Serif", 0, 16)); 
        checksixthchild4.setText("Sixth Child 18 and older");
        p2.add(checksixthchild4);
        checksixthchild4.addMouseListener(this);
        checksixthchild4.setBounds(646, 310, 173, 31);
        checksixthchild4.setBackground(new Color(240, 255, 255));

        checkseventhchild1.setFont(new Font("Serif", 0, 16)); 
        checkseventhchild1.setText("Seventh Child 0-5 years");
        p2.add(checkseventhchild1);
        checkseventhchild1.addMouseListener(this);
        checkseventhchild1.setBounds(10, 344, 171, 31);
        checkseventhchild1.setBackground(new Color(240, 255, 255));

        checkseventhchild2.setFont(new Font("Serif", 0, 16)); 
        checkseventhchild2.setText("Seventh Child 6-14 years");
        p2.add(checkseventhchild2);
        checkseventhchild2.addMouseListener(this);
        checkseventhchild2.setBounds(211, 344, 179, 31);
        checkseventhchild2.setBackground(new Color(240, 255, 255));

        checkseventhchild3.setFont(new Font("Serif", 0, 16)); 
        checkseventhchild3.setText("Seventh Child 15-17 years");
        p2.add(checkseventhchild3);
        checkseventhchild3.addMouseListener(this);
        checkseventhchild3.setBounds(430, 344, 187, 31);
        checkseventhchild3.setBackground(new Color(240, 255, 255));

        checkseventhchild4.setFont(new Font("Serif", 0, 16)); 
        checkseventhchild4.setText("Seventh Child 18 and older");
        p2.add(checkseventhchild4);
        checkseventhchild4.addMouseListener(this);
        checkseventhchild4.setBounds(646, 344, 191, 31);
        checkseventhchild4.setBackground(new Color(240, 255, 255));

        checkeighthchild1.setFont(new Font("Serif", 0, 16)); 
        checkeighthchild1.setText("Eighth Child 0-5 years");
        p2.add(checkeighthchild1);
        checkeighthchild1.addMouseListener(this);
        checkeighthchild1.setBounds(10, 378, 161, 31);
        checkeighthchild1.setBackground(new Color(240, 255, 255));

        checkeighthchild2.setFont(new Font("Serif", 0, 16)); 
        checkeighthchild2.setText("Eighth Child 6-14 years");
        p2.add(checkeighthchild2);
        checkeighthchild2.addMouseListener(this);
        checkeighthchild2.setBounds(211, 378, 169, 31);
        checkeighthchild2.setBackground(new Color(240, 255, 255));

        checkeighthchild3.setFont(new Font("Serif", 0, 16)); 
        checkeighthchild3.setText("Eighth Child 15-17 years");
        p2.add(checkeighthchild3);
        checkeighthchild3.addMouseListener(this);
        checkeighthchild3.setBounds(430, 378, 177, 31);
        checkeighthchild3.setBackground(new Color(240, 255, 255));

        checkeighthchild4.setFont(new Font("Serif", 0, 16)); 
        checkeighthchild4.setText("Eighth Child 18 and older");
        p2.add(checkeighthchild4);
        checkeighthchild4.addMouseListener(this);
        checkeighthchild4.setBounds(646, 378, 179, 31);
        checkeighthchild4.setBackground(new Color(240, 255, 255));

        l24.setFont(new Font("Serif", 0, 16)); 
        l24.setText("What is your gender?:");
        p2.add(l24);
        l24.setBounds(10, 428, 132, 22);

        boxgender.setFont(new Font("Serif", 0, 14)); 
        boxgender.setMaximumRowCount(4);
        boxgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        p2.add(boxgender);
        boxgender.setBounds(211, 427, 187, 25);

        l25.setFont(new Font("Serif", 0, 16)); 
        l25.setText("Please specify your Ethnicity:");
        p2.add(l25);
        l25.setBounds(10, 471, 174, 22);
        
        boxethnicity.setFont(new Font("Serif", 0, 14)); 
        boxethnicity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hispanic/Latino", "American Indian", "Asian", "Black/African American", "White/Caucasian", "Other" }));
        p2.add(boxethnicity);
        boxethnicity.setBounds(211, 470, 184, 25);

        p2.add(s7);
        s7.setBounds(430, 592, 247, 67);
        
        l26.setFont(new Font("Serif", 0, 16)); 
        l26.setText("What is the highest degree of formal education you have obtained?:");
        p2.add(l26);
        l26.setBounds(10, 514, 402, 22);

        boxeducation.setFont(new Font("Serif", 0, 14)); 
        boxeducation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Elementary", "Middle-Junior High", "Some High School no Diploma", "High School Diploma or Equivalent", "Some College no Degree", "Associate Degree", "Bachelor Degree", "Graduate or Professional Degree", "Certificate Program", "Other" }));
        p2.add(boxeducation);
        boxeducation.setBounds(430, 513, 247, 25);

        txtothereducation.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtothereducation);
        txtothereducation.setBounds(430, 549, 247, 25);

        l27.setFont(new Font("Serif", 0, 16));
        l27.setText("Other Education Please Specify:");
        p2.add(l27);
        l27.setBounds(71, 550, 194, 22);

        l28.setFont(new Font("Serif", 0, 16));
        l28.setText("How much income did you have from wages, tips, and any other");
        p2.add(l28);
        l28.setBounds(10, 592, 387, 22);

        l29.setFont(new Font("Serif", 0, 16)); 
        l29.setText("sources last month (Ex: family support, alimony, & food stamps)?:");
        p2.add(l29);
        l29.setBounds(10, 620, 395, 22);

        txtsourcesincome.setColumns(20);
        txtsourcesincome.setRows(5);
        s7.setViewportView(txtsourcesincome);
        txtsourcesincome.setLineWrap(true);
        txtsourcesincome.setWrapStyleWord(true);

        l30.setFont(new Font("Serif", 0, 16)); 
        l30.setText("Do you have any proir convictions?:");
        p2.add(l30);
        l30.setBounds(10, 677, 216, 22);

        boxpriorconvictions.setFont(new Font("Serif", 0, 14)); 
        boxpriorconvictions.setMaximumRowCount(3);
        boxpriorconvictions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes" }));
        p2.add(boxpriorconvictions);
        boxpriorconvictions.setBounds(430, 676, 132, 25);

        l31.setFont(new Font("Serif", 0, 16)); 
        l31.setText("If yes, Please Briefly Explain:");
        p2.add(l31);
        l31.setBounds(68, 712, 174, 22);

        txtexplainconvictions.setColumns(20);
        txtexplainconvictions.setRows(5);
        s8.setViewportView(txtexplainconvictions);
        txtexplainconvictions.setLineWrap(true);
        txtexplainconvictions.setWrapStyleWord(true);

        p2.add(s8);
        s8.setBounds(430, 712, 247, 67);

        l32.setFont(new Font("Serif", 0, 16)); 
        l32.setText("If you have prior convictions, how many have you had?:");
        p2.add(l32);
        l32.setBounds(10, 798, 335, 22);

        boxconvictionamount.setFont(new Font("Serif", 0, 14)); 
        boxconvictionamount.setMaximumRowCount(7);
        boxconvictionamount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "more than 4" }));
        p2.add(boxconvictionamount);
        boxconvictionamount.setBounds(430, 797, 130, 25);
        
        l33.setFont(new Font("Serif", 0, 16)); 
        l33.setText("Were your parental rights terminated prior to program");
        p2.add(l33);
        l33.setBounds(10, 841, 335, 22);
        
        l34.setFont(new Font("Serif", 0, 16)); 
        l34.setText("participation?:");
        p2.add(l34);
        l34.setBounds(10, 861, 100, 22);

        boxparentsrights.setFont(new Font("Serif", 0, 14)); 
        boxparentsrights.setMaximumRowCount(3);
        boxparentsrights.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes"}));
        p2.add(boxparentsrights);
        boxparentsrights.setBounds(430, 850, 130, 25);

        cmdsubmit.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit.setText("Submit");
        cmdsubmit.addActionListener(this);
        p2.add(cmdsubmit);
        cmdsubmit.setBounds(1049, 860, 100, 43);

        cmdclearform1.setFont(new Font("Serif", 0, 14)); 
        cmdclearform1.setText("Clear Form");
        cmdclearform1.addActionListener(this);
        p2.add(cmdclearform1);
        cmdclearform1.setBounds(882, 860, 98, 43);

        s2.setViewportView(cardPanel);
        cardPanel.add(p1, "1");
        cardPanel.add(p2, "2");
        
        URL icon1 = this.getClass().getClassLoader().getResource("demographics.jpg");
        ImageIcon ic = new ImageIcon(icon1);
        setIconImage(ic.getImage());
        
        getContentPane().add(s2, BorderLayout.CENTER); 
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }


    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == cmdnext1) {
            BasicDemographics.this.cmdnext1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdprevious) {
            BasicDemographics.this.cmdpreviousActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear) {
            BasicDemographics.this.cmdclearActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit) {
            BasicDemographics.this.cmdsubmitActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclearform1) {
            BasicDemographics.this.cmdclearform1ActionPerformed(evt);
        }
    }

    public void focusGained(java.awt.event.FocusEvent evt) {
    }

    public void focusLost(java.awt.event.FocusEvent evt) {
        if (evt.getSource() == txtcasenumber2) {
            BasicDemographics.this.txtcasenumber2FocusLost(evt);
        }
        if (evt.getSource() == txtbirthdate2) {
            BasicDemographics.this.txtbirthdate2FocusLost(evt);
        }
    }
    
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == checkfirstchild1) {
            BasicDemographics.this.checkfirstchild1MouseClicked(evt);
        }
        else if (evt.getSource() == checkfirstchild2) {
            BasicDemographics.this.checkfirstchild2MouseClicked(evt);
        }
        else if (evt.getSource() == checkfirstchild3) {
            BasicDemographics.this.checkfirstchild3MouseClicked(evt);
        }
        else if (evt.getSource() == checkfirstchild4) {
            BasicDemographics.this.checkfirstchild4MouseClicked(evt);
        }
        else if (evt.getSource() == checksecondchild1) {
            BasicDemographics.this.checksecondchild1MouseClicked(evt);
        }
        else if (evt.getSource() == checksecondchild2) {
            BasicDemographics.this.checksecondchild2MouseClicked(evt);
        }
        else if (evt.getSource() == checksecondchild3) {
            BasicDemographics.this.checksecondchild3MouseClicked(evt);
        }
        else if (evt.getSource() == checksecondchild4) {
            BasicDemographics.this.checksecondchild4MouseClicked(evt);
        }
        else if (evt.getSource() == checkthirdchild1) {
            BasicDemographics.this.checkthirdchild1MouseClicked(evt);
        }
        else if (evt.getSource() == checkthirdchild2) {
            BasicDemographics.this.checkthirdchild2MouseClicked(evt);
        }
        else if (evt.getSource() == checkthirdchild3) {
            BasicDemographics.this.checkthirdchild3MouseClicked(evt);
        }
        else if (evt.getSource() == checkthirdchild4) {
            BasicDemographics.this.checkthirdchild4MouseClicked(evt);
        }
        else if (evt.getSource() == checkfourthchild1) {
            BasicDemographics.this.checkfourthchild1MouseClicked(evt);
        }
        else if (evt.getSource() == checkfourthchild2) {
            BasicDemographics.this.checkfourthchild2MouseClicked(evt);
        }
        else if (evt.getSource() == checkfourthchild3) {
            BasicDemographics.this.checkfourthchild3MouseClicked(evt);
        }
        else if (evt.getSource() == checkfourthchild4) {
            BasicDemographics.this.checkfourthchild4MouseClicked(evt);
        }
        else if (evt.getSource() == checkfifthchild1) {
            BasicDemographics.this.checkfifthchild1MouseClicked(evt);
        }
        else if (evt.getSource() == checkfifthchild2) {
            BasicDemographics.this.checkfifthchild2MouseClicked(evt);
        }
        else if (evt.getSource() == checkfifthchild3) {
            BasicDemographics.this.checkfifthchild3MouseClicked(evt);
        }
        else if (evt.getSource() == checkfifthchild4) {
            BasicDemographics.this.checkfifthchild4MouseClicked(evt);
        }
        else if (evt.getSource() == checksixthchild1) {
            BasicDemographics.this.checksixthchild1MouseClicked(evt);
        }
        else if (evt.getSource() == checksixthchild2) {
            BasicDemographics.this.checksixthchild2MouseClicked(evt);
        }
        else if (evt.getSource() == checksixthchild3) {
            BasicDemographics.this.checksixthchild3MouseClicked(evt);
        }
        else if (evt.getSource() == checksixthchild4) {
            BasicDemographics.this.checksixthchild4MouseClicked(evt);
        }
        else if (evt.getSource() == checkseventhchild1) {
            BasicDemographics.this.checkseventhchild1MouseClicked(evt);
        }
        else if (evt.getSource() == checkseventhchild2) {
            BasicDemographics.this.checkseventhchild2MouseClicked(evt);
        }
        else if (evt.getSource() == checkseventhchild3) {
            BasicDemographics.this.checkseventhchild3MouseClicked(evt);
        }
        else if (evt.getSource() == checkseventhchild4) {
            BasicDemographics.this.checkseventhchild4MouseClicked(evt);
        }
        else if (evt.getSource() == checkeighthchild1) {
            BasicDemographics.this.checkeighthchild1MouseClicked(evt);
        }
        else if (evt.getSource() == checkeighthchild2) {
            BasicDemographics.this.checkeighthchild2MouseClicked(evt);
        }
        else if (evt.getSource() == checkeighthchild3) {
            BasicDemographics.this.checkeighthchild3MouseClicked(evt);
        }
        else if (evt.getSource() == checkeighthchild4) {
            BasicDemographics.this.checkeighthchild4MouseClicked(evt);
        }
    }
    
    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    public void mouseReleased(java.awt.event.MouseEvent evt) {
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
        if (evt.getSource() == BasicDemographics.this) {
            try {
                BasicDemographics.this.formWindowOpened(evt);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BasicDemographics.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void cmdsubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Drug = "";
        if (checkamphetamine.isSelected()) {
            Drug = Drug + " " + checkamphetamine.getText();
        }
        if (checkbarbiturates.isSelected()) {
            Drug = Drug + " " + checkbarbiturates.getText();
        }
        if (checkmarijuana.isSelected()) {
            Drug = Drug + " " + checkmarijuana.getText();
        }
        if (checkhashish.isSelected()) {
            Drug = Drug + " " + checkhashish.getText();
        }
        if (checklsd.isSelected()) {
            Drug = Drug + " " + checklsd.getText();
        }
        if (checkpcp.isSelected()) {
            Drug = Drug + " " + checkpcp.getText();
        }
        if (checkinhalants.isSelected()) {
            Drug = Drug + " " + checkinhalants.getText();
        }
        if (checkovercounter.isSelected()) {
            Drug = Drug + " " + checkovercounter.getText();
        }
        if (checkalcohol.isSelected()) {
            Drug = Drug + " " + checkalcohol.getText();
        }
        if (checkotherdrug.isSelected()) {
            Drug = Drug + " " + checkotherdrug.getText();
        }
        if (checkheroin.isSelected()) {
            Drug = Drug + " " + checkheroin.getText();
        }
        if (checkcocaine.isSelected()) {
            Drug = Drug + " " + checkcocaine.getText();
        }
        Child = "";
        if (checkfirstchild1.isSelected()) {
            Child = Child + " " + checkfirstchild1.getText();
        }
        if (checkfirstchild2.isSelected()) {
            Child = Child + " " + checkfirstchild2.getText();
        }
        if (checkfirstchild3.isSelected()) {
            Child = Child + " " + checkfirstchild3.getText();
        }
        if (checkfirstchild4.isSelected()) {
            Child = Child + " " + checkfirstchild4.getText();
        }
        if (checksecondchild1.isSelected()) {
            Child = Child + " " + checksecondchild1.getText();
        }
        if (checksecondchild2.isSelected()) {
            Child = Child + " " + checksecondchild2.getText();
        }
        if (checksecondchild3.isSelected()) {
            Child = Child + " " + checksecondchild3.getText();
        }
        if (checksecondchild4.isSelected()) {
            Child = Child + " " + checksecondchild4.getText();
        }
        if (checkthirdchild1.isSelected()) {
            Child = Child + " " + checkthirdchild1.getText();
        }
        if (checkthirdchild2.isSelected()) {
            Child = Child + " " + checkthirdchild2.getText();
        }
        if (checkthirdchild3.isSelected()) {
            Child = Child + " " + checkthirdchild3.getText();
        }
        if (checkthirdchild4.isSelected()) {
            Child = Child + " " + checkthirdchild4.getText();
        }
        if (checkfourthchild1.isSelected()) {
            Child = Child + " " + checkfourthchild1.getText();
        }
        if (checkfourthchild2.isSelected()) {
            Child = Child + " " + checkfourthchild2.getText();
        }
        if (checkfourthchild3.isSelected()) {
            Child = Child + " " + checkfourthchild3.getText();
        }
        if (checkfourthchild4.isSelected()) {
            Child = Child + " " + checkfourthchild4.getText();
        }
        if (checkfifthchild1.isSelected()) {
            Child = Child + " " + checkfifthchild1.getText();
        }
        if (checkfifthchild2.isSelected()) {
            Child = Child + " " + checkfifthchild2.getText();
        }
        if (checkfifthchild3.isSelected()) {
            Child = Child + " " + checkfifthchild3.getText();
        }
        if (checkfifthchild4.isSelected()) {
            Child = Child + " " + checkfifthchild4.getText();
        }
        if (checksixthchild1.isSelected()) {
            Child = Child + " " + checksixthchild1.getText();
        }
        if (checksixthchild2.isSelected()) {
            Child = Child + " " + checksixthchild2.getText();
        }
        if (checksixthchild3.isSelected()) {
            Child = Child + " " + checksixthchild3.getText();
        }
        if (checksixthchild4.isSelected()) {
            Child = Child + " " + checksixthchild4.getText();
        }
        if (checkseventhchild1.isSelected()) {
            Child = Child + " " + checkseventhchild1.getText();
        }
        if (checkseventhchild2.isSelected()) {
            Child = Child + " " + checkseventhchild2.getText();
        }
        if (checkseventhchild3.isSelected()) {
            Child = Child + " " + checkseventhchild3.getText();
        }
        if (checkseventhchild4.isSelected()) {
            Child = Child + " " + checkseventhchild4.getText();
        }
        if (checkeighthchild1.isSelected()) {
            Child = Child + " " + checkeighthchild1.getText();
        }
        if (checkeighthchild2.isSelected()) {
            Child = Child + " " + checkeighthchild2.getText();
        }
        if (checkeighthchild3.isSelected()) {
            Child = Child + " " + checkeighthchild3.getText();
        }
        if (checkeighthchild4.isSelected()) {
            Child = Child + " " + checkeighthchild4.getText();
        }
        String Name1 = (String) boxchildren.getSelectedItem();
        String Name2 = (String) boxgender.getSelectedItem();
        String Name3 = (String) boxethnicity.getSelectedItem();
        String Name4 = (String) boxeducation.getSelectedItem();
        String Name5 = (String) boxpriorconvictions.getSelectedItem();
        String Name6 = (String) boxconvictionamount.getSelectedItem();
        String Name7 = (String) boxmental.getSelectedItem();
        String Name8 = (String) boxdrugabuse.getSelectedItem();
        String Name9 = (String) boxparentsrights.getSelectedItem();
        String sql = "insert into demographics (Entry_Date, Case_Number, Name, Birth_Date, Drugs_Used, Other_Drug, Age_Drug_First, Age_Regular_Drug, Age_Alcohol_First, Age_Regular_Alcohol, Mental_Treatment, Drug_Treatment, Drug_Free_Babies, Children, Age_of_Child, Gender, Ethnicity, Formal_Education, Other_Education, Sources_Income, Prior_Convictions, Explain_Convictions, Amount_Convictions, Parental_Rights_Taken) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txttodaysdate.getText());
            pst.setString(2, txtcasenumber2.getText());
            pst.setString(3, txtname1.getText());
            pst.setString(4, txtbirthdate2.getText());
            pst.setString(5, Drug.toString());
            pst.setString(6, txtotherdrug.getText());
            pst.setString(7, txtagedrugfirst.getText());
            pst.setString(8, txtageregulardrug.getText());
            pst.setString(9, txtagealcoholfirst.getText());
            pst.setString(10, txtageregularalcohol.getText());
            pst.setString(11, Name7.toString());
            pst.setString(12, Name8.toString());
            pst.setString(13, txtdrugfreebabies.getText());
            pst.setString(14, Name1.toString());
            pst.setString(15, Child.toString());
            pst.setString(16, Name2.toString());
            pst.setString(17, Name3.toString());
            pst.setString(18, Name4.toString());
            pst.setString(19, txtothereducation.getText());
            pst.setString(20, txtsourcesincome.getText());
            pst.setString(21, Name5.toString());
            pst.setString(22, txtexplainconvictions.getText());
            pst.setString(23, Name6.toString());
            pst.setString(24, Name9.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Changes Submitted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }                                         

    private void formWindowOpened(java.awt.event.WindowEvent evt) throws ClassNotFoundException {                                  
        conn = mysqlconnect.ConnectDb();
    }                                 

    private void cmdclearform1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        checkeighthchild1.setSelected(false);
        checkeighthchild2.setSelected(false);
        checkeighthchild3.setSelected(false);
        checkeighthchild4.setSelected(false);
        checkfifthchild1.setSelected(false);
        checkfifthchild2.setSelected(false);
        checkfifthchild3.setSelected(false);
        checkfifthchild4.setSelected(false);
        checkfirstchild1.setSelected(false);
        checkfirstchild2.setSelected(false);
        checkfirstchild3.setSelected(false);
        checkfirstchild4.setSelected(false);
        checkfourthchild1.setSelected(false);
        checkfourthchild2.setSelected(false);
        checkfourthchild3.setSelected(false);
        checkfourthchild4.setSelected(false);
        checksecondchild1.setSelected(false);
        checksecondchild2.setSelected(false);
        checksecondchild3.setSelected(false);
        checksecondchild4.setSelected(false);
        checkseventhchild1.setSelected(false);
        checkseventhchild2.setSelected(false);
        checkseventhchild3.setSelected(false);
        checkseventhchild4.setSelected(false);
        checksixthchild1.setSelected(false);
        checksixthchild2.setSelected(false);
        checksixthchild3.setSelected(false);
        checksixthchild4.setSelected(false);
        checkthirdchild1.setSelected(false);
        checkthirdchild2.setSelected(false);
        checkthirdchild3.setSelected(false);
        checkthirdchild4.setSelected(false);
        txtexplainconvictions.setText("");
        txtothereducation.setText("");
        txtsourcesincome.setText("");
        txtdrugfreebabies.setText("");       
    }                                            
                    

    private void cmdnext1ActionPerformed(java.awt.event.ActionEvent evt) {                                 
        if (currentCard < 2) {
          currentCard += 1;
          cl.show(cardPanel, "" + (currentCard));
        }
    } 
    
    private void cmdpreviousActionPerformed(java.awt.event.ActionEvent evt) {
        if (currentCard > 1) {
          currentCard -= 1;
          cl.show(cardPanel, "" + (currentCard));
        }
    }

    private void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {
        txttodaysdate.setText("");
        txtagealcoholfirst.setText("");
        txtagedrugfirst.setText("");
        txtageregularalcohol.setText("");
        txtageregulardrug.setText("");
        txtbirthdate2.setText("");
        txtcasenumber2.setText("");
        txtname1.setText("");
        txtotherdrug.setText("");
        checkalcohol.setSelected(false);
        checkamphetamine.setSelected(false);
        checkbarbiturates.setSelected(false);
        checkcocaine.setSelected(false);
        checkhashish.setSelected(false);
        checkheroin.setSelected(false);
        checkinhalants.setSelected(false);
        checklsd.setSelected(false);
        checkmarijuana.setSelected(false);
        checkotherdrug.setSelected(false);
        checkovercounter.setSelected(false);
        checkpcp.setSelected(false);
    }                                        

    private void txtcasenumber2FocusLost(java.awt.event.FocusEvent evt) {       
                                   
        c = txtcasenumber2.getText();
        String sql = "SELECT * FROM basic_information WHERE Case_Number = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtcasenumber2.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            s = rs.getString("Case_Number");
            }      
        }catch (SQLException e){} 
        try {
            if (c.equals(s)) { 
                 JOptionPane.showMessageDialog(null,"Case Number Found");
            }
            else {              
              JOptionPane.showMessageDialog(null,"Case Number Not Found");
            }            
        }catch (Exception e){}
    }  
    
    public void txtbirthdate2FocusLost(java.awt.event.FocusEvent evt) {       
                                   
        ca = txtname1.getText();
        ca2 = txtbirthdate2.getText();
        String sql = "SELECT * FROM basic_information WHERE Participants_Name = ? AND Date_of_Birth = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname1.getText());
            pst.setString(2, txtbirthdate2.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            s1 = rs.getString("Participants_Name");
            sx = rs.getString("Date_of_Birth");
            }      
        }catch (SQLException e){} 
        try {
            if ((ca.equals(s1))&&(ca2.equals(sx))) { 
                 JOptionPane.showMessageDialog(null,"Name & Birth Date Found");
            }
            else {              
              JOptionPane.showMessageDialog(null,"Name & Birth Date Not Found");
            }            
        }catch (Exception e){}
    }

    public void checkfirstchild1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfirstchild1.isSelected()){
        checkfirstchild2.setSelected(false);
        checkfirstchild3.setSelected(false);
        checkfirstchild4.setSelected(false);
        }
    }   
    
    public void checkfirstchild2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfirstchild2.isSelected()){
        checkfirstchild1.setSelected(false);
        checkfirstchild3.setSelected(false);
        checkfirstchild4.setSelected(false);
        }
    }   
    
    public void checkfirstchild3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfirstchild3.isSelected()){
        checkfirstchild1.setSelected(false);
        checkfirstchild2.setSelected(false);
        checkfirstchild4.setSelected(false);
        }
    }   
    
    public void checkfirstchild4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfirstchild4.isSelected()){
        checkfirstchild1.setSelected(false);
        checkfirstchild2.setSelected(false);
        checkfirstchild3.setSelected(false);
        }
    }   
    
    public void checksecondchild1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checksecondchild1.isSelected()){
        checksecondchild2.setSelected(false);
        checksecondchild3.setSelected(false);
        checksecondchild4.setSelected(false);
        }
    }   
    
    public void checksecondchild2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checksecondchild2.isSelected()){
        checksecondchild1.setSelected(false);
        checksecondchild3.setSelected(false);
        checksecondchild4.setSelected(false);
        }
    }   
    
    public void checksecondchild3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checksecondchild3.isSelected()){
        checksecondchild1.setSelected(false);
        checksecondchild2.setSelected(false);
        checksecondchild4.setSelected(false);
        }
    }   
    
    public void checksecondchild4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checksecondchild4.isSelected()){
        checksecondchild1.setSelected(false);
        checksecondchild2.setSelected(false);
        checksecondchild3.setSelected(false);
        }
    }   
    
    public void checkthirdchild1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkthirdchild1.isSelected()){
        checkthirdchild2.setSelected(false);
        checkthirdchild3.setSelected(false);
        checkthirdchild4.setSelected(false);
        }
    }   
    
    public void checkthirdchild2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkthirdchild2.isSelected()){
        checkthirdchild1.setSelected(false);
        checkthirdchild3.setSelected(false);
        checkthirdchild4.setSelected(false);
        }
    }   
    
    public void checkthirdchild3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkthirdchild3.isSelected()){
        checkthirdchild1.setSelected(false);
        checkthirdchild2.setSelected(false);
        checkthirdchild4.setSelected(false);
        }
    }   
    
    public void checkthirdchild4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkthirdchild4.isSelected()){
        checkthirdchild1.setSelected(false);
        checkthirdchild2.setSelected(false);
        checkthirdchild3.setSelected(false);
        }
    }   
    
    public void checkfourthchild1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfourthchild1.isSelected()){
        checkfourthchild2.setSelected(false);
        checkfourthchild3.setSelected(false);
        checkfourthchild4.setSelected(false);
        }
    }   
    
    public void checkfourthchild2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfourthchild2.isSelected()){
        checkfourthchild1.setSelected(false);
        checkfourthchild3.setSelected(false);
        checkfourthchild4.setSelected(false);
        }
    }   
    
    public void checkfourthchild3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfourthchild3.isSelected()){
        checkfourthchild1.setSelected(false);
        checkfourthchild2.setSelected(false);
        checkfourthchild4.setSelected(false);
        }
    }   
    
    public void checkfourthchild4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfourthchild4.isSelected()){
        checkfourthchild1.setSelected(false);
        checkfourthchild2.setSelected(false);
        checkfourthchild3.setSelected(false);
        }
    }   
    
    public void checkfifthchild1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfifthchild1.isSelected()){
        checkfifthchild2.setSelected(false);
        checkfifthchild3.setSelected(false);
        checkfifthchild4.setSelected(false);
        }
    }   
    
    public void checkfifthchild2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfifthchild2.isSelected()){
        checkfifthchild1.setSelected(false);
        checkfifthchild3.setSelected(false);
        checkfifthchild4.setSelected(false);
        }
    }   
    
    public void checkfifthchild3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfifthchild3.isSelected()){
        checkfifthchild1.setSelected(false);
        checkfifthchild2.setSelected(false);
        checkfifthchild4.setSelected(false);
        }
    }   
    
    public void checkfifthchild4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkfifthchild4.isSelected()){
        checkfifthchild1.setSelected(false);
        checkfifthchild2.setSelected(false);
        checkfifthchild3.setSelected(false);
        }
    }   
    
    public void checksixthchild1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checksixthchild1.isSelected()){
        checksixthchild2.setSelected(false);
        checksixthchild3.setSelected(false);
        checksixthchild4.setSelected(false);
        }
    }   
    
    public void checksixthchild2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checksixthchild2.isSelected()){
        checksixthchild1.setSelected(false);
        checksixthchild3.setSelected(false);
        checksixthchild4.setSelected(false);
        }
    }   
    
    public void checksixthchild3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checksixthchild3.isSelected()){
        checksixthchild1.setSelected(false);
        checksixthchild2.setSelected(false);
        checksixthchild4.setSelected(false);
        }
    }   
    
    public void checksixthchild4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checksixthchild4.isSelected()){
        checksixthchild1.setSelected(false);
        checksixthchild2.setSelected(false);
        checksixthchild3.setSelected(false);
        }
    }   
    
    public void checkseventhchild1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkseventhchild1.isSelected()){
        checkseventhchild2.setSelected(false);
        checkseventhchild3.setSelected(false);
        checkseventhchild4.setSelected(false);
        }
    }   
    
    public void checkseventhchild2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkseventhchild2.isSelected()){
        checkseventhchild1.setSelected(false);
        checkseventhchild3.setSelected(false);
        checkseventhchild4.setSelected(false);
        }
    }   
    
    public void checkseventhchild3MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkseventhchild3.isSelected()){
        checkseventhchild1.setSelected(false);
        checkseventhchild2.setSelected(false);
        checkseventhchild4.setSelected(false);
        }
    }   
    
    public void checkseventhchild4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkseventhchild4.isSelected()){
        checkseventhchild1.setSelected(false);
        checkseventhchild2.setSelected(false);
        checkseventhchild3.setSelected(false);
        }
    }   
    
    public void checkeighthchild1MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkeighthchild1.isSelected()){
        checkeighthchild2.setSelected(false);
        checkeighthchild3.setSelected(false);
        checkeighthchild4.setSelected(false);
        }
    }   
    
    public void checkeighthchild2MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkeighthchild2.isSelected()){
        checkeighthchild1.setSelected(false);
        checkeighthchild3.setSelected(false);
        checkeighthchild4.setSelected(false);
        }
    }   
    
    public void checkeighthchild3MouseClicked(java.awt.event.MouseEvent evt) {                                
       if (checkeighthchild3.isSelected()){
        checkeighthchild1.setSelected(false);
        checkeighthchild2.setSelected(false);
        checkeighthchild4.setSelected(false);
        }
    }   
    
    public void checkeighthchild4MouseClicked(java.awt.event.MouseEvent evt) {                                
        if (checkeighthchild4.isSelected()){
        checkeighthchild1.setSelected(false);
        checkeighthchild2.setSelected(false);
        checkeighthchild3.setSelected(false);
        }
    }   
       
}