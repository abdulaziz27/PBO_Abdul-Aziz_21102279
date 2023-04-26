package com.Abdul_Aziz.PBO.Pertemuan2;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nama Anda : ");
        String name= input.nextLine();

        System.out.println("Selamat Pagi " + name + "!");
    }
}
