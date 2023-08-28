package Varlık;


public class Admin extends Kullanici {
    
    private int adminSifresi;

    public Admin(int adminSifresi, int id, String isim, String soyIsim, String kullaniciAdi, String kullaniciSifre, String EMail, String role) {
        super(id, isim, soyIsim, kullaniciAdi, kullaniciSifre, EMail, role);
        this.adminSifresi = adminSifresi;
    }

  
    
    public int getAdminSifresi() {
        return adminSifresi;
    }
}
