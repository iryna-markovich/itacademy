package by.itacademy.lesson13;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomersParser {
    public static final Logger LOGGER = Logger.getLogger(CustomersParser.class.getName());

    public List<Customer> read() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            CustomerHandler handler = new CustomerHandler();
            saxParser.parse(CustomersParser.class.getClassLoader().getResource("customers.xml").getFile(), handler);
        } catch (SAXException | ParserConfigurationException | IOException e) {
            LOGGER.log(Level.SEVERE, "Error", e.getMessage());
        }
        return null;
    }
}
