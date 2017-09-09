package JFrame;

import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmAddSIM extends javax.swing.JFrame {

    private String telecom;
    private String kind_of;

    public frmAddSIM() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAddSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        telecom = "Vinaphone";
        kind_of = "Thường";
        this.getContentPane().setBackground(new java.awt.Color(250, 250, 210));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconfrm.png")));
        this.setLayout(new GridBagLayout());
        this.setMinimumSize(pnlAddSIM.getPreferredSize());
        this.setTitle("QUẢN LÝ BÁN THẺ SIM ĐIỆN THOẠI DI ĐỘNG DEMO");
        onRunning();
    }

    public void onRunning() {
        this.setEnabled(true);
        this.setVisible(true);
    }

    public void onPause() {
        this.setEnabled(false);
        this.setVisible(false);
    }

    public void onDestroy() {
        this.dispose();
    }

    public void resetText() {
        txtAddSIMnumber.setText(null);
        txtAddSIMprice.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAddSIM = new javax.swing.JPanel();
        lblAddSIMimage = new javax.swing.JLabel();
        lblAddSIMnumber = new javax.swing.JLabel();
        txtAddSIMnumber = new javax.swing.JTextField();
        lblAddSIMprice = new javax.swing.JLabel();
        txtAddSIMprice = new javax.swing.JTextField();
        lblAddSIMtelecom = new javax.swing.JLabel();
        cboAddSIMtelecom = new javax.swing.JComboBox<>();
        lblAddSIMkind_of = new javax.swing.JLabel();
        cboAddSIMkind_of = new javax.swing.JComboBox<>();
        lblAddSIMvnd = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 0));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setSize(new java.awt.Dimension(700, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlAddSIM.setBackground(new java.awt.Color(250, 250, 210));
        pnlAddSIM.setMinimumSize(new java.awt.Dimension(700, 700));
        pnlAddSIM.setPreferredSize(new java.awt.Dimension(700, 700));

        lblAddSIMimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/addnew_128.png"))); // NOI18N

        lblAddSIMnumber.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAddSIMnumber.setForeground(new java.awt.Color(65, 105, 225));
        lblAddSIMnumber.setText("SỐ SIM");

        txtAddSIMnumber.setBackground(new java.awt.Color(250, 250, 210));
        txtAddSIMnumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtAddSIMnumber.setBorder(null);
        txtAddSIMnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddSIMnumberKeyReleased(evt);
            }
        });

        lblAddSIMprice.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAddSIMprice.setForeground(new java.awt.Color(65, 105, 225));
        lblAddSIMprice.setText("GIÁ BÁN");

        txtAddSIMprice.setBackground(new java.awt.Color(250, 250, 210));
        txtAddSIMprice.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtAddSIMprice.setBorder(null);
        txtAddSIMprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddSIMpriceKeyReleased(evt);
            }
        });

        lblAddSIMtelecom.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAddSIMtelecom.setForeground(new java.awt.Color(65, 105, 225));
        lblAddSIMtelecom.setText("NHÀ MẠNG");

        cboAddSIMtelecom.setBackground(new java.awt.Color(70, 130, 180));
        cboAddSIMtelecom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cboAddSIMtelecom.setForeground(new java.awt.Color(255, 255, 255));
        cboAddSIMtelecom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vinaphone", "Mobifone", "Viettel" }));

        lblAddSIMkind_of.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAddSIMkind_of.setForeground(new java.awt.Color(65, 105, 225));
        lblAddSIMkind_of.setText("LOẠI");

        cboAddSIMkind_of.setBackground(new java.awt.Color(70, 130, 180));
        cboAddSIMkind_of.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cboAddSIMkind_of.setForeground(new java.awt.Color(255, 255, 255));
        cboAddSIMkind_of.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thường", "Đẹp" }));

        lblAddSIMvnd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAddSIMvnd.setForeground(new java.awt.Color(65, 105, 225));
        lblAddSIMvnd.setText("VND");

        btnReset.setBackground(new java.awt.Color(240, 0, 0));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("LÀM LẠI");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(34, 139, 34));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAO LƯU");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(135, 206, 250));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("TRỞ VỀ");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAddSIMLayout = new javax.swing.GroupLayout(pnlAddSIM);
        pnlAddSIM.setLayout(pnlAddSIMLayout);
        pnlAddSIMLayout.setHorizontalGroup(
            pnlAddSIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddSIMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddSIMimage)
                .addGap(286, 286, 286))
            .addGroup(pnlAddSIMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddSIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddSIMLayout.createSequentialGroup()
                        .addGroup(pnlAddSIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAddSIMprice)
                            .addComponent(lblAddSIMnumber)
                            .addComponent(txtAddSIMnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddSIMtelecom)
                            .addComponent(lblAddSIMkind_of)
                            .addComponent(cboAddSIMkind_of, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboAddSIMtelecom, 0, 669, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlAddSIMLayout.createSequentialGroup()
                        .addGroup(pnlAddSIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddSIMLayout.createSequentialGroup()
                                .addComponent(txtAddSIMprice, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAddSIMvnd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddSIMLayout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        pnlAddSIMLayout.setVerticalGroup(
            pnlAddSIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddSIMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddSIMimage)
                .addGap(7, 7, 7)
                .addComponent(lblAddSIMnumber)
                .addGap(18, 18, 18)
                .addComponent(txtAddSIMnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddSIMprice)
                .addGap(18, 18, 18)
                .addGroup(pnlAddSIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddSIMprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddSIMvnd))
                .addGap(18, 18, 18)
                .addComponent(lblAddSIMtelecom)
                .addGap(18, 18, 18)
                .addComponent(cboAddSIMtelecom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddSIMkind_of)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboAddSIMkind_of, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(pnlAddSIMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddSIM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAddSIM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        resetText();
        cboAddSIMkind_of.setSelectedItem(cboAddSIMkind_of.getItemAt(0));
        cboAddSIMtelecom.setSelectedItem(cboAddSIMtelecom.getItemAt(0));
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        if (txtAddSIMnumber.getText().matches("") || txtAddSIMprice.getText().matches("")) {
            new JOptionPane().showMessageDialog(null, "CHƯA ĐIỀN ĐẦY ĐỦ THÔNG TIN", "", JOptionPane.ERROR_MESSAGE);
            resetText();
            return;
        }
        if (!(txtAddSIMnumber.getText().length() >= 10)) {
            new JOptionPane().showMessageDialog(this, "LỖI ĐỘ DÀI SỐ ĐIỆN THOẠI", "", JOptionPane.ERROR_MESSAGE);
            txtAddSIMnumber.setText(null);
            return;
        }

        if (!(Integer.parseInt(txtAddSIMprice.getText()) >= 50000) || Integer.parseInt(txtAddSIMprice.getText()) > 599999) {
            new JOptionPane().showMessageDialog(this, "LỖI KHI NHẬP GIÁ BÁN", "", JOptionPane.ERROR_MESSAGE);
            txtAddSIMprice.setText(null);
            return;
        }

        try {
            java.sql.Statement s = Functions.Connected.getcon().createStatement();
            try {
                s.execute("INSERT INTO SIMCARD  VALUES ('" + txtAddSIMnumber.getText() + "', " + txtAddSIMprice.getText() + ", '" + cboAddSIMtelecom.getSelectedItem().toString() + "', N'" + cboAddSIMkind_of.getSelectedItem().toString() + "')");
                new JOptionPane().showMessageDialog(this, "ĐÃ HOÀN THÀNH VIỆC THÊM SIM MỚI", "", JOptionPane.PLAIN_MESSAGE);
                resetText();
                cboAddSIMkind_of.setSelectedItem(cboAddSIMkind_of.getItemAt(0));
                cboAddSIMtelecom.setSelectedItem(cboAddSIMtelecom.getItemAt(0));
            } catch (Exception ex) {
                new JOptionPane().showMessageDialog(this, "VIỆC THÊM SIM MỚI THẤT BẠI", "", JOptionPane.ERROR_MESSAGE);
            }
            Functions.Connected.con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        onPause();
        onDestroy();
        frmSIMCard SIMCard = new frmSIMCard();
    }//GEN-LAST:event_btnBackMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        onPause();
        onDestroy();
        frmSIMCard SIMCard = new frmSIMCard();
    }//GEN-LAST:event_formWindowClosing

    private void txtAddSIMnumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddSIMnumberKeyReleased
        boolean error_txt_number = false;
        String s = txtAddSIMnumber.getText();
        try {
            if (!(s.toCharArray()[0] == '0') || s.toCharArray()[1] == '0' || (s.toCharArray()[1] == '.' && s.toCharArray()[2] == '0')) {
                new JOptionPane().showMessageDialog(this, "SỐ ĐIỆN THOẠI CHƯA ĐÚNG", "", JOptionPane.ERROR_MESSAGE);
                txtAddSIMnumber.setText(null);
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (s.length() >= 20) {
                        new JOptionPane().showMessageDialog(this, "SỐ ĐIỆN THOẠI CHƯA ĐÚNG", "", JOptionPane.ERROR_MESSAGE);
                        txtAddSIMnumber.setText(null);
                        break;
                    }
                    if (s.toCharArray()[i] == '.' && s.toCharArray()[i + 1] == '.') {
                        new JOptionPane().showMessageDialog(this, "SỐ ĐIỆN THOẠI CHƯA ĐÚNG", "", JOptionPane.ERROR_MESSAGE);
                        txtAddSIMnumber.setText(null);
                        break;
                    }
                    switch (s.toCharArray()[i]) {
                        case '0': {
                            break;
                        }
                        case '1': {
                            break;
                        }
                        case '2': {
                            break;
                        }
                        case '3': {
                            break;
                        }
                        case '4': {
                            break;
                        }
                        case '5': {
                            break;
                        }
                        case '6': {
                            break;
                        }
                        case '7': {
                            break;
                        }
                        case '8': {
                            break;
                        }
                        case '9': {
                            break;
                        }
                        case '.': {
                            break;
                        }
                        default: {
                            new JOptionPane().showMessageDialog(this, "SỐ ĐIỆN THOẠI CHƯA ĐÚNG", "", JOptionPane.ERROR_MESSAGE);
                            error_txt_number = true;
                            break;
                        }
                    }
                    if (error_txt_number) {
                        txtAddSIMnumber.setText(null);
                        break;
                    }
                }
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_txtAddSIMnumberKeyReleased

    private void txtAddSIMpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddSIMpriceKeyReleased
        boolean error_txt_price = false;
        String s = txtAddSIMprice.getText();
        try {
            for (int i = 0; i < s.length(); i++) {
                switch (s.toCharArray()[i]) {
                    case '0': {
                        break;
                    }
                    case '1': {
                        break;
                    }
                    case '2': {
                        break;
                    }
                    case '3': {
                        break;
                    }
                    case '4': {
                        break;
                    }
                    case '5': {
                        break;
                    }
                    case '6': {
                        break;
                    }
                    case '7': {
                        break;
                    }
                    case '8': {
                        break;
                    }
                    case '9': {
                        break;
                    }
                    default: {
                        new JOptionPane().showMessageDialog(this, "LỖI KHI NHẬP GIÁ BÁN", "", JOptionPane.ERROR_MESSAGE);
                        error_txt_price = true;
                        break;
                    }
                }
                if (error_txt_price) {
                    txtAddSIMprice.setText(null);
                    break;
                }
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_txtAddSIMpriceKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cboAddSIMtelecom.setToolTipText("<html>HỆ THỐNG CHƯA THỂ XÁC ĐỊNH<br>SỐ THUÊ TƯƠNG ỨNG<br>VỚI NHÀ MẠNG.</html>");
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmAddSIM AddSIM = new frmAddSIM();
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc=" Cac thanh phan cua form ADD SIM ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboAddSIMkind_of;
    private javax.swing.JComboBox<String> cboAddSIMtelecom;
    private javax.swing.JLabel lblAddSIMimage;
    private javax.swing.JLabel lblAddSIMkind_of;
    private javax.swing.JLabel lblAddSIMnumber;
    private javax.swing.JLabel lblAddSIMprice;
    private javax.swing.JLabel lblAddSIMtelecom;
    private javax.swing.JLabel lblAddSIMvnd;
    private javax.swing.JPanel pnlAddSIM;
    private javax.swing.JTextField txtAddSIMnumber;
    private javax.swing.JTextField txtAddSIMprice;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
