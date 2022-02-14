/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_management;

import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import rojerusan.RSMaterialButtonRectangle;

/**
 *
 * @author ALka Media
 */
public class Home extends javax.swing.JFrame {
    Codes co = new Codes();
    public void display()
    {
        co.viewTable("select * from jobs", jobtable);
        
        co.viewTable("select * from people1_view", peptable);
        co.viewTable("select * from accounts", acctable);
        co.viewTable("select * from bills_view", billstable);
        co.viewTable("select * from payments_view", pytable);
        co.viewTable("select * from teams", teamtable);
        co.viewTable("select * from competions", comtable);
        co.viewTable("select * from player_agrement_view", playeragrimenttable);
        co.viewTable("select * from activites", tableactivity);
        co.viewTable("select * from match_activity_view", matchactivitytable);
        co.viewTable("select * from matches_view", matchesTablerecord);
    }
   
    
    String id ="";
    String ic ="";
    String ib ="";
    String pubid="";
     String name="";
     String tell="";
     String sex="";
     String weig="";
     String job="";
     String des="";
     String oper="";
     String Gender="";
     String ibils="";
     String bils="";
     
     String amount ="";
     String desc ="";
     //pyments
     String idpy="";
     String acc ="";
     String paymentsn="";
     String peycom="";
     String payconacc="";
     
     //team
     String tid="";
     
     String cid="";
     //player Aggriments
      String idpl="";
     String player ="";
     String team="";
     String cost="";
     String dur="";
     String despl="";
     String cam3 = "";
     String cam4 = "";
     
     //activities
     String idac="";
     
     //match_activity
     String idmac = "";
    String activity = "";
    String match = "";
    String people = "";
    String com1="";
    String com2="";
    //matches
     String idmatch="";
     String compe="";
     String mac5 ="";
     String teams="";
     
     String accdisplayer="";

     
      
     
    /**
     * Creates new form Home
     */
    
    public Home() {
        initComponents();
//        RSMaterialButtonRectangle AccountCount = null;
//       
//         this.viewHome("SELECT SUM(balance) Lacag FROM accounts","Lacag",AccountCount);
         //this.viewDash("SELECT SUM(balance) Lacag FROM accounts","Lacag", AccountCount);
        //jobs
        co.fillCombo("SELECT j_name as  j FROM jobs",job_no,"j");
        //from bill frorien key
        co.fillCombo("SELECT p_name as  'pep_Name' FROM people1_view",bilpeople_no,"pep_Name");
        //payments
        co.fillCombo("SELECT acc_name as  'account_Name' FROM accounts",acc_no,"account_Name");
        co.fillCombo("SELECT p_name as  ruux FROM people1",peoplePayments_no,"ruux");
        //player Aggriments
        co.fillCombo("SELECT p_name as  laqab FROM people1",playerpeople_no,"laqab");
        co.fillCombo("SELECT teams_name as  nn FROM teams",playerteam_no,"nn");
        //match_activity
         co.fillCombo("SELECT activity_name as  'activity_Name' FROM activites", activity_no, "activity_Name");
        co.fillCombo("SELECT teams_name as  'Team_Name' FROM teams", match_no, "Team_Name");
        co.fillCombo("SELECT p_name as  'Names' FROM people1", macpeople_no, "Names");
        //matches
        co.fillCombo("SELECT com_name as 'co' from competions",macthescompe_no,"co");
       co.fillCombo("SELECT teams_name as 'team' from teams",matchesteam_no,"team");
       display();
//       viewDash();
    }
    
    boolean validation()
    {
        String lbljobName,lbljobDesc;
        lbljobName=txtjobname.getText();
        lbljobDesc=txtjobdesc.getText();
        if(lbljobName.equals("")){
            JOptionPane.showMessageDialog(this, "Fill Name place");
             return false;
        }
        if(lbljobDesc.equals("")){
            JOptionPane.showMessageDialog(this, "Fill Description place");
             return false;
        }
        return true;
       
        
    }
    boolean validation1()
    {
        String lblPepName,lblPepTell,lblPepSex,lblPepDate,lblPepWeight,lblPepJobNo,lblPepDesc,lblPepRegDate;
        lblPepName=txtpepname.getText();
        lblPepTell=txtpeptell.getText();
        lblPepWeight=txtpepwei.getText();
        lblPepDesc=txtpepdes.getText();
        if(lblPepName.equals("")){
            JOptionPane.showMessageDialog(this, "Fill Name place");
             return false;
        }
        if(lblPepTell.equals("")){
            JOptionPane.showMessageDialog(this, "Fill Tell place");
             return false;
        }
        if(lblPepWeight.equals("")){
            JOptionPane.showMessageDialog(this, "Fill Wieght place");
             return false;
        }
        if(lblPepDesc.equals("")){
            JOptionPane.showMessageDialog(this, "Fill Description place");
             return false;
        }
        return false;
    }
    boolean validation2()
    {
        String lblteamName,lblteamdescrip;
        lblteamName=txtteamname.getText();
        lblteamdescrip=txtteamdesc.getText();
        if(lblteamName.equals("")){
            JOptionPane.showMessageDialog(this, "Fill JobName place");
             return false;
        }
        if(lblteamdescrip.equals("")){
            JOptionPane.showMessageDialog(this, "Fill JobDescription place");
             return false;
        }
        return false;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo3 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo4 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo5 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo6 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jLabel46 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        lbljobName = new javax.swing.JLabel();
        txtjobname = new javax.swing.JTextField();
        lbljobDesc = new javax.swing.JLabel();
        txtjobdesc = new javax.swing.JTextField();
        btnsave = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new3 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new4 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new1 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new2 = new newscomponents.RSButtonIcon_new();
        jScrollPane11 = new javax.swing.JScrollPane();
        jobtable = new RSMaterialComponent.RSTableMetro();
        txtserjob = new RSMaterialComponent.RSTextFieldOne();
        jPanel23 = new javax.swing.JPanel();
        lblPepName = new javax.swing.JLabel();
        txtpepname = new app.bolivia.swing.JCTextField();
        lblPepTell = new javax.swing.JLabel();
        txtpeptell = new app.bolivia.swing.JCTextField();
        lblPepSex = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        lblPepDate = new javax.swing.JLabel();
        jDatepeop = new com.toedter.calendar.JDateChooser();
        txtpepwei = new app.bolivia.swing.JCTextField();
        lblPepWeight = new javax.swing.JLabel();
        lblPepJobNo = new javax.swing.JLabel();
        job_no = new javax.swing.JComboBox<>();
        lblPepDesc = new javax.swing.JLabel();
        txtpepdes = new app.bolivia.swing.JCTextField();
        lblPepRegDate = new javax.swing.JLabel();
        jDatepepreg = new com.toedter.calendar.JDateChooser();
        btnsave1 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new5 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new6 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new7 = new newscomponents.RSButtonIcon_new();
        txtpepser = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new8 = new newscomponents.RSButtonIcon_new();
        jScrollPane3 = new javax.swing.JScrollPane();
        peptable = new RSMaterialComponent.RSTableMetroCustom();
        jLabel45 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        lblteamName = new RSMaterialComponent.RSLabelTextIcon();
        lblteamdescrip = new RSMaterialComponent.RSLabelTextIcon();
        txtteamname = new RSMaterialComponent.RSTextFieldTwo();
        txtteamdesc = new RSMaterialComponent.RSTextFieldTwo();
        btnteamsave = new newscomponents.RSButtonIcon_new();
        btnUpdate = new newscomponents.RSButtonIcon_new();
        btnreset = new newscomponents.RSButtonIcon_new();
        btndelete = new newscomponents.RSButtonIcon_new();
        txtserteam = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new22 = new newscomponents.RSButtonIcon_new();
        jScrollPane7 = new javax.swing.JScrollPane();
        teamtable = new RSMaterialComponent.RSTableMetro();
        lbl_teamName = new javax.swing.JLabel();
        lbl_teamDesc = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtcomname = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcomdesc = new app.bolivia.swing.JCTextField();
        btnsave4 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new23 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new24 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new25 = new newscomponents.RSButtonIcon_new();
        txtsercom = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new26 = new newscomponents.RSButtonIcon_new();
        jScrollPane8 = new javax.swing.JScrollPane();
        comtable = new RSMaterialComponent.RSTableMetro();
        jLabel13 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        macthescompe_no = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        matchesteam_no = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        JDatematches = new com.toedter.calendar.JDateChooser();
        btnSave3 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new35 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new36 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new37 = new newscomponents.RSButtonIcon_new();
        txtsermatches = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new38 = new newscomponents.RSButtonIcon_new();
        matchestable = new javax.swing.JScrollPane();
        matchesTablerecord = new RSMaterialComponent.RSTableMetro();
        jLabel12 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txtactivityname = new app.bolivia.swing.JCTextField();
        jLabel32 = new javax.swing.JLabel();
        txtactivtyDesc = new app.bolivia.swing.JCTextField();
        jLabel33 = new javax.swing.JLabel();
        jDateActivities = new com.toedter.calendar.JDateChooser();
        btnsave5 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new31 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new32 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new33 = new newscomponents.RSButtonIcon_new();
        txtseractivity = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new34 = new newscomponents.RSButtonIcon_new();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableactivity = new RSMaterialComponent.RSTableMetro();
        jLabel11 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        activity_no = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        match_no = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtAct = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        btnSave2 = new newscomponents.RSButtonIcon_new();
        btnupdate = new newscomponents.RSButtonIcon_new();
        btnreset1 = new newscomponents.RSButtonIcon_new();
        btndell = new newscomponents.RSButtonIcon_new();
        txtsermactivity = new RSMaterialComponent.RSTextFieldIconOne();
        btnser = new newscomponents.RSButtonIcon_new();
        jScrollPane9 = new javax.swing.JScrollPane();
        matchactivitytable = new RSMaterialComponent.RSTableMetro();
        jLabel9 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        playerpeople_no = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        playerteam_no = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jDateplayer_agg = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        txtcostplayer = new app.bolivia.swing.JCTextField();
        jLabel29 = new javax.swing.JLabel();
        txtplayerdur = new app.bolivia.swing.JCTextField();
        jLabel30 = new javax.swing.JLabel();
        txtplayerdes = new app.bolivia.swing.JCTextField();
        btnSave1 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new27 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new28 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new29 = new newscomponents.RSButtonIcon_new();
        txtserplayer = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new30 = new newscomponents.RSButtonIcon_new();
        jScrollPane2 = new javax.swing.JScrollPane();
        playeragrimenttable = new RSMaterialComponent.RSTableMetro();
        jLabel10 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtaccname = new app.bolivia.swing.JCTextField();
        jLabel16 = new javax.swing.JLabel();
        txtaccinst = new app.bolivia.swing.JCTextField();
        jLabel17 = new javax.swing.JLabel();
        txtaccbal = new app.bolivia.swing.JCTextField();
        btnSave = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new9 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new10 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new11 = new newscomponents.RSButtonIcon_new();
        txtseracc = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new12 = new newscomponents.RSButtonIcon_new();
        jScrollPane4 = new javax.swing.JScrollPane();
        acctable = new RSMaterialComponent.RSTableMetroCustom();
        jLabel3 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        bilpeople_no = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        amountB = new app.bolivia.swing.JCTextField();
        jLabel21 = new javax.swing.JLabel();
        txtserbill = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new13 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new14 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new15 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new16 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new17 = new newscomponents.RSButtonIcon_new();
        jScrollPane5 = new javax.swing.JScrollPane();
        billstable = new RSMaterialComponent.RSTableMetroCustom();
        billDate = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        bilDesc = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        acc_no = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtamountpyment = new app.bolivia.swing.JCTextField();
        jLabel24 = new javax.swing.JLabel();
        jDatepayment = new com.toedter.calendar.JDateChooser();
        btnsave2 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new18 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new19 = new newscomponents.RSButtonIcon_new();
        rSButtonIcon_new20 = new newscomponents.RSButtonIcon_new();
        txtserpay = new RSMaterialComponent.RSTextFieldIconOne();
        rSButtonIcon_new21 = new newscomponents.RSButtonIcon_new();
        jScrollPane6 = new javax.swing.JScrollPane();
        pytable = new RSMaterialComponent.RSTableMetroCustom();
        jLabel47 = new javax.swing.JLabel();
        peoplePayments_no = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        buttonHover1 = new rojeru_san.complementos.ButtonHover();
        buttonHover2 = new rojeru_san.complementos.ButtonHover();
        buttonHover3 = new rojeru_san.complementos.ButtonHover();
        buttonHover4 = new rojeru_san.complementos.ButtonHover();
        buttonHover5 = new rojeru_san.complementos.ButtonHover();
        buttonHover6 = new rojeru_san.complementos.ButtonHover();
        buttonHover7 = new rojeru_san.complementos.ButtonHover();
        buttonHover8 = new rojeru_san.complementos.ButtonHover();
        buttonHover9 = new rojeru_san.complementos.ButtonHover();
        buttonHover10 = new rojeru_san.complementos.ButtonHover();
        buttonHover11 = new rojeru_san.complementos.ButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 10, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconTwo1.setText("rSButtonMaterialIconTwo1");
        jPanel1.add(rSButtonMaterialIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 140, 50));

