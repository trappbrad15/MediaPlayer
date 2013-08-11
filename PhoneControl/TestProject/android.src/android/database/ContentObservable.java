/*    */ package android.database;
/*    */ 
/*    */ import android.net.Uri;
/*    */ 
/*    */ public class ContentObservable extends Observable<ContentObserver>
/*    */ {
/*    */   public ContentObservable()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void registerObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); } 
/*  8 */   @Deprecated
/*    */   public void dispatchChange(boolean selfChange) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void dispatchChange(boolean selfChange, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 11 */   @Deprecated
/*    */   public void notifyChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.ContentObservable
 * JD-Core Version:    0.6.2
 */