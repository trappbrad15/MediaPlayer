/*    */ package android.text.style;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.net.Uri;
/*    */ 
/*    */ public class ImageSpan extends DynamicDrawableSpan
/*    */ {
/*    */   @Deprecated
/*    */   public ImageSpan(Bitmap b)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  8 */   @Deprecated
/*    */   public ImageSpan(Bitmap b, int verticalAlignment) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ImageSpan(Context context, Bitmap b) { throw new RuntimeException("Stub!"); } 
/* 10 */   public ImageSpan(Context context, Bitmap b, int verticalAlignment) { throw new RuntimeException("Stub!"); } 
/* 11 */   public ImageSpan(Drawable d) { throw new RuntimeException("Stub!"); } 
/* 12 */   public ImageSpan(Drawable d, int verticalAlignment) { throw new RuntimeException("Stub!"); } 
/* 13 */   public ImageSpan(Drawable d, String source) { throw new RuntimeException("Stub!"); } 
/* 14 */   public ImageSpan(Drawable d, String source, int verticalAlignment) { throw new RuntimeException("Stub!"); } 
/* 15 */   public ImageSpan(Context context, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 16 */   public ImageSpan(Context context, Uri uri, int verticalAlignment) { throw new RuntimeException("Stub!"); } 
/* 17 */   public ImageSpan(Context context, int resourceId) { throw new RuntimeException("Stub!"); } 
/* 18 */   public ImageSpan(Context context, int resourceId, int verticalAlignment) { throw new RuntimeException("Stub!"); } 
/* 19 */   public Drawable getDrawable() { throw new RuntimeException("Stub!"); } 
/* 20 */   public String getSource() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.text.style.ImageSpan
 * JD-Core Version:    0.6.2
 */