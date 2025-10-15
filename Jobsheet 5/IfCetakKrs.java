import java.util.Scanner;

public class IfCetakKrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---CETAK KRS SIAKAD---");
        System.out.println("Apakah UKT lunas? ");
        boolean uktLunas = sc.nextBoolean();

        String pesan;
        pesan = (uktLunas == true) ? "Silahkan cetak KRS" : "Silahkan bayar UKT terlebih dahulu";
        System.out.println(pesan);

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // } else {
        //     System.out.println("Registrasi ditolak. Silahkan bayar UKT terlebih dahulu");
        // }

        sc.close();
    }
}