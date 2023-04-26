package com.Abdul_Aziz.PBO.Pertemuan2;

import java.util.Arrays;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Bilangan: ");
        int bil = input.nextInt();

        if (bil % 2 == 0){
            System.out.println(bil + " adalah Bil Genap");
        } else {
            System.out.println(bil + " adalah Bil Ganjil");
        }

        if (bil > 0)
            System.out.println(bil + " Bil Positif");
        else if (bil < 0) {
            System.out.println(bil + " Bil Negatif");
        }else {
            System.out.println(bil + " Bil Nol");
        }

    }
}
