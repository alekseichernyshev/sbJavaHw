package HW2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        String apple = "iphone";
        String samsung = "samsung";

        Scanner console = new Scanner(System.in);
        String phone = console.nextLine();
        String prise = console.nextLine();
        int cost = Integer.parseInt(prise);

        if(phone.contains(apple) | phone.contains(samsung)) {
            if (cost >= 50000 && cost <= 120000) {
                System.out.println("Можно купить");
            } else {
                System.out.println("Не подходит");
            }
        }else {
            System.out.println("Не подходит");
        }


    }
}
