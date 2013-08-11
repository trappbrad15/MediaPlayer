/*    */ package android.graphics;
/*    */ 
/*    */ public class SurfaceTexture
/*    */ {
/*    */   public SurfaceTexture(int texName)
/*    */   {
/* 14 */     throw new RuntimeException("Stub!"); } 
/* 15 */   public void setOnFrameAvailableListener(OnFrameAvailableListener l) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setDefaultBufferSize(int width, int height) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void updateTexImage() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void detachFromGLContext() { throw new RuntimeException("Stub!"); } 
/* 19 */   public void attachToGLContext(int texName) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void getTransformMatrix(float[] mtx) { throw new RuntimeException("Stub!"); } 
/* 21 */   public long getTimestamp() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void release() { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class OutOfResourcesException extends Exception
/*    */   {
/*    */     public OutOfResourcesException()
/*    */     {
/* 11 */       throw new RuntimeException("Stub!"); } 
/* 12 */     public OutOfResourcesException(String name) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static abstract interface OnFrameAvailableListener
/*    */   {
/*    */     public abstract void onFrameAvailable(SurfaceTexture paramSurfaceTexture);
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.graphics.SurfaceTexture
 * JD-Core Version:    0.6.2
 */