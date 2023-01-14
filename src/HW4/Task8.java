package HW4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];

        for (int i = 0; i< array.length; i++){
            array[i] = console.nextInt();
        }


        int m = console.nextInt();

        int min = Math.abs(array[0] - m);
        int resultNumber = array[0];

        for (int i = 1; i<size; i++){

            if (Math.abs(array[i] - m) <= min)
            {
                min = Math.abs(array[i] -m);
                resultNumber = array[i];
            }

        }
        System.out.println(resultNumber);
    }
}
