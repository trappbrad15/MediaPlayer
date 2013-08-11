/*   */ package android.opengl;
/*   */ 
/*   */ public class Visibility
/*   */ {
/*   */   public Visibility()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public static native int visibilityTest(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, char[] paramArrayOfChar, int paramInt3, int paramInt4);
/*   */ 
/*   */   public static native int frustumCullSpheres(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, int paramInt5);
/*   */ 
/*   */   public static native void computeBoundingSphere(float[] paramArrayOfFloat1, int paramInt1, int paramInt2, float[] paramArrayOfFloat2, int paramInt3);
/*   */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.opengl.Visibility
 * JD-Core Version:    0.6.2
 */