import java.io.*;
import java.util.*;
import java.util.Arrays;

public class fileHandling {
    public static void main(String [] args){
        List<ArrayList<String>> students = new ArrayList<ArrayList<String>>();
        int i = 0;
        String line = "";
        String splitBy = ",";
        String[] st = new String[10];
        try
        {
            File csvFile = new File("C:/Users/anoopr5/IdeaProjects/Main/src/output.csv");
            FileWriter fileWriter = new FileWriter(csvFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bw);

            BufferedReader br = new BufferedReader(new FileReader("C:/Users/anoopr5/IdeaProjects/Main/src/stdentData.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] student = line.split(splitBy);    // use comma as separator
                students.add(new ArrayList<String>(Arrays.asList(String.valueOf(student[0]), String.valueOf(student[1]), String.valueOf(student[2]))));
            }
            Collections.sort(students, new Comparator<ArrayList<String>>() {
                public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                    return o1.get(2).compareTo(o2.get(2));
                }
            });

            for(i = students.size()-1; i > students.size() - 6; i--) {
                st = students.get(i).toArray(new String[0]);
                pw.println(st[0] + "," + st[1] + "," + st[2]);
            }
            pw.close();
            fileWriter.close();
            System.out.println("ADDED TOP 5 STUDENTS TO OUTPUT CSV SUCCESSFULLY");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    final Comparator<List<String>> comparator = new Comparator<List<String>>() {
        public int compare(List<String> pList1, List<String> pList2)
        {
            return pList1.get(2).compareTo(pList2.get(2));
        }
    };
}

