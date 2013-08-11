/*    */ package android.view.animation;
/*    */ 
/*    */ import android.graphics.Matrix;
/*    */ 
/*    */ public class Transformation
/*    */ {
/*    */   public static int TYPE_IDENTITY;
/*    */   public static int TYPE_ALPHA;
/*    */   public static int TYPE_MATRIX;
/*    */   public static int TYPE_BOTH;
/*    */   protected Matrix mMatrix;
/*    */   protected float mAlpha;
/*    */   protected int mTransformationType;
/*    */ 
/*    */   public Transformation()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public void clear() { throw new RuntimeException("Stub!"); } 
/*  6 */   public int getTransformationType() { throw new RuntimeException("Stub!"); } 
/*  7 */   public void setTransformationType(int transformationType) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void set(Transformation t) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void compose(Transformation t) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Matrix getMatrix() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void setAlpha(float alpha) { throw new RuntimeException("Stub!"); } 
/* 12 */   public float getAlpha() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String toShortString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.animation.Transformation
 * JD-Core Version:    0.6.2
 */