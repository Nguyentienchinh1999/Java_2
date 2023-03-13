package Java_day8_baitap.funcitonal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String name = "NGUYEN TIEN CHINH";
        String name2 = "ANH LA ai";
        MyFunctional count = s -> s.length();
        System.out.println("so ky tu trong chuoi la: " + count.stringHandling(name));

        MyFunctional calculator = s -> {
            boolean check = true;
            int count12 = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != '\n' && s.charAt(i) != ' ' && s.charAt(i) != '\t'){
                    if(check){
                        count12++;
                        check = false;
                    }
                }else {
                    check = true;
                }
            }
            return count12;
        };
        System.out.println("số từ trong chuỗi là: " + calculator.stringHandling(name));

        MyFunctional countA = s -> {
            int count1 = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'A'){
                    count1++;
                }

            }
            return count1;
        };
        System.out.println("số từ có a hoặc A là: " + countA.stringHandling(name2));

        MyFunctional countUnduplicated = s -> {
            Set<Character> characterSet  =new HashSet<>();
            for(int i = 0; i < s.length(); i++){
                characterSet.add(s.charAt(i));
            }
            return characterSet.size();
        };
        System.out.println(countUnduplicated.stringHandling("HELLO"));
    }
}
