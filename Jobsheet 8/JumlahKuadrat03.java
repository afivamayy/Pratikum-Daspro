import java.util.Scanner;

public class JumlahKuadrat03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat = 0;

            for (int j = 1; j <= i; j++) {
                jumlahKuadrat += j * j;
            }

            System.out.println("n = " + i + " → jumlah kuadrat = " + jumlahKuadrat);
        }

        sc.close();
    }
}
