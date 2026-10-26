import javax.swing.JOptionPane;

public class Latihan08 {
    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
        String data[][] = new String[3][3];

        // input data 3 orang
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = JOptionPane.showInputDialog(null, "Masukan " + field[j] + ":",
                        "Data array ke-[" + i + "][" + j + "]", JOptionPane.QUESTION_MESSAGE);
            }
        }

        // output
        String hasil = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil += field[j] + ": " + data[i][j] + "\n";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}