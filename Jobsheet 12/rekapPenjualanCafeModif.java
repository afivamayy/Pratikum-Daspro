import java.util.Scanner;

public class rekapPenjualanCafeModif {
    Scanner sc = new Scanner(System.in);
    String[] menu;          
    int[][] penjualan;      
    int jumlahMenu, jumlahHari;

    void inputJumlahData() {
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHari = sc.nextInt();
        sc.nextLine(); 

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];
    }

    void inputPenjualan() {
        System.out.println("\n=== Input Nama Menu ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    void tampilkanData() {
        System.out.println("\n=== Tabel Penjualan ===");
        System.out.printf("%-20s", "Menu");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.printf("H%d\t", h);
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("%d\t", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    void tampilMenuTertinggi() {
        int maxTotal = -1;
        String menuTertinggi = "";

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
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
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / jumlahHari;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        rekapPenjualanCafeModif app = new rekapPenjualanCafeModif();

        app.inputJumlahData();
        app.inputPenjualan();
        app.tampilkanData();
        app.tampilMenuTertinggi();
        app.tampilRataRata();
    }
}
