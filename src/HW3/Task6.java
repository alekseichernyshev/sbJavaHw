package HW3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int count1, count2, count3, count4;
        int a = 8;
        int b = 4;
        int c = 2;
        int e = 1;
        int suma = n/a;
        int m = n - a*suma;
        int sumb = m/b;
        int o = m - b*sumb;
        int sumc = o/c;
        int p = o - c*sumc;
        int sumd = p/e;

        System.out.println(suma +" "+ sumb +" " + sumc +" " +sumd);
    }
}
