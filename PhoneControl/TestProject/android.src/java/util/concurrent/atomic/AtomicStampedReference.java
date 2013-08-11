/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ public class AtomicStampedReference<V>
/*    */ {
/*    */   public AtomicStampedReference(V initialRef, int initialStamp)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public V getReference() { throw new RuntimeException("Stub!"); } 
/*  6 */   public int getStamp() { throw new RuntimeException("Stub!"); } 
/*  7 */   public V get(int[] stampHolder) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean weakCompareAndSet(V expectedReference, V newReference, int expectedStamp, int newStamp) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean compareAndSet(V expectedReference, V newReference, int expectedStamp, int newStamp) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void set(V newReference, int newStamp) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean attemptStamp(V expectedReference, int newStamp) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.concurrent.atomic.AtomicStampedReference
 * JD-Core Version:    0.6.2
 */