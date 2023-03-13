package Java_day6.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Storage<String, Integer> s1 = new Storage<>("chinh",0376264416);
        System.out.println(s1.toString());

        Storage<String, String> s2 = new Storage<>("HELLO","Xin chào");
        System.out.println(s2.toString());

        Storage<String, List<String>> s3 = new Storage<>("FUCK", Arrays.asList("yaahhh", "oh eahhh"));
        System.out.println(s3.toString());
    }
}
