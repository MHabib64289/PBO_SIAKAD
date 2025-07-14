
import java.util.Scanner;

public class TryCatchFinallyDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pembilang;
        int penyebut;
        int hasil;

        try {
            System.out.print("Masukkan pembilang: ");
            pembilang = input.nextInt();

            System.out.print("Masukkan penyebut: ");
            penyebut = input.nextInt();

            hasil = pembilang / penyebut; // Akan menimbulkan ArithmeticException jika penyebut = 0
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: Pembagian dengan nol tidak diperbolehkan.");
            System.out.println("Detail error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally tetap dijalankan untuk memastikan kebersihan resource.");
            input.close();
        }

        System.out.println("Program selesai.");
    }
}