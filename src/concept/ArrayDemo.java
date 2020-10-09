package concept;

public class ArrayDemo {
    public static void main(String[] args) {
//       // int nums[] = new int[4];
////        nums[0] = 8;
////        nums[1]=12;
////        nums[2]=76;
////        nums[3]=54;
////        nums[2]=99;
//
//        int nums[] = {10,11,12,13};
//
//        //System.out.println(nums[4]);
//        /**
//         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//         * 	at concept.ArrayDemo.main(concept.ArrayDemo.java:9)
//         */
//        for (int num:nums
//             ) {
//            System.out.print(num+" ");
//
//        }

    int a[] = {1,2,3,4};
    int b[] = {2,4,6,8};
    int c[] = {5,6,7,8};
    int d[][]=
            {
                    {1,2,3,4},
                    {2,4,6,8},
                    {5,6,7,8},
                    {3,4,7,9},
                    {4,6,7,8,10,67}
            };
//    for (int i=0; i<d.length;i++){
//        for (int j=0;j<d[i].length;j++){
//            System.out.print(" "+ d[i][j]);
//        }
//        System.out.println();
//    }
//enhanced for look
        for (int k[] :d
             ) {
            for (int l:k
                 ) {
                System.out.print(" "+ l);
            }
            System.out.println();

        }
    }
}
