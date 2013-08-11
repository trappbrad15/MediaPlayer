/*    */ package android.graphics;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.DisplayMetrics;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.Buffer;
/*    */ 
/*    */ public final class Bitmap
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int DENSITY_NONE = 0;
/* 69 */   public static final Parcelable.Creator<Bitmap> CREATOR = null;
/*    */ 
/*    */   Bitmap()
/*    */   {
/* 18 */     throw new RuntimeException("Stub!"); } 
/* 19 */   public int getDensity() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setDensity(int density) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void recycle() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final boolean isRecycled() { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getGenerationId() { throw new RuntimeException("Stub!"); } 
/* 24 */   public void copyPixelsToBuffer(Buffer dst) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void copyPixelsFromBuffer(Buffer src) { throw new RuntimeException("Stub!"); } 
/* 26 */   public Bitmap copy(Config config, boolean isMutable) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static Bitmap createScaledBitmap(Bitmap src, int dstWidth, int dstHeight, boolean filter) { throw new RuntimeException("Stub!"); } 
/* 28 */   public static Bitmap createBitmap(Bitmap src) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static Bitmap createBitmap(Bitmap source, int x, int y, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static Bitmap createBitmap(Bitmap source, int x, int y, int width, int height, Matrix m, boolean filter) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static Bitmap createBitmap(int width, int height, Config config) { throw new RuntimeException("Stub!"); } 
/* 32 */   public static Bitmap createBitmap(DisplayMetrics display, int width, int height, Config config) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static Bitmap createBitmap(int[] colors, int offset, int stride, int width, int height, Config config) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static Bitmap createBitmap(DisplayMetrics display, int[] colors, int offset, int stride, int width, int height, Config config) { throw new RuntimeException("Stub!"); } 
/* 35 */   public static Bitmap createBitmap(int[] colors, int width, int height, Config config) { throw new RuntimeException("Stub!"); } 
/* 36 */   public static Bitmap createBitmap(DisplayMetrics display, int[] colors, int width, int height, Config config) { throw new RuntimeException("Stub!"); } 
/* 37 */   public byte[] getNinePatchChunk() { throw new RuntimeException("Stub!"); } 
/* 38 */   public boolean compress(CompressFormat format, int quality, OutputStream stream) { throw new RuntimeException("Stub!"); } 
/* 39 */   public final boolean isMutable() { throw new RuntimeException("Stub!"); } 
/* 40 */   public final boolean isPremultiplied() { throw new RuntimeException("Stub!"); } 
/* 41 */   public final int getWidth() { throw new RuntimeException("Stub!"); } 
/* 42 */   public final int getHeight() { throw new RuntimeException("Stub!"); } 
/* 43 */   public int getScaledWidth(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 44 */   public int getScaledHeight(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 45 */   public int getScaledWidth(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); } 
/* 46 */   public int getScaledHeight(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); } 
/* 47 */   public int getScaledWidth(int targetDensity) { throw new RuntimeException("Stub!"); } 
/* 48 */   public int getScaledHeight(int targetDensity) { throw new RuntimeException("Stub!"); } 
/* 49 */   public final int getRowBytes() { throw new RuntimeException("Stub!"); } 
/* 50 */   public final int getByteCount() { throw new RuntimeException("Stub!"); } 
/* 51 */   public final Config getConfig() { throw new RuntimeException("Stub!"); } 
/* 52 */   public final boolean hasAlpha() { throw new RuntimeException("Stub!"); } 
/* 53 */   public void setHasAlpha(boolean hasAlpha) { throw new RuntimeException("Stub!"); } 
/* 54 */   public final boolean hasMipMap() { throw new RuntimeException("Stub!"); } 
/* 55 */   public final void setHasMipMap(boolean hasMipMap) { throw new RuntimeException("Stub!"); } 
/* 56 */   public void eraseColor(int c) { throw new RuntimeException("Stub!"); } 
/* 57 */   public int getPixel(int x, int y) { throw new RuntimeException("Stub!"); } 
/* 58 */   public void getPixels(int[] pixels, int offset, int stride, int x, int y, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 59 */   public void setPixel(int x, int y, int color) { throw new RuntimeException("Stub!"); } 
/* 60 */   public void setPixels(int[] pixels, int offset, int stride, int x, int y, int width, int height) { throw new RuntimeException("Stub!"); } 
/* 61 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 62 */   public void writeToParcel(Parcel p, int flags) { throw new RuntimeException("Stub!"); } 
/* 63 */   public Bitmap extractAlpha() { throw new RuntimeException("Stub!"); } 
/* 64 */   public Bitmap extractAlpha(Paint paint, int[] offsetXY) { throw new RuntimeException("Stub!"); } 
/* 65 */   public boolean sameAs(Bitmap other) { throw new RuntimeException("Stub!"); } 
/* 66 */   public void prepareToDraw() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static enum CompressFormat
/*    */   {
/* 14 */     JPEG, 
/* 15 */     PNG, 
/* 16 */     WEBP;
/*    */   }
/*    */ 
/*    */   public static enum Config
/*    */   {
/*  7 */     ALPHA_8, 
/*  8 */     ARGB_4444, 
/*  9 */     ARGB_8888, 
/* 10 */     RGB_565;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.Bitmap
 * JD-Core Version:    0.6.2
 */