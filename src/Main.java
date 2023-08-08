public class Main {
    public static void main(String[] args) {
        School school1=new School(1,"School1",lesson.PROGRAMING);
        School school2=new School(2,"School2",lesson.MATH);
        School school3=new School(3,"School3",lesson.CHEMISTRY);
        School[]schools={school1,school2,school3};
        for(School school:schools){
            System.out.println(school);
        }
        System.out.println();

Student student1=new Student("Aidai","Ysmaiylova",1,18,Course.MATHCOURSE);
Student student2=new Student("Aizirek","Toktosunova",2,18,Course.PROGRAMMINGCOURSE);
Student student3=new Student("Aizat","Kamaldin kyzy",3,18,Course.LAMGUAGECOURSE);
Student[]students={student1,student2,student3};
for(Student student:students){
    System.out.println(student);
}

    }
}