package Rhymes;

import java.util.ArrayList;

/**
 * Created by john_ on 07.10.2016.
 */
public class CircularList<E> extends ArrayList<E>
{
    @Override
    public E get(int index) {
        return super.get(index%size());
    }

    public CircularList(E... elements) {
        for(E el:elements)
            this.add(el);
    }

    @Override
    public E remove(int index) {
        return super.remove(index%size());
    }
}
