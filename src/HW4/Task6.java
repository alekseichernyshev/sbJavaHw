package HW4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        char[] rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п',
                'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String [] morse = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.",
                "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};

        Scanner console = new Scanner(System.in);
        String input = console.nextLine(). toLowerCase();
        char[] chars = input.toCharArray();

        String string = "";

        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < rus.length; j++){
                if (rus[j] == chars[i]){
                    string = string + morse[j] + " ";
                }
            }
        }
        System.out.print(string.trim());



    }
}
