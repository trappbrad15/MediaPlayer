/*    */ package android.renderscript;
/*    */ 
/*    */ public class Sampler extends BaseObj
/*    */ {
/*    */   Sampler()
/*    */   {
/* 25 */     throw new RuntimeException("Stub!"); } 
/* 26 */   public Value getMinification() { throw new RuntimeException("Stub!"); } 
/* 27 */   public Value getMagnification() { throw new RuntimeException("Stub!"); } 
/* 28 */   public Value getWrapS() { throw new RuntimeException("Stub!"); } 
/* 29 */   public Value getWrapT() { throw new RuntimeException("Stub!"); } 
/* 30 */   public float getAnisotropy() { throw new RuntimeException("Stub!"); } 
/* 31 */   public static Sampler CLAMP_NEAREST(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 32 */   public static Sampler CLAMP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static Sampler CLAMP_LINEAR_MIP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static Sampler WRAP_NEAREST(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 35 */   public static Sampler WRAP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 36 */   public static Sampler WRAP_LINEAR_MIP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 37 */   public static Sampler MIRRORED_REPEAT_NEAREST(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 38 */   public static Sampler MIRRORED_REPEAT_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static Sampler MIRRORED_REPEAT_LINEAR_MIP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */ 
/*    */   public static class Builder
/*    */   {
/*    */     public Builder(RenderScript rs)
/*    */     {
/* 17 */       throw new RuntimeException("Stub!"); } 
/* 18 */     public void setMinification(Sampler.Value v) { throw new RuntimeException("Stub!"); } 
/* 19 */     public void setMagnification(Sampler.Value v) { throw new RuntimeException("Stub!"); } 
/* 20 */     public void setWrapS(Sampler.Value v) { throw new RuntimeException("Stub!"); } 
/* 21 */     public void setWrapT(Sampler.Value v) { throw new RuntimeException("Stub!"); } 
/* 22 */     public void setAnisotropy(float v) { throw new RuntimeException("Stub!"); } 
/* 23 */     public Sampler create() { throw new RuntimeException("Stub!"); }
/*    */ 
/*    */   }
/*    */ 
/*    */   public static enum Value
/*    */   {
/*  7 */     CLAMP, 
/*  8 */     LINEAR, 
/*  9 */     LINEAR_MIP_LINEAR, 
/* 10 */     LINEAR_MIP_NEAREST, 
/* 11 */     MIRRORED_REPEAT, 
/* 12 */     NEAREST, 
/* 13 */     WRAP;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.renderscript.Sampler
 * JD-Core Version:    0.6.2
 */