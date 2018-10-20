package it.academy;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File inputFile = new File("shop.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nodeShop = doc.getElementsByTagName("shop");
        Node node = nodeShop.item(0);
        Element elem = (Element) node;
        System.out.println("Наименование магазина: " + elem.getElementsByTagName("name").item(0).getTextContent());
        System.out.println("\n");

        NodeList nodeProduct = doc.getElementsByTagName("product");
        System.out.println("Продукты: \n");
        for (int i = 0; i < nodeProduct.getLength(); i++) {
            Node nNode = nodeProduct.item(i);
            Element eElement = (Element) nNode;
            System.out.println("Компания: " + eElement.getAttribute("company"));
            System.out.println("Наименование продукта: " + eElement.getElementsByTagName("name").item(0).getTextContent());
            System.out.println("Описание: " + eElement.getElementsByTagName("description").item(0).getTextContent());
            System.out.println("Стоимость: " + eElement.getElementsByTagName("price").item(0).getTextContent());
            System.out.println("Год производства: " + eElement.getElementsByTagName("produced").item(0).getTextContent());
            System.out.println("\n");
        }

        NodeList nodeEmployee = doc.getElementsByTagName("employee");
        System.out.println("Сотрудники: \n");
        for (int i = 0; i < nodeEmployee.getLength(); i++) {
            Node nNode = nodeEmployee.item(i);
            Element eElement = (Element) nNode;
            System.out.println("Имя и Фамилия: " + eElement.getElementsByTagName("name").item(0).getTextContent() + eElement.getElementsByTagName("surname").item(0).getTextContent());
            System.out.println("Должность: " + eElement.getElementsByTagName("position").item(0).getTextContent());
            System.out.println("Дата найма: " + eElement.getElementsByTagName("recruitment").item(0).getTextContent());
            System.out.println("Зарплата: " + eElement.getElementsByTagName("salary").item(0).getTextContent());
            System.out.println("\n");
        }
    }
}

