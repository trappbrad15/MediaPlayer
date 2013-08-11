/*    */ package android.os;
/*    */ 
/*    */ public class RemoteCallbackList<E extends IInterface>
/*    */ {
/*    */   public RemoteCallbackList()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public boolean register(E callback) { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean register(E callback, Object cookie) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean unregister(E callback) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void kill() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onCallbackDied(E callback) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onCallbackDied(E callback, Object cookie) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int beginBroadcast() { throw new RuntimeException("Stub!"); } 
/* 12 */   public E getBroadcastItem(int index) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Object getBroadcastCookie(int index) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void finishBroadcast() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getRegisteredCallbackCount() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.os.RemoteCallbackList
 * JD-Core Version:    0.6.2
 */