import java.util.*;
public class basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        System.out.println("all ok ");
        // CircularQueue q = new CircularQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }

    // static class Queue {

    //     int rear = -1;
    //     int array[];
    //     int size;

    //     Queue(int size) {
    //         array = new int[size];
    //         this.size = size;
    //     }

    //     public boolean isEmpty() {
    //         return rear == -1;
    //     }

    //     public void add(int data) {
    //         if (rear == size - 1) {
    //             System.out.println("Queue is full");
    //             return;
    //         }
    //         rear = rear + 1;
    //         array[rear] = data;
    //     }

    //     public int remove() {
    //         if (isEmpty()) {
    //             System.out.println("Queue is Empty");
    //             return -1;
    //         }
    //         int front = array[0];
    //         for (int i = 0; i < rear; i++) {
    //             array[i] = array[i + 1];
    //         }
    //         rear = rear - 1;
    //         return front;
    //     }

    //     public void peek() {
    //         if (isEmpty()) {
    //             System.out.println("Queue is Empty");
    //             return;
    //         }
    //         System.out.println(array[0]);
    //     }

    // }

    // static class CircularQueue {
    //     int front = -1;
    //     int rear = -1;
    //     int array[];
    //     int size;

    //     CircularQueue(int size) {
    //         array = new int[size];
    //         this.size = size;
    //     }

    //     public boolean isEmpty() {
    //         return rear == -1 && front == -1;
    //     }

    //     public void add(int data) {
    //         if ((rear + 1) % size == front) {
    //             System.out.println("Queue is full !");
    //             return;
    //         }
    //         if (front == -1) {
    //             front = 0;
    //         }
    //         rear = (rear + 1) % size;
    //         array[rear] = data;
    //     }

    //     public int remove() {
    //         if (isEmpty()) {
    //             System.out.println("Queue is Empty !");
    //             return -1;
    //         }
    //         int result = array[front];
    //         if (rear == front) {
    //             rear = front = -1;
    //         } else {
    //             front = (front + 1) % size;
    //         }
    //         return result;
    //     }
    // }



}