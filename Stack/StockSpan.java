import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int stockPrices[] = { 100, 80, 60, 70, 60,85, 100 };
        int span[] = new int[stockPrices.length];
        stockSpan(stockPrices, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i]+" ");
        }
    }

    public static void stockSpan(int stockPrices[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stockPrices.length; i++) {
            int curr = stockPrices[i];
            while (!s.isEmpty() && curr > stockPrices[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;

            }
            else {
                int prev = s.peek();
                span[i] = i - prev;
            }
            s.push(i);
        }

    }
}