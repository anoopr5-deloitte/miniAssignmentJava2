import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.List;
import java.util.*;
public class reverse_collection {
    public static void main(String[]args){

        ArrayList<String> lst = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        lst.add("HashedinByDeloitte");
        char temp; int last;
        System.out.println(lst);

/*        last=lst.size();
        for(int i=0;i<lst.size()/2;i++)
        {
            temp= lst[i];
            lst[i].add(lst[last]);
            lst[last]=temp;
        }


        for(int i=lst.size()-1;i>=0;i--)
        {
           System.out.println(lst.subList(i,i+1));
           //result.add(lst.get(i));
        }
        */
        Collections.reverse(lst);
        System.out.println(lst);
    }
}
