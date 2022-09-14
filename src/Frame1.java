
import java.awt.Color;
import java.sql.*;
import java.sql.Connection;
import javax.print.ServiceUIFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
        this.setLocationRelativeTo(null);
        //jPanel4.setBackground(Color(0,0,0,0));
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEmpTbl = new javax.swing.JTable();
        jEmpBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jBanktbl = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jClientID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jClientName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jClientAcc = new javax.swing.JTextField();
        jClientNum = new javax.swing.JTextField();
        jSearchBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jClientBank = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCusTbl = new javax.swing.JTable();
        jShowBtn = new javax.swing.JButton();
        jInsertBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jIDtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jNametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jNumtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jAcctxt = new javax.swing.JTextField();
        jUpBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jDeleteBtn = new javax.swing.JButton();
        jemp = new javax.swing.JComboBox<>();
        jBranch = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jAmounttxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jWithdrawBtn = new javax.swing.JButton();
        jDepositBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jProcessTbl = new javax.swing.JTable();
        jProcessBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(635, 610));
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(0, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(635, 610));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(635, 610));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEmpTbl.setBackground(new java.awt.Color(153, 153, 153));
        jEmpTbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEmpTbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEmpTbl.setForeground(new java.awt.Color(255, 255, 255));
        jEmpTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jEmpTbl.setSelectionBackground(new java.awt.Color(11, 159, 159));
        jScrollPane2.setViewportView(jEmpTbl);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 610, 93));

        jEmpBtn.setBackground(new java.awt.Color(0, 0, 0));
        jEmpBtn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jEmpBtn.setForeground(new java.awt.Color(255, 255, 255));
        jEmpBtn.setText("Show Bank and Employees DATA");
        jEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpBtnActionPerformed(evt);
            }
        });
        jPanel2.add(jEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, 50));

        jBanktbl.setBackground(new java.awt.Color(153, 153, 153));
        jBanktbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBanktbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBanktbl.setForeground(new java.awt.Color(255, 255, 255));
        jBanktbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jBanktbl.setSelectionBackground(new java.awt.Color(11, 159, 159));
        jScrollPane3.setViewportView(jBanktbl);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 610, 96));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bank :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Employees :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Welcome To Our Bank");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 300, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaperflare.com_wallpaper (6).jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 580));

        jTabbedPane1.addTab("Bank Info", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setForeground(new java.awt.Color(204, 153, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(635, 610));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter Client ID :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, 30));

        jClientID.setBackground(new java.awt.Color(204, 255, 255));
        jClientID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClientIDActionPerformed(evt);
            }
        });
        jPanel3.add(jClientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 103, -1));

        jLabel11.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Client Name :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 30));

        jClientName.setEnabled(false);
        jPanel3.add(jClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 103, -1));

        jLabel12.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Client Number :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));

        jLabel13.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Client Account :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 30));

        jClientAcc.setEnabled(false);
        jPanel3.add(jClientAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 103, -1));

        jClientNum.setEnabled(false);
        jPanel3.add(jClientNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 103, -1));

        jSearchBtn.setBackground(new java.awt.Color(4, 56, 56));
        jSearchBtn.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jSearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        jSearchBtn.setText("Search");
        jSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchBtnActionPerformed(evt);
            }
        });
        jPanel3.add(jSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 147, 60));

        jLabel14.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Bank Branch :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 30));

        jClientBank.setEnabled(false);
        jPanel3.add(jClientBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 103, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG-20211229-WA0004.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");
        jLabel18.setAutoscrolls(true);
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 630, 730));

        jTabbedPane1.addTab("Enquiry about Clients", jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 102, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(635, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCusTbl.setBackground(new java.awt.Color(0, 51, 51));
        jCusTbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCusTbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCusTbl.setForeground(new java.awt.Color(255, 255, 255));
        jCusTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jCusTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCusTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jCusTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 610, 93));

        jShowBtn.setBackground(new java.awt.Color(0, 0, 102));
        jShowBtn.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jShowBtn.setForeground(new java.awt.Color(255, 255, 255));
        jShowBtn.setText("Show Customer DATA");
        jShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jShowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 220, 30));

        jInsertBtn.setBackground(new java.awt.Color(0, 51, 51));
        jInsertBtn.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jInsertBtn.setForeground(new java.awt.Color(255, 255, 255));
        jInsertBtn.setText("Insert");
        jInsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jInsertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 138, 60));

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 37, 22));

        jIDtxt.setEnabled(false);
        jIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIDtxtActionPerformed(evt);
            }
        });
        jPanel1.add(jIDtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 99, -1));

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel1.add(jNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 99, -1));

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone Number :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));
        jPanel1.add(jNumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 99, -1));

        jLabel4.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 30));
        jPanel1.add(jAcctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 100, -1));

        jUpBtn.setBackground(new java.awt.Color(0, 51, 51));
        jUpBtn.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        jUpBtn.setText("Update");
        jUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 138, 60));

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee Name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jDeleteBtn.setBackground(new java.awt.Color(102, 0, 0));
        jDeleteBtn.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        jDeleteBtn.setText("Delete");
        jDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 138, 60));

        jemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adel", "Fadia", "Fady", "Mayada", "Ahmed", "Fatma", "Salwa", "Kareem", "Ola", " " }));
        jPanel1.add(jemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jBranch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cairo", "Giza", "Alexandria" }));
        jPanel1.add(jBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 90, -1));

        jLabel6.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bank Branch :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount :");

        jAmounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmounttxtActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("To Withdraw Or Deposit Money :");

        jWithdrawBtn.setBackground(new java.awt.Color(0, 51, 51));
        jWithdrawBtn.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jWithdrawBtn.setForeground(new java.awt.Color(255, 255, 255));
        jWithdrawBtn.setText("Withdraw");
        jWithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWithdrawBtnActionPerformed(evt);
            }
        });

        jDepositBtn.setBackground(new java.awt.Color(0, 51, 51));
        jDepositBtn.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jDepositBtn.setForeground(new java.awt.Color(255, 255, 255));
        jDepositBtn.setText("Deposit");
        jDepositBtn.setPreferredSize(new java.awt.Dimension(97, 27));
        jDepositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepositBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jWithdrawBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDepositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jAmounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel15)
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAmounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jWithdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDepositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG-20211229-WA0004.jpg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 580));

        jTabbedPane1.addTab("Clients Accounts", jPanel1);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(635, 610));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProcessTbl.setBackground(new java.awt.Color(0, 51, 51));
        jProcessTbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jProcessTbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jProcessTbl.setForeground(new java.awt.Color(255, 255, 255));
        jProcessTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jProcessTbl.setSelectionBackground(new java.awt.Color(11, 159, 159));
        jProcessTbl.setUpdateSelectionOnSort(false);
        jScrollPane4.setViewportView(jProcessTbl);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 82, 600, 92));

        jProcessBtn.setBackground(new java.awt.Color(0, 51, 51));
        jProcessBtn.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jProcessBtn.setForeground(new java.awt.Color(255, 255, 255));
        jProcessBtn.setText("Show latest Processes Of the Bank");
        jProcessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProcessBtnActionPerformed(evt);
            }
        });
        jPanel5.add(jProcessBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, 60));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo-1607944024060-0450380ddd33 (2).jpeg"))); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 630, 600));

        jTabbedPane1.addTab("Process Info", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowBtnActionPerformed
        // TO show the clients data
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankserver", "root", "medo"); //to make connection with the database
            PreparedStatement stmt = con.prepareStatement("select * from clients"); //to show the table from the database
            ResultSet set = stmt.executeQuery(); //to insert the values
            DefaultTableModel dm = new DefaultTableModel(); //to make a model for the table you selected from the database
            dm.addColumn("ID"); // naming the columns
            dm.addColumn("Name"); //same
            dm.addColumn("Acount"); //same
            dm.addColumn("Phone Number");//same
            dm.addColumn("Bank Branch"); //same
            while (set.next()) {
                String r[] = {set.getString(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5)}; //to put the items in every column
                dm.addRow(r);
            }
            jCusTbl.setModel(dm);

        } catch (SQLException ex) {
            System.out.println(ex); //to show if there is an error
        }
    }//GEN-LAST:event_jShowBtnActionPerformed

    private void jIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIDtxtActionPerformed

    private void jCusTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCusTblMouseClicked
        // TO make the items you select from the clients table appear in their text fields
        int row_num = jCusTbl.getSelectedRow(); //a method to get the selected row from the table
        String id = jCusTbl.getValueAt(row_num, 0).toString(); // putting the cell from the selected row and assigning them to a string
        String name = jCusTbl.getValueAt(row_num, 1).toString(); //same
        String acc = jCusTbl.getValueAt(row_num, 2).toString(); //same
        String num = jCusTbl.getValueAt(row_num, 3).toString(); //same
        jIDtxt.setText(id); //putting the strings we assigned data in in the text fields
        jNametxt.setText(name); //**
        jAcctxt.setText(acc); //**
        jNumtxt.setText(num); //**

    }//GEN-LAST:event_jCusTblMouseClicked

    private void jInsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertBtnActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankserver", "root", "medo"); //connection
            PreparedStatement stmt = con.prepareStatement("insert into clients ( cus_name , cus_acc , cus_num , loc ) values ( ? , ? , ? , ? )"); //to insert clients data into database 
            PreparedStatement stmtPro = con.prepareStatement("insert into process ( emp_name , loc , timing , process ) values ( ? , ? , ? , ? )"); //to insert process we did while edit or add data for clients
            String name = jNametxt.getText(); //assigning data into strings for clients
            String acc = jAcctxt.getText(); //**
            String num = jNumtxt.getText(); //**
            String loc = jBranch.getSelectedItem().toString(); //** for process table
            String emp_name = jemp.getSelectedItem().toString(); //**
            java.util.Date ddate = new java.util.Date(); //*a method to assign the time we did that process
            String date = ddate.toString(); //assigning time to process table
            String pro = "Insert"; //type of process 
            if ("".equals(name) || "".equals(num) || "".equals(acc)) { //in case there is empty data we should assign it will appear a warning message 
                JOptionPane.showMessageDialog(this, "Hi " + emp_name + " Data are not Complete!");
            } else {
                stmt.setString(1, name); //putting the data the user put into the clients table in database
                stmt.setString(2, acc); //**
                stmt.setString(3, num); //**
                stmt.setString(4, loc); //**
                stmt.executeUpdate(); //*to update data into the clients table in the database
                stmtPro.setString(1, emp_name); //putting the data the user put into the process table in database
                stmtPro.setString(2, loc); //**
                stmtPro.setString(3, date); //**
                stmtPro.setString(4, pro); //**
                stmtPro.executeUpdate(); //*to update data into the process table in the database
                JOptionPane.showMessageDialog(this, "Hi " + emp_name + " Insertion Succeeded"); //showing the message of success of insertion
            }
            jIDtxt.setText(""); //making the text fields empty after insertion
            jNametxt.setText(""); //**
            jAcctxt.setText(""); //**
            jNumtxt.setText(""); //**
            jShowBtnActionPerformed(evt); // to execute showing clients data after insertion
            jProcessBtnActionPerformed(evt); // to execute showing process data after insertion
        } catch (SQLException ex) {
            System.out.println(ex); //for error
        }

    }//GEN-LAST:event_jInsertBtnActionPerformed

    private void jUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpBtnActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_server", "root", "medo"); //connection
            PreparedStatement stmt = con.prepareStatement("update clients set cus_name=?, cus_num=? , loc=? where cus_id=?"); //to change some info in clients table
            PreparedStatement stmtPro = con.prepareStatement("insert into process ( emp_name , loc , timing , process ) values ( ? , ? , ? , ? )"); //to insert the process of update into the process table
            java.util.Date ddate = new java.util.Date(); // to get the exact time we did that process
            String date = ddate.toString();
            String pro = "Update"; //to assign the type of process
            String name = jNametxt.getText(); // to get data from text fields
            String num = jNumtxt.getText(); //**
            String id = jIDtxt.getText(); //**
            String loc = jBranch.getSelectedItem().toString();//**
            String emp_name = jemp.getSelectedItem().toString(); //**
            stmt.setString(1, name); //to put them into the database
            stmt.setString(2, num); //**
            stmt.setString(3, loc); //**
            stmt.setString(4, id); //**
            stmt.executeUpdate(); //to update data in the clients table
            stmtPro.setString(1, emp_name); //to put them into the database
            stmtPro.setString(2, loc); //**
            stmtPro.setString(3, date); //**
            stmtPro.setString(4, pro);//**
            stmtPro.executeUpdate();//to update data in the process table
            jIDtxt.setText("");//to clear the text from text fields
            jNametxt.setText(""); //**
            jAcctxt.setText(""); //**
            jNumtxt.setText(""); //**
            jAmounttxt.setText(""); //**
            JOptionPane.showMessageDialog(this, "Hi " + emp_name + "Update Succeeded!"); //message to show success of update
            jShowBtnActionPerformed(evt); //to execute showing clients data after update
            jProcessBtnActionPerformed(evt); // to execute showing process data after update

        } catch (SQLException ex) {
            System.out.println(ex); //for error
        }

    }//GEN-LAST:event_jUpBtnActionPerformed

    private void jEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpBtnActionPerformed
        // TO show employees and bank data
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankserver", "root", "medo"); //connection
            PreparedStatement stmt = con.prepareStatement("select * from employee"); //to show employees data
            PreparedStatement stmtBank = con.prepareStatement("select * from bank_branch"); //to show bank data
            ResultSet set = stmt.executeQuery(); // to execute the statement we called from the database
            ResultSet setB = stmtBank.executeQuery();// to execute the statement we called from the database but for bank table
            DefaultTableModel dm = new DefaultTableModel();
            DefaultTableModel dmB = new DefaultTableModel();
            dm.addColumn("ID");
            dm.addColumn("Name");
            dm.addColumn("Bank Branch");
            dmB.addColumn("Location");
            dmB.addColumn("E-Mail");
            while (set.next()) {
                String r[] = {set.getString(1), set.getString(2), set.getString(3)};
                dm.addRow(r);
            }
            while (setB.next()) {
                String r[] = {setB.getString(1), setB.getString(2)};
                dmB.addRow(r);
            }
            jEmpTbl.setModel(dm);
            jBanktbl.setModel(dmB);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jEmpBtnActionPerformed

    private void jAmounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmounttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmounttxtActionPerformed

    private void jDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteBtnActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankserver", "root", "medo");
            PreparedStatement stmt = con.prepareStatement("delete from clients where cus_id=?"); //to delete data from database in clients table
            PreparedStatement stmtPro = con.prepareStatement("insert into process ( emp_name , loc , timing , process ) values ( ? , ? , ? , ? )"); //to insert the process of the deleting
            String cus_id = jIDtxt.getText();
            java.util.Date ddate = new java.util.Date();
            String date = ddate.toString();
            String pro = "Delete";
            stmt.setString(1, cus_id);
            String emp_name = jemp.getSelectedItem().toString();
            if ("".equals(cus_id)) { //in case they didn't select any data to delete
                JOptionPane.showMessageDialog(this, "Hi " + emp_name + " No data is selected to Delete!");
            } else {
                stmt.executeUpdate(); //to execute the statement of deleting data from database
                JOptionPane.showMessageDialog(this, "Hi " + emp_name + " Deletion Success!");
                String loc = jBranch.getSelectedItem().toString();
                stmtPro.setString(1, emp_name);
                stmtPro.setString(2, loc);
                stmtPro.setString(3, date);
                stmtPro.setString(4, pro);
                stmtPro.executeUpdate();
                jProcessBtnActionPerformed(evt); //to show data in process table after adding info
                jShowBtnActionPerformed(evt); //to show clients data after deleting

                jIDtxt.setText("");
                jNametxt.setText("");
                jNumtxt.setText("");
                jAcctxt.setText("");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_jDeleteBtnActionPerformed

    private void jSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchBtnActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankserver", "root", "medo");
            PreparedStatement stmt = con.prepareStatement("select * from clients where cus_id=?");//to get some data from clients table
            String id = jClientID.getText();
            stmt.setString(1, id);
            ResultSet set = stmt.executeQuery(); 
            if (set.next()) {
                jClientName.setText(set.getString("cus_name")); //to get data from database and put it into text field
                jClientAcc.setText(set.getString("cus_acc")); //**
                jClientNum.setText(set.getString("cus_num")); //**
                jClientBank.setText(set.getString("loc")); //**
            } else {
                JOptionPane.showMessageDialog(this, "Not Found"); //if the id not in the table 
            }

        } catch (SQLException ex) {
            System.out.println(ex); 
        }
    }//GEN-LAST:event_jSearchBtnActionPerformed

    private void jWithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWithdrawBtnActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankserver", "root", "medo"); //connection
            PreparedStatement stmt = con.prepareStatement("update clients set cus_acc=? where cus_id=?"); //to update the account of the client
            PreparedStatement stmtPro = con.prepareStatement("insert into process ( emp_name , loc , timing , process ) values ( ? , ? , ? , ? )"); //to insert the process of the withdraw in its table
            java.util.Date ddate = new java.util.Date(); //to assign the date of the withdraw process
            String date = ddate.toString(); //**
            String pro = "Withdraw"; //**type of process
            String id = jIDtxt.getText(); //strings to assign data from text fields 
            String amount = jAmounttxt.getText(); //**
            String acc = jAcctxt.getText();//**
            String emp_name = jemp.getSelectedItem().toString();//**
            String loc = jBranch.getSelectedItem().toString();//**
            double result = 0; //to get the account after withdrawing
            if ((Double.parseDouble(amount)) > (Double.parseDouble(acc))) { //a condition to see if the withdraw more than the account to show a message for error
                JOptionPane.showMessageDialog(this, "Hi " + emp_name + " Account is less than the Withdraw !"); //the message
            } else { //if the withdraw is less than the acount the process will be done then
                result = Double.parseDouble(acc) - Double.parseDouble(amount); //assigning the result of the account after withdrawing
                JOptionPane.showMessageDialog(this, "Hi " + emp_name + " Withdraw Succeeded !"); //success of withdrawing
                String Acc = String.valueOf(result); //assigning the account
                stmt.setString(1, Acc);//putting the data in the table of clients
                stmt.setString(2, id);//**
                stmt.executeUpdate();//to ececute the change in the database
                jShowBtnActionPerformed(evt); //to show data after changing data
                stmtPro.setString(1, emp_name); //to put the data in the table of employees
                stmtPro.setString(2, loc); //**
                stmtPro.setString(3, date); //**
                stmtPro.setString(4, pro);//**
                stmtPro.executeUpdate();//to ececute the change in the database
                jProcessBtnActionPerformed(evt); //to show the data in the table of process after inserting
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jWithdrawBtnActionPerformed

    private void jDepositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepositBtnActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankserver", "root", "medo"); //connection
            PreparedStatement stmt = con.prepareStatement("update clients set cus_acc=? where cus_id=?"); //statement to update the data of clients after the deposit
            PreparedStatement stmtPro = con.prepareStatement("insert into process ( emp_name , loc , timing , process ) values ( ? , ? , ? , ? )"); //to insert the deposit process in the database
            java.util.Date ddate = new java.util.Date(); //date
            String date = ddate.toString();
            String pro = "Deposit"; //type of process
            String id = jIDtxt.getText(); //getting data from text fields to strings
            String amount = jAmounttxt.getText(); //**
            String acc = jAcctxt.getText(); //**
            String emp_name = jemp.getSelectedItem().toString();//**
            String loc = jBranch.getSelectedItem().toString();//**
            double result = 0; //to assign the account after the deposit
            result = Double.parseDouble(acc) + Double.parseDouble(amount); //process to make the deposit done
            JOptionPane.showMessageDialog(this, "Hi " + emp_name + " Deposit Succeeded !"); //success of deposit
            String Acc = String.valueOf(result); //assigning the acount after deposit
            stmt.setString(1, Acc);//putting the data from string to the database clients table
            stmt.setString(2, id); //**
            stmt.executeUpdate(); //executing the change that happened in the database
            stmtPro.setString(1, emp_name);//putting the data from string to the database process table
            stmtPro.setString(2, loc);//**
            stmtPro.setString(3, date);//**
            stmtPro.setString(4, pro);//**
            stmtPro.executeUpdate();//executing the change that happened in the database
            jProcessBtnActionPerformed(evt); //to show data in process table
            jShowBtnActionPerformed(evt);//to show data in clients table
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jDepositBtnActionPerformed

    private void jProcessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProcessBtnActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankserver", "root", "medo"); //connection
            PreparedStatement stmt = con.prepareStatement("select * from process"); //statement to show data from database
            ResultSet set = stmt.executeQuery(); //to execute showing data
            DefaultTableModel dm = new DefaultTableModel(); //default table to assign data from database
            dm.addColumn("Employee"); //naming the columns 
            dm.addColumn("Bank Branch"); //**
            dm.addColumn("Timing"); //**
            dm.addColumn("Type of process"); //**
            while (set.next()) {
                String r[] = {set.getString(1), set.getString(2), set.getString(3), set.getString(4)}; //to put the items in every column
                dm.addRow(r); //to assign the row into table
            }
            jProcessTbl.setModel(dm); //putting the default table into the table we created in the frame

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jProcessBtnActionPerformed

    private void jClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jClientIDActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
           //new Frame1().setVisible(true);
            
           Frame1 a= new Frame1();
           a.setTitle("Bank System");
           a.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jAcctxt;
    private javax.swing.JTextField jAmounttxt;
    private javax.swing.JTable jBanktbl;
    private javax.swing.JComboBox<String> jBranch;
    private javax.swing.JTextField jClientAcc;
    private javax.swing.JTextField jClientBank;
    private javax.swing.JTextField jClientID;
    private javax.swing.JTextField jClientName;
    private javax.swing.JTextField jClientNum;
    private javax.swing.JTable jCusTbl;
    private javax.swing.JButton jDeleteBtn;
    private javax.swing.JButton jDepositBtn;
    private javax.swing.JButton jEmpBtn;
    private javax.swing.JTable jEmpTbl;
    private javax.swing.JTextField jIDtxt;
    private javax.swing.JButton jInsertBtn;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNametxt;
    private javax.swing.JTextField jNumtxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jProcessBtn;
    private javax.swing.JTable jProcessTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jSearchBtn;
    private javax.swing.JButton jShowBtn;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jUpBtn;
    private javax.swing.JButton jWithdrawBtn;
    private javax.swing.JComboBox<String> jemp;
    // End of variables declaration//GEN-END:variables

    private Color Color(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
