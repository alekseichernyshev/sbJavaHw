package HW2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double x = console.nextDouble();
        x = x * Math.PI / 180.0;




            if (Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2) - 1 == 0)
            {
                System.out.println("true");
            }
            else {
                System.out.println(Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2) - 1 );
            }
        }

    }

