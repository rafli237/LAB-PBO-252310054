package QUIZ_1_PERTEMUAN_4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Remedial_Quiz {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<Integer>();

        int data = Integer.parseInt(JOptionPane.showInputDialog("Input berapa data?"));

        int i = 0;
        while (i < data) {
            int angka = Integer.parseInt(JOptionPane.showInputDialog("Input angka ke-" + (i + 1)));
            nilai.add(angka);
            i++;
        }

        int total = 0;
        for (int x = 0; x < nilai.size(); x++) {
            total = total + nilai.get(x);
        }

        double rata = (double) total / data;
        JOptionPane.showMessageDialog(null, "Rata-rata = " + rata);
    }
}