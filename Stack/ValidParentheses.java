import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{}[][([{}])]"));
        System.out.println(2 & 8);
        System.out.println(isDuplicate("{{a+b}+h*(t5g}"));
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                s.push(c);
            } else {
                switch (c) {
                    case ')':
                        if (s.pop() != '(') {
                            System.out.println(i);
                            return false;
                        }
                        break;
                    case ']':
                        if (s.pop() != '[') {
                            System.out.println(i);
                            return false;
                        }
                        break;
                    case '}':
                        if (s.pop() != '{') {
                            System.out.println(i);
                            return false;
                        }
                        break;
                }
            }
            i++;
        }
        return true;
    }

    public static boolean isDuplicate(String str) {
        int size = str.length();
        Stack<Character> s = new Stack<>();
        int i = 0, count;
        while (size > i) {
            char ch = str.charAt(i);
            count = 0;
            if (ch != ')' && ch != ']' && ch != '}') {
                s.push(ch);
            } else {
                if (ch== ')') {
                    while (s.peek() != '(') {
                        count++;
                        s.pop();
                    }
                    if (count < 1)
                        return false;
                }  if (ch == '}') {
                    while (s.peek() != '{') {
                        count++;
                        s.pop();
                    }
                    if (count < 1)
                        return false;
                } if (ch == ']') {
                    while (s.peek() != '[') {
                        count++;
                        s.pop();
                    }
                    if (count < 1)
                        return false;
                }
            }
            i++;
        }
        return true;

    }
}
