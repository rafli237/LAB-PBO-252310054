public class Latihan02 {
    public static void main(String[] args) {
        int[] nilai = new int[5];

        // mengisi array pakai looping
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = (i + 1) * 10;
        }

        // mencetak array pakai looping
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("nilai[" + i + "] = " + nilai[i]);
        }
    }
}