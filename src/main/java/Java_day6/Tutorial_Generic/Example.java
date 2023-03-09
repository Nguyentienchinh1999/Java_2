package Java_day6.Tutorial_Generic;

import Java_day6.Tutorial_Generic.Box;

public class Example {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.put("String");
        System.out.println(b1.getBox());

        Box<Integer> b2 = new Box<>();
        b2.put(123);
        System.out.println(b2.getBox());

        Box<Box> b3 = new Box<>();
        b3.put(b1);
        System.out.println(b3.getBox().getBox());
    }
}
