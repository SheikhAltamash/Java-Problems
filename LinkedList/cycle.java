public class cycle {
    public static void main(String[] args) {
        // Creating a cycle manually
        head = new Node(54);
        head.next = new Node(27);
        Node temp = new Node(45); 
        head.next.next = temp;
        head.next.next.next = new Node(12);
        head.next.next.next.next = temp; // Creating the cycle

        // Check if cycle exists
        if (isCycle()) {
            System.out.println("Cycle detected in the linked list.");
            removeCycle();
            System.out.println("Cycle removed.");
        } else {
            System.out.println("No cycle found.");
        }

        // Print the linked list after cycle removal
        print();
    }

    // Function to detect cycle
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Cycle detected
                return true;
            }
        }
        return false;
    }

    // Function to remove cycle
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        // Detecting the cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle) {
            return; // No cycle found
        }

        // Reset slow to head and find the cycle start node
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast; // Keep track of the node before meeting point
            slow = slow.next;
            fast = fast.next;
        }

        // Find last node of the cycle and break it
        while (prev.next != slow) {
            prev = prev.next;
        }
        prev.next = null; // Remove the cycle
    }

    // Function to print the linked list
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Linked List Node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
}
