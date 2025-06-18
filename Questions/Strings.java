import java.security.Security;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Question1();
        // Question2();
        // Question3();
        // Question4();
        // Question5();
        // Question6();
        // Question7();
        // Question8();
        // Question9();
        // Question10();
        // Question11();
        // Question12();
        // Question13();

    }

    public static void Question1() {
        String input = "(){({}[()][]())}(){}";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && stack.peek() == '(') {
                stack.pop();

            } else if (ch == ']' && stack.peek() == '[') {
                stack.pop();

            } else if (ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                System.out.println("Failed at index " + i);
                return;
            }

        }
        System.out.println("All ok the given set of symbols are allowed");
    }

    public static void Question2() {
        // Count the number of each vowel in a string
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);

        String str = "altamash sheikh";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                map.put(ch, map.get(ch) + 1);
            }
        }
        System.out.println(map);

    }

    public static void Question3() {
        // Sort alphabetically the words from a string provided by the user.
        String str = "helo i am sheikh altamash";
        String strArray[] = str.split(" ");
        // MergeSort(strArray, 0, strArray.length - 1);
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (strArray[i].compareTo(strArray[j]) <= 0) {
                    String temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }

    public static void MergeSort(String array[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        MergeSort(array, start, mid);
        MergeSort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    public static void merge(String array[], int start, int mid, int end) {
        int n1 = mid - start + 1, n2 = end - mid;
        String leftArrString[] = new String[n1];
        String rightArrString[] = new String[n2];
        for (int i = 0; i < n1; i++) {
            leftArrString[i] = array[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArrString[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0, k = start;
        while (n1 > i && n2 > j) {
            if (leftArrString[i].compareTo(rightArrString[j]) <= 0) {
                array[k++] = leftArrString[i++];
            } else {
                array[k++] = rightArrString[j++];
            }
        }
        while (n1 > i) {
            array[k++] = leftArrString[i++];
        }
        while (n2 > j) {
            array[k++] = rightArrString[j++];
        }

    }

    public static void Question4() {
        // Print even length words in a string
        String str = "This is a simple Java program to test even length words";
        String words[] = str.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    public static void Question5() {
        // Count the Number of matching characters in a pair of string
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        String str1 = "altamash";
        String str2 = "sheikh";
        int count = 0;
        for (char ch : str1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (char ch : map1.keySet()) {
            if (map2.containsKey(ch)) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public static void Question6() {
        // Remove all duplicates from a given string
        String str = "Sheikh Altamash sheikhAltamash altamash i am engineer and a web developer";
        StringBuilder result = new StringBuilder();
        boolean seen[] = new boolean[256];
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        System.out.println(result);
    }

    public static void Question7() {
        // Program to check if a string contains any special character
        String str = "sheikh $%&*9)altamahs ";
        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.println(ch);
            }
        }
    }

    public static void Question8() {
        // Get all substrings of given string
        String str = "Sheikh altamash";
        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i+1; j < str.length(); j++) {
        // String sub = str.substring(i, j);
        // System.out.println(sub);
        // }
        // }

    }

    public static void Question9() {

        // Convert string to list and print word frequencies
        String input = "hello world hello java world java java";

        // Step 1: Convert string to list of words (split by space)
        String[] words = input.split("\\s+");

        // Step 2: Use Map to count frequencies
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Step 3: Print frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    public static void Question10() {
        // Count Uppercase, Lowercase, special character and numeric values in a given
        // string. String str1 = "altamash sheikh", str2 = "ayan sheikh";
        String str = "Sheikh Altamash@2004";
        int up = 0, low = 0, special = 0, num = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num++;
            } else if (Character.isUpperCase(ch)) {
                up++;
            } else if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                special++;
            } else if (Character.isLowerCase(ch)) {
                low++;
            }
        }
        System.out.println("Number " + num);
        System.out.println("Upper Case " + up);
        System.out.println("Lower Case " + low);
        System.out.println("Special Character " + special);
    }

    public static void Question11() {
        // Reverse alternative word in a given string
        String str = "Hii i am sheikh Altamash";
        String arraystr[] = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arraystr.length; i++) {
            if (i % 2 != 0) {
                result.append(new StringBuilder(arraystr[i]).reverse());
            } else {
                result.append(arraystr[i]);
            }
            if (i < arraystr.length - 1) {
                result.append(" ");
            }
        }
        System.out.println(result);
    }

    public static void Question12() {
        // Palindrome string check
        String str = "altlamash";
        StringBuilder reversestr = new StringBuilder(str).reverse();
        String ans = reversestr.toString();
        System.out.println(ans);
        System.out.println(str.equals(ans));
        ans = "";
        // Brute Force Approach
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ans += ch;
        }
        System.out.println(ans);
        System.out.println(str.equals(ans));
    }

    public static void Question13() {
        // Reverse string without using in-built functions
        String str = "hello world";
        char[] chars = new char[str.length()];
        // Fill the array in reverse order
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(str.length() - 1 - i);
        }
        // Construct the reversed string manually
        String reversed = "";
        for (int i = 0; i < chars.length; i++) {
            reversed += chars[i]; // not efficient, but avoids using libraries
        }
        System.out.println(reversed);
    }

    public static void Question14() {
        // Security Key: Count of repeating digits in a number (treated as string for digit access).
      

    }







}


