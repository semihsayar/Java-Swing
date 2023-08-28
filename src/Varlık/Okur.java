package Varlık;


public class Okur extends Kullanici {
    
    private int okuduguKitapSayisi;
    private int kiralananKitapSayisi;

    public Okur(int okuduguKitapSayisi, int kiralananKitapSayisi, int id, String isim, String soyIsim, String kullaniciAdi, String kullaniciSifre, String EMail, String role) {
        super(id, isim, soyIsim, kullaniciAdi, kullaniciSifre, EMail, role);
        this.okuduguKitapSayisi = okuduguKitapSayisi;
        this.kiralananKitapSayisi = kiralananKitapSayisi;
    }
    
    public int getOkuduguKitapSayisi() {
        return okuduguKitapSayisi;
    }

    public int getKiralananKitapSayisi() {
        return kiralananKitapSayisi;
    }
    
    
}
