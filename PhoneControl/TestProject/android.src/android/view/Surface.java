/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.SurfaceTexture;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class Surface
/*    */   implements Parcelable
/*    */ {
/* 28 */   public static final Parcelable.Creator<Surface> CREATOR = null;
/*    */   public static final int ROTATION_0 = 0;
/*    */   public static final int ROTATION_90 = 1;
/*    */   public static final int ROTATION_180 = 2;
/*    */   public static final int ROTATION_270 = 3;
/*    */ 
/*    */   public Surface(SurfaceTexture surfaceTexture)
/*    */   {
/* 11 */     throw new RuntimeException("Stub!"); } 
/* 12 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } 
/* 13 */   public void release() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isValid() { throw new RuntimeException("Stub!"); } 
/* 15 */   public Canvas lockCanvas(Rect inOutDirty) throws Surface.OutOfResourcesException, IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void unlockCanvasAndPost(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 18 */   @Deprecated
/*    */   public void unlockCanvas(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 19 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); } 
/* 22 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class OutOfResourcesException extends Exception
/*    */   {
/*    */     public OutOfResourcesException()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public OutOfResourcesException(String name) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.Surface
 * JD-Core Version:    0.6.2
 */