/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.NinePatch;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.Region;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.DisplayMetrics;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class NinePatchDrawable extends Drawable
/*    */ {
/*    */   @Deprecated
/*    */   public NinePatchDrawable(Bitmap bitmap, byte[] chunk, Rect padding, String srcName)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public NinePatchDrawable(Resources res, Bitmap bitmap, byte[] chunk, Rect padding, String srcName) { throw new RuntimeException("Stub!"); } 
/*  9 */   @Deprecated
/*    */   public NinePatchDrawable(NinePatch patch) { throw new RuntimeException("Stub!"); } 
/* 10 */   public NinePatchDrawable(Resources res, NinePatch patch) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setTargetDensity(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void setTargetDensity(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void setTargetDensity(int density) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setColorFilter(ColorFilter cf) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/* 22 */   public Paint getPaint() { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getMinimumWidth() { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getMinimumHeight() { throw new RuntimeException("Stub!"); } 
/* 27 */   public int getOpacity() { throw new RuntimeException("Stub!"); } 
/* 28 */   public Region getTransparentRegion() { throw new RuntimeException("Stub!"); } 
/* 29 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); } 
/* 30 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.drawable.NinePatchDrawable
 * JD-Core Version:    0.6.2
 */