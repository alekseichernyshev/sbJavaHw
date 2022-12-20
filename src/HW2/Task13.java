package HW2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        String stone = "камни!";
        String forbidden = "запрещенная продукция";

        Scanner console = new Scanner(System.in);
        String pack = console.nextLine();

        if (pack.contains(stone) & pack.contains(forbidden)) {
            System.out.println("в посылке камни и запрещенная продукция");
        } else if (pack.contains(stone)) {
            System.out.println("камни в посылке");
        }else
            if (pack.contains(forbidden)) {
                System.out.println("в посылке запрещенная продукция");
            } else {
                System.out.println("все ок");
            }



    }
}
