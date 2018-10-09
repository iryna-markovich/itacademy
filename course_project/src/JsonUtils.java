import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JsonUtils {
    public static Map<String, Object> jsonToMap() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Map<String, Object> retMap = new HashMap<>();
        Object obj = parser.parse(new FileReader("course_project/../properties.json"));
        JSONObject jsonObject = (JSONObject) obj;
        if (jsonObject != null) {
            retMap = toMap(jsonObject);
        }
        System.out.println(retMap);
        return retMap;
    }

    public static Map<String, Object> toMap(JSONObject object) {
        Map<String, Object> map = new HashMap<>();

        Iterator<String> keysItr = object.keySet().iterator();
        while (keysItr.hasNext()) {
            String key = keysItr.next();
            Object value = object.get(key);

            if (value instanceof JSONObject) {
                value = toMap((JSONObject) value);
            }
            map.put(key, value);
        }
        return map;
    }
}






/*        try {
            Object obj = parser.parse(new FileReader("course_project/../properties.json"));
            JSONObject jsonObject = (JSONObject) obj;
            if (jsonObject != null) {
                retMap = toMap(jsonObject);
            }
            return retMap;

            System.out.println(jsonObject.toJSONString());
            System.out.println(jsonObject.entrySet().size());
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        */