/*    */ package android.os;
/*    */ 
/*    */ public final class MessageQueue
/*    */ {
/*    */   MessageQueue()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public void addIdleHandler(IdleHandler handler) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void removeIdleHandler(IdleHandler handler) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static abstract interface IdleHandler
/*    */   {
/*    */     public abstract boolean queueIdle();
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.MessageQueue
 * JD-Core Version:    0.6.2
 */