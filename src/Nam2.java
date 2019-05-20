import java.util.Arrays;

public class Nam2 {
    /*Написать программу, принимающую массив целых чисел, в котором м.б. повторения,
    и возвращающую новый массив без повторяющихся числел, и печатающую результат. В результирующем массиве не должно
    быть дубликатов.*/
    public static void main(String[] args) {
        int[] array = {1,2,2,4,1,6,7,7,9};
        boolean[] mask = new boolean[array.length];

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ArrayReplay(array, mask)));
    }
    public static int[] ArrayReplay(int[] array, boolean[] mask) {
        int count = 0;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if(!mask[i]){
                temp = array[i];

                for (int j = i + 1; j < array.length; j++){
                    if(temp == array[j]){
                        mask[j]=true;
                        count++;
                    }
                }
            }

        }
        int[] arrayNew = new int[array.length - count];

        for (int i = 0, j = 0; i < array.length; i++){
            if(!mask[i]){
                arrayNew[j++] = array[i];
            }
        }
              return arrayNew;

    }

}
