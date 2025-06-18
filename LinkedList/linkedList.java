public class linkedList {
    public static void main(String[] args) {
        list one = new list();
        one.print();
        one.addfirst(2);
        one.print();
        one.addfirst(1);
        one.print();
        one.addLast(3);
        one.print();
        one.addLast(4);
        one.print();
        one.search(4);
        one.addInMiddle(4, 10);
        one.print();
        one.removeFirst();
        one.print();
        one.removeLast();
        // one.print();
        // one.removeFromIndex(3);
        one.print();
        one.addInMiddle(3, 32);
        one.print();
        System.out.println(list.size);
        System.out.println(one.recSearch(42));

    }
}

class list {
    class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size;

    public void addfirst(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    public void addLast(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;

    }

    public void addInMiddle(int index, int data) {
        if (index == 0) {
            addfirst(data);
            return;
        }
        if (index > size) {
            System.out.println("Index out of bounds");
            return;
        }
        node newnode = new node(data);
        node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    public void search(int data) {
        node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println(temp.data + " : " + temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data not found");
    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        if (head == null) {
            head = tail = temp;
            System.out.println("ll is empty");
            return;
        }
        System.out.print("null");
        System.out.println();
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("the linked list is empty");
            return;
        }
        else if (size == 1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("The linkedlist is empty ");
            return;
        }
        node temp = head;
        int i = 1;
        while (size >= i) {
            if (i + 1 == size) {
                temp.next = null;
                size--;
                return;
            }
            temp = temp.next;
            i++;
        }
    }

    public void removeFromIndex(int idx) {
        if (idx == 0) {
            removeFirst();
            return;
        }
        if (idx+1 > size||idx>size) {
            System.out.println("Index out of bound !");
            return;
        }
        int i = 0;
        node temp = head;
        while (i + 1 != idx) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
        return;
    }
    
    public int recSearchHelper(node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = recSearchHelper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return recSearchHelper(head, key);
    }
}
