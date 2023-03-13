package Java_day8_baitap.Functional_3;

public class Human {
    private int Id;
    private String FirstName;
    private String LastName;
    private String City;
    private int Gender;
    private int Age;
    private double Salary;

    public Human() {
    }

    public String getFullName(){
        return LastName + FirstName;
    }

    public Human(int id, String firstName, String lastName, String city, int gender, int age, double salary) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        City = city;
        Gender = gender;
        Age = age;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", City='" + City + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", Salary=" + Salary +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
