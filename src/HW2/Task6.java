package HW2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();

        if(count >= 0 && count <= 100000)
        {
            if(count < 500)
            {
                System.out.println("beginner");
            }
            else if(count < 1500)
            {
                System.out.println("pre-intermediate");
            }
            else if(count < 2500)
            {
                System.out.println("intermediate");
            }
            else if(count < 3500)
            {
                System.out.println("upper-intermediate");
            }
            else if(count >= 3500)
            {
                System.out.println("fluent");
            }
        }

    }
}
