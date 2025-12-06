import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        // Membuat Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        boolean ulangi = true;

        do {
            // Membuat objek Random untuk menghasilkan angka acak                                                       int total = 0;
            Random random = new Random();
            int angkaRahasia = random.nextInt(100) + 1; // Angka antara 1-100

            // ArrayList untuk menyimpan tebakan
            ArrayList<Integer> tebakanList = new ArrayList<>();

            System.out.println("Selamat datang di permainan tebak angka!");
            System.out.println("Komputer telah memilih angka antara 1-100. Coba tebak!");
            System.out.println("Anda memiliki maksimal 100 percobaan.");

            boolean tebakanBenar = false;
            int percobaan = 0;
            final int MAX_PERCOBAAN = 100;

            while (!tebakanBenar && percobaan < MAX_PERCOBAAN) {
                percobaan++;
                System.out.print("Percobaan " + percobaan + "/" + MAX_PERCOBAAN + ". Masukkan tebakan Anda: ");
                int tebakan = scanner.nextInt();

                // Simpan tebakan ke ArrayList
                tebakanList.add(tebakan);

                if (tebakan > angkaRahasia) {
                    System.out.println("Tebakan terlalu tinggi. Coba lagi!");
                } else if (tebakan < angkaRahasia) {
                    System.out.println("Tebakan terlalu rendah. Coba lagi!");
                } else {
                    System.out.println("Anda menebak dengan benar!");
                    tebakanBenar = true;
                }
            }

            // Cek hasil permainan
            if (tebakanBenar) {
                System.out.println("Selamat! Anda menang.");
            } else {
                System.out.println("Anda kalah! Angka rahasianya adalah " + angkaRahasia + ".");
            }

            // Tampilkan semua tebakan setelah permainan selesai
            System.out.println("Tebakan Anda selama permainan:");
            for (int i = 0; i < tebakanList.size(); i++) {
                System.out.println((i + 1) + ". " + tebakanList.get(i));
            }

            // Hitung dan tampilkan total jumlah semua tebakan
           int total = 0;
           for(int tebakan : tebakanList){
            total += tebakan;
           }
            System.out.println("Total jumlah semua tebakan: " +
             total);

            // Ditanyakan apakah ingin mengulangi
            System.out.print("Apakah Anda ingin mengulangi permainan? (ya/tidak): ");
            String jawaban = scanner.next().toLowerCase();
            if (!jawaban.equals("ya")) {
                ulangi = false;
            }

        } while (ulangi);

        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
}
