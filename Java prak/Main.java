// Nama file harus sama dengan nama class: PembagianJava.java
import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input pengguna

public class PembagianJava {

    public static void main(String[] args) {
        // Membuat objek Scanner sekali saja untuk seluruh program
        Scanner scanner = new Scanner(System.in);
        
        // 1. BLOK TRY: Mencoba menjalankan kode yang berisiko
        try {
            System.out.print("Masukkan bilangan pertama: ");
            double a = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Masukkan bilangan kedua: ");
            double b = Double.parseDouble(scanner.nextLine());
            
            // PENANGANAN ERROR PEMBAGIAN NOL SECARA MANUAL
            // Pengecekan dilakukan karena pembagian double dengan 0.0 di Java
            // menghasilkan "Infinity", bukan error.
            if (b == 0) {
                // Kita "lemparkan" error sendiri agar bisa ditangkap oleh blok catch
                throw new ArithmeticException("Pembagi tidak boleh nol");
            }
            
            // Melakukan operasi pembagian jika semua pengecekan lolos
            double hasil = a / b;

            // Menampilkan hasil dengan format yang rapi
            System.out.printf("Hasil: %.2f%n", hasil);
            
        } 
        // 2. BLOK CATCH: Menangkap error jika terjadi
        catch (NumberFormatException e) {
            // Blok ini menangkap error jika input tidak bisa diubah menjadi angka
            System.out.println("Error: Input harus berupa angka");
        } 
        catch (ArithmeticException e) {
            // Blok ini menangkap error pembagian nol yang kita lempar secara manual
            System.out.println("Error: " + e.getMessage());
        } 
        // 3. BLOK FINALLY: Kode yang selalu dijalankan di akhir
        finally {
            // Menutup scanner untuk melepaskan sumber daya sistem
            scanner.close();
        }
    }
}