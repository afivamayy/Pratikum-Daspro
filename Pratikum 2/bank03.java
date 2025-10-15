import java.util.Scanner;

public class bank03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_tabunganawal, lama_menabung;
        double presentase_bunga = 0.02, bunga, jml_tabunganakhir;

        System.out.println("Masukan jumlah tabungan awal: ");
        jml_tabunganawal = input.nextInt();
        System.out.println("Masukan lama menabung: ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * presentase_bunga * jml_tabunganawal;
        jml_tabunganakhir = bunga + jml_tabunganawal;

        System.out.println("Total bunga " + bunga);
        System.out.println("Jumlah tabungan akhir " + jml_tabunganakhir);

    }
}
