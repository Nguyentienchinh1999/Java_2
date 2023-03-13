package Java_day8.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, List<Car>> listMap = new HashMap<>();
        Person p1 = new Person(1, "User1","Male");
        Person p2 = new Person(2, "User2","FeMale");
        Person p3 = new Person(3, "User3","Male");

        Car c1 = new Car(1, "red", "SUZUKI");
        Car c2 = new Car(2, "black", "TOYOTA");
        Car c3 = new Car(3, "Blu", "FERARY");

        listMap.put(p1, Arrays.asList(c1));
        listMap.put(p2, Arrays.asList(c2));
        System.out.println(listMap);


        List<Car> p1List = new ArrayList<>(listMap.get(p1));
        p1List.add(c3);
        listMap.put(p1, p1List);
        System.out.println(listMap);




    }
}
