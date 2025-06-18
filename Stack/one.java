import java.util.Stack;

public class one {
    int hello to kasei hoaap log to mai aa
    public static void main(String[] args) {
        System.out.println("hello world !!!");
        StackNode stack = new StackNode();
        stack.push(4);
        stack.push(3);
        stack.push(5);
        // System.out.println(stack.pop());
        stack.print();
        stack.pushAtBottom(7);
        stack.print();
        System.out.println(stack.peek());
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        hello to kaise ho aap log 
        // pushAtbottom(s, 10);
    // System.out.println(s);
    // String str = "Altamash";
    // System.out.println(reverseString(str));   
    reverseStack(s);
    print(s);
    }

    public static void pushAtbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);
    }
    public static void print(Stack<Integer>s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }
    public static String reverseString (String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            sb.append(ch);
        }
        return sb.toString();
       
    }

}

class StackNode {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head = null;

    public static boolean isempty() {
        return head == null;
    }

    public  void push(int data) {
        node newnode = new node(data);
        if (isempty()) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    // pop
    public  int pop() {
        if (isempty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;

    }

    // print
    public  void print() {
        node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public  int peek() {
        if (isempty()) {
            return -1;
        }
        return head.data;
    }

    public  void pushAtBottom(int data) {
        node temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }
        node newnode = new node(data);
        temp.next = newnode;
    }

}
