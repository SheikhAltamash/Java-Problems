import java.util.ArrayList;
import java.util.Arrays;

public class Pair_Sum {
    public static void main(String[] args) {
        Integer array[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(pairSum(arrayList, 34));
        
        Integer sortedArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayList<Integer> Sortedarray1 = new ArrayList<>(Arrays.asList(sortedArray));
        System.out.println(optimize2sum(Sortedarray1, 16));

        Integer sortedRotatedArray[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        ArrayList<Integer> SortedRotatedarray1 = new ArrayList<>(Arrays.asList(sortedRotatedArray));
        System.out.println(RotatedSortedArray(SortedRotatedarray1, 4));

    }
    
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean optimize2sum(ArrayList<Integer> list, int target) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int left = list.get(i);
            int right = list.get(j);
            if (left + right == target)
                return true;
            else if (left + right < target)
                i++;
            else
                j--;
        }
        return false;
    }
       static boolean RotatedSortedArray(ArrayList<Integer> list, int target) {
        int i = 0, j = list.size(), pivot = 0;
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k) > list.get(k + 1)) {
                pivot = k;
                break;
            }
        }
        i = (pivot + 1);
        j = pivot;
        while (i != j) {
            if (list.get(i) + list.get(j) == target)
                return true;
            else if (list.get(i) + list.get(j) > target) {
                j = (j - 1 + list.size()) % list.size();
            } else {
                i = (i + 1) % list.size();
            }
        }
        return false;
    }
}
