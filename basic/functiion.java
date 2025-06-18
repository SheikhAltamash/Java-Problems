public class functiion {
    public static void main(String[] args) {
        int answer = factorial(5);
        System.out.println(answer);
        System.out.println(binomialCoefficient(6, 9));
        int isPrime = prime(6, 2);
        if (isPrime == 1)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
        System.out.println(binaryToDecimal(1011));
        System.out.println(decimalToBinary(11));
        System.out.println(decTobBin2ndAproach(11));
        System.out.println(isEven(5));
        System.out.println(avg(4, 6, 9));
        palindrome(10201);
        System.out.println(Math.abs(4.63));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(4, avg(2, 5, avg(4, 6, 6))));
        System.out.println(Math.min(4, 6));
        System.out.println(Math.max(5, 6));
         sumOfDigits(554);
   

    }

    public static int factorial(int i) {
        int answer = 1;
        for (int j = 1; j <= i; j++) {
            answer *= j;
        }
        return answer;
    }

    public static int binomialCoefficient(int r, int n) {
        int answer = (factorial(n) / (factorial(r) * factorial(n - r)));
        return answer;
    }

    public static int prime(int num, int i) {
        if (i > num)
            return -1;
        if (i > Math.sqrt(num))
            return 1;
        if (num % i == 0)
            return -1;

        return prime(num, i + 1);

    }

    public static int binaryToDecimal(int bin) {
        int pow = 0;
        int dec = 0;

        while (bin > 0) {
            int digit = bin % 10;
            dec = dec + (digit * (int) Math.pow(2, pow));
            pow++;
            bin /= 10;

        }
        return dec;
    }

    public static StringBuilder decimalToBinary(int dec) {

        StringBuilder sb = new StringBuilder(" ");
        if (dec == 0) {
            sb.append("0");
            return sb;
        }
        while (dec > 0) {
            sb.append(dec % 2);
            dec /= 2;
        }
        return sb.reverse();
    }

    public static int decTobBin2ndAproach(int dec) {
        int bin = 0;
        int pow = 0;
        while (dec > 0) {
            int remainder = dec % 2;
            bin = bin + (remainder * (int) Math.pow(10, pow));
            pow++;
            dec /= 2;
        }
        return bin;
    }

    // _______________________PRACTICE QUESTIONS_____________________
    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    public static void palindrome(int number) {
        int original = number;
        int answer = 0;
        while (number > 0) {
            int digit = number % 10;
            answer = (answer * 10) + digit;
            number /= 10;
        }
        if (answer == original)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

      static void sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
