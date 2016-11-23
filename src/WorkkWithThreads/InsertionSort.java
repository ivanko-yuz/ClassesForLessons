package WorkkWithThreads;

/**
 * Created by vanuy on 23.11.2016.
 */
public class InsertionSort implements Runnable {
    ArrayClass a;
    public InsertionSort(ArrayClass a){
        this.a = a;
    }
    public void run(){
        sort();
    }

    public void sort(){
        System.out.println(a.toString() );
        Integer temp;
        int item;
        for( int i = 1  ; i < a.arrayOfSmth.length;  i++){
            temp = a.arrayOfSmth[i];
            item = i - 1;
            while ( item >= 0 && a.arrayOfSmth[item] > temp){
                a.arrayOfSmth[item + 1] = a.arrayOfSmth[item];
                a.arrayOfSmth[item] = temp;
                item--;
            }
        }
        System.out.println("Sotred inner " +  a.toString() );
    }

}
