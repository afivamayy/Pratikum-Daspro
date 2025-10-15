public class studikasus2 {
    public static void main(String[] args) {
        double lebartanah = 50;
        double panjangtanah = 100;
        double luastanah = lebartanah * panjangtanah;

        double diameter = 2;
        double jariJari = diameter / 2;
        double luaskolam1 = 3.14 * jariJari * jariJari;
        double luaskolam3 = luaskolam1 * 2;

        double sisiPersegi = 2;
        double luaskolam2 = sisiPersegi * sisiPersegi;

        double totalLuasKolam = luaskolam3 + luaskolam2;

        double luasRumput = luastanah - totalLuasKolam;

        System.out.println("=== Perhitungan Luas Tanah Pak Jaka ===");
        System.out.println("Luas tanah            : " + luastanah + " m2");
        System.out.println("Luas kolam lingkaran  : " + luaskolam3 + " m2");
        System.out.println("Luas kolam persegi    : " + luaskolam2 + " m2");
        System.out.println("Total luas kolam      : " + totalLuasKolam + " m2");
        System.out.println("Luas untuk rumput     : " + luasRumput + " m2");
    }
}
