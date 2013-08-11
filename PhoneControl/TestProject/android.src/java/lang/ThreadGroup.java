/*    */ package java.lang;
/*    */ 
/*    */ public class ThreadGroup
/*    */   implements Thread.UncaughtExceptionHandler
/*    */ {
/*    */   public ThreadGroup(String name)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ThreadGroup(ThreadGroup parent, String name) { throw new RuntimeException("Stub!"); } 
/*  7 */   public int activeCount() { throw new RuntimeException("Stub!"); } 
/*  8 */   public int activeGroupCount() { throw new RuntimeException("Stub!"); } 
/* 10 */   @Deprecated
/*    */   public boolean allowThreadSuspension(boolean b) { throw new RuntimeException("Stub!"); } 
/* 11 */   public final void checkAccess() { throw new RuntimeException("Stub!"); } 
/* 12 */   public final void destroy() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int enumerate(Thread[] threads) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int enumerate(Thread[] threads, boolean recurse) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int enumerate(ThreadGroup[] groups) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int enumerate(ThreadGroup[] groups, boolean recurse) { throw new RuntimeException("Stub!"); } 
/* 17 */   public final int getMaxPriority() { throw new RuntimeException("Stub!"); } 
/* 18 */   public final String getName() { throw new RuntimeException("Stub!"); } 
/* 19 */   public final ThreadGroup getParent() { throw new RuntimeException("Stub!"); } 
/* 20 */   public final void interrupt() { throw new RuntimeException("Stub!"); } 
/* 21 */   public final boolean isDaemon() { throw new RuntimeException("Stub!"); } 
/* 22 */   public synchronized boolean isDestroyed() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void list() { throw new RuntimeException("Stub!"); } 
/* 24 */   public final boolean parentOf(ThreadGroup g) { throw new RuntimeException("Stub!"); } 
/*    */   @Deprecated
/*    */   public final void resume() {
/* 27 */     throw new RuntimeException("Stub!"); } 
/* 28 */   public final void setDaemon(boolean isDaemon) { throw new RuntimeException("Stub!"); } 
/* 29 */   public final void setMaxPriority(int newMax) { throw new RuntimeException("Stub!"); } 
/*    */   @Deprecated
/*    */   public final void stop() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/* 35 */   @Deprecated
/*    */   public final void suspend() { throw new RuntimeException("Stub!"); } 
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 37 */   public void uncaughtException(Thread t, Throwable e) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.ThreadGroup
 * JD-Core Version:    0.6.2
 */