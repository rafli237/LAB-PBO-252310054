import java.util.Scanner;

public class Latihan09 {
    // Atribut myBio bertipe Students
    static Students myBio = new Students();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM      : ");
        Integer npm = myBio.getNPM(Integer.parseInt(input.nextLine()));

        System.out.print("Masukkan Fullname : ");
        String fullname = myBio.getFullname(input.nextLine());

        System.out.print("Masukkan ClassName: ");
        String className = myBio.getClassName(input.nextLine());

        System.out.print("Masukkan Semester : ");
        Integer semester = myBio.getSemester(Integer.parseInt(input.nextLine()));

        System.out.print("Masukkan GPA      : ");
        Float gpa = myBio.getGPA(Float.parseFloat(input.nextLine()));

        System.out.println();
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NPM       : " + npm);
        System.out.println("Fullname  : " + fullname);
        System.out.println("ClassName : " + className);
        System.out.println("Semester  : " + semester);
        System.out.println("GPA       : " + gpa);

        input.close();
    }
}