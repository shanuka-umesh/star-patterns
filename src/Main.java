public class Main {

    public static void main(String[] args) {

        // starPattern01();
        //  reverseStarPattern01();
        //  starPattern03(3);
        //  starPattern04(6);
        //  starPattern05(6);
        // triangleStarPattern(6);
        // rightArrowHead(6);
        //  diamonShapePattern(6);
        triangleOutline(5);

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


    public static void triangleStarPattern(int n)   // Full Triangle
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


    public static void rightArrowHead(int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n-1 ; i>0 ; i--)
        {
            for(int j=0 ; j<i ; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void diamonShapePattern(int n)  // not finished last part of the diamond
    {
        for(int i=0; i<n ; i++)
        {
            for(int j=i ; j<=n ; j++)
            {
                System.out.print(" ");
            }

            for(int j=0 ; j<(2*i)-1 ; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
        for( int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print(" ");
            }
            for(int j=i ; j<n*2-1; j++)
            {
                System.out.print("*");
            }


            System.out.println("");
        }
    }


    public static void triangleOutline(int lineCount)
    {
            for(int i=0 ; i<lineCount ; i++)
            {
                for(int j=lineCount ; j>i ; j--)
                {
                    System.out.print(" ");
                }

                if(i==0||i==lineCount){
                    for(int k = 0 ; k<=i ; k++)
                    {
                        System.out.print("* ");
                    }
                }
                else{
                    System.out.print("*");

                    for (int k = 1; k  <  i; k++) {
                        System.out.print("  ");
                    }

                    System.out.print(" *");
                }


                System.out.println("");


            }

    }

}