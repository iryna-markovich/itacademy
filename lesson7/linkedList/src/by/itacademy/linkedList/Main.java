package by.itacademy.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(2, 477);
        linkedList.add(6);
        linkedList.add(7);
        int num2 = linkedList.remove(3);
        System.out.println(num2);
        System.out.println(linkedList);
        System.out.println(linkedList.contains(4));
        System.out.println(linkedList.size());
    }
}
