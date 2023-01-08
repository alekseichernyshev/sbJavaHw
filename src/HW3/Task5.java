package HW3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int x = m;
        int count = 0;
        while (x - n >= 0) {
            x -= n;
            count++;

        }
        System.out.println(m - n * count);


    }
}
