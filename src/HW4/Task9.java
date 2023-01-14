package HW4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i<n; i++)
        {
            arr[i]= console.next();
        }

        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
