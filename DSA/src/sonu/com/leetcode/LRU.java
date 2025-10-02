package sonu.com.leetcode;

import sonu.com.Linkedlist.DLL;

import java.util.LinkedHashMap;

public class LRU {

    public class Node{
        int val,key;
        Node next;
        Node prev;

        public Node(int val, int key) {
            this.val = val;
            this.key = key;

        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head = new Node(-1,-1);
    Node tail  = new Node(-1,-1);

    LinkedHashMap<Integer, Node> cache = new LinkedHashMap<>();


    LRU(int cap) {
        // code here


    }




    public  void put(int key, int value) {
        // your code here
        Node newNode = new Node(key,value );
      //  addNode(newNode);
    }

   // private   addNode(Node newNode) {
    }


   // public static void main(String[] args) {

   // }
// }



