package WorkkWithThreads;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanuy on 23.11.2016.
 */
public class ArrayClass {

    public Integer[] arrayOfSmth;

    public ArrayClass(Integer[] n){
        arrayOfSmth = n;
    }

    @Override
    public String toString() {
        String r = "";
        for (int item:
                arrayOfSmth ) {
            r += item + " ";
        }
        return r;
    }
}
