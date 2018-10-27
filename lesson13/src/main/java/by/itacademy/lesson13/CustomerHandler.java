package by.itacademy.lesson13;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerHandler extends DefaultHandler {
    private Map<Flags, Boolean> flags = new HashMap();
    private int id;
    private String name;
    private LocalDate lastOrder;
    private LocalDate dateOfBirth;
    private List<String> car;
    private boolean discount;

    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        Flags flag = Flags.valueOf(qName.toUpperCase());
        flags.put(flag, true);
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        if(flags.getOrDefault(Flags.ID, false)){
            System.out.println(Integer.parseInt(new String(ch, start, length)));
        }
        /*
        else if(flags.getOrDefault(Flags.NAME, false)){
            System.out.println(Integer.parseInt(new String(ch, start, length)));
        }
        else if(flags.getOrDefault(Flags.LASTORDER, false)){
            System.out.println(Integer.parseInt(new String(ch, start, length)));
        }
        else if(flags.getOrDefault(Flags.DATEOFBIRTH, false)){
            System.out.println(Integer.parseInt(new String(ch, start, length)));
        }
        else if(flags.getOrDefault(Flags.DATEOFBIRTH, false)){
            System.out.println(Integer.parseInt(new String(ch, start, length)));
        }*/
    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) throws SAXException {

        Flags flag = Flags.valueOf(qName.toUpperCase());
        flags.remove(flag);
    }

}

