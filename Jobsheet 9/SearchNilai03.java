import java.util.Scanner;

public class SearchNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Nilai yang dicari tidak ditemukan!");
        }

        sc.close();
    }
}
