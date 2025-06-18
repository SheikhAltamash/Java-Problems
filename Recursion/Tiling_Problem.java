public class Tiling_Problem {
    public static void main(String[] args) {
        System.out.println(tiling(4));

    }

    public static int tiling(int n) {
        if (n == 0 || n == 1)
            return 1;
        int one = tiling(n - 1);
        int two = tiling(n - 2);
        int sum = one + two;
        return sum;
    }

}
