/*
 * @Author : Chavid Achfriedo
 * @Date : 2023-04-18
 * @Program : Tugas Pertemuan 6
 */

package tugas6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] penjualan = new String[5][4];
        double harga, quantity, total, grandTotal=0, uangDibayarkan, kembalian;
        try {
            //input data
            for (int i = 0; i < penjualan.length; i++) {
                System.out.println("(:==================Input DATA==================:)");
                System.out.print("Masukkan nama barang ke-" + (i + 1) + " : ");
                penjualan[i][0] = br.readLine();
                System.out.print("Masukkan harga barang ke-" + (i + 1) + " : ");
                penjualan[i][1] = br.readLine();
                harga = Double.parseDouble(penjualan[i][1]);
                System.out.print("Masukkan quantity barang ke-" + (i + 1) + " : ");
                penjualan[i][2] = br.readLine();
                quantity = Double.parseDouble(penjualan[i][2]);
                total = harga * quantity;
                penjualan[i][3] = String.valueOf(total);
                System.out.println("Total harga barang ke-" + (i + 1) + " : " + penjualan[i][3]);
                grandTotal = grandTotal + total;
            }
            System.out.println("(:===========Total Yang Harus Dibayar===========:)");
            System.out.println("Grand Total     : " + grandTotal);
            System.out.print("Uang dibayarkan : ");
            uangDibayarkan = Double.parseDouble(br.readLine());
            kembalian = uangDibayarkan - grandTotal;
            System.out.println("(:=============Barang Yang Dibeli===============:)");
            for (int i = 0; i < penjualan.length; i++) {
                System.out.println(penjualan[i][0] + " : " + penjualan[i][1] + " X " + penjualan[i][2] + " : " + penjualan[i][3]);
            }
            System.out.println("Uang yang dibayarkan  : " + uangDibayarkan + " - " + grandTotal);
            System.out.println("Kembalian anda adalah : " + kembalian);
            System.out.println("(:==============================================:)");
        }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
    
}
