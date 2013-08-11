/*    */ package android.graphics;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class Picture
/*    */ {
/*    */   public Picture()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public Picture(Picture src) { throw new RuntimeException("Stub!"); } 
/*  6 */   public Canvas beginRecording(int width, int height) { throw new RuntimeException("Stub!"); } 
/*  7 */   public void endRecording() { throw new RuntimeException("Stub!"); } 
/*    */   public native int getWidth();
/*    */ 
/*    */   public native int getHeight();
/*    */ 
/* 10 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 12 */   @Deprecated
/*    */   public static Picture createFromStream(InputStream stream) { throw new RuntimeException("Stub!"); } 
/* 14 */   @Deprecated
/*    */   public void writeToStream(OutputStream stream) { throw new RuntimeException("Stub!"); } 
/* 15 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.Picture
 * JD-Core Version:    0.6.2
 */