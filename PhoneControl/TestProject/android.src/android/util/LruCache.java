/*    */ package android.util;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ public class LruCache<K, V>
/*    */ {
/*    */   public LruCache(int maxSize)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public final V get(K key) { throw new RuntimeException("Stub!"); } 
/*  6 */   public final V put(K key, V value) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void trimToSize(int maxSize) { throw new RuntimeException("Stub!"); } 
/*  8 */   public final V remove(K key) { throw new RuntimeException("Stub!"); } 
/*  9 */   protected void entryRemoved(boolean evicted, K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); } 
/* 10 */   protected V create(K key) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected int sizeOf(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void evictAll() { throw new RuntimeException("Stub!"); } 
/* 13 */   public final synchronized int size() { throw new RuntimeException("Stub!"); } 
/* 14 */   public final synchronized int maxSize() { throw new RuntimeException("Stub!"); } 
/* 15 */   public final synchronized int hitCount() { throw new RuntimeException("Stub!"); } 
/* 16 */   public final synchronized int missCount() { throw new RuntimeException("Stub!"); } 
/* 17 */   public final synchronized int createCount() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final synchronized int putCount() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final synchronized int evictionCount() { throw new RuntimeException("Stub!"); } 
/* 20 */   public final synchronized Map<K, V> snapshot() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final synchronized String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.util.LruCache
 * JD-Core Version:    0.6.2
 */