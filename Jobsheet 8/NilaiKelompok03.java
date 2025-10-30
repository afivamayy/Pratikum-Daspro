import java.util.Scanner;

public class NilaiKelompok03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahKelompok = 6;
        int jumlahPenilai = 5;
        double totalNilai, rataNilai;
        double rataTertinggi = 0;
        int kelompokTertinggi = 0;

        int i = 1;
        while (i <= jumlahKelompok) {
            System.out.println("Kelompok " + i);

            totalNilai = 0; 

            for (int j = 1; j <= jumlahPenilai; j++) {
                System.out.print("Masukkan nilai dari penilai ke-" + j + ": ");
                double nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / jumlahPenilai;
            System.out.println("Rata-rata nilai kelompok " + i + " = " + rataNilai);
            System.out.println("-------------------------");

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok "
                + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);

        sc.close();
    }
}
