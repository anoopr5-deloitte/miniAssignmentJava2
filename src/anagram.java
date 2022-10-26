import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class anagram {
    public static void main(String []args){

        String s1="listen";
        String s2="slient";

        List<Character> list1 = new ArrayList<Character>();
        List<Character> list2 = new ArrayList<Character>();

        for (int i = 0; i < s1.length(); i++)
        {
            list1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++)
        {
            list2.add(s2.charAt(i));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        if (list1.equals(list2))
            System.out.println("It is Anagram!");
        else
            System.out.println("It is not a Anagram");

    }
}
