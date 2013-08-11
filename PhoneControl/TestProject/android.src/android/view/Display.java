/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Point;
/*    */ import android.graphics.Rect;
/*    */ import android.util.DisplayMetrics;
/*    */ 
/*    */ public final class Display
/*    */ {
/*    */   public static final int DEFAULT_DISPLAY = 0;
/*    */   public static final int FLAG_SUPPORTS_PROTECTED_BUFFERS = 1;
/*    */   public static final int FLAG_SECURE = 2;
/*    */ 
/*    */   Display()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public int getDisplayId() { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean isValid() { throw new RuntimeException("Stub!"); } 
/*  7 */   public int getFlags() { throw new RuntimeException("Stub!"); } 
/*  8 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void getSize(Point outSize) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void getRectSize(Rect outSize) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void getCurrentSizeRange(Point outSmallestSize, Point outLargestSize) { throw new RuntimeException("Stub!"); } 
/* 13 */   @Deprecated
/*    */   public int getWidth() { throw new RuntimeException("Stub!"); } 
/* 15 */   @Deprecated
/*    */   public int getHeight() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getRotation() { throw new RuntimeException("Stub!"); } 
/* 18 */   @Deprecated
/*    */   public int getOrientation() { throw new RuntimeException("Stub!"); } 
/* 20 */   @Deprecated
/*    */   public int getPixelFormat() { throw new RuntimeException("Stub!"); } 
/* 21 */   public float getRefreshRate() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void getMetrics(DisplayMetrics outMetrics) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void getRealSize(Point outSize) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void getRealMetrics(DisplayMetrics outMetrics) { throw new RuntimeException("Stub!"); } 
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.Display
 * JD-Core Version:    0.6.2
 */