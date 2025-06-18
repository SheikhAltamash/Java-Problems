import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int maxAct = 1;
        // With Sorted activities according to the end 
        ArrayList<Integer> array = new ArrayList<>();
        int last = end[0];
        array.add(0);
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= last) {
                maxAct++;
                last = end[i];
                array.add(i);
            }
        }
        System.out.println("Maximum Activities are " + maxAct);
        for (int i = 0; i < array.size(); i++) {
            System.out.print("A" + array.get(i) + " ");
        }
        
        // With Unsorted activities according to the end 
        int ActArray[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            ActArray[i][0] = i;
            ActArray[i][1] = start[i];
            ActArray[i][2] = end[i];
        }
        Arrays.sort(ActArray, Comparator.comparingDouble(o -> o[2]));
        array.clear();
        array.add(ActArray[0][0]);
        last = ActArray[0][2];
        maxAct = 1;
        for (int i = 0; i < start.length; i++) {
            if (ActArray[i][1] >= last) {
                maxAct++;
                array.add(ActArray[i][0]);
                last = ActArray[i][2];
            }
        }
        System.out.println("\n\nWith Sorting approach");
        System.out.println("Maximum Activities are " + maxAct);
        for (int i = 0; i < array.size(); i++) {
            System.out.print("A" + array.get(i) + " ");
        }
    }
}
