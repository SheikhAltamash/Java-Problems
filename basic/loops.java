import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 6;
        int n = 7;
        System.out.println("\n\n#####  HELLO SIR WELCOME TO MY PROGRAM   #####\n\n");
        System.out.println("First Pattern (SQUARE) \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("\nSecond Pattern (BOTTOM LEFT)\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i - j >= 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println("\nThird Pattern (TOP RIGHT)\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i - j <= 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

        System.out.println("\nFourth Pattern (X)\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i - j == 0 || i + j == n - 1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\nFifth Pattern (Top Left)\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n - 1) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        System.out.println("\nSixth Pattern (Bottom Right)\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\nSeventh Pattern (Floyds Triangle)\n");
        int floydsNumber = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                if (i - j >= 0)
                    System.out.print(floydsNumber++ + "  ");
            }
            System.out.println();
        }

        System.out.println("\nEight Pattern (Hollow square)\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\n Nine Pattern (Butterfly Pattern)\n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j <= 2 * (10 - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 10; i >=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j <= 2 * (10 - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\n Eleventh Pattern (Solid Rhombus)");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < m; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\n Twelfth Pattern (Hollow Rhombus)");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < m; j++) {
                if (j == 0 || i == 0 || j == m - 1 || i == m - 1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\nThirteenth Pattern (Diamond Pattern)");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = m; i >= 0; i--) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\nFourteenth Pattern (Hollow Diamond Pattern)");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                if(j==0||j== (2 * i) - 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = m; i >= 0; i--) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                if (j == 0 ||  j == (2 * i) - 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n Fifteenth Pattern (Pyramid)");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        sc.close();
    }

}
