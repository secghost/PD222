/*
 * @Author : Chavid Achfriedo
 * @Date : 2023-04-12
 * @Program : Tugas Pertemuan 4
 */
public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
