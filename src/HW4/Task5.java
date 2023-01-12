package HW4;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }
        int m = console.nextInt();

        if(m !=0){
        ShiftArray(array, m);}

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // метод сдвига массива
    public static void ShiftArray(int[] array, int m) {

            if (m > 0) {
                for (int i = 0; i < m; i++) {
                    int temp = array[array.length - 1];

                    for (int j = array.length - 1; j > 0; j--) {
                        array[j] = array[j - 1];
                    }
                    array[0] = temp;
                }
            }

    }
}
