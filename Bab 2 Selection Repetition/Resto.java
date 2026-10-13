import java.util.Scanner;

public class Resto {

    // Attribute Harga: tipe LONG, access modifier PRIVATE
    private long Harga;

    private Scanner input = new Scanner(System.in);

    // Method chooseMenu: PUBLIC, tipe void
    public void chooseMenu() {
        System.out.println("Menu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Masukkan pilihan menu: ");
        int pilihan = input.nextInt();

        Harga = getPrices(pilihan);

        String namaMenu;
        if (pilihan == 1) {
            namaMenu = "Nasi Goreng";
        } else if (pilihan == 2) {
            namaMenu = "Bubur Ayam";
        } else if (pilihan == 3) {
            namaMenu = "Soto Ayam";
        } else {
            namaMenu = "";
        }

        if (Harga == 0) {
            System.out.println("Maaf menu yang anda masukan salah.");
        } else {
            String harga = String.format("%,d", Harga).replace(',', '.');
            System.out.println("Anda memesan " + namaMenu + " dengan harga Rp " + harga + ",-.");
        }
    }

    // Method getPrices: PRIVATE, tipe Long
    private Long getPrices(int menu) {
        if (menu == 1) {
            Harga = 22000;
        } else if (menu == 2) {
            Harga = 15000;
        } else if (menu == 3) {
            Harga = 25000;
        } else {
            Harga = 0;
        }
        return Harga;
    }
}