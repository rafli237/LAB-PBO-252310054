public class Latihan01 {
    public static void main(String[] args) {
        // Local variable
        double celcius = 36.5;

        double fahrenheit = (celcius * 9 / 5) + 32;
        double reamur = celcius * 4 / 5;
        double kelvin = celcius + 273.15;

        System.out.println("Suhu Celcius    : " + celcius + " C");
        System.out.println("Suhu Fahrenheit : " + fahrenheit + " F");
        System.out.println("Suhu Reamur     : " + reamur + " R");
        System.out.println("Suhu Kelvin     : " + kelvin + " K");
    }
}