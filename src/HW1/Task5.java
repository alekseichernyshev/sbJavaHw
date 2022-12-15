package HW1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        final double CONST = 2.54;
        Scanner console = new Scanner(System.in);
        double inch = console.nextDouble();
        if(inch > 0 && inch < 1000)
        System.out.println(inch * CONST);


    }
}
