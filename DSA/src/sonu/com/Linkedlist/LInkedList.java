package sonu.com.Linkedlist;

public class LInkedList {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(24);
        list.insertFirst(29);
        list.insertFirst(40);
        list.insertFirst(60);
        list.insertLast(80);
        list.insert(56,3);

        list.display();

        System.out.println(list.deletefirst());

        list.display();

        list.deleteLast();
        list.display();

        System.out.println(list.delete(2));
        list.display();
    }
}
