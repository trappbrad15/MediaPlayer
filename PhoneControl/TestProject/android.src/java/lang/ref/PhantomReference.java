/*   */ package java.lang.ref;
/*   */ 
/*   */ public class PhantomReference<T> extends Reference<T>
/*   */ {
/*   */   public PhantomReference(T r, ReferenceQueue<? super T> q)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public T get() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.ref.PhantomReference
 * JD-Core Version:    0.6.2
 */