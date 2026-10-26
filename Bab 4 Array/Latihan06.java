import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];

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

        // output
        String hasil = "Matrix A\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += a[i][j] + "  ";
            }
            hasil += "\n";
        }

        hasil += "\nMatrix B\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += b[i][j] + "  ";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Output Matrix", JOptionPane.INFORMATION_MESSAGE);
    }
}