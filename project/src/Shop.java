import menu.Goods;
import menu.MenuDisplay;
import menu.RootMenuItem;

public class Shop {
    private String nameOfShop = "Super shop";
    private String location = "Minsk";
    private String[] emails = {"sgasdg@gmail.com", "aaaaasfs@gmail.com", "bbbesfwef@gmail.com"};
    private RootMenuItem rootMenu = new MenuDisplay();
    private Goods goods = new Goods();
    String emailsSet;

    {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < emails.length; i++) {
            out.append(emails[i]);
            if (i != emails.length - 1) {
                out.append(" | ");
            }
        }
        emailsSet = out.toString();
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append(nameOfShop.toUpperCase()).append(", ").append(location).append("\n").append(emailsSet);
        return info.toString();
    }

    public void start() {
        System.out.println(new Shop());
        rootMenu.execute();
    }
}
