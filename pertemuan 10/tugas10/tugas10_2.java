/*
 * @Author : Chavid Achfriedo
 * @Date : 2023-06-06
 * @Program : Tugas Pertemuan 10.2 - Queue
 */

package tugas10;

import java.util.ArrayDeque;
import java.util.Queue;

public class tugas10_2 {
    public static void main(String[] args) {
        Queue<String> menu = new ArrayDeque<String>();
        menu.add("Nasi Goreng");
        menu.add("Sate");
        menu.add("Soto");
        menu.add("Mie Ayam");
        menu.add("Nasi Bungkus");
        System.out.println("Isi menu = " + menu);
        System.out.println("Menu pertama = " + menu.peek());
        System.out.println("Menu pertama = " + menu.poll());
        System.out.println("Isi menu = " + menu);
        System.out.println("Menu pertama = " + menu.peek());
        System.out.println("Menu pertama = " + menu.poll());
        System.out.println("Isi menu = " + menu);
        System.out.println("Menu pertama = " + menu.peek());
        System.out.println("Menu pertama = " + menu.poll());
        System.out.println("Isi menu = " + menu);
        System.out.println("Menu pertama = " + menu.peek());
        System.out.println("Menu pertama = " + menu.poll());
        System.out.println("Isi menu = " + menu);
        System.out.println("Menu pertama = " + menu.peek());
        System.out.println("Menu pertama = " + menu.poll());
        System.out.println("Isi menu = " + menu);
    }
}
