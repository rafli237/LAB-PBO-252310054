import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Memasukkan Usia      : ");
        String usia = input.nextLine();
        System.out.print("Memasukkan Firstname : ");
        String firstname = input.nextLine();
        System.out.print("Memasukkan Lastname  : ");
        String lastname = input.nextLine();
        System.out.print("Memasukkan NPM       : ");
        String npm = input.nextLine();

        String hasil = usia.concat(firstname).concat(lastname).concat(npm);
        System.out.println("Output : " + hasil);

        input.close();
    }
}