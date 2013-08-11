/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.Shader.TileMode;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.DisplayMetrics;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class BitmapDrawable extends Drawable
/*    */ {
/*    */   @Deprecated
/*    */   public BitmapDrawable()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!");
/*    */   }
/*  9 */   @Deprecated
/*    */   public BitmapDrawable(Resources res) { throw new RuntimeException("Stub!"); } 
/* 11 */   @Deprecated
/*    */   public BitmapDrawable(Bitmap bitmap) { throw new RuntimeException("Stub!"); } 
/* 12 */   public BitmapDrawable(Resources res, Bitmap bitmap) { throw new RuntimeException("Stub!"); } 
/* 14 */   @Deprecated
/*    */   public BitmapDrawable(String filepath) { throw new RuntimeException("Stub!"); } 
/*    */   public BitmapDrawable(Resources res, String filepath) {
/* 16 */     throw new RuntimeException("Stub!"); } 
/* 18 */   @Deprecated
/*    */   public BitmapDrawable(InputStream is) { throw new RuntimeException("Stub!"); } 
/*    */   public BitmapDrawable(Resources res, InputStream is) {
/* 20 */     throw new RuntimeException("Stub!"); } 
/* 21 */   public final Paint getPaint() { throw new RuntimeException("Stub!"); } 
/* 22 */   public final Bitmap getBitmap() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setTargetDensity(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setTargetDensity(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setTargetDensity(int density) { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getGravity() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); } 
/* 28 */   public void setMipMap(boolean mipMap) { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean hasMipMap() { throw new RuntimeException("Stub!"); } 
/* 30 */   public void setAntiAlias(boolean aa) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean hasAntiAlias() { throw new RuntimeException("Stub!"); } 
/* 32 */   public void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); } 
/* 34 */   public Shader.TileMode getTileModeX() { throw new RuntimeException("Stub!"); } 
/* 35 */   public Shader.TileMode getTileModeY() { throw new RuntimeException("Stub!"); } 
/* 36 */   public void setTileModeX(Shader.TileMode mode) { throw new RuntimeException("Stub!"); } 
/* 37 */   public final void setTileModeY(Shader.TileMode mode) { throw new RuntimeException("Stub!"); } 
/* 38 */   public void setTileModeXY(Shader.TileMode xmode, Shader.TileMode ymode) { throw new RuntimeException("Stub!"); } 
/* 39 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); } 
/* 40 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 41 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 42 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 43 */   public void setColorFilter(ColorFilter cf) { throw new RuntimeException("Stub!"); } 
/* 44 */   public Drawable mutate() { throw new RuntimeException("Stub!"); } 
/* 45 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 46 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); } 
/* 47 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); } 
/* 48 */   public int getOpacity() { throw new RuntimeException("Stub!"); } 
/* 49 */   public final Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.drawable.BitmapDrawable
 * JD-Core Version:    0.6.2
 */