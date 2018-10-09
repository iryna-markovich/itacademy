package menu;

import operations.Sort;
import operations.Statistics;

public class MenuStatistics extends MenuCommonOperations implements MenuItem {
    public MenuStatistics(RootMenuItem rootMenu) {
        super(new Statistics(), rootMenu);
    }

    public void execute() {
        new Statistics().execute();
    }

    @Override
    public String name() {
        return "Статистика по товарам";
    }
}

