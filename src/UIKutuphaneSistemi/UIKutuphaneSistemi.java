package UIKutuphaneSistemi;

import Varlık.Kitap;
import com.mysql.cj.util.StringUtils;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class UIKutuphaneSistemi {
    
    private JTextField jTextField_YazarAdi;
    private JTextField jTextField_KitapAdi;
    private JTextField jTextField_YayinYeri;
    private JTextField jTextField_SayfaSayisi;
    private JTextField jTextField_BaskiSayisi;
    private JButton jButton_KitapEkle;
    private JButton jButton_Yenile;
    private JComboBox jComboBox_Kategori;
    private JPanel jPanel_DosyaOku;

    public UIKutuphaneSistemi(JTextField jTextField_YazarAdi, JTextField jTextField_KitapAdi, JTextField jTextField_YayinYeri, JTextField jTextField_SayfaSayisi, JTextField jTextField_BaskiSayisi, JButton jButton_KitapEkle, JButton jButton_Yenile, JComboBox jComboBox_Kategori, JPanel jPanel_DosyaOku) {
        this.jTextField_YazarAdi = jTextField_YazarAdi;
        this.jTextField_KitapAdi = jTextField_KitapAdi;
        this.jTextField_YayinYeri = jTextField_YayinYeri;
        this.jTextField_SayfaSayisi = jTextField_SayfaSayisi;
        this.jTextField_BaskiSayisi = jTextField_BaskiSayisi;
        this.jButton_KitapEkle = jButton_KitapEkle;
        this.jButton_Yenile = jButton_Yenile;
        this.jComboBox_Kategori = jComboBox_Kategori;
        this.jPanel_DosyaOku = jPanel_DosyaOku;
    }
    
    
   public Kitap kitapTanimla() throws Exception {
       
       Kitap kitap = null;
       
        bosComponentKontrol(jTextField_YazarAdi, "Yazar Adı");
        bosComponentKontrol(jTextField_KitapAdi, "Kitap Adı");
        bosComponentKontrol(jTextField_YayinYeri, "Yayın Yeri");
        bosComponentKontrol(jTextField_SayfaSayisi, "Sayfa Sayısı");
        bosComponentKontrol(jTextField_BaskiSayisi, "Baskı Sayısı");
        
        bosComponentKontrol(jComboBox_Kategori,"Kategori");
        kitap = yeniKitapOlustur();
        
        return kitap;
    } 
    
   protected Kitap yeniKitapOlustur(){
       
       Kitap kitap = new Kitap(
               0,
               jTextField_YazarAdi.getText(),
               jTextField_KitapAdi.getText(), 
               jTextField_YayinYeri.getText(), 
               jTextField_SayfaSayisi.getText(), 
               jComboBox_Kategori.getSelectedItem().toString(), 
               jTextField_BaskiSayisi.getText()
       );
       return kitap;
   }
  protected void bosComponentKontrol(JTextField yaziAlani, String alanAdi) throws Exception{
        
        String deger = yaziAlani.getText();
        deger = deger.replaceAll(" ", "");
        yaziAlani.setText(deger);
        
        if(StringUtils.isEmptyOrWhitespaceOnly(deger)){
            throw  new Exception(alanAdi + " Alani Boş Bırakılamaz");
        }
    }
    
    protected void bosComponentKontrol(JComboBox comboBox, String alanAdi) throws Exception{
        
        int secilenDeger = comboBox.getSelectedIndex();
        boolean comboBoxGorunurMu = comboBox.isVisible();
        boolean comboBoxEnableMi = comboBox.isEnabled();
        
        if(comboBoxGorunurMu && comboBoxEnableMi){
             
            if(secilenDeger == 0)
                throw new Exception(alanAdi +  " Kutusu Boş Bırakılamaz");
        }
        
    }
    

    public JTextField getjTextField_YazarAdi() {
        return jTextField_YazarAdi;
    }

    public JTextField getjTextField_KitapAdi() {
        return jTextField_KitapAdi;
    }

    public JTextField getjTextField_YayinYeri() {
        return jTextField_YayinYeri;
    }

    public JTextField getjTextField_SayfaSayisi() {
        return jTextField_SayfaSayisi;
    }

    public JTextField getjTextField_BaskiSayisi() {
        return jTextField_BaskiSayisi;
    }

    public JButton getjButton_KitapEkle() {
        return jButton_KitapEkle;
    }

    public JButton getjButton_Yenile() {
        return jButton_Yenile;
    }

    public JComboBox getjComboBox_Kategori() {
        return jComboBox_Kategori;
    }

    public JPanel getjPanel_DosyaOku() {
        return jPanel_DosyaOku;
    }
    
    
    
}
