package java.util;

public abstract interface Set<E> extends Collection<E>
{
  public abstract boolean add(E paramE);

  public abstract boolean addAll(Collection<? extends E> paramCollection);

  public abstract void clear();

  public abstract boolean contains(Object paramObject);

  public abstract boolean containsAll(Collection<?> paramCollection);

  public abstract boolean equals(Object paramObject);

  public abstract int hashCode();

  public abstract boolean isEmpty();

  public abstract Iterator<E> iterator();

  public abstract boolean remove(Object paramObject);

  public abstract boolean removeAll(Collection<?> paramCollection);

  public abstract boolean retainAll(Collection<?> paramCollection);

  public abstract int size();

  public abstract Object[] toArray();

  public abstract <T> T[] toArray(T[] paramArrayOfT);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.Set
 * JD-Core Version:    0.6.2
 */