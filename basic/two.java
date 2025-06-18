import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello");
        //     i += 2;
        // }
        //odd even
        // int[] number = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int odd = 0, even = 0;
        // for (int i = 0; i < number.length; i++) {
        //     if (number[i] % 2 == 0) {
        //         even += number[i];
        //     } else
        //         odd += number[i];
        // }
        // ;
        // System.out.println("odd : " + odd + "  even : " + even);

        //Factorial
        // System.out.println("Enter any number");
        // int fact = sc.nextInt(), ans = 1;
        // if (fact == 0) {
        //     System.out.println("Factorial of 0 is 1");
        // } else {
        //     for (int i = 1; i < fact + 1; i++) {
        //         ans *= i;
        //     }
        //     System.out.println(ans);
        // }

        // //Multiplication Table
        // System.out.println("Enter any number for multiplication table");
        // int numb = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(" " + numb + " * " + i + " = " + (numb * i));
        // }
        
        // for (int i = 0; i <= 10; i++) {
        //     System.out.println("********************************4");
        // }

        // //Reverse a Number 
        // System.out.println("Enter any number to reverse");
        // int num = sc.nextInt();
        // int res=0;
        // while (num > 0) {
        //     int lastdigit = num % 10;
        //     res=(res*10)+lastdigit;
        //     num = num / 10;
        // }
        // System.out.println(res);

        System.out.println("Enter a number to check whether it is prime or not ");
        int number1 = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(number1); i++) {
            if (number1 % i == 0)
                flag = false;
        }
        if (flag)
            System.out.println("Number is Prime");
        else{
            System.out.println("Number is not Prime");
        }
        sc.close();
    }

}
