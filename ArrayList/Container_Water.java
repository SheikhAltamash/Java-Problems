import java.util.ArrayList;
import java.util.Arrays;

public class Container_Water {
    public static void main(String[] args) {
        Integer array[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(array));
        BruteArray(array1);
        twoPointerWater(array1);
    }
    
    public static void BruteArray(ArrayList<Integer> array) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i; j < array.size(); j++) {
                int width = j - i;
                int height = Math.min(array.get(i), array.get(j));
                int volume = width * height;
                if (volume > ans)
                    ans = volume;
            }

        }
        System.out.println(ans);
    }


    public static void twoPointerWater(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        int ans = Integer.MIN_VALUE;
        while (i < j) {
            int width = j - i;
            int height = Math.min(list.get(i), list.get(j));
            int volume = width * height;
            ans = Math.max(ans, volume);
            if (list.get(i) < list.get(j)) {
                i++;

            } else
                j--;
        }
        System.out.println(ans);
    }
}
