import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean[] isPrime = new boolean[b + 1];

        for (int i = 2; i <= b; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= b; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= b; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = a; i <= b; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
