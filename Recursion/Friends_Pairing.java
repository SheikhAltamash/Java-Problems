public class Friends_Pairing {
    public static void main(String[] args) {
        System.out.println(pairing(4));
    }

    public static int pairing(int n) {
        if (n == 1 || n == 2)
            return n;
        return pairing(n - 1) + (n - 1) * pairing(n - 2);
    }
}
