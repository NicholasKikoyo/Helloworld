public class PineTree {
    public static void main(String[] args) {
    int height = 6 ;
    myTree(height);

  }

    public static void myTree(int height){
        if (height < 3){
            System.out.println("height should be >= 3");
        }
        else {
            System.out.println("I");
            for (int i = 2; i < height; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % 2 != 0) {
                        System.out.print("X");
                    } //else {
                    //System.out.print("Y");
                    // System.out.println();
                    //}
                    System.out.println();
                }
            }
            System.out.println("M");
        }
    }
}

