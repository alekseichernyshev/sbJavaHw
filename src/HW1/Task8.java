package HW1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        final int DAYS = 30;
        Scanner console = new Scanner(System.in);
        double balance = console.nextDouble();
        if(balance > 0 && balance < 100000)
        System.out.println(balance / DAYS);

    }
}
