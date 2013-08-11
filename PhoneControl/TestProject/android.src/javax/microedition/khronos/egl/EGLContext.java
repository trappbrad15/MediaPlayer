/*   */ package javax.microedition.khronos.egl;
/*   */ 
/*   */ import javax.microedition.khronos.opengles.GL;
/*   */ 
/*   */ public abstract class EGLContext
/*   */ {
/*   */   public EGLContext()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static EGL getEGL() { throw new RuntimeException("Stub!"); }
/*   */ 
/*   */ 
/*   */   public abstract GL getGL();
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.microedition.khronos.egl.EGLContext
 * JD-Core Version:    0.6.2
 */