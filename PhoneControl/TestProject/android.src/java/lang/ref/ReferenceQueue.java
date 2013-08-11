/*   */ package java.lang.ref;
/*   */ 
/*   */ public class ReferenceQueue<T>
/*   */ {
/*   */   public ReferenceQueue()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/* 6 */   public synchronized Reference<? extends T> poll() { throw new RuntimeException("Stub!"); } 
/* 7 */   public Reference<? extends T> remove() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 8 */   public synchronized Reference<? extends T> remove(long timeoutMillis) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.ref.ReferenceQueue
 * JD-Core Version:    0.6.2
 */