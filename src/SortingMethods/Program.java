package SortingMethods;

import Classes.Student;
import Classes.Teacher;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created by vanuy on 26.10.2016.
 */
public class Program {

    public static void main(String[] args){

        Map<String, Teacher> teachers = new HashMap<String, Teacher>();
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("sname","fname","lname"));
        students.add(new Student("sname1","fname1","lname1"));
        students.add(new Student("sname2","fname2","lname2"));

        teachers.put("Name1", new Teacher("sname","fname","lname","pos","dep",students));
        teachers.put("Name2", new Teacher("sname1","fname1","lname1","pos1","dep1",students));
        

        Collections.sort(teachers.get("Name1").getStudents(), new StudentComparator());

        for (Student temp : teachers.get("Name1").getStudents())
        {
            System.out.println(temp);
        }
    }

}

class StudentComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }
}