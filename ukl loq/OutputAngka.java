public class OutputAngka {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
            if (i == 1) {
                System.out.println(i + ". saya senang");
            } else if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 34");
            } else if (i % 3 == 1) {
                System.out.println(i + ". saya anak wikusama");
            } else {
                System.out.println(i + ". saya anak moklet");
            }
        }
    }
}

