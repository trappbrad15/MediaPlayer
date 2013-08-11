/*   */ package java.util;
/*   */ 
/*   */ public abstract class TimerTask
/*   */   implements Runnable
/*   */ {
/*   */   protected TimerTask()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public boolean cancel() { throw new RuntimeException("Stub!"); } 
/* 7 */   public long scheduledExecutionTime() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract void run();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.TimerTask
 * JD-Core Version:    0.6.2
 */