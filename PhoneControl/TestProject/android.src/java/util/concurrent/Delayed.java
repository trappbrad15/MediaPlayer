package java.util.concurrent;

public abstract interface Delayed extends Comparable<Delayed>
{
  public abstract long getDelay(TimeUnit paramTimeUnit);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.concurrent.Delayed
 * JD-Core Version:    0.6.2
 */