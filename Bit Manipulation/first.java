public class first {
    public static void main(String[] args) {
        System.out.println("Binary AND of  5 & 6  = " + (5 & 6));
        System.out.println("Binary ORD of  5 | 6  = " + (5 | 6));
        System.out.println("Binary XOR of  5 ^ 6  = " + (5 ^ 6));
        System.out.println("1's Complement of ~5  = " + (~5));
        System.out.println("Binary LEFT SHIFT of  5 << 6  = " + (5 << 6));
        System.out.println("Binary RIGHT SHIFT of  5 >> 6  = " + (5 >> 2));
        // evenOrOdd(5);
        // getIthBit(4, 2);
        // setIthBit(4, 3);
        // clearIthBit(10, 1);
        // clearRangeofBits(10, 2,4);
        // int a[] = { 0, 6, 8, 2, 5 ,2,9,1,0};
        // bubble(a);
        // checkIfMultipleOf2(15);
        // countBits(15);
        fastExponentiation(3, 2);
        
    }

    public static void evenOrOdd(int num) {
        if ((num & 1) == 0) {
            System.out.println("EVEN");
        } else
            System.out.println("ODD");
    }

    public static void getIthBit(int num, int i) {
        int bitMask = 1 << i;
        if ((bitMask & num) == 0)
            System.out.println(0);
        else
            System.out.println(1);
    }

    // Set ith bit means put 1 in place of ith bit
    public static void setIthBit(int num, int i) {
        int bitMask = 1 << i;
        System.out.println(num | bitMask);
    }

    // Clear ith bit means put 0 in place of ith bit
    public static void clearIthBit(int num, int i) {
        int bitMask = ~(1 << i);
        System.out.println(num & bitMask);
    }

    public static void updateIthBit(int num, int i, int newBit) {
        if (newBit == 0)
            clearIthBit(num, i);
        else
            setIthBit(num, i);
    }

    public static void clearlastBits(int num, int i) {
        int bitmask = (~0) << i;
        System.out.println(bitmask & num);
    }

    public static void clearRangeofBits(int num, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        System.out.println(num & bitmask);
    }

    public static void checkIfMultipleOf2(int num) {
        if ((num & (num - 1)) == 0) {
            System.out.println("Number is Multiple of 2");
        } else {
            System.out.println("Number is not Multiple of 2");
        }
    }

    static void countBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        System.out.println(count);
    }

    static void fastExponentiation(int a,int num) {
        int ans = 1;
        while (num > 0) {
            if ((num & 1) != 0) {
                ans *= a;
            }
            a = a * a;
            num >>= 1;
        }
        System.out.println(ans);
    }


    public static void bubble(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
