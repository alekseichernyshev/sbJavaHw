package HW2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        if(x > -100 && x < 100 && y > -100 && y < 100)
        {
            if(x > 0 && y > 0)
            {
                System.out.println("true");
            }
            else
                System.out.println("false");
        }

    }
}
