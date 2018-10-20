package shopStructure;

public class Goods {
    private Long id;
    private String name;
    private String description;
    private String year;
    private int price;
    private boolean visibility;

    public Goods(Long id, String name, String description, String year, int price, boolean visibility) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
        this.price = price;
        this.visibility = visibility;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public boolean isVisible() {
        return visibility;
    }

    public void getString() {
        System.out.printf("%-10s%-15s%-30s%-15s%-10s%-10s%n", this.getId(), this.getName(), this.getDescription(), this.getYear(), this.getPrice(), this.isVisible());
    }

}

