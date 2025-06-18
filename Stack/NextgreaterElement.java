import java.util.Stack;

public class NextgreaterElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 11, 2, 7, 0, 10 };
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (j == arr.length - 1) {
                    ans[i] = -1;
                }
                if (arr[i] < arr[j]) {
                    ans[i] = arr[j];
                    break;
                }
            }

        }
        ans[arr.length - 1] = -1;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(ans[i] + " ");
        // }
        func(arr);
    }

    public static void func(int org[]) {
        int ans[] = new int[org.length];

        Stack<Integer> s = new Stack<>();
        for (int i = org.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && org[s.peek()] <= org[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = org[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < org.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
