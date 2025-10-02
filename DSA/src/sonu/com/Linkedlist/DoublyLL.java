package sonu.com.Linkedlist;

public class DoublyLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(2);
        list.insertFirst(24);
        list.insertFirst(29);
        list.insertFirst(40);
        list.insertFirst(60);

        list.display();

        list.displayReverse();

    }
}
