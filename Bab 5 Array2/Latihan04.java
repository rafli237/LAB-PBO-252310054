import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {
        String[][] data = {
            { "Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210" },
            { "Isnan Mulia", "Jl.Manunggal, Bogor", "+62 819-3208-0875" },
            { "Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384" }
        };
        String[] kolom = { "Nama Lengkap", "Alamat", "No Telp" };

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            ArrayList<String> baris = new ArrayList<>();
            for (int j = 0; j < kolom.length; j++) {
                String s = JOptionPane.showInputDialog(
                        "Data ke-" + (i + 1) + "\nMasukkan " + kolom[j] + " :", data[i][j]);
                if (s == null) System.exit(0);
                baris.add(s);
            }
            list.add(baris);
        }

        // Urutkan Ascending (A-Z) berdasarkan Nama Lengkap (kolom indeks 0)
        Collections.sort(list, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> a, ArrayList<String> b) {
                return a.get(0).compareToIgnoreCase(b.get(0));
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-4s %-20s %-38s %s%n", "No", kolom[0], kolom[1], kolom[2]));
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%-4d %-20s %-38s %s%n", (i + 1),
                    list.get(i).get(0), list.get(i).get(1), list.get(i).get(2)));
        }

        JOptionPane.showMessageDialog(null, sb.toString(),
                "Data Terurut Ascending berdasarkan Nama Lengkap", JOptionPane.INFORMATION_MESSAGE);
    }
}