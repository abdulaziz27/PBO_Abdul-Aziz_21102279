package com.Abdul_Aziz.PBO.TugasPertemuan3;

import java.util.ArrayList;

public class DaftarPaket {
    private ArrayList<PaketRestoran> daftarPaketRestoran;

    public DaftarPaket() {
        daftarPaketRestoran = new ArrayList<PaketRestoran>();
    }

    // Nambahin paket restoran baru to ArrayList dftPktRst
    public void tambahPaketRestoran(String namaPaket, String menu, int harga) {
        PaketRestoran paketRestoran = new PaketRestoran(namaPaket, menu, harga);
        daftarPaketRestoran.add(paketRestoran);
    }
    // Nampilin dftar pket from arrlist DftPktRst
    public void tampilkanDaftarPaketRestoran() {
        // akses tiap objek, then show it
        for (int i = 0; i < daftarPaketRestoran.size(); i++) {
            PaketRestoran paketRestoran = daftarPaketRestoran.get(i);
            System.out.println("Nomor paket: " + (i + 1));
            System.out.println("Nama paket: " + paketRestoran.getNamaPaket());
            System.out.println("Menu: " + paketRestoran.getMenu());
            System.out.println("Harga: " + paketRestoran.getHarga());
            System.out.println();
        }
    }
    // Ngambil objek PaketRestoran ArrList DftPktRst by indeks
    public PaketRestoran getPaketRestoran(int index) {
        return daftarPaketRestoran.get(index);
    }
}
