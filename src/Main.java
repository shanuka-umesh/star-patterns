public class Main {

    public static void main(String[] args) {

       //starPattern01();
         reverseStarPattern01();


    }


    public static void starPattern01(){

        int lineCount = 5;

        for (int i = 1; i <= lineCount; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

    public static void reverseStarPattern01(){

        int linecount =5;

        for(int i=linecount; i > 0 ; i--)
        {
            for(int j=0 ; j<i ; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}