import java.util.Scanner;

public class nestedUjianSkripsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.println("Apakah mahasiswa sudah bebas kompen? ");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukan jumlah log bimbingan Pembimbing 1: ");
        int bimbingan1 = sc.nextInt();
        System.out.println("Masukan jumlah log bimbingan pembimbing 2: ");
        int bimbingan2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbingan1 >= 8 && bimbingan2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbingan1 < 8 && bimbingan2 < 4) {
                pesan = "Gagal! log bimbingan 1 kurang dari 8 kali dan bimbingan 2 kurang dari 4 kali";
            } else if (bimbingan1 < 8) {
                pesan = "Gagal! log bimbingan 1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! log bimbingan 2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);

        sc.close();
    }
}
