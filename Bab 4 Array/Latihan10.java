import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan10 {
    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
        ArrayList<String> data = new ArrayList<String>();

        // mengisi ArrayList
        for (int i = 0; i < 3; i++) {
            String isi = JOptionPane.showInputDialog(null, "Masukan " + field[i] + ":",
                    "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            data.add(isi);
        }

        // output
        String hasil = "";
        for (int i = 0; i < 3; i++) {
            hasil += field[i] + ": " + data.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}