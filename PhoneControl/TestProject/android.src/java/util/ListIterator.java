package java.util;

public abstract interface ListIterator<E> extends Iterator<E>
{
  public abstract void add(E paramE);

  public abstract boolean hasNext();

  public abstract boolean hasPrevious();

  public abstract E next();

  public abstract int nextIndex();

  public abstract E previous();

  public abstract int previousIndex();

  public abstract void remove();

  public abstract void set(E paramE);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.ListIterator
 * JD-Core Version:    0.6.2
 */