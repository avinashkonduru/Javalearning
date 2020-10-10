package concept;

/**
 * int, float, double -> primitive data types
 * Interger, FLoat, Double, Character,Byte,Short,Boolean -? wrapper class
 * primitive works faster than wrapper classes
 * when wrapper classes are slow, why we should use wrapper classes
 * few frameworks like collections, hibernate, support only wrapper classes
 */
public class WrapperDemo {

    public static void main(String[] args) {
        int i = 5;//primitive datatype
        Integer ii= new Integer(i);//Boxing . Wraping
        int j = ii.intValue();//unboxing . unWraping

        Integer value = i;//auto boxing
        int k = value;//auto unboxing

        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);


    }
}
