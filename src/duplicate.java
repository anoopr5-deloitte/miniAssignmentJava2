
import java.io.*;

class duplicate {
    static int negativeArray(int arr[], int n)
    {
        int result = 0,i,val;

        for ( i = 0; i <= n - 1; i++) {
             val = 0;
            for (int j = i; j <= n - 1; j++) {
                val = val + arr[j];
                if (val < 0)
                    result++;
            }
        }
        return (result);
    }


    public static void main(String[] args)
    {
        int arr[] = { 1,2,-1,3,-3,-5};
        int len= arr.length;
        System.out.print("The Number of Subarrays with negative sum is ");
        System.out.println(negativeArray(arr, len));
    }
}


