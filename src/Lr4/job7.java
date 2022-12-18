package Lr4;
import java.util.Arrays;
public class job7 {
    public static void main(String[] args) {
        int k = 5;
        int m = 5;
        int size = k;
        int size2 = m;
        int a = 0;
        int b=6;
        System.out.println("Размер массива равен "+ size); // Сообщение пользователю "для красоты и понимания"
        int[][] nums = new int[size][size2]; // Создание массива с размером введённым из консоли
        for (int i = 0 ; i < 4 ; i++ ){
            int u = 5;
            b--;
            System.out.println(" "); // Сообщение пользователю "для красоты и понимания"
            for (int j = 0 ; j < 5 ; j++ )
            {
                if (j<u)
                {
                    if (j<b) {
                        nums[i][j] = 1 + a; // Присвоение i-тому элементу массива случайного значения
                        System.out.print(" [" + i + j + "]    " + nums[i][j] + " | "); // Сообщение пользователю "для красоты и понимания"
                        a++;
                    }
                }
                else
                {
                }
                if (j==4)
                {
                    for (int i1 =4;  i1>i; i1-- ) {

                        int j1=4-i;
                        nums[i1][j1] = 1 + a; // Присвоение i-тому элементу массива случайного значения
                        System.out.print(" [" + i1 + j1 + "]    " + nums[i1][j1] + " | "); // Сообщение пользователю "для красоты и понимания"
                        a++;
                        u--;
                    }
                }
            }
        }
        nums[4][0] = 1 + a;
        System.out.println(" "); // Сообщение пользователю "для красоты и понимания"
        System.out.println("//////////////////////////////////////////////////////// ");
        Arrays.stream(nums).map(Arrays::toString).forEach(System.out::println);
    }
}
