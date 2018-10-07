package by.itacademy.arrayList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(3);
        System.out.println(list);

//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
