
import java.util.*;
public class sortZeros {
    public static void main(String[] args){

        int[] arr = new int[15];
        arr = new int[]{1, 2, 4, 6, 0, 3, 0, 4, 5, 6, 0, 7, 0};
        int i, j = 0, k = 0;
        List<Integer> zero = new ArrayList<Integer>();
        List<Integer> nonZero = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();


        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero.add(arr[i]);
            else
                nonZero.add(arr[i]);
        }
        nonZero.sort(Comparator.naturalOrder());

        nonZero.addAll(zero);
        System.out.println(nonZero);
    }

}
