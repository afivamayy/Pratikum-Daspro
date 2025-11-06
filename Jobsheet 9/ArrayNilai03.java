import java.util.Scanner;

public class ArrayNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // for (int i = 0; i<10; i++) {
        //     System.out.println("Mahasiswa ke-" + (i + 1) + " = " + nilaiAkhir[i]);
        // }

        System.out.println("\nStatus Kelulusan:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
                System.out.println("Mahasiswa ke-" + i + " LULUS");
            } else {
                System.out.println("Mahasiswa ke-" + i + " TIDAK LULUS");
            }
        }

        sc.close();
    }
}
