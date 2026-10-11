import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data produk
        String namaProduk = "ROTI ENAK";
        int harga = 6300;

        System.out.println("======================================================");
        System.out.println("                  TOKO SERBAGUNA IBIK");
        System.out.println("======================================================");
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = input.nextInt();

        // Hitung total dan diskon (5% jika kelipatan 3)
        int total = harga * qty;
        int persenDiskon = 0;
        if (qty % 3 == 0) {
            persenDiskon = 5;
        }
        double diskon = total * persenDiskon / 100.0;
        double subTotal = total - diskon;

        // Waktu saat ini
        LocalDateTime sekarang = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println();
        System.out.println(sekarang.format(format));
        System.out.println("ITEM\t\tQTY\tHARGA\t\tTOTAL");
        System.out.println("======================================================");
        System.out.println(namaProduk + "\t" + qty + "\tRp " + harga + ",-\tRp " + total);
        System.out.println("------------------------------------------------------");
        System.out.println("Diskon : " + persenDiskon + "%");
        System.out.println("Sub Total : Rp " + subTotal + ",-");

        input.close();
    }
}