        rSButtonMaterialIconTwo3.setBackground(new java.awt.Color(0, 204, 204));
        rSButtonMaterialIconTwo3.setText("Home");
        rSButtonMaterialIconTwo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSButtonMaterialIconTwo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMaterialIconTwo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconTwo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, -1));

        rSButtonMaterialIconTwo4.setBackground(new java.awt.Color(0, 204, 204));
        rSButtonMaterialIconTwo4.setText("Menu");
        rSButtonMaterialIconTwo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSButtonMaterialIconTwo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMaterialIconTwo4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MENU);
        rSButtonMaterialIconTwo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconTwo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, -1));

        rSButtonMaterialIconTwo5.setBackground(new java.awt.Color(0, 204, 204));
        rSButtonMaterialIconTwo5.setText("Report");
        rSButtonMaterialIconTwo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSButtonMaterialIconTwo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMaterialIconTwo5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MENU);
        rSButtonMaterialIconTwo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconTwo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 160, -1));

        rSButtonMaterialIconTwo6.setBackground(new java.awt.Color(0, 204, 204));
        rSButtonMaterialIconTwo6.setText("About");
        rSButtonMaterialIconTwo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSButtonMaterialIconTwo6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonMaterialIconTwo6.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MENU);
        rSButtonMaterialIconTwo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconTwo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 730));

        jLabel46.setBackground(new java.awt.Color(0, 102, 102));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("TEAM MANAGEMENT SYSTEM");
        jLabel46.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 10, 0, new java.awt.Color(255, 255, 255)));
        jLabel46.setOpaque(true);
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1170, 80));

        jTabbedPane2.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane2.setOpaque(true);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_management/test5.png"))); // NOI18N
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1160, 600));

        jTabbedPane2.addTab("Home", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setBackground(new java.awt.Color(153, 0, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("SH &  SH");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 100, 30));

        jButton13.setBackground(new java.awt.Color(153, 0, 0));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("GROUP ISSUE");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 140, 30));

        jButton14.setBackground(new java.awt.Color(153, 0, 0));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("MONITIZATION");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 30));

        jLabel44.setBackground(new java.awt.Color(0, 153, 153));
        jLabel44.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 0, 153)));
        jLabel44.setOpaque(true);
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1170, 10));

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Jobs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("people");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 80, 30));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 0, 153)));
        jLabel4.setOpaque(true);
        jPanel19.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1150, 10));

        jTabbedPane4.setBackground(new java.awt.Color(102, 153, 255));

        jPanel22.setBackground(new java.awt.Color(0, 102, 102));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbljobName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbljobName.setForeground(new java.awt.Color(255, 255, 255));
        lbljobName.setText("Job_Name");
        jPanel22.add(lbljobName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 40));

        txtjobname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjobname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel22.add(txtjobname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 220, 40));

        lbljobDesc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbljobDesc.setForeground(new java.awt.Color(255, 255, 255));
        lbljobDesc.setText("Description");
        jPanel22.add(lbljobDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 40));

        txtjobdesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjobdesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel22.add(txtjobdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 220, 40));

        btnsave.setBackground(new java.awt.Color(0, 153, 153));
        btnsave.setText("Save");
        btnsave.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnsave.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel22.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, 40));

        rSButtonIcon_new3.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new3.setText("Update");
        rSButtonIcon_new3.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new3ActionPerformed(evt);
            }
        });
        jPanel22.add(rSButtonIcon_new3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, 40));

        rSButtonIcon_new4.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new4.setText("Reset");
        rSButtonIcon_new4.setToolTipText("");
        rSButtonIcon_new4.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIcon_new4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new4ActionPerformed(evt);
            }
        });
        jPanel22.add(rSButtonIcon_new4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 90, 40));

        rSButtonIcon_new1.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new1.setText("Delete");
        rSButtonIcon_new1.setActionCommand("Save");
        rSButtonIcon_new1.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new1ActionPerformed(evt);
            }
        });
        jPanel22.add(rSButtonIcon_new1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 100, 40));

        rSButtonIcon_new2.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new2.setText("Search");
        rSButtonIcon_new2.setActionCommand("Save");
        rSButtonIcon_new2.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new2ActionPerformed(evt);
            }
        });
        jPanel22.add(rSButtonIcon_new2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 100, -1));

        jobtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jobtable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jobtableMouseDragged(evt);
            }
        });
        jobtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobtableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jobtableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jobtableMousePressed(evt);
            }
        });
        jScrollPane11.setViewportView(jobtable);

        jPanel22.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 110, 660, 380));

        txtserjob.setForeground(new java.awt.Color(0, 153, 153));
        txtserjob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtserjob.setPhColor(new java.awt.Color(0, 153, 153));
        txtserjob.setPlaceholder("Type Here To Search");
        txtserjob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtserjobMouseClicked(evt);
            }
        });
        txtserjob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtserjobKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtserjobKeyReleased(evt);
            }
        });
        jPanel22.add(txtserjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        jTabbedPane4.addTab("Jobs", jPanel22);

        jPanel23.setBackground(new java.awt.Color(0, 102, 102));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPepName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPepName.setForeground(new java.awt.Color(240, 240, 240));
        lblPepName.setText("Name");
        jPanel23.add(lblPepName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 30));

        txtpepname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpepname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpepname.setPhColor(new java.awt.Color(0, 102, 102));
        txtpepname.setPlaceholder("Enter Name");
        txtpepname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpepnameActionPerformed(evt);
            }
        });
        jPanel23.add(txtpepname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 210, 40));

        lblPepTell.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPepTell.setForeground(new java.awt.Color(240, 240, 240));
        lblPepTell.setText("Tell");
        jPanel23.add(lblPepTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 50, 30));

        txtpeptell.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpeptell.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpeptell.setPhColor(new java.awt.Color(0, 102, 102));
        txtpeptell.setPlaceholder("Enter Tell");
        txtpeptell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpeptellActionPerformed(evt);
            }
        });
        jPanel23.add(txtpeptell, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 210, 40));

        lblPepSex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPepSex.setForeground(new java.awt.Color(240, 240, 240));
        lblPepSex.setText("Sex");
        jPanel23.add(lblPepSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 60, 30));

        male.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel23.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 70, 30));

        female.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel23.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 70, 30));

        lblPepDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPepDate.setForeground(new java.awt.Color(240, 240, 240));
        lblPepDate.setText("Brith_date");
        jPanel23.add(lblPepDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));
        jPanel23.add(jDatepeop, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 210, 40));

        txtpepwei.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpepwei.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpepwei.setPhColor(new java.awt.Color(0, 102, 102));
        txtpepwei.setPlaceholder("Enter Weight");
        txtpepwei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpepweiActionPerformed(evt);
            }
        });
        jPanel23.add(txtpepwei, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 210, 40));

        lblPepWeight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPepWeight.setForeground(new java.awt.Color(240, 240, 240));
        lblPepWeight.setText("Weight");
        jPanel23.add(lblPepWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 70, 30));

        lblPepJobNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPepJobNo.setForeground(new java.awt.Color(240, 240, 240));
        lblPepJobNo.setText("Job_no");
        jPanel23.add(lblPepJobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 80, 30));

        job_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Job" }));
        job_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                job_noMouseClicked(evt);
            }
        });
        job_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                job_noActionPerformed(evt);
            }
        });
        jPanel23.add(job_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 180, 40));

        lblPepDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPepDesc.setForeground(new java.awt.Color(240, 240, 240));
        lblPepDesc.setText("Desc");
        jPanel23.add(lblPepDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 30));

        txtpepdes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpepdes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpepdes.setPhColor(new java.awt.Color(0, 102, 102));
        txtpepdes.setPlaceholder("Enter Desc");
        txtpepdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpepdesActionPerformed(evt);
            }
        });
        jPanel23.add(txtpepdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 210, 40));

        lblPepRegDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPepRegDate.setForeground(new java.awt.Color(240, 240, 240));
        lblPepRegDate.setText("Reg_Date");
        jPanel23.add(lblPepRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 100, 30));
        jPanel23.add(jDatepepreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 210, 40));

        btnsave1.setBackground(new java.awt.Color(0, 102, 102));
        btnsave1.setText("Save");
        btnsave1.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnsave1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave1ActionPerformed(evt);
            }
        });
        jPanel23.add(btnsave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, 30));

        rSButtonIcon_new5.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new5.setText("Update");
        rSButtonIcon_new5.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new5ActionPerformed(evt);
            }
        });
        jPanel23.add(rSButtonIcon_new5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 100, 30));

        rSButtonIcon_new6.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new6.setText("Reset");
        rSButtonIcon_new6.setToolTipText("");
        rSButtonIcon_new6.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new6.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIcon_new6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new6ActionPerformed(evt);
            }
        });
        jPanel23.add(rSButtonIcon_new6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 90, 30));

        rSButtonIcon_new7.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new7.setText("Delete");
        rSButtonIcon_new7.setActionCommand("Save");
        rSButtonIcon_new7.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new7.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new7ActionPerformed(evt);
            }
        });
        jPanel23.add(rSButtonIcon_new7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 100, 30));

        txtpepser.setBackground(new java.awt.Color(0, 153, 153));
        txtpepser.setForeground(new java.awt.Color(0, 0, 0));
        txtpepser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpepser.setBorderColor(new java.awt.Color(255, 255, 255));
        txtpepser.setColorIcon(new java.awt.Color(255, 255, 255));
        txtpepser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpepser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtpepser.setPhColor(new java.awt.Color(204, 204, 204));
        txtpepser.setPlaceholder("Type Here To Search");
        txtpepser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpepserActionPerformed(evt);
            }
        });
        txtpepser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpepserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpepserKeyReleased(evt);
            }
        });
        jPanel23.add(txtpepser, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 240, -1));

        rSButtonIcon_new8.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new8.setText("Search");
        rSButtonIcon_new8.setActionCommand("Save");
        rSButtonIcon_new8.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new8.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new8ActionPerformed(evt);
            }
        });
        jPanel23.add(rSButtonIcon_new8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 100, -1));

        peptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        peptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peptableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(peptable);

        jPanel23.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1160, 250));

        jLabel45.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel23.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1150, 230));

        jTabbedPane4.addTab("People", jPanel23);

        jPanel19.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 530));

        jTabbedPane3.addTab("Shaqada&shaqalaha", jPanel19);

        jPanel20.setBackground(new java.awt.Color(0, 153, 153));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(204, 0, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Team");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, 30));

        jButton4.setBackground(new java.awt.Color(204, 0, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Compotition");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 30));

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Matches");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 30));

        jButton6.setBackground(new java.awt.Color(204, 0, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Activities");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 30));

        jButton7.setBackground(new java.awt.Color(204, 0, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("MatchActivities");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 30));

        jButton8.setBackground(new java.awt.Color(204, 0, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("PlayerAggriment");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, 30));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 0, 153)));
        jLabel7.setOpaque(true);
        jPanel20.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1170, 30));

        jTabbedPane5.setBackground(new java.awt.Color(0, 153, 153));

        jPanel24.setBackground(new java.awt.Color(0, 102, 102));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblteamName.setForeground(new java.awt.Color(255, 255, 255));
        lblteamName.setText("Team_Name");
        lblteamName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblteamName.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        jPanel24.add(lblteamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 30));

        lblteamdescrip.setForeground(new java.awt.Color(255, 255, 255));
        lblteamdescrip.setText("Description");
        lblteamdescrip.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblteamdescrip.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DESCRIPTION);
        jPanel24.add(lblteamdescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 130, 30));

        txtteamname.setBackground(new java.awt.Color(0, 153, 153));
        txtteamname.setForeground(new java.awt.Color(255, 255, 255));
        txtteamname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtteamname.setBorderColor(new java.awt.Color(255, 255, 255));
        txtteamname.setPhColor(new java.awt.Color(204, 204, 204));
        txtteamname.setPlaceholder("Enter Team_Name");
        jPanel24.add(txtteamname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, -1));

        txtteamdesc.setBackground(new java.awt.Color(0, 153, 153));
        txtteamdesc.setForeground(new java.awt.Color(255, 255, 255));
        txtteamdesc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtteamdesc.setBorderColor(new java.awt.Color(255, 255, 255));
        txtteamdesc.setPhColor(new java.awt.Color(204, 204, 204));
        txtteamdesc.setPlaceholder("Enter Desc");
        jPanel24.add(txtteamdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 230, -1));

        btnteamsave.setBackground(new java.awt.Color(0, 102, 102));
        btnteamsave.setText("Save");
        btnteamsave.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnteamsave.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnteamsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnteamsaveActionPerformed(evt);
            }
        });
        jPanel24.add(btnteamsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setText("Update");
        btnUpdate.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnUpdate.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel24.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 100, -1));

        btnreset.setBackground(new java.awt.Color(0, 102, 102));
        btnreset.setText("Reset");
        btnreset.setToolTipText("");
        btnreset.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnreset.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel24.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 90, -1));

        btndelete.setBackground(new java.awt.Color(0, 102, 102));
        btndelete.setText("Delete");
        btndelete.setActionCommand("Save");
        btndelete.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btndelete.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel24.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 100, -1));

        txtserteam.setBackground(new java.awt.Color(0, 153, 153));
        txtserteam.setForeground(new java.awt.Color(255, 255, 255));
        txtserteam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtserteam.setBorderColor(new java.awt.Color(255, 255, 255));
        txtserteam.setColorIcon(new java.awt.Color(255, 255, 255));
        txtserteam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtserteam.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtserteam.setPhColor(new java.awt.Color(204, 204, 204));
        txtserteam.setPlaceholder("Type Here To Search");
        txtserteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserteamActionPerformed(evt);
            }
        });
        txtserteam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtserteamKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtserteamKeyReleased(evt);
            }
        });
        jPanel24.add(txtserteam, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 240, -1));

        rSButtonIcon_new22.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new22.setText("Search");
        rSButtonIcon_new22.setActionCommand("Save");
        rSButtonIcon_new22.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new22.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new22ActionPerformed(evt);
            }
        });
        jPanel24.add(rSButtonIcon_new22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 100, -1));

        teamtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(teamtable);

        jPanel24.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 680, 360));

        lbl_teamName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_teamName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel24.add(lbl_teamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, 30));

        lbl_teamDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_teamDesc.setForeground(new java.awt.Color(255, 255, 255));
        jPanel24.add(lbl_teamDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 30));

        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel24.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 480, 320));

        jTabbedPane5.addTab("Team", jPanel24);

        jPanel32.setBackground(new java.awt.Color(0, 102, 102));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Com_name");
        jPanel32.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 30));

        txtcomname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcomname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcomname.setPhColor(new java.awt.Color(0, 102, 102));
        txtcomname.setPlaceholder("Enter Name");
        txtcomname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcomnameActionPerformed(evt);
            }
        });
        jPanel32.add(txtcomname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 220, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Description");
        jPanel32.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 30));

        txtcomdesc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcomdesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcomdesc.setPhColor(new java.awt.Color(0, 102, 102));
        txtcomdesc.setPlaceholder("Enter Desc");
        txtcomdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcomdescActionPerformed(evt);
            }
        });
        jPanel32.add(txtcomdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 220, 40));

        btnsave4.setBackground(new java.awt.Color(0, 102, 102));
        btnsave4.setText("Save");
        btnsave4.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnsave4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnsave4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave4ActionPerformed(evt);
            }
        });
        jPanel32.add(btnsave4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 40));

        rSButtonIcon_new23.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new23.setText("Update");
        rSButtonIcon_new23.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new23.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new23ActionPerformed(evt);
            }
        });
        jPanel32.add(rSButtonIcon_new23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, 40));

        rSButtonIcon_new24.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new24.setText("Reset");
        rSButtonIcon_new24.setToolTipText("");
        rSButtonIcon_new24.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new24.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIcon_new24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new24ActionPerformed(evt);
            }
        });
        jPanel32.add(rSButtonIcon_new24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 90, 40));

        rSButtonIcon_new25.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new25.setText("Delete");
        rSButtonIcon_new25.setActionCommand("Save");
        rSButtonIcon_new25.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new25.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new25ActionPerformed(evt);
            }
        });
        jPanel32.add(rSButtonIcon_new25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 100, 40));

        txtsercom.setForeground(new java.awt.Color(0, 0, 0));
        txtsercom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsercom.setColorIcon(new java.awt.Color(0, 102, 102));
        txtsercom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtsercom.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtsercom.setPhColor(new java.awt.Color(0, 102, 102));
        txtsercom.setPlaceholder("Type Here To Search");
        txtsercom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsercomActionPerformed(evt);
            }
        });
        txtsercom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsercomKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsercomKeyReleased(evt);
            }
        });
        jPanel32.add(txtsercom, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        rSButtonIcon_new26.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new26.setText("Search");
        rSButtonIcon_new26.setActionCommand("Save");
        rSButtonIcon_new26.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new26.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new26ActionPerformed(evt);
            }
        });
        jPanel32.add(rSButtonIcon_new26, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 100, 40));

        comtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(comtable);

        jPanel32.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 120, 710, 370));

        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel32.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 440, 300));

        jTabbedPane5.addTab("Competions", jPanel32);

        jPanel25.setBackground(new java.awt.Color(0, 102, 102));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setText("Com_No");
        jPanel25.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 30));

        macthescompe_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Competition" }));
        macthescompe_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macthescompe_noActionPerformed(evt);
            }
        });
        jPanel25.add(macthescompe_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 230, 40));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(240, 240, 240));
        jLabel40.setText("Team_no");
        jPanel25.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 30));

        matchesteam_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select teams" }));
        matchesteam_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchesteam_noActionPerformed(evt);
            }
        });
        jPanel25.add(matchesteam_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 230, 40));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(240, 240, 240));
        jLabel41.setText("mat_Date");
        jPanel25.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 100, 30));

        JDatematches.setForeground(new java.awt.Color(0, 102, 102));
        JDatematches.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel25.add(JDatematches, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 230, 40));

        btnSave3.setBackground(new java.awt.Color(0, 102, 102));
        btnSave3.setText("Save");
        btnSave3.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnSave3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnSave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave3ActionPerformed(evt);
            }
        });
        jPanel25.add(btnSave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 90, -1));

        rSButtonIcon_new35.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new35.setText("Update");
        rSButtonIcon_new35.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new35.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new35ActionPerformed(evt);
            }
        });
        jPanel25.add(rSButtonIcon_new35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 100, -1));

        rSButtonIcon_new36.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new36.setText("Reset");
        rSButtonIcon_new36.setToolTipText("");
        rSButtonIcon_new36.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new36.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel25.add(rSButtonIcon_new36, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 90, -1));

        rSButtonIcon_new37.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new37.setText("Delete");
        rSButtonIcon_new37.setActionCommand("Save");
        rSButtonIcon_new37.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new37.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new37ActionPerformed(evt);
            }
        });
        jPanel25.add(rSButtonIcon_new37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 100, -1));

        txtsermatches.setBackground(new java.awt.Color(0, 153, 153));
        txtsermatches.setForeground(new java.awt.Color(255, 255, 255));
        txtsermatches.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsermatches.setBorderColor(new java.awt.Color(255, 255, 255));
        txtsermatches.setColorIcon(new java.awt.Color(255, 255, 255));
        txtsermatches.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtsermatches.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtsermatches.setPhColor(new java.awt.Color(204, 204, 204));
        txtsermatches.setPlaceholder("Type Here To Search");
        txtsermatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsermatchesActionPerformed(evt);
            }
        });
        txtsermatches.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsermatchesKeyPressed(evt);
            }
        });
        jPanel25.add(txtsermatches, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 240, -1));

        rSButtonIcon_new38.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new38.setText("Search");
        rSButtonIcon_new38.setActionCommand("Save");
        rSButtonIcon_new38.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new38.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new38ActionPerformed(evt);
            }
        });
        jPanel25.add(rSButtonIcon_new38, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 100, -1));

        matchesTablerecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        matchestable.setViewportView(matchesTablerecord);

        jPanel25.add(matchestable, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 710, 360));

        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel25.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 430, 310));

        jTabbedPane5.addTab("Match", jPanel25);

        jPanel26.setBackground(new java.awt.Color(0, 102, 102));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(240, 240, 240));
        jLabel31.setText("ActivityName");
        jPanel26.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        txtactivityname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtactivityname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtactivityname.setPhColor(new java.awt.Color(0, 102, 102));
        txtactivityname.setPlaceholder("Enter Acc_Name");
        txtactivityname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactivitynameActionPerformed(evt);
            }
        });
        jPanel26.add(txtactivityname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 220, 40));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(240, 240, 240));
        jLabel32.setText("ActDesc");
        jPanel26.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 30));

        txtactivtyDesc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtactivtyDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtactivtyDesc.setPhColor(new java.awt.Color(0, 102, 102));
        txtactivtyDesc.setPlaceholder("Enter institution");
        txtactivtyDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactivtyDescActionPerformed(evt);
            }
        });
        jPanel26.add(txtactivtyDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 220, 40));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(240, 240, 240));
        jLabel33.setText("ActDate");
        jPanel26.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 30));

        jDateActivities.setForeground(new java.awt.Color(0, 102, 102));
        jDateActivities.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel26.add(jDateActivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 220, 40));

        btnsave5.setBackground(new java.awt.Color(0, 102, 102));
        btnsave5.setText("Save");
        btnsave5.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnsave5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnsave5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave5ActionPerformed(evt);
            }
        });
        jPanel26.add(btnsave5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 90, -1));

        rSButtonIcon_new31.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new31.setText("Update");
        rSButtonIcon_new31.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new31.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new31ActionPerformed(evt);
            }
        });
        jPanel26.add(rSButtonIcon_new31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 100, -1));

        rSButtonIcon_new32.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new32.setText("Reset");
        rSButtonIcon_new32.setToolTipText("");
        rSButtonIcon_new32.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new32.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIcon_new32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new32ActionPerformed(evt);
            }
        });
        jPanel26.add(rSButtonIcon_new32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 90, -1));

        rSButtonIcon_new33.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new33.setText("Delete");
        rSButtonIcon_new33.setActionCommand("Save");
        rSButtonIcon_new33.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new33.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new33ActionPerformed(evt);
            }
        });
        jPanel26.add(rSButtonIcon_new33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 100, -1));

        txtseractivity.setBackground(new java.awt.Color(0, 153, 153));
        txtseractivity.setForeground(new java.awt.Color(255, 255, 255));
        txtseractivity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtseractivity.setBorderColor(new java.awt.Color(255, 255, 255));
        txtseractivity.setColorIcon(new java.awt.Color(255, 255, 255));
        txtseractivity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtseractivity.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtseractivity.setPhColor(new java.awt.Color(204, 204, 204));
        txtseractivity.setPlaceholder("Type Here To Search");
        txtseractivity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtseractivityMouseClicked(evt);
            }
        });
        txtseractivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseractivityActionPerformed(evt);
            }
        });
        txtseractivity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtseractivityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtseractivityKeyReleased(evt);
            }
        });
        jPanel26.add(txtseractivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 240, -1));

        rSButtonIcon_new34.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new34.setText("Search");
        rSButtonIcon_new34.setActionCommand("Save");
        rSButtonIcon_new34.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new34.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new34ActionPerformed(evt);
            }
        });
        jPanel26.add(rSButtonIcon_new34, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 100, -1));

        tableactivity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tableactivity);

        jPanel26.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 730, 340));

        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel26.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 420, 370));

        jTabbedPane5.addTab("Activities", jPanel26);

        jPanel27.setBackground(new java.awt.Color(0, 102, 102));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 240, 240));
        jLabel34.setText("Activity_No");
        jPanel27.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 30));

        activity_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Activity" }));
        activity_no.setSelectedItem(activity_no
        );
        activity_no.setToolTipText("");
        activity_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activity_noActionPerformed(evt);
            }
        });
        jPanel27.add(activity_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 210, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(240, 240, 240));
        jLabel35.setText("Match_No");
        jPanel27.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 100, 30));

        match_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "match_No" }));
        match_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                match_noActionPerformed(evt);
            }
        });
        jPanel27.add(match_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 210, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(240, 240, 240));
        jLabel36.setText("people_No");
        jPanel27.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 110, 30));

        macpeople_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "people_no" }));
        macpeople_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macpeople_noActionPerformed(evt);
            }
        });
        jPanel27.add(macpeople_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 210, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(240, 240, 240));
        jLabel37.setText("Acti_time");
        jPanel27.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 30));
        jPanel27.add(txtAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, 40));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(240, 240, 240));
        jLabel38.setText("Description");
        jPanel27.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 110, 30));
        jPanel27.add(txtdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 200, 40));

        btnSave2.setBackground(new java.awt.Color(0, 102, 102));
        btnSave2.setText("Save");
        btnSave2.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnSave2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });
        jPanel27.add(btnSave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 90, -1));

        btnupdate.setBackground(new java.awt.Color(0, 102, 102));
        btnupdate.setText("Update");
        btnupdate.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnupdate.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel27.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 100, -1));

        btnreset1.setBackground(new java.awt.Color(0, 102, 102));
        btnreset1.setText("Reset");
        btnreset1.setToolTipText("");
        btnreset1.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnreset1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });
        jPanel27.add(btnreset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 90, -1));

        btndell.setBackground(new java.awt.Color(0, 102, 102));
        btndell.setText("Delete");
        btndell.setActionCommand("Save");
        btndell.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btndell.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btndell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndellActionPerformed(evt);
            }
        });
        jPanel27.add(btndell, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 100, -1));

        txtsermactivity.setBackground(new java.awt.Color(0, 153, 153));
        txtsermactivity.setForeground(new java.awt.Color(255, 255, 255));
        txtsermactivity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsermactivity.setBorderColor(new java.awt.Color(255, 255, 255));
        txtsermactivity.setColorIcon(new java.awt.Color(255, 255, 255));
        txtsermactivity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtsermactivity.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtsermactivity.setPhColor(new java.awt.Color(204, 204, 204));
        txtsermactivity.setPlaceholder("Type Here To Search");
        txtsermactivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsermactivityActionPerformed(evt);
            }
        });
        txtsermactivity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsermactivityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsermactivityKeyReleased(evt);
            }
        });
        jPanel27.add(txtsermactivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 240, -1));

        btnser.setBackground(new java.awt.Color(0, 102, 102));
        btnser.setText("Search");
        btnser.setActionCommand("Save");
        btnser.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnser.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserActionPerformed(evt);
            }
        });
        jPanel27.add(btnser, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 100, -1));

        matchactivitytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(matchactivitytable);

        jPanel27.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1160, 260));

        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel27.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1150, 190));

        jTabbedPane5.addTab("Match_Actvity", jPanel27);

        jPanel28.setBackground(new java.awt.Color(0, 102, 102));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("peopleNo");
        jPanel28.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 30));

        playerpeople_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Player" }));
        playerpeople_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerpeople_noActionPerformed(evt);
            }
        });
        jPanel28.add(playerpeople_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 190, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(240, 240, 240));
        jLabel26.setText("TeamNo");
        jPanel28.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 90, 30));

        playerteam_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Team" }));
        playerteam_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerteam_noActionPerformed(evt);
            }
        });
        jPanel28.add(playerteam_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 190, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(240, 240, 240));
        jLabel27.setText("AggDateTime");
        jPanel28.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 130, 30));

        jDateplayer_agg.setForeground(new java.awt.Color(0, 102, 102));
        jDateplayer_agg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel28.add(jDateplayer_agg, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 180, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 240, 240));
        jLabel28.setText("Cost");
        jPanel28.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, 30));

        txtcostplayer.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtcostplayer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcostplayer.setPhColor(new java.awt.Color(0, 102, 102));
        txtcostplayer.setPlaceholder("Enter Cost");
        txtcostplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostplayerActionPerformed(evt);
            }
        });
        jPanel28.add(txtcostplayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 180, 40));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(240, 240, 240));
        jLabel29.setText("Duretion");
        jPanel28.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 100, 30));

        txtplayerdur.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtplayerdur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtplayerdur.setPhColor(new java.awt.Color(0, 102, 102));
        txtplayerdur.setPlaceholder("Enter Duretion");
        txtplayerdur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplayerdurActionPerformed(evt);
            }
        });
        jPanel28.add(txtplayerdur, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 180, 40));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(240, 240, 240));
        jLabel30.setText("Description");
        jPanel28.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 110, 30));

        txtplayerdes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtplayerdes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtplayerdes.setPhColor(new java.awt.Color(0, 102, 102));
        txtplayerdes.setPlaceholder("Enter Desc");
        txtplayerdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplayerdesActionPerformed(evt);
            }
        });
        jPanel28.add(txtplayerdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 180, 40));

        btnSave1.setBackground(new java.awt.Color(0, 102, 102));
        btnSave1.setText("Save");
        btnSave1.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnSave1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel28.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 90, -1));

        rSButtonIcon_new27.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new27.setText("Update");
        rSButtonIcon_new27.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new27.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new27ActionPerformed(evt);
            }
        });
        jPanel28.add(rSButtonIcon_new27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 100, -1));

        rSButtonIcon_new28.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new28.setText("Reset");
        rSButtonIcon_new28.setToolTipText("");
        rSButtonIcon_new28.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new28.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIcon_new28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new28ActionPerformed(evt);
            }
        });
        jPanel28.add(rSButtonIcon_new28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 90, -1));

        rSButtonIcon_new29.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new29.setText("Delete");
        rSButtonIcon_new29.setActionCommand("Save");
        rSButtonIcon_new29.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new29.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new29ActionPerformed(evt);
            }
        });
        jPanel28.add(rSButtonIcon_new29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 100, -1));

        txtserplayer.setBackground(new java.awt.Color(0, 153, 153));
        txtserplayer.setForeground(new java.awt.Color(255, 255, 255));
        txtserplayer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtserplayer.setBorderColor(new java.awt.Color(255, 255, 255));
        txtserplayer.setColorIcon(new java.awt.Color(255, 255, 255));
        txtserplayer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtserplayer.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtserplayer.setPhColor(new java.awt.Color(204, 204, 204));
        txtserplayer.setPlaceholder("Type Here To Search");
        txtserplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserplayerActionPerformed(evt);
            }
        });
        txtserplayer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtserplayerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtserplayerKeyReleased(evt);
            }
        });
        jPanel28.add(txtserplayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 240, -1));

        rSButtonIcon_new30.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new30.setText("Search");
        rSButtonIcon_new30.setActionCommand("Save");
        rSButtonIcon_new30.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new30.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new30ActionPerformed(evt);
            }
        });
        jPanel28.add(rSButtonIcon_new30, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 100, -1));

        playeragrimenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(playeragrimenttable);

        jPanel28.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1160, 260));

        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel28.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1140, 190));

        jTabbedPane5.addTab("Player_Agg", jPanel28);

        jPanel20.add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 580));

        jTabbedPane3.addTab("Group Issue", jPanel20);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBackground(new java.awt.Color(204, 0, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Accounts");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 30));

        jButton10.setBackground(new java.awt.Color(204, 0, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Bills");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 30));

        jButton11.setBackground(new java.awt.Color(204, 0, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Payments");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 30));

        jLabel42.setBackground(new java.awt.Color(0, 153, 153));
        jLabel42.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 0, 153)));
        jLabel42.setOpaque(true);
        jPanel21.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1180, 30));

        jPanel29.setBackground(new java.awt.Color(0, 102, 102));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Acc_Name");
        jPanel29.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

        txtaccname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtaccname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaccname.setPhColor(new java.awt.Color(0, 102, 102));
        txtaccname.setPlaceholder("Enter Acc_Name");
        txtaccname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccnameActionPerformed(evt);
            }
        });
        jPanel29.add(txtaccname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 260, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Institution");
        jPanel29.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 30));

        txtaccinst.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtaccinst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaccinst.setPhColor(new java.awt.Color(0, 102, 102));
        txtaccinst.setPlaceholder("Enter institution");
        txtaccinst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccinstActionPerformed(evt);
            }
        });
        jPanel29.add(txtaccinst, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 260, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Balance");
        jPanel29.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 30));

        txtaccbal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtaccbal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaccbal.setPhColor(new java.awt.Color(0, 102, 102));
        txtaccbal.setPlaceholder("Enter Balance");
        txtaccbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccbalActionPerformed(evt);
            }
        });
        jPanel29.add(txtaccbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 260, 40));

        btnSave.setBackground(new java.awt.Color(0, 102, 102));
        btnSave.setText("Save");
        btnSave.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnSave.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel29.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, 30));

        rSButtonIcon_new9.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new9.setText("Update");
        rSButtonIcon_new9.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new9.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new9ActionPerformed(evt);
            }
        });
        jPanel29.add(rSButtonIcon_new9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 100, 30));

        rSButtonIcon_new10.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new10.setText("Reset");
        rSButtonIcon_new10.setToolTipText("");
        rSButtonIcon_new10.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new10.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIcon_new10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new10ActionPerformed(evt);
            }
        });
        jPanel29.add(rSButtonIcon_new10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 90, 30));

        rSButtonIcon_new11.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new11.setText("Delete");
        rSButtonIcon_new11.setActionCommand("Save");
        rSButtonIcon_new11.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new11.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new11ActionPerformed(evt);
            }
        });
        jPanel29.add(rSButtonIcon_new11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 100, 30));

        txtseracc.setBackground(new java.awt.Color(0, 153, 153));
        txtseracc.setForeground(new java.awt.Color(255, 255, 255));
        txtseracc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtseracc.setBorderColor(new java.awt.Color(255, 255, 255));
        txtseracc.setColorIcon(new java.awt.Color(255, 255, 255));
        txtseracc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtseracc.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtseracc.setPhColor(new java.awt.Color(204, 204, 204));
        txtseracc.setPlaceholder("Type Here To Search");
        txtseracc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtseraccActionPerformed(evt);
            }
        });
        txtseracc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtseraccKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtseraccKeyReleased(evt);
            }
        });
        jPanel29.add(txtseracc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 240, -1));

        rSButtonIcon_new12.setBackground(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new12.setText("Search");
        rSButtonIcon_new12.setActionCommand("Save");
        rSButtonIcon_new12.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new12.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new12ActionPerformed(evt);
            }
        });
        jPanel29.add(rSButtonIcon_new12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 100, -1));

        acctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(acctable);

        jPanel29.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 700, 370));

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel29.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 440, 310));

        jTabbedPane7.addTab("Accounts", jPanel29);

        jPanel30.setBackground(new java.awt.Color(0, 102, 102));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bilpeople_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select person" }));
        bilpeople_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilpeople_noActionPerformed(evt);
            }
        });
        jPanel30.add(bilpeople_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 240, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("people_no");
        jPanel30.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("bill_date");
        jPanel30.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 40));

        amountB.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        amountB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amountB.setPhColor(new java.awt.Color(0, 102, 102));
        amountB.setPlaceholder("Enter Amount");
        amountB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountBActionPerformed(evt);
            }
        });
        jPanel30.add(amountB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 240, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("amount");
        jPanel30.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 30));

        txtserbill.setBackground(new java.awt.Color(0, 153, 153));
        txtserbill.setForeground(new java.awt.Color(255, 255, 255));
        txtserbill.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtserbill.setBorderColor(new java.awt.Color(255, 255, 255));
        txtserbill.setColorIcon(new java.awt.Color(255, 255, 255));
        txtserbill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtserbill.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtserbill.setPhColor(new java.awt.Color(204, 204, 204));
        txtserbill.setPlaceholder("Type Here To Search");
        txtserbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserbillActionPerformed(evt);
            }
        });
        txtserbill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtserbillKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtserbillKeyReleased(evt);
            }
        });
        jPanel30.add(txtserbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 240, -1));

        rSButtonIcon_new13.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new13.setText("Search");
        rSButtonIcon_new13.setActionCommand("Save");
        rSButtonIcon_new13.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new13.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new13ActionPerformed(evt);
            }
        });
        jPanel30.add(rSButtonIcon_new13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 100, -1));

        rSButtonIcon_new14.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new14.setText("Delete");
        rSButtonIcon_new14.setActionCommand("Save");
        rSButtonIcon_new14.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new14.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new14ActionPerformed(evt);
            }
        });
        jPanel30.add(rSButtonIcon_new14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 100, 30));

        rSButtonIcon_new15.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new15.setText("Reset");
        rSButtonIcon_new15.setToolTipText("");
        rSButtonIcon_new15.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new15.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIcon_new15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new15ActionPerformed(evt);
            }
        });
        jPanel30.add(rSButtonIcon_new15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 90, 30));

        rSButtonIcon_new16.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new16.setText("Update");
        rSButtonIcon_new16.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new16.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new16ActionPerformed(evt);
            }
        });
        jPanel30.add(rSButtonIcon_new16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 100, 30));

        rSButtonIcon_new17.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new17.setText("Save");
        rSButtonIcon_new17.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new17.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonIcon_new17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new17ActionPerformed(evt);
            }
        });
        jPanel30.add(rSButtonIcon_new17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 90, 30));

        billstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(billstable);

        jPanel30.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 660, 370));

        billDate.setForeground(new java.awt.Color(0, 102, 102));
        billDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel30.add(billDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 240, 40));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Desc");
        jPanel30.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 80, 30));

        bilDesc.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        bilDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bilDesc.setPhColor(new java.awt.Color(0, 102, 102));
        bilDesc.setPlaceholder("Enter Amount");
        bilDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilDescActionPerformed(evt);
            }
        });
        jPanel30.add(bilDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 240, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jPanel30.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 470, 350));

        jTabbedPane7.addTab("Blls", jPanel30);

        jPanel31.setBackground(new java.awt.Color(0, 102, 102));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Acc_No");
        jPanel31.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 30));

        acc_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account" }));
        acc_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_noActionPerformed(evt);
            }
        });
        jPanel31.add(acc_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 230, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("Amount");
        jPanel31.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 30));

        txtamountpyment.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtamountpyment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtamountpyment.setPhColor(new java.awt.Color(0, 102, 102));
        txtamountpyment.setPlaceholder("Enter Amount");
        txtamountpyment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountpymentActionPerformed(evt);
            }
        });
        jPanel31.add(txtamountpyment, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 230, 40));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("Py_Date");
        jPanel31.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, 30));

        jDatepayment.setForeground(new java.awt.Color(0, 102, 102));
        jDatepayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel31.add(jDatepayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 230, 40));

        btnsave2.setBackground(new java.awt.Color(0, 102, 102));
        btnsave2.setText("Save");
        btnsave2.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnsave2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave2ActionPerformed(evt);
            }
        });
        jPanel31.add(btnsave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 90, 40));

        rSButtonIcon_new18.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new18.setText("Update");
        rSButtonIcon_new18.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new18.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonIcon_new18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new18ActionPerformed(evt);
            }
        });
        jPanel31.add(rSButtonIcon_new18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 100, 40));

        rSButtonIcon_new19.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new19.setText("Reset");
        rSButtonIcon_new19.setToolTipText("");
        rSButtonIcon_new19.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new19.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIcon_new19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new19ActionPerformed(evt);
            }
        });
        jPanel31.add(rSButtonIcon_new19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 90, 40));

        rSButtonIcon_new20.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new20.setText("Delete");
        rSButtonIcon_new20.setActionCommand("Save");
        rSButtonIcon_new20.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new20.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonIcon_new20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new20ActionPerformed(evt);
            }
        });
        jPanel31.add(rSButtonIcon_new20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 100, 40));

        txtserpay.setBackground(new java.awt.Color(0, 153, 153));
        txtserpay.setForeground(new java.awt.Color(255, 255, 255));
        txtserpay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtserpay.setBorderColor(new java.awt.Color(255, 255, 255));
        txtserpay.setColorIcon(new java.awt.Color(255, 255, 255));
        txtserpay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtserpay.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        txtserpay.setPhColor(new java.awt.Color(204, 204, 204));
        txtserpay.setPlaceholder("Type Here To Search");
        txtserpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserpayActionPerformed(evt);
            }
        });
        txtserpay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtserpayKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtserpayKeyReleased(evt);
            }
        });
        jPanel31.add(txtserpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 240, -1));

        rSButtonIcon_new21.setBackground(new java.awt.Color(0, 102, 102));
        rSButtonIcon_new21.setText("Search");
        rSButtonIcon_new21.setActionCommand("Save");
        rSButtonIcon_new21.setBackgroundHover(new java.awt.Color(0, 153, 153));
        rSButtonIcon_new21.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIcon_new21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIcon_new21ActionPerformed(evt);
            }
        });
        jPanel31.add(rSButtonIcon_new21, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 100, -1));

        pytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(pytable);

        jPanel31.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 690, 350));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(240, 240, 240));
        jLabel47.setText("PeopleNo");
        jPanel31.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, 30));

        peoplePayments_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Person" }));
        peoplePayments_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peoplePayments_noActionPerformed(evt);
            }
        });
        jPanel31.add(peoplePayments_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 230, 40));

        jTabbedPane7.addTab("Payments", jPanel31);

        jPanel21.add(jTabbedPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, -1, 530));

        jTabbedPane3.addTab("MonitiZation", jPanel21);

        jPanel5.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1180, 580));

        jTabbedPane2.addTab("Menu", jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1165, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Report", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1165, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("About", jPanel7);

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setOpaque(true);
        jTabbedPane2.addTab("tab6", jLabel1);

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Team", jPanel10);

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Competition", jPanel11);

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Matches", jPanel12);

        jPanel13.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Activities", jPanel13);

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Match_activity", jPanel14);

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Player_agriments", jPanel15);

        jPanel16.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Accounts", jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bills", jPanel17);

        jPanel18.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Payments", jPanel18);

        jPanel8.setBackground(new java.awt.Color(102, 0, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Jobs", jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHover1.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover1.setText("Activities");
        jPanel9.add(buttonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 100, 40));

        buttonHover2.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover2.setText("Jobs");
        jPanel9.add(buttonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, 40));

        buttonHover3.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover3.setText("People");
        jPanel9.add(buttonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 100, 40));

        buttonHover4.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover4.setText("Team");
        buttonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHover4ActionPerformed(evt);
            }
        });
        jPanel9.add(buttonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 100, 40));

        buttonHover5.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover5.setText("Competition");
        jPanel9.add(buttonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 100, 40));

        buttonHover6.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover6.setText("MAtches");
        jPanel9.add(buttonHover6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 100, 40));

        buttonHover7.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover7.setText("Mat_activity");
        jPanel9.add(buttonHover7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, 40));

        buttonHover8.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover8.setText("Player_Agg");
        buttonHover8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHover8ActionPerformed(evt);
            }
        });
        jPanel9.add(buttonHover8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 100, 40));

        buttonHover9.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover9.setText("Accounts");
        jPanel9.add(buttonHover9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 100, 40));

        buttonHover10.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover10.setText("Bills");
        jPanel9.add(buttonHover10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 100, 40));

        buttonHover11.setBackground(new java.awt.Color(102, 51, 0));
        buttonHover11.setText("Payments");
        jPanel9.add(buttonHover11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 100, 40));

        jTabbedPane1.addTab("People", jPanel9);

        jTabbedPane2.addTab("tab5", jTabbedPane1);

        jPanel2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 1170, 650));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconTwo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_rSButtonMaterialIconTwo4ActionPerformed

    private void rSButtonMaterialIconTwo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_rSButtonMaterialIconTwo3ActionPerformed

    private void buttonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHover4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHover4ActionPerformed

    private void buttonHover8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHover8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHover8ActionPerformed

    private void rSButtonMaterialIconTwo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
        
    }//GEN-LAST:event_rSButtonMaterialIconTwo5ActionPerformed

    private void rSButtonMaterialIconTwo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_rSButtonMaterialIconTwo6ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        //job table
        validation();
        String oper="insert";
        String sql="call jobs_proc(null,'"+txtjobname.getText()+"', '"+txtjobdesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtjobname.setText("");  txtjobdesc.setText("");

    }//GEN-LAST:event_btnsaveActionPerformed

    private void rSButtonIcon_new3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new3ActionPerformed
        // TODO add your handling code here:
        //job table
        String oper="update";
        String sql="call jobs_proc('"+id+"','"+txtjobname.getText()+"', '"+txtjobdesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtjobname.setText("");  txtjobdesc.setText("");
        btnsave.setEnabled(true);

    }//GEN-LAST:event_rSButtonIcon_new3ActionPerformed

    private void rSButtonIcon_new4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new4ActionPerformed
        // TODO add your handling code here:

        txtjobname.setText("");
        txtjobdesc.setText("");
        btnsave.setEnabled(true);
    }//GEN-LAST:event_rSButtonIcon_new4ActionPerformed

    private void rSButtonIcon_new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new1ActionPerformed
        // TODO add your handling code here:
        // delete part..............................
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        String sql="call jobs_proc('"+id+"','"+txtjobname.getText()+"', '"+txtjobdesc.getText()+"','"+oper+"')";
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        co.setSQL(sql);
        display();
        txtjobname.setText("");  txtjobdesc.setText("");
        btnsave.setEnabled(true);

    }//GEN-LAST:event_rSButtonIcon_new1ActionPerformed
    }
    }
    private void rSButtonIcon_new2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new2ActionPerformed
        // TODO add your handling code here:
        // search part..............................................
        String sql="select * from jobs where j_name='"+txtserjob.getText()+"' or Description='"+txtserjob.getText()+"' or job_no='"+txtserjob.getText()+"'";
        co.search(sql);
        try{
            if(co.rs.next()){
                id=co.rs.getString("JOB_NO");
                txtjobname.setText(co.rs.getString("j_name"));
                txtjobdesc.setText(co.rs.getString("Description"));
                btnsave.setEnabled(false);
                txtserjob.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtserjob.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_rSButtonIcon_new2ActionPerformed

    private void txtpepnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpepnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpepnameActionPerformed

    private void txtpeptellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpeptellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpeptellActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        Gender="Male";
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        Gender="Female";
    }//GEN-LAST:event_femaleActionPerformed

    private void txtpepweiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpepweiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpepweiActionPerformed

    private void job_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_job_noMouseClicked
        // TODO add your handling code here:

        //        try{
            //          co.search("SELECT * FROM `jobs` WHERE name='"+job_no.getSelectedItem()+"'");
            //         if(co.rs.next()){
                //             job=co.rs.getString("job_no");
                //
                //         }
            //          }
        //       catch(Exception ex){
            //           JOptionPane.showMessageDialog(null, ex.getMessage());
            //       }
    }//GEN-LAST:event_job_noMouseClicked

    private void job_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_job_noActionPerformed
        // TODO add your handling code here:

        try{
            co.search("SELECT * FROM jobs WHERE j_name='"+job_no.getSelectedItem()+"'");
            if(co.rs.next()){
                job=co.rs.getString("job_no");

            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_job_noActionPerformed

    private void txtpepdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpepdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpepdesActionPerformed

    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave1ActionPerformed
         // TODO add your handling code here:
        validation1();
        String oper="insert";
        Date dl=new Date(jDatepeop.getDate().getTime());
        Date dl2=new Date(jDatepepreg.getDate().getTime());
        String sql="call people1_proc(null,'"+txtpepname.getText()+"', '"+txtpeptell.getText()+"',"
        + "'"+Gender+"','"+dl+"','"+txtpepwei.getText()+"',"
        + "'"+job+"','"+txtpepdes.getText()+"','"+dl2+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtpepname.setText("");
        txtpeptell.setText("");

        txtpepwei.setText("");
        txtpepdes.setText("");

    }//GEN-LAST:event_btnsave1ActionPerformed

    private void rSButtonIcon_new5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new5ActionPerformed
        // TODO add your handling code here:
        Date dl=new Date(jDatepeop.getDate().getTime());
        Date dl2=new Date(jDatepepreg.getDate().getTime());
        String oper="update";
        String sql="call people1_proc('"+ib+"','"+txtpepname.getText()+"', '"+txtpeptell.getText()+"','"+Gender+"','"+dl+"','"+txtpepwei.getText()+"',"
        + "'"+job_no.getSelectedItem()+"','"+txtpepdes.getText()+"','"+dl2+"','"+oper+"')";
        co.setSQL(sql);
        display();
        //txt1.setText("");  txt2.setText("");
        txtpepname.setText("");
        txtpeptell.setText("");

        txtpepwei.setText("");
        txtpepdes.setText("");
        btnsave.setEnabled(true);

    }//GEN-LAST:event_rSButtonIcon_new5ActionPerformed

    private void rSButtonIcon_new6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new6ActionPerformed
        // TODO add your handling code here:

        txtpepname.setText("");
        txtpeptell.setText("");
        jDatepeop.setDate(jDatepeop.getDate());
        txtpepwei.setText("");
        txtpepdes.setText("");
        jDatepepreg.setDate(jDatepepreg.getDate());
        btnsave.setEnabled(true);

    }//GEN-LAST:event_rSButtonIcon_new6ActionPerformed

    private void rSButtonIcon_new7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new7ActionPerformed
        // TODO add your handling code here:
        // delete part.................
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        Date dl=new Date(jDatepeop.getDate().getTime());
        Date dl2=new Date(jDatepepreg.getDate().getTime());

        String sql="call people1_proc('"+ib+"','"+txtpepname.getText()+"', '"+txtpeptell.getText()+"','"+Gender+"','"+dl+"','"+txtpepwei.getText()+"',"
        + "'"+job+"','"+txtpepdes.getText()+"','"+dl2+"','"+oper+"')";
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        co.setSQL(sql);
        display();
        // txt1.setText("");  txt2.setText("");
        btnsave.setEnabled(true);

        }

    }//GEN-LAST:event_rSButtonIcon_new7ActionPerformed
    }
    private void txtpepserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpepserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpepserActionPerformed

    private void rSButtonIcon_new8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new8ActionPerformed


        // TODO add your handling code here:

        String sql="SELECT p.people_no , p.p_name Magac ,p.tell ,p.sex,p.birth_date , p.weight ,j.j_name ,"
                + "p.description ,p.reg_date "
                + "  FROM people1  p , jobs j WHERE p.job_no=j.job_no and people_no='"+txtpepser.getText()+"'";
     co.search(sql);
     try{
         if(co.rs.next()){
             ib=co.rs.getString("people_no");
             txtpepname.setText(co.rs.getString("Magac"));
             txtpeptell.setText(co.rs.getString("tell"));
             Gender=co.rs.getString("sex");
             if(Gender.equals("Male"))
                 male.setSelected(true);
             else if(Gender.equals("Female"))
                 female.setSelected(true); 
             jDatepeop.setDate(co.rs.getDate("birth_date"));
             txtpepwei.setText(co.rs.getString("weight"));
             txtpepdes.setText(co.rs.getString("description"));
             jDatepepreg.setDate(co.rs.getDate("reg_date"));
             job_no.setSelectedItem(co.rs.getString("j_name"));
             
             btnsave.setEnabled(false);
             txtserjob.setText("");
         }
         else
             JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtserjob.setText("");
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, ex.getMessage());
     }

    }//GEN-LAST:event_rSButtonIcon_new8ActionPerformed

    private void txtaccnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccnameActionPerformed

    private void txtaccinstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccinstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccinstActionPerformed

    private void txtaccbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccbalActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String oper="insert";
        String sql="call accounts_proc(null,'"+txtaccname.getText()+"', '"+txtaccinst.getText()+"', '"+txtaccbal.getText()+"','"+oper+"')";
        co.setSQL(sql);
