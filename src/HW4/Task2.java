package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size1 = console.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = console.nextInt();
        }
        int size2 = console.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = console.nextInt();
        }
        if(Arrays.equals(array1, array2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
