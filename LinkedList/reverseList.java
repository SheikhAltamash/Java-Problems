public class reverseList {

    public static void main(String[] args) {
        list one = new list();
        one.addLast(1);
        one.addLast(2);
        one.addLast(3);
        one.addLast(4);
        one.addLast(4);
        one.addLast(3);
        one.addLast(2);
        one.addLast(1);
        // one.addLast(9);
        // one.addLast(10);
        System.out.println("Original linked list");
        one.print();
        one.reverse();
        System.out.println("Reversed linked list");
        one.print();
        // one.delNthFromEnd(4);
        
        one.print();
      System.out.println(one.palindrome());

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

    // Reverse the linked list
    public void reverse() {
        node curr = tail = head;
        node prev = null;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove nth node from end of a linkedlist
    public void delNthFromEnd(int n) {
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int index = size - n;
        node prev = head;
        while (i < index) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // Check if the linked list is a palindrome or not
    public node mid(node head) {
        node fast = head;
        node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reverseRight() {
        node prev = null;
        node curr = mid(head);
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 find mid
        node mid = mid(head);
        // step 2 reverse right half linked list
        node prev = null;
        node curr = mid;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node rightHead = prev;
        node leftHead = head;

        // check if both the left and right linked list are same or not
        while (rightHead != null) {
            if (leftHead.data != rightHead.data) {
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
    }

}
