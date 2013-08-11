package java.util;

public abstract interface Queue<E> extends Collection<E>
{
  public abstract boolean add(E paramE);

  public abstract boolean offer(E paramE);

  public abstract E remove();

  public abstract E poll();

  public abstract E element();

  public abstract E peek();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.Queue
 * JD-Core Version:    0.6.2
 */