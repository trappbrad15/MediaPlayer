/*    */ package android.animation;
/*    */ 
/*    */ public class TimeAnimator extends ValueAnimator
/*    */ {
/*    */   public TimeAnimator()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public void start() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setTimeListener(TimeListener listener) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface TimeListener
/*    */   {
/*    */     public abstract void onTimeUpdate(TimeAnimator paramTimeAnimator, long paramLong1, long paramLong2);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.animation.TimeAnimator
 * JD-Core Version:    0.6.2
 */