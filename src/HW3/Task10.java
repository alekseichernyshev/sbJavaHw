package HW3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int count = 0;

        for (int i = 0; i < n; System.out.println(), i++) {
            for (int k = 1; k < n - i; k++)
                System.out.print(" ");
            for (int k = 0; k < 1 + i * 2; k++)
                System.out.print("#");
        }
        for (int i = 0; i < n-1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}


