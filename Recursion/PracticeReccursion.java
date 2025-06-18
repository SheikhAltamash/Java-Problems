public class PracticeReccursion {

    public static void main(String[] args) {
        //printReverseNumber(10);
        // printDecAndInc(10);
        //  System.out.println(Fibo(8));
        char a = 'c';
        System.out.println((int) a);
        System.out.println(optExpo(2, 3));
       System.out.println(num(5));
    }

    static int num(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if(n==0)return 0;
        return num(n-1)+num(n-2); 
    }
    static void printReverseNumber(int number){
        if (number == 0)
       { return; }        
        System.out.println(number);
        //printReverseNumber(number-1);
       
    }

    static void printDecAndInc(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printDecAndInc(n - 1);
        System.out.println(n);

    }

    static int Fibo(int n) {
        if (n == 0) {
            return 0; // Base case: Fibo(0) = 0
        }
        if (n == 1) {
            return 1; // Base case: Fibo(1) = 1
        }

        return Fibo(n - 1) + Fibo(n - 2);
    }

    public static int optExpo(int n,int p) {
        if (p== 0) {
            return 1;
        }

        int halfhai = optExpo(n ,p/2);
        int ans = halfhai * halfhai;
        if (p % 2 != 0) {
            ans *= n;
        }
        return ans;
    }
}
