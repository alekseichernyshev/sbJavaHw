package HW4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] array = new int[size];
        for (int i = 0; i<size;i++)
        {
            array[i] = console.nextInt();
        }
        int x= console.nextInt();

        int index = 0;
        for(int i = 0; i<size; i++)
        {
            if(x>=array[i])
                index++;

        }
        System.out.println(index);



    }
}
