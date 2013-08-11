package java.util;

public abstract interface NavigableMap<K, V> extends SortedMap<K, V>
{
  public abstract Map.Entry<K, V> lowerEntry(K paramK);

  public abstract K lowerKey(K paramK);

  public abstract Map.Entry<K, V> floorEntry(K paramK);

  public abstract K floorKey(K paramK);

  public abstract Map.Entry<K, V> ceilingEntry(K paramK);

  public abstract K ceilingKey(K paramK);

  public abstract Map.Entry<K, V> higherEntry(K paramK);

  public abstract K higherKey(K paramK);

  public abstract Map.Entry<K, V> firstEntry();

  public abstract Map.Entry<K, V> lastEntry();

  public abstract Map.Entry<K, V> pollFirstEntry();

  public abstract Map.Entry<K, V> pollLastEntry();

  public abstract NavigableMap<K, V> descendingMap();

  public abstract NavigableSet<K> navigableKeySet();

  public abstract NavigableSet<K> descendingKeySet();

  public abstract NavigableMap<K, V> subMap(K paramK1, boolean paramBoolean1, K paramK2, boolean paramBoolean2);

  public abstract NavigableMap<K, V> headMap(K paramK, boolean paramBoolean);

  public abstract NavigableMap<K, V> tailMap(K paramK, boolean paramBoolean);

  public abstract SortedMap<K, V> subMap(K paramK1, K paramK2);

  public abstract SortedMap<K, V> headMap(K paramK);

  public abstract SortedMap<K, V> tailMap(K paramK);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.NavigableMap
 * JD-Core Version:    0.6.2
 */