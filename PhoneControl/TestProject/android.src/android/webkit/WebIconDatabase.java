/*    */ package android.webkit;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ 
/*    */ @Deprecated
/*    */ public class WebIconDatabase
/*    */ {
/*    */   WebIconDatabase()
/*    */   {
/* 10 */     throw new RuntimeException("Stub!"); } 
/* 11 */   public void open(String path) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 13 */   public void removeAllIcons() { throw new RuntimeException("Stub!"); } 
/* 14 */   public void requestIconForPageUrl(String url, IconListener listener) { throw new RuntimeException("Stub!"); } 
/* 15 */   public void retainIconForPageUrl(String url) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void releaseIconForPageUrl(String url) { throw new RuntimeException("Stub!"); } 
/* 17 */   public static WebIconDatabase getInstance() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   @Deprecated
/*    */   public static abstract interface IconListener
/*    */   {
/*    */     public abstract void onReceivedIcon(String paramString, Bitmap paramBitmap);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.webkit.WebIconDatabase
 * JD-Core Version:    0.6.2
 */