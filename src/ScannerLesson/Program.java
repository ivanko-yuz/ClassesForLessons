package ScannerLesson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by john_ on 05.10.2016.
 */
public class Program {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> aList = new ArrayList<String>();
        LinkedList<String> lList = new LinkedList<>();
        for(int i=0; i<5; i++)
        {
            String s = sc.next();
            aList.add(s);
            lList.add(s);
        }
        for(String s:aList)
        {
            System.out.print(s+" ");
        }
        System.out.println();
        for(String s:lList)
        {
            System.out.print(s+" ");
        }

    }



}
