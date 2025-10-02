package sonu.com.Linkedlist;

public class RemoveDuplicateFromSortedList {


    private RemoveDuplicateFromSortedList.Node head;
    private RemoveDuplicateFromSortedList.Node tail;
    private int size;

    public RemoveDuplicateFromSortedList() {
        this.size = 0;
    }

    private class Node{
        private int data;
        private RemoveDuplicateFromSortedList.Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, RemoveDuplicateFromSortedList.Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void display(){
        RemoveDuplicateFromSortedList.Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int data){
        RemoveDuplicateFromSortedList.Node node =new RemoveDuplicateFromSortedList.Node(data);
        node.next = head;
        head =node;

        if (tail == null){
            tail =head;
        }

        size +=1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        RemoveDuplicateFromSortedList.Node node =new RemoveDuplicateFromSortedList.Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void removeduplicate(){
        Node node= head;
        while (node.next != null){
            if (node.data == node.next.data){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    // leetcode problem
//    public ListNode deleteDuplicates(ListNode node) {
//
//        if(node == null){
//            return node;
//        }
//        ListNode head = node;
//        while (node.next != null){
//            if (node.val == node.next.val){
//                node.next = node.next.next;
//
//            }
//            else {
//                node = node.next;
//            }
//        }
//
//        return head;
//
//    }


    public void main(String[] args) {
        RemoveDuplicateFromSortedList list = new RemoveDuplicateFromSortedList();


        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(4);

        list.display();

        list.removeduplicate();
        list.display();



    }
}
