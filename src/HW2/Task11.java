package HW2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if(a + b > c & a + c > b & b + c > a)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
