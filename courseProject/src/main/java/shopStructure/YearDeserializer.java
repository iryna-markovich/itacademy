package shopStructure;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class YearDeserializer implements JsonDeserializer<Date> {
    @Override
    public Date deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String date = element.getAsString();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
//    @Override
//    public LocalDate deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
//        return LocalDate.parse(element.getAsString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//    }
}