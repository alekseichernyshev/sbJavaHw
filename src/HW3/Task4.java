package HW3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int factor = 100000;
        boolean skipZero = true;
        while (factor > 0)
        {
            int d = n / factor;
            if(d > 0 || !skipZero)
            {
                System.out.println(d);
                skipZero = false;
            }
            n = n % factor;
            factor /= 10;
      }

    }
}
