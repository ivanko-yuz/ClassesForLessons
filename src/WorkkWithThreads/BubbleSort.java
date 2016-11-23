package WorkkWithThreads;

/**
 * Created by vanuy on 23.11.2016.
 */
public class BubbleSort implements Runnable {

    private ArrayClass a;
    public BubbleSort(ArrayClass a){
        this.a = a;
    }
    public void run(){
        sort();
    }

    public void sort(){

        System.out.println(a.toString());
        int j;
        boolean flag = true;
        Integer temp;
        while(flag){
            flag = false;
            for (j = 0; j < a.arrayOfSmth.length - 1; j++){
                if(a.arrayOfSmth[j] < a.arrayOfSmth[j+1]){

                    temp = a.arrayOfSmth[j];
                    a.arrayOfSmth[j] = a.arrayOfSmth[j + 1];
                    a.arrayOfSmth[j+1] =  temp;
                    flag = true;
                }
            }
        }

        System.out.println("Sotred bubble " + a.toString() );
    }
}
