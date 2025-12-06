import java.util.ArrayList;
import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input jumlah elemen
        System.out.print("Masukkan jumlah elemen deret Fibonacci: ");
        int n = scanner.nextInt();

        // Memastikan n positif
        if (n <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0.");
            scanner.close();
            return;
        }

        // Input elemen pertama
        System.out.print("Masukkan elemen pertama: ");
        int first = scanner.nextInt();

        // Input elemen kedua
        System.out.print("Masukkan elemen kedua: ");
        int second = scanner.nextInt();

        if (n > 100) {
            System.out.println("Anda melebihi batas 100 elemen.");
            System.out.print("Apakah Anda ingin membatasi hingga 100 elemen? (ya/tidak): ");
            String batasElemen = scanner.next().toLowerCase();
            if (batasElemen.equals("ya")) {
                n = 100; 
            }
        }
        
        System.out.print("Apakah Anda ingin menghidupkan batas angka 100? (ya/tidak): ");
        String batasAktif = scanner.next().toLowerCase();

        boolean aktifkanBatas = batasAktif.equals("ya");

        // ArrayList untuk Fibonacci
        ArrayList<Integer> fibonacci = new ArrayList<>();

        if (n >= 1) {
            fibonacci.add(first); // Elemen pertama dari input
        }
        if (n >= 2) {
            fibonacci.add(second); // Elemen kedua dari input
        }
        for (int i = 2; i < n; i++) {
            int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            if (aktifkanBatas && next > 1000) {
                System.out.println("Angka terlalu besar");
                break; // Berhenti jika batas aktif dan melebihi 1000



                
            }
            fibonacci.add(next);
        }

        // Menampilkan deret Fibonacci
        System.out.println("Deret Fibonacci:");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Menghitung jumlah bilangan ganjil dan genap
        int ganjil = 0;
        int genap = 0;
        for (int num : fibonacci) {
            if (num % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
        }

        System.out.println("Jumlah bilangan genap: " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);

        scanner.close();
    }
}
