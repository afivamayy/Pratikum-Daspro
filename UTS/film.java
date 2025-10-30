import java.util.Scanner;
public class film {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukan umur: ");
        int umur = sc.nextInt();

        if (umur < 12) {
            System.out.println("Film anak-anak");
        } else if (umur > 17) {
            System.out.println("Film dewasa");
        } else {
            System.out.println("Film remaja");
        }

        sc.close();
    }
}