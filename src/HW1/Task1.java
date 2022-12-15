package HW1;

import java.util.Scanner;

/*
Вычислите и выведите на экран объём шара, получив его радиус с консоли
 */
 public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double r = console.nextDouble();

        System.out.println(4. / 3 * Math.PI * Math.pow(r, 3) );

    }
}
