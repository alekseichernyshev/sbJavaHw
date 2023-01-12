package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        double[] array = new double[size];
        for (int i = 0; i< array.length; i++){
            array[i] = console.nextDouble();
        }
        Square(array, 2);
        Arrays.sort(array);

        for (int i = 0; i< array.length; i++){
            System.out.print((int)array[i] + " ");
        }


    }

    public static void Square(double[] array, double n){
        n = 2.0;
        for (int i = 0; i< array.length; i++){
            array[i] = Math.pow(array[i], n);
        }

    }
}
