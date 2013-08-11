/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class AtomicReferenceArray<E>
/*    */   implements Serializable
/*    */ {
/*    */   public AtomicReferenceArray(int length)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public AtomicReferenceArray(E[] array) { throw new RuntimeException("Stub!"); } 
/*  7 */   public final int length() { throw new RuntimeException("Stub!"); } 
/*  8 */   public final E get(int i) { throw new RuntimeException("Stub!"); } 
/*  9 */   public final void set(int i, E newValue) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void lazySet(int i, E newValue) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final E getAndSet(int i, E newValue) { throw new RuntimeException("Stub!"); } 
/* 12 */   public final boolean compareAndSet(int i, E expect, E update) { throw new RuntimeException("Stub!"); } 
/* 13 */   public final boolean weakCompareAndSet(int i, E expect, E update) { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.concurrent.atomic.AtomicReferenceArray
 * JD-Core Version:    0.6.2
 */