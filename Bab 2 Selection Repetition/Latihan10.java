import java.util.Scanner;

public class Latihan10 {

    static void tampilSaldo(long saldo) {
        String s = String.format("%,d", saldo).replace(',', '.');
        System.out.println("Saldo anda: Rp " + s);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String npm = "252310054";   
        long saldo = 1000000;   
        String pin;

        do {
            System.out.print("Masukkan PIN: ");
            pin = input.next();
            if (!pin.equals(npm)) {
                System.out.println("PIN salah, silakan coba lagi.");
            }
        } while (!pin.equals(npm));

        char ulang = 'y';

        do {
            System.out.println();
            System.out.println("===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukkan menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                tampilSaldo(saldo);

            } else if (menu == 2) {
                System.out.print("Masukkan nominal setor tunai: ");
                long nominal = input.nextLong();
                saldo = saldo + nominal;
                tampilSaldo(saldo);

            } else if (menu == 3) {
                System.out.print("Masukkan nominal tarik tunai: ");
                long nominal = input.nextLong();
                if (nominal <= saldo) {
                    saldo = saldo - nominal;
                    tampilSaldo(saldo);
                } else {
                    System.out.println("Saldo tidak cukup.");
                }

            } else if (menu == 4) {
                System.out.println("Anda memilih keluar.");

            } else {
                System.out.println("Menu tidak tersedia.");
                continue;
            }

            
            System.out.print("Kembali ke menu? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terimakasih, anda telah keluar dari aplikasi.");
    }
}