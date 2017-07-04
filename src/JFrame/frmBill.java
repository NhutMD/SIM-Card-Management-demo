package JFrame;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class frmBill extends javax.swing.JFrame {

    public frmBill() {
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
        this.getContentPane().setBackground(new java.awt.Color(250, 250, 210));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconfrm.png")));
        this.setTitle("QUẢN LÝ BÁN THẺ SIM ĐIỆN THOẠI DI ĐỘNG DEMO");
        pnlBilltop.setLayout(new GridBagLayout());
        pnl.setLayout(new FlowLayout());
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
        txtName.setText(null);
        txtNumber.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBilltop = new javax.swing.JPanel();
        lblimageBill = new javax.swing.JLabel();
        pnlBillbottom = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblPrint = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        pnl = new javax.swing.JPanel();
        lblinfoSim1 = new javax.swing.JLabel();
        lblinfoSim3 = new javax.swing.JLabel();
        lblinfoSim2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 40));
        setMinimumSize(new java.awt.Dimension(900, 610));
        setPreferredSize(new java.awt.Dimension(900, 610));
        setSize(new java.awt.Dimension(900, 610));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlBilltop.setBackground(new java.awt.Color(255, 191, 0));

        lblimageBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/check1.png"))); // NOI18N

        javax.swing.GroupLayout pnlBilltopLayout = new javax.swing.GroupLayout(pnlBilltop);
        pnlBilltop.setLayout(pnlBilltopLayout);
        pnlBilltopLayout.setHorizontalGroup(
            pnlBilltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBilltopLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(lblimageBill)
                .addGap(386, 386, 386))
        );
        pnlBilltopLayout.setVerticalGroup(
            pnlBilltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimageBill, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnlBillbottom.setBackground(new java.awt.Color(250, 250, 210));

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumberKeyReleased(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblName.setText("Tên Khách hàng");

        lblNumber.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblNumber.setText("Số CMND");

        lblPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/print1.png"))); // NOI18N
        lblPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrintMouseClicked(evt);
            }
        });

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        pnl.setBackground(new java.awt.Color(250, 250, 210));

        lblinfoSim1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        lblinfoSim3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        lblinfoSim2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblinfoSim1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblinfoSim2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblinfoSim3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblinfoSim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblinfoSim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblinfoSim3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBillbottomLayout = new javax.swing.GroupLayout(pnlBillbottom);
        pnlBillbottom.setLayout(pnlBillbottomLayout);
        pnlBillbottomLayout.setHorizontalGroup(
            pnlBillbottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBillbottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBillbottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBillbottomLayout.createSequentialGroup()
                        .addGroup(pnlBillbottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumber, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBillbottomLayout.createSequentialGroup()
                        .addComponent(lblExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrint)))
                .addContainerGap())
        );
        pnlBillbottomLayout.setVerticalGroup(
            pnlBillbottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBillbottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlBillbottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrint, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBillbottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBilltop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBilltop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBillbottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        onPause();
        onDestroy();
        frmSIMCard SIMCard = new frmSIMCard();
    }//GEN-LAST:event_lblExitMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblinfoSim1.setText("<html>\n"
                + "\n"
                + "<head>\n"
                + "    <meta charset=\"utf-8\">\n"
                + "    <style>\n"
                + "        #customers {\n"
                + "            font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n"
                + "            width: 100%;\n"
                + "        }\n"
                + "\n"
                + "    </style>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "    <hr><br>\n"
                + "    <table id=\"customers\" cellpadding=\"10\">\n"
                + "        <tr>\n"
                + "            <td>Số Sim:</td>\n"
                + "            <td align=\"right\">" + Objects.SIM.sim + "</td>\n"
                + "        </tr>\n"
                + "        <tr>\n"
                + "            <td>Gía Bán:</td>\n"
                + "            <td align=\"right\">" + Objects.SIM.price + " VND</td>\n"
                + "    </table>\n"
                + "    <br>\n"
                + "    <hr>\n"
                + "</body>\n"
                + "\n"
                + "</html>");
        lblinfoSim2.setText("<html>\n"
                + "\n"
                + "<head>\n"
                + "    <meta charset=\"utf-8\">\n"
                + "    <style>\n"
                + "        #customers {\n"
                + "            font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n"
                + "            width: 100%;\n"
                + "        }\n"
                + "\n"
                + "    </style>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "    <hr><br>\n"
                + "    <table id=\"customers\" cellpadding=\"10\">\n"
                + "            <td>Nhà Mạng:</td>\n"
                + "            <td align=\"right\">" + Objects.SIM.telecom + "</td>\n"
                + "        </tr>\n"
                + "        <tr>\n"
                + "            <td>Loại:</td>\n"
                + "            <td align=\"right\">" + Objects.SIM.kind_of + "</td>\n"
                + "        </tr>\n"
                + "    </table>\n"
                + "    <br>\n"
                + "    <hr>\n"
                + "</body>\n"
                + "\n"
                + "</html>");
        lblinfoSim3.setText("<html>\n"
                + "\n"
                + "<head>\n"
                + "    <meta charset=\"utf-8\">\n"
                + "    <style>\n"
                + "        #customers {\n"
                + "            font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n"
                + "            width: 100%;\n"
                + "        }\n"
                + "\n"
                + "    </style>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "    <hr><br>\n"
                + "    <table id=\"customers\" cellpadding=\"10\">\n"
                + "        <tr>\n"
                + "            <td>Ngày xuất:</td>\n"
                + "            <td align=\"right\">" + new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()) + "</td>\n"
                + "        </tr>\n"
                + "        <tr>\n"
                + "             <td></td>"
                + "        </tr>\n"
                + "    </table>\n"
                + "    <br><hr>\n"
                + "</body>\n"
                + "\n"
                + "</html>");
    }//GEN-LAST:event_formWindowOpened

    private void lblPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrintMouseClicked
        if (txtName.getText().trim().matches("") || txtNumber.getText().matches("")) {
            new JOptionPane().showMessageDialog(null, "CHƯA ĐIỀN ĐẦY ĐỦ THÔNG TIN", "", JOptionPane.ERROR_MESSAGE);
            resetText();
            return;
        }

        if (txtNumber.getText().length() != 9) {
            new JOptionPane().showMessageDialog(null, "SỐ CMND PHẢI LÀ 9 SỐ", "", JOptionPane.ERROR_MESSAGE);
            txtNumber.setText(null);
            return;
        }
        try {
//            String s = txtName.getText();
//            s.trim();
//            char[] s2 = new char[s.length()];
//            for (int i = 0; i < s.length(); i++) {
//                s2[i] = s.toCharArray()[i];
//            }
//            for (int i = 0; i < s.length(); i++) {
//                if (s.toCharArray()[i] <= 90 && s.toCharArray()[i] != 32) {
//                    s2[i] = (char) (s.toCharArray()[i] + 32);
//                }
//            }
//            if (s.toCharArray()[0] <= 90) {
//                s2[0] = (char) (s.toCharArray()[0] - 32);
//            }
//            for (int i = 1; i < s.length(); i++) {
//                if (s.toCharArray()[i] == 32) {
//                    s2[i + 1] = (char) (s.toCharArray()[i + 1] - 32);
//                }
//            }
//            s = "";
//            for (int i = 0; i < txtName.getText().length(); i++) {
//                s += s2[i];
//            }
//            txtName.setText(s);
            onPause();
            Objects.Customer.name = txtName.getText().trim();
            Objects.Customer.number = txtNumber.getText();
            onDestroy();
            frmPrint Print = new frmPrint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblPrintMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        onPause();
        onDestroy();
        frmSIMCard SIMCard = new frmSIMCard();
    }//GEN-LAST:event_formWindowClosing

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        boolean error_txt_name = false;
        String s = txtName.getText();
        try {
            for (int i = 0; i < s.length(); i++) {
                if ((s.toCharArray()[i] >= 33 && s.toCharArray()[i] <= 64) || (s.toCharArray()[i] >= 91 && s.toCharArray()[i] <= 96) || (s.toCharArray()[i] >= 123 && s.toCharArray()[i] <= 126)) {
                    new JOptionPane().showMessageDialog(this, "HỌ TÊN CHƯA ĐÚNG", "", JOptionPane.ERROR_MESSAGE);
                    error_txt_name = true;
                    resetText();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyReleased
        boolean error_txt_number = false;
        String s = txtNumber.getText();
        if (s.length() > 9) {
            new JOptionPane().showMessageDialog(this, "LỖI ĐỘ DÀI SỐ CMND", "", JOptionPane.ERROR_MESSAGE);
            txtNumber.setText(null);
            return;
        }
        try {
            for (int i = 0; i < s.length(); i++) {
                if (s.toCharArray()[0] == '0') {
                    new JOptionPane().showMessageDialog(this, "LỖI SỐ CMND KHI BẮT ĐẦU LÀ 0", "", JOptionPane.ERROR_MESSAGE);
                    txtNumber.setText(null);
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
                    default: {
                        new JOptionPane().showMessageDialog(this, "LỖI KHI NHẬP SỐ CMND", "", JOptionPane.ERROR_MESSAGE);
                        error_txt_number = true;
                        break;
                    }
                }
                if (error_txt_number) {
                    txtNumber.setText(null);
                    break;
                }
            }
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_txtNumberKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBill().setVisible(true);
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc=" Cac thanh phan cua form BILL ">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPrint;
    private javax.swing.JLabel lblimageBill;
    private javax.swing.JLabel lblinfoSim1;
    private javax.swing.JLabel lblinfoSim2;
    private javax.swing.JLabel lblinfoSim3;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlBillbottom;
    private javax.swing.JPanel pnlBilltop;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
