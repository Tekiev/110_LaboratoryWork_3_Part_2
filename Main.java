package DEV110_3_2_Tekiev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LinkedList doublyLL = new LinkedList();

        doublyLL.isEmpty();

        doublyLL.addEnd(3);

        doublyLL.isEmpty();

        doublyLL.addEnd(4);

        System.out.println(doublyLL.findKey(0));

        System.out.println(doublyLL.findKey(3));

        doublyLL.addFirst(2);

        doublyLL.addFirst(1);

        doublyLL.printAll();

        System.out.println("Первый элемент списка " + doublyLL.getHead());

        System.out.println("Последний элемент списка " + doublyLL.getLast());

        System.out.println("Первый элемент списка " + doublyLL.getHeadAndDelete() + " удален из списка");

        System.out.println("Последний элемент списка " + doublyLL.getLastAndDelete() + " удален из списка");

        doublyLL.printAll();

        doublyLL.findKeyAndDelete(2);

        doublyLL.printAll();

        System.out.println("Добавление элементов в связанный список");

        doublyLL.addFirst(2);

        doublyLL.addFirst(1);

        doublyLL.printAll();

        System.out.println();

        doublyLL.multiply(5);

        doublyLL.printAll();

        System.out.println();

        doublyLL.addArrayInFirst(new int[]{1, 2, 3, 4});

        doublyLL.printAll();

        System.out.println();

        doublyLL.addArrayInEnd(new int[]{16, 17, 18, 19});

        doublyLL.printAll();

        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-2);

        list.add(-1);

        doublyLL.addCollectionInFirst(list);

        doublyLL.printAll();

        System.out.println();

        doublyLL.addCollectionInEnd(list);

        doublyLL.printAll();

        System.out.println();

        LinkedList doublyLL2 = new LinkedList();

        doublyLL2.addEnd(100);

        doublyLL2.addEnd(200);

        doublyLL2.addEnd(300);

        doublyLL2.addEnd(400);

        doublyLL2.addEnd(500);

        LinkedList.absorbateAndAddInEnd(doublyLL, doublyLL2);

        System.out.println();

        doublyLL.printAll();

        System.out.println();

        doublyLL2.printAll();

        LinkedList doublyLL3 = new LinkedList();

        doublyLL3.addEnd(50);

        doublyLL3.addEnd(60);

        doublyLL3.addEnd(70);

        doublyLL3.addEnd(80);

        System.out.println();

        doublyLL3.printAll();

        System.out.println();

        LinkedList.absorbateAndAddInFirst(doublyLL, doublyLL3);

        System.out.println();

        doublyLL3.printAll();

        System.out.println();

        doublyLL3.printAllAndReverse();

        doublyLL3.multiplyStraight(10);

        doublyLL3.printAll();

        System.out.println();

        doublyLL3.division(10);

        doublyLL3.printAll();

    }

}
