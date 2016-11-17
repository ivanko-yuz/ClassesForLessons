package HomeworkWithEmailRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

/**
 * Created by vanuy on 17.11.2016.
 */
public class EmailValidator {

    //private String regex = "([_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*)@([A-Za-z0-9-]+)*\\.([A-Za-z]{2,})";
    private String regex = "([_A-Za-z0-9-+.]*)@([A-Za-z0-9-]+)*\\.([A-Za-z]{2,})";
    private String regexBigLetter = "(([A-Z][a-z]+)+)";
    private String inoputString;

    private List<String> emails;
    private List<String> servers;
    private List<String> ovners;
    private List<String> bigLetterVords;

    public EmailValidator(){
        emails = new ArrayList<>();
        servers = new ArrayList<>();
        ovners = new ArrayList<>();
        bigLetterVords = new ArrayList<>();

        inoputString ="Hello Ivan@sdsds. here is my email and other info  ivan.yuzvyshyn@gmail.com  vanuy1305@gmail.com   vanuy1305@rambler.ru lalaal@lalal.la";
    }

    public EmailValidator(String inputString){
        emails = new ArrayList<>();
        servers = new ArrayList<>();
        ovners = new ArrayList<>();
        this.inoputString = inputString;
    }

    public void getEmails(){
        System.out.println(inoputString);

        Pattern patternBigLetter = Pattern.compile(regexBigLetter);
        Matcher matcherBigLetter = patternBigLetter.matcher(inoputString);


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inoputString);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
            emails.add(matcher.group());
            servers.add(matcher.group(2));
            ovners.add(matcher.group(1));

        }

        while (matcherBigLetter.find()) {
            System.out.println("Full match: " + matcherBigLetter.group(0));
            for (int i = 1; i <= matcherBigLetter.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcherBigLetter.group(i));
            }
            bigLetterVords.add(matcherBigLetter.group());
        }
        System.out.println(emails);
        System.out.println(servers);
        System.out.println(ovners);
        System.out.println(bigLetterVords);

    }

    public void countOfWords(){
        String[] words = inoputString.split("([\\W\\s]+)");
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for (String word: words) {
            if (counts.containsKey(word)) {
                counts.put(word, counts.get(word) + 1);
            } else {
                counts.put(word, 1);
            }
        }

        System.out.print(counts);

    }

}
