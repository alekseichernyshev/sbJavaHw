package HW1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        final double CONST = 1.60934;
        Scanner console = new Scanner(System.in);
        double kilometer = console.nextDouble();
        if (kilometer > 0 && kilometer < 1000)
            System.out.println(kilometer + " километров равно: " + kilometer / CONST + " миль.");
    }
}
