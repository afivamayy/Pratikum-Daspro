import java.util.Scanner;

public class kafe03 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Anda mendapat diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Anda mendapat diskon 30%!");
        } else {
            System.out.println("Kode promo invalid atau tidak berlaku.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp. 15,000");
        System.out.println("2. Capucino - Rp. 20,000");
        System.out.println("3. Latte - Rp. 22,000");
        System.out.println("4. Teh Tarik - Rp. 12,000");
        System.out.println("5. Roti Bakar - Rp. 10,000");
        System.out.println("6. Mie Goreng - Rp. 10,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 10000};
        int totalHarga = hargaItem[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan!");
            totalHarga = totalHarga / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan!");
            totalHarga = totalHarga - (totalHarga * 30 / 100);
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return totalHarga;
    }

    public static void main(String[] args) {

        Menu("Andi", true, "DISKON50");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor menu yang dipilih: ");
        int pilihanMenu = input.nextInt();

        System.out.print("Masukkan jumlah porsi yang dipesan: ");
        int banyakItem = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan kode promo: ");
        String kodePromo = input.nextLine();

        int totalBayar = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total yang harus dibayar: Rp. " + totalBayar);
        input.close();
    }
}
