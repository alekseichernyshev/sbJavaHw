package HW4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }
        Arrays.sort(array);
//        for (int i = 0; i<size; i++) {
//            System.out.print(array[i] + " ");
//        }

        int temp = 1;
        int count = 1;
        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (array[i] == array[j]) {
                    temp++;

                    i++;
                }
            }
            count = temp;
            temp = 1;

            System.out.println(count + " " + array[i]);
        }
    }
}
