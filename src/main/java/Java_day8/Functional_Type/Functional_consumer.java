package Java_day8.Functional_Type;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Functional_consumer {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
        Consumer<Double> y = x -> {
            double y1 = 3 * x * x + 5 * x - 1;
            System.out.println(y1);
        };
        for(double n: numbers){
            y.accept(n);
        };

        Consumer<List<Double>> f = doubles -> {
            for(int i = 0; i < doubles.size(); i++){
                doubles.set(i, 2 * doubles.get(i));
            }
        };
        System.out.println("Number: " + numbers);
        f.accept(numbers);
        System.out.println("Number: " + numbers);
    }
}
