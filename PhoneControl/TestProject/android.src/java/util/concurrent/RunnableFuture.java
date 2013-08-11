package java.util.concurrent;

public abstract interface RunnableFuture<V> extends Runnable, Future<V>
{
  public abstract void run();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.concurrent.RunnableFuture
 * JD-Core Version:    0.6.2
 */