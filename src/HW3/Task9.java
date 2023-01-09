package HW3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int result = 0;

        while (true)
        {
            int n = console.nextInt();
            if(n < 0)
            {
                result ++;
            } else break;
        }
        System.out.println(result);

    }
}
