import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan09 {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<Integer>();

        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah array:"));

        // mengisi ArrayList
        for (int i = 0; i < jumlah; i++) {
            int angka = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan angka:",
                    "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
            nilai.add(angka);
        }

        // mencari nilai terbesar dan terkecil
        int terbesar = nilai.get(0);
        int terkecil = nilai.get(0);
        for (int i = 1; i < nilai.size(); i++) {
            if (nilai.get(i) > terbesar) {
                terbesar = nilai.get(i);
            }
            if (nilai.get(i) < terkecil) {
                terkecil = nilai.get(i);
            }
        }

        // output
        String hasil = "";
        for (int i = 0; i < nilai.size(); i++) {
            hasil += "x[" + i + "]=" + nilai.get(i) + "\n";
        }
        hasil += "Nilai terbesar adalah " + terbesar + "\n";
        hasil += "Nilai terbesar adalah " + terkecil;

        JOptionPane.showMessageDialog(null, hasil, "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}