package Java_day8.functional;

@FunctionalInterface
public interface Myfunctional {
    // functional interface chỉ chúa 1 phương thúc trừu tượng
    // đánh dấu là functional interface bằng anotation

    double calculator(double a, double b);
}
