/*   */ package android.os;
/*   */ 
/*   */ public abstract class Vibrator
/*   */ {
/*   */   Vibrator()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract boolean hasVibrator();
/*   */ 
/*   */   public abstract void vibrate(long paramLong);
/*   */ 
/*   */   public abstract void vibrate(long[] paramArrayOfLong, int paramInt);
/*   */ 
/*   */   public abstract void cancel();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.Vibrator
 * JD-Core Version:    0.6.2
 */