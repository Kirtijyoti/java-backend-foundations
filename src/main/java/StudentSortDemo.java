import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSortDemo {

public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Ram", 2 , 64.7 ));
    students.add(new Student("Shyam", 4 , 39.6));
    students.add(new Student("Golu", 5 ,86.5));

    Collections.sort(students, new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o2.getMarks(),o1.getMarks());
        }
    });

    for(Student st:students){
        st.displayResult();
    }
}
}
