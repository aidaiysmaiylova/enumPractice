import java.util.Arrays;

public class School {
    private int id;
    private String name;
    private lesson[]lessons;

    public School(int id, String name, lesson[] lessons) {
        this.id = id;
        this.name = name;
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lessons=" + Arrays.toString(lessons);
    }
}
