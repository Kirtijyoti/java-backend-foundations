import java.util.ArrayList;
import java.util.Collections;

public class StudentSortByNameDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Pankaj" , 12 , 21.5));
        students.add(new Student("Rajesh" , 15 , 67.0));
        students.add(new Student("Shyamli" , 23 , 76.7));
        students.add(new Student("Ankur" , 21 , 43.0));
        students.add(new Student("Chinki" , 25 , 98.0));

        Collections.sort(students);

        for (Student st: students){
            st.displayResult();
        }
    }
}
