import java.util.Scanner;

public class Star03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print("*");
        }
        
        sc.close();
    }
}
