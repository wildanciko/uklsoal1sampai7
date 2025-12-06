import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //input
        System.out.print("Masukkan bilangan bulat: ");
        int n = scanner.nextInt();
        
        //faktorial
        long faktorial = hitungFaktorial(n);
        
        //hasil
        if (n < 0) {
            System.out.println("Faktorial tidak didefinisikan untuk bilangan negatif.");
        } else {
            System.out.println("Faktorial dari " + n + " adalah " + faktorial);
        }
        
        scanner.close();
    }

    //menghitung faktorial
    public static long hitungFaktorial(int n) {
        if (n < 0) {
            return -1; // jika Indikator error
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
