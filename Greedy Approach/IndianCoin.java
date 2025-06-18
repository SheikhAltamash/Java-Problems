public class IndianCoin {
    public static void main(String[] args) {
        int currencies[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int amount = 544;
        int numberOfCoins = 0;
        for (int i = 0; i < currencies.length; i++) {
            if (amount >= currencies[i]) {
                while (currencies[i] <= amount) {
                    numberOfCoins++;
                    amount -= currencies[i];
                }
            }
        }
        System.out.println(numberOfCoins);
    }
}
