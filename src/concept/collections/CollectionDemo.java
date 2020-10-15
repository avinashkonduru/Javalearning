package concept.collections;

import java.util.*;

/**
 * collection - concept
 * Collection-Api
 * Collections-Class
 *
 * Array
 * Collection
 * Generics-
 * /**
 * list
 * Arraylist
 *
 * Set,
 * HashSet
 * TreeSet
 *
 *
 * Map
 * HashMaps();
 * HastTable();
 *
 *collection introduced in 1.2
 * generics introduced in 1.5
 * List<Integer> values = new ArrayList<Integer>();/1.5
 * List<Integer> values = new ArrayList<>();/1.7
 * in 1.7
 *
 */


public class CollectionDemo {
    public static void arrayDemo() {
        int a[] = new int[3];
        a[0] = 4;
        a[1] = 6;
        a[2] = 5;
        int b[] = {2, 3, 4, 5};

        System.out.println(b[0]);

    }

    public static void collectionDemo() {
        Collection values = new ArrayList();
        values.add(4);
        values.add("Avinash");

        System.out.println(values);
        //collections doesn't support index values
        Iterator iterator = values.iterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        /**
//         * Exception in thread "main" java.util.NoSuchElementException
//         *         at java.base/java.util.ArrayList$Itr.next(ArrayList.java:999)
//         *         at concept.collections.CollectionDemo.collectionDemo(CollectionDemo.java:53)
//         *         at concept.collections.CollectionDemo.main(CollectionDemo.java:65)
//         */
//        //

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    public static void genericsDemo() {
        Collection<Integer> values = new ArrayList<Integer>();
        /// values.add("Aris");
        values.add(5689);
        System.out.println(values);

    }

    private static void collectionListInterface() {
        List values = new ArrayList();
        values.add(4);
        values.add("Avinash");
        values.add(1, "Konduru");
        System.out.println(values);
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }

        for (Object i : values) {
            System.out.println(i);
        }
    }

    private static void genericsListInterface() {

        List<Integer> values = new ArrayList<>();
        // values.add("Aris");
        values.add(3);
        values.add(4);
        values.add(5);

        for (Integer o : values
        ) {
            System.out.println(o);
        }
    }

    private static void collectionsClassDemo() {
        List<Integer> values = new ArrayList<>();
        // values.add("Aris");
        values.add(3);
        values.add(4);
        values.add(5);

        Collections.sort(values);
        Collections.reverse(values);
        Collections.shuffle(values);
        System.out.println(Collections.max(values) + " " + Collections.min(values));
        for (Integer o : values
        ) {
            System.out.println(o);
        }
    }

    private static void CollectionsComparatorInterface() {
        List<Integer> values = new ArrayList<>();
        values.add(3456);
        values.add(457);
        values.add(598979);

//        Comparator<Integer> c = new Comparator<Integer>() {
//            public int compare(Integer i, Integer j) {
//                return (i % 10 > j % 10)?1:-1;
////                if (i % 10 > j % 10) {
////                    return 1;
////                } else {
////
////                    return -1;
////                }
//            }
//        };
        //Lambda Expression
//        Comparator<Integer> c = (i,j)->(i % 10 > j % 10)?1:-1;
//
//        Collections.sort(values, c);
        Collections.sort(values,(i,j)->(i % 10 > j % 10)?1:-1 );

        for (Integer o : values
        ) {
            System.out.println(o);
        }

    }

    private static void CollectionsComparableInterface() {
        List<Integer> values = new ArrayList<>();
        values.add(3456);
        values.add(457);
        values.add(598979);

        Collections.sort(values,(i,j)->(i % 10 > j % 10)?1:-1 );

        for (Integer o : values
        ) {
            System.out.println(o);
        }
    }
    private static void hashSetInterfaceDemo() {
        Set<Integer> values= new HashSet<>();
        values.add(2345);
        values.add(457);
        values.add(453423);

        for (Integer o : values
             ) {
            System.out.println(o);
        }

    }
    private static void treeSetInterfaceDemo() {
        Set<Integer> values= new TreeSet<>();
        values.add(2345);
        values.add(457);
        values.add(453423);

        for (Integer o : values
        ) {
            System.out.println(o);
        }

    }
    public static void main(String[] args) {
        //arrayDemo();
        //collectionDemo();
        //genericsDemo();
        //collectionListInterface();
        //genericsListInterface();
        //collectionsClassDemo();
        //CollectionsComparatorInterface();
        //CollectionsComparableInterface(); not clear
        //hashSetInterfaceDemo();
        treeSetInterfaceDemo();

    }




}




