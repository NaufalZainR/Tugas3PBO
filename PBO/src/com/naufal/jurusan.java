package com.naufal;

import java.util.ArrayList;

public class jurusan {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs;

    public jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.mhs = new ArrayList<>();

    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }
    public void addMhs (Mahasiswa m){
        mhs.add(m);
    }
}

