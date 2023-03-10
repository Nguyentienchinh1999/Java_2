package Java_day7.Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Student> svList = new ArrayList<>();

        Student s1 = new Student(10, "chinh");
        svList.add(s1);

        Student s2 = new Student(1, "chinh2");
        svList.add(s2);

        System.out.println(svList.toString() + svList.size());

//        thay đổi giá trị - tên học sinh
        Student s = svList.get(1);
        s.setName("sinh vien 2");
        System.out.println(svList);
//        thay thế
        Student s3 = new Student(3, "student 3");
        svList.set(1,s3);
        System.out.println(svList);
//        remove
//        svList.remove(0);
//        System.out.println(svList);

//        xóa phần tử theo object
//        svList.remove(s3);
//        System.out.println(svList);
// sắp xếp
        Collections.sort(svList);
        System.out.println(svList);
    }
}