import org.junit.Assert;
import org.junit.Test;
import shopStructure.Good;
import shopStructure.Shop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ShopTest {
    @Test
    public void ShouldRetunIsEqual() {
        Shop shop = new Shop();
        shop.add(new Good(0, "CD player", "Super CD player SONY", LocalDate.parse("2004-10-25", DateTimeFormatter.ofPattern("yyyy-MM-dd")),45, true));
        shop.add(new Good(0, "CD player", "Super CD player SONY", LocalDate.parse("2004-10-25", DateTimeFormatter.ofPattern("yyyy-MM-dd")),45, true));

        String expected = "{\"name\":\"Super shop\",\"location\":\"Minsk\",\"emails\":[\"sgasdg@gmail.com\",\"aaaaasfs@gmail.com\",\"bbbesfwef@gmail.com\"],\"goodsNameComparator\":{},\"goodList\":[{\"id\":0,\"name\":\"CD player\",\"description\":\"Super CD player SONY\",\"year\":{\"year\":2004,\"month\":10,\"day\":25},\"price\":45,\"visible\":true}]}";

        Assert.assertEquals(expected, shop.toJson());
    }

}