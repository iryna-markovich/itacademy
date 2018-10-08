package by.itacademy;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Building 001");
        building.addApartment("Apartment 1", 10.4, 1);
        building.addApartment("Apartment 2", 28.4, 2);
     //   building.addItem(3,200);
        System.out.println(building.toString());
  //      building.add(2, new Lightbulb(250));
    }
}

