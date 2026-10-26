import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        // input NPM
        long npm = Long.parseLong(JOptionPane.showInputDialog("Masukan NPM:"));

        // input matrix A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai A[" + i + "][" + j + "]:"));
            }
        }

        // input matrix B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai B[" + i + "][" + j + "]:"));
            }
        }

        // hitung matrix C
        String keterangan = "";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (npm % 2 == 1) {
                    c[i][j] = a[i][j] + b[i][j];
                    keterangan = "NPM ganjil, C = A + B";
                } else {
                    c[i][j] = a[i][j] - b[i][j];
                    keterangan = "NPM genap, C = A - B";
                }
            }
        }

        // output
        String hasil = keterangan + "\n\nMatrix C\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += c[i][j] + "  ";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Output Matrix C", JOptionPane.INFORMATION_MESSAGE);
    }
}