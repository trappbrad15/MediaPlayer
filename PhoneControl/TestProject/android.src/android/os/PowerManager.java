/*    */ package android.os;
/*    */ 
/*    */ public final class PowerManager
/*    */ {
/*    */   public static final int PARTIAL_WAKE_LOCK = 1;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int SCREEN_DIM_WAKE_LOCK = 6;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
/*    */ 
/*    */   @Deprecated
/*    */   public static final int FULL_WAKE_LOCK = 26;
/*    */   public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;
/*    */   public static final int ON_AFTER_RELEASE = 536870912;
/*    */ 
/*    */   PowerManager()
/*    */   {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 17 */   public WakeLock newWakeLock(int levelAndFlags, String tag) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void userActivity(long when, boolean noChangeLights) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void goToSleep(long time) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void wakeUp(long time) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isScreenOn() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void reboot(String reason) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public final class WakeLock
/*    */   {
/*    */     WakeLock()
/*    */     {
/*  6 */       throw new RuntimeException("Stub!"); } 
/*  7 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/*  8 */     public void setReferenceCounted(boolean value) { throw new RuntimeException("Stub!"); } 
/*  9 */     public void acquire() { throw new RuntimeException("Stub!"); } 
/* 10 */     public void acquire(long timeout) { throw new RuntimeException("Stub!"); } 
/* 11 */     public void release() { throw new RuntimeException("Stub!"); } 
/* 12 */     public boolean isHeld() { throw new RuntimeException("Stub!"); } 
/* 13 */     public void setWorkSource(WorkSource ws) { throw new RuntimeException("Stub!"); } 
/* 14 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.PowerManager
 * JD-Core Version:    0.6.2
 */