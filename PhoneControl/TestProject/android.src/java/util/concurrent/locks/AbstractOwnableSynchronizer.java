/*   */ package java.util.concurrent.locks;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public abstract class AbstractOwnableSynchronizer
/*   */   implements Serializable
/*   */ {
/*   */   protected AbstractOwnableSynchronizer()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected final void setExclusiveOwnerThread(Thread t) { throw new RuntimeException("Stub!"); } 
/* 7 */   protected final Thread getExclusiveOwnerThread() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.concurrent.locks.AbstractOwnableSynchronizer
 * JD-Core Version:    0.6.2
 */