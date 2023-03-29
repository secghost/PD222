package Percabangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        //if-else
        //cek syarat pembuatan KTP
        int usia;
        System.out.print("Masukkan usia Anda: ");
        usia = Integer.parseInt(input.readLine());
        if (usia >= 17) {
            System.out.println("Anda sudah cukup umur untuk membuat KTP");
        } else {
            System.out.println("Anda belum cukup umur untuk membuat KTP");
        }

        //if-else-if
        //cek status kelulusan MK
        String nim;
        int nilaiUAS;
        System.out.print("Masukkan NIM Anda: ");
        nim = input.readLine();
        System.out.print("Masukkan nilai UAS Anda: ");
        nilaiUAS = Integer.parseInt(input.readLine());
        //jika nilai 80, 70, 65 = lulus, dibawah 65 = tidak lulus
        if (nim.equalsIgnoreCase("21410100051") 
            && nilaiUAS == 80) {
            System.out.println("Selamat Anda lulus MK ini dengan nilai A");
        } else if (nim.equalsIgnoreCase(nim) 
            && nilaiUAS == 70) {
            System.out.println("Selamat Anda lulus MK ini dengan nilai B");
        } else if (nim.equalsIgnoreCase(nim) 
            && nilaiUAS == 65) {
            System.out.println("Selamat Anda lulus MK ini dengan nilai C");
        } else if (nim.equalsIgnoreCase(nim) 
            && nilaiUAS < 65) {
            System.out.println("Maaf Anda tidak lulus MK ini");
        } else {
            System.out.println("NIM yang Anda masukkan salah");
        }
        //equals : memperhatikan detail huruf besar kecil (sensitif)
        //equalsIgnoreCase : tidak memperhatikan detail huruf besar kecil (tidak sensitif)

        //nested if
        //cek menu yang dipilih (makanan/minuman)
        //makanan : snack, nasi bungkus
        //minuman : kopi, teh, air mineral

        String menu, jenis;
        System.out.print("Masukkan menu yang Anda pilih: ");
        menu = input.readLine();
        System.out.print("Masukkan jenis menu \nMakanan: Snack, Nasi Bungkus \n" + "Minuman: Kopi, Teh, Air Mineral.\nPilih : ");
        jenis = input.readLine();
        if (menu.equalsIgnoreCase("makanan")) {
            if (jenis.equalsIgnoreCase("snack")) {
                System.out.println("harga 2000");
            } else {
                System.out.println("harga 5000");
            }
        } else if (menu.equalsIgnoreCase("minuman")) {
            if (jenis.equalsIgnoreCase("kopi")) {
                System.out.println("harga 5000");
            } else if (jenis.equalsIgnoreCase("teh")) {
                System.out.println("harga 3000");
            } else if (jenis.equalsIgnoreCase("air mineral")) {
                System.out.println("harga 2000");
            } else {
                System.out.println("Jenis menu yang Anda pilih tidak tersedia");
            }
        } else {
            System.out.println("Menu yang Anda pilih tidak tersedia");
        }
    }
}
