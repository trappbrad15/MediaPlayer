/*   */ package android.os;
/*   */ 
/*   */ public abstract class CountDownTimer
/*   */ {
/*   */   public CountDownTimer(long millisInFuture, long countDownInterval)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public final void cancel() { throw new RuntimeException("Stub!"); } 
/* 6 */   public final synchronized CountDownTimer start() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract void onTick(long paramLong);
/*   */ 
/*   */   public abstract void onFinish();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.CountDownTimer
 * JD-Core Version:    0.6.2
 */