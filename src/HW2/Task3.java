package HW2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if(n >= 0 && n <= 23)
        {
            if(n > 12)
            {
                System.out.println("Пора");
            }
            else
                System.out.println("Рано");
        }

    }
}
