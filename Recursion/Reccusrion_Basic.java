public class Reccusrion_Basic {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(recFac(5));
        printRevRec(10);
        System.out.println(fibonacci(40));
        System.out.println(sumOfNatural(40));
        int a[] = { 1, 2, 3, 3, 6, 7, 8 };
        // checkifSorted(a, 0);
        // int i=firstOccurance(a, 0, 4);
        // if (i != -1) {
        // System.out.println("The first occurence of the number is present at index " +
        // i);
        // }
        // else
        // System.out.println("The number is not present in the array ");
        int j = lastOccurance(a, a.length - 1, 4);
        if (j != -1) {
            System.out.println("The last occurence of the given number  is " + j);
        } else
            System.out.println("The number is not present in the array ");
        int res = exponent(2, 4);
        System.out.println(res);
        int fastExponentiation = optimizedExponent(5, 3);
        System.out.println(fastExponentiation);
        
    }

    static int recFac(int num) {
        if (num <= 1)
            return 1;
        return num * recFac(num - 1);
    }

    static void printRevRec(int num) {
        if (num <= 0) {
            return;
        }
        printRevRec(num - 1);
        System.out.println(num);

    }

    static int sumOfNatural(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 0)
            return 0;
        return sumOfNatural(num - 1) + sumOfNatural(num - 2);
    }

    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    static void checkifSorted(int a[], int i) {
        if (i == a.length - 1) {
            System.out.println("Sorted");
            return;
        }
        if (a[i] > a[i + 1]) {
            System.out.println("Not sorted");
            return;
        }

        checkifSorted(a, i + 1);
    }

    static int firstOccurance(int a[], int i, int key) {
        if (a[i] == a.length - 1)
            return -1;
        if (a[i] == key) {
            return i;
        }
        return firstOccurance(a, i + 1, key);
    }

    static int lastOccurance(int a[], int i, int key) {
        if (i == -1)

            return -1;
        if (a[i] == key) {
            return i;
        }
        return lastOccurance(a, i - 1, key);
    }

    static int exponent(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * exponent(a, b - 1);
    }

    static int optimizedExponent(int a, int b) {
        if (b == 0)
            return 1;
        int half = optimizedExponent(a, b / 2);
        int halfPowSqr = half * half;
        if (b % 2 != 0) {
            halfPowSqr = a * halfPowSqr;
        }
        return halfPowSqr;
    }
}
