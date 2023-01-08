package HW3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= n; i++) {
            sum += Math.pow(m, i);
        }
        System.out.println(sum);
    }
}
