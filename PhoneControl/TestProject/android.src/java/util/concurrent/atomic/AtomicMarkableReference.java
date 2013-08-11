/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ public class AtomicMarkableReference<V>
/*    */ {
/*    */   public AtomicMarkableReference(V initialRef, boolean initialMark)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public V getReference() { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean isMarked() { throw new RuntimeException("Stub!"); } 
/*  7 */   public V get(boolean[] markHolder) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean weakCompareAndSet(V expectedReference, V newReference, boolean expectedMark, boolean newMark) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean compareAndSet(V expectedReference, V newReference, boolean expectedMark, boolean newMark) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void set(V newReference, boolean newMark) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean attemptMark(V expectedReference, boolean newMark) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.concurrent.atomic.AtomicMarkableReference
 * JD-Core Version:    0.6.2
 */