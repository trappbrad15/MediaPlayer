/*   */ package android.os;
/*   */ 
/*   */ public final class SystemClock
/*   */ {
/*   */   SystemClock()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static void sleep(long ms) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public static native boolean setCurrentTimeMillis(long paramLong);
/*   */ 
/*   */   public static native long uptimeMillis();
/*   */ 
/*   */   public static native long elapsedRealtime();
/*   */ 
/*   */   public static native long elapsedRealtimeNanos();
/*   */ 
/*   */   public static native long currentThreadTimeMillis();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.SystemClock
 * JD-Core Version:    0.6.2
 */