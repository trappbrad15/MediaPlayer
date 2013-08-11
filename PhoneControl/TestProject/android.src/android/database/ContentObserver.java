/*    */ package android.database;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import android.os.Handler;
/*    */ 
/*    */ public abstract class ContentObserver
/*    */ {
/*    */   public ContentObserver(Handler handler)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); } 
/*  6 */   public void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void onChange(boolean selfChange, Uri uri) { throw new RuntimeException("Stub!"); } 
/*  9 */   @Deprecated
/*    */   public final void dispatchChange(boolean selfChange) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void dispatchChange(boolean selfChange, Uri uri) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.ContentObserver
 * JD-Core Version:    0.6.2
 */