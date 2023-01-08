package HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();

        int sum = 0;

        for (int i = m; i<=n; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
