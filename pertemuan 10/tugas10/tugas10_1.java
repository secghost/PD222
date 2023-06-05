/*
 * @Author : Chavid Achfriedo
 * @Date : 2023-06-06
 * @Program : Tugas Pertemuan 10.1 - Queue
 */

package tugas10;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class tugas10_1 {
    public static void main(String[] args) throws IOException {
        Queue<String> antrian = new LinkedList<String>();
        antrian.add("Chavid");
        antrian.add("Achfriedo");
        antrian.add("Chavid");
        antrian.add("Achfri");
        antrian.add("Edo");
        System.out.println("Isi antrian = " + antrian);
        System.out.println("Antrian pertama = " + antrian.peek());
        System.out.println("Antrian pertama = " + antrian.poll());
        System.out.println("Isi antrian = " + antrian);
        System.out.println("Antrian pertama = " + antrian.peek());
        System.out.println("Antrian pertama = " + antrian.poll());
        System.out.println("Isi antrian = " + antrian);
        System.out.println("Antrian pertama = " + antrian.peek());
        System.out.println("Antrian pertama = " + antrian.poll());
        System.out.println("Isi antrian = " + antrian);
        System.out.println("Antrian pertama = " + antrian.peek());
        System.out.println("Antrian pertama = " + antrian.poll());
        System.out.println("Isi antrian = " + antrian);
        System.out.println("Antrian pertama = " + antrian.peek());
        System.out.println("Antrian pertama = " + antrian.poll());
        System.out.println("Isi antrian = " + antrian);
    }
}
