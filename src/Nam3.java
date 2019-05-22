import java.util.Arrays;

import static java.util.Arrays.sort;

public class Nam3 {

    /**Заданы 2 массива целых чисел произвольной длины.Написать программу, создающую третий массив,
    представляющий собой слияние 2-х заданных.*/

    public static void main(String[] args) {

        int[] array1 ={5,6,8,7,4,1,2,4};
        int[] array2 ={1,2,5,9,8,7,4,1,2};

        System.out.println(Arrays.toString(arrayNew(array1,array2)));
    }
    private static int[] arrayNew(int array1[],int array2[]){
        int[] array3 = new int [array1.length + array2.length];
        int max = Math.max(array1.length, array2.length);

        for(int i = 0, j = 0;i !=max; i++){
            if(i<array1.length)
                array3[j++] = array1[i];
            if(i<array2.length)
                array3[j++] = array2[i];
        }
        sort(array3);
        return array3;
    }
}
