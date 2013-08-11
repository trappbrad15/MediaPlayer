/*   */ package android.opengl;
/*   */ 
/*   */ public class EGLExt
/*   */ {
/*   */   public static final int EGL_CONTEXT_MAJOR_VERSION_KHR = 12440;
/*   */   public static final int EGL_CONTEXT_MINOR_VERSION_KHR = 12539;
/*   */   public static final int EGL_CONTEXT_FLAGS_KHR = 12540;
/*   */   public static final int EGL_OPENGL_ES3_BIT_KHR = 64;
/*   */ 
/*   */   public EGLExt()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public static native boolean eglPresentationTimeANDROID(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface, long paramLong);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.opengl.EGLExt
 * JD-Core Version:    0.6.2
 */