package Java_day7.Collection.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while (true){
            System.out.println("Enter your string: ");
            String tmp = in.nextLine();
            if(tmp.equalsIgnoreCase("exit")){
                break;
            }
            stringSet.add(tmp);
            System.out.println(stringSet);
        }
        in.close();
    }
}
