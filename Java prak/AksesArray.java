import java.util.InputMismatchException;
import java.util.Scanner;

public class AksesArray {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Data array: {10, 20, 30}");
        System.out.println("Indeks valid: 0, 1, 2");
        System.out.print("Masukkan indeks array: ");

        try {
            int indeks = scanner.nextInt(); 
            int nilai = angka[indeks]; 
            System.out.printf("Nilai pada indeks %d: %d%n", indeks, nilai);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks di luar batas array!");
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
        } 
        finally {
            System.out.println("Program selesai.");
            scanner.close();
        }
    }
}