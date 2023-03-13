package Java_day8_baitap.functional_2;

public class Student{
    private int id;
    private String name;
    private int age;
    private String gender;
    private double mark;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mark=" + mark +
                '}';
    }

    public Student(int id, String name, int age, String gender, double mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mark = mark;
    }


}
