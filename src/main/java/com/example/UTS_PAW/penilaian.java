package com.example.UTS_PAW;

import java.util.Scanner;

public class penilaian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Anda: ");
        int nilai = scanner.nextInt();
        
        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Nilai Anda: A");
        } else if (nilai >= 77 && nilai < 80) {
            System.out.println("Nilai Anda: A-");
        } else if (nilai >= 75 && nilai < 77) {
            System.out.println("Nilai Anda: A/B");
        } else if (nilai >= 72 && nilai < 75) {
            System.out.println("Nilai Anda: B+");
        } else if (nilai >= 70 && nilai < 72) {
            System.out.println("Nilai Anda: B");
        } else if (nilai >= 67 && nilai < 70) {
            System.out.println("Nilai Anda: B-");
        } else if (nilai >= 65 && nilai < 67) {
            System.out.println("Nilai Anda: B/C");
        } else if (nilai >= 62 && nilai < 65) {
            System.out.println("Nilai Anda: C+");
        } else if (nilai >= 60 && nilai < 62) {
            System.out.println("Nilai Anda: C");
        } else if (nilai >= 57 && nilai < 60) {
            System.out.println("Nilai Anda: C-");
        } else if (nilai >= 55 && nilai < 57) {
            System.out.println("Nilai Anda: C/D");
        } else if (nilai >= 52 && nilai < 55) {
            System.out.println("Nilai Anda: D+");
        } else if (nilai >= 50 && nilai < 52) {
            System.out.println("Nilai Anda: D");
        } else if (nilai >= 45 && nilai < 50) {
            System.out.println("Nilai Anda: E");
        } else if (nilai < 45) {
            System.out.println("Nilai Anda: Tidak lulus (E)");
        } else {
            System.out.println("Nilai yang dimasukkan tidak valid.");
        }
        
        scanner.close();
    }
}