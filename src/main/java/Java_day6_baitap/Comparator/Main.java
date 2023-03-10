package Java_day6_baitap.Comparator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student[] students  = new Student[3];
        students[0] = new Student(1,"s1",7);
        students[1] = new Student(2,"s2",5);
        students[2] = new Student(3,"s3",8);

        SortArray sortArray = new SortArray();
        sortArray.printArry(students);
        sortArray.sorted(students);
        System.out.println("sau khi sap xep la:");
        sortArray.printArry(students);

        HinhTron[] hinhTrons = new HinhTron[10];

        Random random = new Random();
        for(int i = 0; i < hinhTrons.length; i++){
         hinhTrons[i] = new HinhTron(random.nextInt(100) +1);
        }
        sortArray.printArry(hinhTrons);
        sortArray.sorted(hinhTrons);
        System.out.println("sau khi sap xep la:");
        sortArray.printArry(hinhTrons);
    }
}
