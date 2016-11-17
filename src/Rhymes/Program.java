package Rhymes;

/**
 * Created by john_ on 07.10.2016.
 */
public class Program {

    public static void main(String[] args)
    {
        CircularList<String> children = new CircularList<>("Ann","John","Mike","Ken","Sonia","Tomas","Jessica");
        String rhymes = "Twinkle twinkle little star how I wonder what you are up above the world so high like a diamond in the sky";
        String[] smas = rhymes.split(" ");
        Index k=new Index(smas.length);
        int i=0;
        while(children.size()>1) {
            for(int j=0; j<smas.length; j++)
            {
                System.out.println(children.get(j)+"   "+smas[j]);
            }
            children.remove(smas.length-1);
            System.out.println("\n\n");
         }
        System.out.println(children.get(0));
    }

}
