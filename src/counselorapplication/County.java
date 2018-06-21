package counselorapplication;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.MouseListener;
import java.awt.event.FocusListener;
import java.net.URL;
import javax.swing.table.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.io.*;
import java.util.*;
import java.awt.print.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.Book;
import java.awt.datatransfer.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultEditorKit;

    public class County extends JFrame implements ActionListener, WindowListener, FocusListener, Printable, Serializable, MouseListener {
    
      Connection conn = null;
      ResultSet rs = null;
      PreparedStatement pst = null;
      String Drug;
      String Child;
      String Formal;
      String Informal;
      String caz, caz2, s, sx, caz1, caz21, sx1, sx2, z69, z70, printer, printer1;
      Graphics2D g; 
      
      public final static Cursor TEXT_CURSOR1 = new Cursor(Cursor.TEXT_CURSOR);
      public JFrame frame;
      public JFrame frame2;
      public JFrame frame3;
      public JFrame frame4;
      public JFrame frame5;
      public Formatter output;
      public JComboBox boxacceptance;
      public JComboBox boxdiploma;
      public JComboBox boxfees;
      public JComboBox boxjobsituation2;
      public JComboBox boxphase;
      public JComboBox boxscreeningresults;
      public JComboBox boxscreeningtypes;
      public JComboBox boxstep;
      public JComboBox boxquarterly;
      public JComboBox boxnumberasam;
      public JComboBox boxresidentialtreatment;
      public JButton cmdclearform1;
      public JButton cmdclearform2;
      public JButton cmdclear5;
      public JButton cmdclear6;
      public JButton cmdclear7;
      public JButton cmdclear8;
      public JButton cmddelete1;
      public JButton cmddelete2;
      public JButton cmddelete3;
      public JButton cmddelete4;
      public JButton cmddelete5;
      public JButton cmdrefresh1;
      public JButton cmdrefresh2;
      public JButton cmdrefresh3;
      public JButton cmdrefresh4;
      public JButton cmdrefresh5;
      public JButton cmdsubmit1;
      public JButton cmdsubmit2;
      public JButton cmdsubmit3;
      public JButton cmdsubmit4;
      public JButton cmdsubmit5;
      public JButton cmdsubmit6;
      public JButton cmdsearch1;
      public JButton cmdupdate1;
      public JButton cmdupdate2;
      public JButton cmdupdate3;
      public JButton cmdupdate4;
      public JButton cmdupdate5;
      public JButton bsubmit;
      public JButton bsubmit2;
      public JButton bsubmit3;
      public JButton bsubmit4;
      public JButton bsubmit5;
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
      public JLabel lb13;
      public JLabel lb14;
      public JLabel lb15;
      public JLabel lb16;
      public JLabel lb17;
      public JLabel lb18;
      public JLabel lb19;
      public JLabel lb20;
      public JLabel label1;
      public JLabel label2;
      public JLabel label3;
      public JLabel label4;
      public JLabel label5;
      public JLabel label6;
      public JLabel label7;
      public JLabel label8;
      public JLabel label9;
      public JLabel label10;
      public JLabel label11;
      public JLabel label12;
      public JLabel label13;
      public JLabel jlabel13;
      public JLabel label14;
      public JLabel label15;
      public JLabel label16;
      public JLabel label17;
      public JLabel jlabel17;
      public JLabel label18;
      public JLabel label19;    
      public JLabel label20;
      public JLabel jlabel20;
      public JLabel label21;
      public JLabel label22;
      public JLabel label23;
      public JLabel label24;
      public JLabel label25;
      public JLabel jlabel25;
      public JLabel label26;
      public JLabel jlabel26;
      public JLabel label27;
      public JLabel label28;
      public JLabel label29;     
      public JLabel label30;
      public JLabel jlabel30;
      public JLabel label31;
      public JLabel label32;
      public JLabel label33;
      public JLabel label34;
      public JLabel label35;
      public JLabel jlabel35;
      public JLabel label36;
      public JLabel label37;
      public JLabel jlabel36;
      public JLabel jlabel37;
      public JLabel label38;
      public JLabel label39;
      public JLabel label40;
      public JLabel label41;
      public JLabel label42;
      public JLabel label43;
      public JLabel label44;
      public JLabel label45;
      public JLabel label46;
      public JLabel label47;
      public JLabel label48;
      public JLabel label49;
      public JLabel label50;
      public JLabel label51;
      public JLabel label52;
      public JLabel label53;
      public JLabel label54;
      public JLabel label55;
      public JLabel label56;
      public JLabel label57;
      public JLabel label58;
      public JLabel label59;
      public JLabel label60;
      public JLabel label61;
      public JLabel label62;
      public JLabel label63;
      public JLabel label64;
      public JLabel label65;
      public JLabel label66;
      public JLabel label67;
      public JLabel label68;
      public JLabel label69;
      public JLabel label70;
      public JLabel label71;
      public JLabel label72;
      public JLabel label73;
      public JLabel label74;
      public JLabel label75;
      public JLabel label76;
      public JLabel label77;
      public JLabel label78;
      public JLabel label79;
      public JLabel label80;
      public JLabel label81;
      public JLabel label82;
      public JLabel label83;
      public JLabel label84;
      public JLabel label85;
      public JLabel label86;
      public JLabel label87;
      public JLabel label88;
      public JLabel label89;
      public JLabel label90;
      public JLabel label91;
      public JLabel label92;
      public JLabel label93;
      public JLabel label94;
      public JLabel label95;
      public JLabel label96;
      public JLabel label97;
      public JLabel label98;
      public JLabel label99;
      public JLabel label100;
      public JLabel label101;
      public JLabel label102;
      public JMenuBar menubar;
      public JMenu file;
      public JMenu edit;
      public JMenu tools;
      public JMenu help;
      public JMenuItem save;
      public JMenuItem print;
      public JMenuItem exit;
      public JMenuItem courtreview;
      public JMenuItem basicinformation;
      public JMenuItem weeklydata;
      public JMenuItem quarterlyreport;
      public JMenuItem postgraduation;
      public JMenuItem alltables;
      public JMenuItem htables;
      public JMenuItem hcourtreview;
      public JMenuItem hbasicinformation;
      public JMenuItem hweeklydata;
      public JMenuItem hquarterlyreport;
      public JMenuItem hpostgraduation;
      public JPanel p1;
      public JPanel p2;
      public JPanel p3;
      public JPanel p4;
      public JPanel p5;
      public JPanel p6;
      public JPanel p7;
      public JPanel p8;
      public JPanel p9;
      public JPanel p10;
      public JPanel p11;
      public JScrollPane s1;
      public JScrollPane s2;
      public JScrollPane s3;
      public JScrollPane s4;
      public JScrollPane s5;
      public JScrollPane s6;
      public JScrollPane s7;
      public JScrollPane s8;
      public JScrollPane s9;
      public JScrollPane s10;
      public JScrollPane s11;
      public JScrollPane s12;
      public JScrollPane s13;
      public JScrollPane s14;
      public JScrollPane s15;
      public JScrollPane s16;
      public JScrollPane s17;
      public JScrollPane s18;
      public JScrollPane s19;
      public JScrollPane s20;
      public JScrollPane s21;
      public JScrollPane s22;
      public JScrollPane s23;
      public JScrollPane s24;
      public JScrollPane s25;
      public JScrollPane s26;
      public JScrollPane s27;
      public JScrollPane s28;
      public JScrollPane s29;
      public JScrollPane s30;
      public JScrollPane s31;
      public JScrollPane s32;
      public JTabbedPane t1;
      public JTable ta1;
      public JTable ta2;
      public JTable ta3;
      public JTable ta4;
      public JTable ta5;
      public JTable ta6;
      public JTable ta7;
      public JTable ta8;
      public JTable ta9;
      public JTable ta10;
      public JTable ta11;
      public JTable ta12;
      public JTable ta13;
      public JTable ta14;
      public JTextArea txtaa;
      public JTextArea txtreason;
      public JTextArea txtarrestreason;
      public JTextArea txtcounselor;
      public JTextArea txtcourtsessions;
      public JTextArea txtdrugcourtattendance;
      public JTextArea txtna;
      public JTextArea txtnewcharges2;
      public JTextArea txtotherfees;
      public JTextArea txtreasononhold;
      public JTextArea txtreasonsanction;
      public JTextArea txtreasontermination;
      public JTextField tf1;
      public JTextField tf2;
      public JTextField tf3;
      public JTextField tf4;
      public JTextField tf5;
      public JTextField tf6;
      public JTextField tf7;
      public JTextField tf8;
      public JTextField tf9;
      public JTextField tf10;
      public JTextField txtaddress1;
      public JTextField txtage1;
      public JTextField txtbirthdate2;
      public JTextField txtbirthdate4;
      public JTextField txtbirthdate5;
      public JTextField txtterminationdate;
      public JTextField txtcasenumber1;
      public JTextField txtcasenumber2;
      public JTextField txtcontactname;
      public JTextField txtcourtdate;
      public JTextField txtdateofbirth;
      public JTextField txtdateofintake;
      public JTextField txtdatescreening;      
      public JTextField txtemployername;
      public JTextField txtemployerphone;
      public JTextField txtentrydate;
      public JTextField txtgraddate;
      public JTextField txtlegalcharge;      
      public JTextField txtname2;      
      public JTextField txtname4;
      public JTextField txtname5;
      public JTextField txtdate;  
      public JTextField txtdate2;
      public JTextField txtnumberreviewed;
      public JTextField txtnumberaccepted;
      public JTextField txtnumberrejected;
      public JTextField txtnumberdeclined;
      public JTextField txtoffensedate;      
      public JTextField txtfeeamount;
      public JTextField txtfeebalance;
      public JTextField txtparticipantsname1;
      public JTextField txtparticipantsnumber;
      public JTextField txtphonenumber1;
      public JTextField txtpositive;     
      public JTextField txtsanctionorder;
      public JTextField txttypesanction;
      public JTextField txttodaysdate;
      public JTextField txttodaysdate2;
      public JTextField txtquarterlydate;
      public JTextField txtnumberrejectedotherreasons;
      public JTextField txtnumberawol;
      public JTextField txtnumberterminated;
      public JTextField txtnumberdrugfreebabies;
      public JTextField txtnumberrigthsterminated;
      public JTextField txtnumbergeds;
      public JTextField txtstartwages;
      public JTextField txtendwages;
      public JTextField txtnumberasam;
      public JTextField txtnumberdrugscreen;
      public JTextField txtnumberurine;
      public JTextField txtnumberbreath;
      public JTextField txtnumbersaliva;
      public JTextField txtnumberhair;
      public JTextField txtnewcharges;
      public JTextField txtresidentialtreat;
      public JTextField txtmentalillness;
      public JTextField txtsubstanceabuse;
      public JTextField txtnumbergraduates;
      public JTextField txtcumulative1;
      public JTextField txtcumulative2;
      public JTextField txtreviewdate;
      private final static int POINTS_PER_INCH = 72;
      final Toolkit kit = Toolkit.getDefaultToolkit();
      final Clipboard clipboard = kit.getSystemClipboard();
    
    private void columnWidths(JTable jtable) {
        JTableHeader headers = jtable.getTableHeader();
        TableCellRenderer defaultHeaderRenderer = null;
        if (headers != null)
            defaultHeaderRenderer = headers.getDefaultRenderer();
        TableColumnModel columns = jtable.getColumnModel();
        TableModel values = jtable.getModel();
        int margin = columns.getColumnMargin();
        int rowCount = values.getRowCount();
        int totalWidth = 0;
        for (int i = columns.getColumnCount() - 1; i >= 0; --i){
            TableColumn column = columns.getColumn(i);
            int columnIndex = column.getModelIndex();
            int width = -1;
            TableCellRenderer h = column.getHeaderRenderer();
            if (h == null)
                h = defaultHeaderRenderer;
            if (h != null){
                Component c = h.getTableCellRendererComponent(jtable, column.getHeaderValue(), false, false, -1, i);width = c.getPreferredSize().width;
            }
            for (int row = rowCount - 1; row >= 0; --row){
                TableCellRenderer r = jtable.getCellRenderer(row, i);
                Component c = r.getTableCellRendererComponent(jtable, values.getValueAt(row, columnIndex), false, false,row, i);
                width = Math.max(width, c.getPreferredSize().width);
            }
            if (width >= 0)
                column.setPreferredWidth(width + margin);
            else
                totalWidth += column.getPreferredWidth();
        }
    }

    public County(String printDataIn)
    {
      this.printer = printDataIn;
    }

    @Override
    public int print(Graphics g, PageFormat pf,  int pageIndex) {
    
    Graphics2D g2d = (Graphics2D)g;
    int x = (int) pf.getImageableX();
    int y = (int) pf.getImageableY();        
    g2d.translate(x, y); 

    Font font = new Font("Serif", Font.PLAIN, 14);
    FontMetrics metrics = g.getFontMetrics(font);
    int lineHeight = metrics.getHeight();
    
    BufferedReader br = new BufferedReader(new StringReader(printer));    
    try
    {
        String line;
        x += -70;
        y += -100;
        while ((line = br.readLine()) != null)
        {
            y += lineHeight;
            g2d.drawString(line, x, y);
        }
    }
    catch (IOException e)
    {}    
    
    return Printable.PAGE_EXISTS;
    
    }
    
    private void UpdateJTable1() {
        String sql = "select Entry_Date, Case_Number, Date_of_Intake, Participants_Name, Date_of_Birth, Age, Address, Phone_Number, Legal_Charge, Employer_Name, Employer_Phone, Contact_Name, Residential_Treatment from basic_information order by Entry_Date desc";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta1.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void UpdateJTable2() {
        String sql = "select Entry_Date, Participant_Nmbr, Name, Birth_Date, Phase, Termin_Date, Termin, Grad_Date, Hold_N_Date, Last_Step_Cmplt, Fee_Balance, Fee_Amount, Fees_Paid, Fees_Other, Date_of_Offense, Reason_Sanction, Type_Sanction, Date_Exp_Sanction, Drug_Screen_Date, Screen_Types, Screen_Results, Drug_Found, Drug_Court_Atnd, NA_Atnd, AA_Atnd, Court_Ses_Atnd, New_Charges, Employment, Diploma_GED, Counselor_Comments  from weekly_data order by Entry_Date desc";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta2.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta2);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void UpdateJTable3() {
        String sql = "select Quarterly_Date, Quarterly_Period, Reviewed, Accepted, Rejected, Declined_Participate, Rejected_Other, AWOL, Termin, Drug_Free_Babies, Parental_Rights_Termin, GEDs_Received, Starting_Wages, Completion_Wages, ASAM_Level, Drug_Tests, Urine_Tests, Breath_Tests, Saliva_Tests, Hair_Tests, Residential_Treat, Prior_Mental_Treat, Prior_Substance_Abuse, Graduates  from quarterly_report order by Quarterly_Date desc";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta4.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta4);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void UpdateJTable4() {
        String sql = "select Entry_Date, Name, Birth_Date, New_Arrest, Reason  from post_graduation order by Entry_Date desc";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta6.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta6);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void UpdateJTable5() {
        String sql = "select Court_Appearance, Review_Date, Case_Number, Candidates_Name, Candidates_Birth_Date, Acceptance, Reason  from court_reviews order by Court_Appearance desc";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta7.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta7);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public County() {
 
        t1 = new JTabbedPane();
        s1 = new JScrollPane();
        menubar = new JMenuBar();
        file = new JMenu("   File   \n");
        edit = new JMenu("   Edit   \n");
        tools = new JMenu("   Tools   \n");
        help = new JMenu("   Help   \n");
        save = new JMenuItem("   Save     \n");
        print = new JMenuItem("   Print     \n");
        exit = new JMenuItem("   Exit     \n");
        courtreview = new JMenuItem("   Extract Court Reviews   \n");
        basicinformation = new JMenuItem("   Extract Basic Information   \n");
        weeklydata = new JMenuItem("   Extract Weekly Data   \n");
        quarterlyreport = new JMenuItem("   Extract Quarterly Report   \n");
        postgraduation = new JMenuItem("   Extract Post Graduation     \n");
        htables = new JMenuItem("   Help With Tables     \n");
        Action cutAction = new DefaultEditorKit.CutAction();
        String ep = "   Cut     ";
        cutAction.putValue(Action.NAME, ep);
        edit.add(cutAction);
        Action copyAction = new DefaultEditorKit.CopyAction();
        String ep1 = "   Copy     ";
        copyAction.putValue(Action.NAME, ep1);
        edit.add(copyAction);
        Action pasteAction = new DefaultEditorKit.PasteAction();
        String ep2 = "   Paste     ";
        pasteAction.putValue(Action.NAME, ep2);
        edit.add(pasteAction);
        
        output = new Formatter();
        p1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        jlabel13 = new JLabel();
        txtcasenumber1 = new JTextField();
        txtentrydate = new JTextField();
        txtdateofintake = new JTextField();
        txtparticipantsname1 = new JTextField();
        txtdateofbirth = new JTextField();
        txtage1 = new JTextField();
        txtphonenumber1 = new JTextField();
        txtaddress1 = new JTextField();
        txtlegalcharge = new JTextField();
        txtemployername = new JTextField();
        txtemployerphone = new JTextField();
        txtcontactname = new JTextField();
        boxresidentialtreatment = new JComboBox();
        cmdsubmit1 = new JButton();
        cmdsearch1 = new JButton();
        cmdclearform1 = new JButton();
        s3 = new JScrollPane();
        ta1 = new JTable();
        ta3 = new JTable();
        cmdrefresh1 = new JButton();
        cmdupdate1 = new JButton();
        cmddelete1 = new JButton();
        s2 = new JScrollPane();
        p2 = new JPanel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        jlabel17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        jlabel20 = new JLabel();
        label21 = new JLabel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label25 = new JLabel();
        jlabel25 = new JLabel();
        label26 = new JLabel();
        jlabel26 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label29 = new JLabel();
        label30 = new JLabel();
        jlabel30 = new JLabel();
        label31 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        label34 = new JLabel();
        label35 = new JLabel();
        jlabel35 = new JLabel();
        label36 = new JLabel();
        jlabel36 = new JLabel();
        jlabel37 = new JLabel();
        label38 = new JLabel();
        label39 = new JLabel();
        label40 = new JLabel();        
        txttodaysdate = new JTextField();
        txtparticipantsnumber = new JTextField();
        txtname2 = new JTextField();
        txtoffensedate = new JTextField();
        txtbirthdate2 = new JTextField();
        txtterminationdate = new JTextField();
        txtdate = new JTextField();
        txtnewcharges = new JTextField();
        txtdate2 = new JTextField();
        txtdatescreening = new JTextField();
        txttypesanction = new JTextField();
        txtgraddate = new JTextField();
        txtfeeamount = new JTextField();
        txtfeebalance = new JTextField();
        s4 = new JScrollPane();
        txtcourtsessions = new JTextArea();
        s5 = new JScrollPane();
        txtreasononhold = new JTextArea();
        s6 = new JScrollPane();
        txtreasontermination = new JTextArea();
        s7 = new JScrollPane();
        txtotherfees = new JTextArea();
        s8 = new JScrollPane();
        txtaa = new JTextArea();
        s9 = new JScrollPane();
        txtdrugcourtattendance = new JTextArea();
        s10 = new JScrollPane();
        txtcounselor = new JTextArea();
        s11 = new JScrollPane();
        txtreasonsanction = new JTextArea();
        boxphase = new JComboBox();
        boxstep = new JComboBox();
        boxfees = new JComboBox();
        boxdiploma = new JComboBox();
        boxjobsituation2 = new JComboBox();
        boxscreeningresults = new JComboBox();
        boxscreeningtypes = new JComboBox();
        txtsanctionorder = new JTextField();
        s12 = new JScrollPane();
        txtna = new JTextArea();
        s13 = new JScrollPane();
        ta2 = new JTable();
        cmdsubmit2 = new JButton();
        cmdclearform2 = new JButton();
        label37 = new JLabel();
        txtpositive = new JTextField();
        cmdrefresh2 = new JButton();
        cmdupdate2 = new JButton();
        cmddelete2 = new JButton();
        cmdclear5 = new JButton();
        s14 = new JScrollPane();
        s15 = new JScrollPane();
        p3 = new JPanel();
        s16 = new JScrollPane();
        p4 = new JPanel();
        cmdsubmit3 = new JButton();
        cmdsubmit4 = new JButton();
        cmdclear6 = new JButton();
        cmdrefresh3 = new JButton();
        cmdupdate3 = new JButton();
        cmddelete3 = new JButton();
        label41 = new JLabel();
        label42 = new JLabel();
        label43 = new JLabel();
        label44 = new JLabel();
        label45 = new JLabel();
        label46 = new JLabel();
        label47 = new JLabel();
        label48 = new JLabel();
        label49 = new JLabel();
        label50 = new JLabel();
        label51 = new JLabel();
        label52 = new JLabel();
        label53 = new JLabel();
        label54 = new JLabel();
        label55 = new JLabel();
        label56 = new JLabel();
        label57 = new JLabel();
        label58 = new JLabel();
        label59 = new JLabel();
        label60 = new JLabel();
        label61 = new JLabel();
        label62 = new JLabel();
        label63 = new JLabel();
        label64 = new JLabel();
        label65 = new JLabel();
        label66 = new JLabel();
        label67 = new JLabel();
        label68 = new JLabel();
        label69 = new JLabel();
        label70 = new JLabel();
        label71 = new JLabel();
        label72 = new JLabel();
        label73 = new JLabel();
        label74 = new JLabel();
        label75 = new JLabel();
        label76 = new JLabel();
        label77 = new JLabel();
        label78 = new JLabel();
        label79 = new JLabel();
        label80 = new JLabel();
        label81 = new JLabel();
        label82 = new JLabel();
        label83 = new JLabel();
        label84 = new JLabel();
        boxquarterly = new JComboBox();
        txtquarterlydate = new JTextField();
        txtnumberreviewed = new JTextField();
        txtnumberaccepted = new JTextField();
        txtnumberrejected = new JTextField();
        txtnumberdeclined = new JTextField();
        txtnumberrejectedotherreasons = new JTextField();
        txtnumberawol = new JTextField();
        txtnumberterminated = new JTextField();
        txtnumberdrugfreebabies = new JTextField();
        txtnumberrigthsterminated = new JTextField();
        txtnumbergeds = new JTextField();
        txtstartwages = new JTextField();
        txtendwages = new JTextField();
        boxnumberasam = new JComboBox();
        txtnumberdrugscreen = new JTextField();
        txtnumberurine = new JTextField();
        txtnumberbreath = new JTextField();
        txtnumbersaliva = new JTextField();
        txtnumberhair = new JTextField();
        txtresidentialtreat = new JTextField();
        txtmentalillness = new JTextField();
        txtsubstanceabuse = new JTextField();
        txtnumbergraduates = new JTextField();
        txtcumulative1 = new JTextField();
        txtcumulative2 = new JTextField();
        s18 = new JScrollPane();
        s19 = new JScrollPane();
        ta4 = new JTable();
        ta5 = new JTable();
        p5 = new JPanel();
        s17 = new JScrollPane();
        s20 = new JScrollPane();
        s21 = new JScrollPane();
        s22 = new JScrollPane();
        label85 = new JLabel();
        label86 = new JLabel();
        label87 = new JLabel();
        label88 = new JLabel();
        label89 = new JLabel();
        label90 = new JLabel();
        txttodaysdate2 = new JTextField();
        txtname4 = new JTextField();
        txtbirthdate4 = new JTextField();
        txtnewcharges2 = new JTextArea();
        txtarrestreason = new JTextArea();
        cmdsubmit5 = new JButton();
        cmdclear7 = new JButton();
        cmdrefresh4 = new JButton();
        cmdupdate4 = new JButton();
        cmddelete4 = new JButton();
        ta6 = new JTable();
        s23 = new JScrollPane();
        s24 = new JScrollPane();
        p6 = new JPanel();
        label91 = new JLabel();
        label92 = new JLabel();
        label93 = new JLabel();
        label94 = new JLabel();
        label95 = new JLabel();
        label96 = new JLabel();
        label97 = new JLabel();
        label98 = new JLabel();
        txtreviewdate = new JTextField();
        txtcourtdate = new JTextField();
        txtcasenumber2 = new JTextField();
        txtname5 = new JTextField();
        txtbirthdate5 = new JTextField();
        boxacceptance = new JComboBox();
        txtreason = new JTextArea();
        ta7 = new JTable();
        ta8 = new JTable();
        ta9 = new JTable();
        ta10 = new JTable();
        ta11 = new JTable();
        ta12 = new JTable();
        ta13 = new JTable();
        ta14 = new JTable();
        cmdsubmit6 = new JButton();
        cmdclear8 = new JButton();
        cmdrefresh5 = new JButton();
        cmddelete5 = new JButton();
        cmdupdate5 = new JButton();
        s25 = new JScrollPane();
        s26 = new JScrollPane();
        s27 = new JScrollPane();
        s28 = new JScrollPane();
        s29 = new JScrollPane();
        s30 = new JScrollPane();
        s31 = new JScrollPane();
        s32 = new JScrollPane();
        label99 = new JLabel();
        label100 = new JLabel();
        label101 = new JLabel();
        label102 = new JLabel();
        
        setFont(new Font("Serif", 0, 20));
        setTitle("Database County");
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setMinimumSize(new Dimension(650, 650));      
        addWindowListener(this);
        
        setJMenuBar(menubar);
        menubar.setBackground(new Color(245, 245, 245));
        file.setFont(new Font("Serif", 0, 14));
        menubar.add(file);
        edit.setFont(new Font("Serif", 0, 14));
        menubar.add(edit);
        tools.setFont(new Font("Serif", 0, 14));
        menubar.add(tools);
        help.setFont(new Font("Serif", 0, 14));
        menubar.add(help);
        
        save.setFont(new Font("Serif", 0, 14));
        save.setBackground(new Color(245, 245, 245));
        save.addActionListener(this);
        file.add(save);
        
        print.setFont(new Font("Serif", 0, 14));
        print.setBackground(new Color(245, 245, 245));
        print.addActionListener(this);
        file.add(print);
        
        exit.setFont(new Font("Serif", 0, 14));
        exit.setBackground(new Color(245, 245, 245));
        exit.addActionListener(this);
        file.add(exit);
        
        courtreview.setFont(new Font("Serif", 0, 14));
        courtreview.setBackground(new Color(245, 245, 245));
        courtreview.addActionListener(this);
        tools.add(courtreview);
        
        basicinformation.setFont(new Font("Serif", 0, 14));
        basicinformation.setBackground(new Color(245, 245, 245));
        basicinformation.addActionListener(this);
        tools.add(basicinformation);      
        
        weeklydata.setFont(new Font("Serif", 0, 14));
        weeklydata.setBackground(new Color(245, 245, 245));
        weeklydata.addActionListener(this);
        tools.add(weeklydata);
        
        quarterlyreport.setFont(new Font("Serif", 0, 14));
        quarterlyreport.setBackground(new Color(245, 245, 245));
        quarterlyreport.addActionListener(this);
        tools.add(quarterlyreport);
        
        postgraduation.setFont(new Font("Serif", 0, 14));
        postgraduation.setBackground(new Color(245, 245, 245));
        postgraduation.addActionListener(this);
        tools.add(postgraduation);
        
        htables.setFont(new Font("Serif", 0, 14));
        htables.setBackground(new Color(245, 245, 245));
        htables.addActionListener(this);
        help.add(htables);
        
        s23.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        s23.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        p6.setFont(new Font("Serif", 0, 16)); 
        p6.setMinimumSize(new Dimension(1700, 750));
        p6.setPreferredSize(new Dimension(1700, 750));
        p6.setLayout(null);
        p6.setBackground(new Color(240, 255, 255));
        p6.addMouseListener(this);
        
        label91.setFont(new Font("Serif", 0, 16)); 
        label91.setText("Court Reviews");
        p6.add(label91);
        label91.setBounds(10, 20, 106, 22);
        
        label92.setFont(new Font("Serif", 0, 16)); 
        label92.setText("Date of Court Appearance (Ex: 2001-01-30):");
        p6.add(label92);
        label92.setBounds(10, 60, 300, 22);
        
        txtcourtdate.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtcourtdate);
        txtcourtdate.setBounds(325, 59, 234, 25);
        
        label93.setFont(new Font("Serif", 0, 16)); 
        label93.setText("Review Date:");
        p6.add(label93);
        label93.setBounds(10, 100, 100, 22);
        
        txtreviewdate.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtreviewdate);
        txtreviewdate.setBounds(325, 99, 234, 25);
        
        label94.setFont(new Font("Serif", 0, 16)); 
        label94.setText("Case Number:");
        p6.add(label94);
        label94.setBounds(10, 140, 200, 22);
        
        txtcasenumber2.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtcasenumber2);
        txtcasenumber2.setBounds(325, 139, 234, 25);
        
        label95.setFont(new Font("Serif", 0, 16)); 
        label95.setText("Candidate's Name (Full Name):");
        p6.add(label95);
        label95.setBounds(10, 180, 200, 22);
        
        txtname5.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtname5);
        txtname5.setBounds(325, 179, 234, 25);
        
        label96.setFont(new Font("Serif", 0, 16)); 
        label96.setText("Candidate's Date of Birth:");
        p6.add(label96);
        label96.setBounds(10, 220, 200, 22);
        
        txtbirthdate5.setFont(new Font("Serif", 0, 14)); 
        p6.add(txtbirthdate5);
        txtbirthdate5.setBounds(325, 219, 234, 25);
        
        label97.setFont(new Font("Serif", 0, 16)); 
        label97.setText("Acceptances or Denial of Candidate:");
        p6.add(label97);
        label97.setBounds(10, 260, 300, 22);
        
        boxacceptance.setFont(new Font("Serif", 0, 14)); 
        boxacceptance.setMaximumRowCount(2);
        boxacceptance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p6.add(boxacceptance);
        boxacceptance.setBounds(325, 259, 234, 25);        
        boxacceptance.setBackground(new Color(245, 245, 245));
        
        label98.setFont(new Font("Serif", 0, 16)); 
        label98.setText("Reason for Acceptances or Denial:");
        p6.add(label98);
        label98.setBounds(10, 300, 300, 22);
        
        s24.setFont(new Font("Serif", 0, 14)); 
        txtreason.setColumns(20);
        txtreason.setFont(new Font("Serif", 0, 14));
        txtreason.setRows(5);
        s24.setViewportView(txtreason);
        p6.add(s24);
        s24.setBounds(325, 299, 234, 66);
        txtreason.setLineWrap(true);
        txtreason.setWrapStyleWord(true);
        
        cmdsubmit6.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit6.setText("Submit");
        cmdsubmit6.addActionListener(this);
        p6.add(cmdsubmit6);
        cmdsubmit6.setBounds(325, 390, 100, 27);

        cmdclear8.setFont(new Font("Serif", 0, 14)); 
        cmdclear8.setText("Clear Form");
        cmdclear8.addActionListener(this);
        p6.add(cmdclear8);
        cmdclear8.setBounds(460, 390, 100, 27);
        
        ta7.setFont(new Font("Serif", 0, 14)); 
        ta7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Court_Appearance", "Review_Date", "Case_Number", "Candidates_Name", "Candidates_Birth_Date", "Acceptance", "Reason"
            }
        ));
        ta7.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        s25.setViewportView(ta7);

        p6.add(s25);
        s25.setBounds(729, 57, 898, 498);

        cmdrefresh5.setFont(new Font("Serif", 0, 14)); 
        cmdrefresh5.setText("Refresh Table");
        cmdrefresh5.addActionListener(this);
        p6.add(cmdrefresh5);
        cmdrefresh5.setBounds(856, 584, 130, 27);

        cmdupdate5.setFont(new Font("Serif", 0, 14)); 
        cmdupdate5.setText("Update Table");
        cmdupdate5.addActionListener(this);
        p6.add(cmdupdate5);
        cmdupdate5.setBounds(1139, 584, 120, 27);

        cmddelete5.setFont(new Font("Serif", 0, 14)); 
        cmddelete5.setText("Delete Entry");
        cmddelete5.addActionListener(this);
        p6.add(cmddelete5);
        cmddelete5.setBounds(1403, 584, 125, 27);
        
        s23.setViewportView(p6);

        t1.addTab("Court Reviews", s23);
        
        s1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        s1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        p1.setFont(new Font("Serif", 0, 16)); 
        p1.setMinimumSize(new Dimension(1900, 750));
        p1.setPreferredSize(new Dimension(1900, 750));
        p1.setLayout(null);
        p1.setBackground(new Color(240, 255, 255));
        p1.addMouseListener(this);

        label1.setFont(new Font("Serif", 0, 16)); 
        label1.setText("Basic Informaiton");
        label1.setToolTipText("");
        p1.add(label1);
        label1.setBounds(10, 11, 106, 22);        

        label3.setFont(new Font("Serif", 0, 16)); 
        label3.setText("Entry Date:");
        p1.add(label3);
        label3.setBounds(10, 52, 88, 22);
        
        label2.setFont(new Font("Serif", 0, 16)); 
        label2.setText("Case Number:");
        p1.add(label2);
        label2.setBounds(10, 95, 300, 22);

        label4.setFont(new Font("Serif", 0, 16)); 
        label4.setText("Date of Intake:");
        p1.add(label4);
        label4.setBounds(10, 138, 90, 22);

        label5.setFont(new Font("Serif", 0, 16)); 
        label5.setText("Participant's Name (Full Name including Middle):");
        p1.add(label5);
        label5.setBounds(10, 181, 297, 22);

        label6.setFont(new Font("Serif", 0, 16)); 
        label6.setText("Date of Birth (Ex: YearMonthDay 1978-06-15):");
        p1.add(label6);
        label6.setBounds(10, 224, 300, 22);

        label7.setFont(new Font("Serif", 0, 16)); 
        label7.setText("Age:");
        p1.add(label7);
        label7.setBounds(10, 267, 28, 22);

        label8.setFont(new Font("Serif", 0, 16)); 
        label8.setText("Phone #:");
        p1.add(label8);
        label8.setBounds(10, 353, 53, 22);

        label9.setFont(new Font("Serif", 0, 16)); 
        label9.setText("Address:");
        p1.add(label9);
        label9.setBounds(10, 310, 54, 22);

        label10.setFont(new Font("Serif", 0, 16)); 
        label10.setText("Legal Charge/Reason for Entering Program:");
        p1.add(label10);
        label10.setBounds(10, 396, 263, 22);

        label11.setFont(new java.awt.Font("Serif", 0, 16)); 
        label11.setText("Employer Name:");
        p1.add(label11);
        label11.setBounds(10, 439, 102, 22);

        label12.setFont(new java.awt.Font("Serif", 0, 16)); 
        label12.setText("Employer Phone:");
        p1.add(label12);
        label12.setBounds(10, 482, 103, 22);

        label13.setFont(new java.awt.Font("Serif", 0, 16)); 
        label13.setText("Contact Name:");
        p1.add(label13);
        label13.setBounds(10, 525, 92, 22);
        
        jlabel13.setFont(new java.awt.Font("Serif", 0, 16)); 
        jlabel13.setText("Is the participant in residential treatment facility?:");
        p1.add(jlabel13);
        jlabel13.setBounds(10, 568, 330, 22);

        txtentrydate.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtentrydate);
        txtentrydate.setBounds(325, 51, 234, 25);
        
        txtcasenumber1.setFont(new java.awt.Font("Serif", 0, 14)); 
        txtcasenumber1.addFocusListener(this);
        p1.add(txtcasenumber1);
        txtcasenumber1.setBounds(325, 94, 234, 25);

        txtdateofintake.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtdateofintake);
        txtdateofintake.setBounds(325, 137, 234, 25);

        txtparticipantsname1.setFont(new Font("Serif", 0, 14));
        p1.add(txtparticipantsname1);
        txtparticipantsname1.setBounds(325, 180, 234, 25);

        txtdateofbirth.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtdateofbirth);
        txtdateofbirth.setBounds(325, 223, 234, 25);

        txtage1.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtage1);
        txtage1.setBounds(325, 266, 234, 25);

        txtphonenumber1.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtphonenumber1);
        txtphonenumber1.setBounds(325, 352, 234, 25);

        txtaddress1.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtaddress1);
        txtaddress1.setBounds(325, 309, 234, 25);

        txtlegalcharge.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtlegalcharge);
        txtlegalcharge.setBounds(325, 395, 234, 25);

        txtemployername.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtemployername);
        txtemployername.setBounds(325, 438, 234, 25);

        txtemployerphone.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtemployerphone);
        txtemployerphone.setBounds(325, 481, 234, 25);

        txtcontactname.setFont(new Font("Serif", 0, 14)); 
        p1.add(txtcontactname);
        txtcontactname.setBounds(325, 524, 234, 25);
        
        boxresidentialtreatment.setFont(new Font("Serif", 0, 14)); 
        boxresidentialtreatment.setMaximumRowCount(3);
        boxresidentialtreatment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        p1.add(boxresidentialtreatment);
        boxresidentialtreatment.setBounds(325, 567, 234, 25);
        boxresidentialtreatment.setBackground(new Color(245, 245, 245));
        

        cmdsubmit1.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit1.setText("Submit");
        cmdsubmit1.addActionListener(this);
        p1.add(cmdsubmit1);
        cmdsubmit1.setBounds(325, 610, 100, 27);

        cmdclearform1.setFont(new Font("Serif", 0, 14)); 
        cmdclearform1.setText("Clear Form");
        cmdclearform1.addActionListener(this);
        p1.add(cmdclearform1);
        cmdclearform1.setBounds(462, 610, 100, 27);

        ta1.setFont(new Font("Serif", 0, 14)); 
        ta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entry_Date", "Case_Number", "Date_of_Intake", "Participants_Name", "Date_of_Birth", "Age", "Address", "Phone_Number", "Legal_Charge", "Employer_Name", "Employer_Phone", "Contact_Name", "Residential_Treatment"
            }
        ));
        ta1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        s3.setViewportView(ta1);

        p1.add(s3);
        s3.setBounds(929, 51, 898, 498);

        cmdrefresh1.setFont(new Font("Serif", 0, 14)); 
        cmdrefresh1.setText("Refresh Table");
        cmdrefresh1.addActionListener(this);
        p1.add(cmdrefresh1);
        cmdrefresh1.setBounds(1056, 584, 130, 27);

        cmdupdate1.setFont(new Font("Serif", 0, 14)); 
        cmdupdate1.setText("Update Table");
        cmdupdate1.addActionListener(this);
        p1.add(cmdupdate1);
        cmdupdate1.setBounds(1339, 584, 120, 27);

        cmddelete1.setFont(new Font("Serif", 0, 14)); 
        cmddelete1.setText("Delete Entry");
        cmddelete1.addActionListener(this);
        p1.add(cmddelete1);
        cmddelete1.setBounds(1603, 584, 125, 27);

        s1.setViewportView(p1);
        
        t1.setFont(new Font("Serif", 0, 16)); 
        t1.setBackground(new Color(240, 255, 255));
        t1.addTab("Basic Information", s1);

        s2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        s2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        p2.setFont(new Font("Serif", 0, 16)); 
        p2.setMinimumSize(new Dimension(900, 900));
        p2.setPreferredSize(new Dimension(2300, 1850));
        p2.setLayout(null);
        p2.setBackground(new Color(240, 255, 255));
        p2.addMouseListener(this);

        label14.setFont(new Font("Serif", 0, 16)); 
        label14.setText("Weekly Data");
        p2.add(label14);
        label14.setBounds(10, 22, 80, 22); 
        
        jlabel17.setFont(new Font("Serif", 0, 16)); 
        jlabel17.setText("Today's Date:");
        p2.add(jlabel17);
        jlabel17.setBounds(10, 71, 130, 22);
        
        txttodaysdate.setFont(new Font("Serif", 0, 14)); 
        p2.add(txttodaysdate);
        txttodaysdate.setBounds(359, 70, 234, 25);

        label17.setFont(new Font("Serif", 0, 16)); 
        label17.setText("Participant's Number:");
        p2.add(label17);
        label17.setBounds(10, 114, 130, 22);
        
        txtparticipantsnumber.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtparticipantsnumber);
        txtparticipantsnumber.setBounds(359, 113, 234, 25);

        label18.setFont(new Font("Serif", 0, 16)); 
        label18.setText("Name (Full Name):");
        p2.add(label18);
        label18.setBounds(10, 157, 117, 22);
        
        txtname2.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtname2);
        txtname2.setBounds(359, 156, 234, 25);

        label19.setFont(new Font("Serif", 0, 16)); 
        label19.setText("Date of Birth (Ex: YearMonthDay 1978-06-15):");
        p2.add(label19);
        label19.setBounds(10, 200, 300, 22);
        
        txtbirthdate2.setFont(new Font("Serif", 0, 14)); 
        txtbirthdate2.addFocusListener(this);
        p2.add(txtbirthdate2);
        txtbirthdate2.setBounds(359, 199, 234, 25);
        
        label15.setFont(new Font("Serif", 0, 16)); 
        label15.setText("What phase is the participant in? :");
        p2.add(label15);
        label15.setBounds(10, 243, 202, 22);
        
        boxphase.setFont(new Font("Serif", 0, 14)); 
        boxphase.setMaximumRowCount(9);
        boxphase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Phase 1", "Phase 2", "Phase 3", "Phase 4", "Phase 5", "Terminated", "Graduated", "On Hold" }));
        p2.add(boxphase);
        boxphase.setBounds(359, 242, 234, 25);
        boxphase.setBackground(new Color(245, 245, 245));
        
        jlabel20.setFont(new Font("Serif", 0, 16)); 
        jlabel20.setText("Date of Termination:");
        p2.add(jlabel20);
        jlabel20.setBounds(10, 287, 245, 22);
        
        txtterminationdate.setFont(new Font("Serif", 0, 14));
        p2.add(txtterminationdate);
        txtterminationdate.setBounds(359, 286, 234, 25);
        
        label20.setFont(new Font("Serif", 0, 16)); 
        label20.setText("Briefly Describe Reason for Termination:");
        p2.add(label20);
        label20.setBounds(10, 331, 245, 22);
        
        txtreasontermination.setColumns(20);
        txtreasontermination.setFont(new Font("Serif", 0, 14)); 
        txtreasontermination.setRows(5);
        s6.setViewportView(txtreasontermination);
        txtreasontermination.setLineWrap(true);
        txtreasontermination.setWrapStyleWord(true);
        p2.add(s6);
        s6.setBounds(359, 330, 234, 66);
        
        label21.setFont(new Font("Serif", 0, 16)); 
        label21.setText("Date of Graduation (Ex: 1999-01-20):");
        p2.add(label21);
        label21.setBounds(10, 415, 247, 22);
        
        txtgraddate.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtgraddate);
        txtgraddate.setBounds(359, 414, 234, 25);
        
        label22.setFont(new Font("Serif", 0, 16)); 
        label22.setText("Briefly Describe Reason for On Hold Status & Date:");
        p2.add(label22);
        label22.setBounds(10, 459, 317, 22); 
        
        txtreasononhold.setColumns(20);
        txtreasononhold.setFont(new Font("Serif", 0, 14)); 
        txtreasononhold.setRows(5);
        s5.setViewportView(txtreasononhold);
        txtreasononhold.setLineWrap(true);
        txtreasononhold.setWrapStyleWord(true);

        p2.add(s5);
        s5.setBounds(359, 458, 234, 66);
        
        label16.setFont(new Font("Serif", 0, 16)); 
        label16.setText("Last Step Completed:");
        p2.add(label16);
        label16.setBounds(10, 543, 132, 22);
        
        boxstep.setFont(new Font("Serif", 0, 14)); 
        boxstep.setMaximumRowCount(13);
        boxstep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Step 1", "Step 2", "Step 3", "Step 4", "Step 5", "Step 6", "Step 7", "Step 8", "Step 9", "Step 10", "Step 11", "Step 12" }));
        p2.add(boxstep);
        boxstep.setBounds(359, 542, 234, 25);
        boxstep.setBackground(new Color(245, 245, 245));
        
        jlabel26.setFont(new Font("Serif", 0, 16)); 
        jlabel26.setText("Fee Balance Due:");
        p2.add(jlabel26);
        jlabel26.setBounds(10, 587, 120, 22);
        
        txtfeebalance.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtfeebalance);
        txtfeebalance.setBounds(359, 586, 234, 25);

        jlabel25.setFont(new Font("Serif", 0, 16)); 
        jlabel25.setText("Fee Amount Paid:");
        p2.add(jlabel25);
        jlabel25.setBounds(10, 631, 120, 22);
        
        txtfeeamount.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtfeeamount);
        txtfeeamount.setBounds(359, 630, 234, 25);        
        
        label23.setFont(new Font("Serif", 0, 16)); 
        label23.setText("Fees Paid Weekly:");
        p2.add(label23);
        label23.setBounds(10, 675, 114, 22);
        
        boxfees.setFont(new java.awt.Font("Serif", 0, 14)); 
        boxfees.setMaximumRowCount(4);
        boxfees.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No", "Other" }));
        p2.add(boxfees);
        boxfees.setBounds(359, 674, 234, 25);
        boxfees.setBackground(new Color(245, 245, 245));
        
        label24.setFont(new Font("Serif", 0, 16)); 
        label24.setText("Other. Please Briefly Explain:");
        p2.add(label24);
        label24.setBounds(10, 719, 176, 22);
        
        txtotherfees.setColumns(20);
        txtotherfees.setFont(new Font("Serif", 0, 14));
        txtotherfees.setRows(5);
        s7.setViewportView(txtotherfees);
        txtotherfees.setLineWrap(true);
        txtotherfees.setWrapStyleWord(true);
        p2.add(s7);
        s7.setBounds(359, 718, 234, 66);
        
        
        label25.setFont(new Font("Serif", 0, 16)); 
        label25.setText("Date of Offense (Ex: 2000-12-01):");
        p2.add(label25);
        label25.setBounds(10, 804, 227, 22);
        
        txtoffensedate.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtoffensedate);
        txtoffensedate.setBounds(359, 803, 234, 25);
        
        label26.setFont(new Font("Serif", 0, 16)); 
        label26.setText("Reason for Sanction:");
        p2.add(label26);
        label26.setBounds(10, 848, 125, 22);
        
        txtreasonsanction.setColumns(20);
        txtreasonsanction.setFont(new Font("Serif", 0, 14)); 
        txtreasonsanction.setRows(5);
        s11.setViewportView(txtreasonsanction);
        txtreasonsanction.setLineWrap(true);
        txtreasonsanction.setWrapStyleWord(true);
        p2.add(s11);
        s11.setBounds(359, 848, 234, 66);
        
        label27.setFont(new Font("Serif", 0, 16)); 
        label27.setText("Type of Sanction:");
        p2.add(label27);
        label27.setBounds(10, 931, 106, 22);
        
        txttypesanction.setFont(new Font("Serif", 0, 14)); 
        p2.add(txttypesanction);
        txttypesanction.setBounds(359, 930, 234, 25);

        label28.setFont(new Font("Serif", 0, 16)); 
        label28.setText("Date and Brief Explanation of Sanction Order:");
        p2.add(label28);
        label28.setBounds(10, 974, 278, 22);
        
        txtsanctionorder.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtsanctionorder);
        txtsanctionorder.setBounds(359, 973, 234, 25);

        label29.setFont(new Font("Serif", 0, 16)); 
        label29.setText("Drug Screen Date (Ex: 2011-05-08):");
        p2.add(label29);
        label29.setBounds(10, 1017, 240, 22);
        
        txtdatescreening.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtdatescreening);
        txtdatescreening.setBounds(359, 1016, 234, 25);
        
        jlabel30.setFont(new Font("Serif", 0, 16)); 
        jlabel30.setText("Drug Screening Types:");
        p2.add(jlabel30);
        jlabel30.setBounds(10, 1060, 143, 22);
        
        boxscreeningtypes.setFont(new Font("Serif", 0, 14));
        boxscreeningtypes.setMaximumRowCount(5);
        boxscreeningtypes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Urine", "Breath", "Saliva", "Hair"}));
        p2.add(boxscreeningtypes);
        boxscreeningtypes.setBounds(359, 1059, 234, 25);
        boxscreeningtypes.setBackground(new Color(245, 245, 245));

        label30.setFont(new Font("Serif", 0, 16)); 
        label30.setText("Drug Screening Results:");
        p2.add(label30);
        label30.setBounds(10, 1103, 143, 22);
        
        boxscreeningresults.setFont(new Font("Serif", 0, 14)); 
        boxscreeningresults.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Positive", "Negative" }));
        p2.add(boxscreeningresults);
        boxscreeningresults.setBounds(359, 1102, 234, 25);
        boxscreeningresults.setBackground(new Color(245, 245, 245));
        
        label37.setFont(new Font("Serif", 0, 16)); 
        label37.setText("Drugs Found:");
        p2.add(label37);
        label37.setBounds(10, 1146, 82, 22);
        
        txtpositive.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtpositive);
        txtpositive.setBounds(359, 1145, 234, 25);

        label31.setFont(new Font("Serif", 0, 16)); 
        label31.setText("Drug Court Attendance:");
        p2.add(label31);
        label31.setBounds(10, 1189, 145, 22);
        
        s9.setFont(new Font("Serif", 0, 14)); 
        txtdrugcourtattendance.setColumns(20);
        txtdrugcourtattendance.setFont(new Font("Serif", 0, 14)); 
        txtdrugcourtattendance.setRows(5);
        s9.setViewportView(txtdrugcourtattendance);
        txtdrugcourtattendance.setLineWrap(true);
        txtdrugcourtattendance.setWrapStyleWord(true);
        p2.add(s9);
        s9.setBounds(359, 1189, 234, 66);

        label32.setFont(new Font("Serif", 0, 16)); 
        label32.setText("NA Attendance:");
        p2.add(label32);
        label32.setBounds(10, 1273, 99, 22);
        
        s12.setFont(new Font("Serif", 0, 14)); 
        txtna.setColumns(20);
        txtna.setFont(new Font("Serif", 0, 14));
        txtna.setRows(5);
        s12.setViewportView(txtna);
        txtna.setLineWrap(true);
        txtna.setWrapStyleWord(true);
        p2.add(s12);
        s12.setBounds(359, 1273, 234, 66);

        label33.setFont(new Font("Serif", 0, 16)); 
        label33.setText("AA Attendance:");
        p2.add(label33);
        label33.setBounds(10, 1357, 98, 22);
        
        s8.setFont(new Font("Serif", 0, 14)); 
        txtaa.setColumns(20);
        txtaa.setFont(new Font("Serif", 0, 14)); 
        txtaa.setRows(5);
        s8.setViewportView(txtaa);
        txtaa.setLineWrap(true);
        txtaa.setWrapStyleWord(true);
        p2.add(s8);
        s8.setBounds(359, 1357, 234, 66);

        label34.setFont(new Font("Serif", 0, 16)); 
        label34.setText("Court Sessions:");
        p2.add(label34);
        label34.setBounds(10, 1441, 94, 22);
        
        s4.setFont(new Font("Serif", 0, 14)); 
        txtcourtsessions.setColumns(20);
        txtcourtsessions.setFont(new Font("Serif", 0, 14)); 
        txtcourtsessions.setRows(5);
        s4.setViewportView(txtcourtsessions);
        txtcourtsessions.setLineWrap(true);
        txtcourtsessions.setWrapStyleWord(true);
        p2.add(s4);
        s4.setBounds(359, 1441, 234, 66);
        
        jlabel35.setFont(new Font("Serif", 0, 16));
        jlabel35.setText("List any New Legal Charges:");
        p2.add(jlabel35);
        jlabel35.setBounds(10, 1525, 200, 22);
        
        txtnewcharges.setFont(new Font("Serif", 0, 14)); 
        p2.add(txtnewcharges);
        txtnewcharges.setBounds(359, 1524, 234, 25);

        label35.setFont(new Font("Serif", 0, 16));
        label35.setText("Simple Job Situation:");
        p2.add(label35);
        label35.setBounds(10, 1568, 126, 22);
        
        boxjobsituation2.setFont(new Font("Serif", 0, 14)); 
        boxjobsituation2.setMaximumRowCount(4);
        boxjobsituation2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "full time employed", "part time employed", "not employed" }));
        p2.add(boxjobsituation2);
        boxjobsituation2.setBounds(359, 1567, 234, 25);
        boxjobsituation2.setBackground(new Color(245, 245, 245));
        
        jlabel36.setFont(new Font("Serif", 0, 16)); 
        jlabel36.setText("Has the participant received a Diploma or GED");
        p2.add(jlabel36);
        jlabel36.setBounds(10, 1611, 311, 22);
        
        jlabel37.setFont(new Font("Serif", 0, 16)); 
        jlabel37.setText("while in the program? (Answered Yes only Once):");
        p2.add(jlabel37);
        jlabel37.setBounds(10, 1631, 311, 22);
        
        boxdiploma.setFont(new Font("Serif", 0, 14)); 
        boxdiploma.setMaximumRowCount(4);
        boxdiploma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", "No", "Yes" }));
        p2.add(boxdiploma);
        boxdiploma.setBounds(359, 1620, 234, 25);
        boxdiploma.setBackground(new Color(245, 245, 245));

        label36.setFont(new Font("Serif", 0, 16)); 
        label36.setText("Weekly Progress Report (Counselor's Comments): ");
        p2.add(label36);
        label36.setBounds(10, 1674, 311, 22);

        txtcounselor.setColumns(20);
        txtcounselor.setFont(new Font("Serif", 0, 14)); 
        txtcounselor.setRows(5);
        s10.setViewportView(txtcounselor);
        txtcounselor.setLineWrap(true);
        txtcounselor.setWrapStyleWord(true);
        p2.add(s10);
        s10.setBounds(359, 1674, 234, 66);

        cmdsubmit2.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit2.setText("Submit");
        cmdsubmit2.addActionListener(this);
        p2.add(cmdsubmit2);
        cmdsubmit2.setBounds(359, 1770, 100, 27);

        cmdclearform2.setFont(new Font("Serif", 0, 14)); 
        cmdclearform2.setText("Clear Form");
        cmdclearform2.addActionListener(this);
        p2.add(cmdclearform2);
        cmdclearform2.setBounds(500, 1770, 100, 27);

        ta2.setFont(new Font("Serif", 0, 14)); 
        ta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entry_Date", "Participant_Nmbr", "Name", "Birth_Date", "Phase", "Termin_Date", "Termin_Date", "Grad_Date", "Hold_N_Date", "Last_Step_Cmplt", "Fee_Balance", "Fee_Amount", "Fees_Paid", "Fees_Other", "Date_of_Offense", "Reason_Sanction", "Type_Sanction", "Date_Exp_Sanction", "DrugScreen_Date", "Screen_Results", "Drug_Found", "Drug_Court_Atnd", "NA_Atnd, AA_Atnd", "Court_Ses_Atnd", "New_Charges", "Employment", "Counselor_Comments"
            }
        ));
        ta2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        s13.setViewportView(ta2);
        p2.add(s13);
        s13.setBounds(865, 91, 1397, 544);        

        cmdrefresh2.setFont(new Font("Serif", 0, 14)); 
        cmdrefresh2.setText("Refresh Table");
        cmdrefresh2.addActionListener(this);
        p2.add(cmdrefresh2);
        cmdrefresh2.setBounds(865, 664, 130, 27);

        cmdupdate2.setFont(new Font("Serif", 0, 14)); 
        cmdupdate2.setText("Update Table");
        cmdupdate2.addActionListener(this);
        p2.add(cmdupdate2);
        cmdupdate2.setBounds(1242, 664, 130, 27);

        cmddelete2.setFont(new Font("Serif", 0, 14)); 
        cmddelete2.setText("Delete Entry");
        cmddelete2.addActionListener(this);
        p2.add(cmddelete2);
        cmddelete2.setBounds(1651, 664, 130, 27);

        s2.setViewportView(p2);

        t1.addTab("Weekly Data", s2);                 
        
        s16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        s16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        p4.setFont(new Font("Serif", 0, 16)); 
        p4.setMinimumSize(new Dimension(900, 900));
        p4.setPreferredSize(new Dimension(2300, 1475));
        p4.setLayout(null);
        p4.setBackground(new Color(240, 255, 255));
        
        label41.setFont(new Font("Serif", 0, 16)); 
        label41.setText("Quarterly Reporting");
        p4.add(label41);
        label41.setBounds(10, 22, 130, 25);        
        
        label43.setFont(new Font("Serif", 0, 16)); 
        label43.setText("Date of Quarterly Period:");
        p4.add(label43);
        label43.setBounds(10, 71, 400, 25);
        
        txtquarterlydate.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtquarterlydate);
        txtquarterlydate.setBounds(360, 70, 150, 25);
        
        label42.setFont(new Font("Serif", 0, 16)); 
        label42.setText("Quarterly Period:");
        p4.add(label42);
        label42.setBounds(10, 114, 202, 22);
        
        boxquarterly.setFont(new Font("Serif", 0, 14)); 
        boxquarterly.setMaximumRowCount(4);
        boxquarterly.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Quarter", "Second Quarter", "Third Quarter", "Fourth Quarter" }));
        p4.add(boxquarterly);
        boxquarterly.setBounds(360, 113, 150, 25);
        boxquarterly.setBackground(new Color(245, 245, 245));
        
        label44.setFont(new Font("Serif", 0, 16)); 
        label44.setText("Number of offenders reviewed for acceptance into your");
        p4.add(label44);
        label44.setBounds(10, 157, 400, 25);
        
        label45.setFont(new Font("Serif", 0, 16)); 
        label45.setText("accountability court program:");
        p4.add(label45);
        label45.setBounds(10, 177, 200, 25);
        
        txtnumberreviewed.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberreviewed);
        txtnumberreviewed.setBounds(360, 166, 150, 25);
        
        label46.setFont(new Font("Serif", 0, 16)); 
        label46.setText("Number of offenders accepted into program");
        p4.add(label46);
        label46.setBounds(10, 220, 300, 25);
        
        label47.setFont(new Font("Serif", 0, 16)); 
        label47.setText("this reporting period:");
        p4.add(label47);
        label47.setBounds(10, 240, 150, 25);
        
        txtnumberaccepted.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberaccepted);
        txtnumberaccepted.setBounds(360, 229, 150, 25);
        
        label48.setFont(new Font("Serif", 0, 16)); 
        label48.setText("Number rejected because of prior criminal/juvenile");
        p4.add(label48);
        label48.setBounds(10, 283, 400, 25);
        
        label49.setFont(new Font("Serif", 0, 16)); 
        label49.setText("delinquency record:");
        p4.add(label49);
        label49.setBounds(10, 303, 130, 25);
        
        txtnumberrejected.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberrejected);
        txtnumberrejected.setBounds(360, 292, 150, 25);
        
        label50.setFont(new Font("Serif", 0, 16)); 
        label50.setText("Number declined to participate");
        p4.add(label50);
        label50.setBounds(10, 346, 230, 25);
        
        txtnumberdeclined.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberdeclined);
        txtnumberdeclined.setBounds(360, 349, 150, 25);
        
        label51.setFont(new Font("Serif", 0, 16)); 
        label51.setText("Number rejected for other reason(s):");
        p4.add(label51);
        label51.setBounds(10, 389, 230, 25);
        
        txtnumberrejectedotherreasons.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberrejectedotherreasons);
        txtnumberrejectedotherreasons.setBounds(360, 392, 150, 25);
        
        label52.setFont(new Font("Serif", 0, 16)); 
        label52.setText("Number of AWOL participants as of last date of");
        p4.add(label52);
        label52.setBounds(10, 432, 350, 25);
        
        label53.setFont(new Font("Serif", 0, 16)); 
        label53.setText("this reporting period:");
        p4.add(label53);
        label53.setBounds(10, 452, 200, 25);
        
        txtnumberawol.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberawol);
        txtnumberawol.setBounds(360, 441, 150, 25);
        
        label54.setFont(new Font("Serif", 0, 16)); 
        label54.setText("Number of participants who were terminated due to");
        p4.add(label54);
        label54.setBounds(10, 484, 400, 25);
        
        label55.setFont(new Font("Serif", 0, 16)); 
        label55.setText("*administrative discharge:");
        p4.add(label55);
        label55.setBounds(10, 504, 200, 25);
        
        txtnumberterminated.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberterminated);
        txtnumberterminated.setBounds(360, 493, 150, 25);
        
        label56.setFont(new Font("Serif", 0, 16)); 
        label56.setText("Number of *drug free babies born to active clients:");
        p4.add(label56);
        label56.setBounds(10, 547, 400, 25);
        
        txtnumberdrugfreebabies.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberdrugfreebabies);
        txtnumberdrugfreebabies.setBounds(360, 550, 150, 25);
        
        label57.setFont(new Font("Serif", 0, 16)); 
        label57.setText("Number of participants whose parental rigths were");
        p4.add(label57);
        label57.setBounds(10, 590, 400, 25);
        
        label58.setFont(new Font("Serif", 0, 16)); 
        label58.setText("terminated prior to program participation:");
        p4.add(label58);
        label58.setBounds(10, 610, 350, 25);
        
        txtnumberrigthsterminated.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberrigthsterminated);
        txtnumberrigthsterminated.setBounds(360, 599, 150, 25);
        
        label59.setFont(new Font("Serif", 0, 16)); 
        label59.setText("Number of participants who received");
        p4.add(label59);
        label59.setBounds(10, 653, 330, 25);
        
        label60.setFont(new Font("Serif", 0, 16)); 
        label60.setText("their high school GED:");
        p4.add(label60);
        label60.setBounds(10, 673, 300, 25);
        
        txtnumbergeds.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumbergeds);
        txtnumbergeds.setBounds(360, 662, 150, 25);
        
        label61.setFont(new Font("Serif", 0, 16)); 
        label61.setText("For participants graduating in this reporting period,");
        p4.add(label61);
        label61.setBounds(10, 716, 450, 25);
        
        label62.setFont(new Font("Serif", 0, 16)); 
        label62.setText("provide their total annual wages earned at program:");
        p4.add(label62);
        label62.setBounds(10, 736, 350, 25);
        
        label63.setFont(new Font("Serif", 0, 16)); 
        label63.setText("entry and upon graduation:");
        p4.add(label63);
        label63.setBounds(10, 756, 300, 25);
        
        label64.setFont(new Font("Serif", 0, 16)); 
        label64.setText("Starting Wages");
        p4.add(label64);
        label64.setBounds(360, 716, 300, 25);
        
        txtstartwages.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtstartwages);
        txtstartwages.setBounds(360, 740, 150, 25);
        
        label65.setFont(new Font("Serif", 0, 16)); 
        label65.setText("Completion Wages");
        p4.add(label65);
        label65.setBounds(560, 716, 300, 25);
        
        txtendwages.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtendwages);
        txtendwages.setBounds(560, 740, 150, 25);
        
        label66.setFont(new Font("Serif", 0, 16)); 
        label66.setText("Provide a count of the number of participants who");
        p4.add(label66);
        label66.setBounds(10, 799, 450, 25);
        
        label67.setFont(new Font("Serif", 0, 16)); 
        label67.setText("entered your program in this period according to");
        p4.add(label67);
        label67.setBounds(10, 819, 450, 25);
        
        label68.setFont(new Font("Serif", 0, 16)); 
        label68.setText("their ASAM Level of Care at the point of entry:");
        p4.add(label68);
        label68.setBounds(10, 839, 450, 25);
        
        boxnumberasam.setFont(new Font("Serif", 0, 14)); 
        boxnumberasam.setMaximumRowCount(6);
        boxnumberasam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".5", "1.0", "2.0", "2.5", "3.0", "4.0" }));
        p4.add(boxnumberasam);
        boxnumberasam.setBounds(360, 819, 150, 25);
        boxnumberasam.setBackground(new Color(245, 245, 245));
        
        label69.setFont(new Font("Serif", 0, 16));
        label69.setText("Total number of drug tests administered to total number");
        p4.add(label69);
        label69.setBounds(10,882, 400, 25);
        
        label70.setFont(new Font("Serif", 0, 16));
        label70.setText("of active participants during this reporting period:");
        p4.add(label70);
        label70.setBounds(10,902, 400, 25);
        
        txtnumberdrugscreen.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberdrugscreen);
        txtnumberdrugscreen.setBounds(360, 891, 150, 25);
        
        label71.setFont(new Font("Serif", 0, 16));
        label71.setText("Total number of Urine Test administered:");
        p4.add(label71);
        label71.setBounds(10,945, 350, 25);
        
        txtnumberurine.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberurine);
        txtnumberurine.setBounds(360, 944, 150, 25);
        
        label72.setFont(new Font("Serif", 0, 16));
        label72.setText("Total number of Breath Test administered:");
        p4.add(label72);
        label72.setBounds(10,988, 350, 25);
        
        txtnumberbreath.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberbreath);
        txtnumberbreath.setBounds(360, 987, 150, 25);
        
        label73.setFont(new Font("Serif", 0, 16));
        label73.setText("Total number of Saliva Test administered:");
        p4.add(label73);
        label73.setBounds(10,1031, 350, 25);
        
        txtnumbersaliva.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumbersaliva);
        txtnumbersaliva.setBounds(360, 1030, 150, 25);
        
        label74.setFont(new Font("Serif", 0, 16));
        label74.setText("Total number of Hair Test administered:");
        p4.add(label74);
        label74.setBounds(10,1074, 350, 25);
        
        txtnumberhair.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumberhair);
        txtnumberhair.setBounds(360, 1073, 150, 25);
        
        label75.setFont(new Font("Serif", 0, 16));
        label75.setText("Number of participants who were in a residential");
        p4.add(label75);
        label75.setBounds(10,1117, 400, 25);
        
        label76.setFont(new Font("Serif", 0, 16));
        label76.setText("treatment facility during this reporting period:");
        p4.add(label76);
        label76.setBounds(10,1137, 400, 25);
        
        txtresidentialtreat.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtresidentialtreat);
        txtresidentialtreat.setBounds(360, 1116, 150, 25);
        
        label77.setFont(new Font("Serif", 0, 16));
        label77.setText("Number of new participants who HAVE received prior");
        p4.add(label77);
        label77.setBounds(10,1182, 400, 25);
        
        label78.setFont(new Font("Serif", 0, 16));
        label78.setText("treatment for mental illness:");
        p4.add(label78);
        label78.setBounds(10,1202, 300, 25);
        
        txtmentalillness.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtmentalillness);
        txtmentalillness.setBounds(360, 1179, 150, 25);
        
        label79.setFont(new Font("Serif", 0, 16));
        label79.setText("Number of new participants who HAVE received prior");
        p4.add(label79);
        label79.setBounds(10,1247, 400, 25);
        
        label80.setFont(new Font("Serif", 0, 16));
        label80.setText("treatment for substance abuse/addiction:");
        p4.add(label80);
        label80.setBounds(10,1267, 400, 25);
        
        txtsubstanceabuse.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtsubstanceabuse);
        txtsubstanceabuse.setBounds(360, 1246, 150, 25); 
        
        label82.setFont(new Font("Serif", 0, 16));
        label82.setText("Number of *graduates:");
        p4.add(label82);
        label82.setBounds(10,1310, 400, 25);
        
        txtnumbergraduates.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtnumbergraduates);
        txtnumbergraduates.setBounds(360, 1309, 150, 25); 
        
        cmdsubmit3.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit3.setText("Submit");
        cmdsubmit3.addActionListener(this);
        p4.add(cmdsubmit3);
        cmdsubmit3.setBounds(360, 1375, 100, 27);

        cmdclear6.setFont(new Font("Serif", 0, 14)); 
        cmdclear6.setText("Clear Form");
        cmdclear6.addActionListener(this);
        p4.add(cmdclear6);
        cmdclear6.setBounds(550, 1375, 100, 27);

        
        ta4.setFont(new Font("Serif", 0, 14)); 
        ta4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quarterly_Date", "Quarterly_Period", "Reviewed", "Accepted", "Rejected", "Declined_Participate", "Rejected_Other", "AWOL", "Termin", "Drug_Free_Babies", "Parental_Rights_Termin", "GEDs_Received", "Starting_Wages", "Completion_Wages", "ASAM_Level", "Drug_Tests", "Urine_Tests", "Breath_Tests", "Saliva_Tests", "Hair_Tests", "Residential_Treat", "Prior_Mental_Treat", "Prior_Substance_Abuse", "Graduates"
            }
        ));
        ta4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        s18.setViewportView(ta4);
        p4.add(s18);
        s18.setBounds(865, 91, 1397, 544);
        
        cmdrefresh3.setFont(new Font("Serif", 0, 14)); 
        cmdrefresh3.setText("Refresh Table");
        cmdrefresh3.addActionListener(this);
        p4.add(cmdrefresh3);
        cmdrefresh3.setBounds(865, 664, 130, 27);

        cmdupdate3.setFont(new Font("Serif", 0, 14)); 
        cmdupdate3.setText("Update Table");
        cmdupdate3.addActionListener(this);
        p4.add(cmdupdate3);
        cmdupdate3.setBounds(1242, 664, 130, 27);

        cmddelete3.setFont(new Font("Serif", 0, 14)); 
        cmddelete3.setText("Delete Entry");
        cmddelete3.addActionListener(this);
        p4.add(cmddelete3);
        cmddelete3.setBounds(1651, 664, 130, 27);
        
        label81.setFont(new Font("Serif", 0, 16));
        label81.setText("Cumulative Statistics (from inception to report close-out date):");
        p4.add(label81);
        label81.setBounds(865, 740, 500, 25);       
        
        label83.setFont(new Font("Serif", 0, 16));
        label83.setText("Get Cumulative Statistics by Dates:");
        p4.add(label83);
        label83.setBounds(865, 783, 250, 25);
        
        txtcumulative1.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtcumulative1);
        txtcumulative1.setBounds(1110, 782, 150, 25);        
        
        label84.setFont(new Font("Serif", 0, 16));
        label84.setText("From");
        p4.add(label84);
        label84.setBounds(1280, 783, 70, 25);
        
        txtcumulative2.setFont(new Font("Serif", 0, 14)); 
        p4.add(txtcumulative2);
        txtcumulative2.setBounds(1340, 782, 150, 25);
        
        cmdsubmit4.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit4.setText("Submit");
        cmdsubmit4.addActionListener(this);
        p4.add(cmdsubmit4);
        cmdsubmit4.setBounds(865, 828, 100, 27);
        
        ta5.setFont(new Font("Serif", 0, 14)); 
        ta5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Participants Served", "Graduates", "Termination", "GEDs Recieved", "Drug Free Babies", 
            }
        ));
        ta5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        s19.setViewportView(ta5);
        p4.add(s19);
        columnWidths(ta5);
        s19.setBounds(865, 868, 430, 100);
        
        
        s16.setViewportView(p4);
        t1.addTab("Quarterly Report", s16);
        
        s17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        s17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        p5.setFont(new Font("Serif", 0, 16)); 
        p5.setMinimumSize(new Dimension(900, 900));
        p5.setPreferredSize(new Dimension(1600, 1000));
        p5.setLayout(null); 
        p5.setBackground(new Color(240, 255, 255));
        p5.addMouseListener(this);
        
        label85.setFont(new Font("Serif", 0, 16));
        label85.setText("Post Graduation");
        p5.add(label85);
        label85.setBounds(10, 20, 120, 25);

        
        label86.setFont(new Font("Serif", 0, 16));
        label86.setText("Today's Date (Ex: 2012-06-28):");
        p5.add(label86);
        label86.setBounds(10, 65, 200, 25);
        
        txttodaysdate2.setFont(new Font("Serif", 0, 14)); 
        p5.add(txttodaysdate2);
        txttodaysdate2.setBounds(250, 64, 234, 25);
        
        label87.setFont(new Font("Serif", 0, 16));
        label87.setText("Name (Full Name):");
        p5.add(label87);
        label87.setBounds(10, 110, 120, 25);
        
        txtname4.setFont(new Font("Serif", 0, 14)); 
        p5.add(txtname4);
        txtname4.setBounds(250, 109, 234, 25);
        
        label88.setFont(new Font("Serif", 0, 16));
        label88.setText("Date of Birth (Ex: 1970-08-25):");
        p5.add(label88);
        label88.setBounds(10, 155, 210, 25);
        
        txtbirthdate4.setFont(new Font("Serif", 0, 14)); 
        txtbirthdate4.addFocusListener(this);
        p5.add(txtbirthdate4);
        txtbirthdate4.setBounds(250, 154, 234, 25);
        
        label89.setFont(new Font("Serif", 0, 16));
        label89.setText("New Legal Charges:");
        p5.add(label89);
        label89.setBounds(10, 200, 210, 25);
        
        s20.setFont(new Font("Serif", 0, 14)); 
        txtnewcharges2.setColumns(20);
        txtnewcharges2.setFont(new Font("Serif", 0, 14)); 
        txtnewcharges2.setRows(5);
        s20.setViewportView(txtnewcharges2);
        txtnewcharges2.setLineWrap(true);
        txtnewcharges2.setWrapStyleWord(true);
        p5.add(s20);
        s20.setBounds(250, 201, 234, 66);
        
        label90.setFont(new Font("Serif", 0, 16));
        label90.setText("Reason for Arrest:");
        p5.add(label90);
        label90.setBounds(10, 285, 210, 25);
        
        s21.setFont(new Font("Serif", 0, 14)); 
        txtarrestreason.setColumns(20);
        txtarrestreason.setFont(new Font("Serif", 0, 14)); 
        txtarrestreason.setRows(5);
        s21.setViewportView(txtarrestreason);
        txtarrestreason.setLineWrap(true);
        txtarrestreason.setWrapStyleWord(true);
        p5.add(s21);
        s21.setBounds(250, 285, 234, 66);
        
        cmdsubmit5.setFont(new Font("Serif", 0, 14)); 
        cmdsubmit5.setText("Submit");
        cmdsubmit5.addActionListener(this);
        p5.add(cmdsubmit5);
        cmdsubmit5.setBounds(250, 380, 100, 27);
        
        cmdclear7.setFont(new Font("Serif", 0, 14)); 
        cmdclear7.setText("Clear Form");
        cmdclear7.addActionListener(this);
        p5.add(cmdclear7);
        cmdclear7.setBounds(384, 380, 100, 27);
        
        ta6.setFont(new Font("Serif", 0, 14)); 
        ta6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entry_Date", "Name", "Birth_Date", "New_Arrest", "Reason", 
            }
        ));
        ta6.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        s22.setViewportView(ta6);
        p5.add(s22);
        s22.setBounds(700, 80, 450, 250);
        
        cmdrefresh4.setFont(new Font("Serif", 0, 14)); 
        cmdrefresh4.setText("Refresh Table");
        cmdrefresh4.addActionListener(this);
        p5.add(cmdrefresh4);
        cmdrefresh4.setBounds(700, 360, 130, 27);

        cmdupdate4.setFont(new Font("Serif", 0, 14)); 
        cmdupdate4.setText("Update Table");
        cmdupdate4.addActionListener(this);
        p5.add(cmdupdate4);
        cmdupdate4.setBounds(860, 360, 130, 27);

        cmddelete4.setFont(new Font("Serif", 0, 14)); 
        cmddelete4.setText("Delete Entry");
        cmddelete4.addActionListener(this);
        p5.add(cmddelete4);
        cmddelete4.setBounds(1020, 360, 130, 27);
        
        s17.setViewportView(p5);
        t1.addTab("Post Graduation", s17);
        
        s14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        s14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        p3.setFont(new Font("Serif", 0, 16)); 
        p3.setMinimumSize(new Dimension(900, 900));
        p3.setPreferredSize(new Dimension(2300, 2000));
        p3.setLayout(null); 
        p3.setBackground(new Color(240, 255, 255));
        p3.addMouseListener(this);
        
        label38.setFont(new Font("Serif", 0, 16)); 
        label38.setText("Search Entire Database between Dates");
        p3.add(label38);
        label38.setBounds(10, 10, 600, 22);
        
        label39.setFont(new Font("Serif", 0, 16)); 
        label39.setText("Enter the First Date:");
        p3.add(label39);
        label39.setBounds(10, 50, 160, 22);
        
        txtdate.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtdate);
        txtdate.setBounds(165, 51, 200, 25);
        
        label40.setFont(new Font("Serif", 0, 16)); 
        label40.setText("Enter the Second Date:");
        p3.add(label40);
        label40.setBounds(10, 90, 200, 22);
        
        txtdate2.setFont(new Font("Serif", 0, 14)); 
        p3.add(txtdate2);
        txtdate2.setBounds(165, 91, 200, 25);
        
        cmdsearch1.setFont(new Font("Serif", 0, 14)); 
        cmdsearch1.setText("Search");
        cmdsearch1.addActionListener(this);
        p3.add(cmdsearch1);
        cmdsearch1.setBounds(30, 150, 100, 27);
        
        cmdclear5.setFont(new Font("Serif", 0, 14)); 
        cmdclear5.setText("Clear Table");
        cmdclear5.addActionListener(this);
        p3.add(cmdclear5);
        cmdclear5.setBounds(160, 150, 100, 27);
                
        label99.setFont(new Font("Serif", 0, 16));
        label99.setText("Court Reviews By Date");
        p3.add(label99);
        label99.setBounds(50, 230, 200, 22);
          
        ta3.setFont(new Font("Serif", 0, 14)); 
        ta3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
             "Court_Appearance", "Review_Date", "Case_Number", "Candidates_Name", "Candidates_Birth_Date", "Acceptance", "Reason"   
            }
        ));
        ta3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        columnWidths(ta3);
        s15.setViewportView(ta3);     
        p3.add(s15);
        s15.setBounds(50, 270, 898, 300);
        
        ta8.setFont(new Font("Serif", 0, 14)); 
        ta8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
             "Accepted", "Rejected"
            }
        ));
        ta8.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ta8.setRowHeight(10,20);
        columnWidths(ta8);
        s26.setViewportView(ta8);     
        p3.add(s26);
        s26.setBounds(1100, 270, 300, 70);
        
        label100.setFont(new Font("Serif", 0, 16));
        label100.setText("Demographics By Date");
        p3.add(label100);
        label100.setBounds(50, 660, 200, 22);
        
        ta9.setFont(new Font("Serif", 0, 14)); 
        ta9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
             "Entry_Date", "Case_Number", "Name", "Birth_Date", "Drugs_Used", "Other_Drug", "Age_Drug_First", "Age_Regular_Drug", "Age_Alcohol_First", "Age_Regular_Alcohol", "Mental_Treatment", "Drug_Treatment", "Drug_Free_Babies", "Children", "Age_of_Child", "Gender", "Ethnicity", "Formal_Education", "Other_Education", "Sources_Income", "Prior_Convictions", "Explain_Convictions", "Amount_Convictions", "Parental_Rights_Taken"
            }
        ));
        ta9.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        columnWidths(ta9);
        s27.setViewportView(ta9);     
        p3.add(s27);
        s27.setBounds(50, 700, 1300, 300);
        
        ta10.setFont(new Font("Serif", 0, 14)); 
        ta10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
             "Drug Free Babies Born", "Prior Mental Treatment", "Prior Drug Abuse Treatment"
             
            }
        ));
        ta10.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        columnWidths(ta10);
        s28.setViewportView(ta10);     
        p3.add(s28);
        s28.setBounds(1500, 700, 500, 70);
        
        label101.setFont(new Font("Serif", 0, 16));
        label101.setText("Weekly Data By Date");
        p3.add(label101);
        label101.setBounds(50, 1100, 200, 22);
        
        ta11.setFont(new Font("Serif", 0, 14)); 
        ta11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
             "Entry_Date", "Participant_Nmbr", "Name", "Birth_Date", "Phase", "Termin_Date", "Termin_Date", "Grad_Date", "Hold_N_Date", "Last_Step_Cmplt", "Fee_Balance", "Fee_Amount", "Fees_Paid", "Fees_Other", "Date_of_Offense", "Reason_Sanction", "Type_Sanction", "Date_Exp_Sanction", "DrugScreen_Date", "Screen_Results", "Drug_Found", "Drug_Court_Atnd", "NA_Atnd, AA_Atnd", "Court_Ses_Atnd", "New_Charges", "Employment", "Counselor_Comments"   
            }
        ));
        ta11.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        columnWidths(ta11);
        s29.setViewportView(ta11);     
        p3.add(s29);
        s29.setBounds(50, 1140, 1300, 300);
        
        ta12.setFont(new Font("Serif", 0, 14)); 
        ta12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
             "Terminated", "Positive Drug Screen Results", "Amount of Drug Screens", "Urine Tests", "Breath Tests", "Saliva Tests", "Hair Tests", "Diploma or GED Recieved"
            }
        ));
        ta12.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        columnWidths(ta12);
        s30.setViewportView(ta12);     
        p3.add(s30);
        s30.setBounds(1500, 1140, 700, 70);
        
        label102.setFont(new Font("Serif", 0, 16));
        label102.setText("Basic Information By Date");
        p3.add(label102);
        label102.setBounds(50, 1550, 220, 22);
        
        ta13.setFont(new Font("Serif", 0, 14)); 
        ta13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
             "Case_Number", "Entry_Date", "Date_of_Intake", "Participants_Name", "Date_of_Birth", "Age", "Address", "Phone_Number", "Legal_Charge", "Employer_Name", "Employer_Phone", "Contact_Name", "Residential_Treatment"   
            }
        ));
        ta13.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        columnWidths(ta13);
        s31.setViewportView(ta13);     
        p3.add(s31);
        s31.setBounds(50, 1590, 1100, 300);
        
        ta14.setFont(new Font("Serif", 0, 14)); 
        ta14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
             "Participants in Residential Facilities"
            }
        ));
        ta14.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        columnWidths(ta14);
        s32.setViewportView(ta14);     
        p3.add(s32);
        s32.setBounds(1300, 1590, 220, 70);

        s14.setViewportView(p3);
        t1.addTab("Search Database", s14); 
        
        URL icon = this.getClass().getClassLoader().getResource("courthouse.jpg");
        ImageIcon ic = new ImageIcon(icon);
        setIconImage(ic.getImage());

        getContentPane().add(t1);
    }
      @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
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
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == save) {
            County.this.saveActionPerformed(evt);
        }
        else if (evt.getSource() == print) {
            County.this.printActionPerformed(evt); 
        }
        else if (evt.getSource() == exit) {
            County.this.exitActionPerformed(evt);
        }
        else if (evt.getSource() == courtreview) {
            County.this.courtreviewActionPerformed(evt);
        }
        else if (evt.getSource() == bsubmit) {
            County.this.bsubmitActionPerformed(evt);
        }
        else if (evt.getSource() == basicinformation) {
            County.this.basicinformationActionPerformed(evt);
        }
        else if (evt.getSource() == bsubmit2) {
            County.this.bsubmit2ActionPerformed(evt);
        }
        else if (evt.getSource() == weeklydata) {
            County.this.weeklydataActionPerformed(evt);
        }
        else if (evt.getSource() == bsubmit3) {
            County.this.bsubmit3ActionPerformed(evt);
        }
        else if (evt.getSource() == quarterlyreport) {
            County.this.quarterlyreportActionPerformed(evt);
        }
        else if (evt.getSource() == bsubmit4) {
            County.this.bsubmit4ActionPerformed(evt);
        }
        else if (evt.getSource() == postgraduation) {
            County.this.postgraduationActionPerformed(evt);
        }
        else if (evt.getSource() == htables) {
            County.this.htablesActionPerformed(evt);
        }
        else if (evt.getSource() == bsubmit5) {
            County.this.bsubmit5ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit1) {
            County.this.cmdsubmit1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit2) {
            County.this.cmdsubmit2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit3) {
            County.this.cmdsubmit3ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit4) {
            County.this.cmdsubmit4ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit5) {
            County.this.cmdsubmit5ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsubmit6) {
            County.this.cmdsubmit6ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclearform1) {
            County.this.cmdclearform1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclearform2) {
            County.this.cmdclearform2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear5) {
            County.this.cmdclear5ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear6) {
            County.this.cmdclear6ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear7) {
            County.this.cmdclear7ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdclear8) {
            County.this.cmdclear8ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdrefresh1) {
            County.this.cmdrefresh1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdrefresh2) {
            County.this.cmdrefresh2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdrefresh3) {
            County.this.cmdrefresh3ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdrefresh4) {
            County.this.cmdrefresh4ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdrefresh5) {
            County.this.cmdrefresh5ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdupdate1) {
            County.this.cmdupdate1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdupdate2) {
            County.this.cmdupdate2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdupdate3) {
            County.this.cmdupdate3ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdupdate4) {
            County.this.cmdupdate4ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdupdate5) {
            County.this.cmdupdate5ActionPerformed(evt);
        }
        else if (evt.getSource() == cmddelete1) {
            County.this.cmddelete1ActionPerformed(evt);
        }
        else if (evt.getSource() == cmddelete2) {
            County.this.cmddelete2ActionPerformed(evt);
        }
        else if (evt.getSource() == cmddelete3) {
            County.this.cmddelete3ActionPerformed(evt);
        }
        else if (evt.getSource() == cmddelete4) {
            County.this.cmddelete4ActionPerformed(evt);
        }
        else if (evt.getSource() == cmddelete5) {
            County.this.cmddelete5ActionPerformed(evt);
        }
        else if (evt.getSource() == cmdsearch1) {
            County.this.cmdsearch1ActionPerformed(evt);
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
        if (evt.getSource() == County.this) {
            try {
                County.this.formWindowOpened(evt);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(County.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
      @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
    }

      @Override
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (evt.getSource() == txtcasenumber1) {
            County.this.txtcasenumber1FocusLost(evt);
        }
        else if (evt.getSource() == txtbirthdate2) {
            County.this.txtbirthdate2FocusLost(evt);
        }
        else if (evt.getSource() == txtbirthdate4) {
            County.this.txtbirthdate4FocusLost(evt);
        }
    }
    
    
    public void txtcasenumber1FocusLost(java.awt.event.FocusEvent evt) {       
                                   
        z69 = txtcasenumber1.getText();
        String sql = "SELECT * FROM court_reviews WHERE Case_Number = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtcasenumber1.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            z70 = rs.getString("Case_Number");
            }      
        }catch (SQLException e){} 
        try {
            if (z69.equals(z70)) { 
                 JOptionPane.showMessageDialog(null,"Case Number Found");
            }
            else {              
              JOptionPane.showMessageDialog(null,"Case Number Not Found");
            }            
        }catch (HeadlessException e){}
    }
    
    public void txtbirthdate2FocusLost(java.awt.event.FocusEvent evt) {       
                                   
        caz = txtname2.getText();
        caz2 = txtbirthdate2.getText();
        String sql = "SELECT * FROM basic_information WHERE Participants_Name = ? AND Date_of_Birth = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname2.getText());
            pst.setString(2, txtbirthdate2.getText());
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
        }catch (HeadlessException e){}
    }
    
    public void txtbirthdate4FocusLost(java.awt.event.FocusEvent evt) {       
                                   
        caz1 = txtname4.getText();
        caz21 = txtbirthdate4.getText();
        String sql = "SELECT * FROM basic_information WHERE Participants_Name = ? AND Date_of_Birth = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtname4.getText());
            pst.setString(2, txtbirthdate4.getText());
            rs = pst.executeQuery();
            while(rs.next()){
            sx1 = rs.getString("Participants_Name");
            sx2 = rs.getString("Date_of_Birth");
            }      
        }catch (SQLException e){} 
        try {
            if ((caz1.equals(sx1))&&(caz21.equals(sx2))) { 
                 JOptionPane.showMessageDialog(null,"Name & Birth Date Found");
            }
            else {              
              JOptionPane.showMessageDialog(null,"Name & Birth Date Not Found");
            }            
        }catch (HeadlessException e){}
    }   
    
    public void saveActionPerformed(java.awt.event.ActionEvent evt) {          
        
        if(t1.getTitleAt(t1.getSelectedIndex()).equals("Court Reviews")){
          String out1 = label91.getText();         
          String out2 = label92.getText();       
          String out3 = txtcourtdate.getText();        
          String out4 = label93.getText();        
          String out5 = txtreviewdate.getText();       
          String out6 = label94.getText();        
          String out7 = txtcasenumber2.getText();        
          String out8 = label95.getText();        
          String out9 = txtname5.getText();        
          String out10 = label96.getText();        
          String out11 = txtbirthdate5.getText();        
          String out12 = label97.getText();               
          String out13 = (String) boxacceptance.getSelectedItem();
          String out14 = label98.getText();
          String out15 = txtreason.getText();
          String out16 = out1+"\n\n"+out2+"  "+out3+"\n\n"+out4+"  "+out5+"\n\n"+out6+"  "+out7+"\n\n"+out8+"  "+out9+"\n\n"+out10+"  "+out11+"\n\n"+out12+"  "+out13+"\n\n"+out14+"  "+out15;
          JFileChooser saver = new JFileChooser("./");  
        int returnVal = saver.showSaveDialog(this);  
        File fileSaver = saver.getSelectedFile();
        if (returnVal == JFileChooser.APPROVE_OPTION)  
        {  
            try  
            {  
                try (BufferedWriter writer = new BufferedWriter( new FileWriter( fileSaver.getAbsolutePath()+".doc"))) {
                    writer.write(out16);
                }  
            JOptionPane.showMessageDialog(this, "Court Reviews was Saved Successfully!",  
                        "Success!", JOptionPane.INFORMATION_MESSAGE);  
            }  
            catch (IOException e)  
            {  
            JOptionPane.showMessageDialog(this, "The Text could not be Saved!",  
                        "Error!", JOptionPane.INFORMATION_MESSAGE);  
            }  
        } 
        } 
         if(t1.getTitleAt(t1.getSelectedIndex()).equals("Basic Information")){
          String out17 = label1.getText();         
          String out18 = label2.getText();       
          String out19 = txtcasenumber1.getText();        
          String out20 = label3.getText();        
          String out21 = txtentrydate.getText();       
          String out22 = label4.getText();        
          String out23 = txtdateofintake.getText();        
          String out24 = label5.getText();        
          String out25 = txtparticipantsname1.getText();        
          String out26 = label6.getText();        
          String out27 = txtdateofbirth.getText();        
          String out28 = label7.getText();               
          String out29 = txtage1.getText();
          String out30 = label9.getText();
          String out31 = txtaddress1.getText();
          String out32 = label8.getText();
          String out33 = txtphonenumber1.getText();
          String out34 = label10.getText();
          String out35 = txtlegalcharge.getText();
          String out36 = label11.getText();
          String out37 = txtemployername.getText();
          String out38 = label12.getText();
          String out39 = txtemployerphone.getText();
          String out40 = label13.getText();
          String out41 = txtcontactname.getText();
          String out42 = jlabel13.getText();         
          String out43 = (String) boxresidentialtreatment.getSelectedItem();
          String out44 = out17+"\n\n"+out18+"  "+out19+"\n\n"+out20+"  "+out21+"\n\n"+out22+"  "+out23+"\n\n"+out24+"  "+out25+"\n\n"+out26+"  "+out27+"\n\n"+out28+"  "+out29+"\n\n"+out30+"  "+out31+"\n\n"+out32+"  "+out33+"\n\n"+out34+"  "+out35+"\n\n"+out36+"  "+out37+"\n\n"+out38+"  "+out39+"\n\n"+out40+"  "+out41+"\n\n"+out42+"  "+out43; 
          JFileChooser saver = new JFileChooser("./");  
        int returnVal = saver.showSaveDialog(this);  
        File fileSelector = saver.getSelectedFile();  
        if (returnVal == JFileChooser.APPROVE_OPTION)  
        {  
            try  
            {  
                try (BufferedWriter writer = new BufferedWriter( new FileWriter( fileSelector.getAbsolutePath()+".doc"))) {
                    writer.write(out44);
                }  
            JOptionPane.showMessageDialog(this, "Basic Information was Saved Successfully!",  
                        "Success!", JOptionPane.INFORMATION_MESSAGE);  
            }  
            catch (IOException e)  
            {  
            JOptionPane.showMessageDialog(this, "The Text could not be Saved!",  
                        "Error!", JOptionPane.INFORMATION_MESSAGE);  
            }  
        } 
        }  
         if(t1.getTitleAt(t1.getSelectedIndex()).equals("Weekly Data")){
          String out45 = label14.getText();         
          String out46 = jlabel17.getText();       
          String out47 = txttodaysdate.getText();        
          String out48 = label17.getText();        
          String out49 = txtparticipantsnumber.getText();       
          String out50 = label18.getText();        
          String out51 = txtname2.getText();        
          String out52 = label19.getText();        
          String out53 = txtbirthdate2.getText();        
          String out54 = label15.getText();        
          String out55 = (String) boxphase.getSelectedItem();        
          String out56 = jlabel20.getText();               
          String out57 = txtterminationdate.getText();
          String out58 = label20.getText();
          String out59 = txtreasontermination.getText();
          String out60 = label21.getText();
          String out61 = txtgraddate.getText();
          String out62 = label22.getText();
          String out63 = txtreasononhold.getText();
          String out64 = label16.getText();
          String out65 = (String) boxstep.getSelectedItem();
          String out66 = jlabel26.getText();
          String out67 = txtfeebalance.getText();
          String out68 = jlabel25.getText();
          String out69 = txtfeeamount.getText();
          String out70 = label23.getText();
          String out71 = (String) boxfees.getSelectedItem();
          String out72 = label24.getText();         
          String out73 = txtotherfees.getText();       
          String out74 = label25.getText();        
          String out75 = txtoffensedate.getText();        
          String out76 = label26.getText();       
          String out77 = txtreasonsanction.getText();        
          String out78 = label27.getText();        
          String out79 = txttypesanction.getText();        
          String out80 = label28.getText();        
          String out81 = txtsanctionorder.getText();        
          String out82 = label29.getText();        
          String out83 = txtdatescreening.getText();               
          String out84 = jlabel30.getText();
          String out85 = (String) boxscreeningtypes.getSelectedItem();
          String out86 = label30.getText();
          String out87 = (String) boxscreeningresults.getSelectedItem();
          String out88 = label37.getText();
          String out89 = txtpositive.getText();
          String out90 = label31.getText();
          String out91 = txtdrugcourtattendance.getText();
          String out92 = label32.getText();
          String out93 = txtna.getText();
          String out94 = label33.getText();
          String out95 = txtaa.getText();
          String out96 = label34.getText();
          String out97 = txtcourtsessions.getText();
          String out98 = jlabel35.getText();
          String out99 = txtnewcharges.getText();
          String out100 = label35.getText();
          String out101 = (String) boxjobsituation2.getSelectedItem();
          String out102 = jlabel36.getText();
          String out103 = jlabel37.getText();
          String out104 = (String) boxdiploma.getSelectedItem();
          String out105 = label36.getText();
          String out106 = txtcounselor.getText();
          String out107 = out45+"\n\n"+out46+"  "+out47+"\n\n"+out48+"  "+out49+"\n\n"+out50+"  "+out51+"\n\n"+out52+"  "+out53+"\n\n"+out54+"  "+out55+"\n\n"+out56+"  "+out57+"\n\n"+out58+"  "+out59+"\n\n"+out60+"  "+out61+"\n\n"+out62+"  "+out63+"\n\n"+out64+"  "+out65+"\n\n"+out66+"  "+out67+"\n\n"+out68+"  "+out69+"\n\n"+out70+"  "+out71+"\n\n"+out72+"  "+out73+"\n\n"+out74+"  "+out75+"\n\n"+out76+"  "+out77+"\n\n"+out78+"  "+out79+"\n\n"+out80+"  "+out81+"\n\n"+out82+"  "+out83+"\n\n"+out84+"  "+out85+"\n\n"+out86+"  "+out87+"\n\n"+out88+"  "+out89+"\n\n"+out90+"  "+out91+"\n\n"+out92+"  "+out93+"\n\n"+out94+"  "+out95+"\n\n"+out96+"  "+out97+"\n\n"+out98+"  "+out99+"\n\n"+out100+"  "+out101+"\n\n"+out102+"\n"+out103+"  "+out104+"\n\n"+out105+"  "+out106; 
          JFileChooser saver = new JFileChooser("./");  
        int returnVal = saver.showSaveDialog(this);  
        File getFile = saver.getSelectedFile();
        if (returnVal == JFileChooser.APPROVE_OPTION)  
        {  
            try  
            {  
                try (BufferedWriter writer = new BufferedWriter( new FileWriter( getFile.getAbsolutePath()+".doc"))) {
                    writer.write(out107);
                }  
            JOptionPane.showMessageDialog(this, "Weekly Data was Saved Successfully!",  
                        "Success!", JOptionPane.INFORMATION_MESSAGE);  
            }  
            catch (IOException e)  
            {  
            JOptionPane.showMessageDialog(this, "The Text could not be Saved!",  
                        "Error!", JOptionPane.INFORMATION_MESSAGE);  
            }  
        } 
        } 
         if(t1.getTitleAt(t1.getSelectedIndex()).equals("Quarterly Report")){
          String out107 = label41.getText();         
          String out108 = label43.getText();       
          String out109 = txtquarterlydate.getText();        
          String out110 = label42.getText();        
          String out111 = (String) boxquarterly.getSelectedItem();       
          String out112 = label44.getText();        
          String out113 = label45.getText();        
          String out114 = txtnumberreviewed.getText();        
          String out115 = label46.getText();        
          String out116 = label47.getText();        
          String out117 = txtnumberaccepted.getText();        
          String out118 = label48.getText();               
          String out119 = label49.getText();
          String out120 = txtnumberrejected.getText();
          String out121 = label50.getText();
          String out122 = txtnumberdeclined.getText();
          String out123 = label51.getText();
          String out124 = txtnumberrejectedotherreasons.getText();
          String out125 = label52.getText();
          String out126 = label53.getText();
          String out127 = txtnumberawol.getText();
          String out128 = label54.getText();
          String out129 = label55.getText();
          String out130 = txtnumberterminated.getText();
          String out131 = label56.getText();
          String out132 = txtnumberdrugfreebabies.getText();
          String out133 = label57.getText();
          String out134 = label58.getText();         
          String out135 = txtnumberrigthsterminated.getText();       
          String out136 = label59.getText();        
          String out137 = label60.getText();        
          String out138 = txtnumbergeds.getText();       
          String out139 = label61.getText();        
          String out140 = label62.getText();        
          String out141 = label63.getText();        
          String out142 = label64.getText();        
          String out143 = txtstartwages.getText();        
          String out144 = label65.getText();        
          String out145 = txtendwages.getText();               
          String out146 = label66.getText();
          String out147 = label67.getText();
          String out148 = label68.getText();
          String out149 = (String) boxnumberasam.getSelectedItem();
          String out150 = label69.getText();
          String out151 = label70.getText();
          String out152 = txtnumberdrugscreen.getText();
          String out153 = label71.getText();
          String out154 = txtnumberurine.getText();
          String out155 = label72.getText();
          String out156 = txtnumberbreath.getText();
          String out157 = label73.getText();
          String out158 = txtnumbersaliva.getText();
          String out159 = label74.getText();
          String out160 = txtnumberhair.getText();
          String out161 = label75.getText();
          String out162 = label76.getText();
          String out163 = txtresidentialtreat.getText();
          String out164 = label77.getText();
          String out165 = label78.getText();
          String out166 = txtmentalillness.getText();
          String out167 = label79.getText();
          String out168 = label80.getText();
          String out169 = txtsubstanceabuse.getText();
          String out170 = label82.getText();
          String out171 = txtnumbergraduates.getText();
          String out172 = out107+"\n\n\n"+out108+"  "+out109+"\n\n"+out110+"  "+out111+"\n\n"+out112+" "+out113+"   "+out114+"\n\n"+out115+" "+out116+"  "+out117+"\n\n"+out118+" "+out119+"  "+out120+"\n\n"+out121+"  "+out122+"\n\n"+out123+"  "+out124+"\n\n"+out125+" "+out126+"  "+out127+"\n\n"+out128+" "+out129+"  "+out130+"\n\n"+out131+"  "+out132+"\n\n"+out133+" "+out134+"  "+out135+"\n\n"+out136+" "+out137+"  "+out138+"\n\n"+out139+" "+out140+" "+out141+" "+out142+"  "+out143+" "+out144+" "+out145+"\n\n"+out146+" "+out147+" "+out148+"  "+out149+"\n\n"+out150+" "+out151+"  "+out152+"\n\n"+out153+"  "+out154+"\n\n"+out155+"  "+out156+"\n\n"+out157+"  "+out158+"\n\n"+out159+"  "+out160+"\n\n"+out161+" "+out162+" "+out163+"\n\n"+out164+" "+out165+"  "+out166+"\n\n"+out167+" "+out168+"  "+out169+"\n\n"+out170+"  "+out171; 
          JFileChooser saver = new JFileChooser("./");  
        int returnVal = saver.showSaveDialog(this);  
        File choseFile = saver.getSelectedFile();  
        if (returnVal == JFileChooser.APPROVE_OPTION)  
        {  
            try  
            {  
                try (BufferedWriter writer = new BufferedWriter( new FileWriter( choseFile.getAbsolutePath()+".doc"))) {
                    writer.write(out172);
                }  
            JOptionPane.showMessageDialog(this, "Quarterly Report was Saved Successfully!",  
                        "Success!", JOptionPane.INFORMATION_MESSAGE);  
            }  
            catch (IOException e)  
            {  
            JOptionPane.showMessageDialog(this, "The Text could not be Saved!",  
                        "Error!", JOptionPane.INFORMATION_MESSAGE);  
            }  
        } 
        } 
         if(t1.getTitleAt(t1.getSelectedIndex()).equals("Post Graduation")){
          String out173 = label85.getText();         
          String out174 = label86.getText();       
          String out175 = txttodaysdate2.getText();        
          String out176 = label87.getText();        
          String out177 = txtname4.getText(); 
          String out178 = label88.getText();         
          String out179 = txtbirthdate4.getText();       
          String out180 = label89.getText();        
          String out181 = txtnewcharges2.getText();        
          String out182 = label90.getText();
          String out183 = txtarrestreason.getText();
          String out184 = out173+"\n\n\n"+out174+"  "+out175+"\n\n"+out176+"  "+out177+"\n\n"+out178+"  "+out179+"\n\n"+out180+"  "+out181+"\n\n"+out182+"  "+out183;
          JFileChooser saver = new JFileChooser("./");  
        int returnVal = saver.showSaveDialog(this);  
        File writeFile = saver.getSelectedFile(); 
        if (returnVal == JFileChooser.APPROVE_OPTION)  
        {  
            try  
            {  
                try (BufferedWriter writer = new BufferedWriter( new FileWriter( writeFile.getAbsolutePath()+".doc"))) {
                    writer.write(out184);
                }  
            JOptionPane.showMessageDialog(this, "Post Graduation was Saved Successfully!",  
                        "Success!", JOptionPane.INFORMATION_MESSAGE);  
            }  
            catch (IOException e)  
            {  
            JOptionPane.showMessageDialog(this, "The Text could not be Saved!",  
                        "Error!", JOptionPane.INFORMATION_MESSAGE);  
            }  
        } 
        }   
    } 
    
    public void printActionPerformed(java.awt.event.ActionEvent evt) {  
          switch (t1.getTitleAt(t1.getSelectedIndex())) {
              case "Court Reviews":
                  {
                      String out1 = label91.getText();
                      String out2 = label92.getText();
                      String out3 = txtcourtdate.getText();
                      String out4 = label93.getText();
                      String out5 = txtreviewdate.getText();
                      String out6 = label94.getText();
                      String out7 = txtcasenumber2.getText();
                      String out8 = label95.getText();
                      String out9 = txtname5.getText();
                      String out10 = label96.getText();
                      String out11 = txtbirthdate5.getText();
                      String out12 = label97.getText();
                      String out13 = (String) boxacceptance.getSelectedItem();
                      String out14 = label98.getText();
                      String out15 = txtreason.getText();
                      String printCourt = "\n"+out1+"\n\n"+out2+"  "+out3+"\n\n"+out4+"  "+out5+"\n\n"+out6+"  "+out7+"\n\n"+out8+"  "+out9+"\n\n"+out10+"  "+out11+"\n\n"+out12+"  "+out13+"\n\n"+out14+"\n"+out15;
                      PrinterJob job = PrinterJob.getPrinterJob();
                      Book bk = new Book();
                      bk.append(new County(printCourt), job.defaultPage());
                      job.setPageable(bk);
                      if (job.printDialog())
                      {      
                          try { job.print(); }
                          catch (PrinterException e) { }
                      }           break;
                  }
              case "Basic Information":
                  {
                      String out17 = label1.getText();
                      String out18 = label2.getText();
                      String out19 = txtcasenumber1.getText();
                      String out20 = label3.getText();
                      String out21 = txtentrydate.getText();
                      String out22 = label4.getText();
                      String out23 = txtdateofintake.getText();
                      String out24 = label5.getText();
                      String out25 = txtparticipantsname1.getText();
                      String out26 = label6.getText();
                      String out27 = txtdateofbirth.getText();
                      String out28 = label7.getText();
                      String out29 = txtage1.getText();
                      String out30 = label9.getText();
                      String out31 = txtaddress1.getText();
                      String out32 = label8.getText();
                      String out33 = txtphonenumber1.getText();
                      String out34 = label10.getText();
                      String out35 = txtlegalcharge.getText();
                      String out36 = label11.getText();
                      String out37 = txtemployername.getText();
                      String out38 = label12.getText();
                      String out39 = txtemployerphone.getText();
                      String out40 = label13.getText();
                      String out41 = txtcontactname.getText();
                      String out42 = jlabel13.getText();
                      String out43 = (String) boxresidentialtreatment.getSelectedItem();
                      String printBasicInfo = "\n"+out17+"\n\n"+out18+"  "+out19+"\n\n"+out20+"  "+out21+"\n\n"+out22+"  "+out23+"\n\n"+out24+"\n"+out25+"\n\n"+out26+"  "+out27+"\n\n"+out28+"  "+out29+"\n\n"+out30+"  "+out31+"\n\n"+out32+"  "+out33+"\n\n"+out34+"  "+out35+"\n\n"+out36+"  "+out37+"\n\n"+out38+"  "+out39+"\n\n"+out40+"  "+out41+"\n\n"+out42+"  "+out43;
                      PrinterJob job = PrinterJob.getPrinterJob();
                      Book bk = new Book();
                      bk.append(new County(printBasicInfo), job.defaultPage());
                      job.setPageable(bk);
                      if (job.printDialog())
                      {
                          try { job.print(); }
                          catch (PrinterException e) { }
                      }           break;
                  }
              case "Weekly Data":
                  {
                      String out45 = label14.getText();
                      String out46 = jlabel17.getText();
                      String out47 = txttodaysdate.getText();
                      String out48 = label17.getText();
                      String out49 = txtparticipantsnumber.getText();
                      String out50 = label18.getText();
                      String out51 = txtname2.getText();
                      String out52 = label19.getText();
                      String out53 = txtbirthdate2.getText();
                      String out54 = label15.getText();
                      String out55 = (String) boxphase.getSelectedItem();
                      String out56 = jlabel20.getText();
                      String out57 = txtterminationdate.getText();
                      String out58 = label20.getText();
                      String out59 = txtreasontermination.getText();
                      String out60 = label21.getText();
                      String out61 = txtgraddate.getText();
                      String out62 = label22.getText();
                      String out63 = txtreasononhold.getText();
                      String out64 = label16.getText();
                      String out65 = (String) boxstep.getSelectedItem();
                      String out66 = jlabel26.getText();
                      String out67 = txtfeebalance.getText();
                      String out68 = jlabel25.getText();
                      String out69 = txtfeeamount.getText();
                      String out70 = label23.getText();
                      String out71 = (String) boxfees.getSelectedItem();
                      String out72 = label24.getText();
                      String out73 = txtotherfees.getText();
                      String out74 = label25.getText();
                      String out75 = txtoffensedate.getText();
                      String out76 = label26.getText();
                      String out77 = txtreasonsanction.getText();
                      String out78 = label27.getText();
                      String out79 = txttypesanction.getText();
                      String out80 = label28.getText();
                      String out81 = txtsanctionorder.getText();
                      String out82 = label29.getText();
                      String out83 = txtdatescreening.getText();
                      String out84 = jlabel30.getText();
                      String out85 = (String) boxscreeningtypes.getSelectedItem();
                      String out86 = label30.getText();
                      String out87 = (String) boxscreeningresults.getSelectedItem();
                      String out88 = label37.getText();
                      String out89 = txtpositive.getText();
                      String out90 = label31.getText();
                      String out91 = txtdrugcourtattendance.getText();
                      String out92 = label32.getText();
                      String out93 = txtna.getText();
                      String out94 = label33.getText();
                      String out95 = txtaa.getText();
                      String out96 = label34.getText();
                      String out97 = txtcourtsessions.getText();
                      String out98 = jlabel35.getText();
                      String out99 = txtnewcharges.getText();
                      String out100 = label35.getText();
                      String out101 = (String) boxjobsituation2.getSelectedItem();
                      String out102 = jlabel36.getText();
                      String out103 = jlabel37.getText();
                      String out104 = (String) boxdiploma.getSelectedItem();
                      String out105 = label36.getText();
                      String out106 = txtcounselor.getText();
                      String printWeeklyData1 = "\n"+out45+"\n\n"+out46+"  "+out47+"\n\n"+out48+"  "+out49+"\n\n"+out50+"  "+out51+"\n\n"+out52+"  "+out53+"\n\n"+out54+"  "+out55+"\n\n"+out56+"  "+out57+"\n\n"+out58+"\n"+out59+"\n\n"+out60+"  "+out61+"\n\n"+out62+"\n"+out63+"\n\n"+out64+"  "+out65+"\n\n"+out66+"  "+out67+"\n\n"+out68+"  "+out69+"\n\n"+out70+"  "+out71+"\n\n"+out72+"  "+out73+"\n\n"+out74+"  "+out75;
                      String printWeeklyData2 = "\n"+out76+"  "+out77+"\n\n"+out78+"  "+out79+"\n\n"+out80+"  "+out81+"\n\n"+out82+"  "+out83+"\n\n"+out84+"  "+out85+"\n\n"+out86+"  "+out87+"\n\n"+out88+"  "+out89+"\n\n"+out90+"  "+out91+"\n\n"+out92+"  "+out93+"\n\n"+out94+"  "+out95+"\n\n"+out96+"  "+out97+"\n\n"+out98+"  "+out99+"\n\n"+out100+"  "+out101+"\n\n"+out102+"\n"+out103+"  "+out104+"\n\n"+out105+"\n"+out106;
                      PrinterJob job = PrinterJob.getPrinterJob();
                      Book bk = new Book();
                      bk.append(new County(printWeeklyData1), job.defaultPage());
                      bk.append(new County(printWeeklyData2), job.defaultPage());
                      job.setPageable(bk);
                      if (job.printDialog())
                      {
                          try { job.print(); }
                          catch (PrinterException e) { }
                      }           break;
                  }
              case "Quarterly Report":
                  {
                      String out107 = label41.getText();
                      String out108 = label43.getText();
                      String out109 = txtquarterlydate.getText();
                      String out110 = label42.getText();
                      String out111 = (String) boxquarterly.getSelectedItem();
                      String out112 = label44.getText();
                      String out113 = label45.getText();
                      String out114 = txtnumberreviewed.getText();
                      String out115 = label46.getText();
                      String out116 = label47.getText();
                      String out117 = txtnumberaccepted.getText();
                      String out118 = label48.getText();
                      String out119 = label49.getText();
                      String out120 = txtnumberrejected.getText();
                      String out121 = label50.getText();
                      String out122 = txtnumberdeclined.getText();
                      String out123 = label51.getText();
                      String out124 = txtnumberrejectedotherreasons.getText();
                      String out125 = label52.getText();
                      String out126 = label53.getText();
                      String out127 = txtnumberawol.getText();
                      String out128 = label54.getText();
                      String out129 = label55.getText();
                      String out130 = txtnumberterminated.getText();
                      String out131 = label56.getText();
                      String out132 = txtnumberdrugfreebabies.getText();
                      String out133 = label57.getText();
                      String out134 = label58.getText();
                      String out135 = txtnumberrigthsterminated.getText();
                      String out136 = label59.getText();
                      String out137 = label60.getText();
                      String out138 = txtnumbergeds.getText();
                      String out139 = label61.getText();
                      String out140 = label62.getText();
                      String out141 = label63.getText();
                      String out142 = label64.getText();
                      String out143 = txtstartwages.getText();
                      String out144 = label65.getText();
                      String out145 = txtendwages.getText();
                      String out146 = label66.getText();
                      String out147 = label67.getText();
                      String out148 = label68.getText();
                      String out149 = (String) boxnumberasam.getSelectedItem();
                      String out150 = label69.getText();
                      String out151 = label70.getText();
                      String out152 = txtnumberdrugscreen.getText();
                      String out153 = label71.getText();
                      String out154 = txtnumberurine.getText();
                      String out155 = label72.getText();
                      String out156 = txtnumberbreath.getText();
                      String out157 = label73.getText();
                      String out158 = txtnumbersaliva.getText();
                      String out159 = label74.getText();
                      String out160 = txtnumberhair.getText();
                      String out161 = label75.getText();
                      String out162 = label76.getText();
                      String out163 = txtresidentialtreat.getText();
                      String out164 = label77.getText();
                      String out165 = label78.getText();
                      String out166 = txtmentalillness.getText();
                      String out167 = label79.getText();
                      String out168 = label80.getText();
                      String out169 = txtsubstanceabuse.getText();
                      String out170 = label82.getText();
                      String out171 = txtnumbergraduates.getText();
                      String printQuarterlyReport1 = "\n"+out107+"\n\n"+out108+"  "+out109+"\n\n"+out110+"  "+out111+"\n\n"+out112+"\n"+out113+"   "+out114+"\n\n"+out115+"\n"+out116+"  "+out117+"\n\n"+out118+"\n"+out119+"  "+out120+"\n\n"+out121+"  "+out122+"\n\n"+out123+"  "+out124+"\n\n"+out125+"\n"+out126+"  "+out127+"\n\n"+out128+"\n"+out129+"  "+out130+"\n\n"+out131+"  "+out132+"\n\n"+out133+"\n"+out134+"  "+out135+"\n\n"+out136+"\n"+out137+"  "+out138+"\n\n";
                      String printQuarterlyReport2 = "\n"+out139+"\n"+out140+"\n"+out141+"\n"+out142+":"+"   "+out143+"    "+out144+":"+"   "+out145+"\n\n"+out146+"\n"+out147+"\n"+out148+"  "+out149+"\n\n"+out150+"\n"+out151+"  "+out152+"\n\n"+out153+"  "+out154+"\n\n"+out155+"  "+out156+"\n\n"+out157+"  "+out158+"\n\n"+out159+"  "+out160+"\n\n"+out161+"\n"+out162+"  "+out163+"\n\n"+out164+"\n"+out165+"  "+out166+"\n\n"+out167+"\n"+out168+"  "+out169+"\n\n"+out170+"  "+out171;
                      PrinterJob job = PrinterJob.getPrinterJob();
                      Book bk = new Book();
                      bk.append(new County(printQuarterlyReport1), job.defaultPage());
                      bk.append(new County(printQuarterlyReport2), job.defaultPage());
                      job.setPageable(bk);
                      if (job.printDialog())
                      {
                          try { job.print(); }
                          catch (PrinterException e) { }
                      }           break;
                  }
              case "Post Graduation":
                  {
                      String out173 = label85.getText();
                      String out174 = label86.getText();
                      String out175 = txttodaysdate2.getText();
                      String out176 = label87.getText();
                      String out177 = txtname4.getText();
                      String out178 = label88.getText();
                      String out179 = txtbirthdate4.getText();
                      String out180 = label89.getText();
                      String out181 = txtnewcharges2.getText();
                      String out182 = label90.getText();
                      String out183 = txtarrestreason.getText();
                      String printPostGraduation = "\n"+out173+"\n\n"+out174+"  "+out175+"\n\n"+out176+"  "+out177+"\n\n"+out178+"  "+out179+"\n\n"+out180+"\n"+out181+"\n\n"+out182+"\n"+out183;
                      PrinterJob job = PrinterJob.getPrinterJob();
                      Book bk = new Book();
                      bk.append(new County(printPostGraduation), job.defaultPage());
                      job.setPageable(bk);
                      if (job.printDialog())
                      {
                          try { job.print(); }
                          catch (PrinterException e) { }
                      }            break;
                  }
              default:
                  break;
          }
      }
    
    public void exitActionPerformed(java.awt.event.ActionEvent evt) {          
        County.this.dispose();
    } 
    
    public void courtreviewActionPerformed(java.awt.event.ActionEvent evt) { 
       URL icon2 = this.getClass().getClassLoader().getResource("courthouse.jpg");
       ImageIcon ic2 = new ImageIcon(icon2);
       frame = new JFrame();
       frame.setTitle("Court Reviews Export to Excel"); 
       p9 = new JPanel();
       p9.setBackground(new Color(240, 255, 255));
       p9.setLayout(null);
       frame.setSize(350,280);
       lb = new JLabel("Put two dates one in each box");
       lb4 = new JLabel("File will be save in top directory C:\\courtreview.csv");
       lb2 = new JLabel("Start Review Date:");
       lb3 = new JLabel("Finish Review Date:");
       tf1 = new JTextField();
       tf2 = new JTextField();
       bsubmit = new JButton();
       lb.setFont(new Font("Serif", 0, 16));
       p9.add(lb);
       lb.setBounds(60, 20, 250, 25);
       lb4.setFont(new Font("Serif", 0 ,16));
       p9.add(lb4);
       lb4.setBounds(10,40, 330, 25);
       lb2.setFont(new Font("Serif", 0, 16));
       p9.add(lb2);
       lb2.setBounds(10, 90, 200, 25);
       tf1.setFont(new Font("Serif",0, 16));
       p9.add(tf1);
       tf1.setBounds(180, 90, 150, 27);
       lb3.setFont(new Font("Serif", 0, 16));
       p9.add(lb3);
       lb3.setBounds(10, 140, 200, 25);
       tf2.setFont(new Font("Serif",0, 16));
       p9.add(tf2);
       tf2.setBounds(180, 140, 150, 27);
       bsubmit.setFont(new Font("Serif", 0, 16));
       bsubmit.setText("Get Excel File");
       p9.add(bsubmit);
       bsubmit.addActionListener(this);
       bsubmit.setBounds(75, 200, 150, 27);
       frame.add(p9);
       frame.setIconImage(ic2.getImage());
       frame.setResizable(false);  
       frame.setVisible(true);      
    }
    
    public void bsubmitActionPerformed(java.awt.event.ActionEvent evt) {          
        String sql = "SELECT 'Court_Appearance', 'Review_Date', 'Case_Number', 'Candidates_Name', 'Candidates_Birth_Date', 'Acceptance', 'Reason' UNION SELECT * INTO OUTFILE '/courtreviews.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n' FROM court_reviews WHERE Review_Date between ? and ?;";
          try {
            pst = conn.prepareStatement(sql);            
            pst.setString(1, tf1.getText());
            pst.setString(2, tf2.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Created Excel File");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void basicinformationActionPerformed(java.awt.event.ActionEvent evt) { 
       URL icon3 = this.getClass().getClassLoader().getResource("courthouse.jpg");
       ImageIcon ic3 = new ImageIcon(icon3);
       frame2 = new JFrame();
       frame2.setTitle("Basic Information Export to Excel"); 
       p7 = new JPanel();
       p7.setBackground(new Color(240, 255, 255));
       p7.setLayout(null);
       frame2.setSize(370,280);
       lb5 = new JLabel("Put two dates one in each box");
       lb6 = new JLabel("File will be save in top directory C:\\basicinformation.csv");
       lb7 = new JLabel("Start Entry Date:");
       lb8 = new JLabel("Finish Entry Date:");
       tf3 = new JTextField();
       tf4 = new JTextField();
       bsubmit2 = new JButton();
       lb5.setFont(new Font("Serif", 0, 16));
       p7.add(lb5);
       lb5.setBounds(60, 20, 250, 25);
       lb6.setFont(new Font("Serif", 0 ,16));
       p7.add(lb6);
       lb6.setBounds(10,40, 350, 25);
       lb7.setFont(new Font("Serif", 0, 16));
       p7.add(lb7);
       lb7.setBounds(10, 90, 200, 25);
       tf3.setFont(new Font("Serif",0, 16));
       p7.add(tf3);
       tf3.setBounds(180, 90, 150, 27);
       lb8.setFont(new Font("Serif", 0, 16));
       p7.add(lb8);
       lb8.setBounds(10, 140, 200, 25);
       tf4.setFont(new Font("Serif",0, 16));
       p7.add(tf4);
       tf4.setBounds(180, 140, 150, 27);
       bsubmit2.setFont(new Font("Serif", 0, 16));
       bsubmit2.setText("Get Excel File");
       p7.add(bsubmit2);
       bsubmit2.addActionListener(this);
       bsubmit2.setBounds(75, 200, 150, 27);
       frame2.add(p7);
       frame2.setIconImage(ic3.getImage());
       frame2.setResizable(false);  
       frame2.setVisible(true);      
    }
    
    public void bsubmit2ActionPerformed(java.awt.event.ActionEvent evt) {          
        String sql = "SELECT  'Case_Number', 'Entry_Date', 'Date_of_Intake'l, 'Participants_Name', 'Date_of_Birth', 'Age', 'Address', 'Phone_Number', 'Legal_Charge', 'Employer_Name', 'Employer_Phone', 'Contact_Name','Residential_Treatment' UNION SELECT * INTO OUTFILE '/basicinformation.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n' FROM basic_information WHERE Entry_Date BETWEEN ? AND ?;";
          try {
            pst = conn.prepareStatement(sql);            
            pst.setString(1, tf3.getText());
            pst.setString(2, tf4.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Created Excel File");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void weeklydataActionPerformed(java.awt.event.ActionEvent evt) {
       URL icon4 = this.getClass().getClassLoader().getResource("courthouse.jpg");
       ImageIcon ic4 = new ImageIcon(icon4);
       frame3 = new JFrame();
       frame3.setTitle("Weekly Data Export to Excel"); 
       p8 = new JPanel();
       p8.setBackground(new Color(240, 255, 255));
       p8.setLayout(null);
       frame3.setSize(350,280);
       lb9 = new JLabel("Put two dates one in each box");
       lb10 = new JLabel("File will be save in top directory C:\\weeklydata.csv");
       lb11 = new JLabel("Start Entry Date:");
       lb12 = new JLabel("Finish Entry Date:");
       tf5 = new JTextField();
       tf6 = new JTextField();
       bsubmit3 = new JButton();
       lb9.setFont(new Font("Serif", 0, 16));
       p8.add(lb9);
       lb9.setBounds(60, 20, 250, 25);
       lb10.setFont(new Font("Serif", 0 ,16));
       p8.add(lb10);
       lb10.setBounds(10,40, 330, 25);
       lb11.setFont(new Font("Serif", 0, 16));
       p8.add(lb11);
       lb11.setBounds(10, 90, 200, 25);
       tf5.setFont(new Font("Serif",0, 16));
       p8.add(tf5);
       tf5.setBounds(180, 90, 150, 27);
       lb12.setFont(new Font("Serif", 0, 16));
       p8.add(lb12);
       lb12.setBounds(10, 140, 200, 25);
       tf6.setFont(new Font("Serif",0, 16));
       p8.add(tf6);
       tf6.setBounds(180, 140, 150, 27);
       bsubmit3.setFont(new Font("Serif", 0, 16));
       bsubmit3.setText("Get Excel File");
       p8.add(bsubmit3);
       bsubmit3.addActionListener(this);
       bsubmit3.setBounds(75, 200, 150, 27);
       frame3.add(p8);
       frame3.setIconImage(ic4.getImage());
       frame3.setResizable(false);  
       frame3.setVisible(true);      
    }
    
    public void bsubmit3ActionPerformed(java.awt.event.ActionEvent evt) {          
        String sql = "SELECT 'Entry_Date', 'Participant_Nmbr', 'Name', 'Birth_Date', 'Phase', 'Termin_Date', 'Termin', 'Grad_Date', 'Hold_N_Date', 'Last_Step_Cmplt', 'Fee_Balance', 'Fee_Amount', 'Fees_Paid', 'Fees_Other','Date_of_Offense', 'Reason_Sanction', 'Type_Sanction', 'Date_Exp_Sanction', 'Drug_Screen_Date', 'Screen_Types', 'Screen_Results', 'Drug_Found','Drug_Court_Atnd', 'NA_Atnd', 'AA_Atnd', 'Court_Ses_Atnd', 'New_Charges', 'Employment', 'Diploma_GED', 'Counselor_Comments' UNION SELECT * INTO OUTFILE '/weeklydata.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n' FROM weekly_data WHERE Entry_Date between ? and ?;";
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
    
    public void quarterlyreportActionPerformed(java.awt.event.ActionEvent evt) {
       URL icon5 = this.getClass().getClassLoader().getResource("courthouse.jpg");
       ImageIcon ic5 = new ImageIcon(icon5);
       frame4 = new JFrame();
       frame4.setTitle("Quarterly Report Export to Excel"); 
       p10 = new JPanel();
       p10.setBackground(new Color(240, 255, 255));
       p10.setLayout(null);
       frame4.setSize(380,280);
       lb13 = new JLabel("Put two dates one in each box");
       lb14 = new JLabel("File will be save in top directory C:\\quarterlyreport.csv");
       lb15 = new JLabel("Start Quarterly Date:");
       lb16 = new JLabel("Finish Quarterly Date:");
       tf7 = new JTextField();
       tf8 = new JTextField();
       bsubmit4 = new JButton();
       lb13.setFont(new Font("Serif", 0, 16));
       p10.add(lb13);
       lb13.setBounds(60, 20, 250, 25);
       lb14.setFont(new Font("Serif", 0 ,16));
       p10.add(lb14);
       lb14.setBounds(10,40, 330, 25);
       lb15.setFont(new Font("Serif", 0, 16));
       p10.add(lb15);
       lb15.setBounds(10, 90, 200, 25);
       tf7.setFont(new Font("Serif",0, 16));
       p10.add(tf7);
       tf7.setBounds(180, 90, 150, 27);
       lb16.setFont(new Font("Serif", 0, 16));
       p10.add(lb16);
       lb16.setBounds(10, 140, 200, 25);
       tf8.setFont(new Font("Serif",0, 16));
       p10.add(tf8);
       tf8.setBounds(180, 140, 150, 27);
       bsubmit4.setFont(new Font("Serif", 0, 16));
       bsubmit4.setText("Get Excel File");
       p10.add(bsubmit4);
       bsubmit4.addActionListener(this);
       bsubmit4.setBounds(75, 200, 150, 27);
       frame4.add(p10);
       frame4.setIconImage(ic5.getImage());
       frame4.setResizable(false);  
       frame4.setVisible(true);      
    }
    
    public void bsubmit4ActionPerformed(java.awt.event.ActionEvent evt) {          
        String sql = "SELECT 'Quarterly_Date', 'Quarterly_Period', 'Reviewed', 'Accepted', 'Rejected', 'Declined_Participate', 'Rejected_Other', 'AWOL', 'Termin', 'Drug_Free_Babies', 'Parental_Rights_Termin', 'GEDs_Received', 'Starting_Wages', 'Completion_Wages', 'ASAM_Level', 'Drug_Tests', 'Urine_Tests', 'Breath_Tests', 'Saliva_Tests', 'Hair_Tests', 'Residential_Treat', 'Prior_Mental_Treat', 'Prior_Substance_Abuse', 'Graduates' UNION SELECT * INTO OUTFILE '/quarterlyreport.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n' FROM quarterly_report WHERE Quarterly_Date BETWEEN ? AND ?;";
          try {
            pst = conn.prepareStatement(sql);            
            pst.setString(1, tf7.getText());
            pst.setString(2, tf8.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Created Excel File");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void postgraduationActionPerformed(java.awt.event.ActionEvent evt) {
       URL icon6 = this.getClass().getClassLoader().getResource("courthouse.jpg");
       ImageIcon ic6 = new ImageIcon(icon6);
       frame5 = new JFrame();
       frame5.setTitle("Post Graduation Export to Excel"); 
       p11 = new JPanel();
       p11.setBackground(new Color(240, 255, 255));
       p11.setLayout(null);
       frame5.setSize(350,280);
       lb17 = new JLabel("Put two dates one in each box");
       lb18 = new JLabel("File will be save in top directory C:\\postgraduation.csv");
       lb19 = new JLabel("Start Entry Date:");
       lb20 = new JLabel("Finish Entry Date:");
       tf9 = new JTextField();
       tf10 = new JTextField();
       bsubmit5 = new JButton();
       lb17.setFont(new Font("Serif", 0, 16));
       p11.add(lb17);
       lb17.setBounds(60, 20, 250, 25);
       lb18.setFont(new Font("Serif", 0 ,16));
       p11.add(lb18);
       lb18.setBounds(10,40, 330, 25);
       lb19.setFont(new Font("Serif", 0, 16));
       p11.add(lb19);
       lb19.setBounds(10, 90, 200, 25);
       tf9.setFont(new Font("Serif",0, 16));
       p11.add(tf9);
       tf9.setBounds(180, 90, 150, 27);
       lb20.setFont(new Font("Serif", 0, 16));
       p11.add(lb20);
       lb20.setBounds(10, 140, 200, 25);
       tf10.setFont(new Font("Serif",0, 16));
       p11.add(tf10);
       tf10.setBounds(180, 140, 150, 27);
       bsubmit5.setFont(new Font("Serif", 0, 16));
       bsubmit5.setText("Get Excel File");
       p11.add(bsubmit5);
       bsubmit5.addActionListener(this);
       bsubmit5.setBounds(75, 200, 150, 27);
       frame5.add(p11);
       frame5.setIconImage(ic6.getImage());
       frame5.setResizable(false);  
       frame5.setVisible(true);      
    }
    
    public void bsubmit5ActionPerformed(java.awt.event.ActionEvent evt) {          
        String sql = "SELECT 'Entry_Date', 'Name', 'Birth_Date', 'New_Arrest', 'Reason' UNION SELECT * INTO OUTFILE '/postgraduation.csv' FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '\"' LINES TERMINATED BY '\n' FROM post_graduation WHERE Entry_Date BETWEEN ? AND ?;";
          try {
            pst = conn.prepareStatement(sql);            
            pst.setString(1, tf9.getText());
            pst.setString(2, tf10.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Created Excel File");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void htablesActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JOptionPane.showMessageDialog(null,
                                      "If you need to make a correction or update an entry. \n"
                                        +"\nFirst click on the row once to highlighted it. \n"
                                        +"\nSecond click the Update button and everything will populate the boxes. \n" 
                                        +"\nThird click the Delete button. \n" 
                                        +"\nFourth make the corrections or update. \n"  
                                        +"\nFifth hit the Submit button then the Refresh Table button. \n"
                                        +"\nIf you only need to delete a row just highlight it and click the Delete button. \n\n",
                                      "Help Window",
                                      JOptionPane.QUESTION_MESSAGE);
        
    } 
    
    public void cmdsubmit1ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Name1 = (String) boxresidentialtreatment.getSelectedItem();
        String sql = "insert into basic_information (Entry_Date, Case_Number, Date_of_Intake, Participants_Name, Date_of_Birth, Age, Address, Phone_Number, Legal_Charge, Employer_Name, Employer_Phone, Contact_Name, Residential_Treatment) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);            
            pst.setString(1, txtentrydate.getText());
            pst.setString(2, txtcasenumber1.getText());
            pst.setString(3, txtdateofintake.getText());
            pst.setString(4, txtparticipantsname1.getText());
            pst.setString(5, txtdateofbirth.getText());
            pst.setString(6, txtage1.getText());
            pst.setString(7, txtaddress1.getText());
            pst.setString(8, txtphonenumber1.getText());
            pst.setString(9, txtlegalcharge.getText());
            pst.setString(10, txtemployername.getText());
            pst.setString(11, txtemployerphone.getText());
            pst.setString(12, txtcontactname.getText());
            pst.setString(13, Name1);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Changes Submitted");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }                                          

    public void cmdsubmit2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String Name13 = (String) boxphase.getSelectedItem();
        String Name14 = (String) boxstep.getSelectedItem();
        String Name15 = (String) boxfees.getSelectedItem();
        String Name16 = (String) boxscreeningtypes.getSelectedItem();
        String Name17 = (String) boxscreeningresults.getSelectedItem();
        String Name18 = (String) boxjobsituation2.getSelectedItem();
        String Name19 = (String) boxdiploma.getSelectedItem();
        String sql = "insert into weekly_data (Entry_Date, Participant_Nmbr, Name, Birth_Date, Phase, Termin_Date, Termin, Grad_Date, Hold_N_Date, Last_Step_Cmplt, Fee_Balance, Fee_Amount, Fees_Paid, Fees_Other, Date_of_Offense, Reason_Sanction, Type_Sanction, Date_Exp_Sanction, Drug_Screen_Date, Screen_Types, Screen_Results, Drug_Found, Drug_Court_Atnd, NA_Atnd, AA_Atnd, Court_Ses_Atnd, New_Charges, Employment, Diploma_GED, Counselor_Comments) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txttodaysdate.getText());
            pst.setString(2, txtparticipantsnumber.getText());
            pst.setString(3, txtname2.getText());
            pst.setString(4, txtbirthdate2.getText());
            pst.setString(5, Name13);
            pst.setString(6, txtterminationdate.getText());
            pst.setString(7, txtreasontermination.getText());
            pst.setString(8, txtgraddate.getText());
            pst.setString(9, txtreasononhold.getText());
            pst.setString(10, Name14);           
            pst.setString(11, txtfeebalance.getText());
            pst.setString(12, txtfeeamount.getText());
            pst.setString(13, Name15);
            pst.setString(14, txtotherfees.getText());
            pst.setString(15, txtoffensedate.getText());
            pst.setString(16, txtreasonsanction.getText());
            pst.setString(17, txttypesanction.getText());
            pst.setString(18, txtsanctionorder.getText());
            pst.setString(19, txtdatescreening.getText());
            pst.setString(20, Name16);
            pst.setString(21, Name17);
            pst.setString(22, txtpositive.getText());
            pst.setString(23, txtdrugcourtattendance.getText());
            pst.setString(24, txtna.getText());
            pst.setString(25, txtaa.getText());
            pst.setString(26, txtcourtsessions.getText());
            pst.setString(27, txtnewcharges.getText());
            pst.setString(28, Name18);
            pst.setString(29, Name19);
            pst.setString(30, txtcounselor.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Changes Submitted");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }      
    
    public void cmdsubmit3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String Name18 = (String) boxquarterly.getSelectedItem();
        String Name19 = (String) boxnumberasam.getSelectedItem();
        String sql = "insert into quarterly_report (Quarterly_Date, Quarterly_Period, Reviewed, Accepted, Rejected, Declined_Participate, Rejected_Other, AWOL, Termin, Drug_Free_Babies, Parental_Rights_Termin, GEDs_Received, Starting_Wages, Completion_Wages, ASAM_Level, Drug_Tests, Urine_Tests, Breath_Tests, Saliva_Tests, Hair_Tests, Residential_Treat, Prior_Mental_Treat, Prior_Substance_Abuse, Graduates) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtquarterlydate.getText());
            pst.setString(2, Name18);
            pst.setString(3, txtnumberreviewed.getText());
            pst.setString(4, txtnumberaccepted.getText());
            pst.setString(5, txtnumberrejected.getText());
            pst.setString(6, txtnumberdeclined.getText());
            pst.setString(7, txtnumberrejectedotherreasons.getText());
            pst.setString(8, txtnumberawol.getText());
            pst.setString(9, txtnumberterminated.getText());
            pst.setString(10, txtnumberdrugfreebabies.getText());           
            pst.setString(11, txtnumberrigthsterminated.getText());
            pst.setString(12, txtnumbergeds.getText());
            pst.setString(13, txtstartwages.getText());
            pst.setString(14, txtendwages.getText());
            pst.setString(15, Name19);
            pst.setString(16, txtnumberdrugscreen.getText());
            pst.setString(17, txtnumberurine.getText());
            pst.setString(18, txtnumberbreath.getText());
            pst.setString(19, txtnumbersaliva.getText());
            pst.setString(20, txtnumberhair.getText());
            pst.setString(21, txtresidentialtreat.getText());
            pst.setString(22, txtmentalillness.getText());
            pst.setString(23, txtsubstanceabuse.getText());
            pst.setString(24, txtnumbergraduates.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Changes Submitted");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }  
        
    public void cmdsubmit4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String sql = "select sum(Accepted) as ' Participants Served ', sum(Graduates) as ' Graduates ', sum(Termin) as ' Terminations ', sum(GEDs_Received) as ' GEDs Received ', sum(Drug_Free_Babies) as ' Drug Free Babies ' from quarterly_report  where Quarterly_Date BETWEEN ? AND ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtcumulative1.getText());
            pst.setString(2, txtcumulative2.getText());
            rs = pst.executeQuery();
            ta5.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta5);
            JOptionPane.showMessageDialog(this, "Added");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Not Found");
        }
        }  
    
     public void cmdsubmit5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String sql = "insert into post_graduation (Entry_Date, Name, Birth_Date, New_Arrest, Reason) values (?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txttodaysdate2.getText());
            pst.setString(2, txtname4.getText());
            pst.setString(3, txtbirthdate4.getText());
            pst.setString(4, txtnewcharges2.getText());
            pst.setString(5, txtarrestreason.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Changes Submitted");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }  
         
     public void cmdsubmit6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String Name = (String) boxacceptance.getSelectedItem();
        String sql = "insert into court_reviews (Court_Appearance, Review_Date, Case_Number, Candidates_Name, Candidates_Birth_Date, Acceptance, Reason) values (?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtcourtdate.getText());
            pst.setString(2, txtreviewdate.getText());
            pst.setString(3, txtcasenumber2.getText());
            pst.setString(4, txtname5.getText());
            pst.setString(5, txtbirthdate5.getText());
            pst.setString(6, Name);
            pst.setString(7, txtreason.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Changes Submitted");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }  
           
     public void cmdclearform1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
            txtcasenumber1.setText("");
            txtentrydate.setText("");
            txtdateofintake.setText("");
            txtparticipantsname1.setText("");
            txtdateofbirth.setText("");
            txtage1.setText("");
            txtaddress1.setText("");
            txtphonenumber1.setText("");
            txtlegalcharge.setText("");
            txtemployername.setText("");
            txtemployerphone.setText("");
            txtcontactname.setText("");
        }                                             

        public void cmdclearform2ActionPerformed(java.awt.event.ActionEvent evt) {
            txttodaysdate.setText("");
            txtfeebalance.setText("");
            txtfeeamount.setText("");
            txtnewcharges.setText("");
            txtaa.setText("");
            txtbirthdate2.setText("");
            txtcounselor.setText("");
            txtcourtsessions.setText("");
            txtdatescreening.setText("");
            txtdrugcourtattendance.setText("");
            txtgraddate.setText(""); 
            txtna.setText("");
            txtname2.setText("");
            txtoffensedate.setText("");
            txtotherfees.setText("");
            txtparticipantsnumber.setText("");
            txtpositive.setText("");
            txtreasononhold.setText("");
            txtreasonsanction.setText("");
            txtreasontermination.setText("");
            txtsanctionorder.setText("");
            txttypesanction.setText("");
        }       
        
       public void cmdclear5ActionPerformed(java.awt.event.ActionEvent evt) {
           txtdate.setText("");
           txtdate2.setText("");
           DefaultTableModel table = (DefaultTableModel) ta3.getModel();
           table.setRowCount(0);  
           DefaultTableModel table1 = (DefaultTableModel) ta8.getModel();
           table1.setRowCount(0); 
           DefaultTableModel table2 = (DefaultTableModel) ta9.getModel();
           table2.setRowCount(0); 
           DefaultTableModel table3 = (DefaultTableModel) ta10.getModel();
           table3.setRowCount(0); 
           DefaultTableModel table4 = (DefaultTableModel) ta11.getModel();
           table4.setRowCount(0); 
           DefaultTableModel table5 = (DefaultTableModel) ta12.getModel();
           table5.setRowCount(0);
           DefaultTableModel table6 = (DefaultTableModel) ta13.getModel();
           table6.setRowCount(0); 
           DefaultTableModel table7 = (DefaultTableModel) ta14.getModel();
           table7.setRowCount(0);
        }
       
       public void cmdclear6ActionPerformed(java.awt.event.ActionEvent evt) {
           txtnumberreviewed.setText("");
           txtnumberaccepted.setText("");
           txtnumberrejected.setText("");
           txtnumberdeclined.setText("");
           txtquarterlydate.setText("");
           txtnumberrejectedotherreasons.setText("");
           txtnumberawol.setText("");
           txtnumberterminated.setText("");
           txtnumberdrugfreebabies.setText("");
           txtnumberrigthsterminated.setText("");
           txtnumbergeds.setText("");
           txtstartwages.setText("");
           txtendwages.setText("");
           txtnumberdrugscreen.setText("");
           txtnumberurine.setText("");
           txtnumberbreath.setText("");
           txtnumbersaliva.setText("");
           txtnumberhair.setText("");
           txtnewcharges.setText("");
           txtresidentialtreat.setText("");
           txtmentalillness.setText("");
           txtsubstanceabuse.setText("");
           txtnumbergraduates.setText("");
        }
       
       public void cmdclear7ActionPerformed(java.awt.event.ActionEvent evt) {
           txttodaysdate2.setText("");
           txtname4.setText("");
           txtbirthdate4.setText("");
           txtnewcharges2.setText("");
           txtarrestreason.setText("");
        }
       
       public void cmdclear8ActionPerformed(java.awt.event.ActionEvent evt) {
           txtreviewdate.setText("");
           txtcourtdate.setText("");
           txtcasenumber2.setText("");
           txtname5.setText("");
           txtbirthdate5.setText("");
           txtreason.setText("");
        }
       
        public void cmdrefresh1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
            String sql = "select * from basic_information order by Participants_Name;";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta1.setModel(DbUtils.resultSetToTableModel(rs));
            UpdateJTable1();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in Connection");
        }
       }                                           
        
        public void cmdrefresh2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
            String sql = "select * from weekly_data order by Entry_Date asc, Name asc;";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta2.setModel(DbUtils.resultSetToTableModel(rs));
            UpdateJTable2();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in Connection");
        }
        }  
        
        public void cmdrefresh3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
            String sql = "select * from quarterly_report order by Quarterly_Period asc, Quarterly_Date asc;";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta4.setModel(DbUtils.resultSetToTableModel(rs));
            UpdateJTable3();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in Connection");
        }
        }     
        
        public void cmdrefresh4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
            String sql = "select * from post_graduation order by Entry_Date asc, Name asc, Birth_Date asc;";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta6.setModel(DbUtils.resultSetToTableModel(rs));
            UpdateJTable4();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in Connection");
        }
        }   
        
        public void cmdrefresh5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
            String sql = "select * from court_reviews order by Case_Number asc;";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ta7.setModel(DbUtils.resultSetToTableModel(rs));
            UpdateJTable5();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error in Connection");
        }
        }    

        public void cmdupdate1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            int row = ta1.getSelectedRow();            
            txtentrydate.setText(ta1.getModel().getValueAt(row, 0).toString());
            txtcasenumber1.setText(ta1.getModel().getValueAt(row, 1).toString());
            txtdateofintake.setText(ta1.getModel().getValueAt(row, 2).toString());
            txtparticipantsname1.setText(ta1.getModel().getValueAt(row, 3).toString());
            txtdateofbirth.setText(ta1.getModel().getValueAt(row, 4).toString());
            txtage1.setText(ta1.getModel().getValueAt(row, 5).toString());
            txtaddress1.setText(ta1.getModel().getValueAt(row, 6).toString());
            txtphonenumber1.setText(ta1.getModel().getValueAt(row, 7).toString());
            txtlegalcharge.setText(ta1.getModel().getValueAt(row, 8).toString());
            txtemployername.setText(ta1.getModel().getValueAt(row, 9).toString());
            txtemployerphone.setText(ta1.getModel().getValueAt(row, 10).toString());
            txtcontactname.setText(ta1.getModel().getValueAt(row, 11).toString());
            boxresidentialtreatment.setSelectedItem(ta1.getModel().getValueAt(row, 12));
        }                                          
        
        public void cmdupdate2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
           int row = ta2.getSelectedRow();
           txttodaysdate.setText(ta2.getModel().getValueAt(row, 0).toString());
           txtparticipantsnumber.setText(ta2.getModel().getValueAt(row, 1).toString());
           txtname2.setText(ta2.getModel().getValueAt(row, 2).toString());
           txtbirthdate2.setText(ta2.getModel().getValueAt(row, 3).toString());
           boxphase.setSelectedItem(ta2.getModel().getValueAt(row, 4));
           txtterminationdate.setText(ta2.getModel().getValueAt(row, 5).toString());
           txtreasontermination.setText(ta2.getModel().getValueAt(row, 6).toString());
           txtgraddate.setText(ta2.getModel().getValueAt(row, 7).toString());
           txtreasononhold.setText(ta2.getModel().getValueAt(row, 8).toString());
           boxstep.setSelectedItem(ta2.getModel().getValueAt(row, 9));
           txtfeebalance.setText(ta2.getModel().getValueAt(row, 10).toString());
           txtfeeamount.setText(ta2.getModel().getValueAt(row, 11).toString());
           boxfees.setSelectedItem(ta2.getModel().getValueAt(row, 12));
           txtotherfees.setText(ta2.getModel().getValueAt(row, 13).toString());
           txtoffensedate.setText(ta2.getModel().getValueAt(row, 14).toString());
           txtreasonsanction.setText(ta2.getModel().getValueAt(row, 15).toString());
           txttypesanction.setText(ta2.getModel().getValueAt(row, 16).toString());
           txtsanctionorder.setText(ta2.getModel().getValueAt(row, 17).toString());
           txtdatescreening.setText(ta2.getModel().getValueAt(row, 18).toString());
           boxscreeningtypes.setSelectedItem(ta2.getModel().getValueAt(row, 19));
           boxscreeningresults.setSelectedItem(ta2.getModel().getValueAt(row, 20));
           txtpositive.setText(ta2.getModel().getValueAt(row, 21).toString());
           txtdrugcourtattendance.setText(ta2.getModel().getValueAt(row, 22).toString());
           txtna.setText(ta2.getModel().getValueAt(row, 23).toString());
           txtaa.setText(ta2.getModel().getValueAt(row, 24).toString());
           txtcourtsessions.setText(ta2.getModel().getValueAt(row, 25).toString());
           txtnewcharges.setText(ta2.getModel().getValueAt(row, 26).toString());
           boxjobsituation2.setSelectedItem(ta2.getModel().getValueAt(row, 27));
           boxdiploma.setSelectedItem(ta2.getModel().getValueAt(row, 28));
           txtcounselor.setText(ta2.getModel().getValueAt(row, 29).toString());
        }                                          

        public void cmdupdate3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
           int row = ta4.getSelectedRow();        
           txtquarterlydate.setText(ta4.getModel().getValueAt(row, 0).toString());
           boxquarterly.setSelectedItem(ta4.getModel().getValueAt(row, 1));
           txtnumberreviewed.setText(ta4.getModel().getValueAt(row, 2).toString());
           txtnumberaccepted.setText(ta4.getModel().getValueAt(row, 3).toString());
           txtnumberrejected.setText(ta4.getModel().getValueAt(row, 4).toString());
           txtnumberdeclined.setText(ta4.getModel().getValueAt(row, 5).toString());
           txtnumberrejectedotherreasons.setText(ta4.getModel().getValueAt(row, 6).toString());
           txtnumberawol.setText(ta4.getModel().getValueAt(row, 7).toString());
           txtnumberterminated.setText(ta4.getModel().getValueAt(row, 8).toString());
           txtnumberdrugfreebabies.setText(ta4.getModel().getValueAt(row, 9).toString());
           txtnumberrigthsterminated.setText(ta4.getModel().getValueAt(row, 10).toString());
           txtnumbergeds.setText(ta4.getModel().getValueAt(row, 11).toString());
           txtstartwages.setText(ta4.getModel().getValueAt(row, 12).toString());
           txtendwages.setText(ta4.getModel().getValueAt(row, 13).toString());
           boxnumberasam.setSelectedItem(ta4.getModel().getValueAt(row, 14));
           txtnumberdrugscreen.setText(ta4.getModel().getValueAt(row, 15).toString());
           txtnumberurine.setText(ta4.getModel().getValueAt(row, 16).toString());
           txtnumberbreath.setText(ta4.getModel().getValueAt(row, 17).toString());
           txtnumbersaliva.setText(ta4.getModel().getValueAt(row, 18).toString());
           txtnumberhair.setText(ta4.getModel().getValueAt(row, 19).toString());
           txtresidentialtreat.setText(ta4.getModel().getValueAt(row, 20).toString());
           txtmentalillness.setText(ta4.getModel().getValueAt(row, 21).toString());
           txtsubstanceabuse.setText(ta4.getModel().getValueAt(row, 22).toString());
           txtnumbergraduates.setText(ta4.getModel().getValueAt(row, 23).toString());
        }                                          
        
        public void cmdupdate4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
           int row = ta6.getSelectedRow();        
           txttodaysdate2.setText(ta6.getModel().getValueAt(row, 0).toString());          
           txtname4.setText(ta6.getModel().getValueAt(row, 1).toString());
           txtbirthdate4.setText(ta6.getModel().getValueAt(row, 2).toString());
           txtnewcharges2.setText(ta6.getModel().getValueAt(row, 3).toString());
           txtarrestreason.setText(ta6.getModel().getValueAt(row, 4).toString());
        }
        
        public void cmdupdate5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
           int row = ta7.getSelectedRow();        
           txtcourtdate.setText(ta7.getModel().getValueAt(row, 0).toString());          
           txtreviewdate.setText(ta7.getModel().getValueAt(row, 1).toString());
           txtcasenumber2.setText(ta7.getModel().getValueAt(row, 2).toString());
           txtname5.setText(ta7.getModel().getValueAt(row, 3).toString());
           txtbirthdate5.setText(ta7.getModel().getValueAt(row, 4).toString());
           boxacceptance.setSelectedItem(ta7.getModel().getValueAt(row, 5));
           txtreason.setText(ta7.getModel().getValueAt(row, 6).toString());
        }
        
        public void cmddelete1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            String sql = "delete from basic_information where Case_Number = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtcasenumber1.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            UpdateJTable1();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }                                                                                   

        public void cmddelete2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            String sql = "delete from weekly_data where Entry_Date = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txttodaysdate.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            UpdateJTable2();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }                                          

        public void cmddelete3ActionPerformed(java.awt.event.ActionEvent evt) {
          String Name18 = (String) boxquarterly.getSelectedItem();
            String sql = "delete from quarterly_report where Quarterly_Date = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtquarterlydate.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
            UpdateJTable3();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }                                          

        public void cmddelete4ActionPerformed(java.awt.event.ActionEvent evt) {
            String sql = "delete from post_graduation where Entry_Date = ?";
            try {
                 pst = conn.prepareStatement(sql);
                 pst.setString(1, txttodaysdate2.getText());
                 pst.execute();
                 JOptionPane.showMessageDialog(null, "Deleted");
                 UpdateJTable4();
            } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null, e);
            }
        }   
        
        public void cmddelete5ActionPerformed(java.awt.event.ActionEvent evt) {
            String sql = "delete from court_reviews where Court_Appearance = ?";
            try {
                 pst = conn.prepareStatement(sql);
                 pst.setString(1, txtcourtdate.getText());
                 pst.execute();
                 JOptionPane.showMessageDialog(null, "Deleted");
                 UpdateJTable5();
            } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null, e);
            }
        }  

        public void formWindowOpened(java.awt.event.WindowEvent evt) throws ClassNotFoundException {                                  
           conn = mysqlconnect.ConnectDb();
           UpdateJTable1();
           UpdateJTable2(); 
           UpdateJTable3();
           UpdateJTable4();
           UpdateJTable5();
        }   
        
    public void cmdsearch1ActionPerformed(java.awt.event.ActionEvent evt) {
        String sql = "SELECT * FROM court_reviews where Review_Date BETWEEN ? and ?";
        String sql3 = "SELECT * FROM demographics where Entry_Date BETWEEN ? and ?";
        String sql5 = "SELECT * FROM weekly_data where Entry_Date BETWEEN ? and ?";
        String sql7 = "SELECT * FROM basic_information where Entry_Date BETWEEN ? and ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtdate.getText());
            pst.setString(2, txtdate2.getText());
            rs = pst.executeQuery();
            ta3.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta3);
            pst = conn.prepareStatement(sql3);
            pst.setString(1, txtdate.getText());
            pst.setString(2, txtdate2.getText());
            rs = pst.executeQuery();
            ta9.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta9);
            pst = conn.prepareStatement(sql5);
            pst.setString(1, txtdate.getText());
            pst.setString(2, txtdate2.getText());
            rs = pst.executeQuery();
            ta11.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta11);
            pst = conn.prepareStatement(sql7);
            pst.setString(1, txtdate.getText());
            pst.setString(2, txtdate2.getText());
            rs = pst.executeQuery();
            ta13.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta13);
            JOptionPane.showMessageDialog(this, "Found");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Not Found");
        }
        String sql2 = "select sum(acceptance = 'yes') as Accepted, sum(acceptance = 'no') as Rejected from court_reviews where review_date between ? and ?;";
        String sql4 = "select sum(Drug_Free_Babies) as 'Drug Free Babies Born', sum(Mental_Treatment = 'Yes') as 'Prior Mental Treatment', sum(Drug_Treatment = 'Yes') as 'Prior Drug Abuse Treatment' from demographics where entry_date between ? and ?;";
        String sql6 = "select sum(if(termin != null,termin,0)) as 'Terminated', sum(if(Screen_Results = 'Postive',Screen_Results,0)) as 'Positive Drug Screen Results', sum(Screen_Results) as 'Amount of Drug Screens', sum(Screen_Types = 'Urine') as 'Urine Tests', sum(Screen_Types = 'Breath') as 'Breath Tests', sum(Screen_Types = 'Saliva') as 'Saliva Tests', sum(Screen_Types = 'Hair') as 'Hair Tests', sum(Diploma_GED = 'Yes') as 'Diploma or GED Recieved' from weekly_data where entry_date between ? and ?;";
        String sql8 = "select sum(Residential_Treatment = 'Yes') as 'Participants in Residential Facilities' from basic_information where entry_date between ? and ?;";
        try {
            pst = conn.prepareStatement(sql2);
            pst.setString(1, txtdate.getText());
            pst.setString(2, txtdate2.getText());
            rs = pst.executeQuery();
            ta8.setModel(DbUtils.resultSetToTableModel(rs));
            pst = conn.prepareStatement(sql4);
            pst.setString(1, txtdate.getText());
            pst.setString(2, txtdate2.getText());
            rs = pst.executeQuery();
            ta10.setModel(DbUtils.resultSetToTableModel(rs));
            pst = conn.prepareStatement(sql6);
            pst.setString(1, txtdate.getText());
            pst.setString(2, txtdate2.getText());
            rs = pst.executeQuery();
            ta12.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta12);            
            pst = conn.prepareStatement(sql8);
            pst.setString(1, txtdate.getText());
            pst.setString(2, txtdate2.getText());
            rs = pst.executeQuery();
            ta14.setModel(DbUtils.resultSetToTableModel(rs));
            columnWidths(ta14);
            JOptionPane.showMessageDialog(this, "Added");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Not Added");
        }
        
       }  
     
}
    