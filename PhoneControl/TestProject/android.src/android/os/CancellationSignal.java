/*    */ package android.os;
/*    */ 
/*    */ public final class CancellationSignal
/*    */ {
/*    */   public CancellationSignal()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean isCanceled() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void throwIfCanceled() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void cancel() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setOnCancelListener(OnCancelListener listener) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnCancelListener
/*    */   {
/*    */     public abstract void onCancel();
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.CancellationSignal
 * JD-Core Version:    0.6.2
 */