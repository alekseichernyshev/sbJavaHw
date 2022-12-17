package HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (n >= 1 && n <= 7) {
            if (n > 5) {
                System.out.println("Ура, выходные!");
            } else {
                System.out.println(6 - n);
            }
        }
    }
}
