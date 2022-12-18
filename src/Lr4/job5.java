package Lr4;

import java.util.Random;
public class job5 {
    public static void main(String[] args) {
        int k = 20;
        int m = 20;
        int size = k;
        int size2 = m;
        System.out.println("Размер массива равен "+ size); // Сообщение пользователю "для красоты и понимания"
        int[][] nums = new int[size][size2]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
        for (int i = 0 ; i < 3 ; i++ ){
            System.out.println(" "); // Сообщение пользователю "для красоты и понимания"
            for (int j = 0 ; j < 5 ; j++ )
            {
                nums[i][j] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
                System.out.print(" [" +i +  j+ "]    " + nums[i][j] + " | "); // Сообщение пользователю "для красоты и понимания"
            }
        }
        System.out.println("Перевернем массив");
        size = m; // Запись в переменную Size (нужная для того чтобы задать размер массива)
        size2 = k;

        for (int i = 0 ; i < 5 ; i++ ){
            System.out.println(" "); // Сообщение пользователю "для красоты и понимания"
            for (int j = 0 ; j < 3 ; j++ )
            {
                int a =0;
                nums[j][i] += nums[i][j] & a;
                System.out.print(" [" +i +  j+ "]    " + nums[j][i] + " | "); // Сообщение пользователю "для красоты и понимания"
                nums[i][j] += a;
            }
        }
    }
}