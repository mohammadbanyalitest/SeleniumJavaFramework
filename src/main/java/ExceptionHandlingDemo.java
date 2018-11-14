public class ExceptionHandlingDemo {

    public static void main(String[] args) {


        try {
            demo();
        }

        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    public static void demo () throws Exception
    {

        System.out.println("hello");
            int i = 1 / 0;
            System.out.println("completed ");


    }

}
