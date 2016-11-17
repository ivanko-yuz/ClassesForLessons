package Rhymes;

import org.jetbrains.annotations.NotNull;

/**
 * Created by john_ on 07.10.2016.
 */
public class Index implements Comparable<Index> {

    int i;
    private int max;

    public Index(int max)
    {
        this.max=max;
    }

    public int get()
    {
        if(i>=max)
        {
            return i%max;
        }
        return i;
    }

    public void set(int index)
    {
        i = index%max;
    }

    @Override
    public boolean equals(Object obj) {

        Index other = (Index)obj;
        return compareTo(other)==0;
    }

    @Override
    public int compareTo(@NotNull Index o) {
        if(get()<o.get())return -1;
        else if(get()==o.get())return 0;
        else return 1;
    }
}
