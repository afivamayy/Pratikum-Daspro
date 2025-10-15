import java.util.Scanner;
public class wifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- SISTEM HOTSPOT KAMPUS ---");
        System.out.print("Jenis pengguna (dosen/mahasiswa/lainnya): ");
        String pengguna = sc.nextLine().trim().toLowerCase();

        if (pengguna.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (pengguna.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
}
