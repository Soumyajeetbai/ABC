package som.workspace.com;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
 
public class Duplicate {
 
    public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        //convert string array to list
        List<String> tmpList = Arrays.asList(strArr);
        TreeSet<String> unique = new TreeSet<String>(tmpList);
        System.out.println(unique);
    }
}
