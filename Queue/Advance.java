import java.util.*;
import java.util.LinkedList;

public class Advance {
    public static void main(String[] args) {
        // FirstNonRepeating();
        // Interleave();
        // ReverseQueue();
        // Deque();
        // printBinaryNumbers(10);
        // ConectNropes();
        ReverseNQueueItems();
    }

    public static void FirstNonRepeating() {
        String str = "aabbccddere";
        int freq[] = new int[26];
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }
            if (queue.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
    }

    public static void Interleave() {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        int size = q1.size();
        for (int i = 0; i < size / 2; i++) {
            q2.add(q1.remove());
        }
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());

        }
        System.out.println(q1);
        System.out.println(q2);
    }

    public static void ReverseQueue() {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println(q);

    }

    public static void Deque() {
        Deque<Integer> q = new LinkedList<>();
        q.addLast(1);
        q.addFirst(2);
        q.addLast(3);
        q.addFirst(4);
        q.addLast(5);
        System.out.println(q);
    }

    // Assigment Questions
    // 1
    public static void printBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String current = q.remove();
            System.out.println(current + " ");
            q.add(current + "0");
            q.add(current + "1");
        }
    }

    // 2
    public static void ConectNropes() {
        int array[] = { 4, 3, 2, 6 };
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i : array) {
            q.add(i);
        }
        int totalcost = 0;
        System.out.println(q);
        while (q.size() > 1) {
            int first = q.poll();
            int second = q.poll();
            totalcost = totalcost + first + second;
            System.out.println(totalcost);
            q.add(first + second);
        }
    }
    
    // 3
    public static void ReverseNQueueItems() {
        int n = 4;
        Deque<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        for (int i = 0; i < n; i++) {
            s.push(q.removeFirst());
        }
        while (!s.isEmpty()) {
            s2.push(s.pop());
        }

        while (!s2.isEmpty()) {
            q.addFirst(s2.pop());
        }
        System.out.println(q);

    }

}
