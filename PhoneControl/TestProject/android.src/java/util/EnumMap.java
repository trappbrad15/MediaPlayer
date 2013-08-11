/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class EnumMap<K extends Enum<K>, V> extends AbstractMap<K, V>
/*    */   implements Serializable, Cloneable, Map<K, V>
/*    */ {
/*    */   public EnumMap(Class<K> keyType)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public EnumMap(EnumMap<K, ? extends V> map) { throw new RuntimeException("Stub!"); } 
/*    */   public EnumMap(Map<K, ? extends V> map) {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public void clear() { throw new RuntimeException("Stub!"); } 
/*    */   public EnumMap<K, V> clone() {
/* 12 */     throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); } 
/*    */   public boolean equals(Object object) {
/* 17 */     throw new RuntimeException("Stub!");
/*    */   }
/* 19 */   public V get(Object key) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); } 
/*    */   public V put(K key, V value) {
/* 22 */     throw new RuntimeException("Stub!");
/*    */   }
/* 24 */   public void putAll(Map<? extends K, ? extends V> map) { throw new RuntimeException("Stub!"); } 
/*    */   public V remove(Object key) {
/* 26 */     throw new RuntimeException("Stub!"); } 
/* 27 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 28 */   public Collection<V> values() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.EnumMap
 * JD-Core Version:    0.6.2
 */