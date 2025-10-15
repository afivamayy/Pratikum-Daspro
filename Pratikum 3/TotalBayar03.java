import java.util.Scanner;

public class TotalBayar03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double harga;
        double jml_bayar, diskon = 0.15;

        System.out.print("Masukkan harga: Rp. ");
        harga = sc.nextDouble();

        jml_bayar = harga - (diskon * harga);

        System.out.println("Besar diskon: Rp. " + (diskon * harga));
        System.out.println("Jumlah yang harus dibayar: Rp. " + jml_bayar);

        sc.close();
    }
}
