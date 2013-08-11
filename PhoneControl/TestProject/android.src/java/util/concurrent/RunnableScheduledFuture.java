package java.util.concurrent;

public abstract interface RunnableScheduledFuture<V> extends RunnableFuture<V>, ScheduledFuture<V>
{
  public abstract boolean isPeriodic();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.concurrent.RunnableScheduledFuture
 * JD-Core Version:    0.6.2
 */