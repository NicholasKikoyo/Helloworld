public class NumberPattern {

    public static void main(String[] args) {
        int n = 6;

        nestedLp(n);

    }
    public static void nestedLp(int n){
            for (int i = 0; i < n; i++) {

                for (int j = 1; j <= i; j++)

                    System.out.print( j);

                System.out.println();
            }
        }
    }

