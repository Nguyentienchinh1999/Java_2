package Java_day8_baitap.Functional_3;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        Faker faker = new Faker(new Locale("vi"));

        for (int i = 0; i < 1000; i++) {
            Human human = new Human();
            human.setId(i);
            faker.name().nameWithMiddle();
            human.setFirstName(faker.name().lastName());
            human.setLastName(faker.name().firstName());
            human.setCity(faker.address().cityName());
            human.setGender(faker.number().numberBetween(0, 2));
            human.setAge(faker.number().numberBetween(10, 51));
            human.setSalary(faker.number().numberBetween(10, 3001));
            humanList.add(human);
        }
//        humanList.stream().forEach(p-> System.out.println(p));

//        nam tren 18 tuoi
//       long countMan18 = humanList.stream()
//                .filter(human -> human.getAge() > 18 && human.getGender() == 1)
//                .count();
//        System.out.println("số người trên 18 là " + countMan18);

//          nữ có tên đệm là thị
//        long countWomanThi = humanList.stream()
//                .filter(human -> human.getGender()==0 && human.getFullName().contains("thị"))
//                .count();
//        System.out.println("số người có tên đệm thị là: " + countWomanThi);
//

//        Họ nguyễn và sắp xêp theo thứ tự chữ cái
        humanList.stream()
                .filter(human -> human.getLastName().toLowerCase().equalsIgnoreCase("Nguyễn"))
                .sorted((o1, o2) -> {
                    if(o1.getFullName().compareTo(o2.getFullName()) > 0){
                        return 1;
                    }else if(o1.getFullName().compareTo(o2.getFullName()) < 0){
                        return -1;
                    }
                    return 0;
                }).forEach(System.out::println);


//        tuổi từ 20 - 30
//        humanList.stream()
//                .filter(human -> human.getAge() >= 20 && human.getAge() <= 30)
//                .forEach(System.out::println);

        //    đếm số lượng thành phố có trong danh sách gợi ý distinct
        long countCity = humanList.stream()
                .map(new Function<Human, String>() {
                    @Override
                    public String apply(Human human) {
                        return human.getCity();
                    }
                }).distinct().count();
        System.out.println("có tất cả số tp là: " + countCity);

//        lấy ra 10 người đầu tiên trong danh sách gợi
        humanList.stream().limit(10).forEach(System.out::println);

//        tính độ tuổi trung bình
        int[] tuoi = {0};
        int[] songuoi = {0};

        humanList.stream()
                .forEach(human ->{
                    songuoi[0]++;
                    tuoi[0] += human.getAge();
                });
        System.out.println("độ tuổi trung bình là: " + tuoi[0]/songuoi[0]);
//tính mức lương trung bình của nam ở độ tuổi 20-40

        double[] tongluong = {0};
        int[] soNguoi = {0};
            humanList.stream()
                    .filter(human -> human.getAge() >= 20 && human.getAge() <= 40)
                    .forEach(human -> {
                        soNguoi[0] ++;
                        tongluong[0] += human.getSalary();
                    });
        System.out.println("trùng bình lương: " + tongluong[0] / soNguoi[0]);

//        sắp xếp danh sách theo độ tuổi
        humanList.stream()
                .sorted(new Comparator<Human>() {
                    @Override
                    public int compare(Human o1, Human o2) {
                        if(o1.getAge() > o2.getAge()){
                            return 1;
                        }else if(o1.getAge() < o2.getAge()){
                            return -1;
                        }return 0;
                    }
                }).forEach(System.out::println);

    }

}
