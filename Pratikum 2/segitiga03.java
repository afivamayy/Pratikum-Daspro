import java.util.Scanner;

public class segitiga03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.print("Masukan alas: ");
        alas = input.nextInt();
        System.out.print("Masukan tinggi: ");
        tinggi = input.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas segitiga: " + luas);
    }
}
