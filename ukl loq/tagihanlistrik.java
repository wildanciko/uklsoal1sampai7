import java.util.Scanner;

public class tagihanlistrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan golongan listrik (A, B, atau C): ");
        String golongan = scanner.nextLine().toUpperCase(); // Mengubah ke uppercase untuk konsistensi
        
        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        int pemakaian = scanner.nextInt();
        
        // Inisialisasi tarif berdasarkan golongan
        double tarif = 0.0;
        switch (golongan) {
            case "A":
                tarif = 1200.0;
                break;
            case "B":
                tarif = 1500.0;
                break;
            case "C":
                tarif = 1800.0;
                break;
            default:
                System.out.println("Golongan tidak valid. Program berhenti.");
                return; // Keluar dari program jika golongan tidak valid
        }
        
        // Hitung total tagihan sebelum tambahan
        double totalSebelum = pemakaian * tarif;
        
        // Hitung total tagihan akhir
        double totalAkhir;
        if (pemakaian > 500) {
            totalAkhir = totalSebelum * 1.1; // Tambahan 10%
        } else {
            totalAkhir = totalSebelum;
        }
        
        // Tampilkan output
        System.out.println("\n--- Rincian Tagihan Listrik ---");
        System.out.println("Nama pelanggan: " + nama);
        System.out.println("Golongan listrik: " + golongan);
        System.out.println("Pemakaian listrik: " + pemakaian + " kWh");
        System.out.println("Total tagihan sebelum tambahan: Rp " + String.format("%.0f", totalSebelum));
        System.out.println("Total tagihan akhir: Rp " + String.format("%.0f", totalAkhir));
        
        scanner.close();
    }
}
