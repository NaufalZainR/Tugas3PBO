package com.naufal;

public class Main {

    public static void main(String[] args) {
        int angka = 1;
        jurusan d3if = new jurusan("d3if", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Mahasiswa rendi = new Mahasiswa("6701", "Rendi");
        Mahasiswa chacha = new Mahasiswa("6702", "Chaha");
        Mahasiswa agus = new Mahasiswa("6703", "Agus");
        d3if.addMhs(rendi);
        d3if.addMhs(chacha);
        d3if.addMhs(agus);
        System.out.println("kode: "+ d3if.getKode());
        System.out.println("nama: "+ d3if.getNama());
        System.out.println("daftar mahasiswa ");
        for (Mahasiswa mhs: d3if.getMhs()
             ) {
            System.out.println((angka++)+". "+ mhs.getNim()+ "-"+mhs.getNama());
        }
        System.out.println();
        angka =1;
        jurusan d3si = new jurusan("d3si", "Diploma 3 Sistem Informasi");
        Mahasiswa ridwan = new Mahasiswa("6301", "Ridwan");
        Mahasiswa siska = new Mahasiswa("6302", "Siska");
        Mahasiswa zayn = new Mahasiswa("6303", "Zayn");
        Mahasiswa rahmat = new Mahasiswa("6304", "Rahmat");
        d3si.addMhs(ridwan);
        d3si.addMhs(siska);
        d3si.addMhs(zayn);
        d3si.addMhs(rahmat);
        System.out.println("kode: "+ d3si.getKode());
        System.out.println("nama: "+ d3si.getNama());
        System.out.println("daftar mahasiswa ");
        for (Mahasiswa mhs: d3si.getMhs()
        ) {
            System.out.println((angka++)+". "+ mhs.getNim()+ "-"+mhs.getNama());

        }

    }
}

