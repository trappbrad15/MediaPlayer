/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.os.Handler;
/*    */ import java.util.Map;
/*    */ import java.util.Observable;
/*    */ 
/*    */ public class ContentQueryMap extends Observable
/*    */ {
/*    */   public ContentQueryMap(Cursor cursor, String columnNameOfKey, boolean keepUpdated, Handler handlerForUpdateNotifications)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void setKeepUpdated(boolean keepUpdated) { throw new RuntimeException("Stub!"); } 
/*  7 */   public synchronized ContentValues getValues(String rowName) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void requery() { throw new RuntimeException("Stub!"); } 
/*  9 */   public synchronized Map<String, ContentValues> getRows() { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized void close() { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.ContentQueryMap
 * JD-Core Version:    0.6.2
 */