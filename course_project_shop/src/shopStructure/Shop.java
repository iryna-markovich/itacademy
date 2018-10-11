package shopStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private String name = "Super shop";
    private String location = "Minsk";
    private List<String> emails = Arrays.asList("sgasdg@gmail.com", "aaaaasfs@gmail.com", "bbbesfwef@gmail.com");
    private Map<Long, Goods> goodsList = new HashMap<>();

    {
        goodsList.put(0L, new Goods("something0", true, 45));
        goodsList.put(9L, new Goods("something9", true, 45));
    }

    public Map<Long, Goods> getGoodsList() {
        return goodsList;
    }

    public int size() {
        return goodsList.size();
    }

    public void showGoods() {
        System.out.printf("%-10s%-15s%-15s%-10s%n", "ID", "Name", "Price", "On stock");
        System.out.println("------------------------------------------------");
        for (Map.Entry<Long, Goods> item : goodsList.entrySet()) {
            System.out.printf("%-10s%-15s%-15s%-10s%n", item.getKey(), item.getValue().getName(), item.getValue().getPrice(), item.getValue().isVisible());
        }
    }

    {
        StringBuilder info = new StringBuilder("МАГАЗИН\n");
        info.append(name).append("\t").append(location).append("\t").append(emails).append("\n");
        System.out.println(info);
        showGoods();
    }
}
