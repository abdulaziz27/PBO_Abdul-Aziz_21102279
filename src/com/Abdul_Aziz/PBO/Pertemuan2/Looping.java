package com.Abdul_Aziz.PBO.Pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            System.out.println("Looping ke (" + i + ")");
        }
        System.out.println("Looping for Selesai!");

        int j = 1;
        while (j <= 20){
            System.out.println("Looping ke (" + j + ")");
            j+=10;
        }
        System.out.println("Looping for Selesai!");

        int k = 5;
        do {
            System.out.println("Looping ke (" + k + ")");
            k--;
        }
        while (k > 0);
        System.out.println("Looping do while Selesai!");

    }
}
