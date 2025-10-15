import java.util.Scanner;

public class studikasus2modifikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lebar tanah (meter): ");
        double lebarTanah = input.nextDouble();

        System.out.print("Masukkan panjang tanah (meter): ");
        double panjangTanah = input.nextDouble();

        System.out.print("Masukkan diameter kolam lingkaran (meter): ");
        double diameterLingkaran = input.nextDouble();
        double jariJari = diameterLingkaran / 2;

        System.out.print("Masukkan sisi kolam persegi (meter): ");
        double sisiPersegi = input.nextDouble();

        double luasTanah = lebarTanah * panjangTanah;
        double luasKolamLingkaran = 3.14 * jariJari * jariJari;
        double luasKolamPersegi = sisiPersegi * sisiPersegi;
        double totalLuasKolam = luasKolamLingkaran + luasKolamPersegi;
        double luasRumput = luasTanah - totalLuasKolam;

        System.out.println("Perhitungan Luas Tanah Pak Jaka");
        System.out.println("Luas tanah            : " + luasTanah + " m2");
        System.out.println("Luas kolam lingkaran  : " + luasKolamLingkaran + " m2");
        System.out.println("Luas kolam persegi    : " + luasKolamPersegi + " m2");
        System.out.println("Total luas kolam      : " + totalLuasKolam + " m2");
        System.out.println("Luas untuk rumput     : " + luasRumput + " m2");

        input.close();
    }
}
