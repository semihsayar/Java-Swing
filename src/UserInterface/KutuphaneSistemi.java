package UserInterface;

import ArayuzIslemleri.KutuphaneEkranIslemleri;
import Paneller.PanelAdmin;
import Paneller.PanelKitap;
import Paneller.PanelKitapEkle;
import Paneller.PanelOkur;
import SQLIslemleri.SQLKullaniciIslemleri;
import UIKutuphaneSistemi.UIKutuphaneSistemi;
import Varlık.Admin;
import Varlık.Kitap;
import Varlık.Kullanici;
import Varlık.Okur;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class KutuphaneSistemi extends javax.swing.JFrame {
    
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    Admin admin;
    Okur okur;
    
    //Sonradan Başka bir Class Üzerinden getirilecek
    
    KutuphaneEkranIslemleri kutuphaneEkranIslemleri;
    PanelAdmin panelAdmin;
    PanelKitap panelKitap;
    PanelKitapEkle panelKitapEkle;
    PanelOkur panelOkur;
    UIKutuphaneSistemi uIKutuphaneSistemi;
    
    SQLKullaniciIslemleri sQLKullaniciIslemleri = new SQLKullaniciIslemleri(GirisEkrani.DB_kullanıcı);
    
    public KutuphaneSistemi() {
        initComponents();
        //initComponents_New();      
    }
    
    public KutuphaneSistemi(Kullanici kullanici) {
        initComponents();
        initComponents_New(kullanici);
        
        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);

         if(kullanici.getRole().equals("admin")){
             
             admin = (Admin) kullanici;         
             
        }else if(kullanici.getRole().equals("user")){
            
             okur = (Okur) kullanici;
             
        }else{
            kullanici = null;
        }
         

    }
    
    
    public void initComponents_New(Kullanici kullanici){
            uIKutuphaneSistemi = new UIKutuphaneSistemi(jTextField_YazarAdi, jTextField_KitapAdi, jTextField_YayinYeri, jTextField_SayfaSayisi, jTextField_BaskiSayisi, jButton_KitapEkle, jButton_Yenile, jComboBox_Kategori, jPanel_DosyaOku);
            panelAdmin = new PanelAdmin(jToggleButton_Admin,jPanel_Admin);
            panelKitap = new PanelKitap(jToggleButton_Kitap,jPanel_Kitap);
            panelKitapEkle = new PanelKitapEkle(uIKutuphaneSistemi,jToggleButton_KitapEkle,jPanel_KitapEkle);
            panelOkur = new PanelOkur(jToggleButton_Okur,jPanel_Okur);
             
            kutuphaneEkranIslemleri = new KutuphaneEkranIslemleri(panelAdmin, panelKitap, panelKitapEkle, panelOkur,kullanici);
            kutuphaneEkranIslemleri.initComponent_UI();
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AnaPanel = new javax.swing.JPanel();
        jPanel_Header1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_MenuBar = new javax.swing.JPanel();
        jToggleButton_Admin = new javax.swing.JToggleButton();
        jToggleButton_Okur = new javax.swing.JToggleButton();
        jToggleButton_Kitap = new javax.swing.JToggleButton();
        jToggleButton_KitapEkle = new javax.swing.JToggleButton();
        jPanel_Header2 = new javax.swing.JPanel();
        jPanel_Footer = new javax.swing.JPanel();
        jPanel_CardBody = new javax.swing.JPanel();
        jPanel_Admin = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel_Okur = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_Kitap = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jPanel_KitapEkle = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_YazarAdi = new javax.swing.JTextField();
        jTextField_KitapAdi = new javax.swing.JTextField();
        jTextField_YayinYeri = new javax.swing.JTextField();
        jTextField_SayfaSayisi = new javax.swing.JTextField();
        jTextField_BaskiSayisi = new javax.swing.JTextField();
        jButton_Yenile = new javax.swing.JButton();
        jButton_KitapEkle = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox_Kategori = new javax.swing.JComboBox<>();
        jPanel_DosyaOku = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Header1.setBackground(new java.awt.Color(75, 0, 130));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kütüphane Sistemi");

        javax.swing.GroupLayout jPanel_Header1Layout = new javax.swing.GroupLayout(jPanel_Header1);
        jPanel_Header1.setLayout(jPanel_Header1Layout);
        jPanel_Header1Layout.setHorizontalGroup(
            jPanel_Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Header1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_Header1Layout.setVerticalGroup(
            jPanel_Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Header1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel_MenuBar.setBackground(new java.awt.Color(188, 189, 220));

        jToggleButton_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N
        jToggleButton_Admin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton_AdminİtemStateChanged(evt);
            }
        });
        jToggleButton_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_AdminActionPerformed(evt);
            }
        });

        jToggleButton_Okur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userList.png"))); // NOI18N
        jToggleButton_Okur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton_OkurİtemStateChanged(evt);
            }
        });
        jToggleButton_Okur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_OkurActionPerformed(evt);
            }
        });

        jToggleButton_Kitap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        jToggleButton_Kitap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton_KitapİtemStateChanged(evt);
            }
        });
        jToggleButton_Kitap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_KitapActionPerformed(evt);
            }
        });

        jToggleButton_KitapEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bookAdd.png"))); // NOI18N
        jToggleButton_KitapEkle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton_KitapEkle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButton_KitapEkleİtemStateChanged(evt);
            }
        });
        jToggleButton_KitapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_KitapEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MenuBarLayout = new javax.swing.GroupLayout(jPanel_MenuBar);
        jPanel_MenuBar.setLayout(jPanel_MenuBarLayout);
        jPanel_MenuBarLayout.setHorizontalGroup(
            jPanel_MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel_MenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton_Okur, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton_KitapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton_Kitap, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel_MenuBarLayout.setVerticalGroup(
            jPanel_MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuBarLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jToggleButton_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton_Okur, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton_Kitap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton_KitapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Header2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel_Header2Layout = new javax.swing.GroupLayout(jPanel_Header2);
        jPanel_Header2.setLayout(jPanel_Header2Layout);
        jPanel_Header2Layout.setHorizontalGroup(
            jPanel_Header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_Header2Layout.setVerticalGroup(
            jPanel_Header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel_Footer.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel_FooterLayout = new javax.swing.GroupLayout(jPanel_Footer);
        jPanel_Footer.setLayout(jPanel_FooterLayout);
        jPanel_FooterLayout.setHorizontalGroup(
            jPanel_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_FooterLayout.setVerticalGroup(
            jPanel_FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel_CardBody.setBackground(new java.awt.Color(218, 218, 235));
        jPanel_CardBody.setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "İsim", "Soy İsim", "Kullanıcı Adı", "Email", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("KULLANICI LİSTESİ");

        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kullanıcı Ara", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_AdminLayout = new javax.swing.GroupLayout(jPanel_Admin);
        jPanel_Admin.setLayout(jPanel_AdminLayout);
        jPanel_AdminLayout.setHorizontalGroup(
            jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_AdminLayout.setVerticalGroup(
            jPanel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_CardBody.add(jPanel_Admin, "card2");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("OKUR");

        javax.swing.GroupLayout jPanel_OkurLayout = new javax.swing.GroupLayout(jPanel_Okur);
        jPanel_Okur.setLayout(jPanel_OkurLayout);
        jPanel_OkurLayout.setHorizontalGroup(
            jPanel_OkurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OkurLayout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel_OkurLayout.setVerticalGroup(
            jPanel_OkurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OkurLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jPanel_CardBody.add(jPanel_Okur, "card3");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kitap Listesi");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Yazar Adı", "Kitap Adı", "Yayın Yeri", "Sayfa Sayısı", "Kategori", "Baskı Sayısı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setBackground(new java.awt.Color(242, 242, 242));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kitap Ara", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_KitapLayout = new javax.swing.GroupLayout(jPanel_Kitap);
        jPanel_Kitap.setLayout(jPanel_KitapLayout);
        jPanel_KitapLayout.setHorizontalGroup(
            jPanel_KitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_KitapLayout.setVerticalGroup(
            jPanel_KitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel_CardBody.add(jPanel_Kitap, "card4");

        jPanel8.setBackground(new java.awt.Color(218, 218, 235));

        jPanel2.setBackground(new java.awt.Color(239, 237, 245));

        jTextField_YazarAdi.setBackground(new java.awt.Color(239, 237, 245));
        jTextField_YazarAdi.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField_YazarAdi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Yazar Adı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 20))); // NOI18N

        jTextField_KitapAdi.setBackground(new java.awt.Color(239, 237, 245));
        jTextField_KitapAdi.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField_KitapAdi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kitap Adı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 20))); // NOI18N

        jTextField_YayinYeri.setBackground(new java.awt.Color(239, 237, 245));
        jTextField_YayinYeri.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField_YayinYeri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Yayın Yeri", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 20))); // NOI18N

        jTextField_SayfaSayisi.setBackground(new java.awt.Color(239, 237, 245));
        jTextField_SayfaSayisi.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField_SayfaSayisi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sayfa Sayısı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 20))); // NOI18N

        jTextField_BaskiSayisi.setBackground(new java.awt.Color(239, 237, 245));
        jTextField_BaskiSayisi.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField_BaskiSayisi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Baskı Sayısı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 20))); // NOI18N

        jButton_Yenile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N

        jButton_KitapEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kitapEkle.png"))); // NOI18N
        jButton_KitapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KitapEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_Yenile, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_KitapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addComponent(jTextField_BaskiSayisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jTextField_SayfaSayisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jTextField_YayinYeri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jTextField_KitapAdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jTextField_YazarAdi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextField_YazarAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_KitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_YayinYeri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_SayfaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_BaskiSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Yenile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_KitapEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(218, 218, 235));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kategori", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 20))); // NOI18N

        jComboBox_Kategori.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboBox_Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Roman", "Dram", "Korku" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBox_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel_DosyaOku.setBackground(new java.awt.Color(255, 204, 204));
        jPanel_DosyaOku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/upload.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_DosyaOkuLayout = new javax.swing.GroupLayout(jPanel_DosyaOku);
        jPanel_DosyaOku.setLayout(jPanel_DosyaOkuLayout);
        jPanel_DosyaOkuLayout.setHorizontalGroup(
            jPanel_DosyaOkuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel_DosyaOkuLayout.setVerticalGroup(
            jPanel_DosyaOkuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel_DosyaOku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(jPanel_DosyaOku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(111, 111, 111))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_KitapEkleLayout = new javax.swing.GroupLayout(jPanel_KitapEkle);
        jPanel_KitapEkle.setLayout(jPanel_KitapEkleLayout);
        jPanel_KitapEkleLayout.setHorizontalGroup(
            jPanel_KitapEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KitapEkleLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_KitapEkleLayout.setVerticalGroup(
            jPanel_KitapEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_CardBody.add(jPanel_KitapEkle, "card5");

        javax.swing.GroupLayout jPanel_AnaPanelLayout = new javax.swing.GroupLayout(jPanel_AnaPanel);
        jPanel_AnaPanel.setLayout(jPanel_AnaPanelLayout);
        jPanel_AnaPanelLayout.setHorizontalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaPanelLayout.createSequentialGroup()
                .addComponent(jPanel_MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Footer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_CardBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel_Header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_AnaPanelLayout.setVerticalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaPanelLayout.createSequentialGroup()
                .addComponent(jPanel_Header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_MenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_AnaPanelLayout.createSequentialGroup()
                        .addComponent(jPanel_Header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel_CardBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel_Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void jToggleButton_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton_AdminActionPerformed

    private void jToggleButton_KitapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_KitapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton_KitapActionPerformed

    private void jToggleButton_OkurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_OkurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton_OkurActionPerformed

    private void jToggleButton_KitapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_KitapEkleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton_KitapEkleActionPerformed

    private void jButton_KitapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KitapEkleActionPerformed
      
         boolean sonuc = false;
         
        try {
            Kitap kitap =  kutuphaneEkranIslemleri.getPanelKitapEkle().getuIKutuphaneSistemi().kitapTanimla();
            sonuc = sQLKullaniciIslemleri.kitapOlustur(kitap);
            JOptionPane.showMessageDialog(this, "KİTAP EKLEME BAŞARILI");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_jButton_KitapEkleActionPerformed

    private void jToggleButton_AdminİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton_AdminİtemStateChanged
       kutuphaneEkranIslemleri.btnItemStateChanged(jToggleButton_Admin);
    }//GEN-LAST:event_jToggleButton_AdminİtemStateChanged

    private void jToggleButton_OkurİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton_OkurİtemStateChanged
       kutuphaneEkranIslemleri.btnItemStateChanged(jToggleButton_Okur);
    }//GEN-LAST:event_jToggleButton_OkurİtemStateChanged

    private void jToggleButton_KitapİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton_KitapİtemStateChanged
        kutuphaneEkranIslemleri.btnItemStateChanged(jToggleButton_Kitap);
    }//GEN-LAST:event_jToggleButton_KitapİtemStateChanged

    private void jToggleButton_KitapEkleİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButton_KitapEkleİtemStateChanged
       kutuphaneEkranIslemleri.btnItemStateChanged(jToggleButton_KitapEkle);
    }//GEN-LAST:event_jToggleButton_KitapEkleİtemStateChanged


    public static void main(String args[]) {
      
          try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KutuphaneSistemi().setVisible(true);
            }
        });
    } catch (UnsupportedLookAndFeelException ex) {
        Logger.getLogger(KutuphaneSistemi.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_KitapEkle;
    private javax.swing.JButton jButton_Yenile;
    private javax.swing.JComboBox<String> jComboBox_Kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_Admin;
    private javax.swing.JPanel jPanel_AnaPanel;
    private javax.swing.JPanel jPanel_CardBody;
    private javax.swing.JPanel jPanel_DosyaOku;
    private javax.swing.JPanel jPanel_Footer;
    private javax.swing.JPanel jPanel_Header1;
    private javax.swing.JPanel jPanel_Header2;
    private javax.swing.JPanel jPanel_Kitap;
    private javax.swing.JPanel jPanel_KitapEkle;
    private javax.swing.JPanel jPanel_MenuBar;
    private javax.swing.JPanel jPanel_Okur;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField_BaskiSayisi;
    private javax.swing.JTextField jTextField_KitapAdi;
    private javax.swing.JTextField jTextField_SayfaSayisi;
    private javax.swing.JTextField jTextField_YayinYeri;
    private javax.swing.JTextField jTextField_YazarAdi;
    private javax.swing.JToggleButton jToggleButton_Admin;
    private javax.swing.JToggleButton jToggleButton_Kitap;
    private javax.swing.JToggleButton jToggleButton_KitapEkle;
    private javax.swing.JToggleButton jToggleButton_Okur;
    // End of variables declaration//GEN-END:variables
}
