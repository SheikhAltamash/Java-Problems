public class ShortestPath {
    public static void main(String[] args) {
        float n = shortestPath("nul");
        System.out.println(n);
        String name = "altaamsh";
        name += "tr";
        name = "helogfhst";
        String newname = name.substring(3);
        System.out.println(newname);

        
        System.out.println(name.substring(3, 6));
        StringBuilder one = new StringBuilder("altamash Shei k fgl  rg");
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) == ' ' && i != one.length()) {
                char a = Character.toUpperCase(one.charAt(i + 1));
                one.setCharAt(i + 1, a);
            }
        }
        one.setCharAt(0, Character.toUpperCase(one.charAt(0)));
        System.out.println(one);

    }

    public static float shortestPath(String path) {
        int n = path.length(), x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            char dir = path.charAt(i);
            if (dir == 'n' || dir == 'N') {
                x++;
            } else if (dir == 's' || dir == 'S') {
                x--;
            } else if (dir == 'w' || dir == 'W') {
                y++;
            } else {
                y--;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }
}
