public class ForLoopLearning {
    /**
     * @param args
     */
    public static void main(String[] args) {
//        for(int i = 1; i<=10; i++){
//            System.out.println(i);
//        }

        for (int i = 65; i <= 67; i++) {
            for (int j = 65; j <= i; j++) {
                //System.out.print("* ");
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                //System.out.print("* ");
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 65; i <= 70; i++) {
            for (int j = 65; j <= i; j++) {
                //System.out.print("* ");
                System.out.print("$ ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                //System.out.print("* ");
                System.out.print(" ");
                for (int k = 1; k<=4; k++){
                    /**/
                    /**
                     *
                     */


                }
            }
            System.out.println();
        }
    }
}
