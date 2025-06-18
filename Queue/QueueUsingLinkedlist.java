public class QueueUsingLinkedlist {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static node head = null;
        static node tail = null;

        void add(int data) {
            node newnode = new node(data);
            if (head == null) {
                head = tail = newnode;
            }
            tail.next = newnode;
            tail = newnode;
        }

        boolean isEmpty() {
            return head == null & tail == null;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return data;
        }

        void peak() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(head.data);
        }
    }
}
