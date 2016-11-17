package Classes;

import java.util.Comparator;

/**
 * Created by john_ on 07.10.2016.
 */
public class SortTeacherByDepartment implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getChair().toLowerCase().compareTo(o2.getChair().toLowerCase());
    }

    

}
