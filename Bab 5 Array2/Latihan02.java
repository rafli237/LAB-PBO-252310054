import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

    static ArrayList<ArrayList<Integer>> inputMatrix(String nama, int[][] contoh) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                String s = JOptionPane.showInputDialog(
                        "Masukkan nilai matrix " + nama + "[" + (i + 1) + "][" + (j + 1) + "] :",
                        String.valueOf(contoh[i][j]));
                if (s == null) System.exit(0);
                baris.add(Integer.parseInt(s.trim()));
            }
            matrix.add(baris);
        }
        return matrix;
    }

    static String tampil(String nama, ArrayList<ArrayList<Integer>> m) {
        StringBuilder sb = new StringBuilder("Matrix " + nama + " =\n");
        for (ArrayList<Integer> baris : m) {
            for (int nilai : baris) {
                sb.append(nilai).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = inputMatrix("A", new int[][] { { 1, 3 }, { 9, 5 } });
        ArrayList<ArrayList<Integer>> B = inputMatrix("B", new int[][] { { 4, 5 }, { 3, 6 } });

        // C = A * B (perkalian matrix)
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> baris = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                int jumlah = 0;
                for (int k = 0; k < 2; k++) {
                    jumlah += A.get(i).get(k) * B.get(k).get(j);
                }
                baris.add(jumlah);
            }
            C.add(baris);
        }

        JOptionPane.showMessageDialog(null,
                tampil("A", A) + "\n" + tampil("B", B) + "\n" + tampil("C = A * B", C),
                "Hasil Perkalian Matrix", JOptionPane.INFORMATION_MESSAGE);
    }
}