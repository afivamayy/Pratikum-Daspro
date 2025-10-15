import java.util.Scanner;

public class KelulusanMahasiswa {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        int nim = sc.nextInt();

        System.out.println("\n---- Mata Kuliah 1: Algoritma dan Pemrograman ----");
        System.out.print("Nilai UTS   : ");
        int uts1 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        int uas1 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugas1 = sc.nextInt();

        double nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        String huruf1 = "";
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) {
            huruf1 = "A";
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
            huruf1 = "B+";
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
            huruf1 = "B";
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
            huruf1 = "C+";
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
            huruf1 = "C";
        } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) {
            huruf1 = "D";
        } else {
            huruf1 = "E";
        }
        String status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK";

        System.out.println("\n---- Mata Kuliah 2: Struktur Data ----");
        System.out.print("Nilai UTS   : ");
        int uts2 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        int uas2 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int tugas2 = sc.nextInt();

        double nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        String huruf2 = "";
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            huruf2 = "A";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            huruf2 = "B+";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            huruf2 = "B";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            huruf2 = "C+";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            huruf2 = "C";
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
            huruf2 = "D";
        } else {
            huruf2 = "E";
        }
        String status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK";

        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        String statusSemester = (rataRata >= 70) ? "LULUS (Rata-rata >= 70)" : "TIDAK LULUS (Rata-rata < 70)";

        System.out.println("\n===================== HASIL PENILAIAN AKADEMIK =====================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Mata Kuliah             | UTS | UAS | Tugas | Nilai Akhir | Huruf | Status");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman   | " + uts1 + "  | " + uas1 + "  | " + tugas1 + "    | " + nilaiAkhir1 + "        | " + huruf1 + "     | " + status1);
        System.out.println("Struktur Data           | " + uts2 + "  | " + uas2 + "  | " + tugas2 + "    | " + nilaiAkhir2 + "        | " + huruf2 + "     | " + status2);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Rata-rata Nilai Akhir : " + rataRata);
        System.out.println("Status Semester       : " + statusSemester);

       sc.close();
    }
}
