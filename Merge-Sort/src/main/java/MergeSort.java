import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MergeSort {

    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 3, 3, 5};
        int[] arr2 = new int[]{4, 5, 7};
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, min = 0;
        while (i < arr1.length) {
            if (arr1[i] < arr2[j]) {
                min = arr1[i++];
            } else {
                min = arr2[j++];
            }
            System.out.println(i + "," + j + " " + min);
        }

    }
}
