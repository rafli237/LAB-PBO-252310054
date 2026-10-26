import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        // input jumlah array
        String input = JOptionPane.showInputDialog("Masukan jumlah array:");
        int jumlah = Integer.parseInt(input);

        // membuat array sesuai jumlah
        int[] nilai = new int[jumlah];

        // mengisi array pakai looping
        for (int i = 0; i < nilai.length; i++) {
            String angka = JOptionPane.showInputDialog(null, "Masukan angka:",
                    "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            nilai[i] = Integer.parseInt(angka);
        }

        // menyusun hasil output
        String hasil = "";
        for (int i = 0; i < nilai.length; i++) {
            hasil = hasil + "x[" + i + "]=" + nilai[i] + "\n";
        }

        // menampilkan hasil
        JOptionPane.showMessageDialog(null, hasil, "Output Array",
                JOptionPane.INFORMATION_MESSAGE);
    }
}