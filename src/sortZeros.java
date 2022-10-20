import java.util.Arrays;
public class sortZeros {
    public static void main(String[] args){

        int[] arr = new int[15];
        arr = new int[]{1, 2, 4, 6, 0, 3, 0, 4, 5, 6, 0, 7, 0};
        int i, j = 0, k = 0;
        int zero[]=new int[4];
        int nonZero[]=new int [9];
        int result[]=new int [13];

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero[j++] = arr[i];
            else
                nonZero[k++]=arr[i];
        }
        for (i = 0; i < zero.length; i++) {
            System.out.print( zero[i]+" ");
        }System.out.println("\n");
        for (i = 0; i < nonZero.length; i++) {
            System.out.print(nonZero[i]+" ");
        }
        System.out.println("\n");
        Arrays.sort(nonZero);
        for (i = 0; i < nonZero.length; i++) {
            System.out.print(nonZero[i]+" ");
        }
        System.out.println("\n");
        System.arraycopy(nonZero, 0, result, 0, nonZero.length);
        System.arraycopy(zero, 0, result, nonZero.length, zero.length);

        for (i = 0; i < result.length; i++) {
            System.out.print(+result[i]+" ");
        }
    }

}
