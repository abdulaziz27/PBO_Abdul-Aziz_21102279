package com.Abdul_Aziz.PBO.Pertemuan2;

import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        String username = "excell";
        String password = "dlwlrma";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukan password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
            System.out.println("Silahkan login dengan username dan password yang sah!");
        } else if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil! silahkan masuk");
        } else {
            System.out.println("Username dan password Anda salah!");
        }
    }
}
