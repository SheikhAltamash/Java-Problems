public class DoublyLinkedList {

    public static void main(String[] args) {
        DoublyList dl = new DoublyList();
        dl.addfirst(10);
        dl.addfirst(20);
        dl.addfirst(30);
        dl.addfirst(40);
        dl.addLast(50);
        dl.print();
        dl.removeFirst();
        dl.removeLast();
        dl.print();
        dl.reverse();
        dl.print();
    }

}

class DoublyList {
    class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static node head;
    public static node tail;

    // Add First
    public void addfirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        

    }

    public void addLast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.prev = temp;
        tail = newnode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty !");
            return;

        }
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty !");
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        
    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        if(head!=null)System.out.print("null");
        System.out.println();
    }

    public void reverse() {
        node curr = head;
        node prev = null;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}