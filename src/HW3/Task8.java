package HW3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int p = console.nextInt();
        int result = 0;

        for (int i = 0; i<n; i++)
        {
            int numbers = console.nextByte();
            if(numbers > p)
            {
                result += numbers;
            }
        }
        System.out.println(result);
    }
}

