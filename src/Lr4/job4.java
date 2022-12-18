package Lr4;
import java.util.Scanner;
public class job4 {

    public static void main(String[] args) {

        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        int [][] figure = new int[8][8];
        for (i = 1 ; i <= figure.length; i++){
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = 0 +i ; j <= figure[0].length; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }}}