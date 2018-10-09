package operations;

import menu.Goods;

import java.util.ArrayList;

public class AddGoods implements Operation {

    private ArrayList<Goods> goodsList = new ArrayList<>();

    @Override
    public void execute() {
        goodsList.add(new Goods());
        for (int i = 0; i< goodsList.size(); i++ ) {
            System.out.println(goodsList.get(i));
        }
    }
}

