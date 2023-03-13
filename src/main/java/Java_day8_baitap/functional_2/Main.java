package Java_day8_baitap.functional_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"chinh",24,"nam", 20));
        studentList.add(new Student(2,"Kien",24,"nam", 10));
        studentList.add(new Student(3,"Thuy",24,"nam", 12));
        studentList.add(new Student(4,"Loan",24,"nu", 100));
        studentList.add(new Student(5,"Thang",24,"nam", 90));
//        Stream
//        in ra tuổi trung bình
        double[] t = {0};
        studentList.stream().forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                t[0] = t[0] + student.getAge();
            }
        });
        System.out.println("tuoi trung binh la: " + t[0]/studentList.size());

//        In ra các bạn là nam  có điểm lớn hơn 80 và phải có chữ A

        studentList.stream().filter(student -> {
            return student.getGender().equals("nam") && student.getMark() > 80;
        }).filter(student -> student.getName().toLowerCase().contains("a")).forEach(System.out::println);

//      tạo 1 dnah sách chỉ gồm các bạn nữ sinh viên
        List<Student> newListStudent = studentList.stream()
                .filter(student ->
                    student.getGender().toLowerCase().equalsIgnoreCase("nu"))
                .collect(Collectors.toList());
        System.out.println(newListStudent);




        Function<List<Student>, Double> s1 = new Function<List<Student>, Double>() {
            @Override
            public Double apply(List<Student> students) {
                double sum = 0;
                for(int i = 0; i <  students.size(); i++){
                    sum += students.get(i).getAge();
                }
                return (sum/students.size());
            }
        };
        System.out.println(s1.apply(studentList));

      Function<List<Student>, Double> s2 = new Function<List<Student>, Double>() {
          @Override
          public Double apply(List<Student> students) {
              Double max = students.get(0).getMark();
              for(int i = 0; i < students.size(); i++){
                  if(max < students.get(i).getMark()){
                      max  = students.get(i).getMark();
                  }
              }
              return max;
          }
      };
        System.out.println("so diem cao nhat la: " + s2.apply(studentList));

        Function<List<Student>, Double> s3 = new Function<List<Student>, Double>() {
            @Override
            public Double apply(List<Student> students) {
                Double min = students.get(0).getMark();
                for(int i = 0; i < students.size(); i++){
                    if(min > students.get(i).getMark()){
                        min  = students.get(i).getMark();
                    }
                }
                return min;
            }
        };
        System.out.println("so diem thap nhat la: " + s3.apply(studentList));


    }
}
