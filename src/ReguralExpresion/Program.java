package ReguralExpresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vanuy on 09.11.2016.
 */
public class Program {

    public static void main(String[] args){
        Pattern p = Pattern.compile("\\s(\\w+)$");
        Pattern p1 = Pattern.compile("^*\\w+");
        Pattern p2 = Pattern.compile("\\w*[Mm]ama\\w*");
        Pattern p3 = Pattern.compile("\\w*[a-z]\\^+[24680]\\w*");
        Matcher match = p.matcher("Hello mama i am fine");
        Matcher match1 = p1.matcher("Hello mama i am fine");
        Matcher match2 = p2.matcher("Mama Hello mamau abahalamamaga i am fine umama");
        Matcher match3 = p3.matcher("x^221");
        //System.out.println(match.matches());

        if(match.find()){
            System.out.println(match.group());
        }

        if(match1.find()){
            System.out.println(match1.group());
        }

        while (match2.find()){
            System.out.println(match2.group());
        }

        while (match3.find()){
            System.out.println(match3.group());
        }

    }
}
