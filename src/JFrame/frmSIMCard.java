package JFrame;

import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmSIMCard extends javax.swing.JFrame {

    private DefaultTableModel TableModel = new DefaultTableModel();
    private String Telecom;
    private String kind_of;

    private boolean FlagChbAll;
    private boolean FlagTable;

    public frmSIMCard() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSIMCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSIMCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSIMCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSIMCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        Objects.Customer.Make_null();
        Objects.SIM.Make_null();
        FlagChbAll = false;
        FlagTable = false;
        Telecom = null;
        kind_of = "Thường";
        chbVinaphone.setSelected(true);
        ScrollPaneSIM.getViewport().setBackground(new java.awt.Color(250, 250, 210));
        //this.setExtendedState(this.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new java.awt.Color(250, 250, 210));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconfrm.png")));
        this.setTitle("QUẢN LÝ BÁN THẺ SIM ĐIỆN THOẠI DI ĐỘNG DEMO");
        onRunning();
    }

    public void onRunning() {
        this.setEnabled(true);
        this.setVisible(true);
        setNameAccount(Objects.Account.name);
    }

    public void onPause() {
        this.setEnabled(false);
        this.setVisible(false);
    }

    public void onDestroy() {
        this.dispose();
    }

    public void Exit() {
        onPause();
        onDestroy();
        frmLogin Login = new frmLogin();
    }

    public void setNameAccount(String name) {
        lblNameAccount.setText(name);
    }

    public void resetText() {
        txtSIMSearch.setText(null);
    }

    public void onPause4chb() {
        chbMobifone.setEnabled(false);
        chbViettel.setEnabled(false);
        chbVinaphone.setEnabled(false);
    }

    public void onRunning4chb() {
        chbMobifone.setEnabled(true);
        chbViettel.setEnabled(true);
        chbVinaphone.setEnabled(true);
    }

    public void Listen2Update() {
        if (!FlagChbAll) {
            try {
                TableModel = new DefaultTableModel();
                java.sql.Statement s = Functions.Connected.getcon().createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM SIMCARD WHERE TELECOM='" + Telecom + "' AND KINDOF=N'" + kind_of + "' ORDER BY PRICE ASC");//DESC
                String[] colsName = {"SIM SỐ", "GÍA BÁN (VND)", "NHÀ MẠNG", "LOẠI"};
                TableModel.setColumnIdentifiers(colsName);
                tblSIM.setModel(TableModel);
                while (rs.next()) {
                    Object rows[] = new Object[4];
                    rows[0] = rs.getString(1);
                    rows[1] = rs.getInt(2);
                    rows[2] = rs.getString(3);
                    rows[3] = rs.getString(4);
                    TableModel.addRow(rows);
                }
                Functions.Connected.con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                TableModel = new DefaultTableModel();
                java.sql.Statement s = Functions.Connected.getcon().createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM SIMCARD ORDER BY PRICE ASC");
                String[] colsName = {"SIM SỐ", "GÍA BÁN (VND)", "NHÀ MẠNG", "LOẠI"};
                TableModel.setColumnIdentifiers(colsName);
                tblSIM.setModel(TableModel);
                while (rs.next()) {
                    Object rows[] = new Object[4];
                    rows[0] = rs.getString(1);
                    rows[1] = rs.getInt(2);
                    rows[2] = rs.getString(3);
                    rows[3] = rs.getString(4);
                    TableModel.addRow(rows);
                }
                Functions.Connected.con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void chbAll_isSelected() {
        onPause4chb();
        cboSIM.setEnabled(false);
        FlagChbAll = true;
        Listen2Update();
    }

    public void Edit2Save() {
        try {
            for (int i = 0; i < tblSIM.getRowCount(); i++) {
                Object id = TableModel.getValueAt(i, 0);
                if (Integer.parseInt(TableModel.getValueAt(i, 1).toString()) == 0 || Integer.parseInt(TableModel.getValueAt(i, 1).toString()) < 50000 || Integer.parseInt(TableModel.getValueAt(i, 1).toString()) > 599999) {
                    new JOptionPane().showMessageDialog(null, "LỖI KHI CẬP NHẬT GIÁ BÁN", "", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                Object price = TableModel.getValueAt(i, 1);
                if (!TableModel.getValueAt(i, 2).toString().matches("Vinaphone") && !TableModel.getValueAt(i, 2).toString().matches("Mobifone") && !TableModel.getValueAt(i, 2).toString().matches("Viettel")) {
                    new JOptionPane().showMessageDialog(null, "LỖI KHI CẬP NHẬT NHÀ MẠNG", "", JOptionPane.ERROR_MESSAGE);
                    //System.out.println(TableModel.getValueAt(i, 0).toString() + "\t" + TableModel.getValueAt(i, 1).toString() + "\t" + TableModel.getValueAt(i, 2).toString() + "\t" + TableModel.getValueAt(i, 3).toString() + "\t");
                    break;
                }
                Object telecom = TableModel.getValueAt(i, 2);
                if (!TableModel.getValueAt(i, 3).toString().matches("Thường") && !TableModel.getValueAt(i, 3).toString().matches("Đẹp")) {
                    new JOptionPane().showMessageDialog(null, "LỖI KHI CẬP NHẬT LOẠI SIM", "", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                Object kind_of = TableModel.getValueAt(i, 3);
                String up = "UPDATE SIMCARD SET SIMNO='" + id + "', PRICE=" + price + ",TELECOM='" + telecom + "',KINDOF=N'" + kind_of + "' WHERE SIMNO='" + id + "'";
                java.sql.Statement s = Functions.Connected.getcon().createStatement();
                s.execute(up);
                Functions.Connected.con.close();
            }
        } catch (Exception ex) {
            new JOptionPane().showMessageDialog(null, "CẬP NHẬT KHÔNG THÀNH CÔNG", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Bill() {
        if (FlagTable) {
            try {
                int r = tblSIM.getSelectedRow();
                java.sql.Statement s = Functions.Connected.getcon().createStatement();
                Objects.SIM.sim = TableModel.getValueAt(r, 0).toString();
                Objects.SIM.price = Integer.parseInt(TableModel.getValueAt(r, 1).toString());
                Objects.SIM.telecom = TableModel.getValueAt(r, 2).toString();
                Objects.SIM.kind_of = TableModel.getValueAt(r, 3).toString();
                Functions.Connected.con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            new JOptionPane().showMessageDialog(null, "CHỌN SIM ĐỂ XUẤT HÓA ĐƠN", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Delete() {
        if (FlagTable) {
            try {
                int r = tblSIM.getSelectedRow();
                Object id = TableModel.getValueAt(r, 0);
                java.sql.Statement s = Functions.Connected.getcon().createStatement();
                s.execute("Delete FROM SIMCARD WHERE SIMNO='" + id + "'");
                Functions.Connected.con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            new JOptionPane().showMessageDialog(null, "CHƯA CHỌN SIM ĐỂ XÓA", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Search() {
        if (!FlagChbAll) {
            try {
                TableModel = new DefaultTableModel();
                java.sql.Statement s = Functions.Connected.getcon().createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM SIMCARD WHERE SIMNO LIKE '%" + txtSIMSearch.getText() + "%' AND TELECOM='" + Telecom + "' AND KINDOF=N'" + kind_of + "' ORDER BY PRICE ASC");//DESC
                String[] colsName = {"SIM SỐ", "GÍA BÁN (VND)", "NHÀ MẠNG", "LOẠI"};
                TableModel.setColumnIdentifiers(colsName);
                tblSIM.setModel(TableModel);
                while (rs.next()) {
                    Object rows[] = new Object[4];
                    rows[0] = rs.getString(1);
                    rows[1] = rs.getInt(2);
                    rows[2] = rs.getString(3);
                    rows[3] = rs.getString(4);
                    TableModel.addRow(rows);
                }
                Functions.Connected.con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                TableModel = new DefaultTableModel();
                java.sql.Statement s = Functions.Connected.getcon().createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM SIMCARD WHERE SIMNO LIKE '%" + txtSIMSearch.getText() + "%' ORDER BY PRICE ASC");
                String[] colsName = {"SIM SỐ", "GÍA BÁN (VND)", "NHÀ MẠNG", "LOẠI"};
                TableModel.setColumnIdentifiers(colsName);
                tblSIM.setModel(TableModel);
                while (rs.next()) {
                    Object rows[] = new Object[4];
                    rows[0] = rs.getString(1);
                    rows[1] = rs.getInt(2);
                    rows[2] = rs.getString(3);
                    rows[3] = rs.getString(4);
                    TableModel.addRow(rows);
                }
                Functions.Connected.con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSIM = new javax.swing.ButtonGroup();
        pnlSIMLeft = new javax.swing.JPanel();
        lblimageSIMTelecom = new javax.swing.JLabel();
        lblSIMTelecom = new javax.swing.JLabel();
        chbVinaphone = new javax.swing.JCheckBox();
        lblVinaphone = new javax.swing.JLabel();
        chbMobifone = new javax.swing.JCheckBox();
        lblMobifone = new javax.swing.JLabel();
        chbViettel = new javax.swing.JCheckBox();
        lblViettel = new javax.swing.JLabel();
        pnlSIMRight = new javax.swing.JPanel();
        btnSIMSignout = new javax.swing.JButton();
        lblSave = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();
        lblDelete = new javax.swing.JLabel();
        lblBill = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        lblNameAccount = new javax.swing.JLabel();
        pnlSIMCenter = new javax.swing.JPanel();
        ScrollPaneSIM = new javax.swing.JScrollPane();
        tblSIM = new javax.swing.JTable();
        txtSIMSearch = new javax.swing.JTextField();
        separator4txtSearch = new javax.swing.JSeparator();
        lblimageSIM2 = new javax.swing.JLabel();
        lblimageSIM4 = new javax.swing.JLabel();
        lblimageSIM3 = new javax.swing.JLabel();
        chbAll = new javax.swing.JCheckBox();
        cboSIM = new javax.swing.JComboBox<>();
        lblSIMTitle2 = new javax.swing.JLabel();
        lblSIMTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 0));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlSIMLeft.setBackground(new java.awt.Color(255, 191, 0));

        lblimageSIMTelecom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/telecom.png"))); // NOI18N

        lblSIMTelecom.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSIMTelecom.setForeground(new java.awt.Color(65, 105, 225));
        lblSIMTelecom.setText("Nhà Mạng");

        chbVinaphone.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbVinaphoneItemStateChanged(evt);
            }
        });

        lblVinaphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/vinaphone.png"))); // NOI18N

        chbMobifone.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbMobifoneItemStateChanged(evt);
            }
        });

        lblMobifone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/mobifone.png"))); // NOI18N

        chbViettel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbViettelItemStateChanged(evt);
            }
        });

        lblViettel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/viettel.png"))); // NOI18N

        javax.swing.GroupLayout pnlSIMLeftLayout = new javax.swing.GroupLayout(pnlSIMLeft);
        pnlSIMLeft.setLayout(pnlSIMLeftLayout);
        pnlSIMLeftLayout.setHorizontalGroup(
            pnlSIMLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSIMLeftLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(pnlSIMLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbVinaphone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbMobifone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbViettel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlSIMLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMobifone)
                    .addComponent(lblVinaphone)
                    .addComponent(lblViettel))
                .addGap(33, 33, 33))
            .addGroup(pnlSIMLeftLayout.createSequentialGroup()
                .addGroup(pnlSIMLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSIMLeftLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblimageSIMTelecom))
                    .addGroup(pnlSIMLeftLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblSIMTelecom)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSIMLeftLayout.setVerticalGroup(
            pnlSIMLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSIMLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimageSIMTelecom)
                .addGap(18, 18, 18)
                .addComponent(lblSIMTelecom)
                .addGroup(pnlSIMLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSIMLeftLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblVinaphone))
                    .addGroup(pnlSIMLeftLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(chbVinaphone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSIMLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbMobifone)
                    .addComponent(lblMobifone))
                .addGap(147, 147, 147)
                .addGroup(pnlSIMLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSIMLeftLayout.createSequentialGroup()
                        .addComponent(chbViettel)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSIMLeftLayout.createSequentialGroup()
                        .addComponent(lblViettel)
                        .addGap(74, 74, 74))))
        );

        pnlSIMRight.setBackground(new java.awt.Color(250, 250, 210));

        btnSIMSignout.setBackground(new java.awt.Color(34, 139, 34));
        btnSIMSignout.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnSIMSignout.setForeground(new java.awt.Color(255, 255, 255));
        btnSIMSignout.setText("Đăng Xuất");
        btnSIMSignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSIMSignoutMouseClicked(evt);
            }
        });

        lblSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/save.png"))); // NOI18N
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveMouseClicked(evt);
            }
        });

        lblAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/account.png"))); // NOI18N

        lblAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/add1.png"))); // NOI18N
        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMouseClicked(evt);
            }
        });

        lblDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/delete.png"))); // NOI18N
        lblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteMouseClicked(evt);
            }
        });

        lblBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bill1.png"))); // NOI18N
        lblBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBillMouseClicked(evt);
            }
        });

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lblUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/update.png"))); // NOI18N
        lblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateMouseClicked(evt);
            }
        });

        lblNameAccount.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout pnlSIMRightLayout = new javax.swing.GroupLayout(pnlSIMRight);
        pnlSIMRight.setLayout(pnlSIMRightLayout);
        pnlSIMRightLayout.setHorizontalGroup(
            pnlSIMRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSIMRightLayout.createSequentialGroup()
                .addGroup(pnlSIMRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSIMRightLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(pnlSIMRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSave)
                            .addComponent(lblDelete)
                            .addComponent(lblUpdate)
                            .addComponent(lblBill)
                            .addComponent(lblExit)
                            .addComponent(lblAdd)))
                    .addGroup(pnlSIMRightLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnSIMSignout))
                    .addGroup(pnlSIMRightLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(pnlSIMRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlSIMRightLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblNameAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblAccount))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnlSIMRightLayout.setVerticalGroup(
            pnlSIMRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSIMRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNameAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSIMSignout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(lblAdd)
                .addGap(18, 18, 18)
                .addComponent(lblSave)
                .addGap(18, 18, 18)
                .addComponent(lblDelete)
                .addGap(18, 18, 18)
                .addComponent(lblUpdate)
                .addGap(18, 18, 18)
                .addComponent(lblBill)
                .addGap(18, 18, 18)
                .addComponent(lblExit)
                .addContainerGap())
        );

        pnlSIMCenter.setBackground(new java.awt.Color(250, 250, 210));

        tblSIM.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblSIM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SIM SỐ", "GÍA BÁN (VND)", "NHÀ MẠNG", "LOẠI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSIM.setGridColor(new java.awt.Color(195, 0, 82));
        tblSIM.setSelectionBackground(new java.awt.Color(195, 0, 82));
        tblSIM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSIMMouseClicked(evt);
            }
        });
        ScrollPaneSIM.setViewportView(tblSIM);

        txtSIMSearch.setBackground(new java.awt.Color(250, 250, 210));
        txtSIMSearch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtSIMSearch.setForeground(new java.awt.Color(34, 139, 34));
        txtSIMSearch.setBorder(null);
        txtSIMSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSIMSearchKeyReleased(evt);
            }
        });

        lblimageSIM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sim1.png"))); // NOI18N

        lblimageSIM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sim1.png"))); // NOI18N

        lblimageSIM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/sim1.png"))); // NOI18N

        chbAll.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        chbAll.setForeground(new java.awt.Color(65, 105, 225));
        chbAll.setText("Tất cả");
        chbAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbAllItemStateChanged(evt);
            }
        });

        cboSIM.setBackground(new java.awt.Color(70, 130, 180));
        cboSIM.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cboSIM.setForeground(new java.awt.Color(255, 255, 255));
        cboSIM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thường", "Đẹp" }));
        cboSIM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSIMItemStateChanged(evt);
            }
        });

        lblSIMTitle2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSIMTitle2.setForeground(new java.awt.Color(25, 25, 112));
        lblSIMTitle2.setText("Thẻ Sim Điện Thoại");

        lblSIMTitle1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblSIMTitle1.setForeground(new java.awt.Color(25, 25, 112));
        lblSIMTitle1.setText("Quản Lý Bán");

        javax.swing.GroupLayout pnlSIMCenterLayout = new javax.swing.GroupLayout(pnlSIMCenter);
        pnlSIMCenter.setLayout(pnlSIMCenterLayout);
        pnlSIMCenterLayout.setHorizontalGroup(
            pnlSIMCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSIMSearch)
            .addComponent(separator4txtSearch)
            .addComponent(ScrollPaneSIM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSIMCenterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSIMCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSIMCenterLayout.createSequentialGroup()
                        .addGroup(pnlSIMCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSIMTitle1)
                            .addComponent(lblSIMTitle2))
                        .addGap(95, 95, 95))
                    .addGroup(pnlSIMCenterLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblimageSIM2)
                        .addGap(18, 18, 18)
                        .addComponent(lblimageSIM4)
                        .addGap(18, 18, 18)
                        .addComponent(lblimageSIM3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chbAll)
                        .addGap(18, 18, 18)
                        .addComponent(cboSIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlSIMCenterLayout.setVerticalGroup(
            pnlSIMCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSIMCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSIMTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSIMTitle2)
                .addGap(11, 11, 11)
                .addGroup(pnlSIMCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSIMCenterLayout.createSequentialGroup()
                        .addGroup(pnlSIMCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbAll))
                        .addGap(13, 13, 13))
                    .addGroup(pnlSIMCenterLayout.createSequentialGroup()
                        .addGroup(pnlSIMCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimageSIM3)
                            .addComponent(lblimageSIM4)
                            .addComponent(lblimageSIM2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(txtSIMSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(separator4txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneSIM, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSIMLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                .addComponent(pnlSIMRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(pnlSIMCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(206, 206, 206)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSIMRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSIMLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlSIMCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtSIMSearch.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnGroupSIM.add(chbVinaphone);
        btnGroupSIM.add(chbMobifone);
        btnGroupSIM.add(chbViettel);
        lblAccount.setToolTipText("Hình ảnh đăng nhập.");
        lblimageSIM2.setToolTipText("Hình ảnh nền.");
        lblimageSIM3.setToolTipText("Hình ảnh nền.");
        lblimageSIM4.setToolTipText("Hình ảnh nền.");
        lblimageSIMTelecom.setToolTipText("Hình ảnh nền.");
        //<editor-fold defaultstate="collapsed" desc="Goi y cac chuc nang cho layout ben phai">
        //</editor-fold>
        lblAdd.setToolTipText("<html>Thêm vào một<br>SIM điện thoại.</html>");
        lblSave.setToolTipText("<html>Lưu lại thông tin<br>đã chỉnh sửa của một<br>SIM điện thoại.</html>");
        lblDelete.setToolTipText("<html>Xóa một<br>SIM điện thoại.</html>");
        lblUpdate.setToolTipText("<html>Cập nhật danh sách<br>SIM điện thoại.</html>");
        lblBill.setToolTipText("<html>Xuất hóa đơn một<br>SIM điện thoại.</html>");
        lblExit.setToolTipText("<html>Thoát khỏi hệ thống.</html>");
        btnSIMSignout.setToolTipText("Đăng xuất khỏi hệ thống.");
        chbAll.setToolTipText("<html>Cho phép hiển thị tất cả<br>SIM điện thoại.</html>");
        cboSIM.setToolTipText("<html>Chọn SIM điện thoại<br>theo loại <b>Thường</b> hoặc <b>Đẹp</b>.</html>");
        Listen2Update();
        resetText();
    }//GEN-LAST:event_formWindowOpened

    private void chbVinaphoneItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbVinaphoneItemStateChanged
        if (evt.getStateChange() == 1) {
            Telecom = "Vinaphone";
            Listen2Update();
            resetText();
        }
    }//GEN-LAST:event_chbVinaphoneItemStateChanged

    private void chbMobifoneItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbMobifoneItemStateChanged
        if (evt.getStateChange() == 1) {
            Telecom = "Mobifone";
            Listen2Update();
            resetText();
        }
    }//GEN-LAST:event_chbMobifoneItemStateChanged

    private void chbViettelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbViettelItemStateChanged
        if (evt.getStateChange() == 1) {
            Telecom = "Viettel";
            Listen2Update();
            resetText();
        }
    }//GEN-LAST:event_chbViettelItemStateChanged

    private void chbAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbAllItemStateChanged
        if (evt.getStateChange() == 1) {
            chbAll_isSelected();
        } else {
            onRunning4chb();
            cboSIM.setEnabled(true);
            FlagChbAll = false;
            Listen2Update();
            resetText();
        }
    }//GEN-LAST:event_chbAllItemStateChanged

    private void cboSIMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSIMItemStateChanged
        if (evt.getItem().toString() == cboSIM.getItemAt(1).toString()) {
            kind_of = "Đẹp";
            Listen2Update();
            resetText();
        } else {
            kind_of = "Thường";
            Listen2Update();
            resetText();
        }
    }//GEN-LAST:event_cboSIMItemStateChanged

    private void btnSIMSignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSIMSignoutMouseClicked
        Exit();
        Notification.TrayIcon.displayTray("BẠN VỪA ĐĂNG XUẤT\nKHỎI HỆ THỐNG");
    }//GEN-LAST:event_btnSIMSignoutMouseClicked

    private void lblAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMouseClicked
        onPause();
        onDestroy();
        frmAddSIM AddSIM = new frmAddSIM();
    }//GEN-LAST:event_lblAddMouseClicked

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        Edit2Save();
        Listen2Update();
        resetText();
    }//GEN-LAST:event_lblSaveMouseClicked

    private void lblDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseClicked
        Delete();
        Listen2Update();
        resetText();
    }//GEN-LAST:event_lblDeleteMouseClicked

    private void lblBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillMouseClicked
        if (FlagTable) {
            Bill();
            onPause();
            onDestroy();
            frmBill Bill = new frmBill();
        } else {
            new JOptionPane().showMessageDialog(null, "CHỌN SIM ĐỂ XUẤT HÓA ĐƠN", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lblBillMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        onPause();
        onDestroy();
        frmLogin Login = new frmLogin();
        Notification.TrayIcon.displayTray("BẠN VỪA THOÁT KHỎI HỆ THỐNG");
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMouseClicked
        Listen2Update();
        FlagTable = false;
        resetText();
    }//GEN-LAST:event_lblUpdateMouseClicked

    private void txtSIMSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSIMSearchKeyReleased
        Search();
    }//GEN-LAST:event_txtSIMSearchKeyReleased

    private void tblSIMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSIMMouseClicked
        FlagTable = true;
    }//GEN-LAST:event_tblSIMMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
