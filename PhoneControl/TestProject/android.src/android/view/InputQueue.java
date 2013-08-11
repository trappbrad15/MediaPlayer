/*    */ package android.view;
/*    */ 
/*    */ public final class InputQueue
/*    */ {
/*    */   InputQueue()
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface Callback
/*    */   {
/*    */     public abstract void onInputQueueCreated(InputQueue paramInputQueue);
/*    */ 
/*    */     public abstract void onInputQueueDestroyed(InputQueue paramInputQueue);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.InputQueue
 * JD-Core Version:    0.6.2
 */