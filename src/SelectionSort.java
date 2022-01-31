import java.util.Arrays;

public class SelectionSort {

    public void sort() {
        int []array = new int[] {20,10,30};
        for (int i = 0 ; i < array.length ; i++ ) {
            int min_index = i;
            for (int j = i+1 ; j < array.length ; j ++) {
                min_index = i;
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;
            }
        }

        System.out.println(Arrays.toString(array));
    }


}
