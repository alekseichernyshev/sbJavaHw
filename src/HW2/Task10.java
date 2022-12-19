package HW2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double n = console.nextDouble();

        if(Math.log(Math.pow(Math.E, n)) == n)
        {
            System.out.println("true");
        }

    }
}
