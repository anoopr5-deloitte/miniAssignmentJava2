import java.util.Random;
public class array {
    public static void main(String[] args){
        int arr[],min=101,max=0,i;
        arr =new int[10];
        Random random=new Random();
        System.out.print("\nGenerated Array : [ ");
        for (i=0;i<10;i++)
        {
            arr[i]= random.nextInt(101);
            System.out.print(arr[i] + " ");
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        System.out.print("]\n");
        System.out.println("Maximum in the array = "+max);
        System.out.println("Minimum in the array = "+min);
    }
}
