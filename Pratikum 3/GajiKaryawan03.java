import java.util.Scanner;

public class GajiKaryawan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        int tunjTransp = 600000, tunjMkn = 400000;

        System.out.print("Masukkan gaji pokok: Rp. ");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;
        totGaji = (gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok)) * 12;

        System.out.println("Bonus bulanan: Rp. " + (int) bonus);
        System.out.println("Total gaji setahun: Rp. " + (int) totGaji);

        sc.close();
    }
}
