// Java code to illustrate toArray()

import java.util.*;

public class hashSet_Array {
    public static void main(String args[])
    {
        HashSet<String> hashset = new HashSet<String>();


        hashset.add("Welcome");
        hashset.add("To");
        hashset.add("Hashedin");
        hashset.add("By");
        hashset.add("Deloitte");

        System.out.println("The HashSet: "+ hashset);
        Object[] arr = hashset.toArray();

        System.out.println("The array is:");
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
    }
}
