public class mergeSort {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.print();
        list.addfirst(0);
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);
        list.print();
        list.head = list.mergeSort(list.head);
        list.print();
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int ans[] = new int[array.length];
        int k = 0,i=0,j=array.length-1;
while(i<=j){
   ans[k++] = array[i++];
            ans[k++] = array[j--]; 
}            
      
        for (i = 0; i < 10; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

class LinkedList {
    public static node head;
    public static node tail;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        if (head != null) {
            System.out.print("null");
        }
        System.out.println();
    }

    public void addfirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    public node mergeSort(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        node mid = getmid(head);
        node rightMid = mid.next;
        mid.next = null;
        node left = mergeSort(head);
        node right = mergeSort(rightMid);

        return merge(left, right);
    }

    public node getmid(node head) {
        node slow = head;
        node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public node merge(node left, node right) {
        node mergeLL = new node(-1);
        node dummy = mergeLL;
        while (left != null && right != null) {
            if (left.data >= right.data) {
                dummy.next = right;
                right = right.next;
                dummy = dummy.next;
            } else {
                dummy.next = left;
                left = left.next;
                dummy = dummy.next;
            }

        }
        while (left != null) {
            dummy.next = left;
            left = left.next;
            dummy = dummy.next;
        }
        while (right != null) {
            dummy.next = right;
            right = right.next;
            dummy = dummy.next;
        }
        return mergeLL.next;
    }
}