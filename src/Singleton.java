public class Singleton {
private  int  nbrExecution=0;
    private static Singleton instance=null;

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {if (instance == null)
    {
        instance = new Singleton();
    }
        System.out.println("getInstance() called");
      return instance;
    }



}