//        onPause();
//        onDestroy();
//        frmLogin Login = new frmLogin();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame.frmSIMCard SIMCard = new JFrame.frmSIMCard();
            }
        });
    }

//<editor-fold defaultstate="collapsed" desc=" Cac thanh phan cua form SIMCARD ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneSIM;
    private javax.swing.ButtonGroup btnGroupSIM;
    private javax.swing.JButton btnSIMSignout;
    private javax.swing.JComboBox<String> cboSIM;
    private javax.swing.JCheckBox chbAll;
    private javax.swing.JCheckBox chbMobifone;
    private javax.swing.JCheckBox chbViettel;
    private javax.swing.JCheckBox chbVinaphone;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblBill;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMobifone;
    private javax.swing.JLabel lblNameAccount;
    private javax.swing.JLabel lblSIMTelecom;
    private javax.swing.JLabel lblSIMTitle1;
    private javax.swing.JLabel lblSIMTitle2;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JLabel lblViettel;
    private javax.swing.JLabel lblVinaphone;
    private javax.swing.JLabel lblimageSIM2;
    private javax.swing.JLabel lblimageSIM3;
    private javax.swing.JLabel lblimageSIM4;
    private javax.swing.JLabel lblimageSIMTelecom;
    private javax.swing.JPanel pnlSIMCenter;
    private javax.swing.JPanel pnlSIMLeft;
    private javax.swing.JPanel pnlSIMRight;
    private javax.swing.JSeparator separator4txtSearch;
    private javax.swing.JTable tblSIM;
    private javax.swing.JTextField txtSIMSearch;
    // End of variables declaration//GEN-END:variables
 //</editor-fold>
}
