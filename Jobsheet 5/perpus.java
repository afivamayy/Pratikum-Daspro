import java.util.Scanner;
public class perpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- SISTEM IZIN MASUK PERPUSTAKAAN ---");
        System.out.print("Apakah membawa kartu mahasiswa? ");
        boolean kartuMahasiswa = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? ");
        boolean registrasiOnline = sc.nextBoolean();
        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Ditolak masuk");
        }
        sc.close();
    }
}
