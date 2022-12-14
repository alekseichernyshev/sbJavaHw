package HW1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        if(number > 9 && number < 100){
            System.out.print(number % 10);
            System.out.print(number / 10);
        }

    }
}
