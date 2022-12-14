package HW1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();
        int hours, minutes;
        hours = count / 3600;
        minutes = count % 3600 / 60;


        if(count > 0 && count < 86400){
            System.out.println(hours + " " + minutes);

        }

    }
}
