import java.util.*;
public class String_Practice {
    public static void main(String[] args) {
        // Question 1
        String vowel = "aeiouAeiouhelloto kaise hai aap log ";
        String vowel2 = "kaise logaeio haiuAeiaapouhelloto   ";
        anagram(vowel, vowel2);
        countVowel(vowel2);

    }
    
    static void anagram(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean isanagram = Arrays.equals(charArray1, charArray2);
        if (isanagram)
            System.out.println("The given two Strings are Anagram ");
        else
            System.out.println("The given two Strings are not Anagram ");
    }

    static void countVowel(String vowel) {
        int count = 0;
        for (int i = 0; i < vowel.length(); i++) {
            switch (vowel.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                default:
                    break;

            }
        }
        System.out.println(count);
    }
}
