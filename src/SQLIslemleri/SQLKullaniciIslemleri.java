package SQLIslemleri;

import Varlık.Admin;
import Varlık.Kullanici;
import MailConfig.MailIslemleri;
import Varlık.Kitap;
import Varlık.Okur;
import java.sql.SQLException;
import javax.mail.MessagingException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLKullaniciIslemleri extends SQLBaglanti {
    
 
   // SQL - kullanici Tablosu
    private final String KULLANICI_ADI_SIFRESI = "SELECT * FROM kullanici WHERE kullaniciAdi=? AND kullaniciSifre=?";
    
    private final String KULLANICI_ADI = "SELECT * FROM kullanici WHERE kullaniciAdi=?";
    
    private final String KULLANICI_YENI = "INSERT INTO kullanici VALUES(NULL,?,?,?,?,?,?)";
   
    // SQL - admin Tablosu
    
    private final String ADMIN_ID = "SELECT * FROM admin WHERE id=?";
    
    // SQL - okur Tablosu
    
    private final String OKUR_ID = "SELECT * FROM okur WHERE id=?";
    private final String OKUR_YENI = "INSERT INTO okur VALUES(?,-100,-100)";
    
    
    // SQL - Kitap Tablosu
    
   private final String KITAP_YENI = "INSERT INTO KİTAP VALUES(NULL,?,?,?,?,?,?)";
    
    // Classlar
    
    private MailIslemleri mail;

    // Constructor

    public SQLKullaniciIslemleri(MailIslemleri mail, String DBIsmi) {
        super(DBIsmi);
        this.mail = mail;
    }
    
     public SQLKullaniciIslemleri(String DBIsmi) {
        super(DBIsmi);
    }
     
    public boolean kitapOlustur(Kitap kitap){
        
        boolean kitapOlusturulduMu = false;
        int yeniKitapiId;
        
        try {
            baglanti.setAutoCommit(false);
            komuttamamlayici = baglanti.prepareStatement(KITAP_YENI);
            komuttamamlayici.setString(1, kitap.getYazarAdi());
            komuttamamlayici.setString(2, kitap.getKitapAdi());
            komuttamamlayici.setString(3, kitap.getYayinYeri());
            komuttamamlayici.setString(4, kitap.getSayfaSayisi());
            komuttamamlayici.setString(5, kitap.getKategori());
            komuttamamlayici.setString(6, kitap.getBaskiSayisi());
            komuttamamlayici.executeUpdate();
            
            baglanti.commit();
            kitapOlusturulduMu = true;
            
        } catch (SQLException ex) {
            try {
                baglanti.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(SQLKullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return kitapOlusturulduMu;
        
    }
    
     public boolean kullaniciOlustur(Kullanici kullanici){
        
        boolean kullaniciOlusturulduMu = false;
        int yeniKullaniciId;
        
        try {
            baglanti.setAutoCommit(false);
            komuttamamlayici = baglanti.prepareStatement(KULLANICI_YENI);
            komuttamamlayici.setString(1, kullanici.getIsim());
            komuttamamlayici.setString(2, kullanici.getSoyIsim());
            komuttamamlayici.setString(3, kullanici.getKullaniciAdi());
            komuttamamlayici.setString(4, kullanici.getKullaniciSifre());
            komuttamamlayici.setString(5, kullanici.getEMail());
            komuttamamlayici.setString(6, kullanici.getRole());
            komuttamamlayici.executeUpdate();
            
            baglanti.commit();
            
            yeniKullaniciId = yeniKullaniciId(kullanici);
            KullaniciEkBilgileriOlustur(kullanici,yeniKullaniciId);
            
            kullaniciOlusturulduMu = true;
            
        } catch (SQLException ex) {
            try {
                baglanti.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(SQLKullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex1);
                System.out.println(ex1);
            }
        }
        
        return kullaniciOlusturulduMu;
        
    }
    
     
      protected int  yeniKullaniciId(Kullanici kullanici) throws SQLException{
        
        int id = -100;
        komuttamamlayici = baglanti.prepareStatement(KULLANICI_ADI);
        komuttamamlayici.setString(1, kullanici.getKullaniciAdi());
        
        ResultSet sonuc = komuttamamlayici.executeQuery();
        
        while(sonuc.next()){
            
            id = sonuc.getInt("id");
        }
        
        return id;
    }
    
    protected void KullaniciEkBilgileriOlustur(Kullanici kullanici, int id){
        
        try {
            baglanti.setAutoCommit(false);
            
            if(kullanici.getRole().equals("user")){
                                
                komuttamamlayici = baglanti.prepareStatement(OKUR_YENI);
                komuttamamlayici.setInt(1, id);
                komuttamamlayici.executeUpdate();
                baglanti.commit();
                
            }else{
                
            }
            
            
            
        } catch (SQLException ex) {
            try {
                baglanti.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(SQLKullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
  
    
    public Kullanici kullaniciBul(String girilenKullaniciAdi) throws SQLException{
        Kullanici kullanici = null;
        
        komuttamamlayici = baglanti.prepareStatement(KULLANICI_ADI);
        komuttamamlayici.setString(1, girilenKullaniciAdi);
        
        ResultSet sonuc = komuttamamlayici.executeQuery();
        
        while(sonuc.next()){
            
            kullanici = new Kullanici(
            
                     sonuc.getInt("id"),
                     sonuc.getString("isim"),
                     sonuc.getString("soyIsim"),                            
                     sonuc.getString("kullaniciAdi"),
                     sonuc.getString("kullaniciSifre"),
                     sonuc.getString("EMail"),
                     sonuc.getString("role")
                    
            );
        }

        return kullanici;
        
    }
    
    public Kullanici kullaniciBul(String girilenKullaniciAdi, String girilenKullaniciSifre) throws SQLException{
        Kullanici kullanici = null;
        String role = "";
        
        komuttamamlayici = baglanti.prepareStatement(KULLANICI_ADI_SIFRESI);
        komuttamamlayici.setString(1, girilenKullaniciAdi);
        komuttamamlayici.setString(2, girilenKullaniciSifre);
        
        ResultSet sonuc = komuttamamlayici.executeQuery();
        
        while(sonuc.next()){
            
            role = sonuc.getString("role");
            
            switch (role) {
                case "admin":
                    kullanici = ekBilgileriBul(ADMIN_ID,sonuc);
                    break;
                case "user":
                    kullanici = ekBilgileriBul(OKUR_ID, sonuc);
                    break;
                default:
                    kullanici = null;
                    break;
            }
        }
        return kullanici;
    }
    
    protected Kullanici ekBilgileriBul(String SQL, ResultSet sonuc) throws SQLException{
        Kullanici kullanici = null;
        
        int id = sonuc.getInt("id");
        String role = sonuc.getString("role");
        
        komuttamamlayici = baglanti.prepareStatement(SQL);
        komuttamamlayici.setInt(1, id);
        ResultSet sonucYeni = komuttamamlayici.executeQuery();
        
        while(sonucYeni.next()){
            
         if(role.equals("admin")){
             
             kullanici = new Admin(
                 
                     sonucYeni.getInt("adminSifresi"),
                     sonuc.getInt("id"),
                     sonuc.getString("isim"),
                     sonuc.getString("soyIsim"),
                     sonuc.getString("kullaniciAdi"),
                     sonuc.getString("kullaniciSifre"),
                     sonuc.getString("EMail"),
                     sonuc.getString("role")
             );
             
         }else{
              kullanici = new Okur(

                     sonucYeni.getInt("okuduguKitapSayisi"),
                     sonucYeni.getInt("kiralananKitapSayisi"),
                     sonuc.getInt("id"),
                     sonuc.getString("isim"),
                     sonuc.getString("soyIsim"),
                     sonuc.getString("kullaniciAdi"),
                     sonuc.getString("kullaniciSifre"),
                     sonuc.getString("EMail"),
                     sonuc.getString("role")
             );
         }
            
        }
        
        return kullanici;
        
    }
    
    public boolean sifremiUnuttum(Kullanici kullanici) throws MessagingException{
        if(!kullanici.getEMail().equals("")){
            
            System.out.println("Mail Gönderme İşlemlerine Devam Edilecek");
            mail.mailGonder(kullanici.getEMail());
            return true;
        }else{
            System.out.println("Kullanıcı Maili Bulunamadı >> UYARI GÖNDERİLECEK");
            return false;
        }
    }   
             
}
