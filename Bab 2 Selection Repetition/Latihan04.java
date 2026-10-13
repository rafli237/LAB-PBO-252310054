import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM    : ");
        long npm = Long.parseLong(input.nextLine());

        System.out.print("Masukkan faktor : ");
        int angka = Integer.parseInt(input.nextLine());

        if (angka < 20) {
            System.out.println("Nilai input tidak boleh kurang dari 20");
        } else {
            if (npm % 2 == 0) {
                // NPM genap: Ascending
                System.out.print("ASC: Faktor " + angka + " adalah ");
                boolean pertama = true;
                for (int i = 1; i <= angka; i++) {
                    if (angka % i == 0) {
                        if (!pertama) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                        pertama = false;
                    }
                }
                System.out.println();
            } else {
                // NPM ganjil: Descending
                System.out.print("DESC: Faktor " + angka + " adalah ");
                boolean pertama = true;
                for (int i = angka; i >= 1; i--) {
                    if (angka % i == 0) {
                        if (!pertama) {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                        pertama = false;
                    }
                }
                System.out.println();
            }
        }

        input.close();
    }
}