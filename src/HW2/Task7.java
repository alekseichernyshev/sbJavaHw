package HW2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        String s = console.nextLine();

        System.out.println(s.substring(0, s.indexOf(' ')));
        System.out.println(s.substring(s.indexOf(' ') + 1, s.length()));




    }
}
