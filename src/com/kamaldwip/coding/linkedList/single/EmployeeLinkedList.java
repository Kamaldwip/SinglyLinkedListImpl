package com.kamaldwip.coding.linkedList.single;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size ++;

    }

    public int getSize() {
        return size;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null){
            System.out.print(current);
            current = current.getNext();
            System.out.print(" -> ");
        }
        System.out.println("null");
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        if(head == null){
            System.out.println("Nothing to remove");
            return null;
        } else {
            EmployeeNode removedNode = head;
            head = head.getNext();
            size--;
            removedNode.setNext(null);
            return removedNode;
        }
    }

}
