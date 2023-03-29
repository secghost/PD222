/*
 * @Author : Chavid Achfriedo
 * @Date : 2023-03-29
 * @Program : Tugas 3 - Percabangan
 */
package tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas3 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan nilai IPK semester 1 : ");
        double ips = Double.parseDouble(br.readLine());
        System.out.print("Masukkan jumlah SKS yang telah ditempuh : ");
        int sks = Integer.parseInt(br.readLine());
        int sksMaks = 0;
        //proses
        if (ips >= 3.51 && ips <= 4.00) {
            sksMaks = 24;
        } else if (ips >= 3.01 && ips <= 3.50) {
            sksMaks = 21;
        } else if (ips >= 2.76 && ips <= 3.00) {
            sksMaks = 18;
        } else if (ips >= 2.00 && ips <= 2.75) {
            sksMaks = 15;
        } else if (ips >= 0 && ips <= 1.99) {
            sksMaks = 12;
        }
        //output
        System.out.println("SKS maksimal yang dapat dicapai adalah " + sksMaks);
        System.out.println("SKS yang telah ditempuh adalah " + sks);
        System.out.println("SKS yang dapat ditempuh adalah " + (sksMaks - sks));
    }
}
