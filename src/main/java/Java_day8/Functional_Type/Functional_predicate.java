package Java_day8.Functional_Type;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functional_predicate {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "chinh dep trai", "Hehe", "bu");
        Function<String, Integer> demsoTu = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int count =0;
                if(s.charAt(0) != ' '){
                    count++;
                }
                for(int i = 1; i < s.length() - 1; i++){
                    if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                        count ++;
                    }
                }
                return count;
            }
        };
        Predicate<String> soTuLonHon2 = s ->
             demsoTu.apply(s)  > 2;

        Predicate<String> kiemTraCoChuA = s -> (s.contains("a"));

        for(String s: stringList){
            if(soTuLonHon2.test(s) && kiemTraCoChuA.test(s)){
                System.out.println(s);
            }
        }
    }
}
