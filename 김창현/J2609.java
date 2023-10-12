package 김창현;

import java.util.Scanner;

public class J2609 {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int LCM(int a, int b) {
        return (a * b / GCD(a, b));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int gcdResult = GCD(a, b);
        int lcmResult = LCM(a, b);

        System.out.println(gcdResult);
        System.out.println(lcmResult);

        in.close();
    }
}
    
