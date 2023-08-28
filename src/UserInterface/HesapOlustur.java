package UserInterface;

import ArayuzIslemleri.KayitOlEkranIslemleri;
import ArayuzIslemleri.RenkVeIconlar;
import Paneller.PanelKullaniciEkle;
import SQLIslemleri.SQLKullaniciIslemleri;
import UIKutuphaneSistemi.UIKayitOl;
import Varlık.Kullanici;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class HesapOlustur extends javax.swing.JFrame {

    RenkVeIconlar renkVeIconlar = new RenkVeIconlar();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    
     KayitOlEkranIslemleri kayitOlEkranIslemleri;
     PanelKullaniciEkle panelKullaniciEkle;
     UIKayitOl uIKayitOl;
     
    SQLKullaniciIslemleri sQLKullaniciIslemleri = new SQLKullaniciIslemleri(GirisEkrani.DB_kullanıcı);
    
    public Integer posX;
    public Integer posY;
    
    
    public HesapOlustur() {
        initComponents();
        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
        uIKayitOl = new UIKayitOl(jTextField_İsim, jTextField_Soyisim, jTextField_KullanıcıAdı, jTextField_Sifre, jTextField_Email, jTextField_Role, jButton_KayıtOl);
        panelKullaniciEkle = new PanelKullaniciEkle(uIKayitOl);
        kayitOlEkranIslemleri = new KayitOlEkranIslemleri(panelKullaniciEkle);
        
        jTextField_Role.setText("user");
        jTextField_Role.setEditable(false);
        jTextField_Role.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AnaPanel = new javax.swing.JPanel();
        jPanel_KayıtOlİkon = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_KayıtOlParametreleri = new javax.swing.JPanel();
        jPanel_Navigasyon = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel_Kullanıcıİkon = new javax.swing.JPanel();
        jLabel_UserSigin = new javax.swing.JLabel();
        jPanel_Kullanici = new javax.swing.JPanel();
        jTextField_İsim = new javax.swing.JTextField();
        jTextField_Soyisim = new javax.swing.JTextField();
        jTextField_KullanıcıAdı = new javax.swing.JTextField();
        jTextField_Sifre = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jButton_KayıtOl = new javax.swing.JButton();
        jLabel_HesabınızVarsa = new javax.swing.JLabel();
        jLabel_GirişYap = new javax.swing.JLabel();
        jTextField_Role = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel_AnaPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_AnaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_AnaPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_AnaPanelMouseDragged(evt);
            }
        });
        jPanel_AnaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_AnaPanelMousePressed(evt);
            }
        });
        jPanel_AnaPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel_AnaPanelKeyPressed(evt);
            }
        });

        jPanel_KayıtOlİkon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kayitol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_KayıtOlİkonLayout = new javax.swing.GroupLayout(jPanel_KayıtOlİkon);
        jPanel_KayıtOlİkon.setLayout(jPanel_KayıtOlİkonLayout);
        jPanel_KayıtOlİkonLayout.setHorizontalGroup(
            jPanel_KayıtOlİkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_KayıtOlİkonLayout.setVerticalGroup(
            jPanel_KayıtOlİkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_KayıtOlParametreleri.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Navigasyon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseExited(evt);
            }
        });

        jLabel_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/move.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel_NavigasyonLayout = new javax.swing.GroupLayout(jPanel_Navigasyon);
        jPanel_Navigasyon.setLayout(jPanel_NavigasyonLayout);
        jPanel_NavigasyonLayout.setHorizontalGroup(
            jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NavigasyonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Minimize)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Close)
                .addGap(17, 17, 17))
        );
        jPanel_NavigasyonLayout.setVerticalGroup(
            jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NavigasyonLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Minimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jPanel_Kullanıcıİkon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_UserSigin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_UserSigin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kayitOlIkon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_KullanıcıİkonLayout = new javax.swing.GroupLayout(jPanel_Kullanıcıİkon);
        jPanel_Kullanıcıİkon.setLayout(jPanel_KullanıcıİkonLayout);
        jPanel_KullanıcıİkonLayout.setHorizontalGroup(
            jPanel_KullanıcıİkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KullanıcıİkonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_UserSigin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_KullanıcıİkonLayout.setVerticalGroup(
            jPanel_KullanıcıİkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KullanıcıİkonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_UserSigin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_Kullanici.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_İsim.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_İsim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Isim", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        jTextField_Soyisim.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Soyisim.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Soyisim", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        jTextField_KullanıcıAdı.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_KullanıcıAdı.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kullanıcı Adı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        jTextField_Sifre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sifre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        jTextField_Email.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        jButton_KayıtOl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        jButton_KayıtOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KayıtOlActionPerformed(evt);
            }
        });

        jLabel_HesabınızVarsa.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_HesabınızVarsa.setText("Hesabınız Varsa");

        jLabel_GirişYap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_GirişYap.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_GirişYap.setText("Giriş Yap");
        jLabel_GirişYap.setName(""); // NOI18N
        jLabel_GirişYap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_GirişYapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_GirişYapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_GirişYapMouseExited(evt);
            }
        });

        jTextField_Role.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField_Role.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Role", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        javax.swing.GroupLayout jPanel_KullaniciLayout = new javax.swing.GroupLayout(jPanel_Kullanici);
        jPanel_Kullanici.setLayout(jPanel_KullaniciLayout);
        jPanel_KullaniciLayout.setHorizontalGroup(
            jPanel_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KullaniciLayout.createSequentialGroup()
                .addGroup(jPanel_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addComponent(jTextField_Role, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_KullaniciLayout.createSequentialGroup()
                            .addComponent(jLabel_HesabınızVarsa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_GirişYap))
                        .addGroup(jPanel_KullaniciLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jButton_KayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField_Sifre, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_KullanıcıAdı, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_Soyisim, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_İsim, javax.swing.GroupLayout.Alignment.CENTER))
                .addContainerGap())
        );
        jPanel_KullaniciLayout.setVerticalGroup(
            jPanel_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KullaniciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_İsim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField_Soyisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField_KullanıcıAdı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jTextField_Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_KayıtOl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_HesabınızVarsa)
                    .addComponent(jLabel_GirişYap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_KayıtOlParametreleriLayout = new javax.swing.GroupLayout(jPanel_KayıtOlParametreleri);
        jPanel_KayıtOlParametreleri.setLayout(jPanel_KayıtOlParametreleriLayout);
        jPanel_KayıtOlParametreleriLayout.setHorizontalGroup(
            jPanel_KayıtOlParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Navigasyon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Kullanıcıİkon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Kullanici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_KayıtOlParametreleriLayout.setVerticalGroup(
            jPanel_KayıtOlParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KayıtOlParametreleriLayout.createSequentialGroup()
                .addComponent(jPanel_Navigasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Kullanıcıİkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Kullanici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_AnaPanelLayout = new javax.swing.GroupLayout(jPanel_AnaPanel);
        jPanel_AnaPanel.setLayout(jPanel_AnaPanelLayout);
        jPanel_AnaPanelLayout.setHorizontalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaPanelLayout.createSequentialGroup()
                .addComponent(jPanel_KayıtOlİkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_KayıtOlParametreleri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel_AnaPanelLayout.setVerticalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_KayıtOlParametreleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_KayıtOlİkon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_KayıtOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KayıtOlActionPerformed

            boolean sonuc = false;
        
        try {
           Kullanici kullanici = kayitOlEkranIslemleri.getPanelKullaniciEkle().getuIKayitOl().kullaniciTanimla();
          
            sonuc = sQLKullaniciIslemleri.kullaniciOlustur(kullanici);
           
           if(!sonuc){
                throw  new Exception("Kullanici Olusturulamadi");
            }else{
                JOptionPane.showMessageDialog(this, "Kullanıcı Kaydı Başarıyla Tamamlandı");
                this.setVisible(false);
                GirisEkrani girisEkrani = new GirisEkrani();
                girisEkrani.setVisible(true);
            }
            

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jButton_KayıtOlActionPerformed

    private void jLabel_GirişYapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GirişYapMouseEntered
        jLabel_GirişYap.setForeground(Color.BLACK);
        jLabel_GirişYap.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel_GirişYapMouseEntered

    private void jLabel_GirişYapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GirişYapMouseExited
        jLabel_GirişYap.setForeground(renkVeIconlar.getKirmizi());
    }//GEN-LAST:event_jLabel_GirişYapMouseExited

    private void jLabel_GirişYapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GirişYapMouseClicked
       
         this.setVisible(false);
         GirisEkrani girisEkrani = new GirisEkrani();
         girisEkrani.setVisible(true);
    }//GEN-LAST:event_jLabel_GirişYapMouseClicked

    private void jLabel_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseEntered
        jLabel_Close.setIcon(renkVeIconlar.getCancel2());
    }//GEN-LAST:event_jLabel_CloseMouseEntered

    private void jLabel_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseExited
        jLabel_Close.setIcon(renkVeIconlar.getCancel());
    }//GEN-LAST:event_jLabel_CloseMouseExited

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseEntered
        jLabel_Minimize.setIcon(renkVeIconlar.getMinimize2());
    }//GEN-LAST:event_jLabel_MinimizeMouseEntered

    private void jLabel_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseExited
         jLabel_Minimize.setIcon(renkVeIconlar.getMinimize());
    }//GEN-LAST:event_jLabel_MinimizeMouseExited

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
         this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jPanel_AnaPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel_AnaPanelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel_AnaPanelKeyPressed

    private void jPanel_AnaPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AnaPanelMousePressed
         posX = evt.getX();
         posY = evt.getY();
    }//GEN-LAST:event_jPanel_AnaPanelMousePressed

    private void jPanel_AnaPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AnaPanelMouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jPanel_AnaPanelMouseDragged

 
    public static void main(String args[]) {

       try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapOlustur().setVisible(true);
            }
        });
    } catch (UnsupportedLookAndFeelException ex) {
        Logger.getLogger(HesapOlustur.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_KayıtOl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_GirişYap;
    private javax.swing.JLabel jLabel_HesabınızVarsa;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JLabel jLabel_UserSigin;
    private javax.swing.JPanel jPanel_AnaPanel;
    private javax.swing.JPanel jPanel_KayıtOlParametreleri;
    private javax.swing.JPanel jPanel_KayıtOlİkon;
    private javax.swing.JPanel jPanel_Kullanici;
    private javax.swing.JPanel jPanel_Kullanıcıİkon;
    private javax.swing.JPanel jPanel_Navigasyon;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_KullanıcıAdı;
    private javax.swing.JTextField jTextField_Role;
    private javax.swing.JTextField jTextField_Sifre;
    private javax.swing.JTextField jTextField_Soyisim;
    private javax.swing.JTextField jTextField_İsim;
    // End of variables declaration//GEN-END:variables
}
