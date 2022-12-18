package Lr4;

import java.util.Random;
public class job6 {
    public static void main(String[] args) {
        int k = 20;
        int m = 20;
        int size = k;
        int size2 = m;
        System.out.println("Размер массива равен "+ size); // Сообщение пользователю "для красоты и понимания"
        int[][] nums = new int[size][size2]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
        for (int i = 0 ; i < 4 ; i++ ){
            System.out.println(" "); // Сообщение пользователю "для красоты и понимания"
            for (int j = 0 ; j < 5 ; j++ )
            {
                nums[i][j] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
                System.out.print(" [" +i +  j+ "]    " + nums[i][j] + " | "); // Сообщение пользователю "для красоты и понимания"
            }

        }
        System.out.println(" Удалим строку и столбец ");
        int i1 =0;
        i1 = random.nextInt(4);
        int j1 =0;
        j1 = random.nextInt(5);
        int[][] nums2 = new int[size-1][size2-1];
        for (int i = 0 ; i < 4 ; i++ ){
            if (i != i1 ) {
                System.out.println(" "); // Сообщение пользователю "для красоты и понимания"
            for (int j = 0 ; j < 5 ; j++ )
            {
                if (j != j1 )
                    System.out.print(" [" +i +  j+ "]    " + nums[i][j] + " | "); // Сообщение пользователю "для красоты и понимания"
            }
        }
        }
        System.out.println(" Удалили " +i1 + " строку и " + j1+ " столбец ");
}}