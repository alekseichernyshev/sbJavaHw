package HW3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int result = 0;
        for (int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                result++;
            }
        }
        System.out.println(result);
    }
}
