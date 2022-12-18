package Lr4;

import java.util.Arrays;
import java.util.Scanner;

public class job8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String value =in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key =in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        System.out.println("chars до преобразования"+ Arrays.toString(chars));

        for(int i=0; i< chars.length; i++){
            ints[i] = chars[i] + key;
        }

        System.out.println("ints до преобразования"+ Arrays.toString(ints));

        for(int i=0; i< chars.length; i++){
            chars[i] = (char) ints[i];
        }
        System.out.println("chars после преобразования"+ Arrays.toString(chars));
        System.out.println("Выполнить обратное преобразование? (y/n)");
        char c = scanner.next().charAt(0);

        switch (c) {
            case 'y':
                System.out.println(value);
                break;
            case 'n':
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Введите корректный ответ");
                System.out.println(scanner);
        }}}