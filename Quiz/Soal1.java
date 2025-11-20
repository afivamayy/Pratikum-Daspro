package Quiz;

public class Soal1 {
    public static void main(String[] args) {
        char[] huruf = "abcdefghijklmno".toCharArray();
        
        for (int i = 0; i < 5; i++) {
            System.out.print(huruf[i] + " ");
            System.out.print(huruf[i + 5] + " ");
            System.out.println(huruf[i + 10]);
        }
    }
}
