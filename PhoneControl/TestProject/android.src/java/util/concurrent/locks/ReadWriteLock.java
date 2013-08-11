package java.util.concurrent.locks;

public abstract interface ReadWriteLock
{
  public abstract Lock readLock();

  public abstract Lock writeLock();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.concurrent.locks.ReadWriteLock
 * JD-Core Version:    0.6.2
 */