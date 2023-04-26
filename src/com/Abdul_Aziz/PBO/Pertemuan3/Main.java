package com.Abdul_Aziz.PBO.Pertemuan3;

public class Main {
    public static void main(String[] args) {
        // Make class
        SepedaMotor honda = new SepedaMotor("Honda", "Vario 160", 2000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "N Max", 3000000);
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 600000);

        /*
        // Mengisi nilai atribut object Honda
        honda.merk = "Honda";
        honda.tipe = "Vario 160";
        honda.harga = 2000000;

        // Mengisi nilai atribut object Yamaha
        yamaha.merk = "Yamaha";
        yamaha.tipe = "N max";
        yamaha.harga = 2500000;

        // Mengisi nilai atribut object Vespa
        vespa.merk = "Vespa";
        vespa.tipe = "Vespa Matic";
        vespa.harga = 4000000;
         */

        // Untuk menjalankan method
        honda.ShowInfo();
        yamaha.ShowInfo();
        vespa.ShowInfo();

        System.out.println("Motor merk " + honda.getMerk() + " dengan tipe (sebelum) " + honda.getTipe() + " Harganya " + honda.getHarga());
        honda.setTipe("Beat 110");
        System.out.println("Motor merk " + honda.getMerk() + " dengan tipe (sesudah) " + honda.getTipe() + " Harganya " + honda.getHarga());
    }
}
