import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Contoh array input
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        
        // Menggunakan HashMap untuk menghitung frekuensi
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterasi melalui array dan hitung frekuensi
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Cetak hasil frekuensi
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
    }
}
