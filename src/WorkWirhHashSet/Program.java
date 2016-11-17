package WorkWirhHashSet;

import Classes.Teacher;

import java.util.*;

/**
 * Created by john_ on 19.10.2016.
 */
public class Program {

    public static void main(String[] args)
    {
        HaskSetTecher();
    }

    static void HaskSetTecher()
    {
        HashSet<Teacher> teachersIT = new HashSet<Teacher>();
        teachersIT.add(new Teacher("A2", "B2", "C2","prof","dep1"));
        teachersIT.add(new Teacher("A3", "B3", "C3","prof","dep2"));
        teachersIT.add(new Teacher("A4", "B4", "C4","prof","dep2"));
        teachersIT.add(new Teacher("A1", "B1", "C1","prof","dep2"));
        teachersIT.add(new Teacher("A1", "B1", "C1","prof","dep1"));


        HashSet<Teacher> teachersMath = new HashSet<Teacher>();
        teachersMath.add(new Teacher("A3", "B3", "C3","prof","dep2"));
        teachersMath.add(new Teacher("A2", "B2", "C2","prof","dep1"));
        teachersMath.add(new Teacher("A3", "B3", "C3","prof","dep2"));
        teachersMath.add(new Teacher("A4", "B4", "C4","prof","dep2"));

        HashSet<Teacher> temp = new HashSet<>();
        HashSet<Teacher> answer = new HashSet<>();
        for (Teacher obj: teachersMath) {

            temp.add(obj);
            if(temp.retainAll(teachersIT)){
                answer.add(obj);
            }
            temp.clear();

        };

        System.out.println(answer);


        HashMap<String, Teacher> teacherMap1 = new HashMap<>();

        for (Teacher obj :
                teachersIT) {
            teacherMap1.put(obj.getFirstName(), obj);
        }
        //System.out.println(teacherMap1);

        HashMap<String, Teacher> teacherMap2 = new HashMap<>();

        for (Teacher obj :
                teachersMath) {
            teacherMap2.put(obj.getFirstName(), obj);
        }

        //.out.println(teacherMap2);

        HashSet<String> temp2 = new HashSet<>();
        HashSet<String> answer2 = new HashSet<>();
        for (String obj: teacherMap2.keySet()) {
            temp2.add(obj);
            if(temp2.retainAll(teacherMap1.keySet())){
                answer2.add(obj);
            }
        };
    }


}


class MyComparator implements Comparator<Teacher>{
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return  o1.getFirstName().length() > o2.getFirstName().length() ?  1 : o1.getFirstName()  == o2.getFirstName() ?  0 : -1;
    }
}