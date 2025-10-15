import java.util.Scanner;

public class CicilanMotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bunga, totalHutang, cicilanPerBulan, cicilanPokok;
        int harga, uangMuka, sisaHarga, lamaCicilan;  

        System.out.print("Masukkan harga (Rp): ");
        harga = sc.nextInt();

        System.out.print("Masukkan uang muka (Rp): ");
        uangMuka = sc.nextInt();

        System.out.print("Masukkan lama cicilan : ");
        lamaCicilan = sc.nextInt();

        sisaHarga = harga - uangMuka;
        bunga = 0.01 * sisaHarga * lamaCicilan;
        totalHutang = sisaHarga + bunga;
        cicilanPokok = (double) sisaHarga / lamaCicilan;
        cicilanPerBulan = totalHutang / lamaCicilan;

        System.out.println("Cicilan pokok per bulan: Rp. " + cicilanPokok);
        System.out.println("Jumlah cicilan per bulan (termasuk bunga): Rp. " + cicilanPerBulan);

        sc.close();
    }
}
