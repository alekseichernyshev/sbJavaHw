package HW4;

import com.sun.source.tree.WhileLoopTree;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int length = PasswordLength(8);
        System.out.println(length);
        System.out.println(CreatePassword(length));
        Password(length);

    }

    /**
     * Метод для ввода пользователем количества символов в пароле
     * @param m число менее которого не может быть пароль
     * @return количество символов в пароле, который необходимо сгенерировать
     */
    public static int PasswordLength(int m) {
        System.out.println("Введите желаемую длянну пароля (не менее восьми символов): ");
        int n = 0;
        Scanner console = new Scanner(System.in);
        while (n < m) {
            n = console.nextInt();
            if (n<m) {
                System.out.println("Пароль состоящий из менее чем восьми символов не безопасен," +
                        " пожалуйста, введите число не менее восьми:  ");
            }
        }
        return n;
    }

    /**
     * метод генерирует пароль, который обязательно содержит строчные и заглавные буквы, а так же цифры и
     * специальные символы. В дангном методе существует крайне малая вероятность отсутствие какого либо из
     * элементов, это сделано для большей рандомности пароля.
     * @param length количество символов в генерируемом пароле
     */
    public static void Password(int length) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_', '*', '-'};
        SecureRandom random = new SecureRandom();
        char[] password = new char[length];


        for (int i = 0; i < length; i++) {  // заполняем массив случайными элементами из массива элементов chars
            int randomIndex = random.nextInt(chars.length); // для выбора случайного индекса инициализируем метод рандом
            password[i] = chars[randomIndex];
        }
        int pasRandomIndex = random.nextInt(password.length); // принудительно заполняем случайную позицию
        int randomIndex = random.nextInt(0, 25); // в массиве password
        password[pasRandomIndex] = chars[randomIndex];       // случайным элементов из отрезка с загл буквами
        randomIndex = random.nextInt(25, 51);    // из отрезка со строчными буквами
        password[pasRandomIndex] = chars[randomIndex];
        randomIndex = random.nextInt(52, 61);    // из отрезка с цифрами
        password[pasRandomIndex] = chars[randomIndex];
        randomIndex = random.nextInt(62, 64);    // из отрезка со специальными символами
        password[pasRandomIndex] = chars[randomIndex];


        for (int i = 0; i < length; i++) {                  // выводим массив в консоль
            System.out.print(password[i]);
        }

    }

    /**
     * метод генерирует пароль, который обязательно содержит строчные и заглавные буквы, а так же цифры и
     * специальные символы. В данном методе исключена вероятность отсутсвия какого-либо из требуемых
     * элементов. Основа метода взята в интернете и доработана(основа не гарантировала наличие всех
     * требуемых элементов)
     * @param length количество символов в генерируемом пароле
     * @return сгенерированный пароль
     */
    public static String CreatePassword(int length) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_*-";
        SecureRandom random = new SecureRandom();// инициализируем метод SecureRandom для определения случайной позиции
        StringBuilder password = new StringBuilder();// иниц мет StringBuilder для того чтобы собрать строку

        for (int i = 0; i < length / 4; i++) {    // собираем строку из случайных заглавных букв
            int randomIndex = random.nextInt(0, 25);
            password.append(chars.charAt(randomIndex));
        }

        for (int i = length / 4; i < length / 2; i++) { // добавляем в строку случайные строчные буквы
            int randomIndex = random.nextInt(25, 51);
            password.append(chars.charAt(randomIndex));
        }

        for (int i = length / 2; i < length - 2; i++) { // добавляем в строку случайные цифры
            int randomIndex = random.nextInt(52, 61);
            password.append(chars.charAt(randomIndex));
        }

        for (int i = length - 1; i < length + 1; i++) { // добавляем в строку специальные символы
            int randomIndex = random.nextInt(62, 64);
            password.append(chars.charAt(randomIndex));
        }


        return password.toString(); // возвращаем строку с паролем

    }
}






