package ArayuzIslemleri;

import Paneller.PanelAdmin;
import Paneller.PanelKitap;
import Paneller.PanelKitapEkle;
import Paneller.PanelOkur;
import Varlık.Kullanici;
import javax.swing.JToggleButton;

public class KutuphaneEkranIslemleri {
    
     private PanelAdmin panelAdmin;
     private PanelKitap panelKitap;
     private PanelKitapEkle panelKitapEkle;
     private PanelOkur panelOkur;
     private Kullanici kullanici;

    public KutuphaneEkranIslemleri(PanelAdmin panelAdmin, PanelKitap panelKitap, PanelKitapEkle panelKitapEkle, PanelOkur panelOkur, Kullanici kullanici) {
        this.panelAdmin = panelAdmin;
        this.panelKitap = panelKitap;
        this.panelKitapEkle = panelKitapEkle;
        this.panelOkur = panelOkur;
        this.kullanici = kullanici;
    }

     public void initComponent_UI(){
         
          if(this.kullanici.getRole().equals("admin")){
           
            admin_Ekrani();
            
        }else if(this.kullanici.getRole().equals("user")){
          
            user_Ekrani();
        }else{
              System.out.println("ROL BULUNAMADI");
              
        }
        
         System.out.println("Kullanici Rolu : " + this.kullanici.getRole());
    }
     
     protected void admin_Ekrani(){
        
         panelAdmin.getjToggleButton().setSelected(true);
        
         panelKitap.getjToggleButton().setVisible(true);
         panelKitapEkle.getjToggleButton().setVisible(true);
         panelOkur.getjToggleButton().setVisible(false);
    }
    
    protected void user_Ekrani(){
        
        panelOkur.getjToggleButton().setSelected(true);
        
        panelAdmin.getjToggleButton().setVisible(false);
        panelKitap.getjToggleButton().setVisible(true);
        panelOkur.getjToggleButton().setVisible(true);
        panelKitapEkle.getjToggleButton().setVisible(false);
    }
     
     
      public void btnItemStateChanged(JToggleButton jToggleBtn){
        
        if(jToggleBtn == panelAdmin.getjToggleButton()){
            
            if(panelAdmin.getjToggleButton().isSelected() && !panelAdmin.isBtnSeciliMi()){
                ekran_Admin();
                
            }if(panelAdmin.isBtnSeciliMi()){
                panelAdmin.getjToggleButton().setSelected(true);
            } 
        }
        else if(jToggleBtn == panelKitap.getjToggleButton()){
            
             if(panelKitap.getjToggleButton().isSelected() && !panelKitap.isBtnSeciliMi()){
                ekran_Kitap();
                
            }if(panelKitap.isBtnSeciliMi()){
                panelKitap.getjToggleButton().setSelected(true);
           }  
        }
        else if(jToggleBtn == panelKitapEkle.getjToggleButton()){
            
             if(panelKitapEkle.getjToggleButton().isSelected() && !panelKitapEkle.isBtnSeciliMi()){
                ekran_KitapEkle();
                
            }if(panelKitapEkle.isBtnSeciliMi()){
                panelKitapEkle.getjToggleButton().setSelected(true);
           }
         }
        else if(jToggleBtn == panelOkur.getjToggleButton()){
            
              if(panelOkur.getjToggleButton().isSelected() && !panelOkur.isBtnSeciliMi()){
                ekran_Okur();
                
            }if(panelOkur.isBtnSeciliMi()){
                panelOkur.getjToggleButton().setSelected(true);
           } 
        }else{
            
        }
    }
      
      
       protected void ekran_Admin(){
        
        panelAdmin.setBtnSeciliMi(true);
        panelKitap.setBtnSeciliMi(false);
        panelKitapEkle.setBtnSeciliMi(false);
        panelOkur.setBtnSeciliMi(false);
        
        panelAdmin.getjToggleButton().setSelected(true);
        panelKitap.getjToggleButton().setSelected(false);
        panelKitapEkle.getjToggleButton().setSelected(false);
        panelOkur.getjToggleButton().setSelected(false);
        
        panelAdmin.getjPanel().setVisible(true);
        panelKitap.getjPanel().setVisible(false);
        panelKitapEkle.getjPanel().setVisible(false);
        panelOkur.getjPanel().setVisible(false);
    }
    
    protected void ekran_Kitap(){
        
        panelAdmin.setBtnSeciliMi(false);
        panelKitap.setBtnSeciliMi(true);
        panelKitapEkle.setBtnSeciliMi(false);
        panelOkur.setBtnSeciliMi(false);
        
        panelAdmin.getjToggleButton().setSelected(false);
        panelKitap.getjToggleButton().setSelected(true);
        panelKitapEkle.getjToggleButton().setSelected(false);
        panelOkur.getjToggleButton().setSelected(false);
        
        panelAdmin.getjPanel().setVisible(false);
        panelKitap.getjPanel().setVisible(true);
        panelKitapEkle.getjPanel().setVisible(false);
        panelOkur.getjPanel().setVisible(false);
    }
    
     protected void ekran_KitapEkle(){
        
        panelAdmin.setBtnSeciliMi(false);
        panelKitap.setBtnSeciliMi(false);
        panelKitapEkle.setBtnSeciliMi(true);
        panelOkur.setBtnSeciliMi(false);
        
        panelAdmin.getjToggleButton().setSelected(false);
        panelKitap.getjToggleButton().setSelected(false);
        panelKitapEkle.getjToggleButton().setSelected(true);
        panelOkur.getjToggleButton().setSelected(false);
        
        panelAdmin.getjPanel().setVisible(false);
        panelKitap.getjPanel().setVisible(false);
        panelKitapEkle.getjPanel().setVisible(true);
        panelOkur.getjPanel().setVisible(false);
    }
     
      protected void ekran_Okur(){
        
        panelAdmin.setBtnSeciliMi(false);
        panelKitap.setBtnSeciliMi(false);
        panelKitapEkle.setBtnSeciliMi(false);
        panelOkur.setBtnSeciliMi(true);
        
        panelAdmin.getjToggleButton().setSelected(false);
        panelKitap.getjToggleButton().setSelected(false);
        panelKitapEkle.getjToggleButton().setSelected(false);
        panelOkur.getjToggleButton().setSelected(true);
        
        panelAdmin.getjPanel().setVisible(false);
        panelKitap.getjPanel().setVisible(false);
        panelKitapEkle.getjPanel().setVisible(false);
        panelOkur.getjPanel().setVisible(true);
    }

    public PanelAdmin getPanelAdmin() {
        return panelAdmin;
    }

    public PanelKitap getPanelKitap() {
        return panelKitap;
    }

    public PanelKitapEkle getPanelKitapEkle() {
        return panelKitapEkle;
    }

    public PanelOkur getPanelOkur() {
        return panelOkur;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }
      
   
      
     
    
}
