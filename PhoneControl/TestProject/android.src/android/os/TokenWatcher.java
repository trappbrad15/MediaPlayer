/*    */ package android.os;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public abstract class TokenWatcher
/*    */ {
/*    */   public TokenWatcher(Handler h, String tag)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void acquired();
/*    */ 
/*    */   public abstract void released();
/*    */ 
/*  7 */   public void acquire(IBinder token, String tag) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void cleanup(IBinder token, boolean unlink) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void release(IBinder token) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isAcquired() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void dump() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void dump(PrintWriter pw) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.TokenWatcher
 * JD-Core Version:    0.6.2
 */