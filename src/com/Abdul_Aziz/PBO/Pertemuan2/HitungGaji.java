package com.Abdul_Aziz.PBO.Pertemuan2;

import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan gaji Anda: ");
        double gaji = input.nextDouble();

        System.out.print("Masukkan tunjangan Anda: ");
        double tunjangan = input.nextDouble();

        double pajak = 7.65 / 100;
        double gajiKotor = gaji + tunjangan;
        double pajakNegara = gajiKotor * pajak;
        double gajiBersih = gajiKotor - pajakNegara;

        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");
        System.out.println("Gaji kotor: " + gajiKotor);
        System.out.println("Pajak negara: " + pajakNegara);
        System.out.println("Gaji bersih: " + gajiBersih);
        System.out.printf("Total gaji bersih dari %s yang diterima yaitu Rp.%.2f.", nama, gajiBersih);

       // System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gajiBersih + ".");
    }
}

