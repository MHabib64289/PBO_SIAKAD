// Nama file harus sama dengan nama class: PembagianJava.java
import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input pengguna

public class PembagianJava {

    public static void main(String[] args) {
        // Membuat objek Scanner sekali saja untuk seluruh program
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // 1. BLOK TRY: Mencoba menjalankan kode yang berisiko
            try {
                System.out.println("\n-----------------------------------------");
                System.out.println("Masukkan dua bilangan untuk dibagi (A/B)");

                System.out.print("Masukkan bilangan pertama (A): ");
                String strA = scanner.nextLine();

                System.out.print("Masukkan bilangan kedua (B): ");
                String strB = scanner.nextLine();

                // Mengonversi input dari String menjadi angka (double)
                // Ini berisiko memunculkan NumberFormatException jika input bukan angka
                double numA = Double.parseDouble(strA);
                double numB = Double.parseDouble(strB);

                // PENANGANAN ERROR PEMBAGIAN NOL SECARA MANUAL
                // Di Java, pembagian double dengan 0.0 tidak melempar error,
                // melainkan menghasilkan "Infinity". Jadi kita cek manual.
                if (numB == 0) {
                    // Kita "lemparkan" error sendiri agar bisa ditangkap oleh blok catch
                    throw new ArithmeticException("Bilangan kedua (pembagi) tidak boleh nol.");
                }

                double hasil = numA / numB;

                System.out.println("=========================================");
                System.out.printf("✅ SUKSES: Hasil dari %.2f / %.2f adalah: %.2f%n", numA, numB, hasil);
                System.out.println("=========================================");

            } 
            // 2. BLOK CATCH: Menangkap error jika terjadi
            catch (NumberFormatException e) {
                // Blok ini menangkap error jika Double.parseDouble() gagal
                System.out.println("\n[ERROR] Input tidak valid! Harap masukkan HANYA ANGKA.");
            } 
            catch (ArithmeticException e) {
                // Blok ini menangkap error yang kita lempar secara manual di atas
                System.out.println("\n[ERROR] " + e.getMessage());
            }

            // 3. BLOK FINALLY: Kode yang selalu dijalankan di akhir
            finally {
                System.out.println("\n--- Blok 'finally' dieksekusi ---");
                System.out.print("Apakah Anda ingin mencoba lagi? (y/n): ");
                String ulangi = scanner.nextLine().toLowerCase();
                
                if (!ulangi.equals("y")) {
                    System.out.println("\nTerima kasih! Program selesai.");
                    break; // Keluar dari loop 'while' dan menghentikan program
                }
            }
        }
        
        // Menutup scanner untuk melepaskan sumber daya sistem
        scanner.close();
    }
}