import java.util.Scanner;
public class KopiSenja03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = sc.nextInt();
        int totalPelangganSemuaCabang = 0;
        int totalItemSemuaCabang = 0;

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n=== Cabang ke-" + i + " ===");
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int jumlahPelanggan = sc.nextInt();
            int totalItemCabang = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Masukkan jumlah item yang dipesan oleh pelanggan ke-" + j + ": ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }
            System.out.println("Total item terjual di cabang ke-" + i + " = " + totalItemCabang);
            System.out.println("Total pelanggan di cabang ke-" + i + " = " + jumlahPelanggan);
            System.out.println("-----------------------------------");
            totalPelangganSemuaCabang += jumlahPelanggan;
            totalItemSemuaCabang += totalItemCabang;
        }
        System.out.println("\n=== RINGKASAN PENJUALAN ===");
        System.out.println("Total seluruh pelanggan: " + totalPelangganSemuaCabang);
        System.out.println("Total seluruh item terjual: " + totalItemSemuaCabang);
        sc.close();
    }
}
