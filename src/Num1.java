import java.util.Arrays;

public class Num1 {
    /*Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
     Цикличность означает, что последний элемент массива становится самым первым его элементом.
      */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int plase = 1;
        System.out.println(Arrays.toString(ArrayRight(array,plase)));

    }
    public static int[] ArrayRight(int[] array, int plase) {

        int size = array.length;

        for (int i = 0; i < plase; i++) {
            int temp = array[size - 1];

            for (int j = size - 1; j > 0; j--) {

                array[j] = array[j-1];
            }
            array[0] = temp;
        }
        return array;
    }
}
