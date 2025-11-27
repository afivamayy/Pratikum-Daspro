public class pengunjungCafe03 {
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }


    public static void main(String[] args) {
        daftarPengunjung();
        // daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
