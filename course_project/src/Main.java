import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        JsonUtils json = new JsonUtils();
        Map<String, Object> shop = json.jsonToMap();
        ArrayList goods = (ArrayList) shop.get("goods");
        for (int i = 0; i< goods.size(); i++) {
            System.out.println(goods.get(i));
        }

    }
}

/*
        JSONObject object = new JSONObject();
        object.put("name", "mkyong.com");
        object.put("age", new Integer(100));

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        object.put("messages", list);

        try {
            FileWriter file = new FileWriter("test.json");
            file.write(object.toJSONString());
            file.flush();
            file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
*/