import java.util.ArrayList;
import java.util.Scanner;

class Paket {
    String nama;
    long biayaProduksi;
    long hargaJual;
    int jumlahEvent;
    long totalBiaya;
    long totalPendapatan;
    long labaRugi;
    String status;

    public Paket(String nama, long biaya, long harga, int jumlah) {
        this.nama = nama;
        this.biayaProduksi = biaya;
        this.hargaJual = harga;
        this.jumlahEvent = jumlah;
        this.totalBiaya = biaya * jumlah;
        this.totalPendapatan = harga * jumlah;
        this.labaRugi = totalPendapatan - totalBiaya;
        if (labaRugi > 0) {
            status = "Laba";
        } else if (labaRugi < 0) {
            status = "Rugi";
        } else {
            status = "Impas";
        }
    }
}

public class AnalisisLabaRugiPhotobooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah paket: ");
        int n = sc.nextInt();
        ArrayList<Paket> paketList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Paket " + (i + 1));
            System.out.print("Nama paket: ");
            String nama = sc.next();
            System.out.print("Biaya produksi per event: ");
            long biaya = sc.nextLong();
            System.out.print("Harga jual per event: ");
            long harga = sc.nextLong();
            System.out.print("Jumlah event terjual: ");
            int jumlah = sc.nextInt();
            Paket p = new Paket(nama, biaya, harga, jumlah);
            paketList.add(p);
        }

        // Hitung total laba/rugi dan paket dengan laba tertinggi
        long totalLaba = 0;
        Paket maxPaket = null;
        long maxLaba = Long.MIN_VALUE;
        for (Paket p : paketList) {
            totalLaba += p.labaRugi;
            if (p.labaRugi > maxLaba) {
                maxLaba = p.labaRugi;
                maxPaket = p;
            }
        }

        // Tampilkan tabel
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Nama Paket | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("---------------------------------------------------------------------------");
        for (Paket p : paketList) {
            System.out.printf("%-10s | Rp%,10d | Rp%,15d | Rp%,10d | %s%n", 
                              p.nama, p.totalBiaya, p.totalPendapatan, p.labaRugi, p.status);
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("Total Laba/Rugi Keseluruhan: Rp%,d%n", totalLaba);
        if (maxPaket != null) {
            System.out.printf("Paket dengan Laba Tertinggi: %s (Rp%,d)%n", maxPaket.nama, maxPaket.labaRugi);
        }

        sc.close();
    }
}
