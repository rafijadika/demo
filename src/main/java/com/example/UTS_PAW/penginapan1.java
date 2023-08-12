package com.example.UTS_PAW;

public class penginapan1 {
    private String no_KTP;
    private String nama;
    private String alamat;
    private String nomor_kamar;

    // Constructor
    public penginapan1(String no_KTP, String nama, String alamat, String nomor_kamar) {
        this.no_KTP = no_KTP;
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_kamar = nomor_kamar;
    }

    // Getter and Setter methods
    public String getNo_KTP() {
        return no_KTP;
    }

    public void setNo_KTP(String no_KTP) {
        this.no_KTP = no_KTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomor_kamar() {
        return nomor_kamar;
    }

    public void setNomor_kamar(String nomor_kamar) {
        this.nomor_kamar = nomor_kamar;
    }

    public static void main(String[] args) {
        // Membuat objek Penghuni
        penginapan1 penghuni1 = new penginapan1("12648973220", "steven hao", "Geblagan, Tamantirto, Kasihan, Bantul, Yogyakarta", "B141");

        // Menampilkan informasi penghuni
        System.out.println("No. KTP: " + penghuni1.getNo_KTP());
        System.out.println("Nama: " + penghuni1.getNama());
        System.out.println("Alamat: " + penghuni1.getAlamat());
        System.out.println("Nomor Kamar: " + penghuni1.getNomor_kamar());
    }
} 

