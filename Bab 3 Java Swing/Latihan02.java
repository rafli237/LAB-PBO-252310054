import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata bio = new Biodata();

        String fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:");
        String usiaStr = JOptionPane.showInputDialog(null, "Masukkan Usia:");
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat:");

        int usia = Integer.parseInt(usiaStr);

        bio.setFullname(fullname);
        bio.setUsia(usia);
        bio.setAlamat(alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n" +
                "Usia     : " + bio.getUsia() + "\n" +
                "Alamat   : " + bio.getAlamat(),
                "Data Biodata",
                JOptionPane.INFORMATION_MESSAGE);
    }
}