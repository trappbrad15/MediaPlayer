/*   */ package org.apache.http.impl.conn.tsccm;
/*   */ 
/*   */ import java.lang.ref.ReferenceQueue;
/*   */ 
/*   */ public class RefQueueWorker
/*   */   implements Runnable
/*   */ {
/*   */   protected final ReferenceQueue<?> refQueue;
/*   */   protected final RefQueueHandler refHandler;
/*   */   protected volatile Thread workerThread;
/*   */ 
/*   */   public RefQueueWorker(ReferenceQueue<?> queue, RefQueueHandler handler)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public void run() { throw new RuntimeException("Stub!"); } 
/* 7 */   public void shutdown() { throw new RuntimeException("Stub!"); } 
/* 8 */   public String toString() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.apache.http.impl.conn.tsccm.RefQueueWorker
 * JD-Core Version:    0.6.2
 */