package courseutil;

import java.util.function.Consumer;

public class Util {

    public static Consumer<Object> onNext()
    {
        return o-> System.out.println("Received :" + o);
    }
    public static Consumer<Throwable> onError()
    {
        return e-> System.out.println("ERROR :" + e.getMessage());
    }
    public static Runnable onComplete()
    {
        return ()-> System.out.println("completed");
    }
    public static void Sleepseconds(int seconds)  {
           try {
               Thread.sleep(1000);
           }
           catch(InterruptedException e)
           {
              e.getMessage();
           }

    }
}
