public class Duplicate_String {
    public static void main(String[] args) {
        boolean map[] = new boolean[25];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        String sentence = "altamashsheikh";
        DuplicateString(sentence, idx, sb, map);
    }
    public static void DuplicateString(String str, int idx, StringBuilder newString, boolean[] map) {
        if (str.length() == idx) {
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            DuplicateString(str, idx + 1, newString, map);
        } else {
            map[ch - 'a'] = true;
            DuplicateString(str, idx + 1, newString.append(ch), map);
        }
    }  
}
