package Classes;

        import java.util.Comparator;

/**
 * Created by john_ on 07.10.2016.
 */
public class SortByName implements Comparator<Teacher> {

    public SortByName()
    {
        order=1;
    }
    int order;
    public SortByName(int i)
    {
        if(i<0)order=-1;
        else order=1;
    }
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return order*o1.getSurname().toLowerCase().compareTo(o2.getSurname().toLowerCase());
    }

    static  SortByName reverseOrder()
    {
        return new SortByName(-1);
    }
}
