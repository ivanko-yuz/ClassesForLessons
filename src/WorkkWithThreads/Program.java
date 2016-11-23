package WorkkWithThreads;

/**
 * Created by vanuy on 23.11.2016.
 */
public class Program {

    public static void main(String[] args){
        Integer[] array = new Integer[]{7, 2, 3, 5 , 2 };
        ArrayClass wrapper  = new ArrayClass(array);

        Thread a = new Thread(new InsertionSort(wrapper));
        Thread a1 = new Thread(new BubbleSort(wrapper));

        a.start();
        a1.start();


        //System.out.print(wrapper.toString());
    }
}
