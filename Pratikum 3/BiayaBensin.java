import java.util.Scanner;

public class BiayaBensin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jarak;
        double liter, biaya;

        System.out.print("Masukkan jarak perjalanan (km): ");
        jarak = sc.nextInt();

        liter = jarak / 2.0;
        biaya = liter * 10000;

        System.out.println("Bensin yang dibutuhkan: " + liter + " liter");
        System.out.println("Biaya bensin perjalanan: Rp. " + biaya);

        sc.close();
    }
}
