/*   */ package android.view;
/*   */ 
/*   */ import android.graphics.Canvas;
/*   */ import android.graphics.Rect;
/*   */ 
/*   */ public abstract interface SurfaceHolder
/*   */ {
/*   */ 
/*   */   @Deprecated
/*   */   public static final int SURFACE_TYPE_NORMAL = 0;
/*   */ 
/*   */   @Deprecated
/*   */   public static final int SURFACE_TYPE_HARDWARE = 1;
/*   */ 
/*   */   @Deprecated
/*   */   public static final int SURFACE_TYPE_GPU = 2;
/*   */ 
/*   */   @Deprecated
/*   */   public static final int SURFACE_TYPE_PUSH_BUFFERS = 3;
/*   */ 
/*   */   public abstract void addCallback(Callback paramCallback);
/*   */ 
/*   */   public abstract void removeCallback(Callback paramCallback);
/*   */ 
/*   */   public abstract boolean isCreating();
/*   */ 
/*   */   @Deprecated
/*   */   public abstract void setType(int paramInt);
/*   */ 
/*   */   public abstract void setFixedSize(int paramInt1, int paramInt2);
/*   */ 
/*   */   public abstract void setSizeFromLayout();
/*   */ 
/*   */   public abstract void setFormat(int paramInt);
/*   */ 
/*   */   public abstract void setKeepScreenOn(boolean paramBoolean);
/*   */ 
/*   */   public abstract Canvas lockCanvas();
/*   */ 
/*   */   public abstract Canvas lockCanvas(Rect paramRect);
/*   */ 
/*   */   public abstract void unlockCanvasAndPost(Canvas paramCanvas);
/*   */ 
/*   */   public abstract Rect getSurfaceFrame();
/*   */ 
/*   */   public abstract Surface getSurface();
/*   */ 
/*   */   public static abstract interface Callback2 extends SurfaceHolder.Callback
/*   */   {
/*   */     public abstract void surfaceRedrawNeeded(SurfaceHolder paramSurfaceHolder);
/*   */   }
/*   */ 
/*   */   public static abstract interface Callback
/*   */   {
/*   */     public abstract void surfaceCreated(SurfaceHolder paramSurfaceHolder);
/*   */ 
/*   */     public abstract void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3);
/*   */ 
/*   */     public abstract void surfaceDestroyed(SurfaceHolder paramSurfaceHolder);
/*   */   }
/*   */ 
/*   */   public static class BadSurfaceTypeException extends RuntimeException
/*   */   {
/*   */     public BadSurfaceTypeException()
/*   */     {
/* 7 */       throw new RuntimeException("Stub!"); } 
/* 8 */     public BadSurfaceTypeException(String name) { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */   }
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.view.SurfaceHolder
 * JD-Core Version:    0.6.2
 */