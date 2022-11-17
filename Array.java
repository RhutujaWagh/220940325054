import java.util.ArrayList;
import java.util.List;

/*
Q1 : Write a Java program to create a new array list, add some elements (string) and print out
the collection by using for-each loop. (10 Marks)
 */
public class Array
{
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("java");
        ls.add("python");
        ls.add("big data");
        ls.add("linux");
        ls.add("cloud");

        ls.forEach((ele) -> System.out.println("Collection of elements:"+ele));

    }

}
