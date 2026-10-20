import javax.swing.JOptionPane;

public class Latihan04 {

    // Method input: kalau klik Cancel / Close (x), tampil konfirmasi keluar.
    // Yes = program selesai, No = kembali mengisi form yang sama.
    static String inputDialog(String pesan) {
        while (true) {
            String hasil = JOptionPane.showInputDialog(null, pesan);
            if (hasil != null) {
                return hasil.trim();
            }
            if (konfirmasiKeluar()) {
                System.exit(0);
            }
        }
    }

    // Method konfirmasi keluar, return true kalau pilih Yes
    static boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin keluar ?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return pilihan == JOptionPane.YES_OPTION;
    }

    public static void main(String[] args) {
        Biodata bio = new Biodata();

        while (true) {
            // Input data
            String fullname = inputDialog("Masukkan Fullname:");
            String usiaStr = inputDialog("Masukkan Usia:");
            String alamat = inputDialog("Masukkan Alamat:");

            // Validasi field tidak boleh kosong
            if (fullname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (usiaStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Validasi usia harus angka
            int usia;
            try {
                usia = Integer.parseInt(usiaStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Isian usia harus angka",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (alamat.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Validasi alamat minimal 10 karakter
            if (alamat.length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            // Semua valid: simpan dan tampilkan info
            bio.setFullname(fullname);
            bio.setUsia(usia);
            bio.setAlamat(alamat);

            JOptionPane.showMessageDialog(null,
                    "Fullname : " + bio.getFullname() + "\n" +
                    "Usia     : " + bio.getUsia() + "\n" +
                    "Alamat   : " + bio.getAlamat(),
                    "Data Biodata",
                    JOptionPane.INFORMATION_MESSAGE);

            // Setelah klik OK, tanya keluar atau tidak
            if (konfirmasiKeluar()) {
                System.exit(0);
            }
            // Kalau No, loop berulang dan kembali ke form Fullname
        }
    }
}