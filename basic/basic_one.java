import java.util.Scanner;

public class basic_one {
  public static void main(String[] args) {
    //-----------------------------------------------------------DAY 8 ------------------------------------------------------------------------------------------------

    Scanner sc = new Scanner(System.in);
    // //First Question
    // System.out.println("Enter first number");
    // int one = sc.nextInt();
    // System.out.println("Enter second number");
    // int two = sc.nextInt();
    // System.out.println("Enter third number");
    // int three = sc.nextInt();
    // System.out.println("Average of thwo numbers is " + (two + one + three) / 3);

    // //Second Question
    // System.out.println("Enter Size of the Square");
    // int squareArea = sc.nextInt();
    // System.out.println("The Area of the Square is "+ squareArea*squareArea);

    // // Third Question
    // System.out.println("Enter pen price");
    // float pen = sc.nextFloat();
    // System.out.println("Enter pencil price ");
    // float pencil = sc.nextFloat();
    // System.out.println("Enter eraser price");
    // float eraser = sc.nextFloat();
    // System.out.println("Total cost of stationery is with GST is : "+((pen+pencil+eraser)+((pen+pencil+eraser)*0.18f)));

    // Code to convert decimal to binary

    // System.out.println("Enter any Decimal Number");
    // int dec = sc.nextInt();
    // String bin = "";
    // while (dec > 0) {
    //     int remainder = dec % 2;
    //     bin = remainder + bin;
    //     dec /= 2;
    // }
    // System.out.println(bin);

    // System.out.println("Enter any Binary Number");
    // String bin2 = sc.next();
    // int dec2 = 0;
    // int pow = 0;
    // for (int i = bin2.length() - 1; i >= 0; i--) {
    //     int bit = bin2.charAt(i) - '0';
    //     dec2 += bit * (int) Math.pow(2, pow);
    //     pow++;
    // }
    // System.out.println(dec2);

    // //-----------------------------------------------------------------DAY 9 -----------------------------------------------------
    // // Quesiton 1 
    // System.out.println("Enter a number to check whether is it positive or negative");
    // int num = sc.nextInt();
    // if (num >= 0)
    //     System.out.println("Number is positive");
    // else
    //     System.out.println("Number is negative");

    // //Question 2 
    // System.out.println("Enter your temperature to check whether you have fever or nothing");
    // double temp = sc.nextDouble(), preTemp = 103.5;
    // if (temp > preTemp)
    //     System.out.println("You have Fever");
    // else
    //     System.out.println("You do not have Fever");

    // // Question 3 
    // System.out.println("Enter any number between 1 to 7");
    // int day = sc.nextInt();
    // if (day < 0 || day > 7)
    //     System.out.println("Enter a valid number !");
    // else
    //     switch (day) {
    //         case 1:
    //             System.out.println("Sunday");
    //             break;
    //         case 2:
    //             System.out.println("Monday");
    //             break;
    //         case 3:
    //             System.out.println("Tuesday");
    //             break;
    //         case 4:
    //             System.out.println("Wednesday");
    //             break;
    //         case 5:
    //             System.out.println("Thursday");
    //             break;
    //         case 6:
    //             System.out.println("Friday");
    //             break;
    //         case 7:
    //             System.out.println("Saturday");
    //             break;
    //     }

    // // Question 4 
    // int a = 63, b = 36;
    // boolean x = (a < b) ? true : false;
    // int y = (a > b) ? a : b;
    // System.out.println(x + "  " + y);

    // //Question 5 
    // System.out.println("Enter any year to check wheter it is leap year or not");
    // int year = sc.nextInt();
    // if ((year % 4 == 0) && ((year % 100 !=0) || (year % 400 == 0))) {
    //     System.out.println("Year is leap year");
    // }
    // else System.out.println("Year is not leap year");
    int[] array = { 2, 3, 4, 10, 40 };
    int key = 10;
    int result = binarySearch(array, key);

    if (result != -1) {
      System.out.println("Number found at index " + result);
    } else {
      System.out.println("Number not found");
    }

    sc.close();
  }

    public static int binarySearch(int a[],int key){
  int high = a.length-1;
  int low = 0;
  while (low <= high) {
    int mid = (low + high) / 2;
    if (a[mid] == key){
    return mid;
  } 
    else if (a[mid] < key) {
      low = mid + 1;
    } else
      high = mid - 1;
  }

  return -1;
}
}

