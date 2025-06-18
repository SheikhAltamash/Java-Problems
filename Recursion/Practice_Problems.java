class Practice_Problems {
    public static void main(String[] args) {
        // p1
        // int original[] = { 1, 2, 3, 2, 2, 4, 5, 2, 3, 2 };
        // int answerArray[] = new int[original.length];
        // p1(original.length - 1, answerArray, 2, original, original.length - 1);

        // // p2
        // System.out.println();
        // p2(123, new StringBuilder(" "));
        // p3(0, "altamash");

        // counting number of sub string in a string
        // String name = "abcab";
        // int count = 0;
        // for (int i = 0; i < name.length(); i++) {
        //     for (int j = i; j < name.length(); j++) {
        //         if(name.charAt(i)== name.charAt(j) ){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
        toh(3, 10, 20, 30);
    }
     

    

    // Problem 1 :
    // For a given integer array of size N.You have to find all the occurrences
    // (indices) of a given element (Key) and print them.
    // Use a recursive function to solve this problem
    static void p1(int index, int array[], int key, int original[], int count) {
        if (index < 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            return;
        }
        if (key == original[index]) {
            array[count] = index;
            count--;

        }
        p1(index - 1, array, key, original, count);
    }

    // Problem 2 :

    static void p2(int number, StringBuilder str) {
        if (number == 0) {
            System.out.println(str);
            return;
        }
        int digit = number % 10;

        switch (digit) {
            case 1:
                str.insert(0, " one");
                break;
            case 2:
                str.insert(0, " two");
                break;
            case 3:
                str.insert(0, " three");
                break;
            case 4:
                str.insert(0, " four");
                break;
            case 5:
                str.insert(0, " five");
                break;
            case 6:
                str.insert(0, " six");
                break;
            case 7:
                str.insert(0, " seven");
                break;
            case 8:
                str.insert(0, " eight");
                break;
            case 9:
                str.insert(0, " nine");
                break;
            case 0:
                str.insert(0, " zero");
                break;

        }
        p2(number /= 10, str);
    }

    // Problem 3: 
    static void p3(int number, String str) {

        try {
            str.charAt(number);

        } catch (Exception e) {
            System.out.println(number);
            return;
        }
        p3(++number, str);
    }
// PROBLEM   TOWER OF HANOI
    static void toh(int n ,int A,int C,int B){
        if (n == 0)
            return;
        toh(n - 1, A, B, C);
        System.out.println("Moving " + n + "th disk from " + A + " to " + C);
        toh(n - 1, B, C, A);
    }

}