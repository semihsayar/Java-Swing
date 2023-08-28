package UIKutuphaneSistemi;

import Varlık.Kullanici;
import com.mysql.cj.util.StringUtils;
import javax.swing.JButton;
import javax.swing.JTextField;


public class UIKayitOl {
    
    private JTextField jTextField_İsim;
    private JTextField jTextField_Soyisim;
    private JTextField jTextField_KullanıcıAdı;
    private JTextField jTextField_Sifre;
    private JTextField jTextField_Email;
    private JTextField jTextField_Role;
    private JButton jButton_KayıtOl;

    public UIKayitOl(JTextField jTextField_İsim, JTextField jTextField_Soyisim, JTextField jTextField_KullanıcıAdı, JTextField jTextField_Sifre, JTextField jTextField_Email,JTextField jTextField_Role, JButton jButton_KayıtOl) {
        this.jTextField_İsim = jTextField_İsim;
        this.jTextField_Soyisim = jTextField_Soyisim;
        this.jTextField_KullanıcıAdı = jTextField_KullanıcıAdı;
        this.jTextField_Sifre = jTextField_Sifre;
        this.jTextField_Email = jTextField_Email;
        this.jTextField_Role = jTextField_Role;
        this.jButton_KayıtOl = jButton_KayıtOl;
    }
    
      public Kullanici kullaniciTanimla() throws Exception {
       
       Kullanici kullanici = null;
       
        bosComponentKontrol(jTextField_İsim, "İsim");
        bosComponentKontrol(jTextField_Soyisim, "Soyİsim");
        bosComponentKontrol(jTextField_KullanıcıAdı, "Kullanıcı Adı");
        bosComponentKontrol(jTextField_Sifre, "Şifre");
        bosComponentKontrol(jTextField_Email, "Email");
        
        kullanici = yeniKullaniciOlustur();
        
        return kullanici;
    } 
    
   protected Kullanici yeniKullaniciOlustur(){
       
       Kullanici kullanici = new Kullanici(
               0,
               jTextField_İsim.getText(),
               jTextField_Soyisim.getText(), 
               jTextField_KullanıcıAdı.getText(), 
               jTextField_Sifre.getText(), 
               jTextField_Email.getText(),
               jTextField_Role.getText()
       );
       return kullanici;
   }
  protected void bosComponentKontrol(JTextField yaziAlani, String alanAdi) throws Exception{
        
        String deger = yaziAlani.getText();
        deger = deger.replaceAll(" ", "");
        yaziAlani.setText(deger);
        
        if(StringUtils.isEmptyOrWhitespaceOnly(deger)){
            throw  new Exception(alanAdi + " Alani Boş Bırakılamaz");
        }
    }
    

    public JTextField getjTextField_İsim() {
        return jTextField_İsim;
    }

    public JTextField getjTextField_Soyisim() {
        return jTextField_Soyisim;
    }

    public JTextField getjTextField_KullanıcıAdı() {
        return jTextField_KullanıcıAdı;
    }

    public JTextField getjTextField_Sifre() {
        return jTextField_Sifre;
    }

    public JTextField getjTextField_Email() {
        return jTextField_Email;
    }

    public JTextField getjTextField_Role() {
        return jTextField_Role;
    }
    
    public JButton getjButton_KayıtOl() {
        return jButton_KayıtOl;
    }
    
    
    
}
