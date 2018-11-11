package shopStructure;

import java.time.LocalDate;

public class Good {
    private int id;
    private String name;
    private String description;
    private LocalDate year;
    private int price;
    private boolean visible;

    public Good(int id, String name, String description, LocalDate year, int price, boolean visible) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
        this.price = price;
        this.visible = visible;
    }

    public Good() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("%-10s%-15s%-30s%-15s%-10s%-10s%n");
        info.append(id).append(name).append(description).append(year).append(price).append(visible);
        return "Addressssssssssssssssssssssssssssssssssss";
    }
}

