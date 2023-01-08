package HW4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextByte();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += console.nextDouble();
        }
        System.out.println(sum / n);
    }
}
