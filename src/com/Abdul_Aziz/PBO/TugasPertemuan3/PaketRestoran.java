package com.Abdul_Aziz.PBO.TugasPertemuan3;

public class PaketRestoran {
    private String namaPaket;
    private String menu;
    private int harga;

    public PaketRestoran(String namaPaket, String menu, int harga) {
        this.namaPaket = namaPaket;
        this.menu = menu;
        this.harga = harga;
    }
    // accessor
    public String getNamaPaket() {
        return namaPaket;
    }
    // mutator
    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }
    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
}
