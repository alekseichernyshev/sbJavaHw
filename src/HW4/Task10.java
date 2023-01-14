package HW4;


import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

/*
Необходимо реализовать игру. Алгоритм игры должен быть записан в отдельном методе.
В методе main должен быть только вызов метода с алгоритмом игры.

Условия следующие:
Компьютер «загадывает» (с помощью генератора случайных чисел) целое число M в промежутке от 0 до 1000 включительно.
Затем предлагает пользователю угадать это число. Пользователь вводит число с клавиатуры.
Если пользователь угадал число M, то вывести на экран "Победа!".
Если введенное пользователем число меньше M, то вывести на экран "Это число меньше загаданного."
Если введенное число больше, то вывести "Это число больше загаданного."
Продолжать игру до тех пор, пока число не будет отгадано или пока не будет введено любое отрицательное число.

 */
public class Task10 {
    public static void main(String[] args) {

        int m = RandomNumber(1001);
        //System.out.println(m);
        Game(m);
    }

    /**
     * Метод генерирующий случайное число в диапазоне от 0 до number не включая number
     *
     * @param number число ограничивающее диапазон
     * @return сгенерированное рандомное число
     */
    public static int RandomNumber(int number) {
        Random random = new Random();
        int k = random.nextInt(number);
        return k;
    }

    /**
     * метод позволяющий пользователю вводить числа с консоли до тех пор пока он не угадает число
     * или введёт любое отрицательное число.
     *
     * @param m сгенерированное число
     */

    public static void Game(int m) {

        Scanner console = new Scanner(System.in);
        int n = 0;

        while (n >= 0 & n != m) {
            n = console.nextInt();


            if (n < 0) {
                System.out.println("Игра окончена");
            } else if (n == m) {
                System.out.println("Победа!");


            } else if (n < m) {
                System.out.println("Это число меньше загаданного");
            } else {
                System.out.println("Это число больше загаданного");

            }
        }

    }
}
