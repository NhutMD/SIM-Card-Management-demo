package JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class frmPrint extends javax.swing.JFrame {

    private int codeno;

    public frmPrint() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconfrm.png")));
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
        Notification.TrayIcon.onDestroy();
    }

    public void Delete() {
        try {
            java.sql.Statement s = Functions.Connected.getcon().createStatement();
            s.execute("Delete FROM SIMCARD WHERE SIMNO='" + Objects.SIM.sim + "'");
            Functions.Connected.con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void Insert() {
        try {
            java.sql.Statement s = Functions.Connected.getcon().createStatement();
            try {
                s.execute("INSERT INTO BILL VALUES ('" + String.valueOf(codeno) + "', '" + new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()).toString() + "')");
                Delete();
            } catch (Exception ex) {
                new JOptionPane().showMessageDialog(this, "LƯU LỊCH SỬ GIAO DỊCH THẤT BẠI", "", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
            Functions.Connected.con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimagePrint = new javax.swing.JLabel();
        lblimageCancel = new javax.swing.JLabel();
        pnl = new javax.swing.JPanel();
        lblPrint = new javax.swing.JLabel();
        lbl_right = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(300, 32));
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblimagePrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/print1.png"))); // NOI18N
        lblimagePrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimagePrintMouseClicked(evt);
            }
        });

        lblimageCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        lblimageCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimageCancelMouseClicked(evt);
            }
        });

        pnl.setBackground(new java.awt.Color(255, 255, 255));
        pnl.setLayout(new java.awt.GridLayout(1, 0));

        lblPrint.setBackground(new java.awt.Color(255, 255, 255));
        lblPrint.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pnl.add(lblPrint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblimageCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_right, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblimagePrint)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 661, Short.MAX_VALUE)
                        .addComponent(lblimageCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_right)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblimagePrint)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblimageCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimageCancelMouseClicked
        onPause();
        onDestroy();
        frmSIMCard SIMCard = new frmSIMCard();
    }//GEN-LAST:event_lblimageCancelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            java.sql.Statement s = Functions.Connected.getcon().createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(CodeNo) FROM BILL");
            while (rs.next()) {
                codeno = rs.getInt(1) + 1;
            }
            Functions.Connected.con.close();
        } catch (Exception e) {
            codeno = 1;
        }
        lblPrint.setHorizontalTextPosition(SwingConstants.CENTER);
        lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
        lblPrint.setText("<html>\n"
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
                + "    <h2 align=\"center\"><font face=\"Trebuchet MS\">BIÊN NHẬN THANH TOÁN</h2>\n"
                + "    <br><hr><br>\n"
                + "    <table id=\"customers\" cellpadding=\"10\">\n"
                + "        <tr>\n"
                + "            <td>Khách hàng:</td>\n"
                + "            <td align=\"right\">" + Objects.Customer.name + "</td>\n"
                + "        </tr>\n"
                + "        <tr>\n"
                + "            <td>CMND:</td>\n"
                + "            <td align=\"right\">" + Objects.Customer.number + "</td>\n"
                + "        </tr>\n"
                + "    </table>\n"
                + "    <br>\n"
                + "    <hr><br>\n"
                + "    <table id=\"customers\" cellpadding=\"10\">\n"
                + "        <tr>\n"
                + "            <td>Số sim:</td>\n"
                + "            <td align=\"right\">" + Objects.SIM.sim + "</td>\n"
                + "        </tr>\n"
                + "        <tr>\n"
                + "            <td>Nhà mạng:</td>\n"
                + "            <td align=\"right\">" + Objects.SIM.telecom + "</td>\n"
                + "        </tr>\n"
                + "        <tr>\n"
                + "            <td>Số tiền thanh toán:</td>\n"
                + "            <td align=\"right\">" + Objects.SIM.price + " VND</td>\n"
                + "        </tr>\n"
                + "    </table>\n"
                + "    <br>\n"
                + "    <hr><br>\n"
                + "    <table id=\"customers\" cellpadding=\"10\">\n"
                + "        <tr>\n"
                + "            <td>Số hóa đơn:</td>\n"
                + "            <td align=\"right\">" + codeno + "</td>\n"
                + "        </tr>\n"
                + "        <tr>\n"
                + "            <td>Ngày xuất:</td>\n"
                + "            <td align=\"right\">" + new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()) + "</td>\n"
                + "        </tr>\n"
                + "    </table>\n"
                + "    <br>\n"
                + "    <hr>\n"
                + "    <h4 align=\"center\"><font face=\"Trebuchet MS\"><i>CẢM ƠN QUÝ KHÁCH</i></h4>\n"
                + "</body>\n"
                + "\n"
                + "</html>");
        this.setMinimumSize(new Dimension(this.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formWindowOpened

    private void lblimagePrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimagePrintMouseClicked
        try {
            if (!Objects.SIM.Empty()) {
                Toolkit tkl = lblPrint.getToolkit();
                PrintJob pjl = tkl.getPrintJob(this, null, null);
                Graphics g = pjl.getGraphics();
                //g.translate(lblPrint.getWidth() / 2 / 2 / 2 / 2 / 2 / 2 / 2, 0);
                lblPrint.print(g);
                g.dispose();
                pjl.end();
                new JOptionPane().showMessageDialog(null, "XUẤT HÓA ĐƠN THÀNH CÔNG!");
                Insert();
                Notification.TrayIcon.displayTray(Objects.SIM.sim, Objects.Customer.name);
                Objects.Customer.Make_null();
                Objects.SIM.Make_null();
            } else {
                new JOptionPane().showMessageDialog(null, "KHÔNG THỂ XUẤT HÓA ĐƠN\nHỦY GIAO DỊCH", "", JOptionPane.ERROR_MESSAGE);
                onPause();
                onDestroy();
                frmSIMCard SIMCard = new frmSIMCard();
            }
        } catch (Exception e) {
            new JOptionPane().showMessageDialog(null, "KHÔNG THỂ XUẤT HÓA ĐƠN\nHỦY GIAO DỊCH", "", JOptionPane.ERROR_MESSAGE);
            onPause();
            onDestroy();
            frmSIMCard SIMCard = new frmSIMCard();
        }
    }//GEN-LAST:event_lblimagePrintMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        onPause();
        onDestroy();
        frmSIMCard SIMCard = new frmSIMCard();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrint().setVisible(true);
            }
        });
    }

//<editor-fold defaultstate="collapsed" desc=" Cac thanh phan cua form PRINT ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblPrint;
    private javax.swing.JLabel lbl_right;
    private javax.swing.JLabel lblimageCancel;
    private javax.swing.JLabel lblimagePrint;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
