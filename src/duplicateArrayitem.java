public class duplicateArrayitem {
    public static void main(String [] args)
    {
        String arr[]={"java","anoop","javahungry","anoop","java"};

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                    System.out.println(arr[i]);
            }
        }

}

}