package HW2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if (a > 0 && a < 100 && b > 0 && b < 100 && c > 0 && c < 100)
        {
            if(c < b & b < a)
            {
                System.out.println("Петя, пора трудиться");
            }
            else
            {
                System.out.println("Петя молодец!");
            }
        }



    }
}
