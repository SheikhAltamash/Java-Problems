import java.util.Stack;

public class MaxAreaInHistogram {
    public static void main(String[] args) {
        int[] height = { 2,1,5,6,2,3 };
        int[] ans = new int[height.length];  
      
        // System.out.println(maxArea(height));
        MaxAreaWithStack(height);
    }

    public static int maxArea(int height[]) {
        int ans[] = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            int width = 1;
            for (int k = i - 1; k >= 0; k--) {
                if (height[k] >= height[i]) {
                    width++;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] >= height[i]) {
                    width++;
                } else {
                    break;
                }
            }
            ans[i] = width * height[i];
        }
        
        return 0;
    }
    

    public static void MaxAreaWithStack(int heights[]) {
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];
        Stack<Integer> stack = new Stack<>();       
       
        // Next Smaler left
         left(heights, nsl);
         // Next Smaller Right
         right(heights, nsr);

         // Current Area : width = j-i-1 = nsr[i]-nsl[i]-1
         for (int i = 0; i < heights.length; i++) {
             int width = nsr[i] - nsl[i] - 1;
             int height = heights[i];
             int Area = width * height;
             maxArea = Math.max(maxArea, Area);
         }
         System.out.println(maxArea);
        

    }
    public static void left(int height[],int ans[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }
            s.push(i);
        }       
    }    
    public static void right(int height[], int ans[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = height.length;
            } else {
                ans[i] = s.peek();
            }
            s.push(i);
        }
    }
    
}
