import java.util.Scanner;

public class studikasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = input.nextInt();

        System.out.print("Masukkan tunjangan per anak: ");
        int tunjanganPerAnak = input.nextInt();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = input.nextInt();

        int totalTunjangan = jumlahAnak * tunjanganPerAnak;

        int totalPotongan = (int)(gajiPokok * 0.05);

        int gajiBersih = gajiPokok + totalTunjangan - totalPotongan;

        System.out.println("\n=== Rincian Gaji Bu Jesi ===");
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Jumlah Anak      : " + jumlahAnak);
        System.out.println("Tunjangan Anak   : Rp " + totalTunjangan);
        System.out.println("Potongan Pensiun : Rp " + totalPotongan);
        System.out.println("Gaji Bersih      : Rp " + gajiBersih);
    }
}
