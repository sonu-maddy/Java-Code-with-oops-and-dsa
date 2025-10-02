package sonu.com.Linkedlist;

import org.w3c.dom.Node;

//import java.lang.classfile.components.ClassPrinter;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }




    // find data
    public  Node find(int value){
        Node node = head;
       while (node != null){
           if (node.data == value){
               return node;
           }
       }
        return null;
    }



    // insert data in linked list
    public void insertFirst(int data){
        Node node =new Node(data);
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
        Node node =new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val , int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }



    // delete dta from linked list.
    public  int deletefirst(){
        int val = head.data;
        head = head.next;

        if (head == null){
            tail = null;
        }
        size--;
        return val;

    }


    public int deleteLast(){
        if (size <= 1){
            return deletefirst();
        }
        Node secondLast = get(size-2);
        int val = tail.data;
        tail =secondLast;
        tail.next =null;

        return val;
    }


    public int delete(int index){
        if (index == 0){
            return deletefirst();
        }
        if (index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.data;

        prev.next =prev.next.next;

        return val;
    }




    public  Node get(int index){
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }





    // display data from linked list
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int data;
        private Node  next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


}


