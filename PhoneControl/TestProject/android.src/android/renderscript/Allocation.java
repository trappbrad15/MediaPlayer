/*    */ package android.renderscript;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.graphics.Bitmap;
/*    */ import android.view.Surface;
/*    */ 
/*    */ public class Allocation extends BaseObj
/*    */ {
/*    */   public static final int USAGE_SCRIPT = 1;
/*    */   public static final int USAGE_GRAPHICS_TEXTURE = 2;
/*    */   public static final int USAGE_GRAPHICS_VERTEX = 4;
/*    */   public static final int USAGE_GRAPHICS_CONSTANTS = 8;
/*    */   public static final int USAGE_GRAPHICS_RENDER_TARGET = 16;
/*    */   public static final int USAGE_IO_INPUT = 32;
/*    */   public static final int USAGE_IO_OUTPUT = 64;
/*    */   public static final int USAGE_SHARED = 128;
/*    */ 
/*    */   Allocation()
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   public Element getElement() { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getUsage() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getBytesSize() { throw new RuntimeException("Stub!"); } 
/* 15 */   public Type getType() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void syncAll(int srcLocation) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void ioSend() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void ioReceive() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void copyFrom(BaseObj[] d) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void copyFromUnchecked(int[] d) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void copyFromUnchecked(short[] d) { throw new RuntimeException("Stub!"); } 
/* 22 */   public void copyFromUnchecked(byte[] d) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void copyFromUnchecked(float[] d) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void copyFrom(int[] d) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void copyFrom(short[] d) { throw new RuntimeException("Stub!"); } 
/* 26 */   public void copyFrom(byte[] d) { throw new RuntimeException("Stub!"); } 
/* 27 */   public void copyFrom(float[] d) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void copyFrom(Bitmap b) { throw new RuntimeException("Stub!"); } 
/* 29 */   public void copyFrom(Allocation a) { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setFromFieldPacker(int xoff, FieldPacker fp) { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setFromFieldPacker(int xoff, int component_number, FieldPacker fp) { throw new RuntimeException("Stub!"); } 
/* 32 */   public void generateMipmaps() { throw new RuntimeException("Stub!"); } 
/* 33 */   public void copy1DRangeFromUnchecked(int off, int count, int[] d) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void copy1DRangeFromUnchecked(int off, int count, short[] d) { throw new RuntimeException("Stub!"); } 
/* 35 */   public void copy1DRangeFromUnchecked(int off, int count, byte[] d) { throw new RuntimeException("Stub!"); } 
/* 36 */   public void copy1DRangeFromUnchecked(int off, int count, float[] d) { throw new RuntimeException("Stub!"); } 
/* 37 */   public void copy1DRangeFrom(int off, int count, int[] d) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void copy1DRangeFrom(int off, int count, short[] d) { throw new RuntimeException("Stub!"); } 
/* 39 */   public void copy1DRangeFrom(int off, int count, byte[] d) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void copy1DRangeFrom(int off, int count, float[] d) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void copy1DRangeFrom(int off, int count, Allocation data, int dataOff) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, byte[] data) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, short[] data) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, int[] data) { throw new RuntimeException("Stub!"); } 
/* 45 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, float[] data) { throw new RuntimeException("Stub!"); } 
/* 46 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, Allocation data, int dataXoff, int dataYoff) { throw new RuntimeException("Stub!"); } 
/* 47 */   public void copy2DRangeFrom(int xoff, int yoff, Bitmap data) { throw new RuntimeException("Stub!"); } 
/* 48 */   public void copyTo(Bitmap b) { throw new RuntimeException("Stub!"); } 
/* 49 */   public void copyTo(byte[] d) { throw new RuntimeException("Stub!"); } 
/* 50 */   public void copyTo(short[] d) { throw new RuntimeException("Stub!"); } 
/* 51 */   public void copyTo(int[] d) { throw new RuntimeException("Stub!"); } 
/* 52 */   public void copyTo(float[] d) { throw new RuntimeException("Stub!"); } 
/* 54 */   @Deprecated
/*    */   public synchronized void resize(int dimX) { throw new RuntimeException("Stub!"); } 
/* 55 */   public static Allocation createTyped(RenderScript rs, Type type, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); } 
/* 56 */   public static Allocation createTyped(RenderScript rs, Type type, int usage) { throw new RuntimeException("Stub!"); } 
/* 57 */   public static Allocation createTyped(RenderScript rs, Type type) { throw new RuntimeException("Stub!"); } 
/* 58 */   public static Allocation createSized(RenderScript rs, Element e, int count, int usage) { throw new RuntimeException("Stub!"); } 
/* 59 */   public static Allocation createSized(RenderScript rs, Element e, int count) { throw new RuntimeException("Stub!"); } 
/* 60 */   public static Allocation createFromBitmap(RenderScript rs, Bitmap b, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); } 
/* 61 */   public Surface getSurface() { throw new RuntimeException("Stub!"); } 
/* 62 */   public void setSurface(Surface sur) { throw new RuntimeException("Stub!"); } 
/* 63 */   public static Allocation createFromBitmap(RenderScript rs, Bitmap b) { throw new RuntimeException("Stub!"); } 
/* 64 */   public static Allocation createCubemapFromBitmap(RenderScript rs, Bitmap b, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); } 
/* 65 */   public static Allocation createCubemapFromBitmap(RenderScript rs, Bitmap b) { throw new RuntimeException("Stub!"); } 
/* 66 */   public static Allocation createCubemapFromCubeFaces(RenderScript rs, Bitmap xpos, Bitmap xneg, Bitmap ypos, Bitmap yneg, Bitmap zpos, Bitmap zneg, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); } 
/* 67 */   public static Allocation createCubemapFromCubeFaces(RenderScript rs, Bitmap xpos, Bitmap xneg, Bitmap ypos, Bitmap yneg, Bitmap zpos, Bitmap zneg) { throw new RuntimeException("Stub!"); } 
/* 68 */   public static Allocation createFromBitmapResource(RenderScript rs, Resources res, int id, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); } 
/* 69 */   public static Allocation createFromBitmapResource(RenderScript rs, Resources res, int id) { throw new RuntimeException("Stub!"); } 
/* 70 */   public static Allocation createFromString(RenderScript rs, String str, int usage) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static enum MipmapControl
/*    */   {
/*  7 */     MIPMAP_FULL, 
/*  8 */     MIPMAP_NONE, 
/*  9 */     MIPMAP_ON_SYNC_TO_TEXTURE;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.renderscript.Allocation
 * JD-Core Version:    0.6.2
 */