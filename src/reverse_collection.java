import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class reverse_collection
{
    public static String reverse(String str)
    {

        if (str == null || str.equals("")) {
            return str;
        }
        List<Character> list = new ArrayList<Character>();
        for (char c: str.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder(list.size());
        for (Character c: list) {
            builder.append(c);
        }

        return builder.toString();
    }

    public static void main(String[] args)
    {
        String str = "Hashedin by deloitte";
        str = reverse(str);

        System.out.println("The reverse of the given string is: " + str);
    }
}
