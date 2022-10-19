import java.util.Random;
public class array {
    public static void main(String[] args){
        int arr[],min=99999,max=0;
        arr =new int[10];
        Random random=new Random();
        for (int i=0;i<10;i++)
        {
            arr[i]= random.nextInt(101);
        }
        for (int i=0;i<10;i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
        for (int i=0;i<10;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Maximum in the array is="+max);
        System.out.println("Minimum in the array is="+min);

    }



}
