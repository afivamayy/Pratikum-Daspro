import java.util.Scanner;

public class hitungBalok03 {

    static int hitungLuas(int p, int l) {
        return p * l;
    }

    static int hitungVolume(int p, int l, int t) {
        return p * l * t;
    }

    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

    public static int Jumlah(int bil1, int bil2) {
        return bil1 + bil2;
    }

    public static void TampilJumlah(int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t;

        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = sc.nextInt();

        int luas = hitungLuas(p, l);
        int volume = hitungVolume(p, l, t);

        System.out.println("Luas persegi panjang adalah " + luas);
        System.out.println("Volume balok adalah " + volume);

        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);

        sc.close();
    }
}
