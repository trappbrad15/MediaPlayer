/*    */ package android.view;
/*    */ 
/*    */ public final class Choreographer
/*    */ {
/*    */   Choreographer()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public static Choreographer getInstance() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void postFrameCallback(FrameCallback callback) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void postFrameCallbackDelayed(FrameCallback callback, long delayMillis) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void removeFrameCallback(FrameCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface FrameCallback
/*    */   {
/*    */     public abstract void doFrame(long paramLong);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.Choreographer
 * JD-Core Version:    0.6.2
 */