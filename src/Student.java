import java.util.Arrays;

public class Student {
    private String name;
    private String lasName;
    private int id;
    private int age;
    Course courses;

    public Student(String name, String lasName, int id, int age, Course courses) {
        this.name = name;
        this.lasName = lasName;
        this.id = id;
        this.age = age;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lasName='" + lasName + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", courses=" + courses;
    }
}
