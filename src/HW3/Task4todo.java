package HW3;

import java.util.Scanner;

public class Task4todo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

      for (int i = console.nextInt(); i > 0; i /= 10) {
           System.out.println(i % 10);
      }

    }
}
