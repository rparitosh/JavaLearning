package com.paritosh.learning.java.leetcode;

import java.util.List;

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}

public class RemoveNode {

    public static void main(String[] args){
        //ListNode node = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
        ListNode node = new ListNode(1,null);
        node = removeNthFromEnd(node,1);

        while (node.next!=null){
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println(node.val);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (removeNode(head,n,1) == 0){
            head = head.next;
        };
        return head;
    }


    public static int removeNode(ListNode head, int n, int counter){
        if (head.next==null){

            return counter-n;
        }

        int retVal = removeNode(head.next,n,counter+1);
        if (counter==retVal){
            head.next = head.next.next;
        }
        return retVal;
    }
}
