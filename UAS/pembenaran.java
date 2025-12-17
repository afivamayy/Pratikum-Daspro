package UAS;

public class pembenaran {
    public static boolean Prima(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int n = 3; 

        if (Prima(n)) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}
