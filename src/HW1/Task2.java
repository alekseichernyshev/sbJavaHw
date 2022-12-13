package HW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberA = console.nextInt();
        int numberB = console.nextInt();

        if(numberA > 0 && numberB < 100){
            System.out.println(Math.sqrt((Math.pow(numberA,2) + Math.pow(numberB,2)) / 2.));
        }

    }
}
