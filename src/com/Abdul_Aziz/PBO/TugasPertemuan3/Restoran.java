package com.Abdul_Aziz.PBO.TugasPertemuan3;

import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        DaftarPaket daftarPaket = new DaftarPaket();

        // Ngisi paket restoran ke daftar paket
        daftarPaket.tambahPaketRestoran("Paket Jomblo", "1 Porsi Gurame Bakar + Nasi + Jus Alpukat", 25000);
        daftarPaket.tambahPaketRestoran("Paket Couple", "2 Porsi Ramen + Jus Alpukat", 40000);
        daftarPaket.tambahPaketRestoran("Paket Party-an", "10 Porsi Sate Babi + Soup Onta Arab + Nasi + Soju", 250000);

        // Show Daftar Pket Rstran
        System.out.println("Daftar Paket Restoran:");
        daftarPaket.tampilkanDaftarPaketRestoran();

        // Ngambil pesanan dari user
        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0;
        System.out.println("Masukkan nomor paket restoran yang ingin dipesan (pisahkan dengan koma):");
        String input = scanner.nextLine();
        String[] nomorPaketRestoran = input.split(",");
        for (String nomor : nomorPaketRestoran) {
            int index = Integer.parseInt(nomor) - 1;
            totalHarga += daftarPaket.getPaketRestoran(index).getHarga();
        }

        System.out.println("Total harga pesanan: " + totalHarga);
    }
}