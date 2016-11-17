package TicketHomework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 * Created by vanuy on 02.11.2016.
 */
public final class JsonWriter {
    private JsonWriter(){}

    public static void Write(String path, List collection){

        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();

        obj.put("Tickets", array);
        array.addAll(collection);
        try (FileWriter file = new FileWriter(path)) {
            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
