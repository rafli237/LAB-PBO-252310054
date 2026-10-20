package QUIZ_1_PERTEMUAN_4;

import java.util.Scanner;

public class Buku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] buku = new String[10];
        int jumlah = 0;
        int menu = 0;

        while (menu != 4) {
            // Pilih menu
            System.out.println("\n1. Input  2. Hapus  3. Tampil  4. Keluar");
            System.out.print("Pilih menu: ");
            menu = in.nextInt();
            in.nextLine();

            if (menu == 1) {
                // Masukkan judul buku yang ingin di-input -> Simpan buku
                System.out.print("Judul buku: ");
                buku[jumlah] = in.nextLine();
                jumlah++;

            } else if (menu == 2) {
                // Masukkan index buku yang ingin dihapus -> Hapus buku
                System.out.print("Index buku yang dihapus: ");
                int index = in.nextInt();
                in.nextLine();
                for (int i = index; i < jumlah - 1; i++) {
                    buku[i] = buku[i + 1];
                }
                jumlah--;

            } else if (menu == 3) {
                // Output seluruh data buku
                for (int i = 0; i < jumlah; i++) {
                    System.out.println(i + ". " + buku[i]);
                }
            }
        }

        // Keluar dari program
        System.out.println("Keluar dari program.");
        in.close();
    }
}