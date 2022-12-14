package HW1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = console.nextDouble();
        double budget_for_person = console.nextDouble();
        int person;
        if(budget > 0 && budget < 100000)
            if(budget_for_person > 0 && budget_for_person < 1000)
                if( budget_for_person < budget)
                    System.out.println((int)(budget / budget_for_person));

    }
}
