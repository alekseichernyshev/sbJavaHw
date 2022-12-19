package HW2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        String s = console.nextLine();

        System.out.println(s.substring(0, s.lastIndexOf(' ')));
        System.out.println(s.substring(s.lastIndexOf(' ') + 1, s.length()));




    }
}