//        txtser2.setText(sql);

        
        display();
         txtaccname.setText("");  txtaccinst.setText("");  txtaccbal.setText("");
//        co.search(sql);


    }//GEN-LAST:event_btnSaveActionPerformed

    private void rSButtonIcon_new9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new9ActionPerformed
        // TODO add your handling code here:
        String oper="update";
        String sql="call accounts_proc('"+ic+"','"+txtaccname.getText()+"','"+txtaccinst.getText()+"','"+txtaccbal.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtaccname.setText("");  txtaccinst.setText("");  txtaccbal.setText("");
        btnSave.setEnabled(true);
    }//GEN-LAST:event_rSButtonIcon_new9ActionPerformed

    private void rSButtonIcon_new10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new10ActionPerformed
        // TODO add your handling code here:

        txtaccname.setText("");
        txtaccinst.setText("");
        txtaccbal.setText("");
        btnSave.setEnabled(true);
    }//GEN-LAST:event_rSButtonIcon_new10ActionPerformed

    private void rSButtonIcon_new11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new11ActionPerformed
        // TODO add your handling code here:
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){

        String oper="delete";
        String sql="call accounts_proc('"+ic+"','"+txtaccname.getText()+"','"+txtaccinst.getText()+"','"+txtaccbal.getText()+"','"+oper+"')";
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        co.setSQL(sql);
        display();
        txtaccname.setText("");  txtaccinst.setText(""); txtaccbal.setText("");
        }
         
         }
    }//GEN-LAST:event_rSButtonIcon_new11ActionPerformed

    private void txtseraccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseraccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtseraccActionPerformed

    private void rSButtonIcon_new12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new12ActionPerformed
        // TODO add your handling code here:

        String sql="select * from accounts where acc_name='"+txtseracc.getText()+"' or institution='"+txtseracc.getText()+"' or balance='"+txtseracc.getText()+"' or acc_no='"+txtseracc.getText()+"'";
        co.search(sql);
        try{
            if(co.rs.next()){
                ic=co.rs.getString("acc_no");
                txtaccname.setText(co.rs.getString("acc_name"));
                txtaccinst.setText(co.rs.getString("institution"));
                txtaccbal.setText(co.rs.getString("balance"));
                btnSave.setEnabled(false);
                txtseracc.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtseracc.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

    }//GEN-LAST:event_rSButtonIcon_new12ActionPerformed

    private void bilpeople_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilpeople_noActionPerformed
        // TODO add your handling code here:

        try{
            co.search("SELECT * FROM people1 WHERE p_name='"+bilpeople_no.getSelectedItem()+"'");
            if(co.rs.next()){
                bils=co.rs.getString("people_no");

            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_bilpeople_noActionPerformed

    private void amountBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountBActionPerformed

    private void txtserbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserbillActionPerformed

    private void rSButtonIcon_new17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new17ActionPerformed
         // TODO add your handling code here:
        String oper="insert";
        Date dl=new Date(billDate.getDate().getTime());
        String sql="call bills_proc(null,'"+bils+"','"+dl+"','"+amountB.getText()+"','"+bilDesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        //txtserbill.setText(sql);
        amountB.setText(""); bilDesc.setText(""); bilpeople_no.setSelectedIndex(0);

    }//GEN-LAST:event_rSButtonIcon_new17ActionPerformed

    private void rSButtonIcon_new16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new16ActionPerformed
        // TODO add your handling code here:
        String oper="update";
        Date dl=new Date(billDate.getDate().getTime());
        String sql="call bills_proc('"+ibils+"','"+bils+"','"+dl+"','"+amountB.getText()+"','"+bilDesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        //txtser.setText(sql);
        amountB.setText(""); bilDesc.setText(""); 
        
        
    }//GEN-LAST:event_rSButtonIcon_new16ActionPerformed

    private void rSButtonIcon_new14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new14ActionPerformed
        // TODO add your handling code here:
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        Date dl=new Date(billDate.getDate().getTime());
        String sql="call bills_proc('"+ibils+"','"+bils+"','"+dl+"','"+amountB.getText()+"','"+bilDesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        //txtser.setText(sql);
        amountB.setText(""); 
        
        
    }//GEN-LAST:event_rSButtonIcon_new14ActionPerformed
    }
    private void rSButtonIcon_new13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new13ActionPerformed
        // TODO add your handling code here:
        String sql="SELECT bl.bil_no, pp.p_name as bilmagac, bl.bill_date, bl.amount, bl.descriptiion FROM bills bl , "
                + "people1 pp WHERE bl.bil_no= pp.people_no and bil_no='"+txtserbill.getText()+"'";
        co.search(sql);
        try{
            if(co.rs.next()){
                ibils=co.rs.getString("bil_no");
                amountB.setText(co.rs.getString("amount"));
                 bilDesc.setText(co.rs.getString("descriptiion"));
                billDate.setDate(co.rs.getDate("bill_date"));
                bilpeople_no.setSelectedItem(co.rs.getString("bilmagac"));
                btnSave.setEnabled(false);
                txtserbill.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtserbill.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_rSButtonIcon_new13ActionPerformed

    private void acc_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_noActionPerformed
        // TODO add your handling code here:
        try{
            co.search("SELECT * FROM `accounts` WHERE acc_name='"+acc_no.getSelectedItem()+"'");
            if(co.rs.next()){
                acc=co.rs.getString("acc_no");
                peoplePayments_no.setSelectedItem(peycom);

            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_acc_noActionPerformed

    private void txtamountpymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountpymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountpymentActionPerformed

    private void btnsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave2ActionPerformed
        // TODO add your handling code here:
        String oper="insert";
        Date dl=new Date(jDatepayment.getDate().getTime());
        String sql="call payments_proc(null,'"+paymentsn+"','"+acc+"','"+txtamountpyment.getText()+"','"+dl+"','"+oper+"')";
//      co.setSQL(sql);
   //txtserpay.setText(sql);
    co.setSQL(sql);
    display();

    }//GEN-LAST:event_btnsave2ActionPerformed

    private void rSButtonIcon_new18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new18ActionPerformed
        // TODO add your handling code here:
        String oper="update";
        Date dl = new Date(jDatepayment.getDate().getTime());
        String sql="call payments_proc('"+idpy+"','"+paymentsn+"','"+acc+"','"+txtamountpyment.getText()+"','"+dl+"','"+oper+"')";
        co.setSQL(sql);
        amountB.setText("");
        peoplePayments_no.setSelectedIndex(0);
        acc_no.setSelectedIndex(0);
        txtserjob.setText("");
        btnsave.setEnabled(true);

    }//GEN-LAST:event_rSButtonIcon_new18ActionPerformed

    private void rSButtonIcon_new19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new19ActionPerformed
        // TODO add your handling code here:

        txtamountpyment.setText("");
        peoplePayments_no.setSelectedIndex(0);
        acc_no.setSelectedIndex(0);
        btnsave.setEnabled(true);
    }//GEN-LAST:event_rSButtonIcon_new19ActionPerformed

    private void rSButtonIcon_new20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new20ActionPerformed
        // TODO add your handling code here:
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){

        String oper="delete";
        Date dl=new Date(jDatepayment.getDate().getTime());
        String sql="call payments_proc('"+idpy+"','"+paymentsn+"','"+acc+"','"+txtamountpyment.getText()+"','"+dl+"','"+oper+"')";
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        co.setSQL(sql);
        display();
        // txt1.setText("");  txt2.setText("");
        btnsave.setEnabled(true);

    }//GEN-LAST:event_rSButtonIcon_new20ActionPerformed
    }
    }
    private void txtserpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserpayActionPerformed

    private void rSButtonIcon_new21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new21ActionPerformed
        // TODO add your handling code here:
        String sql="SELECT py.py_no,pep1.p_name as shaqsi,acc.acc_name as magac, py.amount as lacag, py.p_date as waqti FROM "
                + "payments py, accounts acc,people1 pep1 WHERE py.people_no=pep1.people_no and py.acc_no=acc.acc_no and py.py_no='"+txtserpay.getText()+"'";

        co.search(sql);
        try{
            if(co.rs.next()){
                idpy=co.rs.getString("py_no");
                txtamountpyment.setText(co.rs.getString("lacag"));
                jDatepayment.setDate(co.rs.getDate("waqti"));
                peycom=co.rs.getString("shaqsi");
                //peoplePayments_no.setSelectedItem(co.rs.getString("magac"));
                acc_no.setSelectedItem(co.rs.getString("magac"));
                btnsave.setEnabled(false);
                txtserjob.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtserpay.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_rSButtonIcon_new21ActionPerformed

    private void rSButtonIcon_new15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new15ActionPerformed
        // TODO add your handling code here:
       // desBill.setText("");
        amountB.setText("");
         bilDesc.setText("");
        bilpeople_no.setSelectedIndex(0);
    }//GEN-LAST:event_rSButtonIcon_new15ActionPerformed

    private void bilDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bilDescActionPerformed

    private void btnteamsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnteamsaveActionPerformed
        // TODO add your handling code here:
        if(txtteamname.getText().trim().isEmpty() && txtteamdesc.getText().trim().isEmpty())
        {
            lbl_teamName.setText("Name Place is Empty");
            lbl_teamDesc.setText("Description Place is Empty");
        }
        else if(txtteamname.getText().trim().isEmpty())
        {
            lbl_teamName.setText("Name Place is Empty");
            
        }
        else if(txtteamdesc.getText().trim().isEmpty())
        {
            lbl_teamDesc.setText("Description Place is Empty");
        }
        else
        {
           // btnteamsave.setEnabled(false);
        }
       // validation2();
        String oper="insert";
        String sql="call teams_proc(null,'"+txtteamname.getText()+"', '"+txtteamdesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtteamname.setText("");  txtteamdesc.setText("");

    }//GEN-LAST:event_btnteamsaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String oper="update";
        String sql="call teams_proc('"+tid+"','"+txtteamname.getText()+"', '"+txtteamdesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtteamname.setText("");  txtteamdesc.setText("");
        btnsave.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtteamname.setText("");
        txtteamdesc.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        //Delete Code
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        String sql="call teams_proc('"+tid+"','"+txtteamname.getText()+"', '"+txtteamdesc.getText()+"','"+oper+"')";
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        co.setSQL(sql);
        display();
        txtteamname.setText("");  txtteamdesc.setText("");
        }
    }//GEN-LAST:event_btndeleteActionPerformed
    }
    private void txtserteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserteamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserteamActionPerformed

    private void rSButtonIcon_new22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new22ActionPerformed
        // TODO add your handling code here:
        String sql="select * from teams where teams_Name='"+txtserteam.getText()+"' or Description='"+txtserteam.getText()+"' or team_no='"+txtserteam.getText()+"'";
        co.search(sql);
        try{
            if(co.rs.next()){
                tid=co.rs.getString("team_no");
                txtteamname.setText(co.rs.getString("teams_Name"));
                txtteamdesc.setText(co.rs.getString("Description"));
                btnsave.setEnabled(false);
                txtserteam.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtserteam.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_rSButtonIcon_new22ActionPerformed

    private void txtcomnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcomnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomnameActionPerformed

    private void txtcomdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcomdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomdescActionPerformed

    private void btnsave4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave4ActionPerformed
        // TODO add your handling code here:
        String oper="insert";

        String sql="call competions_proc(null,'"+txtcomname.getText()+"', '"+txtcomdesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtcomname.setText("");  txtcomdesc.setText("");

    }//GEN-LAST:event_btnsave4ActionPerformed

    private void rSButtonIcon_new23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new23ActionPerformed
        // TODO add your handling code here:
        String oper="update";
        String sql="call competions_proc('"+cid+"','"+txtcomname.getText()+"', '"+txtcomdesc.getText()+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtcomname.setText("");  txtcomdesc.setText("");
        btnsave.setEnabled(true);

    }//GEN-LAST:event_rSButtonIcon_new23ActionPerformed

    private void rSButtonIcon_new24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new24ActionPerformed
        // TODO add your handling code here:

        txtcomname.setText("");
        txtcomdesc.setText("");
        btnsave.setEnabled(true);

    }//GEN-LAST:event_rSButtonIcon_new24ActionPerformed

    private void rSButtonIcon_new25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new25ActionPerformed
        // TODO add your handling code here:
        //Delete part.........................
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        String sql="call competions_proc('"+cid+"','"+txtcomname.getText()+"', '"+txtcomdesc.getText()+"','"+oper+"')";
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        co.setSQL(sql);
        display();
        txtcomname.setText("");  txtcomdesc.setText("");
        btnsave.setEnabled(true);
        }
    }//GEN-LAST:event_rSButtonIcon_new25ActionPerformed
    }
    private void txtsercomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsercomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsercomActionPerformed

    private void rSButtonIcon_new26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new26ActionPerformed
        // TODO add your handling code here:
        //searching button
        String sql="select * from competions where com_name='"+txtsercom.getText()+"' or com_no='"+txtsercom.getText()+"'";
        co.search(sql);
        try{
            if(co.rs.next()){
                cid=co.rs.getString("com_no");
                txtcomname.setText(co.rs.getString("com_name"));
                txtcomdesc.setText(co.rs.getString("description"));
                btnsave.setEnabled(false);
                txtsercom.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtsercom.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_rSButtonIcon_new26ActionPerformed

    private void playerpeople_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerpeople_noActionPerformed
        // TODO add your handling code here:
        try{
            co.search("SELECT * FROM people1 WHERE p_name='"+playerpeople_no.getSelectedItem()+"'");
            if(co.rs.next()){
                player=co.rs.getString("people_no");
                playerteam_no.setSelectedItem(cam3);
                display();
               

            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_playerpeople_noActionPerformed

    private void playerteam_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerteam_noActionPerformed
        // TODO add your handling code here:

        try{
            co.search("SELECT * FROM teams WHERE teams_name='"+playerteam_no.getSelectedItem()+"'");
            if(co.rs.next()){
                team=co.rs.getString("team_no");
                playerpeople_no.setSelectedItem(cam4);

            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_playerteam_noActionPerformed

    private void txtcostplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostplayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostplayerActionPerformed

    private void txtplayerdurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplayerdurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplayerdurActionPerformed

    private void txtplayerdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplayerdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplayerdesActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        String oper="insert";
        Date dl=new Date(jDateplayer_agg.getDate().getTime());
        String sql="call player_agrement_proc(null,'"+player+"', '"+team+"','"+dl+"','"+txtcostplayer.getText()+"','"+txtplayerdur.getText()+"','"+txtplayerdes.getText()+"','"+oper+"')";
        //      co.setSQL(sql);
        co.setSQL(sql);
        display();
        //txtser.setText(sql);
        playerteam_no.setSelectedIndex(0);
        playerpeople_no.setSelectedIndex(0);
        txtcostplayer.setText("");
        txtplayerdur.setText("");
        txtplayerdes.setText("");

    }//GEN-LAST:event_btnSave1ActionPerformed

    private void txtserplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserplayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserplayerActionPerformed

    private void rSButtonIcon_new30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new30ActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT pa.pl_no, pep.p_name as qof, tm.teams_name as naadiyada, pa.agg_dadte taariiq, pa.cost as money, pa.duration as xili," +
"         pa.descriptiion as fahfhin FROM player_agrement pa ,teams tm, people1 pep" +
"                          WHERE pa.team_no=tm.team_no and pa.people_no=pep.people_no and pa.pl_no='"+txtserplayer.getText()+"'";
        co.search(sql);
        try {
            if (co.rs.next()) {
                idpl = co.rs.getString("pl_no");

                txtcostplayer.setText(co.rs.getString("money"));
                txtplayerdur.setText(co.rs.getString("xili"));
                txtplayerdes.setText(co.rs.getString("fahfhin"));
                jDateplayer_agg.setDate(co.rs.getDate("taariiq"));
                cam4=co.rs.getString("qof");
                 cam3=co.rs.getString("naadiyada");
                playerpeople_no.setSelectedItem(co.rs.getString("qof"));
                btnSave.setEnabled(false);
                txtserplayer.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            }
            txtserplayer.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_rSButtonIcon_new30ActionPerformed

    private void rSButtonIcon_new27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new27ActionPerformed
        // TODO add your handling code here:
        String oper="update";
        Date dl=new Date(jDateplayer_agg.getDate().getTime());
        String sql="call player_agrement_proc('"+idpl+"','"+player+"', '"+team+"','"+dl+"','"+txtcostplayer.getText()+"','"+txtplayerdur.getText()+"','"+txtplayerdes.getText()+"','"+oper+"')";
//      co.setSQL(sql);
      
    co.setSQL(sql);
    display();
    playerteam_no.setSelectedIndex(0);
    playerpeople_no.setSelectedIndex(0);
    txtcostplayer.setText("");
    txtplayerdur.setText("");
    txtplayerdes.setText("");
    }//GEN-LAST:event_rSButtonIcon_new27ActionPerformed

    private void rSButtonIcon_new29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new29ActionPerformed
        // TODO add your handling code here:
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        Date dl=new Date(jDateplayer_agg.getDate().getTime());
        String sql="call player_agrement_proc('"+idpl+"','"+player+"', '"+team+"','"+dl+"','"+txtcostplayer.getText()+"','"+txtplayerdur.getText()+"','"+txtplayerdes.getText()+"','"+oper+"')";
//      co.setSQL(sql);
      display();
    co.setSQL(sql);
    playerteam_no.setSelectedIndex(0);
    playerpeople_no.setSelectedIndex(0);
    txtcostplayer.setText("");
    txtplayerdur.setText("");
    txtplayerdes.setText("");
     // txt1.setText("");  txt2.setText(""); 
      btnsave.setEnabled(true);
}
        
        
    }//GEN-LAST:event_rSButtonIcon_new29ActionPerformed

    private void rSButtonIcon_new28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new28ActionPerformed
        // TODO add your handling code here:
        playerteam_no.setSelectedIndex(0);
        playerpeople_no.setSelectedIndex(0);
        txtcostplayer.setText("");
        txtplayerdur.setText("");
        txtplayerdes.setText("");
    }//GEN-LAST:event_rSButtonIcon_new28ActionPerformed

    private void txtactivitynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactivitynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtactivitynameActionPerformed

    private void txtactivtyDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactivtyDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtactivtyDescActionPerformed

    private void btnsave5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave5ActionPerformed
        // TODO add your handling code here:
        String oper="insert";
        Date dl=new Date(jDateActivities.getDate().getTime());
        String sql="Call activity_proc(null,'"+txtactivityname.getText()+"', '"+txtactivtyDesc.getText()+"','"+dl+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtactivityname.setText("");  txtactivtyDesc.setText("");

    }//GEN-LAST:event_btnsave5ActionPerformed

    private void rSButtonIcon_new31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new31ActionPerformed
        // TODO add your handling code here:
        String oper="update";
        Date dl=new Date(jDateActivities.getDate().getTime());
        String sql="Call activity_proc('"+idac+"','"+txtactivityname.getText()+"', '"+txtactivtyDesc.getText()+"','"+dl+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtactivityname.setText("");  txtactivtyDesc.setText("");

    }//GEN-LAST:event_rSButtonIcon_new31ActionPerformed

    private void rSButtonIcon_new32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new32ActionPerformed
        // TODO add your handling code here:
        txtactivityname.setText("");
        txtactivtyDesc.setText("");
    }//GEN-LAST:event_rSButtonIcon_new32ActionPerformed

    private void rSButtonIcon_new33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new33ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        Date dl=new Date(jDateActivities.getDate().getTime());
        String sql="Call activity_proc('"+idac+"','"+txtactivityname.getText()+"', '"+txtactivtyDesc.getText()+"','"+dl+"','"+oper+"')";
        co.setSQL(sql);
        display();
        txtactivityname.setText("");  txtactivtyDesc.setText("");
        btnsave.setEnabled(true);

        }

    }//GEN-LAST:event_rSButtonIcon_new33ActionPerformed

    private void txtseractivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtseractivityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtseractivityActionPerformed

    private void rSButtonIcon_new34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new34ActionPerformed
        // TODO add your handling code here:

        String sql="select * from activites where activity_name='"+txtseractivity.getText()+"'or ac_no='"+txtseractivity.getText()+"'";
        co.search(sql);
        try{
            if(co.rs.next()){
                idac=co.rs.getString("ac_no");
                txtactivityname.setText(co.rs.getString("activity_name"));
                txtactivtyDesc.setText(co.rs.getString("ac_desc"));
                jDateActivities.setDate(co.rs.getDate("ac_date"));
                btnsave.setEnabled(false);
                txtseractivity.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            txtseractivity.setText("");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_rSButtonIcon_new34ActionPerformed

    private void activity_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activity_noActionPerformed
        // TODO add your handling code here:
        try {
            co.search("SELECT * FROM `activites` WHERE activity_name='" + activity_no.getSelectedItem() + "'");
            if (co.rs.next()) {
                activity = co.rs.getString("ac_no");
                match_no.setSelectedItem(com2);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_activity_noActionPerformed

    private void match_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_match_noActionPerformed
        // TODO add your handling code here:

        try {
            co.search("SELECT * FROM `teams` WHERE teams_name='" + match_no.getSelectedItem() + "'");
            if (co.rs.next()) {
                match = co.rs.getString("team_no");
                macpeople_no.setSelectedItem(com1);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_match_noActionPerformed

    private void macpeople_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macpeople_noActionPerformed
        // TODO add your handling code here:

        try {
            co.search("SELECT * FROM `people1` WHERE P_name='" + macpeople_no.getSelectedItem() + "'");
            if (co.rs.next()) {
                people = co.rs.getString("people_no");

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_macpeople_noActionPerformed

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
        // TODO add your handling code here:
        String oper = "insert";
        String sql = "call match_activity_proc(null,'" + activity + "', '" + match + "','" + people + "','" + txtAct.getText() + "','" + txtdes.getText() + "','" + oper + "')";
        //      co.setSQL(sql);
        co.setSQL(sql);
        display();

        //txtser.setText(sql);
        //      String sql="insert into match_activity values(null,'"+activity+"', '"+match_no+"', '"+txt3.getText()+"','"
        //                +txt4.getText()+"','"+txt5.getText()+"')";
        //      co.setSQL(sql);
        //      display();
        //activity;  txt2.setText("");  txt3.setText("");txt4.setText("");txt5.setText("");
    }//GEN-LAST:event_btnSave2ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String oper="update";
        String sql="call match_activity_proc('"+idmac+"','"+activity +"','"+match+"','"+people+ "','"+txtAct.getText()+"','"+txtdes.getText()+"','"+oper+"')";
        //      co.setSQL(sql);
        
        co.setSQL(sql);
        display();
        activity_no.setSelectedIndex(0);
        match_no.setSelectedIndex(0);
        macpeople_no.setSelectedIndex(0);
        txtdes.setText(""); txtAct.setText("");

        //        String sql="update match_activity set ac_no='"+txt1.getText()+"', m_no='"+txt2.getText()+"', people_no='"+txt3.getText()+"',mac_time='"
        //                +txt4.getText()+"',description='"+"'where ma_no='"+id+"'";
        //      co.setSQL(sql);
        //      display();
        //      txt1.setText("");  txt2.setText("");  txt3.setText("");txt4.setText("");txt5.setText("");
        //      btnSave.setEnabled(true);
        //
        //
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed
        // TODO add your handling code here:

        activity_no.setSelectedIndex(0);
        match_no.setSelectedIndex(0);
        macpeople_no.setSelectedIndex(0);
        txtdes.setText(""); txtAct.setText("");
        btnSave.setEnabled(true);

    }//GEN-LAST:event_btnreset1ActionPerformed

    private void btndellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndellActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        String sql = "call match_activity_proc('"+idmac+"','" + activity + "', '" + match + "','" + people + "','" + txtAct.getText() + "','" + txtdes.getText() + "','" + oper + "')";
        //      co.setSQL(sql);
        co.setSQL(sql);
        display();
        activity_no.setSelectedIndex(0);
        match_no.setSelectedIndex(0);
        macpeople_no.setSelectedIndex(0);
        txtdes.setText(""); txtAct.setText("");
}
     
    }//GEN-LAST:event_btndellActionPerformed

    private void txtsermactivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsermactivityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsermactivityActionPerformed

    private void btnserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserActionPerformed
        // TODO add your handling code here:

        String sql = "SELECT m.ma_no ,a.activity_name , t.teams_name Team ,p.p_name as magac ,m.mac_time ,m.description"
        + "  FROM match_activity m ,activites a ,matches ma , people1 p ,teams t "
        + "where m.ac_no=a.ac_no and m.m_no=ma.m_no and ma.team_no=t.team_no and "
        + " m.people_no=p.people_no and ma_no='" + txtsermactivity.getText() + "'";
        co.search(sql);
        try {
            if (co.rs.next()) {
                idmac = co.rs.getString("ma_no");

                txtAct.setText(co.rs.getString("mac_time"));
                txtdes.setText(co.rs.getString("description"));

                com2=co.rs.getString("Team");
                com1=co.rs.getString("magac");
                activity_no.setSelectedItem(co.rs.getString("activity_name"));
                btnSave.setEnabled(false);
                txtsermactivity.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            }
            txtsermactivity.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnserActionPerformed

    private void macthescompe_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macthescompe_noActionPerformed
         // TODO add your handling code here:
        try{
            co.search("SELECT * FROM competions WHERE com_name='"+macthescompe_no.getSelectedItem()+"'");
            if(co.rs.next()){
                compe=co.rs.getString("com_no");
                matchesteam_no.setSelectedItem(mac5);
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_macthescompe_noActionPerformed

    private void matchesteam_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchesteam_noActionPerformed
        // TODO add your handling code here:
        try{
            co.search("SELECT * FROM teams WHERE teams_name='"+matchesteam_no.getSelectedItem()+"'");
            if(co.rs.next()){
                teams=co.rs.getString("team_no");
                // matchesteam_no.setSelectedItem(mac5);

            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());}
    }//GEN-LAST:event_matchesteam_noActionPerformed

    private void btnSave3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave3ActionPerformed
        // TODO add your handling code here:
        String oper="insert";
        Date dl=new Date(JDatematches.getDate().getTime());
        String sql="call matches_proc(null,'"+compe+"','"+teams+"','"+dl+"','"+oper+"')";
        co.setSQL(sql);
        display();
        // txtser.setText(sql);
        //    txt1.setText("");  txt2.setText("");
    }//GEN-LAST:event_btnSave3ActionPerformed

    private void rSButtonIcon_new35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new35ActionPerformed
        // TODO add your handling code here:
        String oper="update";
        Date dl=new Date(JDatematches.getDate().getTime());
        String sql = "call matches_proc('"+idmatch+"','"+compe+"','"+teams+"','"+dl+"','"+oper+"')";
        co.setSQL(sql);
        display();
    }//GEN-LAST:event_rSButtonIcon_new35ActionPerformed

    private void rSButtonIcon_new37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new37ActionPerformed
        // TODO add your handling code here:
         if(JOptionPane.showConfirmDialog(null, "ma hubtaa","xaqiijin",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        String oper="delete";
        Date dl=new Date(JDatematches.getDate().getTime());
        String sql = "call matches_proc('"+idmatch+"','"+compe+"','"+teams+"','"+dl+"','"+oper+"')";
        co.setSQL(sql);
        display();

    }//GEN-LAST:event_rSButtonIcon_new37ActionPerformed
    }
    private void txtsermatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsermatchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsermatchesActionPerformed

    private void rSButtonIcon_new38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIcon_new38ActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT mch.m_no,com.com_name as koob, tem.teams_name as koox,mch.mat_date FROM "
        + "matches mch, competions com, teams tem WHERE mch.m_no=com.com_no and mch.m_no=tem.team_no and mch.m_no='"+txtsermatches.getText()+"'";
        co.search(sql);
        try {
            if (co.rs.next()) {
                idmatch = co.rs.getString("m_no");
                //com2=co.rs.getString("Team");
                mac5=co.rs.getString("koox");
                JDatematches.setDate(co.rs.getDate("mat_date"));
                macthescompe_no.setSelectedItem(co.rs.getString("koob"));
                btnSave.setEnabled(false);
                txtsermatches.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Xogtaan Lama Helin");
            }
            txtsermatches.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_rSButtonIcon_new38ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         jTabbedPane4.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane4.setSelectedIndex(1);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane5.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         jTabbedPane5.setSelectedIndex(1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         jTabbedPane5.setSelectedIndex(2);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane5.setSelectedIndex(3);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTabbedPane5.setSelectedIndex(4);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTabbedPane5.setSelectedIndex(5);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jTabbedPane7.setSelectedIndex(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         jTabbedPane7.setSelectedIndex(1);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         jTabbedPane7.setSelectedIndex(2);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void txtpepserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpepserKeyPressed
        // TODO add your handling code here:
        //peopleTable press
        DefaultTableModel table = (DefaultTableModel)peptable.getModel();
        String Search = txtpepname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        peptable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtpepser.getText().trim()));
    }//GEN-LAST:event_txtpepserKeyPressed

    private void txtpepserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpepserKeyReleased
        // TODO add your handling code here:
        //peopleTable released
        DefaultTableModel table = (DefaultTableModel)peptable.getModel();
        String Search = txtpepname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        peptable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtpepser.getText().trim()));
    }//GEN-LAST:event_txtpepserKeyReleased

    private void txtserteamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserteamKeyPressed
        // TODO add your handling code here:
        //TeamTable press....................
        DefaultTableModel table = (DefaultTableModel)teamtable.getModel();
        String Search = txtteamname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        teamtable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserteam.getText().trim()));
    }//GEN-LAST:event_txtserteamKeyPressed

    private void txtserteamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserteamKeyReleased
        // TODO add your handling code here:
        //TeamTable released................
        DefaultTableModel table = (DefaultTableModel)teamtable.getModel();
        String Search = txtteamname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        teamtable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserteam.getText().trim()));
    }//GEN-LAST:event_txtserteamKeyReleased

    private void txtsercomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsercomKeyPressed
        // TODO add your handling code here:
        //Compotitions press............
        DefaultTableModel table = (DefaultTableModel)comtable.getModel();
        String Search = txtcomname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        comtable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtsercom.getText().trim()));
    }//GEN-LAST:event_txtsercomKeyPressed

    private void txtsercomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsercomKeyReleased
        // TODO add your handling code here:
        //Compotitions Released............
        DefaultTableModel table = (DefaultTableModel)comtable.getModel();
        String Search = txtcomname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        comtable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtsercom.getText().trim()));
    }//GEN-LAST:event_txtsercomKeyReleased

    private void txtsermatchesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsermatchesKeyPressed
        // TODO add your handling code here:
        //matches press............
