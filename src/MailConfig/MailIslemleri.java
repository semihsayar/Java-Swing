package MailConfig;

import Varlık.Kullanici;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class MailIslemleri {
    
    Kullanici kullanici;
    
    private String mailAdresim = "kutuphanesistemi1@gmail.com";
    private String mailSifrem = "hjuhkikjumfunwcm";
    private String sifreKurtarmaKodu = "";
    private String mailIcerigi_1 = "Merhaba,\n\nŞifrenizi Öğrenmek İçin Aşağıdaki Kodu Kullanınız\n\n";
    private String mailIcerigi_2 = "\n\nİyi Günler";
    private String mailBasligi = "Kütüphane Sistemi Şifre Kurtarma Kodu";
    
    // Classlar
    
    Properties properties;
    Session session;
    Message mesaj;

    public MailIslemleri() {
        propertiesDegerleriniOlustur();
        sessionDegerleriniOlustur();
    }
    
protected void propertiesDegerleriniOlustur(){
    properties = System.getProperties();

    this.properties.put("mail.smtp.auth", "true");

    this.properties.put("mail.smtp.starttls.enable", "true");

    this.properties.put("mail.smtp.host", "smtp.gmail.com");

    this.properties.put("mail.smtp.port", "587");

    this.properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
}   
    
  protected void sessionDegerleriniOlustur(){
      session = Session.getInstance(properties,new Authenticator() {
          @Override
          protected PasswordAuthentication getPasswordAuthentication() {
             return new PasswordAuthentication(mailAdresim, mailSifrem);
          }
          
      });
  }
  
  public void mailGonder(String mailAtilacakAdres) throws AddressException, MessagingException{
      this.sifreKurtarmaKodu = kurtarmaSifresiUret();
      
      mesaj = new MimeMessage(session);
      mesaj.setFrom(new InternetAddress(mailAdresim));
      mesaj.setRecipient(Message.RecipientType.TO, new InternetAddress(mailAtilacakAdres));
      mesaj.setText(mailIcerigi_1 + this.sifreKurtarmaKodu + mailIcerigi_2);
      mesaj.setSubject(mailBasligi);
      
        Transport.send(mesaj);  // Maile Gidecek kod
  }
  
  public String kurtarmaSifresiUret(){
     int sifreUzunlugu = 10;
     String buyukHarfler = "ABCDEFGHIJKLMNOPRSTUVYZ";
     String kucukHarfler = buyukHarfler.toLowerCase();
     String rakamlar = "1234567890";
     String rakamVeHarfler = buyukHarfler + kucukHarfler + rakamlar;
     
     StringBuilder sfireOlusturucu = new StringBuilder();
     Random random = new Random();
     
     for(int i = 0; i < sifreUzunlugu; i++ ){
        sfireOlusturucu.append(rakamVeHarfler.charAt(random.nextInt(rakamVeHarfler.length())));
     }
     
     return sfireOlusturucu.toString();
        
    }

    public String getSifreKurtarmaKodu() {
        return sifreKurtarmaKodu;
    }
    
}
