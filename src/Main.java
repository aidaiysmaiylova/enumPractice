public class Main {
    public static void main(String[] args) {
        School school1=new School(1,"School1",lesson.values());
        School school2=new School(2,"School2",lesson.values());
        School school3=new School(3,"School3",lesson.values());
        School[]schools={school1,school2,school3};
        for(School school:schools){
            System.out.println(school);
        }
        System.out.println();

Student student1=new Student("Aidai","Ysmaiylova",1,18,Course.values());
Student student2=new Student("Aidai","Ysmaiylova",1,18,Course.values());
Student student3=new Student("Aidai","Ysmaiylova",1,18,Course.values());
Student[]students={student1,student2,student3};
for(Student student:students){
    System.out.println(student);
}

    }
}