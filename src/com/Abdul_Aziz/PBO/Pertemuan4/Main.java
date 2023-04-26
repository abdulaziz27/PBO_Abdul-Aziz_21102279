package com.Abdul_Aziz.PBO.Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Pegawai pegawai = new Pegawai();

        manager.nip = 21102279;
        manager.nama = "Excell";

        manager.nip = 21102223;
        manager.nama = "IU";

        manager.showInfo();
        manager.extraInfo();
        manager.bonus(1000000);
        manager.bonus();

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
