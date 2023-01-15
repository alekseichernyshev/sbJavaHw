package HW2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String password = console.nextLine();
        if(password.length() > 7)
            if(!password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase()))
                if (password.contains("_") | password.contains("*") | password.contains("-") )
                    if(password.contains("0") | password.contains("1") | password.contains("2") |
                            password.contains("3") | password.contains("4") | password.contains("5") |
                            password.contains("6") | password.contains("7") | password.contains("8") |
                            password.contains("9"))

                {
                    System.out.println("пароль надежный");
                }

                    else {
                        System.out.println("пароль не прошел проверку");
                    }
        else {
                        System.out.println("пароль не прошел проверку");
                    }
        else {
                    System.out.println("пароль не прошел проверку");
                }

    }
}
