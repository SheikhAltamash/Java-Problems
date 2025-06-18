public class intersectionInList {
    public static void main(String[] args) {
        System.out.println("hello world");
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.print();
        LinkedList list2 = new LinkedList();
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(11);
        list2.add(12);

        list2.intersection(list, list2);
    }

}

class LinkedList {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;

    void add(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void print() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    node intersection(LinkedList list1, LinkedList list2) {
        // Step 1 finding end of list1
        node temp1 = list1.head;
        node temp2 = list2.head;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = temp2;

        //Step 2 finding intersection
        node fast = head.next.next;
        node slow = head.next;

        while (fast != slow && fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != fast) {
            System.out.println("noth the linked list are not conected");
            temp1.next = null;
            return null;
        }
        
        //Step 3 Reducing the speed to find the intersection
        slow = head;
        while (slow != head) {
            slow = slow.next;
            fast = fast.next;
        }


        return slow;
    }
}