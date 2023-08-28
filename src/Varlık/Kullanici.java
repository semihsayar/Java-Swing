package Varlık;

public class Kullanici {
    
    private int id;
    private String isim;
    private String soyIsim;
    private String kullaniciAdi;
    private String kullaniciSifre;
    private String EMail;
    private String role;

    public Kullanici(int id, String isim, String soyIsim, String kullaniciAdi, String kullaniciSifre, String EMail, String role) {
        this.id = id;
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSifre = kullaniciSifre;
        this.EMail = EMail;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public String getEMail() {
        return EMail;
    }

    public String getRole() {
        return role;
    }

   
    
}
