import java.util.Scanner;

public class kafe03 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 10000};
        return hargaItem[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grandTotal = 0;
        String lanjut;

        System.out.println("=== SELAMAT DATANG DI KAFE ===");

        do {
            System.out.println("\n==== MENU RESTO KAFE ====");
            System.out.println("1. Kopi Hitam - Rp. 15,000");
            System.out.println("2. Capucino - Rp. 20,000");
            System.out.println("3. Latte - Rp. 22,000");
            System.out.println("4. Teh Tarik - Rp. 12,000");
            System.out.println("5. Roti Bakar - Rp. 10,000");
            System.out.println("6. Mie Goreng - Rp. 10,000");
            System.out.println("==========================");

            System.out.print("Pilih menu (1–6): ");
            int pilihanMenu = input.nextInt();

            System.out.print("Jumlah porsi: ");
            int banyakItem = input.nextInt();

            int totalPesanan = hitungTotalHarga(pilihanMenu, banyakItem);
            grandTotal += totalPesanan;

            System.out.println("Total harga menu ini: Rp. " + totalPesanan);

            input.nextLine(); 
            System.out.print("Ingin pesan menu lain? (ya/tidak): ");
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("\n=================================");
        System.out.println("Total keseluruhan pesanan: Rp. " + grandTotal);
        System.out.println("Terima kasih telah memesan!");
    }
}
