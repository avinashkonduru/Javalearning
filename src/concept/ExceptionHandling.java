package concept;

public class ExceptionHandling {

    public static void main(String[] args)
//    {
//        int i=9/0;
//        System.out.println("Bye");
//        /**
//         * Exception in thread "main" java.lang.ArithmeticException: / by zero
//         * 	at concept.ExceptionHandling.main(ExceptionHandling.java:6)
//         */
//    }
    {
        try{
            int i =9/0;

        }

        catch (Exception e){
            System.err.println("Error");
        }
        finally{
            System.out.println("Bye");
        }
    }

}
