package DEV110_3_2_Tekiev;

import java.util.ArrayList;

public class LinkedList {

    private Element head;

    public void addFirst(int data) {            // метод добавляет значение в начало списка

        Element element = new Element(data);

        element.next = head;

        element.prev = null;

        if (head != null) {

            head.prev = element;
        }
        head = element;
    }

    public int getHead() {        // метод извлекает значение из начала списка без его удаления из списка

        if (head != null) {

            return head.data;

        }

        throw new NullPointerException("Список пуст");

    }

    public int getHeadAndDelete() { // метод извлекает значение из начала списка с его удалением из списка


        if (head != null) {

            Element tmpHead = head;
            head = head.next;
            return tmpHead.data;

        }

        throw new NullPointerException("Список пуст");

    }

    public void addEnd(int data) {          // метод добавляет значение в конец списка

        Element element = new Element(data);

        Element current = head;

        element.next = null;

        if (head == null) {

            element.prev = null;
            head = element;
            return;
        }

        while (current.next != null) {

            current = current.next;
        }
        current.next = element;

        element.prev = current;
    }

    public int getLast() { // метод извлекает значение из конца списка без его удаления из списка

        Element current = head;

        while (current.next != null) {

            current = current.next;
        }

        return current.data;

    }

    public int getLastAndDelete() { // метод извлекает значение из конца списка с его удалением из списка

        Element tmpLast;

        Element temp = head;

        Element current = head;


        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;

        tmpLast = current.next;

        current.next = null;

        return tmpLast.data;

    }

    public String findKey(int key) {   // метод проверяет, содержит ли связанный список заданное значение

        Element current = head;

        while ((current) != null) {

            if (current.data == key) {

                return "Связанный список содержит заданное значение";

            }

            current = current.next;

        }

        return "Связанный список не содержит заданное значение";

    }

    public void isEmpty() {   // метод проверяет является ли список пустым

        Element current = head;

        if (current == null) {
            System.out.println("Связанный список является пустым");
        } else {
            System.out.println("Связанный список не пустой");
        }

    }

    public void printAll() {

        Element current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    public void findKeyAndDelete(int key) {   // * метод удаляет заданное значение в списке, если значения в списке нет, ничего не происходит

        Element current = head;

        Element prev = null;

        if (current != null && current.data == key) {

            head = current.next;
            System.out.println("Элемент " + key + " найден и удален из связанного списка");
            return;

        }

        while (current != null && current.data != key) {

            prev = current;

            current = current.next;

        }

        if (current != null) {

            prev.next = current.next;

            System.out.println("Элемент " + key + " найден и удален из связанного списка");

        }

    }

    public void multiply(int m) {   // * метод выполняет умножение значений связанного списка на значение аргумента, переданного в качесте параметра в данный метод

        Element current = head;
        while ((current) != null) {
            current.data = current.data * m;
            current = current.next;
        }

    }

    public void addArrayInFirst(int[] array) {   // метод добавляет значения из массива в начало списка

        int[] arrayTmp = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            arrayTmp[array.length - 1 - i] = array[i];

        }
        for (int a : arrayTmp) {

            Element element = new Element(a);

            element.next = head;

            element.prev = null;

            if (head != null) {

                head.prev = element;
            }
            head = element;

        }

    }

    public void addCollectionInFirst(ArrayList<Integer> list) {   // метод добавляет значения из коллекции в начало списка

        ArrayList<Integer> listTmp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            listTmp.add(list.get(list.size() - 1 - i));

        }
        for (int a : listTmp) {

            Element element = new Element(a);

            element.next = head;

            element.prev = null;

            if (head != null) {

                head.prev = element;
            }
            head = element;

        }

    }

    public void addArrayInEnd(int[] array) {   // метод добавляет значения из массива в конец списка

        for (int a : array) {

            Element element = new Element(a);

            Element last = head;

            element.next = null;

            if (head == null) {

                element.prev = null;
                head = element;
                return;
            }

            while (last.next != null) {

                last = last.next;
            }
            last.next = element;

            element.prev = last;

        }

    }

    public void addCollectionInEnd(ArrayList<Integer> list) {   // метод добавляет значения из коллекции в конец списка

        for (int a : list) {

            Element element = new Element(a);

            Element last = head;

            element.next = null;

            if (head == null) {

                element.prev = null;
                head = element;
                return;
            }

            while (last.next != null) {

                last = last.next;
            }
            last.next = element;

            element.prev = last;

        }

    }

    public static void absorbateAndAddInEnd(LinkedList list1, LinkedList list2) {   // добавление значений второго списка в конец списка и очистка списка

        Element current1 = list1.head;

        Element current2 = list2.head;

        while (current1.next != null) {

            current1 = current1.next;
        }

        current1.next = current2;

        current2.prev = current1;

        list2.head = null;

    }

    public static void absorbateAndAddInFirst(LinkedList list1, LinkedList list2) {   // добавление значений второго списка в начало  списка и очистка списка

        Element current1 = list1.head;

        Element current2 = list2.head;

        while (current2.next != null) {

            current2 = current2.next;

        }

        current2.next = current1;

        current1.prev = current2;

    }

    public void printAllAndReverse() { // печать элементов в обратном порядке

        Element currentRevers = head;

        System.out.println("Печать элементов в обратном порядке порядке");

        while (currentRevers.next != null) {

            currentRevers = currentRevers.next;

        }

        while (currentRevers != head) {

            System.out.println(currentRevers.data);

            currentRevers = currentRevers.prev;

        }

        System.out.println(head.data);

    }

    public void multiplyStraight(int m) {   // * метод выполняет умножение значений связанного списка на значение аргумента, переданного в качесте параметра в данный метод

        Element current = head;
        while ((current) != null) {
            current.data = current.data * m;
            current = current.next;
        }

    }

    public void division(int m) {   // * метод выполняет деление значения элементов списка в обратном порядке

        Element currentRevers = head;

        while (currentRevers.next != null) {

            currentRevers = currentRevers.next;

        }

        while (currentRevers != head) {

            currentRevers.data = (currentRevers.data) / m;

            currentRevers = currentRevers.prev;

        }

    }

    public static class Element {
        int data;
        Element prev;
        Element next;

        Element(int data) {

            this.data = data;

        }

    }


}
