import java.util.Scanner;

public class Latihan05 {
    static void cetakBaris(int i, int n) {
        int totalKolom = 2 * n + 1;
        int k = Math.abs(n - i) + 1;
        for (int j = 1; j <= totalKolom; j++) {
            if (j <= k || j > totalKolom - k) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        long npm = Long.parseLong(input.nextLine());
        System.out.print("Enter the number of row: ");
        int n = Integer.parseInt(input.nextLine());

        int totalBaris = 2 * n - 1;

        if (npm % 2 == 0) {
            for (int i = 1; i <= totalBaris; i++) {
                cetakBaris(i, n);
            }
        } else {
            int i = 1;
            while (i <= totalBaris) {
                cetakBaris(i, n);
                i++;
            }
        }

        input.close();
    }
}