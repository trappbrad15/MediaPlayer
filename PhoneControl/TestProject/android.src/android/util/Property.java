/*    */ package android.util;
/*    */ 
/*    */ public abstract class Property<T, V>
/*    */ {
/*    */   public Property(Class<V> type, String name)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static <T, V> Property<T, V> of(Class<T> hostType, Class<V> valueType, String name) { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void set(T object, V value) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract V get(T paramT);
/*    */ 
/*  9 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 10 */   public Class<V> getType() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.util.Property
 * JD-Core Version:    0.6.2
 */