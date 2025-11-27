import java.util.Scanner;

public class rekapPenjualanCafe03 {
    Scanner sc = new Scanner(System.in);
    String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    int[][] penjualan = new int[5][7]; 

    void inputPenjualan() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    void tampilkanData() {
        System.out.println("\n=== Tabel Penjualan ===");
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= 7; h++) {
            System.out.printf("H%d\t", h);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%d\t", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    void tampilMenuTertinggi() {
        int maxTotal = 0;
        String menuTertinggi = "";

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi: " + menuTertinggi);
        System.out.println("Total penjualan: " + maxTotal);
    }

    void tampilRataRata() {
        System.out.println("\n=== Rata-rata Penjualan Tiap Menu ===");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / 7;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        rekapPenjualanCafe03 app = new rekapPenjualanCafe03();

        app.inputPenjualan();
        app.tampilkanData();
        app.tampilMenuTertinggi();
        app.tampilRataRata();
    }
}
