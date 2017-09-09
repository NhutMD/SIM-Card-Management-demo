package JFrame;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(250, 250, 210));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconfrm.png")));
        this.setLayout(new GridBagLayout());
        this.setMinimumSize(pnlLogin.getPreferredSize());
        this.setTitle("QUẢN LÝ BÁN THẺ SIM ĐIỆN THOẠI DI ĐỘNG DEMO");
        onRunning();
    }

    public void onRunning() {
        this.setEnabled(true);
        this.setVisible(true);
        txtUsername.setForeground(Color.LIGHT_GRAY);
        txtUsername.setText("root");
        txtPassword.requestFocus();
    }

    public void onPause() {
        this.setEnabled(false);
        this.setVisible(false);
    }

    public void onDestroy() {
        this.dispose();
        Notification.TrayIcon.onDestroy();
    }

    public void resetText() {
        txtUsername.setText(null);
        txtPassword.setText(null);
    }

    public void checkLogin() {
        boolean FlagLogin = false;
        try {
            java.sql.Statement s = Functions.Connected.getcon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM LOGIN");
            while (rs.next()) {
                if (txtUsername.getText().matches(rs.getString(1)) && new String(txtPassword.getPassword()).matches(rs.getString(2))) {
                    FlagLogin = !FlagLogin;
                    break;
                }
            }
            if (FlagLogin) {
                onPause();
                onDestroy();
                Objects.Account.name = txtUsername.getText();
                JFrame.frmSIMCard SIMCard = new JFrame.frmSIMCard();
            } else {
                UIManager UI = new UIManager();
                new JOptionPane().showMessageDialog(null, "TÊN ĐĂNG NHẬP HOẶC MẬT KHẨU CHƯA ĐÚNG", "", JOptionPane.ERROR_MESSAGE);
            }
            Functions.Connected.con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        resetText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblimageLogin = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý bán SIM điện thoại demo");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(400, 50));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 600));

        pnlLogin.setBackground(new java.awt.Color(250, 250, 210));
        pnlLogin.setMinimumSize(new java.awt.Dimension(600, 600));
        pnlLogin.setPreferredSize(new java.awt.Dimension(600, 600));

        lblimageLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/account_128.png"))); // NOI18N

        txtUsername.setBackground(new java.awt.Color(250, 250, 210));
        txtUsername.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        txtUsername.setBorder(null);
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(250, 250, 210));
        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(34, 139, 34));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Đăng Nhập");
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblUsername.setText("Tên Đăng Nhập");

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPassword.setText("Mật Khẩu");

        btnCancel.setBackground(new java.awt.Color(240, 0, 0));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Hủy Bỏ");
        btnCancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancel.setMaximumSize(new java.awt.Dimension(175, 44));
        btnCancel.setMinimumSize(new java.awt.Dimension(175, 44));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(lblimageLogin))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblimageLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblPassword)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        checkLogin();
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        System.exit(0);
        onDestroy();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        txtUsername.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkLogin();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLogin Login = new frmLogin();
            }
        });
    }

//<editor-fold defaultstate="collapsed" desc=" Cac thanh phan cua form LOIGN ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblimageLogin;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
 //</editor-fold>
}
