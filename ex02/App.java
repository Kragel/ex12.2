package t_12_errorHandingWithExceptions.ex02;

public class App {

    public static void main(String[] args)
    {
        Integer num = null;
        try
        {
            num.getClass();
        }
        catch (NullPointerException ex)
        {
            ex.printStackTrace();
        }
    }

}
