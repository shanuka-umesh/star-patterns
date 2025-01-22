public class Main {

    public static void main(String[] args) {

        // starPattern01();
        //  reverseStarPattern01();
        //  starPattern03(3);
        //  starPattern04(6);
        //  starPattern05(6);
         diamondStarPattern(6);

    }


    public static void starPattern01() {

        int lineCount = 5;

        for (int i = 1; i <= lineCount; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

    public static void reverseStarPattern01() {

        int linecount = 5;

        for (int i = linecount; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void starPattern03(int n) {   // Squre Star pattern

        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void starPattern04(int n)    // sqare with middle blanks
    {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }

            }
            System.out.println("");
        }
    }


    public static void starPattern05(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void diamondStarPattern(int n)   // Full Triangle
    {
        for(int i=0; i<n ; i++)
        {
            for(int j=i ; j<n ; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }




}