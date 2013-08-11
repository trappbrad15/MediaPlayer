package java.util;

public abstract interface SortedSet<E> extends Set<E>
{
  public abstract Comparator<? super E> comparator();

  public abstract E first();

  public abstract SortedSet<E> headSet(E paramE);

  public abstract E last();

  public abstract SortedSet<E> subSet(E paramE1, E paramE2);

  public abstract SortedSet<E> tailSet(E paramE);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.SortedSet
 * JD-Core Version:    0.6.2
 */