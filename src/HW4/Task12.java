package HW4;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

/*

Решить задачу 7 основного дз за линейное время.
На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов,
отсортированный по возрастанию.

Необходимо создать массив, полученный из исходного возведением в квадрат каждого элемента,
упорядочить элементы по возрастанию и вывести их на экран.
 */

/**
 * Насколько я понял линейная временная сложность означает, что время решения задачи прямопропорционально
 * зависит от размера входящих данных, всвязи с этим я использовл цикл for, если ошибся, прошу дать
 * обратную связь.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.print(Arrays.toString(SquareArrayFromConsole(n)));// применять в случае отсутствия необ выводить
                                                                     // исходный массив в консоль
//        double[] array = CreateArray(n);             // строки с 28 по 31 применять если исходный массив
//        System.out.println(Arrays.toString(array));  // необходимо выводить в консоль
//        double[] squareArray = SquareArray(array);
//        System.out.println(Arrays.toString(array));


    }

    /**
     * Метод создания и заполнения с консоли массива
     *
     * @param n длинна массива
     * @return метод возвращает заполненный с консоли массив
     */
    public static double[] CreateArray(int n) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    /**
     * Метод возведения каждого элемента массива в квадрат и упорядочивание массива по возрастанию
     * @param array массив элементы которого необходимо возвести в квадрат
     * @return упорядоченный по возрастанию массив с возведёнными в квадрат элементами
     */
    public static double[] SquareArray(double[] array) {
        double[] squareArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.pow(array[i], 2);
        }
        Arrays.sort(squareArray);
        return squareArray;
    }

    /**
     * Метод используется в случае если нет необходимости выводить в консоль исходный массив.
     *
     * @param n количество элементов массива
     * @return упорядоченный по возрастанию массив с возведёнными в квадрат элементами
     */
    public static double[] SquareArrayFromConsole(int n){
        Scanner input = new Scanner(System.in);
        double[] array = new double[n];
        for (int i = 0; i<n; i++){
            array[i] = Math.pow(input.nextDouble(), 2);
        }
        Arrays.sort(array);
        return array;

    }

}
