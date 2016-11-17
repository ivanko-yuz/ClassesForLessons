package TicketHomework;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.util.Objects;

/**
 * Created by vanuy on 02.11.2016.
 */

public final class JsonReader {
    private JsonReader(){}
    @SuppressWarnings("unchecked")
    public static Object Read(String path){
        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();

        try(FileReader file = new FileReader(path)) {

            Object obj = parser.parse(file);

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray ticketList = (JSONArray) jsonObject.get("Tickets");

            System.out.println("\nCompany List:");
            //Iterator<Ticket> iterator = ticketList.iterator();
            //while (iterator.hasNext()) {
            //    System.out.println(iterator.next());
            //}

        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }
}
