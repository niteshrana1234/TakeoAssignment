import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade){
        this.name = name;
        this.age =age;
        this.grade=grade;
    }

    public String getName() {
        return name;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}


public class ExerciseThree {
    public static void main(String[] args) {
        Student student = new Student("Nitesh",26,91);
        Student student1 = new Student("Nisha",33,91);
        Student student2 = new Student("Asha",32,99);
        Student student3 = new Student("Santosh",32,80);
        Student student4 = new Student("Sangam",34,70);
        Student student5 = new Student("Sashi",33,75);
        Student student6 = new Student("Sudip",26,60);

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        double averageGrade = 0;

        for(Student student7:list){
            averageGrade = averageGrade + student7.getGrade();
        }
        System.out.println("\nAverage grade of all student is " +averageGrade/list.size());

        System.out.println("\nList of student with higher than 90 grade:");
        for(Student student8: list){
            if(student8.getGrade()>90){
                System.out.println("Name : "+ student8.getName() + ", Age : "+student8.getAge());
            }
        }




    }
}
