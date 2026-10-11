public class Latihan03 {
    // Class variable
    static double diagonal1 = 10;
    static double diagonal2 = 8;
    static double sisiA = 6;
    static double sisiB = 7;

    // Method dengan nilai balik
    static double hitungLuas() {
        double luas = 0.5 * diagonal1 * diagonal2; // local variable
        return luas;
    }

    // Method tanpa nilai balik
    static void hitungKeliling() {
        double keliling = 2 * (sisiA + sisiB); // local variable
        System.out.println("Keliling Layang-layang : " + keliling);
    }

    public static void main(String[] args) {
        // Local variable
        double luas = hitungLuas();

        System.out.println("=== Layang-layang ===");
        System.out.println("Diagonal 1 : " + diagonal1);
        System.out.println("Diagonal 2 : " + diagonal2);
        System.out.println("Sisi A     : " + sisiA);
        System.out.println("Sisi B     : " + sisiB);
        System.out.println("Luas Layang-layang     : " + luas);
        hitungKeliling();
    }
}