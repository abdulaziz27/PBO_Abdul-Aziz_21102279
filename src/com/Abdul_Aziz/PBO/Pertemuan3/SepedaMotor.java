package com.Abdul_Aziz.PBO.Pertemuan3;

public class SepedaMotor {
    // Atribut = var
    private String merk;
    private String tipe;
    private int harga;

    //constructor = method for inisialization
    public SepedaMotor(){}
    public SepedaMotor(String merk, String tipe, int harga){
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    //Method
    public void ShowInfo(){
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
