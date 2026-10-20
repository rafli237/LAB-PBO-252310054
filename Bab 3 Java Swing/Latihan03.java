import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata bio = new Biodata();

        // Input data
        String fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname:");
        String usiaStr = JOptionPane.showInputDialog(null, "Masukkan Usia:");
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat:");

        // Kalau user klik Cancel, nilainya null, jadi dianggap kosong
        if (fullname == null) fullname = "";
        if (usiaStr == null) usiaStr = "";
        if (alamat == null) alamat = "";

        // Hapus spasi di awal/akhir supaya "   " dianggap kosong
        fullname = fullname.trim();
        usiaStr = usiaStr.trim();
        alamat = alamat.trim();

        // 1. Validasi field tidak boleh kosong
        if (fullname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (usiaStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 2. Validasi usia harus angka
        int usia;
        try {
            usia = Integer.parseInt(usiaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Isian usia harus angka",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (alamat.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 3. Validasi alamat minimal 10 karakter
        if (alamat.length() < 10) {
            JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 4. Semua valid: simpan ke object dan tampilkan info
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