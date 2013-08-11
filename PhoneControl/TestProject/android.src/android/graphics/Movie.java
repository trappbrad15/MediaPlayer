/*    */ package android.graphics;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class Movie
/*    */ {
/*    */   Movie()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public native int width();
/*    */ 
/*    */   public native int height();
/*    */ 
/*    */   public native boolean isOpaque();
/*    */ 
/*    */   public native int duration();
/*    */ 
/*    */   public native boolean setTime(int paramInt);
/*    */ 
/*    */   public native void draw(Canvas paramCanvas, float paramFloat1, float paramFloat2, Paint paramPaint);
/*    */ 
/* 11 */   public void draw(Canvas canvas, float x, float y) { throw new RuntimeException("Stub!"); } 
/*    */   public static native Movie decodeStream(InputStream paramInputStream);
/*    */ 
/*    */   public static native Movie decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/*    */ 
/* 14 */   public static Movie decodeFile(String pathName) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.Movie
 * JD-Core Version:    0.6.2
 */