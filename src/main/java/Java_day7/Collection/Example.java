package Java_day7.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Example {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("hello");
        stringCollection.add("hi");
        System.out.println(stringCollection);

        stringCollection.remove("hello");
        System.out.println(stringCollection);

        System.out.println(stringCollection.size());
    }
}
