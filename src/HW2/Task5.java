package HW2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();


        if(a > -100 && a < 100 && b > -100 && b < 100 && c > -100 && c < 100)
        {
           if(Math.pow(b, 2) - 4 * a * c < 0 )
           {
               System.out.println("Решения нет");
           }
           else
               System.out.println("Решение есть");
        }

    }
}
