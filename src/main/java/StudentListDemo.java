import java.util.ArrayList;

public class StudentListDemo {


    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("aju", 101, 69.5));
        students.add(new Student("bubu", 102, 18.0));
        students.add(new Student("litun", 103, 76.5));

        for(Student s: students){
            s.displayResult();
        }
    }
}
