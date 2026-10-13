import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM : ");
        long npm = Long.parseLong(input.nextLine());

        boolean prima = true;
        long pembagi = 0;

        if (npm < 2) {
            prima = false;
            pembagi = 1;
        } else {
            for (long i = 2; i * i <= npm; i++) {
                if (npm % i == 0) {
                    prima = false;
                    pembagi = i;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else if (npm < 2) {
            System.out.println("Bukan termasuk bilangan prima karena kurang dari 2");
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan " + pembagi);
        }

        input.close();
    }
}