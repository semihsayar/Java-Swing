package Varlık;

public class Kitap {
    
    private int id;
    private String yazarAdi;
    private String kitapAdi;
    private String yayinYeri;
    private String sayfaSayisi;
    private String kategori;
    private String baskiSayisi;

    public Kitap(int id, String yazarAdi, String kitapAdi, String yayinYeri, String sayfaSayisi,String kategori, String baskiSayisi) {
        
        this.id = id;
        this.yazarAdi = yazarAdi;
        this.kitapAdi = kitapAdi;
        this.yayinYeri = yayinYeri;
        this.sayfaSayisi = sayfaSayisi;
        this.kategori = kategori;
        this.baskiSayisi = baskiSayisi;
    }

    public int getId() {
        return id;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getYayinYeri() {
        return yayinYeri;
    }

    public String getSayfaSayisi() {
        return sayfaSayisi;
    }

    public String getKategori() {
        return kategori;
    }
    public String getBaskiSayisi() {
        return baskiSayisi;
    }
    
    
}
