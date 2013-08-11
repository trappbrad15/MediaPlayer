/*    */ package android.app;
/*    */ 
/*    */ public class KeyguardManager
/*    */ {
/*    */   KeyguardManager()
/*    */   {
/* 15 */     throw new RuntimeException("Stub!"); } 
/* 17 */   @Deprecated
/*    */   public KeyguardLock newKeyguardLock(String tag) { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isKeyguardLocked() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isKeyguardSecure() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean inKeyguardRestrictedInputMode() { throw new RuntimeException("Stub!"); } 
/* 22 */   @Deprecated
/*    */   public void exitKeyguardSecurely(OnKeyguardExitResult callback) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface OnKeyguardExitResult
/*    */   {
/*    */     public abstract void onKeyguardExitResult(boolean paramBoolean);
/*    */   }
/*    */ 
/*    */   @Deprecated
/*    */   public class KeyguardLock
/*    */   {
/*    */     KeyguardLock()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public void disableKeyguard() { throw new RuntimeException("Stub!"); } 
/*  9 */     public void reenableKeyguard() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.app.KeyguardManager
 * JD-Core Version:    0.6.2
 */