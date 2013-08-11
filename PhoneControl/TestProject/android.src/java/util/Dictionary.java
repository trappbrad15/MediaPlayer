/*   */ package java.util;
/*   */ 
/*   */ public abstract class Dictionary<K, V>
/*   */ {
/*   */   public Dictionary()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Enumeration<V> elements();
/*   */ 
/*   */   public abstract V get(Object paramObject);
/*   */ 
/*   */   public abstract boolean isEmpty();
/*   */ 
/*   */   public abstract Enumeration<K> keys();
/*   */ 
/*   */   public abstract V put(K paramK, V paramV);
/*   */ 
/*   */   public abstract V remove(Object paramObject);
/*   */ 
/*   */   public abstract int size();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.Dictionary
 * JD-Core Version:    0.6.2
 */