//        DefaultTableModel table = (DefaultTableModel)matchesTablerecord.getModel();
//        String Search = .getText().toLowerCase();
//        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
//        matchesTablerecord.setRowSorter(tb);
//        tb.setRowFilter(RowFilter.regexFilter(txtsercom.getText().trim()));
    }//GEN-LAST:event_txtsermatchesKeyPressed

    private void txtseractivityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseractivityKeyPressed
        // TODO add your handling code here:
        //Activities press............
        DefaultTableModel table = (DefaultTableModel)tableactivity.getModel();
        String Search = txtactivityname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        tableactivity.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtseractivity.getText().trim()));
    }//GEN-LAST:event_txtseractivityKeyPressed

    private void txtseractivityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseractivityKeyReleased
        // TODO add your handling code here:
         //Activities Released............
        DefaultTableModel table = (DefaultTableModel)tableactivity.getModel();
        String Search = txtactivityname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        tableactivity.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtseractivity.getText().trim()));
    }//GEN-LAST:event_txtseractivityKeyReleased

    private void jobtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobtableMouseClicked
        // TODO add your handling code here:
        //JobTable selectedRow...............................
        DefaultTableModel model= (DefaultTableModel)jobtable.getModel();
        int selectedRowIndex = jobtable.getSelectedRow();
        txtjobname.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtjobdesc.setText(model.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_jobtableMouseClicked

    private void jobtableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobtableMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jobtableMouseEntered

    private void jobtableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobtableMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jobtableMousePressed

    private void jobtableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobtableMouseDragged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jobtableMouseDragged

    private void txtseraccKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseraccKeyPressed
        // TODO add your handling code here:
        //AccountsTable press
        DefaultTableModel table = (DefaultTableModel)acctable.getModel();
        String Search = txtaccname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        acctable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtseracc.getText().trim()));
    }//GEN-LAST:event_txtseraccKeyPressed

    private void txtseraccKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtseraccKeyReleased
        // TODO add your handling code here:
        //AccountsTable Released........................................
        DefaultTableModel table = (DefaultTableModel)acctable.getModel();
        String Search = txtaccname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        acctable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtseracc.getText().trim()));
    }//GEN-LAST:event_txtseraccKeyReleased

    private void txtserbillKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserbillKeyPressed
        // TODO add your handling code here:
        //BillsTable press
        DefaultTableModel table = (DefaultTableModel)billstable.getModel();
        String Search = bilDesc.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        billstable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserbill.getText().trim()));
    }//GEN-LAST:event_txtserbillKeyPressed

    private void txtserbillKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserbillKeyReleased
        // TODO add your handling code here:
        //BillsTable Released
        DefaultTableModel table = (DefaultTableModel)billstable.getModel();
        String Search = bilDesc.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        billstable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserbill.getText().trim()));
    }//GEN-LAST:event_txtserbillKeyReleased

    private void txtserpayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserpayKeyPressed
        // TODO add your handling code here:
        //PYmentTable press
        DefaultTableModel table = (DefaultTableModel)pytable.getModel();
        String Search = txtamountpyment.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        pytable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserpay.getText().trim()));
    }//GEN-LAST:event_txtserpayKeyPressed

    private void txtserpayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserpayKeyReleased
        // TODO add your handling code here:
        //PYmentTable released
        DefaultTableModel table = (DefaultTableModel)pytable.getModel();
        String Search = txtamountpyment.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        pytable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserpay.getText().trim()));
    }//GEN-LAST:event_txtserpayKeyReleased

    private void peptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peptableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_peptableMouseClicked

    private void txtsermactivityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsermactivityKeyPressed
        // TODO add your handling code here:
        //PMatchActivtyTable press
        DefaultTableModel table = (DefaultTableModel)matchactivitytable.getModel();
        String Search = txtAct.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        matchactivitytable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtsermactivity.getText().trim()));
    }//GEN-LAST:event_txtsermactivityKeyPressed

    private void txtsermactivityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsermactivityKeyReleased
        // TODO add your handling code here:
         //PMatchActivtyTable Released
        DefaultTableModel table = (DefaultTableModel)matchactivitytable.getModel();
        String Search = txtAct.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        matchactivitytable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtsermactivity.getText().trim()));
    }//GEN-LAST:event_txtsermactivityKeyReleased

    private void txtserplayerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserplayerKeyPressed
        // TODO add your handling code here:
         //Player_AggrimentsTable press
        DefaultTableModel table = (DefaultTableModel)playeragrimenttable.getModel();
        String Search = txtcostplayer.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        playeragrimenttable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserplayer.getText().trim()));
    }//GEN-LAST:event_txtserplayerKeyPressed

    private void txtserplayerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserplayerKeyReleased
        // TODO add your handling code here:
        //Player_AggrimentsTable Released
        DefaultTableModel table = (DefaultTableModel)playeragrimenttable.getModel();
        String Search = txtcostplayer.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        playeragrimenttable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserplayer.getText().trim()));
    }//GEN-LAST:event_txtserplayerKeyReleased

    private void txtserjobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserjobKeyPressed
        // TODO add your handling code here:
         //JobTable press
        DefaultTableModel table = (DefaultTableModel)jobtable.getModel();
        String Search = txtjobname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        jobtable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserjob.getText().trim()));
    }//GEN-LAST:event_txtserjobKeyPressed

    private void txtserjobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserjobKeyReleased
        // TODO add your handling code here:
         //JobTable released........................
        DefaultTableModel table = (DefaultTableModel)jobtable.getModel();
        String Search = txtjobname.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tb = new TableRowSorter<DefaultTableModel>(table);
        jobtable.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(txtserjob.getText().trim()));
    }//GEN-LAST:event_txtserjobKeyReleased

    private void txtserjobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtserjobMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserjobMouseClicked

    private void txtseractivityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtseractivityMouseClicked

        // TODO add your handling code here:
        //ActivityTable selectedRow...............................
        DefaultTableModel model= (DefaultTableModel)tableactivity.getModel();
        int selectedRowIndex = tableactivity.getSelectedRow();
        txtactivityname.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtseractivity.setText(model.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_txtseractivityMouseClicked

    private void peoplePayments_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peoplePayments_noActionPerformed
        // TODO add your handling code here:
         try{
            co.search("SELECT * FROM people1 WHERE p_name='"+bilpeople_no.getSelectedItem()+"'");
            if(co.rs.next()){
                paymentsn=co.rs.getString("py_no");
                acc_no.setSelectedItem(payconacc);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_peoplePayments_noActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDatematches;
    private javax.swing.JComboBox<String> acc_no;
    private RSMaterialComponent.RSTableMetroCustom acctable;
    private javax.swing.JComboBox<String> activity_no;
    private app.bolivia.swing.JCTextField amountB;
    private app.bolivia.swing.JCTextField bilDesc;
    private com.toedter.calendar.JDateChooser billDate;
    private RSMaterialComponent.RSTableMetroCustom billstable;
    private javax.swing.JComboBox<String> bilpeople_no;
    private newscomponents.RSButtonIcon_new btnSave;
    private newscomponents.RSButtonIcon_new btnSave1;
    private newscomponents.RSButtonIcon_new btnSave2;
    private newscomponents.RSButtonIcon_new btnSave3;
    private newscomponents.RSButtonIcon_new btnUpdate;
    private newscomponents.RSButtonIcon_new btndelete;
    private newscomponents.RSButtonIcon_new btndell;
    private newscomponents.RSButtonIcon_new btnreset;
    private newscomponents.RSButtonIcon_new btnreset1;
    private newscomponents.RSButtonIcon_new btnsave;
    private newscomponents.RSButtonIcon_new btnsave1;
    private newscomponents.RSButtonIcon_new btnsave2;
    private newscomponents.RSButtonIcon_new btnsave4;
    private newscomponents.RSButtonIcon_new btnsave5;
    private newscomponents.RSButtonIcon_new btnser;
    private newscomponents.RSButtonIcon_new btnteamsave;
    private newscomponents.RSButtonIcon_new btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private rojeru_san.complementos.ButtonHover buttonHover1;
    private rojeru_san.complementos.ButtonHover buttonHover10;
    private rojeru_san.complementos.ButtonHover buttonHover11;
    private rojeru_san.complementos.ButtonHover buttonHover2;
    private rojeru_san.complementos.ButtonHover buttonHover3;
    private rojeru_san.complementos.ButtonHover buttonHover4;
    private rojeru_san.complementos.ButtonHover buttonHover5;
    private rojeru_san.complementos.ButtonHover buttonHover6;
    private rojeru_san.complementos.ButtonHover buttonHover7;
    private rojeru_san.complementos.ButtonHover buttonHover8;
    private rojeru_san.complementos.ButtonHover buttonHover9;
    private RSMaterialComponent.RSTableMetro comtable;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateActivities;
    private com.toedter.calendar.JDateChooser jDatepayment;
    private com.toedter.calendar.JDateChooser jDatepeop;
    private com.toedter.calendar.JDateChooser jDatepepreg;
    private com.toedter.calendar.JDateChooser jDateplayer_agg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JComboBox<String> job_no;
    private RSMaterialComponent.RSTableMetro jobtable;
    private javax.swing.JLabel lblPepDate;
    private javax.swing.JLabel lblPepDesc;
    private javax.swing.JLabel lblPepJobNo;
    private javax.swing.JLabel lblPepName;
    private javax.swing.JLabel lblPepRegDate;
    private javax.swing.JLabel lblPepSex;
    private javax.swing.JLabel lblPepTell;
    private javax.swing.JLabel lblPepWeight;
    private javax.swing.JLabel lbl_teamDesc;
    private javax.swing.JLabel lbl_teamName;
    private javax.swing.JLabel lbljobDesc;
    private javax.swing.JLabel lbljobName;
    private RSMaterialComponent.RSLabelTextIcon lblteamName;
    private RSMaterialComponent.RSLabelTextIcon lblteamdescrip;
    public static final javax.swing.JComboBox<String> macpeople_no = new javax.swing.JComboBox<>();
    private javax.swing.JComboBox<String> macthescompe_no;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> match_no;
    private RSMaterialComponent.RSTableMetro matchactivitytable;
    private RSMaterialComponent.RSTableMetro matchesTablerecord;
    private javax.swing.JScrollPane matchestable;
    private javax.swing.JComboBox<String> matchesteam_no;
    private javax.swing.JComboBox<String> peoplePayments_no;
    private RSMaterialComponent.RSTableMetroCustom peptable;
    private RSMaterialComponent.RSTableMetro playeragrimenttable;
    private javax.swing.JComboBox<String> playerpeople_no;
    private javax.swing.JComboBox<String> playerteam_no;
    private RSMaterialComponent.RSTableMetroCustom pytable;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new1;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new10;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new11;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new12;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new13;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new14;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new15;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new16;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new17;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new18;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new19;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new2;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new20;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new21;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new22;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new23;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new24;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new25;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new26;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new27;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new28;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new29;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new3;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new30;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new31;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new32;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new33;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new34;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new35;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new36;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new37;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new38;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new4;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new5;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new6;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new7;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new8;
    private newscomponents.RSButtonIcon_new rSButtonIcon_new9;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo3;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo4;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo5;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo6;
    private RSMaterialComponent.RSTableMetro tableactivity;
    private RSMaterialComponent.RSTableMetro teamtable;
    private javax.swing.JTextField txtAct;
    private app.bolivia.swing.JCTextField txtaccbal;
    private app.bolivia.swing.JCTextField txtaccinst;
    private app.bolivia.swing.JCTextField txtaccname;
    private app.bolivia.swing.JCTextField txtactivityname;
    private app.bolivia.swing.JCTextField txtactivtyDesc;
    private app.bolivia.swing.JCTextField txtamountpyment;
    private app.bolivia.swing.JCTextField txtcomdesc;
    private app.bolivia.swing.JCTextField txtcomname;
    private app.bolivia.swing.JCTextField txtcostplayer;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtjobdesc;
    private javax.swing.JTextField txtjobname;
    private app.bolivia.swing.JCTextField txtpepdes;
    private app.bolivia.swing.JCTextField txtpepname;
    private RSMaterialComponent.RSTextFieldIconOne txtpepser;
    private app.bolivia.swing.JCTextField txtpeptell;
    private app.bolivia.swing.JCTextField txtpepwei;
    private app.bolivia.swing.JCTextField txtplayerdes;
    private app.bolivia.swing.JCTextField txtplayerdur;
    private RSMaterialComponent.RSTextFieldIconOne txtseracc;
    private RSMaterialComponent.RSTextFieldIconOne txtseractivity;
    private RSMaterialComponent.RSTextFieldIconOne txtserbill;
    private RSMaterialComponent.RSTextFieldIconOne txtsercom;
    private RSMaterialComponent.RSTextFieldOne txtserjob;
    private RSMaterialComponent.RSTextFieldIconOne txtsermactivity;
    private RSMaterialComponent.RSTextFieldIconOne txtsermatches;
    private RSMaterialComponent.RSTextFieldIconOne txtserpay;
    private RSMaterialComponent.RSTextFieldIconOne txtserplayer;
    private RSMaterialComponent.RSTextFieldIconOne txtserteam;
    private RSMaterialComponent.RSTextFieldTwo txtteamdesc;
    private RSMaterialComponent.RSTextFieldTwo txtteamname;
    // End of variables declaration//GEN-END:variables

//    public void viewDash(String string) {
//        throw new UnsupportedOperationException(" Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    private Home() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    private  void viewHome(String select_suMbalance_Lacag_FROM_accounts, String ff, RSMaterialButtonRectangle AccountCount) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
